
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JScrollPane var2 = new javax.swing.JScrollPane(1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    var1.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    java.util.Enumeration var4 = var1.findResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    java.util.Enumeration var4 = var1.findResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = java.net.URLClassLoader.newInstance(var1);
    java.lang.ClassLoader var3 = var2.getParent();
    java.net.URLClassLoader var4 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var2);
    java.net.URL[] var5 = var4.getURLs();
    var4.setPackageAssertionStatus("", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Package var1 = java.lang.Package.getPackage("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 0);
    sun.rmi.transport.Channel var3 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 0);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:0]"+ "'", var3.equals("[:0]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URL var3 = var1.getResource("hi!");
    java.io.InputStream var5 = var1.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 0);
    sun.rmi.transport.Transport var3 = var2.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.ToolTipManager var0 = javax.swing.ToolTipManager.sharedInstance();
    boolean var1 = var0.isEnabled();
    boolean var2 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = java.net.URLClassLoader.newInstance(var1);
    java.lang.ClassLoader var3 = var2.getParent();
    java.net.URLClassLoader var4 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var2);
    java.net.URL[] var5 = var4.getURLs();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var5);
    var6.setPackageAssertionStatus("", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 0);
    java.rmi.server.RMIClientSocketFactory var3 = var2.getClientSocketFactory();
    java.lang.String var4 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("[:0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    javax.swing.JScrollPane var1 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var2 = var1.getVetoableChangeListeners();
    var1.repaint((-1L), (-1), 1, 1, 1);
    var0.setRowHeaderView((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    var0.repaint((-1L), (-1), 1, 1, 1);
    javax.swing.JScrollPane var8 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var9 = var8.getVetoableChangeListeners();
    var8.repaint((-1L), (-1), 1, 1, 1);
    java.awt.Component var16 = var0.add((java.awt.Component)var8);
    var8.repaint(0, 1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    var0.repaint((-1L), (-1), 1, 1, 1);
    javax.swing.JScrollPane var8 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var9 = var8.getVetoableChangeListeners();
    var8.repaint((-1L), (-1), 1, 1, 1);
    java.awt.Component var16 = var0.add((java.awt.Component)var8);
    boolean var17 = var0.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    var0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    java.awt.Insets var2 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    javax.swing.JScrollPane var2 = new javax.swing.JScrollPane((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    var0.repaint((-1L), (-1), 1, 1, 1);
    javax.swing.JScrollPane var8 = new javax.swing.JScrollPane();
    java.beans.VetoableChangeListener[] var9 = var8.getVetoableChangeListeners();
    var8.repaint((-1L), (-1), 1, 1, 1);
    java.awt.Component var16 = var0.add((java.awt.Component)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var18 = var0.getFocusTraversalKeys(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

}
