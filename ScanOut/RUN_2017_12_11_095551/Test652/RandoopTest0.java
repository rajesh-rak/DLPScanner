
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setColumnSelectionInterval(1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addRowSelectionInterval(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var7.nextFocus();
    boolean var10 = var7.getScrollableTracksViewportWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    boolean var4 = var3.isLightweight();
    java.awt.Container var5 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.awt.Rectangle var4 = var3.bounds();
    java.awt.Component var5 = javax.swing.SwingUtilities.getRoot((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.awt.Rectangle var4 = var3.bounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var6 = var3.getMousePosition(true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    float var9 = var3.getAlignmentX();
    var3.repaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    java.awt.Rectangle var8 = var7.bounds();
    java.awt.Rectangle var9 = javax.swing.SwingUtilities.computeIntersection((-1), 1, 0, 10, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var3.removeNotify();
    javax.accessibility.AccessibleStateSet var10 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var3);
    var3.removeNotify();
    var3.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var7.setAutoCreateColumnsFromModel(true);
    var7.setIgnoreRepaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var7.nextFocus();
    float var10 = var7.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.5f);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var7.nextFocus();
    int var10 = var7.getSelectedColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    float var9 = var3.getAlignmentX();
    var3.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    float var9 = var3.getAlignmentX();
    var3.repaint();
    var3.setEditingRow((-1));
    var3.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    float var9 = var3.getAlignmentX();
    var3.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var3.removeNotify();
    javax.accessibility.AccessibleStateSet var10 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var3);
    var3.removeNotify();
    boolean var12 = var3.getAutoCreateColumnsFromModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    java.awt.Dimension var9 = var7.size();
    var7.firePropertyChange("hi!", (-1L), (-1L));
    int var14 = var7.getRowHeight();
    var7.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 16);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    java.awt.ComponentOrientation var9 = var7.getComponentOrientation();
    boolean var11 = var7.isColumnSelected(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.awt.Rectangle var4 = var3.bounds();
    int[] var5 = var3.getSelectedRows();
    javax.swing.plaf.ComponentUI var6 = javax.swing.plaf.basic.BasicTableUI.createUI((javax.swing.JComponent)var3);
    boolean var7 = var3.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.awt.Rectangle var4 = var3.bounds();
    javax.swing.event.AncestorListener[] var5 = var3.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    float var9 = var3.getAlignmentX();
    var3.repaint();
    java.awt.Container var11 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    boolean var9 = var3.isForegroundSet();
    java.lang.Object[][] var11 = new java.lang.Object[][] { };
    java.lang.Object[] var13 = new java.lang.Object[] { ""};
    javax.swing.JTable var14 = new javax.swing.JTable(var11, var13);
    boolean var15 = var14.isLightweight();
    javax.swing.InputMap var16 = var14.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setInputMap(10, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var3.removeNotify();
    javax.accessibility.AccessibleStateSet var10 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var3);
    var3.removeNotify();
    java.lang.Object[][] var12 = new java.lang.Object[][] { };
    java.lang.Object[] var14 = new java.lang.Object[] { ""};
    javax.swing.JTable var15 = new javax.swing.JTable(var12, var14);
    java.lang.Object[][] var16 = new java.lang.Object[][] { };
    java.lang.Object[] var18 = new java.lang.Object[] { ""};
    javax.swing.JTable var19 = new javax.swing.JTable(var16, var18);
    boolean var20 = var15.isAncestorOf((java.awt.Component)var19);
    var15.removeNotify();
    javax.accessibility.AccessibleStateSet var22 = javax.swing.SwingUtilities.getAccessibleStateSet((java.awt.Component)var15);
    java.awt.Dimension var23 = var15.minimumSize();
    var3.setMinimumSize(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    boolean var4 = var3.isLightweight();
    javax.swing.InputMap var5 = var3.getInputMap();
    java.lang.String var6 = var3.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    boolean var9 = var3.isForegroundSet();
    java.awt.event.MouseWheelListener[] var10 = var3.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Object[][] var0 = new java.lang.Object[][] { };
    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    javax.swing.JTable var3 = new javax.swing.JTable(var0, var2);
    java.lang.Object[][] var4 = new java.lang.Object[][] { };
    java.lang.Object[] var6 = new java.lang.Object[] { ""};
    javax.swing.JTable var7 = new javax.swing.JTable(var4, var6);
    boolean var8 = var3.isAncestorOf((java.awt.Component)var7);
    var3.removeNotify();
    java.awt.event.HierarchyListener[] var10 = var3.getHierarchyListeners();
    int[] var11 = var3.getSelectedRows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
