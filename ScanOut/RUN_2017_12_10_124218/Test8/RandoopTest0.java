
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    var3.setDefaultActions(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    var17.setActive(true);
    java.awt.datatransfer.FlavorMap var20 = var17.getFlavorMap();
    var0.setFlavorMap(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var6.setActive(true);
    int var9 = var6.getDefaultActions();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    var6.setDefaultActions(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var6.setActive(true);
    int var9 = var6.getDefaultActions();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    boolean var12 = var6.isActive();
    java.awt.Component var13 = var6.getComponent();
    var6.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    int var3 = var0.getDefaultActions();
    var0.setDefaultActions(0);
    java.awt.Component var6 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    java.awt.Component var4 = var0.getComponent();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    int var3 = var0.getDefaultActions();
    java.awt.dnd.DropTargetContext var4 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    boolean var17 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    java.awt.Component var4 = var0.getComponent();
    java.awt.dnd.DropTargetContext var5 = var0.getDropTargetContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var6.setActive(true);
    int var9 = var6.getDefaultActions();
    var3.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    var0.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    int var4 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    int var3 = var0.getDefaultActions();
    var0.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var11.setActive(true);
    java.awt.datatransfer.FlavorMap var19 = var11.getFlavorMap();
    int var20 = var11.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var11.setActive(true);
    boolean var19 = var11.isActive();
    int var20 = var11.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setDefaultActions((-1));
    boolean var6 = var3.isActive();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.Component var8 = var0.getComponent();
    boolean var9 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    var0.setActive(true);
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    var10.setActive(true);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    var13.setActive(true);
    int var16 = var13.getDefaultActions();
    var10.removeDropTargetListener((java.awt.dnd.DropTargetListener)var13);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setDefaultActions((-1));
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setDefaultActions((-1));
    boolean var6 = var3.isActive();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.Component var8 = var0.getComponent();
    java.awt.Component var9 = var0.getComponent();
    java.awt.datatransfer.FlavorMap var10 = var0.getFlavorMap();
    var0.setActive(false);
    java.awt.datatransfer.FlavorMap var13 = var0.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    var17.setDefaultActions((-1));
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    var20.setActive(true);
    java.awt.dnd.DropTarget var23 = new java.awt.dnd.DropTarget();
    var23.setActive(true);
    int var26 = var23.getDefaultActions();
    var20.removeDropTargetListener((java.awt.dnd.DropTargetListener)var23);
    var17.removeDropTargetListener((java.awt.dnd.DropTargetListener)var20);
    java.awt.dnd.DropTarget var29 = new java.awt.dnd.DropTarget();
    var29.setActive(true);
    java.awt.datatransfer.FlavorMap var32 = var29.getFlavorMap();
    var17.setFlavorMap(var32);
    var11.setFlavorMap(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    var3.setActive(true);
    int var6 = var3.getDefaultActions();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var11.setActive(true);
    java.awt.Component var19 = var11.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var4.setDefaultActions((-1));
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var7.setActive(true);
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    var10.setActive(true);
    int var13 = var10.getDefaultActions();
    var7.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    var4.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    boolean var16 = var10.isActive();
    java.awt.Component var17 = var10.getComponent();
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    java.awt.dnd.DropTarget var19 = new java.awt.dnd.DropTarget();
    var19.setDefaultActions((-1));
    java.awt.dnd.DropTarget var22 = new java.awt.dnd.DropTarget();
    var22.setActive(true);
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    var25.setActive(true);
    int var28 = var25.getDefaultActions();
    var22.removeDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    var19.removeDropTargetListener((java.awt.dnd.DropTargetListener)var22);
    java.awt.dnd.DropTarget var31 = new java.awt.dnd.DropTarget();
    var31.setActive(true);
    java.awt.datatransfer.FlavorMap var34 = var31.getFlavorMap();
    var19.setFlavorMap(var34);
    var10.setFlavorMap(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    var0.setActive(true);
    java.awt.datatransfer.FlavorMap var3 = var0.getFlavorMap();
    java.awt.Component var4 = var0.getComponent();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    var5.setDefaultActions((-1));
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var8.setActive(true);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var11.setActive(true);
    int var14 = var11.getDefaultActions();
    var8.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    var5.removeDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    boolean var17 = var11.isActive();
    java.awt.Component var18 = var11.getComponent();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    var20.setActive(true);
    java.awt.dnd.DropTarget var23 = new java.awt.dnd.DropTarget();
    var23.setActive(true);
    int var26 = var23.getDefaultActions();
    var20.removeDropTargetListener((java.awt.dnd.DropTargetListener)var23);
    java.awt.dnd.DropTarget var28 = new java.awt.dnd.DropTarget();
    var28.setActive(true);
    java.awt.dnd.DropTarget var31 = new java.awt.dnd.DropTarget();
    var31.setActive(true);
    int var34 = var31.getDefaultActions();
    var28.removeDropTargetListener((java.awt.dnd.DropTargetListener)var31);
    var20.addDropTargetListener((java.awt.dnd.DropTargetListener)var31);
    var31.setActive(true);
    java.awt.datatransfer.FlavorMap var39 = var31.getFlavorMap();
    var11.removeDropTargetListener((java.awt.dnd.DropTargetListener)var31);
    java.awt.dnd.DropTarget var41 = new java.awt.dnd.DropTarget();
    var41.setDefaultActions((-1));
    java.awt.dnd.DropTarget var44 = new java.awt.dnd.DropTarget();
    var44.setDefaultActions((-1));
    boolean var47 = var44.isActive();
    var41.removeDropTargetListener((java.awt.dnd.DropTargetListener)var44);
    java.awt.Component var49 = var41.getComponent();
    java.awt.Component var50 = var41.getComponent();
    java.awt.datatransfer.FlavorMap var51 = var41.getFlavorMap();
    var41.setActive(false);
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

}
