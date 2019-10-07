#!/bin/bash
masterfile=dlpscanner.properties.m
scannerpropertyfile=dlpscanner.properties
testcasefile=DLPTestCases.txt
testrunlog=DLP_Test_Runs.txt
txCount=0

while read txTCLine
do
  txFileTxt=$(echo $txTCLine | cut -d, -f1)
  txNHDepthTxt=$(echo $txTCLine | cut -d, -f2)
  txNHDensityTxt=$(echo $txTCLine | cut -d, -f3)
  scannerpropertyfile=dlpscanner.properties
  ((txCount++))

  # Generate DLP properties file
  echo "#" > $scannerpropertyfile
  while read txLine
  do
    if [[ "$txLine" =~ "FILES=" ]]
  	then
  		echo "FILES=$txFileTxt" >> $scannerpropertyfile
  	elif [[ "$txLine" =~ "NEIGHBOURHOOD_DEPTH=" ]]
  	then
  		echo "NEIGHBOURHOOD_DEPTH=$txNHDepthTxt" >> $scannerpropertyfile
    elif [[ "$txLine" =~ "NEIGHBOURHOOD_DENSITY=" ]]
  	then
  		nhDensity=${rLine##*:}
  		echo "NEIGHBOURHOOD_DENSITY=$txNHDensityTxt" >> $scannerpropertyfile
    else
      echo $txLine >> $scannerpropertyfile
  	fi
  done < $masterfile
  #Execute DLP
  ./runDLP.sh
  txTS=$(date +"%Y-%m-%d %H:%M:%S")
  echo "Execution Completed: $txTCLine  $txTS"
  echo "Execution Completed: $txCount. $txTCLine  $txTS" >> $testrunlog
done < $testcasefile

