
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var0);
    javax.swing.JComponent.setDefaultLocale(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    boolean var3 = var1.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isPaintingTile();
    javax.swing.JRootPane var3 = var1.getRootPane();
    boolean var4 = var1.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    java.awt.event.InputMethodListener[] var6 = var1.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Component var4 = var1.findComponentAt(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    var0.disable();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    java.awt.Dimension var1 = var0.getPreferredMinSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isPaintingTile();
    java.awt.Point var3 = var1.location();
    boolean var4 = var1.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    var1.setDialogType(1);
    java.awt.event.HierarchyBoundsListener[] var5 = var1.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    javax.swing.event.AncestorListener[] var6 = var1.getAncestorListeners();
    boolean var7 = var1.isLightweight();
    javax.swing.JFileChooser var10 = new javax.swing.JFileChooser("hi!");
    boolean var11 = var10.isPaintingTile();
    java.awt.Point var12 = var10.location();
    var1.putClientProperty((java.lang.Object)(short)10, (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    java.awt.Dimension var1 = var0.getMinimumSize();
    java.util.Locale var2 = javax.swing.JComponent.getDefaultLocale();
    var0.setLocale(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isPaintingTile();
    java.awt.Point var3 = var1.location();
    javax.swing.JFileChooser var5 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var6 = var5.getParent();
    var5.setFileHidingEnabled(true);
    javax.swing.SwingUtilities.convertPointToScreen(var3, (java.awt.Component)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    boolean var2 = var1.isPaintingTile();
    java.awt.Point var3 = var1.location();
    var1.enable(false);
    javax.swing.InputMap var7 = var1.getInputMap(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    javax.swing.JFileChooser var3 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var4 = var3.getParent();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("hi!");
    int var7 = var3.showOpenDialog((java.awt.Component)var6);
    var1.setNextFocusableComponent((java.awt.Component)var3);
    java.awt.Dimension var9 = var3.getPreferredSize();
    javax.swing.SwingUtilities.updateComponentTreeUI((java.awt.Component)var3);
    javax.swing.JFileChooser var12 = new javax.swing.JFileChooser("hi!");
    boolean var13 = var12.isPaintingTile();
    java.awt.Point var14 = var12.location();
    var3.setLocation(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    java.awt.Component[] var6 = var4.getComponents();
    int var7 = var4.getHeight();
    int var8 = javax.swing.SwingUtilities.getAccessibleIndexInParent((java.awt.Component)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    javax.swing.JFileChooser var3 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var4 = var3.getParent();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("hi!");
    int var7 = var3.showOpenDialog((java.awt.Component)var6);
    var1.setNextFocusableComponent((java.awt.Component)var3);
    javax.swing.ActionMap var9 = javax.swing.SwingUtilities.getUIActionMap((javax.swing.JComponent)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    java.awt.Component[] var6 = var4.getComponents();
    int var7 = var4.getHeight();
    java.awt.event.ComponentListener[] var8 = var4.getComponentListeners();
    var4.firePropertyChange("", 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    var0.disable();
    var0.grabFocus();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.plaf.basic.BasicTreeUI var0 = new javax.swing.plaf.basic.BasicTreeUI();
    var0.setRightChildIndent((-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    java.awt.Component[] var6 = var4.getComponents();
    int var7 = var4.getHeight();
    var4.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var2 = var1.getParent();
    javax.swing.JFileChooser var4 = new javax.swing.JFileChooser("hi!");
    int var5 = var1.showOpenDialog((java.awt.Component)var4);
    java.awt.Component[] var6 = var4.getComponents();
    javax.swing.JFileChooser var8 = new javax.swing.JFileChooser("hi!");
    javax.swing.JFileChooser var10 = new javax.swing.JFileChooser("hi!");
    java.awt.Container var11 = var10.getParent();
    javax.swing.JFileChooser var13 = new javax.swing.JFileChooser("hi!");
    int var14 = var10.showOpenDialog((java.awt.Component)var13);
    var8.setNextFocusableComponent((java.awt.Component)var10);
    boolean var16 = var10.isDirectorySelectionEnabled();
    int var17 = var4.showSaveDialog((java.awt.Component)var10);
    javax.swing.InputMap var18 = var4.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JFileChooser var0 = new javax.swing.JFileChooser();
    int var1 = var0.getDialogType();
    var0.setApproveButtonMnemonic(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

}
