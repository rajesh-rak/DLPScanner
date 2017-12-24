
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.plaf.basic.BasicTableUI var0 = new javax.swing.plaf.basic.BasicTableUI();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(10);
    boolean var3 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    var2.cancelEditing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Container var3 = var2.getParent();
    var2.updateUI();
    java.awt.Rectangle var5 = var2.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setEnabled(true);
    var2.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Graphics var3 = var2.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    java.awt.Color var5 = var2.getBackground();
    var2.setBounds(10, 0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    java.awt.Color var5 = var2.getBackground();
    java.awt.Component var8 = javax.swing.SwingUtilities.getDeepestComponentAt((java.awt.Component)var2, 1, 100);
    java.lang.Object var10 = var2.getClientProperty((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setEnabled(true);
    java.lang.Object var5 = var2.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(10);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.lang.Object[] var6 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var7 = new javax.swing.JTree(var6);
    boolean var9 = var7.requestFocus(true);
    java.awt.Color var10 = var7.getBackground();
    java.awt.Color var11 = var7.getBackground();
    var0.setComponent((java.awt.Component)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    var0.setDefaultActions(100);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[][] var3 = new java.lang.Object[][] { var1};
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    javax.swing.JTable var7 = new javax.swing.JTable(var3, var5);
    boolean var8 = var7.getAutoCreateRowSorter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Container var3 = var2.getParent();
    var2.updateUI();
    boolean var6 = var2.isExpanded(10);
    var2.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    java.awt.Color var5 = var2.getBackground();
    java.awt.Component var8 = var2.locate(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[][] var3 = new java.lang.Object[][] { var1};
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    javax.swing.JTable var7 = new javax.swing.JTable(var3, var5);
    int[] var8 = var7.getSelectedColumns();
    boolean var9 = var7.getAutoCreateRowSorter();
    var7.setShowHorizontalLines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setEnabled(true);
    java.lang.Object[] var6 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var7 = new javax.swing.JTree(var6);
    boolean var9 = var7.requestFocus(true);
    java.awt.Color var10 = var7.getBackground();
    javax.swing.tree.TreePath[] var11 = new javax.swing.tree.TreePath[] { };
    var7.addSelectionPaths(var11);
    var2.removeSelectionPaths(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[][] var3 = new java.lang.Object[][] { var1};
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    javax.swing.JTable var7 = new javax.swing.JTable(var3, var5);
    boolean var8 = var7.getRowSelectionAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Container var3 = var2.getParent();
    var2.updateUI();
    var2.setInheritsPopupMenu(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Container var3 = var2.getParent();
    var2.updateUI();
    int var5 = var2.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setRootVisible(false);
    javax.swing.TransferHandler var5 = var2.getTransferHandler();
    var2.removeSelectionRow(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Container var3 = var2.getParent();
    javax.swing.tree.TreePath var6 = var2.getClosestPathForLocation((-1), (-1));
    java.lang.Object[] var8 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var9 = new javax.swing.JTree(var8);
    boolean var11 = var9.requestFocus(true);
    java.awt.Color var12 = var9.getBackground();
    var2.setBackground(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    java.awt.Color var5 = var2.getBackground();
    javax.swing.tree.TreePath[] var6 = new javax.swing.tree.TreePath[] { };
    var2.addSelectionPaths(var6);
    java.lang.Object var8 = var2.getLastSelectedPathComponent();
    java.awt.event.MouseMotionListener[] var9 = var2.getMouseMotionListeners();
    java.awt.Component var12 = javax.swing.SwingUtilities.getDeepestComponentAt((java.awt.Component)var2, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[][] var3 = new java.lang.Object[][] { var1};
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    javax.swing.JTable var7 = new javax.swing.JTable(var3, var5);
    int[] var8 = var7.getSelectedColumns();
    boolean var9 = var7.getDragEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var7.getValueAt((-1), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    boolean var4 = var2.requestFocus(true);
    java.awt.Color var5 = var2.getBackground();
    javax.swing.tree.TreePath[] var6 = new javax.swing.tree.TreePath[] { };
    var2.addSelectionPaths(var6);
    java.lang.Object var8 = var2.getLastSelectedPathComponent();
    java.lang.String var15 = var2.convertValueToText((java.lang.Object)10L, true, false, true, 100, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10"+ "'", var15.equals("10"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.lang.Object[][] var3 = new java.lang.Object[][] { var1};
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);
    javax.swing.JTable var7 = new javax.swing.JTable(var3, var5);
    int[] var8 = var7.getSelectedColumns();
    javax.swing.JScrollPane var9 = javax.swing.JTable.createScrollPaneForTable(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
