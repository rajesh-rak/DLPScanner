
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    var3.scrollRowToVisible((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    javax.swing.JTree var7 = new javax.swing.JTree();
    javax.swing.JTree var10 = new javax.swing.JTree();
    java.awt.Point var11 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var7, 100, (-1), (java.awt.Component)var10);
    java.awt.Point var12 = var3.getLocation(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.event.MouseMotionListener[] var5 = var3.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    boolean var6 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    var0.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    boolean var9 = var3.areFocusTraversalKeysSet(0);
    boolean var10 = var3.isVisible();
    var3.firePropertyChange("", 1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    boolean var9 = var3.areFocusTraversalKeysSet(0);
    java.awt.Graphics var10 = var3.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    boolean var6 = var3.isExpanded(1);
    int var7 = var3.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.tree.TreePath[] var1 = new javax.swing.tree.TreePath[] { };
    var0.addSelectionPaths(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    var3.disable();
    var3.firePropertyChange("", 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    java.lang.Object var8 = var3.getClientProperty((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    boolean var9 = var3.areFocusTraversalKeysSet(0);
    boolean var10 = var3.isVisible();
    var3.firePropertyChange("", 10L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    var0.setToggleClickCount(1);
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    var0.firePropertyChange("", '#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    boolean var6 = var3.isExpanded(1);
    java.awt.Component.BaselineResizeBehavior var7 = var3.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    int var1 = var0.getX();
    boolean var2 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    boolean var9 = var3.areFocusTraversalKeysSet(0);
    javax.accessibility.Accessible var11 = javax.swing.SwingUtilities.getAccessibleChild((java.awt.Component)var3, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    boolean var9 = var3.areFocusTraversalKeysSet(0);
    boolean var10 = var3.isVisible();
    javax.swing.ActionMap var11 = javax.swing.SwingUtilities.getUIActionMap((javax.swing.JComponent)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    javax.swing.tree.TreePath var6 = var3.getSelectionPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    var0.setToggleClickCount(1);
    javax.swing.JPopupMenu var8 = var0.getComponentPopupMenu();
    java.awt.Container var9 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTree var1 = new javax.swing.JTree();
    javax.swing.JTree var4 = new javax.swing.JTree();
    java.awt.Point var5 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var1, 100, (-1), (java.awt.Component)var4);
    java.awt.Container var6 = javax.swing.SwingUtilities.getAncestorNamed("", (java.awt.Component)var1);
    var1.firePropertyChange("hi!", 1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    javax.swing.JTree var6 = new javax.swing.JTree();
    javax.swing.JTree var9 = new javax.swing.JTree();
    java.awt.Point var10 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var6, 100, (-1), (java.awt.Component)var9);
    javax.swing.JTree var11 = new javax.swing.JTree();
    javax.swing.JTree var14 = new javax.swing.JTree();
    java.awt.Point var15 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var11, 100, (-1), (java.awt.Component)var14);
    java.awt.ComponentOrientation var16 = var14.getComponentOrientation();
    var9.applyComponentOrientation(var16);
    var3.applyComponentOrientation(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    int var6 = var0.getToggleClickCount();
    boolean var7 = var0.stopEditing();
    javax.swing.plaf.TreeUI var8 = var0.getUI();
    javax.swing.JTree var9 = new javax.swing.JTree();
    javax.swing.JTree var12 = new javax.swing.JTree();
    java.awt.Point var13 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var9, 100, (-1), (java.awt.Component)var12);
    java.awt.GraphicsConfiguration var14 = var9.getGraphicsConfiguration();
    int var15 = var9.getToggleClickCount();
    boolean var18 = var8.contains((javax.swing.JComponent)var9, (-1), (-1));
    javax.swing.JRootPane var19 = var9.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    int var1 = var0.getX();
    boolean var2 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    boolean var6 = var3.requestFocus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JTree var0 = new javax.swing.JTree();
    javax.swing.JTree var3 = new javax.swing.JTree();
    java.awt.Point var4 = javax.swing.SwingUtilities.convertPoint((java.awt.Component)var0, 100, (-1), (java.awt.Component)var3);
    java.awt.ComponentOrientation var5 = var3.getComponentOrientation();
    java.awt.Container var6 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var3);
    var3.enable();
    javax.swing.ActionMap var8 = var3.getActionMap();
    var3.setRowHeight((-1));
    var3.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
