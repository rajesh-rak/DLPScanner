
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.datatransfer.FlavorMap var4 = var2.getFlavorMap();
    java.awt.Component var5 = var2.getComponent();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    java.awt.datatransfer.FlavorMap var9 = var7.getFlavorMap();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var10.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.datatransfer.FlavorMap var13 = var11.getFlavorMap();
    var7.setFlavorMap(var13);
    var2.setFlavorMap(var13);
    var0.setFlavorMap(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    var4.setFlavorMap(var10);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
    java.awt.datatransfer.FlavorMap var14 = var12.getFlavorMap();
    var8.setFlavorMap(var14);
    var1.setFlavorMap(var14);
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    var17.addDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    var20.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    java.awt.datatransfer.FlavorMap var23 = var21.getFlavorMap();
    java.awt.dnd.DropTarget var24 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    var24.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    java.awt.datatransfer.FlavorMap var27 = var25.getFlavorMap();
    var21.setFlavorMap(var27);
    var18.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    var4.setFlavorMap(var10);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    java.awt.Component var4 = var1.getComponent();
    java.awt.datatransfer.FlavorMap var5 = var1.getFlavorMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    int var3 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.Component var3 = var0.getComponent();
    java.awt.Component var4 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    java.awt.Component var4 = var1.getComponent();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var5.addDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var8 = var6.getFlavorMap();
    java.awt.Component var9 = var6.getComponent();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var10.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.datatransfer.FlavorMap var13 = var11.getFlavorMap();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    var14.addDropTargetListener((java.awt.dnd.DropTargetListener)var15);
    java.awt.datatransfer.FlavorMap var17 = var15.getFlavorMap();
    var11.setFlavorMap(var17);
    var6.setFlavorMap(var17);
    var1.setFlavorMap(var17);
    int var21 = var1.getDefaultActions();
    var1.setActive(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.Component var4 = var1.getComponent();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    java.awt.Component var4 = var1.getComponent();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var5.addDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var8 = var6.getFlavorMap();
    java.awt.Component var9 = var6.getComponent();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    var10.addDropTargetListener((java.awt.dnd.DropTargetListener)var11);
    java.awt.datatransfer.FlavorMap var13 = var11.getFlavorMap();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    var14.addDropTargetListener((java.awt.dnd.DropTargetListener)var15);
    java.awt.datatransfer.FlavorMap var17 = var15.getFlavorMap();
    var11.setFlavorMap(var17);
    var6.setFlavorMap(var17);
    var1.setFlavorMap(var17);
    int var21 = var1.getDefaultActions();
    java.awt.Component var22 = var1.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    boolean var3 = var1.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    var4.setFlavorMap(var10);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    var13.addDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    java.awt.datatransfer.FlavorMap var16 = var14.getFlavorMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var14);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
    java.awt.datatransfer.FlavorMap var14 = var12.getFlavorMap();
    var8.setFlavorMap(var14);
    var4.setFlavorMap(var14);
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    var17.addDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    var20.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    java.awt.datatransfer.FlavorMap var23 = var21.getFlavorMap();
    java.awt.dnd.DropTarget var24 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    var24.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    java.awt.datatransfer.FlavorMap var27 = var25.getFlavorMap();
    var21.setFlavorMap(var27);
    var18.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    int var31 = var4.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
    java.awt.datatransfer.FlavorMap var14 = var12.getFlavorMap();
    var8.setFlavorMap(var14);
    var1.setFlavorMap(var14);
    var1.setDefaultActions(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var5);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    var5.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
    java.awt.datatransfer.FlavorMap var14 = var12.getFlavorMap();
    java.awt.dnd.DropTarget var15 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var16 = new java.awt.dnd.DropTarget();
    var15.addDropTargetListener((java.awt.dnd.DropTargetListener)var16);
    java.awt.datatransfer.FlavorMap var18 = var16.getFlavorMap();
    var12.setFlavorMap(var18);
    var8.setFlavorMap(var18);
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var22 = new java.awt.dnd.DropTarget();
    var21.addDropTargetListener((java.awt.dnd.DropTargetListener)var22);
    java.awt.dnd.DropTarget var24 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    var24.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    java.awt.datatransfer.FlavorMap var27 = var25.getFlavorMap();
    java.awt.dnd.DropTarget var28 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var29 = new java.awt.dnd.DropTarget();
    var28.addDropTargetListener((java.awt.dnd.DropTargetListener)var29);
    java.awt.datatransfer.FlavorMap var31 = var29.getFlavorMap();
    var25.setFlavorMap(var31);
    var22.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    var8.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    boolean var35 = var25.isActive();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    java.awt.Component var4 = var1.getComponent();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var5.addDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var8 = var6.getFlavorMap();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var10 = new java.awt.dnd.DropTarget();
    var9.addDropTargetListener((java.awt.dnd.DropTargetListener)var10);
    java.awt.datatransfer.FlavorMap var12 = var10.getFlavorMap();
    var6.setFlavorMap(var12);
    var1.setFlavorMap(var12);
    int var15 = var1.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    var7.addDropTargetListener((java.awt.dnd.DropTargetListener)var8);
    java.awt.datatransfer.FlavorMap var10 = var8.getFlavorMap();
    java.awt.dnd.DropTarget var11 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var12 = new java.awt.dnd.DropTarget();
    var11.addDropTargetListener((java.awt.dnd.DropTargetListener)var12);
    java.awt.datatransfer.FlavorMap var14 = var12.getFlavorMap();
    var8.setFlavorMap(var14);
    var1.setFlavorMap(var14);
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    var17.addDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    java.awt.dnd.DropTarget var20 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var21 = new java.awt.dnd.DropTarget();
    var20.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    var18.addDropTargetListener((java.awt.dnd.DropTargetListener)var21);
    java.awt.dnd.DropTarget var24 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var25 = new java.awt.dnd.DropTarget();
    var24.addDropTargetListener((java.awt.dnd.DropTargetListener)var25);
    java.awt.datatransfer.FlavorMap var27 = var25.getFlavorMap();
    java.awt.dnd.DropTarget var28 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var29 = new java.awt.dnd.DropTarget();
    var28.addDropTargetListener((java.awt.dnd.DropTargetListener)var29);
    java.awt.datatransfer.FlavorMap var31 = var29.getFlavorMap();
    var25.setFlavorMap(var31);
    var18.setFlavorMap(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.dnd.DropTarget var3 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var4 = new java.awt.dnd.DropTarget();
    var3.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
    java.awt.datatransfer.FlavorMap var6 = var4.getFlavorMap();
    java.awt.Component var7 = var4.getComponent();
    java.awt.dnd.DropTarget var8 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    var8.addDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    java.awt.datatransfer.FlavorMap var11 = var9.getFlavorMap();
    java.awt.Component var12 = var9.getComponent();
    java.awt.dnd.DropTarget var13 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget();
    var13.addDropTargetListener((java.awt.dnd.DropTargetListener)var14);
    java.awt.datatransfer.FlavorMap var16 = var14.getFlavorMap();
    java.awt.dnd.DropTarget var17 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var18 = new java.awt.dnd.DropTarget();
    var17.addDropTargetListener((java.awt.dnd.DropTargetListener)var18);
    java.awt.datatransfer.FlavorMap var20 = var18.getFlavorMap();
    var14.setFlavorMap(var20);
    var9.setFlavorMap(var20);
    var4.setFlavorMap(var20);
    var4.setActive(false);
    java.awt.dnd.DropTarget var26 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var27 = new java.awt.dnd.DropTarget();
    var26.addDropTargetListener((java.awt.dnd.DropTargetListener)var27);
    java.awt.datatransfer.FlavorMap var29 = var27.getFlavorMap();
    java.awt.Component var30 = var27.getComponent();
    java.awt.dnd.DropTarget var31 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var32 = new java.awt.dnd.DropTarget();
    var31.addDropTargetListener((java.awt.dnd.DropTargetListener)var32);
    java.awt.datatransfer.FlavorMap var34 = var32.getFlavorMap();
    java.awt.dnd.DropTarget var35 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var36 = new java.awt.dnd.DropTarget();
    var35.addDropTargetListener((java.awt.dnd.DropTargetListener)var36);
    java.awt.datatransfer.FlavorMap var38 = var36.getFlavorMap();
    var32.setFlavorMap(var38);
    var27.setFlavorMap(var38);
    java.awt.dnd.DropTargetContext var41 = var27.getDropTargetContext();
    var4.addDropTargetListener((java.awt.dnd.DropTargetListener)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var4);
      fail("Expected exception of type java.util.TooManyListenersException");
    } catch (java.util.TooManyListenersException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var1);
    java.awt.datatransfer.FlavorMap var3 = var1.getFlavorMap();
    var1.setDefaultActions(100);
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    var6.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    var1.removeDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var1 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    var1.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.datatransfer.FlavorMap var4 = var2.getFlavorMap();
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTarget var6 = new java.awt.dnd.DropTarget();
    var5.addDropTargetListener((java.awt.dnd.DropTargetListener)var6);
    java.awt.datatransfer.FlavorMap var8 = var6.getFlavorMap();
    var2.setFlavorMap(var8);
    var0.setFlavorMap(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
