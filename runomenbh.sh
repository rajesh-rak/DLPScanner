#!/bin/bash
./runomen.sh -c -testdir=demo -class=TestAccount > demo.out 
cp -r tmp/ ./output/demo/ 
./runomen.sh -c -testdir=Stack_Vector -class=RandoopTest > Stack_Vector.out 
cp -r tmp/ ./output/Stack_Vector/ 
./runomen.sh -c -testdir=Corba_Test -class=RandoopTest > Corba_Test.out
cp -r tmp/ ./output/Corba_Test/ 
./runomen.sh -c -testdir=CorbaTest2 -class=RandoopTest > CorbaTest2.out 
cp -r tmp/ ./output/CorbaTest2/ 
./runomen.sh -c -testdir=Annotation_Test -class=RandoopTest > Annotation_Test.out 
cp -r tmp/ ./output/Annotation_Test/ 
echo "Completed...check the .out files"