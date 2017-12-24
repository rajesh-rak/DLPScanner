
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = java.rmi.server.RemoteServer.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    java.awt.Dimension var5 = var1.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var1.setToolTipText("hi!");
    java.lang.Object var11 = var1.getTreeLock();
    var1.setInheritsPopupMenu(false);
    javax.swing.border.Border var14 = var1.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    var1.setVerifyInputWhenFocusTarget(true);
    var1.setAlignmentY(10.0f);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var5.resetKeyboardActions();
    java.beans.PropertyChangeListener[] var11 = var5.getPropertyChangeListeners("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var13 = var5.getInputMap(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    var1.setAlignmentX(0.0f);
    int var7 = var1.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    java.awt.event.MouseWheelListener[] var5 = var1.getMouseWheelListeners();
    javax.swing.JPanel var7 = new javax.swing.JPanel(true);
    java.awt.Point var9 = var7.getMousePosition(true);
    javax.swing.JPanel var11 = new javax.swing.JPanel(true);
    java.awt.Point var13 = var11.getMousePosition(true);
    boolean var14 = var7.isFocusCycleRoot((java.awt.Container)var11);
    boolean var15 = var1.isFocusCycleRoot((java.awt.Container)var7);
    java.awt.image.ColorModel var16 = var7.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    var1.setVerifyInputWhenFocusTarget(true);
    float var4 = var1.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    var1.setFocusTraversalPolicyProvider(false);
    java.awt.Container var6 = var1.getFocusCycleRootAncestor();
    int var7 = var1.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var5.resetKeyboardActions();
    var5.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    java.awt.event.MouseWheelListener[] var5 = var1.getMouseWheelListeners();
    javax.swing.JPanel var7 = new javax.swing.JPanel(true);
    java.awt.Point var9 = var7.getMousePosition(true);
    javax.swing.JPanel var11 = new javax.swing.JPanel(true);
    java.awt.Point var13 = var11.getMousePosition(true);
    boolean var14 = var7.isFocusCycleRoot((java.awt.Container)var11);
    boolean var15 = var1.isFocusCycleRoot((java.awt.Container)var7);
    java.awt.event.MouseListener[] var16 = var1.getMouseListeners();
    var1.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var1.setToolTipText("hi!");
    java.lang.Object var11 = var1.getTreeLock();
    var1.setInheritsPopupMenu(false);
    boolean var14 = var1.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    java.awt.event.MouseWheelListener[] var5 = var1.getMouseWheelListeners();
    javax.swing.JPanel var7 = new javax.swing.JPanel(true);
    java.awt.Point var9 = var7.getMousePosition(true);
    javax.swing.JPanel var11 = new javax.swing.JPanel(true);
    java.awt.Point var13 = var11.getMousePosition(true);
    boolean var14 = var7.isFocusCycleRoot((java.awt.Container)var11);
    boolean var15 = var1.isFocusCycleRoot((java.awt.Container)var7);
    var7.show(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JPanel var0 = new javax.swing.JPanel();
    java.awt.Dimension var1 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    var1.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    java.awt.event.MouseWheelListener[] var5 = var1.getMouseWheelListeners();
    javax.swing.JPanel var7 = new javax.swing.JPanel(true);
    java.awt.Point var9 = var7.getMousePosition(true);
    javax.swing.JPanel var11 = new javax.swing.JPanel(true);
    java.awt.Point var13 = var11.getMousePosition(true);
    boolean var14 = var7.isFocusCycleRoot((java.awt.Container)var11);
    boolean var15 = var1.isFocusCycleRoot((java.awt.Container)var7);
    boolean var17 = var7.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    var1.setFocusTraversalPolicyProvider(false);
    java.awt.Container var6 = var1.getFocusCycleRootAncestor();
    var1.hide();
    var1.setAlignmentX(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var1.firePropertyChange("", 10.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    javax.swing.JPanel var3 = new javax.swing.JPanel(true);
    boolean var4 = var1.isAncestorOf((java.awt.Component)var3);
    var1.setAlignmentX(0.0f);
    var1.setName("");
    javax.swing.JPanel var10 = new javax.swing.JPanel(true);
    java.awt.Point var12 = var10.getMousePosition(true);
    javax.swing.JPanel var14 = new javax.swing.JPanel(true);
    java.awt.Point var16 = var14.getMousePosition(true);
    boolean var17 = var10.isFocusCycleRoot((java.awt.Container)var14);
    var10.setToolTipText("hi!");
    java.lang.Object var20 = var10.getTreeLock();
    var10.setInheritsPopupMenu(false);
    var1.setNextFocusableComponent((java.awt.Component)var10);
    java.awt.FocusTraversalPolicy var24 = var1.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    var1.setFocusTraversalPolicyProvider(false);
    java.awt.Container var6 = var1.getFocusCycleRootAncestor();
    var1.hide();
    java.awt.Color var8 = var1.getForeground();
    javax.swing.JPanel var10 = new javax.swing.JPanel(true);
    javax.swing.JPanel var12 = new javax.swing.JPanel(true);
    boolean var13 = var10.isAncestorOf((java.awt.Component)var12);
    java.awt.event.MouseWheelListener[] var14 = var10.getMouseWheelListeners();
    javax.swing.JPanel var16 = new javax.swing.JPanel(true);
    java.awt.Point var18 = var16.getMousePosition(true);
    javax.swing.JPanel var20 = new javax.swing.JPanel(true);
    java.awt.Point var22 = var20.getMousePosition(true);
    boolean var23 = var16.isFocusCycleRoot((java.awt.Container)var20);
    boolean var24 = var10.isFocusCycleRoot((java.awt.Container)var16);
    java.awt.event.MouseListener[] var25 = var10.getMouseListeners();
    var1.setNextFocusableComponent((java.awt.Component)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    var1.setFocusTraversalPolicyProvider(false);
    int var6 = var1.getY();
    java.awt.Container var7 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    java.awt.Component var1 = var0.getFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);
    java.awt.Point var3 = var1.getMousePosition(true);
    javax.swing.JPanel var5 = new javax.swing.JPanel(true);
    java.awt.Point var7 = var5.getMousePosition(true);
    boolean var8 = var1.isFocusCycleRoot((java.awt.Container)var5);
    var1.setToolTipText("hi!");
    java.lang.Object var11 = var1.getTreeLock();
    javax.swing.JPanel var13 = new javax.swing.JPanel(true);
    java.awt.Point var15 = var13.getMousePosition(true);
    javax.swing.JPanel var17 = new javax.swing.JPanel(true);
    java.awt.Point var19 = var17.getMousePosition(true);
    boolean var20 = var13.isFocusCycleRoot((java.awt.Container)var17);
    var13.setToolTipText("hi!");
    java.awt.Component var23 = var1.add((java.awt.Component)var13);
    java.awt.Cursor var24 = var23.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

}
