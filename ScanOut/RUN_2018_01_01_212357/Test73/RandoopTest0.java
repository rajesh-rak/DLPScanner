
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Frame var0 = new java.awt.Frame();
    boolean var1 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    var0.firePropertyChange("", '#', 'a');
    var0.move(1, 0);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    boolean var2 = var0.isMinimumSizeSet();
    boolean var3 = var0.isDoubleBuffered();
    boolean var4 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    java.awt.Dialog.ModalExclusionType var2 = var0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Frame var1 = new java.awt.Frame();
    java.awt.Insets var2 = var1.insets();
    java.util.Locale var3 = var1.getLocale();
    java.awt.event.KeyListener[] var4 = var1.getKeyListeners();
    var1.setFocusTraversalKeysEnabled(false);
    var1.setUndecorated(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var1, (java.lang.Object)0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    boolean var2 = var0.isMinimumSizeSet();
    boolean var3 = var0.isDoubleBuffered();
    var0.setVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var4 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    java.awt.Frame var2 = new java.awt.Frame();
    java.awt.Rectangle var3 = var2.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var3);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    boolean var2 = var0.isMinimumSizeSet();
    var0.show();
    java.awt.Frame var4 = new java.awt.Frame();
    java.awt.Insets var5 = var4.insets();
    var4.show(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var8 = var0.add((java.awt.Component)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Frame var0 = new java.awt.Frame();
    boolean var1 = var0.isValid();
    java.lang.String var2 = var0.getWarningString();
    var0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    java.util.Locale var2 = var0.getLocale();
    java.awt.event.HierarchyBoundsListener[] var3 = var0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    boolean var2 = var0.getIgnoreRepaint();
    java.awt.Frame var3 = new java.awt.Frame();
    java.awt.Rectangle var4 = var3.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var4);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Frame var0 = new java.awt.Frame();
    boolean var1 = var0.isValid();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Frame var0 = new java.awt.Frame();
    boolean var1 = var0.isPreferredSizeSet();
    java.awt.Dimension var2 = var0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    java.util.Locale var2 = var0.getLocale();
    java.awt.event.KeyListener[] var3 = var0.getKeyListeners();
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.Container var6 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Frame var0 = new java.awt.Frame();
    boolean var1 = var0.isValid();
    java.lang.String var2 = var0.getWarningString();
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    boolean var4 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    java.util.Locale var2 = var0.getLocale();
    java.awt.event.KeyListener[] var3 = var0.getKeyListeners();
    java.lang.Object var4 = var0.getTreeLock();
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    boolean var2 = var0.isMinimumSizeSet();
    java.awt.Frame var3 = new java.awt.Frame();
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = var3.isMinimumSizeSet();
    boolean var6 = var3.isDoubleBuffered();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    var0.firePropertyChange("", '#', 'a');
    java.awt.Frame var8 = new java.awt.Frame();
    java.awt.Rectangle var9 = var8.getBounds();
    java.awt.Rectangle var10 = var0.getBounds(var9);
    java.awt.Frame var11 = new java.awt.Frame();
    boolean var12 = var11.isValid();
    java.lang.String var13 = var11.getWarningString();
    boolean var14 = var0.isFocusCycleRoot((java.awt.Container)var11);
    java.awt.FocusTraversalPolicy var15 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    var0.show(false);
    var0.firePropertyChange("", '#', 'a');
    java.awt.Frame var8 = new java.awt.Frame();
    java.awt.Rectangle var9 = var8.getBounds();
    java.awt.Rectangle var10 = var0.getBounds(var9);
    java.awt.Frame var11 = new java.awt.Frame();
    java.awt.Insets var12 = var11.insets();
    var11.show(false);
    var11.firePropertyChange("", '#', 'a');
    java.awt.Frame var19 = new java.awt.Frame();
    java.awt.Rectangle var20 = var19.getBounds();
    java.awt.Rectangle var21 = var11.getBounds(var20);
    java.awt.Rectangle var22 = var0.getBounds(var21);
    java.awt.Image var23 = var0.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Insets var1 = var0.insets();
    java.util.Locale var2 = var0.getLocale();
    boolean var3 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Frame var0 = new java.awt.Frame();
    java.awt.Rectangle var1 = var0.getBounds();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
