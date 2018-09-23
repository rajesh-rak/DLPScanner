
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.EditorKit var1 = javax.swing.JEditorPane.createEditorKitForContentType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane("", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setComponentZOrder((java.awt.Component)var6, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    boolean var7 = var2.inside(0, 10);
    boolean var10 = var2.inside(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.setBounds(10, 0, 1, 100);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    boolean var7 = var2.contains((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    var2.transferFocusBackward();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var7 = var2.getInputMap(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    javax.swing.TransferHandler var5 = var2.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    boolean var5 = var2.isOptimizedDrawingEnabled();
    javax.swing.text.Highlighter var6 = var2.getHighlighter();
    javax.swing.JEditorPane var9 = new javax.swing.JEditorPane("", "hi!");
    var9.reshape(100, 10, (-1), 10);
    java.awt.Color var15 = var9.getSelectionColor();
    var2.setSelectionColor(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    java.awt.Color var8 = var2.getSelectionColor();
    var2.setFocusTraversalPolicyProvider(false);
    java.lang.String var11 = var2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    boolean var5 = var2.isOptimizedDrawingEnabled();
    javax.swing.text.Highlighter var6 = var2.getHighlighter();
    boolean var7 = var2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.net.URL var3 = var2.getPage();
    int var4 = var2.getDebugGraphicsOptions();
    boolean var5 = var2.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.net.URL var3 = var2.getPage();
    int var4 = var2.getDebugGraphicsOptions();
    java.awt.Container var5 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    java.awt.Insets var4 = var2.getInsets();
    java.awt.Insets var5 = var2.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    boolean var8 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var2);
    javax.swing.text.Document var9 = var2.getDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var11 = var2.getComponent(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    boolean var8 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var2);
    javax.swing.text.Highlighter var9 = var2.getHighlighter();
    int var10 = var2.getCaretPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.setEnabled(false);
    javax.swing.JEditorPane var8 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var9 = var8.getText();
    java.awt.Insets var10 = var8.getInsets();
    java.awt.Insets var11 = var2.getInsets(var10);
    var2.firePropertyChange("", (-1), 0);
    java.lang.Object var16 = var2.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.awt.Component var5 = var2.locate(0, 1);
    javax.swing.JEditorPane var8 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var9 = var8.getText();
    var8.resetKeyboardActions();
    boolean var11 = var2.isAncestorOf((java.awt.Component)var8);
    boolean var12 = var8.getAutoscrolls();
    javax.swing.JEditorPane var16 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var17 = var16.getText();
    java.awt.Insets var18 = var16.getInsets();
    java.awt.Component var19 = var8.add("hi!", (java.awt.Component)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    java.awt.Color var8 = var2.getSelectionColor();
    var2.move((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    boolean var8 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var2);
    boolean var9 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var3 = var2.getText();
    var2.resetKeyboardActions();
    boolean var5 = var2.isOptimizedDrawingEnabled();
    javax.swing.text.Highlighter var6 = var2.getHighlighter();
    int var7 = var2.countComponents();
    var2.setSize(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    java.awt.Color var8 = var2.getSelectionColor();
    javax.swing.JEditorPane var12 = new javax.swing.JEditorPane("", "hi!");
    java.awt.Component var15 = var12.locate(0, 1);
    javax.swing.JEditorPane var18 = new javax.swing.JEditorPane("", "hi!");
    java.lang.String var19 = var18.getText();
    var18.resetKeyboardActions();
    boolean var21 = var12.isAncestorOf((java.awt.Component)var18);
    java.awt.Component var22 = var2.add("hi!", (java.awt.Component)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    java.awt.Component var5 = var2.locate(0, 1);
    int var6 = var2.getCaretPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setPage("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "hi!");
    var2.reshape(100, 10, (-1), 10);
    java.awt.Color var8 = var2.getSelectionColor();
    var2.setAlignmentX(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
