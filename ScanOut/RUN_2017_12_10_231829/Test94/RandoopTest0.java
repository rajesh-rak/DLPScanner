
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    int var6 = var4.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setHorizontalAlignment((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    java.awt.Dimension var3 = var1.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.repaint((-1), 100, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    java.lang.String var1 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "SeparatorUI"+ "'", var1.equals("SeparatorUI"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.repaint();
    java.awt.Dimension var7 = var4.getMinimumSize();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    float var7 = var4.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    boolean var7 = var4.isFocusOwner();
    java.awt.Dimension var8 = var4.getMinimumSize();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    javax.swing.Icon var2 = var1.getRolloverIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    int var1 = var0.getOrientation();
    boolean var2 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    java.awt.Point var5 = var4.getLocation();
    javax.swing.JButton var7 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var5, (java.awt.Component)var7);
    var7.revalidate();
    boolean var10 = var7.isFocusOwner();
    java.awt.Graphics var11 = var7.getGraphics();
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    boolean var7 = var4.isFocusOwner();
    java.awt.Graphics var8 = var4.getGraphics();
    long var9 = var4.getMultiClickThreshhold();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    javax.swing.JToolTip var1 = var0.createToolTip();
    var0.firePropertyChange("SeparatorUI", (byte)1, (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    boolean var7 = var4.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    boolean var7 = var4.isFocusOwner();
    java.awt.Graphics var8 = var4.getGraphics();
    java.lang.Object var9 = var4.getTreeLock();
    var4.setFocusPainted(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    boolean var2 = var1.isFocusable();
    var1.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    javax.swing.JToolTip var1 = var0.createToolTip();
    javax.swing.event.AncestorListener[] var2 = var1.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    int var1 = var0.getOrientation();
    java.lang.Object var2 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    java.awt.GraphicsConfiguration var7 = var4.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JScrollBar var0 = new javax.swing.JScrollBar();
    javax.swing.BoundedRangeModel var1 = var0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JSeparator var1 = new javax.swing.JSeparator(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.plaf.synth.SynthComboBoxUI var0 = new javax.swing.plaf.synth.SynthComboBoxUI();
    javax.swing.JButton var2 = new javax.swing.JButton("hi!");
    boolean var3 = var2.isFocusable();
    javax.accessibility.Accessible var5 = var0.getAccessibleChild((javax.swing.JComponent)var2, 0);
    var0.configureArrowButton();
    javax.swing.JSeparator var7 = new javax.swing.JSeparator();
    javax.swing.JToolTip var8 = var7.createToolTip();
    int var9 = var0.getAccessibleChildrenCount((javax.swing.JComponent)var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    java.awt.Window var6 = javax.swing.SwingUtilities.windowForComponent((java.awt.Component)var4);
    var4.resetKeyboardActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.JButton var1 = new javax.swing.JButton("hi!");
    java.awt.Point var2 = var1.getLocation();
    javax.swing.JButton var4 = new javax.swing.JButton("hi!");
    javax.swing.SwingUtilities.convertPointFromScreen(var2, (java.awt.Component)var4);
    var4.revalidate();
    boolean var7 = var4.isFocusOwner();
    java.awt.Graphics var8 = var4.getGraphics();
    java.lang.Object var9 = var4.getTreeLock();
    int var10 = var4.getHorizontalTextPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.swing.JMenuItem var1 = new javax.swing.JMenuItem("hi!");
    boolean var2 = var1.isArmed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
