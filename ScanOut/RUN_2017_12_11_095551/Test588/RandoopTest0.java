
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    javax.swing.tree.TreeCellRenderer var1 = var0.createDefaultCellRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    var0.setLeftChildIndent(100);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    int var2 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    int var3 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.Icon var2 = var0.getExpandedIcon();
    var0.setRightChildIndent(100);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    var0.setRightChildIndent(100);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    int var2 = var0.getRightChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1.0d};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    int var2 = var0.getRightChildIndent();
    int var3 = var0.getLeftChildIndent();
    int var4 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    int var2 = var0.getRightChildIndent();
    var0.setRightChildIndent(1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    javax.swing.tree.TreeCellRenderer var2 = var0.createDefaultCellRenderer();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    var0.setRightChildIndent(10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    javax.swing.tree.TreeCellRenderer var2 = var0.createDefaultCellRenderer();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    int var4 = var0.getRightChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(100);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    javax.swing.tree.TreeCellRenderer var2 = var0.createDefaultCellRenderer();
    javax.swing.tree.TreeCellRenderer var3 = var0.createDefaultCellRenderer();
    javax.swing.tree.TreeCellRenderer var4 = var0.createDefaultCellRenderer();
    javax.swing.tree.TreeCellRenderer var5 = var0.createDefaultCellRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.lang.Object[] var3 = new java.lang.Object[] { var0};
    javax.swing.JTree var4 = new javax.swing.JTree(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    javax.swing.Icon var3 = var0.getCollapsedIcon();
    int var4 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(100);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setDefaultActions(100);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTargetContext var7 = var3.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    int var1 = var0.getLeftChildIndent();
    int var2 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    int var2 = var0.getLeftChildIndent();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    java.lang.Object[] var1 = new java.lang.Object[] { var0};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getRightChildIndent();
    javax.swing.tree.TreeCellRenderer var2 = var0.createDefaultCellRenderer();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    javax.swing.Icon var4 = var0.getCollapsedIcon();
    int var5 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(100);
    java.awt.Component var3 = var0.getComponent();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var4.setDefaultActions(100);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var7.setDefaultActions(100);
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var12.setDefaultActions(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
