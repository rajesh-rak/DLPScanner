#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.kumar@iiitb.org) IIIT-B MS2013007
#
# This script will run all the necessary programs and scripts to detect a
# deadlock. Here are the things that will be done by this script:
#
# 1. Scan the predictions made by stalemate tool. The stalemate tool itself is
#    not run as part of this script, but the prediction files in the 'cycles'
#    folder  will be scanned and  set of classes will be shortlisted to examine
#    for deadlocks, based on the criteria specified in the dlpscanner.properties
#    IMPORTANT: make sure the dlpscanner.properties is set correctly before
#    runnning this script.
#
# 2. The shortlisted classes list will be created in a separate folders
#    and under a execution folder. This execution folder will be fed to the
#    Randoop generator so that test cases will be generated for each of the
#    shortlisted classes by Randoop
#
# 3. The generated test cases will be then fed into the Omen+ tool, which will
#    analyze these test cases for  creation of deadlocking scenarios and if such
#    a scenario is detected, a deadlocking test case will be generated. All the
#    outcome of the Omen+ tool will be kept under the 'output' folder under the
#    execution folder
#
# 4. The output folder will be examined for any detected deadlocks and a
#    summary output will be generated
#
# The above tasks are all achieved by multiple programs and multiple scripts,
# and this script brings them all together so that this automation is
# comprehensively achieved and very large set of classes and libraries can be
# examined for deadlocks.
# This set of tools and automation provides a definitive way of detecting
# deadlocks in large libraries which is otherwise not possible with the existing
# methods and tools available in the industry and in the research community
# 
#
# -------------------------------------------
# Some things to take care:
# - Make sure the dlpscanner.properties is in the same folder as that of the
#   script, all behavior of this script it controlled by dlpscanner.properties
#
# --------------------------------------------
#
# Usage ./runDLP.sh [-dryrun], if -dryrun parameter is specified, no actual
#				execution will be done
#
DRY_RUN="OFF"
inputFile="scanresultfolder.out"
echo "DLP initiated..."
execFolder="NOT SPECIFIED"
pDir="NOT SPECIFIED"
execLogFile="exec_log.txt"
summaryOutFile="DLP_Execution_Report.csv"
testFolder="dlp_test_folder.txt"

for var in "$@"
do
	inparam=${var%${delim}*}
	invalue=${var#*${delim}}

	if [ "$inparam" == "-dryrun" ]
	then
		DRY_RUN="ON"
	else
   		echo "Unrecognized Parameter: $inparam"
   		echo "Program Terminated"
   		exit 0
	fi

done


if [ $DRY_RUN == "ON" ];then
	echo "DRY RUN IS ON...no execution will be done"
fi
if [ ! $DRY_RUN == "ON" ];then
	echo "DRY RUN IS OFF...DLP will execute "
fi


if [ ! $DRY_RUN == "ON" ];then
	./runscanner.sh
fi

IFS=$'\n'
for outFolder in $(cat "./$inputFile")
do
	execFolder=$outFolder
done
echo "Processing Folder:...$execFolder"

for dirName in $execFolder/*
do
	echo "."
	echo "."
	echo "."

	if [ -d ${dirName} ]
	then
		pDir=${dirName##*/}
		echo $pDir > $testFolder
		echo "--Generating Randoop Test cases for: $pDir--"
		if [ ! $DRY_RUN == "ON" ];then
			./genrandoop.sh -dir=$pDir -execfolder=$execFolder
		else
			./genrandoop.sh -dir=$pDir -execfolder=$execFolder -dryrun
		fi
		echo
		echo
		echo "--Tests Generated...executing Omen+--"
		if [ ! $DRY_RUN == "ON" ];then
			./runomen.sh -c -testdir=$pDir -execfolder=$execFolder
		else
			./runomen.sh -c -testdir=$pDir -execfolder=$execFolder -dryrun
		fi

	fi
done
rm -f $testFolder
if [ $DRY_RUN == "ON" ];then
	echo "DLP Execution Completed! (Dry Run)"
	exit 0
fi

#Summarize Result:
tresultfile="tmpresult.txt"
ttestfile="tmptest.txt"
resultfile="DLP_Result.txt"
hunglist="hunglist.txt"
testhunglist="testhunglist.txt"
analysis_file="Analysis"
hung_file="AnalysisData_w.txt"
testhung_file="TestGenHung.txt"
outdir=$execFolder/output
echo Output Dir: $outdir
if [ ! -d "$outdir" ]
then
	echo "Nothing to process...terminating"
	echo ""
	exit 0
