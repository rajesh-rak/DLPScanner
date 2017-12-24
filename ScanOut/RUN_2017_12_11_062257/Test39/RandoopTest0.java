
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.JPopupMenu.getDefaultLightWeightPopupEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    javax.swing.plaf.LabelUI var4 = var2.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    java.lang.Object var3 = var1.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    java.awt.Container var4 = var2.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    boolean var4 = var2.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    boolean var3 = var2.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.lang.Object var4 = var2.getClientProperty((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var6 = var2.getComponent((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    var1.menuSelectionChanged(false);
    java.awt.Component var7 = var1.findComponentAt(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    var2.reshape(0, 10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    int var3 = var1.getY();
    var1.firePropertyChange("", (short)100, (short)10);
    var1.firePropertyChange("hi!", 1.0d, 100.0d);
    javax.swing.event.AncestorListener[] var12 = var1.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    boolean var3 = var1.isArmed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    int var3 = var1.getY();
    javax.swing.JLabel var6 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var7 = var6.getFocusListeners();
    java.awt.Component var9 = var1.add((java.awt.Component)var6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JMenuItem var1 = new javax.swing.JMenuItem("");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    boolean var2 = var1.hasFocus();
    java.awt.Insets var3 = var1.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    int var3 = var1.getY();
    var1.firePropertyChange("", (short)100, (short)10);
    var1.firePropertyChange("hi!", 1.0d, 100.0d);
    java.beans.VetoableChangeListener[] var12 = var1.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JCheckBox var2 = new javax.swing.JCheckBox("hi!", true);
    var2.setIconTextGap(1);
    javax.accessibility.AccessibleContext var5 = var2.getAccessibleContext();
    var2.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.menuSelectionChanged(true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JRadioButton var0 = new javax.swing.JRadioButton();
    java.awt.Insets var1 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.setEnabled(true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(10);
    var1.setSelectionEnd(0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    var1.repaint();
    int var3 = var1.getY();
    java.lang.String var4 = var1.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JMenu var1 = new javax.swing.JMenu("");
    javax.swing.ButtonModel var2 = var1.getModel();
    var1.setMultiClickThreshhold(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    javax.swing.RepaintManager var4 = javax.swing.RepaintManager.currentManager((java.awt.Component)var2);
    var2.nextFocus();
    var2.setDisplayedMnemonic('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JRadioButtonMenuItem var1 = new javax.swing.JRadioButtonMenuItem("hi!");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JTextField var1 = new javax.swing.JTextField(10);
    var1.setSelectionEnd((-1));
    java.awt.Rectangle var5 = var1.modelToView(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JLabel var2 = new javax.swing.JLabel("", 0);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    boolean var4 = var2.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JPopupMenu var1 = new javax.swing.JPopupMenu("");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JPanel var1 = new javax.swing.JPanel(true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JRadioButtonMenuItem var0 = new javax.swing.JRadioButtonMenuItem();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.plaf.basic.BasicTextAreaUI var0 = new javax.swing.plaf.basic.BasicTextAreaUI();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.awt.Frame var0 = javax.swing.JOptionPane.getRootFrame();

  }

}
