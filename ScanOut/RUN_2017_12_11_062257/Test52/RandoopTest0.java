
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    int var2 = var0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("hi!", "hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.scrollToReference("hi!");
    java.awt.Color var8 = var5.getCaretColor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var5, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    boolean var3 = var0.isForegroundSet();
    java.awt.event.HierarchyListener[] var4 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    boolean var3 = var0.isBackgroundSet();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    var4.scrollToReference("hi!");
    java.awt.Color var7 = var4.getSelectedTextColor();
    var0.setForeground(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    javax.swing.text.Highlighter var2 = var0.getHighlighter();
    javax.swing.JEditorPane var3 = new javax.swing.JEditorPane();
    boolean var4 = var3.isFocusTraversable();
    java.awt.im.InputMethodRequests var5 = var3.getInputMethodRequests();
    boolean var6 = var3.requestDefaultFocus();
    java.awt.Color var7 = var3.getDisabledTextColor();
    var0.setSelectedTextColor(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    javax.swing.text.Highlighter var2 = var0.getHighlighter();
    boolean var3 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    java.awt.Color var3 = var0.getCaretColor();
    java.awt.event.HierarchyListener[] var4 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    boolean var3 = var0.isBackgroundSet();
    var0.grabFocus();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    var0.setEditable(true);
    javax.swing.JEditorPane var7 = new javax.swing.JEditorPane();
    java.awt.Insets var8 = var7.getMargin();
    javax.swing.JEditorPane var9 = new javax.swing.JEditorPane();
    java.awt.Insets var10 = var9.getMargin();
    var7.setMargin(var10);
    var0.setMargin(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    boolean var3 = var0.isBackgroundSet();
    var0.setAutoscrolls(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    var0.setFocusCycleRoot(false);
    java.awt.Insets var7 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    var0.setEditable(true);
    var0.firePropertyChange("hi!", 1.0d, 10.0d);
    java.awt.FocusTraversalPolicy var11 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isFocusTraversable();
    int var2 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isFocusTraversable();
    java.awt.im.InputMethodRequests var2 = var0.getInputMethodRequests();
    boolean var3 = var0.requestDefaultFocus();
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    var0.setEditable(true);
    var0.firePropertyChange("", false, false);
    boolean var12 = var0.areFocusTraversalKeysSet(1);
    javax.swing.text.EditorKit var13 = var0.getEditorKit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    boolean var3 = var0.isForegroundSet();
    var0.firePropertyChange("hi!", (byte)1, (byte)10);
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.scrollToReference("hi!");
    var0.setIgnoreRepaint(false);
    var0.setEditable(true);
    var0.firePropertyChange("", false, false);
    javax.swing.JEditorPane var11 = new javax.swing.JEditorPane();
    javax.swing.border.Border var12 = var11.getBorder();
    boolean var14 = var11.areFocusTraversalKeysSet(0);
    java.awt.Component var16 = var0.add((java.awt.Component)var11, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.Insets var1 = var0.getMargin();
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    java.awt.Insets var3 = var2.getMargin();
    var0.setMargin(var3);
    javax.swing.plaf.TextUI var5 = var0.getUI();
    var0.cut();
    int var9 = var0.getBaseline(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

}
