
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.plaf.basic.BasicListUI var0 = new javax.swing.plaf.basic.BasicListUI();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    boolean var1 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.Component var1 = var0.getComponent();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.Component var3 = var2.getComponent();
    var2.setDefaultActions(1);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    var0.setDefaultActions((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.dnd.DropTargetContext var1 = var0.getDropTargetContext();
    var0.setActive(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.Component var1 = var0.getComponent();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.Component var3 = var2.getComponent();
    var2.setDefaultActions(1);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    int var7 = var0.getDefaultActions();
    java.awt.Component var8 = var0.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.Component var1 = var0.getComponent();
    int var2 = var0.getDefaultActions();
    int var3 = var0.getDefaultActions();
    var0.setDefaultActions(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.plaf.synth.SynthListUI var0 = new javax.swing.plaf.synth.SynthListUI();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JList var0 = new javax.swing.JList();
    boolean var1 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    var0.setSelectedValue((java.lang.Object)var2, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.Component var1 = var0.getComponent();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.Component var3 = var2.getComponent();
    var2.setDefaultActions(1);
    var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.Component var8 = var7.getComponent();
    var7.setActive(false);
    java.awt.Component var11 = var7.getComponent();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.InputMap var1 = var0.getInputMap();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    java.awt.Component var1 = var0.getComponent();
    java.awt.dnd.DropTarget var2 = new java.awt.dnd.DropTarget();
    java.awt.Component var3 = var2.getComponent();
    var0.addDropTargetListener((java.awt.dnd.DropTargetListener)var2);
    java.awt.dnd.DropTarget var5 = new java.awt.dnd.DropTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeDropTargetListener((java.awt.dnd.DropTargetListener)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.validate();
    boolean var2 = var0.isLightweight();
    javax.swing.JList var3 = new javax.swing.JList();
    var0.setNextFocusableComponent((java.awt.Component)var3);
    java.awt.event.InputMethodListener[] var5 = var3.getInputMethodListeners();
    int var6 = var3.getFixedCellWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.InputMap var1 = var0.getInputMap();
    int var2 = var0.getY();
    var0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.InputMap var1 = var0.getInputMap();
    int var2 = var0.getY();
    int var3 = var0.getLastVisibleIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JList var0 = new javax.swing.JList();
    boolean var1 = var0.isBackgroundSet();
    java.awt.Component var4 = var0.findComponentAt(100, 1);
    javax.swing.JList var5 = new javax.swing.JList();
    boolean var6 = var5.isBackgroundSet();
    java.awt.dnd.DropTarget var7 = new java.awt.dnd.DropTarget();
    java.awt.Component var8 = var7.getComponent();
    java.awt.dnd.DropTarget var9 = new java.awt.dnd.DropTarget();
    java.awt.Component var10 = var9.getComponent();
    var9.setDefaultActions(1);
    var7.removeDropTargetListener((java.awt.dnd.DropTargetListener)var9);
    java.awt.dnd.DropTarget var14 = new java.awt.dnd.DropTarget((java.awt.Component)var5, (java.awt.dnd.DropTargetListener)var7);
    java.lang.Object var15 = var0.getClientProperty((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.InputMap var1 = var0.getInputMap();
    int var2 = var0.getY();
    boolean var3 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.validate();
    boolean var2 = var0.isLightweight();
    javax.swing.JList var3 = new javax.swing.JList();
    var0.setNextFocusableComponent((java.awt.Component)var3);
    var3.setLocation((-1), (-1));
    var3.setAutoscrolls(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.InputMap var1 = var0.getInputMap();
    boolean var2 = var0.getValueIsAdjusting();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.dnd.DropTarget var0 = new java.awt.dnd.DropTarget();
    int var1 = var0.getDefaultActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.JPopupMenu var1 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.validate();
    boolean var2 = var0.isLightweight();
    javax.swing.JList var3 = new javax.swing.JList();
    var0.setNextFocusableComponent((java.awt.Component)var3);
    java.awt.event.InputMethodListener[] var5 = var3.getInputMethodListeners();
    int var6 = var3.getFirstVisibleIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.validate();
    boolean var2 = var0.isLightweight();
    javax.swing.JList var3 = new javax.swing.JList();
    var0.setNextFocusableComponent((java.awt.Component)var3);
    java.awt.event.InputMethodListener[] var5 = var3.getInputMethodListeners();
    var3.firePropertyChange("", (short)1, (short)100);
    var3.setAlignmentX(0.0f);
    java.awt.Color var12 = var3.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JList var0 = new javax.swing.JList();
    boolean var1 = var0.isBackgroundSet();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

}
