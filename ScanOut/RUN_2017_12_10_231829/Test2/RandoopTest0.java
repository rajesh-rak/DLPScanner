
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.moveCaretPosition(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    int var5 = var2.countComponents();
    var2.setText("hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    var2.setDoubleBuffered(false);
    java.beans.VetoableChangeListener[] var7 = var2.getVetoableChangeListeners();
    javax.swing.KeyStroke[] var8 = var2.getRegisteredKeyStrokes();
    javax.swing.JPopupMenu var9 = var2.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    int var6 = var2.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    int var4 = var2.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    boolean var9 = var2.isRequestFocusEnabled();
    javax.swing.text.Highlighter var10 = var2.getHighlighter();
    var2.setAlignmentX(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    boolean var9 = var2.isRequestFocusEnabled();
    javax.swing.JTextField var12 = new javax.swing.JTextField("", 1);
    var12.resetKeyboardActions();
    java.awt.dnd.DropTarget var14 = var12.getDropTarget();
    var12.setDoubleBuffered(false);
    java.awt.Color var17 = var12.getSelectedTextColor();
    var2.setSelectedTextColor(var17);
    boolean var20 = var2.areFocusTraversalKeysSet(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    javax.swing.JTextField var11 = new javax.swing.JTextField("", 1);
    var11.resetKeyboardActions();
    java.awt.dnd.DropTarget var13 = var11.getDropTarget();
    var11.setDoubleBuffered(false);
    java.awt.Color var16 = var11.getSelectedTextColor();
    var2.setSelectedTextColor(var16);
    javax.swing.JTextField var20 = new javax.swing.JTextField("", 1);
    var20.resetKeyboardActions();
    var20.setFocusTraversalKeysEnabled(true);
    var20.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    javax.swing.JTextField var29 = new javax.swing.JTextField("", 1);
    var29.resetKeyboardActions();
    java.awt.dnd.DropTarget var31 = var29.getDropTarget();
    var29.setDoubleBuffered(false);
    java.awt.Color var34 = var29.getSelectedTextColor();
    var20.setSelectedTextColor(var34);
    var2.setSelectionColor(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.transferFocusBackward();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    boolean var9 = var2.isRequestFocusEnabled();
    javax.swing.JTextField var12 = new javax.swing.JTextField("", 1);
    var12.resetKeyboardActions();
    java.awt.dnd.DropTarget var14 = var12.getDropTarget();
    var12.setDoubleBuffered(false);
    java.awt.Color var17 = var12.getSelectedTextColor();
    var2.setSelectedTextColor(var17);
    var2.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    var2.setDoubleBuffered(false);
    java.awt.GraphicsConfiguration var7 = var2.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    javax.swing.JTextField var11 = new javax.swing.JTextField("", 1);
    var11.resetKeyboardActions();
    java.awt.dnd.DropTarget var13 = var11.getDropTarget();
    var11.setDoubleBuffered(false);
    java.awt.Color var16 = var11.getSelectedTextColor();
    var2.setCaretColor(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    int var5 = var2.countComponents();
    boolean var6 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    java.lang.Object var10 = var2.getClientProperty((java.lang.Object)"hi!");
    boolean var13 = var2.inside(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    java.lang.Object var10 = var2.getClientProperty((java.lang.Object)"hi!");
    java.awt.event.MouseMotionListener[] var11 = var2.getMouseMotionListeners();
    javax.swing.JRootPane var12 = javax.swing.SwingUtilities.getRootPane((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    int var5 = var2.countComponents();
    var2.removeNotify();
    int var7 = var2.getHorizontalAlignment();
    javax.swing.event.AncestorListener[] var8 = var2.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    var2.setDoubleBuffered(false);
    java.beans.VetoableChangeListener[] var7 = var2.getVetoableChangeListeners();
    var2.validate();
    boolean var9 = var2.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    int var5 = var2.countComponents();
    var2.setIgnoreRepaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    boolean var9 = var2.isRequestFocusEnabled();
    var2.firePropertyChange("hi!", true, false);
    java.beans.VetoableChangeListener[] var14 = var2.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.dnd.DropTarget var4 = var2.getDropTarget();
    java.awt.datatransfer.FlavorMap var5 = var4.getFlavorMap();
    java.awt.dnd.DropTargetContext var6 = var4.getDropTargetContext();
    java.awt.Component var7 = var4.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.Component var6 = javax.swing.SwingUtilities.getDeepestComponentAt((java.awt.Component)var2, 10, 100);
    java.awt.Component var7 = var2.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    java.awt.Component var6 = javax.swing.SwingUtilities.getDeepestComponentAt((java.awt.Component)var2, 10, 100);
    javax.swing.text.Highlighter var7 = var2.getHighlighter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JTextField var2 = new javax.swing.JTextField("", 1);
    var2.resetKeyboardActions();
    var2.setFocusTraversalKeysEnabled(true);
    var2.putClientProperty((java.lang.Object)10, (java.lang.Object)10);
    boolean var9 = var2.isRequestFocusEnabled();
    javax.swing.JTextField var12 = new javax.swing.JTextField("", 1);
    var12.resetKeyboardActions();
    java.awt.dnd.DropTarget var14 = var12.getDropTarget();
    var12.setDoubleBuffered(false);
    java.awt.Color var17 = var12.getSelectedTextColor();
    var2.setSelectedTextColor(var17);
    boolean var19 = var2.isShowing();
    boolean var22 = var2.inside((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

}
