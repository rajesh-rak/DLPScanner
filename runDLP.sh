#!/bin/bash
#
# @Author: Rajesh Kumar R (rajesh.rak@gmail.com) IIIT-B MS2013007
# 
# This script will run all the necessary programs and scripts to detect a 
# deadlock. Here are the things that will be done by this script:
#
# 1. Scan the predictions made by stalemate tool. The stalemate tool itself is 
#    not run as part of this script, but the prediction files in the 'cycles'
#    folder  will be scanned and  set of classes will be shortlisted to examine 
#    for deadlocks, based on the criteria specified in the dlpscanner.properties
#    IMPORTANT: make sure the dlpscanner.properties is set correctly before
#    runnning this script.
# 
# 2. The shortlisted classes list will be created in a separate folders
#    and under a execution folder. This execution folder will be fed to the 
#    Randoop generator so that test cases will be generated for each of the 
#    shortlisted classes by Randoop
#
# 3. The generated test cases will be then fed into the Omen+ tool, which will
#    analyze these test cases for  creation of deadlocking scenarios and if such
#    a scenario is detected, a deadlocking test case will be generated. All the 
#    outcome of the Omen+ tool will be kept under the 'output' folder under the 
#    execution folder
#
# 4. The output folder will be examined for any detected deadlocks and a 
#    summary output will be generated 
# 
# The above tasks are all achieved by multiple programs and multiple scripts, 
# and this script brings them all together so that this automation is 
# comprehensively achieved and very large set of classes and libraries can be
# examined for deadlocks. 
# This set of tools and automation provides a definitive way of detecting 
# deadlocks in large libraries which is otherwise not possible with the existing
# methods and tools available in the industry and in the research community 
# (March - 2016)
#
# -------------------------------------------
# Some things to take care:
# - Make sure the dlpscanner.properties is in the same folder as that of the
#   script
#
# --------------------------------------------

# Step-1: Invoking Dead Lock Prediction Scanner to scan 
#
./runscanner.sh


