#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# This script runs the program that parses the deadlock predictions made by 
# stalemate tool and filters them based on the criteria specified in the 
# dlpscanner.properties
# The output of this program includes the metadata used for short-listing a specific 
# prediction and the list of classes that can be used for generating test cases
# which will aid in validating if the prediction is a true positive
# 
#  The entire behavior of this program is controlled by dlpscanner.properties file,
#  before running this program make sure the dlpscanner.properties is configured
#  correctly
#  
#  The program is called by passing the FOLDER containing 
#  dlpscanner.properties as parameter, if dlpscanner.properties is not
#  available in the classpath.
#  
#  If the dlpscanner.properties is available in classpath the program
#  will pick that even if the folder path is specified
#  Typically dlpscanner.properties is kept in the current folder where this
#  script is kept, and the current folder is set in the classpath. This is for
#  convenience. If a different dlpscanner.properties is to be used, delete or
#  rename the one in the current folder and specify the correct path for execution
#  in this script
# NOTE: The lib folder with all the necessary jar files is expected to be present
# in the current folder for this script to function correctly
# 
# This script does not take any parameter, make sure dlpscanner.properties is 
# in the current directory

pwdir=$(pwd)

delim="="
listfile="classlist.txt"
wfolder="NOT-SPECIFIED"

export CLASSPATH=$pwdir:$pwdir/lib/commons-io-2.4.jar:$pwdir/lib/*

echo $listfile
echo $wfolder
printenv CLASSPATH

echo ""
echo "Attempting to run the scanner..."

java -Xms2048m -Xmx4096m org.iiitb.dlpscanner.ScanDLPredictions .
cd ..
echo "...done"

