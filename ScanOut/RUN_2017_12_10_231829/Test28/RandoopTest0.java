
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFrame var1 = new javax.swing.JFrame("");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    int var4 = var0.getY();
    boolean var7 = var0.contains(100, 100);
    java.awt.event.ContainerListener[] var8 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    int var4 = var0.getY();
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var1 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    int var2 = var0.getY();
    java.awt.Dimension var3 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    java.awt.event.MouseWheelListener[] var4 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    int var4 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    int var4 = var0.getBaseline(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    int var2 = var0.getY();
    var0.setEnabled(false);
    int var5 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    int var4 = var0.getY();
    var0.firePropertyChange("hi!", false, false);
    java.lang.Object var9 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    java.util.Locale var4 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var5 = var0.getClientProperty((java.lang.Object)var4);
    java.awt.FocusTraversalPolicy var6 = var0.getFocusTraversalPolicy();
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    java.awt.image.ColorModel var8 = var0.getColorModel();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    var0.hide();
    javax.swing.JRootPane var2 = new javax.swing.JRootPane();
    boolean var5 = var2.inside(100, 1);
    java.util.Locale var6 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var7 = var2.getClientProperty((java.lang.Object)var6);
    java.awt.FocusTraversalPolicy var8 = var2.getFocusTraversalPolicy();
    boolean var9 = var0.isAncestorOf((java.awt.Component)var2);
    boolean var10 = var2.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    java.awt.Color var4 = var0.getBackground();
    javax.swing.JRootPane var5 = new javax.swing.JRootPane();
    var5.hide();
    var5.setRequestFocusEnabled(false);
    javax.swing.TransferHandler var9 = var5.getTransferHandler();
    boolean var10 = var0.isFocusCycleRoot((java.awt.Container)var5);
    var0.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    java.awt.Container var1 = var0.getFocusCycleRootAncestor();
    javax.swing.event.AncestorListener[] var2 = var0.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    java.util.Locale var4 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var5 = var0.getClientProperty((java.lang.Object)var4);
    java.awt.FocusTraversalPolicy var6 = var0.getFocusTraversalPolicy();
    javax.swing.JRootPane var7 = new javax.swing.JRootPane();
    boolean var10 = var7.inside(100, 1);
    java.util.Locale var11 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var12 = var7.getClientProperty((java.lang.Object)var11);
    var0.setLocale(var11);
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    int var2 = var0.getY();
    var0.setEnabled(false);
    int var5 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    java.awt.Rectangle var2 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    var0.doLayout();
    var0.enable(false);
    boolean var5 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    boolean var3 = var0.inside(100, 1);
    java.util.Locale var4 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var5 = var0.getClientProperty((java.lang.Object)var4);
    java.awt.FocusTraversalPolicy var6 = var0.getFocusTraversalPolicy();
    javax.swing.JRootPane var7 = new javax.swing.JRootPane();
    boolean var10 = var7.inside(100, 1);
    java.util.Locale var11 = javax.swing.JComponent.getDefaultLocale();
    java.lang.Object var12 = var7.getClientProperty((java.lang.Object)var11);
    var0.setLocale(var11);
    int var14 = var0.getHeight();
    var0.setSize(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JRootPane var0 = new javax.swing.JRootPane();
    float var1 = var0.getAlignmentX();
    int var2 = var0.getY();
    var0.setEnabled(false);
    java.awt.event.MouseWheelListener[] var5 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
