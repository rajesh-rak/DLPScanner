# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
#
# This property file controls the functioning of ScanDLPredictions.java
# Set the parameters here correctly before running it
#
# Dead Lock Prediction Scanner Properties file
# If DRY_RUN is ON no files will be created
#
# The folder where the scan results will be stored after execution
# Sub folders will be created under this folder for each run of the program
#
OUT_FOLDER=/Users/rajesh/code/DLPScanner/ScanOut
#
# The name of the file that contains the full path of the output folder
# The purpose of this file is to feed information to subsequent programs
# to process the output created by this file
#
OUT_FOLDER_FILE=scanresultfolder.out
#
#
# Folder containing the stale mate predictions
# Use FILES param to specify the prediction files to scan,
#                                          wild cards are accepted
PREDICTION_RESULTS_FOLDER=/Users/rajesh/code/DLPScanner/cycles
FILES=1.5*
#
##### Settings #####
VERBOSE=OFF
DRY_RUN=OFF
# Comma separated list of Package Names to exclude in result
PACKAGE_EXCLUSIONS=none
#
EXCLUDE_INNER_CLASS=ON
SKIP_DUPLICATES=ON
#
##### Filter Criteria #####
CYCLES=2,3,4
NEIGHBOURHOOD_DEPTH=20
NEIGHBOURHOOD_DENSITY=20
##### Algo - Params ####
CYCLES_TEXT=Cycle-
THREAD_TEXT=Thread-
