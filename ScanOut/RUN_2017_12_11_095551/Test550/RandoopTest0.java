
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = java.awt.EventQueue.isDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JInternalFrame var3 = new javax.swing.JInternalFrame("", false, false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.event.HierarchyListener[] var2 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.lang.String var3 = var2.toString();
    java.rmi.server.RMIClientSocketFactory var4 = var2.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:100]"+ "'", var3.equals("[:100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Dimension var2 = var0.size();
    java.awt.Dimension var3 = var0.preferredSize();
    int var4 = var0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    boolean var3 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.rmi.server.RMIServerSocketFactory var3 = var2.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    var0.setFocusCycleRoot(true);
    java.beans.PropertyChangeListener[] var5 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    java.awt.Rectangle var2 = var0.bounds();
    java.awt.Insets var3 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    boolean var2 = var0.isLightweight();
    var0.setLocation(1, (-1));
    java.awt.Container var6 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var7 = var6.getPropertyChangeListeners();
    java.awt.Dimension var8 = var6.size();
    java.awt.Component var10 = var0.add((java.awt.Component)var6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.resize(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.repaint(100L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Insets var2 = var0.insets();
    java.awt.Component var5 = var0.findComponentAt((-1), 1);
    boolean var6 = var0.isFocusTraversalPolicySet();
    java.awt.Container var7 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var8 = var7.getPropertyChangeListeners();
    java.awt.Insets var9 = var7.insets();
    java.awt.Container var10 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var11 = var10.getPropertyChangeListeners();
    java.awt.Dimension var12 = var10.size();
    java.awt.Dimension var13 = var10.preferredSize();
    var7.remove((java.awt.Component)var10);
    java.awt.Component var17 = var10.findComponentAt(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var19 = var0.add((java.awt.Component)var10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Insets var2 = var0.insets();
    java.awt.Container var3 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var4 = var3.getPropertyChangeListeners();
    java.awt.Dimension var5 = var3.size();
    java.awt.Dimension var6 = var3.preferredSize();
    var0.remove((java.awt.Component)var3);
    java.awt.Component var10 = var3.findComponentAt(10, 1);
    java.awt.Insets var11 = var3.getInsets();
    java.awt.Toolkit var12 = var3.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    java.awt.Container var2 = new java.awt.Container();
    var2.show();
    java.awt.Rectangle var4 = var2.bounds();
    java.awt.Rectangle var5 = var0.getBounds(var4);
    var0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Insets var2 = var0.insets();
    java.awt.Component var5 = var0.findComponentAt((-1), 1);
    java.awt.event.ComponentListener[] var6 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.lang.String var3 = var2.toString();
    java.rmi.server.RMIServerSocketFactory var4 = var2.getServerSocketFactory();
    boolean var6 = var2.equals((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:100]"+ "'", var3.equals("[:100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Dimension var2 = var0.size();
    java.awt.event.MouseMotionListener[] var3 = var0.getMouseMotionListeners();
    boolean var6 = var0.inside(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    java.awt.Container var2 = new java.awt.Container();
    var2.show();
    java.awt.Rectangle var4 = var2.bounds();
    java.awt.Rectangle var5 = var0.getBounds(var4);
    var0.setSize((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    boolean var2 = var0.isLightweight();
    var0.setIgnoreRepaint(true);
    int var5 = var0.getX();
    java.awt.Container var6 = new java.awt.Container();
    var6.show();
    var0.add((java.awt.Component)var6, (java.lang.Object)0L);
    java.beans.PropertyChangeListener[] var10 = var0.getPropertyChangeListeners();
    boolean var11 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    java.awt.Insets var2 = var0.insets();
    java.awt.Container var3 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var4 = var3.getPropertyChangeListeners();
    java.awt.Dimension var5 = var3.size();
    java.awt.Dimension var6 = var3.preferredSize();
    var0.remove((java.awt.Component)var3);
    var3.layout();
    java.awt.Dimension var9 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();
    boolean var2 = var0.isLightweight();
    var0.setIgnoreRepaint(true);
    int var5 = var0.getX();
    java.awt.Container var6 = new java.awt.Container();
    var6.show();
    var0.add((java.awt.Component)var6, (java.lang.Object)0L);
    java.beans.PropertyChangeListener[] var10 = var0.getPropertyChangeListeners();
    var0.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
