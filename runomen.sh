#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com)
# 
#Script to run Omen+ for a given set of test cases
# NOTE: All Test class directories must be at the same folder
#       where this script is present
# Usage: runomen [-c/-compile] -testdir=<folder name of the test classes>
#                              [-class=class name of the main method/ default: RandoopTest]
# Example ./runomen.sh -c -testdir=demo -class=TestAccount
# Note that test directory and lib folders of omen needs to be at the same location
# as that of this script

# ---Folder locations - to be set before first time execution---
# The Lib folder of Omen needs to be copied to the same location where the scripts are
# With the current version omenfolder must be . (current folder), this parameter kept for
# future updates
omenfolder=.

# ---Variables and constants---

compileChar1="-c"
complieChar2="-compile"
testDirChar="-testdir"
delim="="


isCompile="false"
testDir="NOT-SPECIFIED"
inparam=""
invalue=""
runclass="RandoopTest"

# ---Initializions---
export ANT_OPTS=-Dfile.encoding=ISO-8859-1
export JAVA_TOOL_OPTIONS=-Dfile.encoding=ISO-8859-1
export OMEN_CLASSPATH=$omenfolder/lib/sootall-2.3.0.jar:$omenfolder/lib/omen.jar:$omenfolder/lib/concurrent.jar:$omenfolder/lib/randoop.jar:$omenfolder/lib/tools.jar
export OMEN_CLASSPATH_ALL=$omenfolder/lib/*

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
   		runClass=$invalue
	else
   		echo "Unrecognized Parameter: $inparam"
	fi

done

if [ "$testDir" == "NOT-SPECIFIED" ]
then
	echo "Test Case Directory not specified, cannot proceed further...terminating"
	exit 0
fi

if [ ! -d "$testDir" ] 
then
	echo "Test Case Directory does not exist...terminating"
	echo ""
	exit 0
fi

echo
echo "Compile $isCompile"
echo "Test Directory $testDir"
echo ""

if [ "$isCompile" == "true" ]
then
	echo ""
	echo "Compiling ..."
	cd $testDir
	rm -f -r ./classes
	mkdir classes
	pwd
	javac -cp ../$OMEN_CLASSPATH:. -d ./classes *.java
	cd ..
fi


echo ""
echo "Executing Omen..."

java -Xms2048m -Xmx4096m -ea  -cp $OMEN_CLASSPATH:./$testDir/classes omen.util.OmenDriver --user-specified-test $runClass -omen.runwolf "true" -omen.kappa "5"  -omen-output-dir "./output/$testDir/"

#Moving opertional files to output logs
mkdir ./output/$testDir/logs
mv tmp ./output/$testDir/
mv error.log error.list iidToLine.map iidToLine.map.html omen.wolf.javato.usedids ./output/$testDir/logs

echo "...Omen Execution done!"
echo ""


exit 0
