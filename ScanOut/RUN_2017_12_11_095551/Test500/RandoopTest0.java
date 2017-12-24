
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JTabbedPane var2 = new javax.swing.JTabbedPane((-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JTextField var2 = new javax.swing.JTextField("", (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var0);
    java.awt.event.HierarchyBoundsListener[] var5 = var0.getHierarchyBoundsListeners();
    var0.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var0);
    javax.swing.JPopupMenu var5 = new javax.swing.JPopupMenu();
    java.awt.Component var8 = var5.getComponentAt(10, 1);
    javax.swing.RepaintManager var9 = javax.swing.RepaintManager.currentManager((java.awt.Component)var5);
    var4.markCompletelyDirty((javax.swing.JComponent)var5);
    var5.firePropertyChange("", 'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    javax.swing.InputVerifier var1 = var0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    var0.firePropertyChange("hi!", 100L, 0L);
    javax.swing.MenuElement[] var8 = var0.getSubElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    var0.firePropertyChange("hi!", 100L, 0L);
    boolean var8 = var0.isFocusTraversalPolicyProvider();
    java.awt.Insets var9 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    int var4 = javax.swing.JLayeredPane.getLayer((javax.swing.JComponent)var0);
    boolean var5 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane.registerEditorKitForContentType("hi!", "");

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField("hi!");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    var0.grabFocus();
    javax.swing.JPopupMenu var2 = new javax.swing.JPopupMenu();
    java.awt.Component var5 = var2.getComponentAt(10, 1);
    javax.swing.RepaintManager var6 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    javax.swing.JPopupMenu var7 = new javax.swing.JPopupMenu();
    java.awt.Component var10 = var7.getComponentAt(10, 1);
    javax.swing.RepaintManager var11 = javax.swing.RepaintManager.currentManager((java.awt.Component)var7);
    var6.markCompletelyDirty((javax.swing.JComponent)var7);
    javax.swing.JPopupMenu var13 = new javax.swing.JPopupMenu();
    java.awt.Component var16 = var13.getComponentAt(10, 1);
    javax.swing.RepaintManager var17 = javax.swing.RepaintManager.currentManager((java.awt.Component)var13);
    java.awt.event.HierarchyBoundsListener[] var18 = var13.getHierarchyBoundsListeners();
    java.awt.Component var19 = var13.getComponent();
    var7.remove((java.awt.Component)var13);
    var0.insert((java.awt.Component)var7, 100);
    var7.grabFocus();
    var7.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JPanel var0 = new javax.swing.JPanel();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component.BaselineResizeBehavior var1 = var0.getBaselineResizeBehavior();
    boolean var2 = var0.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    var0.grabFocus();
    javax.swing.JPopupMenu var2 = new javax.swing.JPopupMenu();
    java.awt.Component var5 = var2.getComponentAt(10, 1);
    javax.swing.RepaintManager var6 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    javax.swing.JPopupMenu var7 = new javax.swing.JPopupMenu();
    java.awt.Component var10 = var7.getComponentAt(10, 1);
    javax.swing.RepaintManager var11 = javax.swing.RepaintManager.currentManager((java.awt.Component)var7);
    var6.markCompletelyDirty((javax.swing.JComponent)var7);
    javax.swing.JPopupMenu var13 = new javax.swing.JPopupMenu();
    java.awt.Component var16 = var13.getComponentAt(10, 1);
    javax.swing.RepaintManager var17 = javax.swing.RepaintManager.currentManager((java.awt.Component)var13);
    java.awt.event.HierarchyBoundsListener[] var18 = var13.getHierarchyBoundsListeners();
    java.awt.Component var19 = var13.getComponent();
    var7.remove((java.awt.Component)var13);
    var0.insert((java.awt.Component)var7, 100);
    var7.setLabel("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JToolBar var0 = new javax.swing.JToolBar();
    boolean var1 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var0);
    javax.swing.JPopupMenu var5 = new javax.swing.JPopupMenu();
    java.awt.Component var8 = var5.getComponentAt(10, 1);
    javax.swing.RepaintManager var9 = javax.swing.RepaintManager.currentManager((java.awt.Component)var5);
    var4.markCompletelyDirty((javax.swing.JComponent)var5);
    javax.swing.JPopupMenu var11 = new javax.swing.JPopupMenu();
    java.awt.Component var14 = var11.getComponentAt(10, 1);
    javax.swing.RepaintManager var15 = javax.swing.RepaintManager.currentManager((java.awt.Component)var11);
    java.awt.event.HierarchyBoundsListener[] var16 = var11.getHierarchyBoundsListeners();
    java.awt.Component var17 = var11.getComponent();
    var5.remove((java.awt.Component)var11);
    boolean var19 = var5.isMaximumSizeSet();
    var5.repaint(10L, 10, 0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var0);
    javax.swing.JPopupMenu var5 = new javax.swing.JPopupMenu();
    java.awt.Component var8 = var5.getComponentAt(10, 1);
    javax.swing.RepaintManager var9 = javax.swing.RepaintManager.currentManager((java.awt.Component)var5);
    var4.markCompletelyDirty((javax.swing.JComponent)var5);
    javax.swing.JPopupMenu var11 = new javax.swing.JPopupMenu();
    java.awt.Component var14 = var11.getComponentAt(10, 1);
    var11.setVisible(false);
    boolean var17 = var4.isCompletelyDirty((javax.swing.JComponent)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    var0.grabFocus();
    javax.swing.JPopupMenu var2 = new javax.swing.JPopupMenu();
    java.awt.Component var5 = var2.getComponentAt(10, 1);
    javax.swing.RepaintManager var6 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    javax.swing.JPopupMenu var7 = new javax.swing.JPopupMenu();
    java.awt.Component var10 = var7.getComponentAt(10, 1);
    javax.swing.RepaintManager var11 = javax.swing.RepaintManager.currentManager((java.awt.Component)var7);
    var6.markCompletelyDirty((javax.swing.JComponent)var7);
    javax.swing.JPopupMenu var13 = new javax.swing.JPopupMenu();
    java.awt.Component var16 = var13.getComponentAt(10, 1);
    javax.swing.RepaintManager var17 = javax.swing.RepaintManager.currentManager((java.awt.Component)var13);
    java.awt.event.HierarchyBoundsListener[] var18 = var13.getHierarchyBoundsListeners();
    java.awt.Component var19 = var13.getComponent();
    var7.remove((java.awt.Component)var13);
    var0.insert((java.awt.Component)var7, 100);
    var7.grabFocus();
    var7.setFocusable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    boolean var1 = var0.getFocusTraversalKeysEnabled();
    java.awt.Container var2 = var0.getParent();
    javax.swing.plaf.SeparatorUI var3 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    var0.firePropertyChange("hi!", 100L, 0L);
    boolean var8 = var0.isFocusTraversalPolicyProvider();
    var0.updateUI();
    var0.repaint(0L, 0, 0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JToolBar var0 = new javax.swing.JToolBar();
    var0.setBorderPainted(true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    boolean var1 = var0.getFocusTraversalKeysEnabled();
    java.awt.Container var2 = var0.getParent();
    int var3 = var0.getWidth();
    boolean var4 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JSeparator var0 = new javax.swing.JSeparator();
    java.awt.event.InputMethodListener[] var1 = var0.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JPopupMenu var0 = new javax.swing.JPopupMenu();
    java.awt.Component var3 = var0.getComponentAt(10, 1);
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var0);
    javax.swing.JPopupMenu var5 = new javax.swing.JPopupMenu();
    java.awt.Component var8 = var5.getComponentAt(10, 1);
    javax.swing.RepaintManager var9 = javax.swing.RepaintManager.currentManager((java.awt.Component)var5);
    var4.markCompletelyDirty((javax.swing.JComponent)var5);
    javax.swing.JPopupMenu var11 = new javax.swing.JPopupMenu();
    java.awt.Component var14 = var11.getComponentAt(10, 1);
    javax.swing.RepaintManager var15 = javax.swing.RepaintManager.currentManager((java.awt.Component)var11);
    java.awt.event.HierarchyBoundsListener[] var16 = var11.getHierarchyBoundsListeners();
    java.awt.Component var17 = var11.getComponent();
    var5.remove((java.awt.Component)var11);
    var5.setLabel("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

}
