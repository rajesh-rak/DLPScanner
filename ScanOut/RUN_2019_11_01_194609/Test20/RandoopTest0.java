
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    java.awt.Component var4 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    boolean var4 = var0.isMinimumSizeSet();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Container var2 = var0.getContentPane();
    boolean var3 = var0.isFocusable();
    var0.firePropertyChange("hi!", (byte)10, (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    boolean var4 = var0.isMinimumSizeSet();
    java.awt.Container var5 = var0.getContentPane();
    java.awt.Color var6 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Container var2 = var0.getContentPane();
    var0.transferFocusUpCycle();
    java.lang.String var4 = var0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    boolean var4 = var0.isMinimumSizeSet();
    java.awt.Container var5 = var0.getContentPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.transferFocusDownCycle();
    java.awt.Component var5 = var0.locate((-1), 3);
    float var6 = var0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0f);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    boolean var4 = var0.isMinimumSizeSet();
    java.awt.Container var5 = var0.getContentPane();
    var0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Container var2 = var0.getContentPane();
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners("hi!");
    java.lang.String var5 = var0.getTitle();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    int var6 = var0.getBaseline(3, 3);
    javax.swing.JDialog var7 = new javax.swing.JDialog();
    var7.removeNotify();
    java.awt.Window[] var9 = var7.getOwnedWindows();
    java.awt.FocusTraversalPolicy var10 = var7.getFocusTraversalPolicy();
    var0.setFocusTraversalPolicy(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Window[] var2 = var0.getOwnedWindows();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getBaseline((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.setFocusable(true);
    var0.validate();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.setFocusable(true);
    java.awt.event.MouseWheelListener[] var4 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.setFocusable(true);
    boolean var4 = var0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.setFocusable(true);
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var0.setDropTarget(var5);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    var8.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var5.removeDropTargetListener((java.awt.dnd.DropTargetListener)var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    var0.setFocusable(true);
    java.awt.Container var4 = var0.getParent();
    java.awt.im.InputMethodRequests var5 = var0.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    java.awt.Point var2 = var0.getMousePosition(true);
    java.awt.Dimension var3 = var0.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    javax.swing.JDialog var2 = new javax.swing.JDialog((java.awt.Window)var0);
    boolean var3 = var2.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();
    var0.removeNotify();
    javax.swing.JDialog var2 = new javax.swing.JDialog((java.awt.Window)var0);
    var2.remove(0);

  }

}
