
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

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    var0.setLeftChildIndent(100);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1.0d};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    java.lang.Object[] var5 = new java.lang.Object[] { var4};
    javax.swing.JTree var6 = new javax.swing.JTree(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.Component var2 = var0.getComponent();
    java.awt.dnd.DropTargetContext var3 = var0.getDropTargetContext();
    int var4 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    var0.setLeftChildIndent((-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    var2.setFlavorMap(var4);
    java.awt.datatransfer.FlavorMap var6 = var2.getFlavorMap();
    var0.setFlavorMap(var6);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var12 = var11.getFlavorMap();
    var10.setFlavorMap(var12);
    java.awt.datatransfer.FlavorMap var14 = var10.getFlavorMap();
    var8.setFlavorMap(var14);
    var0.setFlavorMap(var14);
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.Component var2 = var0.getComponent();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var5 = var4.getFlavorMap();
    var3.setFlavorMap(var5);
    java.awt.datatransfer.FlavorMap var7 = var3.getFlavorMap();
    boolean var8 = var3.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    var0.setActive(true);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.Component var9 = var0.getComponent();
    java.lang.Object[] var10 = new java.lang.Object[] { var0};
    javax.swing.JTree var11 = new javax.swing.JTree(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    var0.setActive(true);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var9.setFlavorMap(var11);
    java.awt.datatransfer.FlavorMap var13 = var9.getFlavorMap();
    var9.setActive(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.Component var2 = var0.getComponent();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var7 = var6.getFlavorMap();
    var5.setFlavorMap(var7);
    java.awt.datatransfer.FlavorMap var9 = var5.getFlavorMap();
    var3.setFlavorMap(var9);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var12 = var11.getFlavorMap();
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var15 = var14.getFlavorMap();
    var13.setFlavorMap(var15);
    java.awt.datatransfer.FlavorMap var17 = var13.getFlavorMap();
    var11.setFlavorMap(var17);
    var3.setFlavorMap(var17);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTargetContext var21 = var3.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    var0.setActive(true);
    java.awt.dnd.DropTargetContext var7 = var0.getDropTargetContext();
    int var8 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var9 = var0.getDropTargetContext();
    java.awt.Component var10 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    javax.swing.Icon var2 = var0.getCollapsedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.Component var2 = var0.getComponent();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var5 = var4.getFlavorMap();
    var3.setFlavorMap(var5);
    java.awt.datatransfer.FlavorMap var7 = var3.getFlavorMap();
    var3.setActive(true);
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    java.awt.Component var12 = var3.getComponent();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    int var14 = var3.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    javax.swing.Icon var1 = var0.getExpandedIcon();
    java.awt.Dimension var2 = var0.getPreferredMinSize();
    var0.setLeftChildIndent(3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.Component var2 = var0.getComponent();
    int var3 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    java.awt.datatransfer.FlavorMap var4 = var0.getFlavorMap();
    var0.setActive(true);
    java.awt.Component var7 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    var0.setFlavorMap(var2);
    var0.setActive(true);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var7 = var6.getFlavorMap();
    java.awt.Component var8 = var6.getComponent();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var9.setFlavorMap(var11);
    java.awt.datatransfer.FlavorMap var13 = var9.getFlavorMap();
    var9.setActive(true);
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    var9.addDropTargetListener((java.awt.dnd.DropTargetListener)var16);
    java.awt.Component var18 = var9.getComponent();
    var6.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

}
