import java.util.*;
import java.io.*;
 import omen.util.*;
public class TestDriver { 

	/*
 	 * Test case for cycle 0.
	 */

	public static void cycle0() {

		// clear collectedObjects;
		Initializer.initialize(0);

		// Execute the method invocations with appropriate
		// parameters stored in collected objects
		Thread thread0 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(0);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				hep.aida.bin.DynamicBin1D par1 = (hep.aida.bin.DynamicBin1D)paramList.get(1).returnStored();
				try {
					 Thread.sleep(0);
		
 	 				/* receiver: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run1
					   par1: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run2
					   covariance: RandoopTest0, line 504, run1
					 */
					receiver.covariance(par1);
				} catch (Exception e) {}
			 } 
		};

		Thread thread1 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(1);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				hep.aida.bin.DynamicBin1D par1 = (hep.aida.bin.DynamicBin1D)paramList.get(1).returnStored();
				try {
					 Thread.sleep(1000);
		
 	 				/* receiver: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run2
					   par1: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run1
					   covariance: RandoopTest0, line 504, run2
					 */
					receiver.covariance(par1);
				} catch (Exception e) {}
			 } 
		};

		//Start the threads
		thread0.start();
		thread1.start();
		try { 
			thread0.join();
			thread1.join();
		} catch (Exception e) { }
	}

	/*
 	 * Test case for cycle 1.
	 */

	public static void cycle1() {

		// clear collectedObjects;
		Initializer.initialize(1);

		// Execute the method invocations with appropriate
		// parameters stored in collected objects
		Thread thread0 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(0);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				hep.aida.bin.DynamicBin1D par1 = (hep.aida.bin.DynamicBin1D)paramList.get(1).returnStored();
				try {
					 Thread.sleep(0);
		
 	 				/* receiver: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run1
					   par1: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run2
					   covariance: RandoopTest0, line 504, run1
					 */
					receiver.covariance(par1);
				} catch (Exception e) {}
			 } 
		};

		Thread thread1 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(1);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				java.lang.Object par1 = (java.lang.Object)paramList.get(1).returnStored();
				try {
					 Thread.sleep(1000);
		
 	 				/* receiver: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run2
					   par1: class RandoopTest0, line 504, parameter 0 (or receiver) to method covariance, run1
					   equals: RandoopTest0, line 507, run2
					 */
					receiver.equals(par1);
				} catch (Exception e) {}
			 } 
		};

		//Start the threads
		thread0.start();
		thread1.start();
		try { 
			thread0.join();
			thread1.join();
		} catch (Exception e) { }
	}

	/*
 	 * Test case for cycle 2.
	 */

	public static void cycle2() {

		// clear collectedObjects;
		Initializer.initialize(2);

		// Execute the method invocations with appropriate
		// parameters stored in collected objects
		Thread thread0 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(0);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				java.lang.Object par1 = (java.lang.Object)paramList.get(1).returnStored();
				try {
					 Thread.sleep(0);
		
 	 				/* receiver: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run1
					   par1: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run2
					   equals: RandoopTest0, line 507, run1
					 */
					receiver.equals(par1);
				} catch (Exception e) {}
			 } 
		};

		Thread thread1 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(1);
				hep.aida.bin.DynamicBin1D receiver = (hep.aida.bin.DynamicBin1D)paramList.get(0).returnStored();
				java.lang.Object par1 = (java.lang.Object)paramList.get(1).returnStored();
				try {
					 Thread.sleep(1000);
		
 	 				/* receiver: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run2
					   par1: class RandoopTest0, line 507, parameter 0 (or receiver) to method equals, run1
					   equals: RandoopTest0, line 507, run2
					 */
					receiver.equals(par1);
				} catch (Exception e) {}
			 } 
		};

		//Start the threads
		thread0.start();
		thread1.start();
		try { 
			thread0.join();
			thread1.join();
		} catch (Exception e) { }
	}

	/*
 	 * Test all the cycles.
	 */

	public static void main(String args[]) { 
		 switch( Integer.parseInt(System.getenv().get("omen.errno"))) { 
		 case 0:
			 cycle0();
			 System.out.println("Printing cycle" +0);
			 break;
		 case 1:
			 cycle1();
			 System.out.println("Printing cycle" +1);
			 break;
		 case 2:
			 cycle2();
			 System.out.println("Printing cycle" +2);
			 break;
		}
	}
}
