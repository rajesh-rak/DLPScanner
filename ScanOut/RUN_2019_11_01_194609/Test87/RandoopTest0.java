
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIServerSocketFactory var2 = var1.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.net.URL var5 = var3.findResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.toString();
    boolean var4 = var1.equals((java.lang.Object)10);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[127.0.0.1:-1]"+ "'", var2.equals("[127.0.0.1:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[127.0.0.1:-1]"+ "'", var5.equals("[127.0.0.1:-1]"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.net.URL var7 = var4.getResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.util.Enumeration var7 = var5.getResources("");
    java.util.Enumeration var9 = var5.findResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    sun.rmi.transport.Channel var2 = var1.getChannel();
    boolean var4 = var1.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    boolean var3 = var1.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.util.Enumeration var7 = var5.getResources("");
    var5.clearAssertionStatus();
    java.net.URL[] var9 = var5.getURLs();
    java.net.URL[] var10 = new java.net.URL[] { };
    java.lang.ClassLoader var11 = java.lang.ClassLoader.getSystemClassLoader();
    var11.clearAssertionStatus();
    java.net.URLClassLoader var13 = new java.net.URLClassLoader(var10, var11);
    java.lang.ClassLoader var14 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var15 = new java.net.URLClassLoader(var10, var14);
    java.util.Enumeration var17 = var15.getResources("");
    var15.clearAssertionStatus();
    java.net.URL[] var19 = var15.getURLs();
    java.io.InputStream var21 = var15.getResourceAsStream("hi!");
    java.net.URLClassLoader var22 = new java.net.URLClassLoader(var9, (java.lang.ClassLoader)var15);
    var22.setDefaultAssertionStatus(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var26 = var22.loadClass("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.util.Enumeration var7 = var5.getResources("");
    var5.clearAssertionStatus();
    java.net.URL[] var9 = var5.getURLs();
    java.net.URL[] var10 = new java.net.URL[] { };
    java.lang.ClassLoader var11 = java.lang.ClassLoader.getSystemClassLoader();
    var11.clearAssertionStatus();
    java.net.URLClassLoader var13 = new java.net.URLClassLoader(var10, var11);
    java.lang.ClassLoader var14 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var15 = new java.net.URLClassLoader(var10, var14);
    java.util.Enumeration var17 = var15.getResources("");
    var15.clearAssertionStatus();
    java.net.URL[] var19 = var15.getURLs();
    java.io.InputStream var21 = var15.getResourceAsStream("hi!");
    java.net.URLClassLoader var22 = new java.net.URLClassLoader(var9, (java.lang.ClassLoader)var15);
    java.util.Enumeration var24 = var22.findResources("[127.0.0.1:-1]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.net.URL var5 = var3.getResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.util.Enumeration var7 = var5.getResources("");
    var5.clearAssertionStatus();
    java.net.URL[] var9 = var5.getURLs();
    java.net.URL[] var10 = new java.net.URL[] { };
    java.lang.ClassLoader var11 = java.lang.ClassLoader.getSystemClassLoader();
    var11.clearAssertionStatus();
    java.net.URLClassLoader var13 = new java.net.URLClassLoader(var10, var11);
    java.lang.ClassLoader var14 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var15 = new java.net.URLClassLoader(var10, var14);
    java.util.Enumeration var17 = var15.getResources("");
    var15.clearAssertionStatus();
    java.net.URL[] var19 = var15.getURLs();
    java.io.InputStream var21 = var15.getResourceAsStream("hi!");
    java.net.URLClassLoader var22 = new java.net.URLClassLoader(var9, (java.lang.ClassLoader)var15);
    var22.setDefaultAssertionStatus(true);
    java.net.URL var26 = var22.findResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.ToolTipManager var0 = javax.swing.ToolTipManager.sharedInstance();
    boolean var1 = var0.isLightWeightPopupEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.ToolTipManager var0 = javax.swing.ToolTipManager.sharedInstance();
    boolean var1 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var0 = java.awt.EventQueue.isDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    boolean var3 = var1.equals((java.lang.Object)"[127.0.0.1:-1]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    var5.setDefaultAssertionStatus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.PopupFactory var0 = new javax.swing.PopupFactory();
    javax.swing.PopupFactory.setSharedInstance(var0);
    javax.swing.PopupFactory.setSharedInstance(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    var1.clearAssertionStatus();
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, var1);
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var0, var4);
    java.util.Enumeration var7 = var5.getResources("");
    var5.clearAssertionStatus();
    java.io.InputStream var10 = var5.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1572618466193L);

  }

}
