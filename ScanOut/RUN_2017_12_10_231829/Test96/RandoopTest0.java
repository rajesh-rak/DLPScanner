
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.beans.PropertyChangeListener[] var0 = javax.swing.UIManager.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = javax.swing.UIManager.getString((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var0 = javax.swing.UIManager.getCrossPlatformLookAndFeelClassName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "javax.swing.plaf.metal.MetalLookAndFeel"+ "'", var0.equals("javax.swing.plaf.metal.MetalLookAndFeel"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 10.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object var2 = javax.swing.UIManager.put((java.lang.Object)10L, (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)(byte)0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    sun.rmi.transport.Transport var3 = var2.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    java.awt.Component.BaselineResizeBehavior var1 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    boolean var2 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.LayoutManager var3 = var0.getLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.areFocusTraversalKeysSet(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.util.Locale var3 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    boolean var3 = var0.areFocusTraversalKeysSet(1);
    boolean var4 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    boolean var5 = var0.contains((-1), 1);
    int var8 = var0.getBaseline(10, 1);
    java.util.Locale var9 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.Container var2 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    boolean var5 = var0.contains((-1), 1);
    javax.swing.JRootPane var6 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var7 = javax.swing.UIManager.getUI((javax.swing.JComponent)var6);
    java.awt.peer.ComponentPeer var8 = var6.getPeer();
    boolean var11 = var6.contains((-1), 1);
    var0.setContentPane((java.awt.Container)var6);
    boolean var13 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    boolean var5 = var0.contains((-1), 1);
    javax.swing.JRootPane var6 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var7 = javax.swing.UIManager.getUI((javax.swing.JComponent)var6);
    java.awt.peer.ComponentPeer var8 = var6.getPeer();
    boolean var11 = var6.contains((-1), 1);
    var0.setContentPane((java.awt.Container)var6);
    boolean var15 = var0.contains(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.grabFocus();
    javax.accessibility.AccessibleContext var5 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    boolean var5 = var0.contains((-1), 1);
    javax.swing.JRootPane var6 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var7 = javax.swing.UIManager.getUI((javax.swing.JComponent)var6);
    java.awt.peer.ComponentPeer var8 = var6.getPeer();
    boolean var11 = var6.contains((-1), 1);
    var0.setContentPane((java.awt.Container)var6);
    float var13 = var6.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.LayoutManager var3 = var0.getLayout();
    javax.swing.JRootPane var4 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var5 = javax.swing.UIManager.getUI((javax.swing.JComponent)var4);
    java.awt.peer.ComponentPeer var6 = var4.getPeer();
    boolean var9 = var4.contains((-1), 1);
    javax.swing.JRootPane var10 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var11 = javax.swing.UIManager.getUI((javax.swing.JComponent)var10);
    java.awt.peer.ComponentPeer var12 = var10.getPeer();
    boolean var15 = var10.contains((-1), 1);
    var4.setContentPane((java.awt.Container)var10);
    sun.rmi.transport.tcp.TCPEndpoint var19 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    int var20 = var19.getListenPort();
    var0.add((java.awt.Component)var10, (java.lang.Object)var19);
    boolean var23 = var10.areFocusTraversalKeysSet(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    var0.hide();
    var0.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.LayoutManager var3 = var0.getLayout();
    javax.swing.JPanel var5 = new javax.swing.JPanel(var3, true);
    boolean var6 = var5.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "hi!", var2, "", 1);
    javax.management.MBeanParameterInfo[] var6 = var5.getSignature();
    javax.management.MBeanParameterInfo[] var9 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var9, "", 1);
    java.lang.Object var13 = var12.clone();
    boolean var14 = var5.equals(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    javax.swing.plaf.ComponentUI var1 = javax.swing.UIManager.getUI((javax.swing.JComponent)var0);
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.LayoutManager var3 = var0.getLayout();
    java.lang.String var4 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
