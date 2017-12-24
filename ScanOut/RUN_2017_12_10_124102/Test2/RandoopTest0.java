
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var3 = new java.net.DatagramPacket(var0, 1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var1 = new java.net.DatagramSocket(1);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    byte[] var15 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var17 = new java.net.DatagramSocket();
    boolean var18 = var17.isConnected();
    var17.disconnect();
    var17.setReuseAddress(true);
    java.net.SocketAddress var22 = var17.getLocalSocketAddress();
    java.net.DatagramPacket var23 = new java.net.DatagramPacket(var15, 1, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setData(var15, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    var0.setTrafficClass(0);
    int var4 = var0.getTrafficClass();
    boolean var5 = var0.isBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    boolean var2 = var0.getBroadcast();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    var0.disconnect();
    var0.setReuseAddress(true);
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.bind(var10);
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getReceiveBufferSize();
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    boolean var4 = var3.isConnected();
    var3.disconnect();
    var3.setReuseAddress(true);
    java.net.SocketAddress var8 = var3.getLocalSocketAddress();
    var0.connect(var8);
    byte[] var13 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var15 = new java.net.DatagramSocket();
    boolean var16 = var15.isConnected();
    var15.disconnect();
    var15.setReuseAddress(true);
    java.net.SocketAddress var20 = var15.getLocalSocketAddress();
    java.net.DatagramPacket var21 = new java.net.DatagramPacket(var13, 1, var20);
    java.net.SocketAddress var22 = var21.getSocketAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.send(var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    java.net.SocketAddress var12 = var11.getSocketAddress();
    byte[] var16 = new byte[] { (byte)10, (byte)0, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setData(var16, 65507, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    java.net.SocketAddress var12 = var11.getSocketAddress();
    byte[] var13 = var11.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var16 = new java.net.DatagramPacket(var13, 61234, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    var0.disconnect();
    var0.setReuseAddress(true);
    java.net.SocketAddress var5 = var0.getLocalSocketAddress();
    java.net.SocketAddress var6 = var0.getRemoteSocketAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramSocket var12 = new java.net.DatagramSocket(var10);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getReceiveBufferSize();
    int var3 = var0.getSendBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 65507);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    int var12 = var11.getOffset();
    int var13 = var11.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    var0.disconnect();
    boolean var3 = var0.isBound();
    int var4 = var0.getSendBufferSize();
    int var5 = var0.getReceiveBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 65507);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getLocalPort();
    boolean var3 = var0.isBound();
    int var4 = var0.getSendBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 61259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 65507);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    java.net.SocketAddress var12 = var11.getSocketAddress();
    byte[] var13 = var11.getData();
    java.net.DatagramSocket var15 = new java.net.DatagramSocket();
    boolean var16 = var15.isBound();
    int var17 = var15.getReceiveBufferSize();
    java.net.DatagramSocket var18 = new java.net.DatagramSocket();
    boolean var19 = var18.isConnected();
    var18.disconnect();
    var18.setReuseAddress(true);
    java.net.SocketAddress var23 = var18.getLocalSocketAddress();
    var15.connect(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var25 = new java.net.DatagramPacket(var13, 65507, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getReceiveBufferSize();
    var0.setReuseAddress(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    var0.disconnect();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    byte[] var15 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var17 = new java.net.DatagramSocket();
    boolean var18 = var17.isConnected();
    var17.disconnect();
    var17.setReuseAddress(true);
    java.net.SocketAddress var22 = var17.getLocalSocketAddress();
    java.net.DatagramPacket var23 = new java.net.DatagramPacket(var15, 1, var22);
    var11.setData(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.net.DatagramSocket var5 = new java.net.DatagramSocket();
    boolean var6 = var5.isConnected();
    var5.disconnect();
    var5.setReuseAddress(true);
    java.net.SocketAddress var10 = var5.getLocalSocketAddress();
    java.net.DatagramPacket var11 = new java.net.DatagramPacket(var3, 1, var10);
    java.net.SocketAddress var12 = var11.getSocketAddress();
    var11.setPort(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.dns.DnsClient var4 = new com.sun.jndi.dns.DnsClient(var1, (-1), 100);
      fail("Expected exception of type javax.naming.ConfigurationException");
    } catch (javax.naming.ConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getReceiveBufferSize();
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    boolean var4 = var3.isConnected();
    var3.disconnect();
    var3.setReuseAddress(true);
    java.net.SocketAddress var8 = var3.getLocalSocketAddress();
    var0.connect(var8);
    int var10 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 61270);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var1 = new byte[] { (byte)100};
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    boolean var4 = var3.isConnected();
    var3.disconnect();
    var3.setReuseAddress(true);
    java.net.SocketAddress var8 = var3.getLocalSocketAddress();
    java.net.DatagramPacket var9 = new java.net.DatagramPacket(var1, 1, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isConnected();
    var0.setTrafficClass(0);
    int var4 = var0.getSoTimeout();
    java.net.SocketAddress var5 = var0.getRemoteSocketAddress();
    boolean var6 = var0.isClosed();
    java.net.InetAddress var7 = var0.getInetAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.DatagramSocket var0 = new java.net.DatagramSocket();
    boolean var1 = var0.isBound();
    int var2 = var0.getReceiveBufferSize();
    java.net.DatagramSocket var3 = new java.net.DatagramSocket();
    boolean var4 = var3.isConnected();
    var3.disconnect();
    var3.setReuseAddress(true);
    java.net.SocketAddress var8 = var3.getLocalSocketAddress();
    var0.connect(var8);
    var0.setTrafficClass(10);
    int var12 = var0.getTrafficClass();
    boolean var13 = var0.isBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    byte[] var1 = new byte[] { (byte)10};
    java.net.DatagramSocket var4 = new java.net.DatagramSocket();
    boolean var5 = var4.isBound();
    int var6 = var4.getReceiveBufferSize();
    java.net.DatagramSocket var7 = new java.net.DatagramSocket();
    boolean var8 = var7.isConnected();
    var7.disconnect();
    var7.setReuseAddress(true);
    java.net.SocketAddress var12 = var7.getLocalSocketAddress();
    var4.connect(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.DatagramPacket var14 = new java.net.DatagramPacket(var1, 0, 61270, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 65507);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
