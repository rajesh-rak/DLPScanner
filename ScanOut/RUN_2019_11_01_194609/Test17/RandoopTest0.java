
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(10);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    var5.repaint();
    int var10 = var5.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    boolean var9 = var5.isFixedRowHeight();
    boolean var10 = var5.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    boolean var9 = var5.isFixedRowHeight();
    boolean var10 = var5.isDoubleBuffered();
    var5.setDebugGraphicsOptions(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setShowsRootHandles(false);
    var2.setSelectionRow(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    var5.repaint();
    boolean var10 = var5.isOpaque();
    var5.firePropertyChange("hi!", 10L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    int var5 = var2.getRowForLocation(10, 1);
    boolean var6 = var2.isEditable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getBaseline(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    int var5 = var2.getRowForLocation(10, 1);
    boolean var6 = var2.isEditable();
    boolean var7 = var2.stopEditing();
    var2.updateUI();
    var2.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    boolean var9 = var5.getExpandsSelectedPaths();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.beans.PropertyChangeListener[] var4 = var2.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    var5.repaint();
    boolean var10 = var5.isOpaque();
    var5.firePropertyChange("", 1, 0);
    int var15 = var5.getToggleClickCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    int var5 = var2.getRowForLocation(10, 1);
    boolean var6 = var2.isEditable();
    boolean var7 = var2.stopEditing();
    boolean var8 = var2.isVisible();
    var2.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    java.awt.Cursor var9 = var5.getCursor();
    boolean var10 = var5.isDisplayable();
    java.lang.String var11 = var5.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "TreeUI"+ "'", var11.equals("TreeUI"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    java.awt.Cursor var9 = var5.getCursor();
    var5.invalidate();
    var5.transferFocus();
    java.awt.ComponentOrientation var12 = var5.getComponentOrientation();
    java.awt.event.MouseListener[] var13 = var5.getMouseListeners();
    var5.repaint((-1), 100, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setShowsRootHandles(false);
    java.awt.Component var7 = var2.getComponentAt((-1), (-1));
    int[] var9 = new int[] { 1};
    var2.addSelectionRows(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    var5.repaint();
    boolean var10 = var5.isOpaque();
    var5.collapseRow((-1));
    java.lang.String var19 = var5.convertValueToText((java.lang.Object)0.0f, false, false, true, 0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "0.0"+ "'", var19.equals("0.0"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    int var5 = var2.getRowForLocation(10, 1);
    boolean var6 = var2.isEditable();
    boolean var7 = var2.stopEditing();
    var2.updateUI();
    var2.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    boolean var9 = var5.isFixedRowHeight();
    var5.reshape(0, (-1), 0, 100);
    boolean var16 = var5.isCollapsed(100);
    java.awt.Component var19 = var5.getComponentAt(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    java.awt.Cursor var9 = var5.getCursor();
    var5.invalidate();
    var5.transferFocus();
    java.awt.ComponentOrientation var12 = var5.getComponentOrientation();
    java.awt.event.MouseListener[] var13 = var5.getMouseListeners();
    java.lang.Object[] var15 = new java.lang.Object[] { ' '};
    javax.swing.JTree var16 = new javax.swing.JTree(var15);
    java.lang.Object[] var18 = new java.lang.Object[] { ' '};
    javax.swing.JTree var19 = new javax.swing.JTree(var18);
    var19.setShowsRootHandles(false);
    var16.setNextFocusableComponent((java.awt.Component)var19);
    boolean var23 = var19.isFixedRowHeight();
    boolean var24 = var19.isDoubleBuffered();
    java.awt.image.ColorModel var25 = var19.getColorModel();
    boolean var26 = var19.isOptimizedDrawingEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setComponentZOrder((java.awt.Component)var19, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var3 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { ' '};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[] var4 = new java.lang.Object[] { ' '};
    javax.swing.JTree var5 = new javax.swing.JTree(var4);
    var5.setShowsRootHandles(false);
    var2.setNextFocusableComponent((java.awt.Component)var5);
    java.awt.Cursor var9 = var5.getCursor();
    var5.invalidate();
    var5.transferFocus();
    javax.swing.event.TreeExpansionListener[] var12 = var5.getTreeExpansionListeners();
    java.beans.VetoableChangeListener[] var13 = var5.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

}
