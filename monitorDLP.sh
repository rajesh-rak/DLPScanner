#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# This script will monitor the running DLP program for any unrecoverable deadlocks
# in case such dead locks are found it will log the stack trace kill the deadlocked
# process and log the results. The script will exit when the runDLP script
# has completed its execution or no dead lock prediction program is runing
# 
# The algorithm is as follows:
# 1. Check the java processes that are being executed
# 2. If the java processes of the dead lock detection routines are having the same PID
#    after the designated number of tries, it is assumed to have some locking
# 3. Java stack traces are taken for the deadlock detection programs
# 4. If the JNI Glabal references are remaining the same for the designated n. of tries
#    the program is assumed to be locked
# 5. The JNI Global reference check is made for all detection programs - to be sure that 
#    the code is dead locked
# 6. A delay is introduced that is configurable between multiple tries
#
# Usage ./monitorDLP.sh 
#
#
#21091 OmenDriver -Dfile.encoding=ISO-8859-1 -Xms2048m -Xmx3072m -ea
#21119 InstrumentorForActiveTesting -Dfile.encoding=ISO-8859-1
# TestDriver, RandoopTest

DELAY_SECS=5
JGR_DELAY_SECS=15
LOOP_WAIT_SECS=10
RE_TRIES=3

pid_file1=pidf1.txt
pid_file2=pidf2.txt
count=0
i=0
pid[0]=""
jps_txt=Jps
inst=InstrumentorForActiveTesting
testd=TestDriver
omen=OmenDriver

run_folder=scanresultfolder.out
output_folder=outfolder.txt

Y=1
N=0
java_running=$Y

lockedPIDs=()

log_pid_file() {
	jps -v > $pid_file1
	sleep $DELAY_SECS
	jps -v > $pid_file2	
}

# Read the file in parameter and fill the array named "array"
getFile1Pids() {
    array1=() # Create array
    while IFS= read -r line # Read a line
    do
        array1+=("$line") 
    done < "$pid_file1"
}
getFile2Pids() {
    array2=() # Create array
    while IFS= read -r line # Read a line
    do
        array2+=("$line") 
    done < "$pid_file2"
}

check_pid_match() { # populates matchesP and mathesID array if the process ids match
	
	java_running=$N
	
	getFile1Pids
	getFile2Pids
	matchesP=() # Array to hold the process matches
	matchesID=() # Array to hold the process matches
	
	icount1=${#array1[*]}
	icount2=${#array2[*]}
	for (( i=0; i < $icount1; i++ ))
	do
		pidtxt1=${array1[$i]}
		idt1=$(echo $pidtxt1|cut -d ' ' -f 1)
		proc1=$(echo $pidtxt1|cut -d ' ' -f 2)

		
		#ignore Jps
		if [ "$proc1" = "$jps_txt" ] 
		then
			continue
		fi	
	
		java_running=$Y

		for (( j=0; j < $icount2; j++ ))
		do
			pidtxt2=${array2[$j]}
			idt2=$(echo $pidtxt2|cut -d ' ' -f 1)
			proc2=$(echo $pidtxt2|cut -d ' ' -f 2)
			
			if [ "$proc1" = "$proc2" ] && [ "$idt1" = "$idt2" ]
			then
				matchesP+=("$proc1")
				matchesID+=("$idt1")
			fi
		done
	done	
}

logjStack() {
	jstack -l $1 > jstack1.txt
	sleep $JGR_DELAY_SECS
	jstack -l $1 > jstack2.txt
}

detect_n_kill_locked_process() { #Populates the jniMatchCount array for each of the process ids 
	# matchIDCount is assumed to be populated before calling this function
	count=${#matchesID[*]}
	for (( j=0; j < $count; j++ ))
	do
		pidtxt=${matchesID[$j]}
		#do not check dead lock for some specific processes
		if [ "$proc1" = "$inst" ] || [ "$proc1" = "$testd" ] || [ "$proc1" = "$omen" ]
		then
			java_running=$Y
			continue
		fi	
		#get java stack trace
		logjStack $pidtxt
		jgr1txt=$(grep "JNI global references" jstack1.txt)
		jgr2txt=$(grep "JNI global references" jstack2.txt)
		jgr1=$(echo $jgr1txt|cut -d ' ' -f 4)
		jgr2=$(echo $jgr2txt|cut -d ' ' -f 4)
		if [ "$jgr1" = "$jgr2" ] 
		then
			echo -n "#"
			echo Process Locked ${matchesP[$j]}
			kill -9 $pidtxt
		fi
	done
	
}



echo -n "Monitoring Java processes..."
echo 
#java_running=0
while [ $java_running -eq $Y ]
do
	echo -n "."
	lockedPIDs=()
	loop_count+=1
	log_pid_file
	check_pid_match
	matchPCount=${#matchesP[*]}
	matchIDCount=${#matchesID[*]}
	if [ $matchPCount -gt 0 ]
	then
		echo -n "*"
		detect_n_kill_locked_process
	fi	
	sleep $LOOP_WAIT_SECS
done
echo "."
echo Cleaning up...
rm -f $pid_file1
rm -f $pid_file2
rm -f jstack1.txt
rm -f jstack2.txt
 
echo "Done, Monitoring concluded"









