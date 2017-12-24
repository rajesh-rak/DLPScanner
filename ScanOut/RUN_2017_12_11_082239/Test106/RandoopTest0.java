
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JFrame var0 = new javax.swing.JFrame();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTree var0 = new javax.swing.JTree();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFrame var1 = new javax.swing.JFrame("");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFrame var1 = new javax.swing.JFrame("hi!");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    javax.swing.JTree var1 = new javax.swing.JTree((java.lang.Object[])var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    boolean var6 = var5.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    boolean var6 = var5.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    var0.setFlavorMap(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    var1.setActive(false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var8 = var7.getFlavorMap();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var10 = var9.getFlavorMap();
    var7.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    java.awt.Component var12 = var7.getComponent();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var2 = var1.getFlavorMap();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    var0.setActive(true);
    var0.setDefaultActions(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    boolean var6 = var5.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var10 = var9.getFlavorMap();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var12 = var11.getFlavorMap();
    var9.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var8.setActive(true);
    var5.removeDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    var0.setDefaultActions(1);
    java.awt.Component var4 = var0.getComponent();
    var0.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    var0.setDefaultActions(1);
    boolean var4 = var0.isActive();
    int var5 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    var0.setDefaultActions(1);
    boolean var4 = var0.isActive();
    java.awt.Component var5 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    int var5 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    int var3 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var4 = var3.getFlavorMap();
    var3.setDefaultActions(1);
    java.awt.Component var7 = var3.getComponent();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var9 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var11 = var10.getFlavorMap();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    boolean var14 = var13.isActive();
    var8.addDropTargetListener((java.awt.dnd.DropTargetListener)var13);
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var17 = var16.getFlavorMap();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var19 = var18.getFlavorMap();
    var16.removeDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    boolean var22 = var21.isActive();
    var16.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    java.awt.dnd.DropTarget var24 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var26 = var25.getFlavorMap();
    var24.setFlavorMap(var26);
    var16.setFlavorMap(var26);
    var8.setFlavorMap(var26);
    var3.setFlavorMap(var26);
    var0.setFlavorMap(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    javax.swing.JTree var1 = new javax.swing.JTree((java.lang.Object[])var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var1 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.datatransfer.FlavorMap var3 = var2.getFlavorMap();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    boolean var6 = var5.isActive();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    java.awt.datatransfer.FlavorMap var8 = var5.getFlavorMap();
    var5.setDefaultActions(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
