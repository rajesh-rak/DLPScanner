
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    int var4 = var2.getVisibleRowCount();
    boolean var5 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setFocusCycleRoot(true);
    java.lang.Object[] var6 = new java.lang.Object[] { 100L};
    javax.swing.JList var7 = new javax.swing.JList(var6);
    var7.setFocusCycleRoot(true);
    boolean var10 = var7.getValueIsAdjusting();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var12 = var2.add((java.awt.Component)var7, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    boolean var4 = var2.requestFocus(true);
    var2.setSelectionInterval(1, 10);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    boolean var4 = var2.requestFocus(true);
    java.beans.PropertyChangeListener[] var6 = var2.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setFocusCycleRoot(true);
    boolean var5 = var2.getValueIsAdjusting();
    java.awt.event.KeyListener[] var6 = var2.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setFocusCycleRoot(true);
    boolean var5 = var2.getValueIsAdjusting();
    javax.swing.ActionMap var6 = var2.getActionMap();
    var2.requestFocus();
    java.awt.Container var8 = var2.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    javax.swing.plaf.ComponentUI var3 = javax.swing.plaf.synth.SynthTreeUI.createUI((javax.swing.JComponent)var2);
    java.lang.Object[] var5 = new java.lang.Object[] { 100L};
    javax.swing.JList var6 = new javax.swing.JList(var5);
    var6.setFocusCycleRoot(true);
    boolean var9 = var6.getValueIsAdjusting();
    javax.swing.ActionMap var10 = var6.getActionMap();
    boolean var13 = var3.contains((javax.swing.JComponent)var6, 1, (-1));
    boolean var14 = var6.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setFocusCycleRoot(true);
    java.lang.Object[] var7 = new java.lang.Object[] { 100L};
    javax.swing.JList var8 = new javax.swing.JList(var7);
    var2.setPrototypeCellValue((java.lang.Object)var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setFocusCycleRoot(true);
    boolean var5 = var2.getValueIsAdjusting();
    javax.swing.ActionMap var6 = var2.getActionMap();
    int var9 = var2.getBaseline(10, 8);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.plaf.synth.SynthTreeUI var0 = new javax.swing.plaf.synth.SynthTreeUI();
    int var1 = var0.getRightChildIndent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    int var4 = var2.getVisibleRowCount();
    java.beans.VetoableChangeListener[] var5 = var2.getVetoableChangeListeners();
    boolean var6 = var2.isForegroundSet();
    boolean var7 = var2.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    java.awt.Component[] var4 = var2.getComponents();
    java.awt.event.ComponentListener[] var5 = var2.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    boolean var3 = var2.getDragEnabled();
    var2.setVisibleRowCount(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var7 = var2.getComponent((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setFocusCycleRoot(true);
    var2.firePropertyChange("", (-1L), 0L);
    java.awt.peer.ComponentPeer var10 = var2.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setFocusCycleRoot(true);
    var2.firePropertyChange("", (-1L), 0L);
    java.lang.Object[] var12 = new java.lang.Object[] { 100L};
    javax.swing.JList var13 = new javax.swing.JList(var12);
    int var14 = var13.getFixedCellHeight();
    var13.setSize(100, 100);
    java.lang.Object[] var19 = new java.lang.Object[] { 100L};
    javax.swing.JList var20 = new javax.swing.JList(var19);
    boolean var21 = var20.getDragEnabled();
    var20.setVisibleRowCount(100);
    var13.remove((java.awt.Component)var20);
    java.awt.Component var25 = var2.add("hi!", (java.awt.Component)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setFocusCycleRoot(true);
    boolean var6 = var2.getFocusTraversalKeysEnabled();
    var2.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.firePropertyChange("hi!", (short)(-1), (short)1);
    int var8 = var2.getVisibleRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.repaint((-1L));
    boolean var6 = var2.isOptimizedDrawingEnabled();
    var2.firePropertyChange("hi!", 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    boolean var3 = var2.getDragEnabled();
    var2.setVisibleRowCount(100);
    boolean var6 = var2.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    var2.setFocusCycleRoot(true);
    boolean var5 = var2.getValueIsAdjusting();
    var2.ensureIndexIsVisible(100);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setSize(100, 100);
    java.lang.Object[] var8 = new java.lang.Object[] { 100L};
    javax.swing.JList var9 = new javax.swing.JList(var8);
    boolean var10 = var9.getDragEnabled();
    var9.setVisibleRowCount(100);
    var2.remove((java.awt.Component)var9);
    java.awt.event.ContainerListener[] var14 = var9.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    int var3 = var2.getFixedCellHeight();
    var2.setFocusCycleRoot(true);
    var2.firePropertyChange("", (-1L), 0L);
    java.awt.Component var12 = var2.locate(8, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    java.lang.Object var3 = var2.getSelectedValue();
    java.awt.peer.ComponentPeer var4 = var2.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 100L};
    javax.swing.JList var2 = new javax.swing.JList(var1);
    boolean var3 = var2.getDragEnabled();
    var2.setVisibleRowCount(100);
    int var6 = var2.getX();
    boolean var7 = var2.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

}
