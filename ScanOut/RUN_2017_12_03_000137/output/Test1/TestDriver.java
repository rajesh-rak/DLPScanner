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
				Account receiver = (Account)paramList.get(0).returnStored();
				Account par1 = (Account)paramList.get(1).returnStored();
				int par2 = (int)paramList.get(2).returnStoredInt();
				try {
					 Thread.sleep(0);
		
 	 				/* par1: class RandoopTest0, line 99, parameter1 to method transfer, run1
					   receiver: class RandoopTest0, line 99, parameter1 to method transfer, run2
					   transfer: RandoopTest0, line 99, run1
					 */
					receiver.transfer(par1, par2);
				} catch (Exception e) {}
			 } 
		};

		Thread thread1 = new Thread() {
			 public void run() {
				List<Parameter> paramList = Initializer.collectedObjects.get(1);
				Account receiver = (Account)paramList.get(0).returnStored();
				Account par1 = (Account)paramList.get(1).returnStored();
				int par2 = (int)paramList.get(2).returnStoredInt();
				try {
					 Thread.sleep(1000);
		
 	 				/* par1: class RandoopTest0, line 99, parameter1 to method transfer, run2
					   receiver: class RandoopTest0, line 99, parameter1 to method transfer, run1
					   transfer: RandoopTest0, line 99, run2
					 */
					receiver.transfer(par1, par2);
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
		}
	}
}
