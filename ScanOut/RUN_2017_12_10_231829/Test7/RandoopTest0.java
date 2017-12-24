
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (byte)1};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1.0d};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { "hi!"};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getCollapsedIcon();
    var0.setRightChildIndent(0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getCollapsedIcon();
    var0.setLeftChildIndent((-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    int var1 = var0.getLeftChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    int var2 = var0.getLeftChildIndent();
    javax.swing.Icon var3 = var0.getExpandedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    boolean var2 = var0.isActive();
    java.awt.Component var3 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.Icon var2 = var0.getExpandedIcon();
    java.awt.Dimension var3 = var0.getPreferredMinSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var7 = var6.getFlavorMap();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    var6.setFlavorMap(var9);
    java.awt.dnd.DropTargetContext var11 = var6.getDropTargetContext();
    var6.setDefaultActions(1);
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var15 = var14.getFlavorMap();
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var17 = var16.getFlavorMap();
    var14.setFlavorMap(var17);
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.Icon var2 = var0.getExpandedIcon();
    int var3 = var0.getRightChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var5 = var4.getFlavorMap();
    var2.setFlavorMap(var5);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.Component var8 = var0.getComponent();
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    java.awt.datatransfer.FlavorMap var13 = var8.getFlavorMap();
    var0.setFlavorMap(var13);
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var16 = var15.getFlavorMap();
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var18 = var17.getFlavorMap();
    var15.setFlavorMap(var18);
    java.awt.dnd.DropTargetContext var20 = var15.getDropTargetContext();
    var15.setDefaultActions(1);
    java.awt.dnd.DropTarget var23 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var24 = var23.getFlavorMap();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var26 = var25.getFlavorMap();
    var23.setFlavorMap(var26);
    java.awt.datatransfer.FlavorMap var28 = var23.getFlavorMap();
    var15.setFlavorMap(var28);
    var0.setFlavorMap(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var14 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var16 = var15.getFlavorMap();
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var18 = var17.getFlavorMap();
    var15.setFlavorMap(var18);
    java.awt.datatransfer.FlavorMap var20 = var15.getFlavorMap();
    var8.addDropTargetListener((java.awt.dnd.DropTargetListener)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    java.lang.Object[] var6 = new java.lang.Object[] { var5};
    javax.swing.JTree var7 = new javax.swing.JTree(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    java.awt.datatransfer.FlavorMap var13 = var8.getFlavorMap();
    var0.setFlavorMap(var13);
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.Component var14 = var8.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var15 = var14.getFlavorMap();
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var17 = var16.getFlavorMap();
    var14.setFlavorMap(var17);
    java.awt.dnd.DropTargetContext var19 = var14.getDropTargetContext();
    var14.setDefaultActions(1);
    java.awt.Component var22 = var14.getComponent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.setFlavorMap(var3);
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    var0.setDefaultActions(1);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.setFlavorMap(var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.dnd.DropTargetContext var14 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
