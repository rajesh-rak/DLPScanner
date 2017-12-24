
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (short)10};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)100};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    int var5 = var0.getDefaultActions();
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1.0d};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setActive(true);
    var0.setActive(false);
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    var0.setRightChildIndent((-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var4 = var3.getDropTargetContext();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    java.awt.datatransfer.FlavorMap var6 = var3.getFlavorMap();
    java.awt.datatransfer.FlavorMap var7 = var3.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    boolean var9 = var3.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getLeftChildIndent();
    var0.setRightChildIndent(10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    var0.setDefaultActions(0);
    boolean var5 = var0.isActive();
    java.awt.Component var6 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var3 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var5 = var4.getDropTargetContext();
    var4.setActive(true);
    boolean var8 = var4.isActive();
    int var9 = var4.getDefaultActions();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var11 = var10.getDropTargetContext();
    var4.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.Component var3 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var3 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var4 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    var0.setRightChildIndent(3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getLeftChildIndent();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    javax.swing.Icon var3 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getLeftChildIndent();
    int var2 = var0.getRightChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setActive(true);
    int var4 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.java.swing.plaf.motif.MotifTreeUI var0 = new com.sun.java.swing.plaf.motif.MotifTreeUI();
    int var1 = var0.getLeftChildIndent();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    int var4 = var0.getRightChildIndent();
    var0.setRightChildIndent(10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    var0.setLeftChildIndent(3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    int var5 = var0.getDefaultActions();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var7 = var6.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var10 = var9.getDropTargetContext();
    var9.setActive(true);
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    var0.setDefaultActions(0);
    boolean var5 = var0.isActive();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var7 = var6.getDropTargetContext();
    var6.setActive(true);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var11 = var6.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
