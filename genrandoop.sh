#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# Script to generate Randoop Test classes based on a given list of files
# NOTE: The folder containing the list of classes need to be in the current 
# directory and the folder name is to be sent as a parameter to this script
# 
# Usage: ./genrandoop -dir=<folder name> [-listfile=<class list file name>]
#	the class list file is expected to be contained in the folder specified 
#	by the -dir parameter. If not specified it will be taken as classlist.txt
pwdir=$(pwd)

delim="="
listfile="classlist.txt"
wfolder="NOT-SPECIFIED"

for var in "$@"
do
	inparam=${var%${delim}*}
	invalue=${var#*${delim}}

	if [ "$inparam" == "-dir" ] 
	then
   		wfolder=$invalue
	
	elif [ "$inparam" == "-listfile" ]
	then
   		
		echo "inside -listfile"		
		listfile=$invalue
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
printenv CLASSPATH



cd $wfolder

echo ""
echo "Attempting to generate Randoop Tests..."

java -Xms2048m -Xmx4096m randoop.main.Main gentests --classlist=$listfile --timelimit=60
cd ..
echo "...done"
