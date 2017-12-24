
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


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var2 = new java.net.DatagramPacket(var0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(100);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var6 = new java.net.DatagramPacket(var3, 1, 5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 100, 1);
      fail("Expected exception of type javax.naming.ConfigurationException");
    } catch (javax.naming.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketAddress var6 = var5.getSocketAddress();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    var5.setLength(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 1, 10);
      fail("Expected exception of type javax.naming.ConfigurationException");
    } catch (javax.naming.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(100, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    byte[] var10 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var12 = new java.net.DatagramPacket(var10, 0);
    var5.setData(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var15 = new java.net.DatagramPacket(var10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    byte[] var7 = var5.getData();
    var5.setPort(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    byte[] var10 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var12 = new java.net.DatagramPacket(var10, 0);
    var5.setData(var10);
    byte[] var14 = var5.getData();
    int var15 = var5.getOffset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketAddress var16 = var5.getSocketAddress();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setPort((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    byte[] var9 = new byte[] { (byte)1, (byte)(-1), (byte)1};
    var5.setData(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var0, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    int var7 = var5.getOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    byte[] var8 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var10 = new java.net.DatagramPacket(var8, 0);
    int var11 = var10.getLength();
    var10.setPort(0);
    java.net.SocketAddress var14 = var10.getSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var15 = new java.net.DatagramPacket(var2, (-1), 100, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setPort((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    java.net.SocketAddress var9 = var5.getSocketAddress();
    java.net.DatagramSocket var10 = new java.net.DatagramSocket(var9);
    var10.setBroadcast(false);
    byte[] var16 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var18 = new java.net.DatagramPacket(var16, 0);
    var10.send(var18);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    byte[] var10 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var12 = new java.net.DatagramPacket(var10, 0);
    var5.setData(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketAddress var14 = var5.getSocketAddress();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    java.net.SocketAddress var9 = var5.getSocketAddress();
    java.net.DatagramSocket var10 = new java.net.DatagramSocket(var9);
    int var11 = var10.getReceiveBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 65507);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    java.net.SocketAddress var9 = var5.getSocketAddress();
    java.net.DatagramSocket var10 = new java.net.DatagramSocket(var9);
    java.net.DatagramSocket var11 = new java.net.DatagramSocket(var9);
    java.net.SocketAddress var12 = var11.getRemoteSocketAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    java.net.SocketAddress var9 = var5.getSocketAddress();
    java.net.DatagramSocket var10 = new java.net.DatagramSocket(var9);
    var10.setBroadcast(false);
    int var13 = var10.getTrafficClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)(-1)};
    java.net.DatagramPacket var5 = new java.net.DatagramPacket(var3, 0);
    int var6 = var5.getLength();
    var5.setPort(0);
    java.net.SocketAddress var9 = var5.getSocketAddress();
    java.net.DatagramSocket var10 = new java.net.DatagramSocket(var9);
    var10.setBroadcast(false);
    int var13 = var10.getReceiveBufferSize();
    var10.setSendBufferSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 65507);

  }

}
