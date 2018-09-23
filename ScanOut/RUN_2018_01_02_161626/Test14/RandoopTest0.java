
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 0, 10);
      fail("Expected exception of type javax.naming.ConfigurationException");
    } catch (javax.naming.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpOutTraps();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(10, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.setTrapPort((java.lang.Integer)100);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Integer var3 = var1.getBufferSize();
    java.lang.Long var4 = var1.getSnmpSilentDrops();
    boolean var7 = var1.waitState(10, 100L);
    java.lang.String var8 = var1.getProtocol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1024+ "'", var3.equals(1024));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "snmp"+ "'", var8.equals("snmp"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    var1.setAuthRespEnabled(true);
    java.lang.Long var5 = var1.getSnmpOutPkts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Integer var3 = var1.getBufferSize();
    java.lang.Long var4 = var1.getSnmpOutTooBigs();
    java.lang.Long var5 = var1.getSnmpInTotalReqVars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1024+ "'", var3.equals(1024));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var3 = var1.getSnmpInGetRequests();
    java.lang.Long var4 = var1.getSnmpOutTraps();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var3 = var1.getSnmpInGetRequests();
    boolean var6 = var1.waitState(100, 100L);
    var1.setMaxTries(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var3 = var1.getSnmpInGetRequests();
    var1.setAuthTrapEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpInASNParseErrs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Long var3 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var4 = var1.getSnmpInSetRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Integer var3 = var1.getBufferSize();
    java.lang.Long var4 = var1.getSnmpSilentDrops();
    boolean var7 = var1.waitState(10, 100L);
    java.lang.Long var8 = var1.getSnmpProxyDrops();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1024+ "'", var3.equals(1024));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Integer var3 = var1.getBufferSize();
    var1.setInformPort(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setInformPort((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1024+ "'", var3.equals(1024));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    java.lang.Long var3 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var4 = var1.getSnmpInBadCommunityNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpSilentDrops();
    var1.setTrapPort((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    var1.run();
    var1.setAuthRespEnabled(true);
    int var5 = var1.getServedClientCount();
    java.lang.String[] var6 = var1.getMibs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    boolean var3 = var1.getAuthRespEnabled();
    java.lang.Long var4 = var1.getSnmpInBadCommunityNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var2 = new byte[] { (byte)0, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var5 = new java.net.DatagramPacket(var2, 1024, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var3 = var1.getSnmpInGetRequests();
    boolean var6 = var1.waitState(100, 100L);
    var1.run();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var0, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.usagetracker.UsageTrackerClient var0 = new sun.usagetracker.UsageTrackerClient();
    var0.run("snmp", "");

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpInBadCommunityUses();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    java.lang.Long var2 = var1.getSnmpOutNoSuchNames();
    java.lang.Long var3 = var1.getSnmpInGetRequests();
    int var4 = var1.getMaxActiveClientCount();
    java.lang.Long var5 = var1.getSnmpProxyDrops();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0L+ "'", var2.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0L+ "'", var3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1024);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpSilentDrops();
    com.sun.jmx.snmp.SnmpPduFactory var6 = var1.getPduFactory();
    var1.postDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(10);
    boolean var4 = var1.waitState(100, 1L);
    java.lang.Long var5 = var1.getSnmpSilentDrops();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    boolean var7 = var1.getAuthRespEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

}
