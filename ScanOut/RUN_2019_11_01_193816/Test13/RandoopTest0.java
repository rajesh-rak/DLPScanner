
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = com.sun.jmx.snmp.daemon.SnmpInformRequest.snmpErrorToString(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "wrongValue"+ "'", var1.equals("wrongValue"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = com.sun.jmx.snmp.daemon.SnmpInformRequest.snmpErrorToString(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "tooBig"+ "'", var1.equals("tooBig"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = com.sun.jmx.snmp.daemon.SnmpInformRequest.snmpErrorToString(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "noError"+ "'", var1.equals("noError"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = com.sun.jmx.snmp.daemon.SnmpInformRequest.snmpErrorToString((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Unknown Error = -1"+ "'", var1.equals("Unknown Error = -1"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = com.sun.jmx.snmp.daemon.SnmpInformRequest.snmpErrorToString(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Unknown Error = 100"+ "'", var1.equals("Unknown Error = 100"));

  }

}
