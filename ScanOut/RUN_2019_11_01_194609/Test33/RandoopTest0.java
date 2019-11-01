
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    java.lang.String var3 = var1.getProtocol();
    java.lang.Long var4 = var1.getSnmpInTotalReqVars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "snmp"+ "'", var3.equals("snmp"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.Long var2 = var1.getSnmpOutBadValues();
    var1.preDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    var1.setAuthRespEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    int var3 = var1.getServedClientCount();
    java.lang.String var4 = var1.getProtocol();
    int var5 = var1.getMaxTries();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "snmp"+ "'", var4.equals("snmp"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setReceiveBufferSize(3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    int var3 = var1.getServedClientCount();
    java.lang.Long var4 = var1.getSnmpSilentDrops();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.SocketAddress var1 = var0.getLocalSocketAddress();
    boolean var2 = var0.isConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var0 = new byte[] { };
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    java.net.SocketAddress var4 = var3.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var5 = new java.net.DatagramPacket(var0, 5, (-1), var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.Long var3 = var1.getSnmpOutPkts();
    boolean var4 = var1.isActive();
    java.lang.String var5 = var1.getEnterpriseOid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "1.3.6.1.4.1.42"+ "'", var5.equals("1.3.6.1.4.1.42"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    int var3 = var1.getServedClientCount();
    java.lang.String var4 = var1.getProtocol();
    int var5 = var1.getMaxTries();
    java.lang.Long var6 = var1.getSnmpSilentDrops();
    boolean var7 = var1.getAuthRespEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "snmp"+ "'", var4.equals("snmp"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.String[] var3 = var1.getMibs();
    java.lang.String var4 = var1.getProtocol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "snmp"+ "'", var4.equals("snmp"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    var0.setBroadcast(true);
    int var4 = var0.getSendBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    var1.setTrapPort((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.Long var3 = var1.getSnmpOutPkts();
    boolean var4 = var1.isActive();
    var1.setPort(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    boolean var2 = var1.getAuthRespEnabled();
    java.lang.Long var3 = var1.getSnmpInGetNexts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMaxTries((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.Long var3 = var1.getSnmpOutPkts();
    boolean var4 = var1.isActive();
    com.sun.jmx.snmp.SnmpPduFactory var5 = var1.getPduFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.Long var2 = var1.getSnmpInBadCommunityUses();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(1, 100, 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    int var3 = var1.getServedClientCount();
    java.lang.String var4 = var1.getProtocol();
    int var5 = var1.getMaxTries();
    java.lang.Long var6 = var1.getSnmpSilentDrops();
    boolean var7 = var1.getAuthTrapEnabled();
    java.lang.Long var8 = var1.getSnmpInPkts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "snmp"+ "'", var4.equals("snmp"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    int var2 = var1.getActiveClientCount();
    int var3 = var1.getServedClientCount();
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    var0.setBroadcast(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTrafficClass(65507);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.String[] var3 = var1.getMibs();
    var1.setPort(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    java.lang.String var2 = var1.getEnterpriseOid();
    java.lang.String[] var3 = var1.getMibs();
    java.lang.Integer var4 = var1.getBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.3.6.1.4.1.42"+ "'", var2.equals("1.3.6.1.4.1.42"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1024+ "'", var4.equals(1024));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.DatagramSocket var1 = new java.net.DatagramSocket();
    java.net.SocketAddress var2 = var1.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bind(var2);
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(1);
    boolean var2 = var1.getAuthRespEnabled();
    java.lang.Long var3 = var1.getSnmpOutBadValues();
    javax.management.MBeanNotificationInfo[] var4 = var1.getNotificationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    var0.setBroadcast(true);
    boolean var4 = var0.isConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.DatagramSocket var1 = new java.net.DatagramSocket(0);
    int var2 = var1.getLocalPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54211);

  }

}
