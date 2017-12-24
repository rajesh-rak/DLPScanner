
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    int var1 = var0.getLength();
    int var2 = var0.getLength();
    var0.readLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var2 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var3 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var4 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var2, (java.rmi.server.RMIServerSocketFactory)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var7 = var2.createSocket("hi!", 0);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getElement("");
    javax.swing.text.Position var4 = var0.createPosition((-1));
    int var5 = var0.getLength();
    javax.swing.text.Position var7 = var0.createPosition(10);
    javax.swing.text.Element[] var8 = var0.getRootElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var2 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var5 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var6 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var7 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var5, (java.rmi.server.RMIServerSocketFactory)var6);
    sun.rmi.transport.tcp.TCPEndpoint var8 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100, (java.rmi.server.RMIClientSocketFactory)var2, (java.rmi.server.RMIServerSocketFactory)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var11 = var2.createSocket("", 1);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getElement("");
    javax.swing.text.Position var4 = var0.createPosition((-1));
    int var5 = var0.getLength();
    javax.swing.text.Position var7 = var0.createPosition(10);
    javax.swing.text.Style var9 = var0.getStyle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.rmi.server.RMIFailureHandler var0 = java.rmi.server.RMISocketFactory.getFailureHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var2 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var3 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var4 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var2, (java.rmi.server.RMIServerSocketFactory)var3);
    java.lang.String var5 = var4.getHost();
    java.lang.String var6 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(1);
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    sun.rmi.transport.Transport var3 = var1.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    var0.setAsynchronousLoadPriority(10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(1);
    javax.swing.text.html.HTMLDocument var2 = new javax.swing.text.html.HTMLDocument();
    int var3 = var2.getLength();
    int var4 = var2.getLength();
    java.util.Enumeration var5 = var2.getStyleNames();
    boolean var6 = var1.remove((java.lang.Object)var2);
    javax.swing.text.Element var8 = var2.getParagraphElement(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.Element var2 = var0.getElement("");
    int var3 = var0.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var3 = var1.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    javax.swing.text.html.StyleSheet var1 = var0.getStyleSheet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    int var1 = var0.getLength();
    javax.swing.text.html.HTMLEditorKit.Parser var2 = var0.getParser();
    javax.swing.text.Position var3 = var0.getStartPosition();
    javax.swing.text.Position var4 = var0.getStartPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var4 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var7 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var8 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var9 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var7, (java.rmi.server.RMIServerSocketFactory)var8);
    sun.rmi.transport.tcp.TCPEndpoint var10 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100, (java.rmi.server.RMIClientSocketFactory)var4, (java.rmi.server.RMIServerSocketFactory)var8);
    sun.rmi.transport.proxy.RMIMasterSocketFactory var13 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var16 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var17 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var18 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var16, (java.rmi.server.RMIServerSocketFactory)var17);
    sun.rmi.transport.tcp.TCPEndpoint var19 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100, (java.rmi.server.RMIClientSocketFactory)var13, (java.rmi.server.RMIServerSocketFactory)var17);
    sun.rmi.transport.tcp.TCPEndpoint var20 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var4, (java.rmi.server.RMIServerSocketFactory)var13);
    java.rmi.server.RMIClientSocketFactory var21 = var20.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insertElementAt((java.lang.Object)' ', 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    int var1 = var0.getLength();
    javax.swing.text.html.HTMLEditorKit.Parser var2 = var0.getParser();
    javax.swing.text.Position var3 = var0.getStartPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.readUnlock();
      fail("Expected exception of type javax.swing.text.StateInvariantError");
    } catch (javax.swing.text.StateInvariantError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.subList(0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    java.lang.Object var2 = var0.getProperty((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.text.html.HTMLDocument var0 = new javax.swing.text.html.HTMLDocument();
    int var1 = var0.getLength();
    int var2 = var0.getLength();
    javax.swing.text.html.StyleSheet var3 = var0.getStyleSheet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var2 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var5 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.proxy.RMIMasterSocketFactory var6 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var7 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var5, (java.rmi.server.RMIServerSocketFactory)var6);
    java.lang.String var8 = var7.getHost();
    java.rmi.server.RMIServerSocketFactory var9 = var7.getServerSocketFactory();
    sun.rmi.transport.tcp.TCPEndpoint var10 = new sun.rmi.transport.tcp.TCPEndpoint("", 0, (java.rmi.server.RMIClientSocketFactory)var2, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
