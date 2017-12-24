
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    java.awt.event.MouseListener[] var3 = var0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    boolean var4 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getAutoscrolls();
    java.awt.Point var3 = var0.location();
    javax.swing.plaf.TreeUI var4 = var0.getUI();
    boolean var5 = var0.isLightweight();
    float var6 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addRowSelectionInterval(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    boolean var1 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    java.awt.Container var5 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    boolean var9 = var2.getAutoCreateColumnsFromModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    var0.reshape(100, 1, 0, 10);
    javax.swing.DropMode var7 = var0.getDropMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getScrollsOnExpand();
    javax.swing.DropMode var7 = var4.getDropMode();
    boolean var8 = var4.isDoubleBuffered();
    boolean var9 = var0.isAncestorOf((java.awt.Component)var4);
    var4.nextFocus();
    java.awt.Image var13 = var4.createImage((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.plaf.basic.BasicTableUI var0 = new javax.swing.plaf.basic.BasicTableUI();
    javax.swing.JTree var1 = new javax.swing.JTree();
    var1.addNotify();
    boolean var3 = var1.getScrollsOnExpand();
    java.awt.Component var5 = var1.getComponent(0);
    var1.setLargeModel(false);
    java.awt.Component.BaselineResizeBehavior var8 = var0.getBaselineResizeBehavior((javax.swing.JComponent)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    boolean var9 = var2.getFillsViewportHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setRowSelectionInterval(10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    var2.setColumnSelectionAllowed(true);
    int[] var11 = var2.getSelectedRows();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    boolean var9 = var2.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    var2.setColumnSelectionAllowed(true);
    int var11 = var2.getRowMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("", (short)0, (short)1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    var2.setColumnSelectionAllowed(true);
    boolean var13 = var2.contains(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    boolean var1 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    java.awt.Component var4 = var0.getComponent(0);
    var0.setLargeModel(false);
    javax.swing.JTree.DropLocation var7 = var0.getDropLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    int var9 = var2.getRowHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 16);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.setOpaque(false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getScrollsOnExpand();
    javax.swing.DropMode var3 = var0.getDropMode();
    javax.swing.plaf.ComponentUI var4 = javax.swing.plaf.basic.BasicTableUI.createUI((javax.swing.JComponent)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    java.lang.String var2 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.addNotify();
    boolean var2 = var0.getAutoscrolls();
    java.awt.Point var3 = var0.location();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    java.awt.Component var8 = var0.findComponentAt(var7);
    java.awt.event.FocusListener[] var9 = var0.getFocusListeners();
    var0.updateUI();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JTable var2 = new javax.swing.JTable(10, 10);
    boolean var3 = var2.getScrollableTracksViewportWidth();
    javax.swing.JTree var4 = new javax.swing.JTree();
    var4.addNotify();
    boolean var6 = var4.getAutoscrolls();
    java.awt.Point var7 = var4.location();
    int var8 = var2.rowAtPoint(var7);
    boolean var9 = var2.getFillsViewportHeight();
    var2.setEditingRow(0);
    var2.setUpdateSelectionOnSort(false);
    boolean var14 = var2.getScrollableTracksViewportHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

}
