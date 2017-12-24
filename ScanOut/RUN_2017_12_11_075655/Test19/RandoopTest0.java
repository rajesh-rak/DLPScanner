
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 0, 100);
    var4.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(0, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var3 = com.sun.jmx.snmp.daemon.SnmpAdaptorServer.mapErrorStatus(0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    int var4 = var0.getPort();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setReceiveBufferSize((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getReuseAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    int var4 = var0.getPort();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTrafficClass((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.getReuseAddress();
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    int var4 = var0.getPort();
    java.net.SocketAddress var5 = var0.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var6 = new java.net.DatagramSocket(var5);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setReceiveBufferSize(10);
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.isConnected();
    int var3 = var0.getTrafficClass();
    int var4 = var0.getReceiveBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    var0.close();
    int var5 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(100);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    java.net.InetAddress var4 = var0.getLocalAddress();
    int var5 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    int var4 = var0.getPort();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSendBufferSize(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    var0.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    java.net.DatagramSocket var2 = new java.net.DatagramSocket();
    var2.setSendBufferSize(1);
    int var5 = var2.getReceiveBufferSize();
    int var6 = var2.getPort();
    java.net.SocketAddress var7 = var2.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bind(var7);
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.disconnect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    var0.close();
    boolean var5 = var0.isConnected();
    java.net.SocketAddress var6 = var0.getRemoteSocketAddress();
    java.net.DatagramSocket var7 = new java.net.DatagramSocket();
    var7.setSendBufferSize(1);
    int var10 = var7.getReceiveBufferSize();
    int var11 = var7.getPort();
    java.net.SocketAddress var12 = var7.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bind(var12);
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    int var4 = var0.getPort();
    boolean var5 = var0.getBroadcast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.setSendBufferSize(1);
    int var3 = var0.getReceiveBufferSize();
    java.net.InetAddress var4 = var0.getLocalAddress();
    var0.setReuseAddress(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
