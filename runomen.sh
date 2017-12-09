#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
#Script to run Omen+ for a given set of test cases
# NOTE: All Test class directories must be at the same folder
#       where this script is present. If in a different folder, it must be specified
#	by the -execdir option
# Usage: runomen [-c/-compile] -testdir=<folder name of the test classes>
#                              [-class=class name of the main metho
# 					default: RandoopTest]
#                              [-execfolder=<folder name where the testdir is present>]
#			       [-dryrun, when specified no execution will be done]
# Example ./runomen.sh -c -testdir=demo -class=TestAccount
# Note that test directory and lib folders of omen needs to be at the same location
# as that of this script

# ---Folder locations - to be set before first time execution---
# The Lib folder of Omen needs to be copied to the same location where the scripts are
# With the current version omenfolder must be . (current folder), this parameter kept for
# future updates

# comment out below line and hard code path if script is not present in the working directory
# Eg: omenfolder=/home/rajesh/code/DLPScanner

omenfolder=$(pwd)


# ---Variables and constants---

compileChar1="-c"
complieChar2="-compile"
testDirChar="-testdir"
delim="="
execfolder="NOT-SPECIFIED"
dryrun="FALSE"
outputfolder="./output"

isCompile="false"
testDir="NOT-SPECIFIED"
inparam=""
invalue=""
runClass="RandoopTest"
outfolder_namefile=outfolder.txt

# ---Initializions---
export ANT_OPTS=-Dfile.encoding=ISO-8859-1
export JAVA_TOOL_OPTIONS=-Dfile.encoding=ISO-8859-1
export OMEN_CLASSPATH=$omenfolder/lib/rt.jar:$omenfolder/lib/jaxws-rt-2.2.10.jar:$omenfolder/lib/omen.jar:$omenfolder/lib/sootall-2.3.0.jar:$omenfolder/lib/concurrent.jar:$omenfolder/lib/randoop.jar:$omenfolder/lib/tools.jar:$omenfolder/lib/junit-4.11.jar:$omenfolder/lib/colt-1.2.0.jar:$omenfolder/lib/colt-hep.jar:$omenfolder/lib/Account.jar:$omenfolder

#---Extract Command Line arguments---"
echo ""
echo ""
echo "initiating..."
echo ""
for var in "$@"
do
	inparam=${var%${delim}*}
	invalue=${var#*${delim}}

	if [ "$inparam" == "-c" ] || [ "$inparam" == "-compile" ] 
	then
   		isCompile="true"
	elif [ "$inparam" == "-testdir" ]
	then
   		testDir=$invalue
	elif [ "$inparam" == "-class" ]
	then
		echo "inside -class"		
		runClass=$invalue
	elif [ "$inparam" == "-execfolder" ]
	then
		execfolder=$invalue
	elif [ "$inparam" == "-dryrun" ]
	then
		dryrun="TRUE"

	else
   		echo "Unrecognized Parameter: $inparam"
	fi

done

if [ "$testDir" == "NOT-SPECIFIED" ]
then
	echo "Test Case Directory not specified, cannot proceed further...terminating"
	exit 0
fi


echo
echo "Compile $isCompile"
echo "Test Directory $testDir"
echo ""


if [ "$execfolder" == "NOT-SPECIFIED" ]
then
	echo "Executing under current folder"
	if [ ! -d "$testDir" ] 
	then
		echo "Test Case Directory does not exist...terminating"
		echo ""
		exit 0
	fi
	outputfolder="$outputfolder/$testDir"
	
else 
	if [ ! -d "$execfolder" ] 
	then
		echo "Execution folder does not exist...terminating"
		echo ""
		exit 0
	fi
	if [ ! -d "$execfolder/$testDir" ] 
	then
		echo "Test Case folder does not exist @ exec folder...terminating"
		echo ""
		exit 0
	fi
	cd $execfolder
	outputfolder="$execfolder/output/$testDir"
	echo "Executing under folder: $execfolder"
	
fi
echo "Output Folder: $outputfolder"

echo $outputfolder > ../../$outfolder_namefile 

echo "PWD:"$(pwd)

if [ "$isCompile" == "true" ]
then
	echo ""
	echo "Compiling ..."
	cd $testDir
	echo "PWD:"$(pwd)
	rm -f -r ./classes
	mkdir classes
	echo "PWD:"$(pwd)
	
	echo "Dry Run: $dryrun"
	if [ "$dryrun" == "FALSE" ]
	then
	#{
	javac -cp $OMEN_CLASSPATH:. -d ./classes *.java
	#}
	else
		echo "...dry run...no compile ..."
	fi
	cd ..
	
fi

cd $omenfolder


if [ ! "$execfolder" == "NOT-SPECIFIED" ]
then
	sourceDir="$execfolder/$testDir"
	execDir="$omenfolder/x$testDir"
	echo "Source: $sourceDir Dest: $execDir"
	cp -a $sourceDir $execDir
else
	execDir="./$testDir"
fi


echo ""
echo "Executing Omen..."
echo "PWD:"$(pwd)

if [ "$dryrun" == "FALSE" ]
then
#{

java -Xms2048m -Xmx3072m -ea  -cp $OMEN_CLASSPATH:$execDir/classes omen.util.OmenDriver --user-specified-test $runClass -omen.runwolf "false" -omen.kappa "5"  -omen-output-dir "$outputfolder/"

#Moving opertional files to output logs
mkdir $outputfolder/logs
mv tmp $outputfolder
mv error.log error.list iidToLine.map iidToLine.map.html omen.wolf.javato.usedids  $outputfolder/logs

#}
else
	echo "...dry run...no exec"
fi

echo "...Omen Execution done!"

if [ ! "$execfolder" == "NOT-SPECIFIED" ]
then
	echo "...cleanign up exec folder"
	rm -rdf $execDir
fi

#TODO: Uncomment after testing to clean up file
rm -f $outfolder_namefile
echo "Done!"

exit 0
