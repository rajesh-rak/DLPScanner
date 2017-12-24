
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JRadioButtonMenuItem var0 = new javax.swing.JRadioButtonMenuItem();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    java.awt.event.ContainerListener[] var2 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Dimension var3 = var2.getPreferredSize();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    int var1 = var0.getComponentCount();
    int var2 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    javax.swing.JRootPane var4 = var2.getRootPane();
    boolean var5 = var2.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JPanel var0 = new javax.swing.JPanel();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    int var1 = var0.getComponentCount();
    java.awt.Dimension var2 = var0.getSize();
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    boolean var5 = var0.isAncestorOf((java.awt.Component)var3);
    java.awt.LayoutManager var6 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    var2.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JMenu var2 = new javax.swing.JMenu("hi!", false);
    java.awt.Dimension var3 = var2.minimumSize();
    java.awt.Dimension var4 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JCheckBox var2 = new javax.swing.JCheckBox("", true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JRadioButtonMenuItem var0 = new javax.swing.JRadioButtonMenuItem();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    javax.swing.JLayeredPane.putLayer((javax.swing.JComponent)var0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    int var1 = var0.getComponentCount();
    java.awt.Dimension var2 = var0.getSize();
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    boolean var5 = var0.isAncestorOf((java.awt.Component)var3);
    boolean var6 = var3.getFocusTraversalKeysEnabled();
    var3.setAutoscrolls(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.plaf.basic.BasicArrowButton var1 = new javax.swing.plaf.basic.BasicArrowButton(3);
    var1.setOpaque(true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.plaf.basic.BasicArrowButton var1 = new javax.swing.plaf.basic.BasicArrowButton(3);
    var1.removeNotify();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    boolean var4 = var2.isFocusTraversalPolicyProvider();
    var2.repaint(10L);
    java.awt.Dimension var7 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JScrollPane var0 = new javax.swing.JScrollPane();
    int var1 = var0.getComponentCount();
    java.awt.Dimension var2 = var0.getSize();
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    boolean var5 = var0.isAncestorOf((java.awt.Component)var3);
    boolean var6 = var0.isFontSet();
    java.awt.event.ContainerListener[] var7 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JMenu var2 = new javax.swing.JMenu("hi!", false);
    java.awt.Dimension var3 = var2.minimumSize();
    boolean var4 = var2.isTopLevelMenu();
    java.awt.Insets var5 = var2.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    java.awt.Dimension var5 = var3.getSize();
    var2.resize(var5);
    java.awt.peer.ComponentPeer var7 = var2.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JRadioButtonMenuItem var0 = new javax.swing.JRadioButtonMenuItem();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    java.awt.Insets var2 = var0.insets();
    java.awt.event.ActionListener[] var3 = var0.getActionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JRadioButtonMenuItem var0 = new javax.swing.JRadioButtonMenuItem();
    int var1 = var0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    java.awt.Dimension var5 = var3.getSize();
    var2.resize(var5);
    var2.firePropertyChange("hi!", 3, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    boolean var4 = var2.isFocusTraversalPolicyProvider();
    boolean var5 = var2.requestDefaultFocus();
    var2.firePropertyChange("", (short)(-1), (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    boolean var4 = var2.isFocusTraversalPolicyProvider();
    boolean var5 = var2.requestDefaultFocus();
    javax.swing.JScrollPane var6 = new javax.swing.JScrollPane();
    int var7 = var6.getComponentCount();
    java.awt.Dimension var8 = var6.getSize();
    boolean var9 = var2.isAncestorOf((java.awt.Component)var6);
    var6.resetKeyboardActions();
    java.awt.event.FocusListener[] var11 = var6.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    java.awt.Point var3 = var2.location();
    var2.setIconTextGap(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JCheckBoxMenuItem var2 = new javax.swing.JCheckBoxMenuItem("", false);
    javax.swing.JScrollPane var3 = new javax.swing.JScrollPane();
    int var4 = var3.getComponentCount();
    java.awt.Dimension var5 = var3.getSize();
    var2.resize(var5);
    boolean var7 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.plaf.synth.SynthTextFieldUI var0 = new javax.swing.plaf.synth.SynthTextFieldUI();
    javax.swing.JRadioButtonMenuItem var1 = new javax.swing.JRadioButtonMenuItem();
    javax.accessibility.AccessibleContext var2 = var1.getAccessibleContext();
    int var3 = var1.getVerticalAlignment();
    int var4 = var0.getAccessibleChildrenCount((javax.swing.JComponent)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

}
