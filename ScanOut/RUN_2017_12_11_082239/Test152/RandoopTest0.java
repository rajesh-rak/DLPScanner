
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    var0.reshape(1, 1, 0, (-1));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    boolean var5 = var0.getInvokesStopCellEditing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    boolean var1 = var0.isFocusable();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    float var1 = var0.getAlignmentY();
    var0.addSelectionInterval((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    float var1 = var0.getAlignmentY();
    javax.swing.plaf.ComponentUI var2 = javax.swing.plaf.basic.BasicTreeUI.createUI((javax.swing.JComponent)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.tree.TreeCellEditor var1 = var0.getCellEditor();
    java.awt.event.MouseMotionListener[] var2 = var0.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.plaf.TreeUI var1 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    javax.swing.InputMap var5 = var0.getInputMap();
    javax.swing.tree.TreeCellRenderer var6 = var0.getCellRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    java.awt.Container var5 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.tree.TreeCellEditor var1 = var0.getCellEditor();
    var0.setExpandsSelectedPaths(true);
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    var0.setLocation(100, 1);
    boolean var8 = var0.stopEditing();
    float var9 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    javax.swing.JTree var1 = new javax.swing.JTree();
    javax.swing.tree.TreeCellEditor var2 = var1.getCellEditor();
    var1.setVisibleRowCount((-1));
    var0.installUI((javax.swing.JComponent)var1);
    javax.swing.DropMode var6 = var1.getDropMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.Icon var2 = var0.getExpandedIcon();
    int var3 = var0.getRightChildIndent();
    javax.swing.JTree var4 = new javax.swing.JTree();
    boolean var5 = var4.isOptimizedDrawingEnabled();
    java.awt.Insets var6 = var4.insets();
    boolean var7 = var4.isSelectionEmpty();
    var0.installUI((javax.swing.JComponent)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.JTree var2 = new javax.swing.JTree();
    var2.firePropertyChange("hi!", 100.0f, 0.0f);
    var2.setLocation(100, 1);
    var2.setEditable(false);
    var0.installUI((javax.swing.JComponent)var2);
    var2.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    var0.firePropertyChange("hi!", 100.0f, 0.0f);
    int var5 = var0.getX();
    javax.swing.JTree var6 = new javax.swing.JTree();
    boolean var7 = var6.isFocusable();
    var6.setShowsRootHandles(true);
    javax.swing.tree.TreePath var12 = var6.getClosestPathForLocation(0, 0);
    boolean var13 = var0.hasBeenExpanded(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.tree.TreeCellEditor var1 = var0.getCellEditor();
    var0.setExpandsSelectedPaths(true);
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.requestFocusInWindow();
    javax.swing.JTree var7 = new javax.swing.JTree();
    var7.firePropertyChange("hi!", 100.0f, 0.0f);
    javax.swing.InputMap var12 = var7.getInputMap();
    var0.putClientProperty((java.lang.Object)'a', (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    javax.swing.tree.TreeCellRenderer var1 = var0.createDefaultCellRenderer();
    javax.swing.JTree var2 = new javax.swing.JTree();
    var2.firePropertyChange("hi!", 100.0f, 0.0f);
    javax.swing.InputMap var7 = var2.getInputMap();
    javax.swing.tree.TreePath var9 = var0.getPathForRow(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.JTree var2 = new javax.swing.JTree();
    javax.swing.tree.TreeCellEditor var3 = var2.getCellEditor();
    var2.setExpandsSelectedPaths(true);
    int var6 = var0.getRowCount(var2);
    com.sun.java.swing.plaf.motif.MotifTreeUI var7 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    javax.swing.JTree var8 = new javax.swing.JTree();
    boolean var9 = var8.isFocusable();
    java.awt.Dimension var10 = var7.getMinimumSize((javax.swing.JComponent)var8);
    javax.swing.JTree var11 = new javax.swing.JTree();
    boolean var12 = var11.isFocusable();
    var11.setShowsRootHandles(true);
    javax.swing.tree.TreePath var17 = var11.getClosestPathForLocation(0, 0);
    int var18 = var0.getRowForPath(var8, var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

}
