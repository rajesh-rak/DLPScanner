
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

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.setAsynchronousLoadPriority(1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Dictionary var1 = var0.getDocumentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.putProperty((java.lang.Object)"", (java.lang.Object)(byte)100);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    javax.swing.KeyStroke[] var3 = var2.getRegisteredKeyStrokes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var2, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    var0.requestFocus();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    int var2 = var0.getX();
    boolean var4 = var0.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    var0.requestFocus();
    boolean var3 = var0.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    boolean var3 = var0.getVerifyInputWhenFocusTarget();
    
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
    boolean var1 = var0.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.list();
    boolean var2 = var0.requestFocusInWindow();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = javax.swing.JEditorPane.getEditorKitClassNameForContentType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var1 = var0.getDefaultRootElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.net.URL var1 = var0.getPage();
    java.awt.Component var4 = var0.locate(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var5 = var4.getTransferHandler();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    var4.setTransferHandler(var7);
    java.awt.Component var9 = var0.add("hi!", (java.awt.Component)var4);
    java.awt.Cursor var10 = var9.getCursor();
    java.awt.Cursor var11 = var9.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    int var2 = var0.getX();
    boolean var3 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    int var2 = var0.getX();
    javax.swing.JEditorPane var3 = new javax.swing.JEditorPane();
    javax.swing.KeyStroke[] var4 = var3.getRegisteredKeyStrokes();
    var0.putClientProperty((java.lang.Object)var3, (java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    var0.requestFocus();
    javax.swing.JToolTip var3 = var0.createToolTip();
    var3.layout();
    var3.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    var0.requestFocus();
    javax.swing.JToolTip var3 = var0.createToolTip();
    var3.layout();
    java.awt.Color var5 = var3.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var5 = var4.getTransferHandler();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    var4.setTransferHandler(var7);
    java.awt.Component var9 = var0.add("hi!", (java.awt.Component)var4);
    var9.setBounds((-1), 100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var5 = var4.getTransferHandler();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    var4.setTransferHandler(var7);
    java.awt.Component var9 = var0.add("hi!", (java.awt.Component)var4);
    java.awt.Dimension var10 = var4.getMaximumSize();
    java.awt.Rectangle var11 = var4.getVisibleRect();
    boolean var12 = var4.isFocusable();
    var4.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.net.URL var1 = var0.getPage();
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var3 = var2.getTransferHandler();
    java.beans.PropertyChangeListener[] var4 = var2.getPropertyChangeListeners();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    javax.swing.JEditorPane var8 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var9 = var8.getTransferHandler();
    var6.setTransferHandler(var9);
    java.awt.Component var11 = var2.add("hi!", (java.awt.Component)var6);
    java.awt.Dimension var12 = var6.getMaximumSize();
    var0.setMaximumSize(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.list();
    boolean var2 = var0.requestFocusInWindow();
    var0.list();
    var0.setSelectionStart(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var5 = var4.getTransferHandler();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    var4.setTransferHandler(var7);
    java.awt.Component var9 = var0.add("hi!", (java.awt.Component)var4);
    java.awt.Dimension var10 = var4.getMaximumSize();
    java.awt.Rectangle var11 = var4.getVisibleRect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var13 = var4.getFocusTraversalKeys(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var5 = var4.getTransferHandler();
    javax.swing.JEditorPane var6 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var7 = var6.getTransferHandler();
    var4.setTransferHandler(var7);
    java.awt.Component var9 = var0.add("hi!", (java.awt.Component)var4);
    var0.firePropertyChange("", (byte)100, (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.list();
    boolean var2 = var0.requestFocusInWindow();
    var0.list();
    java.lang.String var4 = var0.getSelectedText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    javax.swing.TransferHandler var1 = var0.getTransferHandler();
    var0.requestFocus();
    javax.swing.JToolTip var3 = var0.createToolTip();
    var3.layout();
    var3.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