fi

cd $execFolder/output
find . -name $analysis_file* > $tresultfile
find . -name $hung_file > $hunglist
find . -name $testhung_file > $testhunglist

ls -d Test* | grep -v _x > $ttestfile
testcount=0
positives=0
hungcount=0
testhungcount=0

while read line
do
	((testcount++))
done < $ttestfile
while read line
do
	((positives++))
done < $tresultfile
while read line
do
	((hungcount++))
done < $hunglist
while read line
do
	((testhungcount++))
done < $testhunglist
echo -e "DLP Execution Summary" >> $resultfile
echo -e "---------------------" >> $resultfile
echo -e "Total Test(s) executed\t\t: $testcount"
echo -e "Total Test(s) executed\t\t: $testcount" >> $resultfile

echo -e "Total Dead-Lock(s) detected\t: $positives"
echo -e "Total Dead-Lock(s) detected\t: $positives" >> $resultfile
echo -e "_________________________________________" >> $resultfile
if [ $positives -gt 0 ]
then
    echo -e "Dead Lock - Positives:" >> $resultfile
    echo -e "----------------------" >> $resultfile
    while read line
    do
    	tline=${line#*/}
    	xline=${tline%/*}
    	echo $xline >> $resultfile
    done < $tresultfile
    if [ $hungcount -gt 0 ]
    then
        echo -e "----------------------" >> $resultfile
        echo -e "Hung Programs:" >> $resultfile
        echo -e "----------------------" >> $resultfile
        while read line
        do
        	htline=${line#*/}
        	hxline=${htline%/*}
        	echo $hxline >> $resultfile
        done < $hunglist
    fi
    if [ $testhungcount -gt 0 ]
    then
        echo -e "----------------------" >> $resultfile
        echo -e "Hung Test Generations:" >> $resultfile
        echo -e "----------------------" >> $resultfile
        while read line
        do
        	ttline=${line#*/}
        	txline=${ttline%/*}
        	echo $txline >> $resultfile
        done < $testhunglist
    fi
fi

rm -f $tresultfile
rm -f $hunglist
rm -f $testhunglist
rm -f $ttestfile
mv $resultfile ../

#Summary Report
outFolder=${execFolder%/*}
runID=${execFolder##*/}
if [ ! -f "$outFolder/$summaryOutFile" ]
then
	echo "No Summary File"
	echo -e "RunID,Tests,Dead_Locks,Progs_Hung,TestGen_Hung,NH_Depth,NH_Density,Nodes_Parsed,Nodes_Shortlisted,Duplicates,Skipped,Time_Stamp,Scan_Files" > $outFolder/$summaryOutFile
fi
nhDepth=""
nhDensity=""
nodesParsed=""
nodesShortlisted=""
dupNodes=""
nodesSkipped=0
filenames=""
timeStamp=$(date +%Y.%m.%d-%H.%M.%S)

shopt -s extglob

while read rLine
do
	if [[ "$rLine" =~ "Neighbourhood Depth" ]]
	then
		nhDepth=${rLine##*:}
		echo "NH: depth:$nhDepth"

	elif [[ "$rLine" =~ "Neighbourhood Density" ]]
	then
		nhDensity=${rLine##*:}
		echo "NH: density:$nhDensity"

	elif [[ "$rLine" =~ "Total Nodes Processed" ]]
	then
		nodesParsed=${rLine##*:}
		nodesParsed=$nodesParsed
	elif [[ "$rLine" =~ "Total Nodes Selected" ]]
	then
		nodesShortlisted=${rLine##*:}
	    nodesShortlisted=$nodesShortlisted
	elif [[ "$rLine" =~ "File" ]]
	then
		filenames+=${rLine##*:}
		filenames+=";"
	elif [[ "$rLine" =~ "Total Duplicates" ]]
	then
		dupNodes+=${rLine##*:}
	    dupNodes=$dupNodes

	fi
done < $execFolder/$execLogFile

nodesSkipped=$[$nodesParsed - $nodesShortlisted - $dupNodes]
		echo "$runID,$testcount,$positives,$hungcount,$testhungcount,$nhDepth,$nhDensity,$nodesParsed,$nodesShortlisted,$dupNodes,$nodesSkipped,$timeStamp,$filenames" | tr -d '\t' >> $outFolder/$summaryOutFile



