
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    javax.swing.JTree var1 = new javax.swing.JTree((java.lang.Object[])var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    javax.swing.JTree var1 = new javax.swing.JTree((java.lang.Object[])var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(10);
    boolean var3 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    var9.setDefaultActions(10);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    var9.setDefaultActions(10);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    java.awt.Component var13 = var3.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    int var2 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    boolean var0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.datatransfer.FlavorMap var9 = var3.getFlavorMap();
    var3.setDefaultActions(1);
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    int var13 = var12.getDefaultActions();
    java.awt.dnd.DropTargetContext var14 = var12.getDropTargetContext();
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    int var16 = var15.getDefaultActions();
    java.awt.dnd.DropTargetContext var17 = var15.getDropTargetContext();
    var12.removeDropTargetListener((java.awt.dnd.DropTargetListener)var15);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions(10);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    int var7 = var6.getDefaultActions();
    java.awt.dnd.DropTargetContext var8 = var6.getDropTargetContext();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.dnd.DropTargetContext var10 = var3.getDropTargetContext();
    var3.setActive(false);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    var9.setDefaultActions(10);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.setDefaultActions(3);
    var3.setActive(false);
    boolean var17 = var3.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 10L};
    javax.swing.JTree var2 = new javax.swing.JTree(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.Component var7 = var0.getComponent();
    java.awt.dnd.DropTargetContext var8 = var0.getDropTargetContext();
    boolean var9 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.Component var7 = var0.getComponent();
    int var8 = var0.getDefaultActions();
    var0.setActive(false);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    int var12 = var11.getDefaultActions();
    java.awt.dnd.DropTargetContext var13 = var11.getDropTargetContext();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    int var15 = var14.getDefaultActions();
    java.awt.dnd.DropTargetContext var16 = var14.getDropTargetContext();
    var11.removeDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    var14.removeDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    var14.setActive(true);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    java.awt.dnd.DropTargetContext var5 = var3.getDropTargetContext();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    var3.setActive(true);
    java.awt.dnd.DropTargetContext var11 = var3.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTargetContext var3 = var0.getDropTargetContext();
    var0.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    var0.setFlavorMap(var4);
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
