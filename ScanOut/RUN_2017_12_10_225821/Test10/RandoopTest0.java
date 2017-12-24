
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    int var10 = var9.getDefaultActions();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.Component var2 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    int var10 = var9.getDefaultActions();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    int var14 = var13.getDefaultActions();
    var13.setActive(true);
    java.awt.Component var17 = var13.getComponent();
    java.awt.datatransfer.FlavorMap var18 = var13.getFlavorMap();
    var7.setFlavorMap(var18);
    var7.setActive(true);
    java.awt.dnd.DropTarget var22 = new java.awt.dnd.DropTarget();
    var22.setActive(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var22);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    var0.setActive(true);
    java.awt.dnd.DropTargetContext var7 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    int var10 = var9.getDefaultActions();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    int var14 = var13.getDefaultActions();
    var13.setActive(true);
    java.awt.Component var17 = var13.getComponent();
    java.awt.datatransfer.FlavorMap var18 = var13.getFlavorMap();
    var7.setFlavorMap(var18);
    var7.setActive(true);
    var7.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    var0.setActive(true);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    int var8 = var7.getDefaultActions();
    var7.setActive(true);
    java.awt.Component var11 = var7.getComponent();
    java.awt.datatransfer.FlavorMap var12 = var7.getFlavorMap();
    java.awt.datatransfer.FlavorMap var13 = var7.getFlavorMap();
    var0.setFlavorMap(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    var0.setDefaultActions(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    int var3 = var1.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var2 = var0.getDropTargetContext();
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTargetContext var6 = var1.getDropTargetContext();
    java.awt.datatransfer.FlavorMap var7 = var1.getFlavorMap();
    java.awt.Component var8 = var1.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    int var10 = var9.getDefaultActions();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTargetContext var13 = var3.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    java.awt.Component var4 = var0.getComponent();
    java.awt.datatransfer.FlavorMap var5 = var0.getFlavorMap();
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    java.awt.dnd.DropTargetContext var7 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    int var9 = var8.getDefaultActions();
    var8.setActive(true);
    java.awt.Component var12 = var8.getComponent();
    java.awt.datatransfer.FlavorMap var13 = var8.getFlavorMap();
    java.awt.datatransfer.FlavorMap var14 = var8.getFlavorMap();
    var0.setFlavorMap(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    java.awt.Component var5 = var0.getComponent();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    int var7 = var6.getDefaultActions();
    var6.setActive(true);
    java.awt.Component var10 = var6.getComponent();
    java.awt.datatransfer.FlavorMap var11 = var6.getFlavorMap();
    var0.setFlavorMap(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    java.awt.Component var4 = var0.getComponent();
    java.awt.datatransfer.FlavorMap var5 = var0.getFlavorMap();
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    int var7 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    java.awt.Component var4 = var0.getComponent();
    java.awt.datatransfer.FlavorMap var5 = var0.getFlavorMap();
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    java.awt.datatransfer.FlavorMap var7 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    java.awt.Component var4 = var0.getComponent();
    java.awt.datatransfer.FlavorMap var5 = var0.getFlavorMap();
    java.awt.datatransfer.FlavorMap var6 = var0.getFlavorMap();
    boolean var7 = var0.isActive();
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    var0.setActive(false);
    boolean var5 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var7 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTargetContext var3 = var1.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    var0.setActive(true);
    boolean var4 = var0.isActive();
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    int var7 = var6.getDefaultActions();
    var6.setActive(true);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    int var4 = var3.getDefaultActions();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    int var10 = var9.getDefaultActions();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    int var14 = var13.getDefaultActions();
    var13.setActive(true);
    java.awt.Component var17 = var13.getComponent();
    java.awt.datatransfer.FlavorMap var18 = var13.getFlavorMap();
    var7.setFlavorMap(var18);
    var7.setActive(true);
    java.awt.Component var22 = var7.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

}
