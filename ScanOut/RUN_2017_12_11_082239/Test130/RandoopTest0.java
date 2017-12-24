
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 10, 65507);
      fail("Expected exception of type javax.naming.ConfigurationException");
    } catch (javax.naming.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var4 = new java.net.DatagramPacket(var1, 55945, 65507);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    var0.setReuseAddress(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55949);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    boolean var2 = var0.getReuseAddress();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    int var4 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getSendBufferSize();
    java.net.SocketAddress var3 = var0.getRemoteSocketAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var0 = new byte[] { };
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    int var4 = var3.getSendBufferSize();
    boolean var5 = var3.getReuseAddress();
    int var6 = var3.getTrafficClass();
    java.net.InetAddress var7 = var3.getLocalAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var9 = new java.net.DatagramPacket(var0, 55946, 100, var7, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    boolean var2 = var0.getReuseAddress();
    var0.setSoTimeout(55945);
    var0.setTrafficClass(1);
    java.net.InetAddress var7 = var0.getLocalAddress();
    java.net.SocketAddress var8 = var0.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var9 = new java.net.DatagramSocket(var8);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var0, 65507, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    int var3 = var0.getLocalPort();
    boolean var4 = var0.isBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55964);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 55964);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getSendBufferSize();
    var0.setReceiveBufferSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(10);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    int var3 = var0.getLocalPort();
    int var4 = var0.getSoTimeout();
    java.nio.channels.DatagramChannel var5 = var0.getChannel();
    int var6 = var0.getSendBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55967);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 55967);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 65507);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.getBroadcast();
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55968);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(55967);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    boolean var4 = var0.isConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55969);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(55946, 100, 55949);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.DatagramSocket var1 = new java.net.DatagramSocket();
    int var2 = var1.getSendBufferSize();
    boolean var3 = var1.getReuseAddress();
    int var4 = var1.getTrafficClass();
    java.net.InetAddress var5 = var1.getLocalAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var6 = new java.net.DatagramSocket(100, var5);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    boolean var2 = var0.getReuseAddress();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    boolean var4 = var0.isClosed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    var0.setSoTimeout(1);
    var0.setReceiveBufferSize(55948);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55974);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    var0.setSoTimeout(55944);
    var0.setSendBufferSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    var0.setSoTimeout(1);
    int var5 = var0.getTrafficClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55976);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var0, 5, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    boolean var2 = var0.getReuseAddress();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    int var4 = var0.getSoTimeout();
    var0.setTrafficClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.DatagramSocket var2 = new java.net.DatagramSocket();
    int var3 = var2.getSendBufferSize();
    boolean var4 = var2.getReuseAddress();
    var2.setSoTimeout(55945);
    var2.setTrafficClass(1);
    java.net.InetAddress var9 = var2.getLocalAddress();
    com.sun.jmx.snmp.daemon.SnmpAdaptorServer var10 = new com.sun.jmx.snmp.daemon.SnmpAdaptorServer(false, 55949, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    int var1 = var0.getSendBufferSize();
    int var2 = var0.getLocalPort();
    java.nio.channels.DatagramChannel var3 = var0.getChannel();
    int var4 = var0.getSendBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55979);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);

  }

}
