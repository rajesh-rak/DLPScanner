
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 100);
    java.lang.String var3 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.getKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.text.EditorKit var1 = javax.swing.JEditorPane.createEditorKitForContentType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    int var1 = var0.getCaretPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    var2.firePropertyChange("", 1.0d, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var2, (java.lang.Object)'4', 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.firePropertyChange("", 1.0d, 1.0d);
    boolean var5 = var0.isMaximumSizeSet();
    java.awt.Dimension var6 = var0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    var0.repaint(10L, 10, 1, 100, 1);
    var0.setToolTipText("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.hide();
    var0.setCaretPosition(0);
    java.awt.Rectangle var4 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    java.awt.im.InputContext var2 = var0.getInputContext();
    var0.transferFocusBackward();
    var0.firePropertyChange("", true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.hide();
    var0.setSelectionEnd(1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    java.awt.Color var6 = var0.getBackground();
    javax.swing.JEditorPane var7 = new javax.swing.JEditorPane();
    var7.revalidate();
    int var9 = var7.getHeight();
    boolean var12 = var7.contains(0, (-1));
    java.awt.Color var13 = var7.getBackground();
    var0.setDisabledTextColor(var13);
    boolean var15 = var0.isPaintingTile();
    var0.setSize((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    java.awt.Color var6 = var0.getBackground();
    javax.swing.JEditorPane var7 = new javax.swing.JEditorPane();
    var7.revalidate();
    int var9 = var7.getHeight();
    boolean var12 = var7.contains(0, (-1));
    java.awt.Color var13 = var7.getBackground();
    var0.setDisabledTextColor(var13);
    boolean var15 = var0.isPaintingTile();
    var0.firePropertyChange("hi!", false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    var0.setEditable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    boolean var2 = var0.getInheritsPopupMenu();
    boolean var3 = var0.getDragEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.firePropertyChange("", 1.0d, 1.0d);
    boolean var5 = var0.isMaximumSizeSet();
    java.lang.String var6 = var0.getName();
    java.awt.Rectangle var8 = var0.modelToView((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    java.awt.im.InputContext var2 = var0.getInputContext();
    var0.transferFocusBackward();
    java.lang.String var4 = var0.getContentType();
    var0.setAlignmentY(1.0f);
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "text/plain"+ "'", var4.equals("text/plain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    java.awt.Color var6 = var0.getBackground();
    javax.swing.JEditorPane var7 = new javax.swing.JEditorPane();
    var7.revalidate();
    int var9 = var7.getHeight();
    boolean var12 = var7.contains(0, (-1));
    java.awt.Color var13 = var7.getBackground();
    var0.setDisabledTextColor(var13);
    var0.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    java.util.Set var3 = var0.getFocusTraversalKeys(0);
    java.lang.String var4 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "EditorPaneUI"+ "'", var4.equals("EditorPaneUI"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.revalidate();
    int var2 = var0.getHeight();
    boolean var5 = var0.contains(0, (-1));
    java.awt.im.InputMethodRequests var6 = var0.getInputMethodRequests();
    var0.hide();
    var0.move(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.hide();
    var0.setCaretPosition(0);
    java.awt.Component var6 = var0.findComponentAt(1, 100);
    var0.setAlignmentX(0.0f);
    int var9 = var0.getX();
    boolean var10 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.firePropertyChange("", 1.0d, 1.0d);
    boolean var5 = var0.isMaximumSizeSet();
    java.awt.Dimension var6 = var0.getMinimumSize();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.firePropertyChange("", 1.0d, 1.0d);
    boolean var5 = var0.isMaximumSizeSet();
    java.lang.String var6 = var0.getName();
    boolean var7 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

}
