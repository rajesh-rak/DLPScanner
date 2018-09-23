
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(1);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus((-1), 100, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    int var2 = var1.getMaxTries();
    com.sun.jmx.snmp.SnmpPduFactory var3 = var1.getPduFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getTimeout();
    int var4 = var1.getInformPort();
    java.lang.Long var5 = var1.getSnmpProxyDrops();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setEnterpriseOid("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.getBroadcast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setEnterpriseOid("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getTimeout();
    int var4 = var1.getMaxActiveClientCount();
    var1.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInPkts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getTimeout();
    int var4 = var1.getInformPort();
    java.lang.Long var5 = var1.getSnmpProxyDrops();
    com.sun.jmx.snmp.agent.SnmpUserDataFactory var6 = var1.getUserDataFactory();
    java.lang.Long var7 = var1.getSnmpOutGetResponses();
    java.lang.Long var8 = var1.getSnmpInTotalSetVars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0L+ "'", var7.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpInTotalReqVars();
    java.lang.Long var3 = var1.getSnmpProxyDrops();
    var1.setTrapPort((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var5 = new java.net.DatagramPacket(var2, 5, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Integer var5 = var1.getBufferSize();
    boolean var6 = var1.getAuthRespEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInSetRequests();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    java.lang.String var7 = var1.getStateString();
    boolean var8 = var1.getAuthTrapEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "OFFLINE"+ "'", var7.equals("OFFLINE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    var0.setReceiveBufferSize(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    var0.disconnect();
    var0.setSoTimeout(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInTotalReqVars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInSetRequests();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    java.lang.String var7 = var1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Rajeshs-iMac.local"+ "'", var7.equals("Rajeshs-iMac.local"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    var0.disconnect();
    java.net.InetAddress var3 = var0.getInetAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getTimeout();
    int var4 = var1.getMaxActiveClientCount();
    java.lang.String var5 = var1.getEnterpriseOid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1.3.6.1.4.1.42"+ "'", var5.equals("1.3.6.1.4.1.42"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInSetRequests();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    java.lang.String var7 = var1.getStateString();
    java.lang.Long var8 = var1.getSnmpOutPkts();
    java.lang.Long var9 = var1.getSnmpProxyDrops();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "OFFLINE"+ "'", var7.equals("OFFLINE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpInTotalReqVars();
    com.sun.jmx.snmp.SnmpPduFactory var3 = var1.getPduFactory();
    java.lang.String var4 = var1.getStateString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OFFLINE"+ "'", var4.equals("OFFLINE"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    int var3 = var1.getTimeout();
    int var4 = var1.getInformPort();
    java.lang.Long var5 = var1.getSnmpProxyDrops();
    com.sun.jmx.snmp.agent.SnmpUserDataFactory var6 = var1.getUserDataFactory();
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    int var2 = var1.getMaxTries();
    java.lang.Long var3 = var1.getSnmpSilentDrops();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpOutGenErrs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);
    java.lang.Long var2 = var1.getSnmpOutGenErrs();
    var1.setBufferSize((java.lang.Integer)0);
    java.lang.Long var5 = var1.getSnmpInASNParseErrs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

}
