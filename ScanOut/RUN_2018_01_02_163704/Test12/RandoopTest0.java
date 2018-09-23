
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(0, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    var1.setMaxTries(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 0, 100);
    var4.close();
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpOutGetResponses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    com.sun.jmx.snmp.SnmpPduFactory var4 = var1.getPduFactory();
    java.lang.Long var5 = var1.getSnmpOutBadValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    java.lang.Long var6 = var1.getSnmpInBadVersions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    java.lang.Long var6 = var1.getSnmpOutNoSuchNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getLocalPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 56719);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpOutTraps();
    java.lang.Integer var6 = var1.getBufferSize();
    int var7 = var1.getActiveClientCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1024+ "'", var6.equals(1024));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    java.lang.String[] var6 = var1.getMibs();
    var1.start(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setReuseAddress(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    int var6 = var1.getMaxActiveClientCount();
    java.lang.Long var7 = var1.getSnmpInGetNexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0L+ "'", var7.equals(0L));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    com.sun.jmx.snmp.SnmpPduFactory var4 = var1.getPduFactory();
    java.lang.Long var5 = var1.getSnmpInGetNexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    var1.setTrapPort(1024);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    int var2 = var0.getSendBufferSize();
    int var3 = var0.getTrafficClass();
    boolean var4 = var0.isClosed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setReceiveBufferSize((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var0 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer();
    java.lang.String[] var1 = var0.getMibs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    int var6 = var1.getActiveClientCount();
    com.sun.jmx.snmp.SnmpPduFactory var7 = var1.getPduFactory();
    var1.setTrapPort((java.lang.Integer)162);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpOutTraps();
    java.lang.Long var6 = var1.getSnmpOutGetResponses();
    java.lang.Long var7 = var1.getSnmpOutTooBigs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0L+ "'", var7.equals(0L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    java.lang.Long var4 = var1.getSnmpInTotalSetVars();
    java.lang.Long var5 = var1.getSnmpInPkts();
    int var6 = var1.getActiveClientCount();
    int var7 = var1.getServedClientCount();
    java.lang.Long var8 = var1.getSnmpInBadCommunityNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0L+ "'", var4.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0L+ "'", var5.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    int var3 = var1.getInformPort();
    int var4 = var1.getInformPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 162);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    int var2 = var1.getServedClientCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    int var2 = var0.getSendBufferSize();
    int var3 = var0.getTrafficClass();
    var0.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    java.net.InetAddress var2 = var0.getLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var1 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(0);
    java.lang.String[] var2 = var1.getMibs();
    var1.setBufferSize((java.lang.Integer)1024);
    var1.setPort(1024);
    int var7 = var1.getMaxActiveClientCount();
    java.lang.Long var8 = var1.getSnmpInGetNexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0L+ "'", var8.equals(0L));

  }

}
