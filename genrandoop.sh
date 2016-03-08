#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# Script to generate Randoop Test classes based on a given list of files
# NOTE: The folder containing the list of classes need to be in the current 
# directory and the folder name is to be sent as a parameter to this script
# 
# Usage: ./genrandoop -dir=<folder name> [-listfile=<class list file name>] [-execfolder=<working folder>] [-dryrun]
#	the class list file is expected to be contained in the folder specified 
#	by the -dir parameter. If not specified it will be taken as classlist.txt
#       wfolder is the parameter to specify a working folder under which the folder
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

export CLASSPATH=$pwdir:$pwdir/$wfolder:$pwdir/lib/sootall-2.3.0.jar:$pwdir/lib/omen.jar:$pwdir/lib/concurrent.jar:$pwdir/lib/randoop.jar:$pwdir/lib/tools.jar:$pwdir/lib/junit-4.11.jar:$pwdir/lib/colt-1.2.0.jar:$pwdir/lib/colt-hep.jar

echo $listfile
echo $wfolder

if [ "$execfolder" == "NOT-SPECIFIED" ]
then
	echo "Executing under current folder"
else 
	cd $execfolder
	echo "Executing under folder: $execfolder"
fi


cd $wfolder
ls
echo "PWD:"$(pwd)

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
