
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1514901350945L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.AWTEvent var2 = var0.peekEvent(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var0 = java.awt.EventQueue.isDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var1 = var0.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.AWTEvent var3 = var0.peekEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Window var1 = var0.getActiveWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.upFocusCycle();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.focusNextComponent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var3 = var0.getDefaultFocusTraversalKeys(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var1 = var0.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var2 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var2);
    java.util.Set var5 = var0.getDefaultFocusTraversalKeys(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.focusPreviousComponent();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.DefaultKeyboardFocusManager var8 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var9 = var8.getPermanentFocusOwner();
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var8);
    var0.upFocusCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    var0.push(var1);
    java.awt.AWTEvent var3 = var1.peekEvent();
    java.awt.EventQueue var4 = new java.awt.EventQueue();
    java.awt.EventQueue var5 = new java.awt.EventQueue();
    var4.push(var5);
    java.awt.SecondaryLoop var7 = var5.createSecondaryLoop();
    var1.push(var5);
    java.awt.SecondaryLoop var9 = var1.createSecondaryLoop();
    java.awt.SecondaryLoop var10 = var1.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.Component var8 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var9 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var10 = var9.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var11 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var9.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var11);
    java.awt.KeyboardFocusManager var13 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var13.clearGlobalFocusOwner();
    java.awt.Component var15 = var13.getFocusOwner();
    var11.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var13);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.DefaultKeyboardFocusManager var8 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var9 = var8.getPermanentFocusOwner();
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var8);
    java.awt.KeyboardFocusManager var11 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var11.clearGlobalFocusOwner();
    java.awt.Component var13 = var11.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var14 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var14.upFocusCycle();
    var11.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var14);
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var11);
    java.awt.Window var18 = var11.getActiveWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.KeyboardFocusManager var8 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var8.clearGlobalFocusOwner();
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.KeyboardFocusManager var1 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    java.beans.VetoableChangeListener[] var3 = var1.getVetoableChangeListeners("");
    java.awt.KeyboardFocusManager.setCurrentKeyboardFocusManager(var1);
    var0.addKeyEventDispatcher((java.awt.KeyEventDispatcher)var1);
    var0.clearGlobalFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.DefaultKeyboardFocusManager var8 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var9 = var8.getPermanentFocusOwner();
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var8);
    java.awt.KeyboardFocusManager var11 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var11.clearGlobalFocusOwner();
    java.awt.Component var13 = var11.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var14 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var14.upFocusCycle();
    var11.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var14);
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var11);
    java.beans.PropertyChangeListener[] var18 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.clearGlobalFocusOwner();
    java.awt.Component var2 = var0.getPermanentFocusOwner();
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var4 = var3.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var5 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var5);
    var0.addKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var3);
    java.awt.KeyboardFocusManager.setCurrentKeyboardFocusManager(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.focusNextComponent();
    java.util.Set var3 = var0.getDefaultFocusTraversalKeys(0);
    java.beans.VetoableChangeListener[] var4 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var1 = var0.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var2 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var2);
    var2.focusPreviousComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var1 = var0.getPermanentFocusOwner();
    java.beans.VetoableChangeListener[] var3 = var0.getVetoableChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.KeyboardFocusManager var0 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.upFocusCycle();
    java.beans.VetoableChangeListener[] var2 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.Component var1 = var0.getPermanentFocusOwner();
    java.awt.KeyboardFocusManager var2 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var2);
    java.awt.KeyboardFocusManager var4 = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    var4.clearGlobalFocusOwner();
    java.awt.Component var6 = var4.getFocusOwner();
    var2.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var4);
    var4.focusPreviousComponent();
    java.awt.KeyboardFocusManager.setCurrentKeyboardFocusManager(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

}
