
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Container var0 = new java.awt.Container();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var1 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Graphics var3 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Graphics var1 = var0.getGraphics();
    java.awt.event.MouseWheelListener[] var2 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.event.ContainerListener[] var2 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    boolean var2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.Container var3 = new java.awt.Container();
    java.awt.event.ComponentListener[] var4 = var3.getComponentListeners();
    java.awt.Insets var5 = var3.getInsets();
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Graphics var7 = var6.getGraphics();
    java.awt.Component var8 = var3.add((java.awt.Component)var6);
    java.awt.Component var9 = var0.add((java.awt.Component)var3);
    boolean var10 = var3.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Graphics var4 = var3.getGraphics();
    java.awt.Component var5 = var0.add((java.awt.Component)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var7 = var3.getMousePosition(false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Graphics var1 = var0.getGraphics();
    java.awt.Component.BaselineResizeBehavior var2 = var0.getBaselineResizeBehavior();
    boolean var3 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    boolean var3 = var0.isMinimumSizeSet();
    var0.setEnabled(true);
    java.awt.Toolkit var6 = var0.getToolkit();
    var0.resize(100, 100);
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    boolean var3 = var0.isMinimumSizeSet();
    java.awt.Container var5 = new java.awt.Container();
    java.awt.event.ComponentListener[] var6 = var5.getComponentListeners();
    java.awt.Component var7 = var0.add("", (java.awt.Component)var5);
    boolean var8 = var0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    var0.setFocusCycleRoot(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Toolkit var2 = var0.getToolkit();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    var0.setFocusTraversalPolicyProvider(false);
    java.awt.FocusTraversalPolicy var6 = var0.getFocusTraversalPolicy();
    var0.show(true);
    var0.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    boolean var3 = var0.isMinimumSizeSet();
    var0.setEnabled(true);
    java.awt.Toolkit var6 = var0.getToolkit();
    var0.resize(100, 100);
    java.awt.Container var10 = new java.awt.Container();
    java.awt.event.ComponentListener[] var11 = var10.getComponentListeners();
    java.awt.Insets var12 = var10.getInsets();
    boolean var13 = var10.isMinimumSizeSet();
    java.awt.Dimension var14 = var10.getMaximumSize();
    var0.setMinimumSize(var14);
    boolean var18 = var0.contains(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    boolean var2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.Container var3 = new java.awt.Container();
    java.awt.event.ComponentListener[] var4 = var3.getComponentListeners();
    java.awt.Insets var5 = var3.getInsets();
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Graphics var7 = var6.getGraphics();
    java.awt.Component var8 = var3.add((java.awt.Component)var6);
    java.awt.Component var9 = var0.add((java.awt.Component)var3);
    java.awt.Color var10 = var9.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    boolean var2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    boolean var3 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    boolean var2 = var0.hasFocus();
    boolean var3 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    var0.setFocusCycleRoot(false);
    java.awt.Container var5 = new java.awt.Container();
    java.awt.event.ComponentListener[] var6 = var5.getComponentListeners();
    java.awt.Insets var7 = var5.getInsets();
    var5.setFocusCycleRoot(true);
    java.awt.event.FocusListener[] var10 = var5.getFocusListeners();
    java.awt.Component var11 = var0.add((java.awt.Component)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Container var3 = new java.awt.Container();
    java.awt.Graphics var4 = var3.getGraphics();
    java.awt.Component var5 = var0.add((java.awt.Component)var3);
    int var6 = var3.getHeight();
    java.awt.event.ContainerListener[] var7 = var3.getContainerListeners();
    boolean var8 = var3.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    java.awt.Toolkit var2 = var0.getToolkit();
    boolean var3 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.event.ComponentListener[] var1 = var0.getComponentListeners();
    boolean var2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.Container var3 = new java.awt.Container();
    java.awt.event.ComponentListener[] var4 = var3.getComponentListeners();
    java.awt.Insets var5 = var3.getInsets();
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Graphics var7 = var6.getGraphics();
    java.awt.Component var8 = var3.add((java.awt.Component)var6);
    java.awt.Component var9 = var0.add((java.awt.Component)var3);
    java.awt.Container var10 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

}
