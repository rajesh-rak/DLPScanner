
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var3.getValueAt((-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    javax.swing.ActionMap var5 = var3.getActionMap();
    float var6 = var3.getAlignmentY();
    javax.swing.InputMap var8 = var3.getInputMap(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    boolean var5 = var3.getScrollableTracksViewportWidth();
    boolean var6 = var3.isShowing();
    java.awt.event.HierarchyListener[] var7 = var3.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    var3.setUpdateSelectionOnSort(true);
    int var6 = var3.getColumnCount();
    boolean var7 = var3.isOpaque();
    int var8 = var3.getRowMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.moveColumn(10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    boolean var5 = var3.getScrollableTracksViewportWidth();
    boolean var6 = var3.isBackgroundSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setRowSelectionInterval(100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    boolean var6 = var3.isFocusCycleRoot();
    var3.clearSelection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    javax.swing.ActionMap var5 = var3.getActionMap();
    float var6 = var3.getAlignmentY();
    javax.accessibility.AccessibleStateSet var7 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var3);
    java.util.Locale var8 = var3.getLocale();
    javax.swing.plaf.TableUI var9 = var3.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    boolean var5 = var3.getScrollableTracksViewportWidth();
    boolean var6 = var3.isBackgroundSet();
    int var7 = var3.getRowHeight();
    int var8 = var3.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    boolean var5 = var3.getScrollableTracksViewportWidth();
    boolean var6 = var3.isBackgroundSet();
    var3.setShowGrid(false);
    boolean var9 = var3.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    javax.swing.ActionMap var5 = var3.getActionMap();
    float var6 = var3.getAlignmentY();
    javax.accessibility.AccessibleStateSet var7 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var3);
    java.util.Locale var8 = var3.getLocale();
    var3.setAutoCreateRowSorter(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    var3.setUpdateSelectionOnSort(true);
    int var6 = var3.getColumnCount();
    boolean var7 = var3.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.awt.event.KeyListener[] var4 = var3.getKeyListeners();
    boolean var5 = var3.isOptimizedDrawingEnabled();
    boolean var6 = var3.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    boolean var6 = var3.isFocusCycleRoot();
    int var7 = var3.getSelectedRowCount();
    float var8 = var3.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTable var0 = new javax.swing.JTable();
    java.lang.Object[][] var1 = new java.lang.Object[][] { };
    java.lang.Object[] var3 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var4 = new javax.swing.JTable(var1, var3);
    int var5 = var4.getHeight();
    var4.layout();
    boolean var7 = var4.getAutoCreateRowSorter();
    java.awt.Dimension var8 = var4.getMinimumSize();
    var0.setPreferredScrollableViewportSize(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    boolean var5 = var3.getScrollableTracksViewportWidth();
    boolean var6 = var3.isBackgroundSet();
    int var7 = var3.getRowHeight();
    javax.swing.table.TableCellEditor var8 = var3.getCellEditor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    javax.swing.ActionMap var5 = var3.getActionMap();
    boolean var6 = var3.isPreferredSizeSet();
    int var7 = var3.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    var3.setUpdateSelectionOnSort(true);
    int var6 = var3.getColumnCount();
    boolean var7 = var3.isOpaque();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeRowSelectionInterval((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    boolean var6 = var3.getAutoCreateRowSorter();
    var3.transferFocusBackward();
    boolean var8 = var3.getSurrendersFocusOnKeystroke();
    var3.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    boolean var6 = var3.isFocusCycleRoot();
    int var7 = var3.getSelectedRowCount();
    java.awt.event.MouseMotionListener[] var8 = var3.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    int var4 = var3.getHeight();
    var3.layout();
    boolean var6 = var3.getAutoCreateRowSorter();
    java.awt.Dimension var7 = var3.getMinimumSize();
    boolean var8 = var3.getShowVerticalLines();
    boolean var9 = var3.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

}
