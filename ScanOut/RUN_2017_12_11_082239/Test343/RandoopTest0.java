
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.hide();
    int var10 = var2.getLeadSelectionRow();
    java.awt.event.InputMethodListener[] var11 = var2.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.hide();
    int var10 = var2.getLeadSelectionRow();
    java.lang.Object[] var12 = new java.lang.Object[] { '#'};
    javax.swing.JTree var13 = new javax.swing.JTree(var12);
    var13.setSelectionInterval(0, 1);
    var13.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var13.nextFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((java.awt.Component)var13, (java.lang.Object)(byte)1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.removeSelectionRow(1);
    java.awt.Graphics var5 = var2.getGraphics();
    boolean var6 = var2.isFontSet();
    var2.setExpandsSelectedPaths(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Point var3 = var2.location();
    javax.swing.plaf.basic.BasicTreeUI var4 = new javax.swing.plaf.basic.BasicTreeUI();
    var2.setUI((javax.swing.plaf.TreeUI)var4);
    int[] var6 = var2.getSelectionRows();
    java.awt.Toolkit var7 = var2.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    javax.swing.JTree.DropLocation var3 = var2.getDropLocation();
    javax.swing.plaf.TreeUI var4 = var2.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.nextFocus();
    var2.firePropertyChange("", 100.0f, (-1.0f));
    var2.addNotify();
    java.awt.Container var15 = var2.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.lang.Object[] var2 = new java.lang.Object[] { '#'};
    javax.swing.JTree var3 = new javax.swing.JTree(var2);
    var3.setSelectionInterval(0, 1);
    var3.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var3.nextFocus();
    var0.installUI((javax.swing.JComponent)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Point var3 = var2.location();
    javax.swing.plaf.basic.BasicTreeUI var4 = new javax.swing.plaf.basic.BasicTreeUI();
    var2.setUI((javax.swing.plaf.TreeUI)var4);
    int[] var6 = var2.getSelectionRows();
    var2.setSelectionInterval(10, 0);
    java.awt.ComponentOrientation var10 = var2.getComponentOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.treeDidChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    java.awt.Color var6 = var2.getBackground();
    boolean var7 = var2.getExpandsSelectedPaths();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Point var3 = var2.location();
    javax.swing.plaf.basic.BasicTreeUI var4 = new javax.swing.plaf.basic.BasicTreeUI();
    var2.setUI((javax.swing.plaf.TreeUI)var4);
    int[] var6 = var2.getSelectionRows();
    java.awt.FocusTraversalPolicy var7 = var2.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.repaint(100, (-1), 0, 100);
    var2.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.removeSelectionRow(1);
    var2.firePropertyChange("hi!", 10L, (-1L));
    javax.swing.plaf.ComponentUI var9 = javax.swing.plaf.basic.BasicTreeUI.createUI((javax.swing.JComponent)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    java.awt.Container var6 = var2.getTopLevelAncestor();
    var2.setRowHeight(10);
    var2.firePropertyChange("", 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    java.awt.Window var3 = javax.swing.SwingUtilities.windowForComponent((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    boolean var6 = var2.getScrollableTracksViewportWidth();
    boolean var7 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    java.awt.Color var6 = var2.getBackground();
    boolean var7 = var2.isEditing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.hide();
    int var10 = var2.getLeadSelectionRow();
    var2.setSelectionRow(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.repaint(100, (-1), 0, 100);
    javax.swing.TransferHandler var11 = var2.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    boolean var6 = var2.getScrollableTracksViewportWidth();
    java.awt.Insets var7 = var2.getInsets();
    var2.setName("");
    var2.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.removeSelectionRow(1);
    var2.firePropertyChange("hi!", 10L, (-1L));
    java.awt.FocusTraversalPolicy var9 = var2.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    var2.putClientProperty((java.lang.Object)0.0f, (java.lang.Object)(short)100);
    var2.setFocusCycleRoot(true);
    boolean var12 = var2.areFocusTraversalKeysSet(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { '#'};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);
    var2.setSelectionInterval(0, 1);
    boolean var6 = var2.getScrollableTracksViewportWidth();
    javax.swing.plaf.ComponentUI var7 = javax.swing.plaf.basic.BasicTreeUI.createUI((javax.swing.JComponent)var2);
    javax.swing.SwingUtilities.updateComponentTreeUI((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
