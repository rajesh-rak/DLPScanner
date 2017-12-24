
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JScrollPane var2 = new javax.swing.JScrollPane(1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.ListModel var1 = var0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    var0.enableInputMethods(true);
    java.awt.Insets var3 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("hi!", 1, 0);
    int var5 = var0.getSelectedIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (-1.0d)};
    javax.swing.JComboBox var2 = new javax.swing.JComboBox(var1);
    java.lang.String var3 = var2.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ComboBoxUI"+ "'", var3.equals("ComboBoxUI"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    javax.swing.Icon var1 = var0.getIcon();
    int var2 = var0.getY();
    javax.swing.InputVerifier var3 = var0.getInputVerifier();
    float var4 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    javax.swing.Icon var1 = var0.getIcon();
    var0.firePropertyChange("ComboBoxUI", 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    boolean var1 = var0.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    var0.enableInputMethods(true);
    var0.setLocation((-1), 100);
    boolean var6 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (-1.0d)};
    javax.swing.JComboBox var2 = new javax.swing.JComboBox(var1);
    var2.setPopupVisible(true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (-1.0d)};
    javax.swing.JComboBox var2 = new javax.swing.JComboBox(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.setVisibleRowCount((-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var0 = javax.swing.JPopupMenu.getDefaultLightWeightPopupEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    javax.swing.Icon var1 = var0.getIcon();
    boolean var2 = var0.isCursorSet();
    javax.swing.JLabel var3 = new javax.swing.JLabel();
    java.awt.event.MouseListener[] var4 = var3.getMouseListeners();
    java.awt.Rectangle var5 = var3.getVisibleRect();
    boolean var6 = var0.isFocusCycleRoot((java.awt.Container)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (-1.0d)};
    javax.swing.JComboBox var2 = new javax.swing.JComboBox(var1);
    int var3 = var2.getSelectedIndex();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertItemAt((java.lang.Object)1.0d, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    javax.swing.Icon var1 = var0.getIcon();
    int var2 = var0.getY();
    int var3 = var0.getHorizontalAlignment();
    javax.swing.Icon var4 = var0.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JList var0 = new javax.swing.JList();
    javax.swing.plaf.ListUI var1 = var0.getUI();
    javax.swing.JLabel var2 = new javax.swing.JLabel();
    java.awt.event.MouseListener[] var3 = var2.getMouseListeners();
    var2.move(10, (-1));
    boolean var7 = var2.getInheritsPopupMenu();
    var0.setComponentZOrder((java.awt.Component)var2, 1);
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    java.awt.event.MouseListener[] var1 = var0.getMouseListeners();
    java.awt.Rectangle var2 = var0.getVisibleRect();
    boolean var3 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Object[] var1 = new java.lang.Object[] { (-1.0d)};
    javax.swing.JComboBox var2 = new javax.swing.JComboBox(var1);
    java.awt.event.FocusListener[] var3 = var2.getFocusListeners();
    var2.setActionCommand("ComboBoxUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("hi!", 1, 0);
    var0.setName("");

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    var0.enableInputMethods(true);
    var0.setLocation((-1), 100);
    javax.swing.JList var6 = new javax.swing.JList();
    var0.remove((java.awt.Component)var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JLabel var0 = new javax.swing.JLabel();
    javax.swing.Icon var1 = var0.getIcon();
    int var2 = var0.getY();
    javax.swing.InputVerifier var3 = var0.getInputVerifier();
    javax.swing.InputVerifier var4 = var0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JList var0 = new javax.swing.JList();
    var0.firePropertyChange("hi!", 1, 0);
    javax.swing.ListModel var5 = var0.getModel();
    javax.swing.ListModel var6 = var0.getModel();
    javax.swing.JLabel var7 = new javax.swing.JLabel();
    java.awt.event.MouseListener[] var8 = var7.getMouseListeners();
    java.awt.Rectangle var9 = var7.getVisibleRect();
    java.awt.Rectangle var10 = var0.getBounds(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JColorChooser var0 = new javax.swing.JColorChooser();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JMenuItem var0 = new javax.swing.JMenuItem();

  }

}
