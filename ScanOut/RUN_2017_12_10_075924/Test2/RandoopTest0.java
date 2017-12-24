
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var2 = new java.net.Socket("", 1);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.Socket var0 = new java.net.Socket();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var1 = var0.getInputStream();
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.shutdownInput();
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    var0.setReceiveBufferSize(10);
    var0.setSoTimeout(0);
    int var7 = var0.getSoTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.OutputStream var4 = var0.getOutputStream();
      fail("Expected exception of type java.net.SocketException");
    } catch (java.net.SocketException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTrafficClass(1);
    java.net.InetAddress var4 = var0.getInetAddress();
    java.nio.channels.SocketChannel var5 = var0.getChannel();
    boolean var6 = var0.isBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTcpNoDelay(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    var0.setOOBInline(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSoLinger(true, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    boolean var6 = var0.isClosed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTrafficClass(1);
    java.net.InetAddress var4 = var0.getInetAddress();
    var0.setTcpNoDelay(true);
    var0.setReceiveBufferSize(100);
    var0.setSoLinger(true, 10);
    java.net.InetAddress var12 = var0.getInetAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    var0.setOOBInline(true);
    java.nio.channels.SocketChannel var8 = var0.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    int var3 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    boolean var3 = var0.isOutputShutdown();
    int var4 = var0.getSoLinger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    boolean var3 = var0.isOutputShutdown();
    var0.setKeepAlive(true);
    boolean var6 = var0.getOOBInline();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    int var6 = var0.getLocalPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    java.nio.channels.SocketChannel var3 = var0.getChannel();
    int var4 = var0.getSoLinger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    boolean var6 = var0.getKeepAlive();
    var0.setReceiveBufferSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTrafficClass(1);
    java.net.InetAddress var4 = var0.getInetAddress();
    var0.setTcpNoDelay(true);
    var0.setReceiveBufferSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    java.nio.channels.SocketChannel var3 = var0.getChannel();
    var0.setKeepAlive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTrafficClass(1);
    java.net.InetAddress var4 = var0.getInetAddress();
    var0.setTcpNoDelay(true);
    int var7 = var0.getSoTimeout();
    java.net.InetAddress var8 = var0.getInetAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSoTimeout((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setOOBInline(true);
    var0.setOOBInline(false);
    boolean var6 = var0.getTcpNoDelay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    boolean var2 = var0.getTcpNoDelay();
    java.nio.channels.SocketChannel var3 = var0.getChannel();
    int var4 = var0.getSoTimeout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.Socket var0 = new java.net.Socket();
    java.net.InetAddress var1 = var0.getInetAddress();
    var0.setTrafficClass(1);
    java.net.InetAddress var4 = var0.getInetAddress();
    java.nio.channels.SocketChannel var5 = var0.getChannel();
    boolean var6 = var0.getReuseAddress();
    boolean var7 = var0.isInputShutdown();
    boolean var8 = var0.isConnected();
    int var9 = var0.getReceiveBufferSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 131072);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.Socket var0 = new java.net.Socket();
    java.nio.channels.SocketChannel var1 = var0.getChannel();
    var0.setOOBInline(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
