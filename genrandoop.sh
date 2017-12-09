#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# Script to generate Randoop Test classes based on a given list of files
# 
# The folder containing file (passed in the 'dir parameter) with the list of 
# class names need to be in the current directory or at the 'execfolder' 
# (passed as parameter) and the folder name specified by the 'dir' parameter 
# 
# Usage: ./genrandoop -dir=<folder name> [-listfile=<class list file name>] 
# 					 [-execfolder=<working folder>] 
#					 [-dryrun]
#	the class list file is expected to be contained in the folder specified 
#	by the -dir parameter. If not specified it will be taken as classlist.txt
#       execfolder is the parameter to specify a working folder under which the folder
#       specified by -dir parameter is present
# 	if dryrun is specified then the actual execution will not be performed
pwdir=$(pwd)

delim="="
listfile="classlist.txt"
wfolder="NOT-SPECIFIED"
execfolder="NOT-SPECIFIED"
dryrun="FALSE"

for var in "$@"
do
	inparam=${var%${delim}*}
	invalue=${var#*${delim}}

	if [ "$inparam" == "-dir" ] 
	then
   		wfolder=$invalue
	
	elif [ "$inparam" == "-listfile" ]
	then
		listfile=$invalue
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

if [ "$wfolder" == "NOT-SPECIFIED" ]
then
	echo "Please provide the folder name. Eg: ./genrandoop.sh -dir=<Folder Name>"
	exit 0
fi


echo $listfile
echo $wfolder

if [ "$execfolder" == "NOT-SPECIFIED" ]
then
	echo "Executing under current folder"
	execfolder=$pwdir
	if [ ! -d "$wfolder" ] 
	then
		echo "Folder with classlist does not exist...terminating"
		echo ""
		exit 0
	fi
	
else 
	echo "Executing under folder: $execfolder"
	if [ ! -d "$execfolder" ] 
	then
		echo "Execution folder does not exist...terminating"
		echo ""
		exit 0
	fi

	if [ ! -d "$execfolder/$wfolder" ] 
	then
		echo "Folder with classlist does not exist...terminating"
		echo ""
		exit 0
	fi
fi

export CLASSPATH=$pwdir:$execfolder/$wfolder:$pwdir/lib/sootall-2.3.0.jar:$pwdir/lib/omen.jar:$pwdir/lib/concurrent.jar:$pwdir/lib/randoop.jar:$pwdir/lib/tools.jar:$pwdir/lib/junit-4.11.jar:$pwdir/lib/jaxws-rt-2.2.10.jar:$pwdir/lib/colt-1.2.0.jar:$pwdir/lib/colt-hep.jar:$pwdir/lib/Account.jar

echo "Classpath:"
env | grep CLASSPATH

cd $execfolder/$wfolder
echo "PWD:"$(pwd)
ls

echo ""
echo "Attempting to generate Randoop Tests..."

echo "Dry Run: $dryrun"
if [ "$dryrun" == "FALSE" ]
then
#{
java -Xms2048m -Xmx4096m randoop.main.Main gentests --classlist=$listfile --timelimit=30 --inputlimit=50 --outputlimit=40
#}
else
	echo "...dry run...no exec ..."
fi

echo "...done"
exit 0
