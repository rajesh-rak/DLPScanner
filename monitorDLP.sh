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


DELAY_SECS=1
RE_TRIES=3
pid_file1=pidf1.txt
pid_file2=pidf2.txt
count=0
i=0
pid[0]=""

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

check_pid_lock() {
	
#	log_pid_file
	getFile1Pids
	getFile2Pids

}



check_pid_lock

icount1=${#array1[*]}
icount2=${#array2[*]}
for e in "${array1[@]}"
do
    echo $e 
done
echo ---
for e in "${array2[@]}"
do
    echo $e 
done

for (( i=0; i < $icount1; i++ ))
do
 pidtxt1=${array1[$i]} 
 pidtxt2=${array2[$i]} 
 idt=$(echo $pidtxt1|cut -d ' ' -f 1)
 echo $idt
 echo $pidtxt1|cut -d ' ' -f 1
done

echo COUNTs $icount2   $icount1






