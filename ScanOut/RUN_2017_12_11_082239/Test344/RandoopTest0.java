
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.event.HierarchyListener[] var4 = var2.getHierarchyListeners();
    var2.enableInputMethods(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.setFocusTraversalPolicyProvider(false);
    javax.swing.SwingUtilities.updateComponentTreeUI((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("");
    boolean var7 = var6.isMinimumSizeSet();
    var6.setFocusTraversalPolicyProvider(false);
    var6.resetChoosableFileFilters();
    boolean var11 = javax.swing.SwingUtilities.isDescendingFrom((java.awt.Component)var2, (java.awt.Component)var6);
    var2.setApproveButtonText("");
    java.awt.event.KeyListener[] var14 = var2.getKeyListeners();
    java.awt.Container var15 = javax.swing.SwingUtilities.getUnwrappedParent((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.firePropertyChange("hi!", (byte)1, (byte)1);
    javax.swing.JFileChooser var8 = new javax.swing.JFileChooser("");
    boolean var9 = var8.isMinimumSizeSet();
    var8.setFocusTraversalPolicyProvider(false);
    var8.resetChoosableFileFilters();
    var8.setEnabled(false);
    int var15 = var8.getHeight();
    boolean var16 = var1.isAncestorOf((java.awt.Component)var8);
    var1.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.setFocusTraversalPolicyProvider(false);
    var1.resetChoosableFileFilters();
    var1.setEnabled(false);
    java.awt.event.KeyListener[] var8 = var1.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("");
    boolean var7 = var6.isMinimumSizeSet();
    var6.setFocusTraversalPolicyProvider(false);
    var6.resetChoosableFileFilters();
    boolean var11 = javax.swing.SwingUtilities.isDescendingFrom((java.awt.Component)var2, (java.awt.Component)var6);
    var2.setApproveButtonText("");
    int var14 = var2.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.setFocusTraversalPolicyProvider(false);
    var1.resetChoosableFileFilters();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setFileSelectionMode(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.event.HierarchyListener[] var4 = var2.getHierarchyListeners();
    java.beans.PropertyChangeListener[] var6 = var2.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    int var5 = var2.getY();
    javax.swing.filechooser.FileFilter[] var6 = var2.getChoosableFileFilters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.setFocusTraversalPolicyProvider(false);
    var1.resetChoosableFileFilters();
    var1.setDialogTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.setFocusTraversalPolicyProvider(false);
    var1.resetChoosableFileFilters();
    var1.setEnabled(false);
    var1.repaint(1L, 100, 10, 1, 10);
    boolean var14 = var1.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    int var5 = var2.getY();
    var2.invalidate();
    int var7 = var2.getX();
    javax.swing.filechooser.FileFilter[] var8 = var2.getChoosableFileFilters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("");
    boolean var7 = var6.isMinimumSizeSet();
    var6.setFocusTraversalPolicyProvider(false);
    var6.resetChoosableFileFilters();
    boolean var11 = javax.swing.SwingUtilities.isDescendingFrom((java.awt.Component)var2, (java.awt.Component)var6);
    var2.setApproveButtonText("");
    int var16 = var2.getBaseline(10, 100);
    var2.setAutoscrolls(false);
    var2.setFileSelectionMode(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JFileChooser var1 = new javax.swing.JFileChooser("");
    boolean var2 = var1.isMinimumSizeSet();
    var1.firePropertyChange("hi!", (byte)1, (byte)1);
    java.awt.Component var7 = javax.swing.SwingUtilities.getRoot((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JFileChooser var2 = new javax.swing.JFileChooser("");
    java.awt.Container var3 = javax.swing.SwingUtilities.getAncestorNamed("hi!", (java.awt.Component)var2);
    java.awt.Component.BaselineResizeBehavior var4 = var2.getBaselineResizeBehavior();
    javax.swing.JFileChooser var6 = new javax.swing.JFileChooser("");
    boolean var7 = var6.isMinimumSizeSet();
    var6.setFocusTraversalPolicyProvider(false);
    var6.resetChoosableFileFilters();
    boolean var11 = javax.swing.SwingUtilities.isDescendingFrom((java.awt.Component)var2, (java.awt.Component)var6);
    var2.setApproveButtonText("");
    java.awt.event.KeyListener[] var14 = var2.getKeyListeners();
    java.awt.Component var15 = javax.swing.SwingUtilities.getRoot((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

}
