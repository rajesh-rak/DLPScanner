
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    java.awt.Point var6 = var2.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    java.awt.Insets var5 = var2.getInsets();
    javax.swing.tree.TreePath var6 = var2.getLeadSelectionPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    java.awt.Insets var5 = var2.getInsets();
    int var6 = var2.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    boolean var5 = var2.getScrollsOnExpand();
    var2.enable();
    var2.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    boolean var5 = var2.getScrollsOnExpand();
    var2.enable();
    var2.setVisible(false);
    java.awt.Component var11 = var2.locate(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    boolean var5 = var2.getScrollsOnExpand();
    var2.enable();
    java.awt.Container var7 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    int var5 = var2.getRowCount();
    boolean var7 = var2.isRowSelected(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    boolean var5 = var2.getScrollsOnExpand();
    var2.enable();
    var2.setVisible(false);
    var2.setSize((-1), (-1));
    int[] var13 = new int[] { 10};
    var2.removeSelectionRows(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    javax.swing.plaf.TreeUI var9 = var2.getUI();
    java.lang.Object[] var11 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var12 = new javax.swing.JTree(var11);
    var12.setDoubleBuffered(false);
    boolean var15 = var12.getScrollsOnExpand();
    java.awt.Component var18 = javax.swing.SwingUtilities.getDeepestComponentAt((java.awt.Component)var12, 10, 1);
    boolean var21 = var9.contains((javax.swing.JComponent)var12, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    java.awt.event.HierarchyBoundsListener[] var9 = var2.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Window var3 = javax.swing.SwingUtilities.windowForComponent((java.awt.Component)var2);
    boolean var4 = var2.isLightweight();
    var2.setInheritsPopupMenu(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    javax.swing.plaf.TreeUI var9 = var2.getUI();
    javax.swing.TransferHandler var10 = var2.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    java.awt.event.ComponentListener[] var9 = var2.getComponentListeners();
    java.lang.Object[] var11 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var12 = new javax.swing.JTree(var11);
    java.lang.Object var13 = var12.getTreeLock();
    java.awt.Component var15 = var2.add((java.awt.Component)var12, (-1));
    java.awt.event.HierarchyBoundsListener[] var16 = var12.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Window var3 = javax.swing.SwingUtilities.windowForComponent((java.awt.Component)var2);
    javax.swing.ActionMap var4 = var2.getActionMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.transferFocusDownCycle();
    var2.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    boolean var5 = var2.getScrollsOnExpand();
    var2.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    java.lang.Object[] var6 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var7 = new javax.swing.JTree(var6);
    var7.setDoubleBuffered(false);
    javax.swing.tree.TreePath var10 = var7.getLeadSelectionPath();
    boolean var11 = var7.hasFocus();
    var7.removeSelectionRow(10);
    java.awt.event.ComponentListener[] var14 = var7.getComponentListeners();
    java.awt.Rectangle var15 = var7.bounds();
    var2.paintImmediately(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    java.awt.Insets var5 = var2.getInsets();
    javax.swing.tree.TreePath var8 = var2.getPathForLocation(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    var2.firePropertyChange("", (byte)1, (byte)(-1));
    boolean var10 = var2.isFocusOwner();
    var2.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    java.awt.event.ComponentListener[] var9 = var2.getComponentListeners();
    java.awt.Rectangle var10 = var2.bounds();
    java.lang.Object[] var14 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var15 = new javax.swing.JTree(var14);
    var15.setDoubleBuffered(false);
    int var18 = var15.getRowCount();
    var15.firePropertyChange("", true, false);
    java.awt.Point var23 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var2, 10, 1, (java.awt.Component)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    boolean var6 = var2.hasFocus();
    var2.removeSelectionRow(10);
    boolean var9 = var2.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    var2.firePropertyChange("hi!", (-1.0d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setDoubleBuffered(false);
    javax.swing.tree.TreePath var5 = var2.getLeadSelectionPath();
    var2.firePropertyChange("", (byte)1, (byte)(-1));
    var2.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
