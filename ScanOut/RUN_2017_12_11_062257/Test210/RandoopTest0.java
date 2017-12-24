
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.elementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insertElementAt((java.lang.Object)(short)(-1), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    int var3 = var1.indexOf((java.lang.Object)true);
    var1.removeElementAt(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = sun.awt.AppContext.isMainContext(var0);
    java.lang.ThreadGroup var2 = var0.getThreadGroup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)1L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Set var2 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    int var5 = var3.indexOf((java.lang.Object)true);
    boolean var6 = var1.removeAll((java.util.Collection)var3);
    boolean var8 = var1.removeElement((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = sun.awt.AppContext.isMainContext(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.JEditorPane.registerEditorKitForContentType("", "");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var6 = var2.getInputMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Set var2 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    int var5 = var3.indexOf((java.lang.Object)true);
    boolean var6 = var1.removeAll((java.util.Collection)var3);
    var3.removeAllElements();
    var3.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    java.awt.Color var5 = var2.getSelectionColor();
    javax.swing.border.Border var6 = var2.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = sun.awt.AppContext.isMainContext(var0);
    java.lang.ClassLoader var2 = var0.getContextClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    var2.setName("sun.awt.AppContext[threadGroup=system]");
    var2.updateUI();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    var2.setName("sun.awt.AppContext[threadGroup=system]");
    javax.swing.JEditorPane var9 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var9.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    java.awt.Color var12 = var9.getSelectionColor();
    java.awt.Point var13 = var9.getLocation();
    boolean var14 = var2.contains(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    java.awt.Color var5 = var2.getSelectionColor();
    java.awt.Point var6 = var2.getLocation();
    int var7 = var2.getCaretPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    var2.setName("sun.awt.AppContext[threadGroup=system]");
    var2.disable();
    java.beans.PropertyChangeListener[] var8 = var2.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    var2.setName("sun.awt.AppContext[threadGroup=system]");
    java.awt.im.InputContext var7 = var2.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    var2.setName("sun.awt.AppContext[threadGroup=system]");
    var2.disable();
    java.awt.Color var8 = var2.getDisabledTextColor();
    boolean var9 = var2.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    var2.replaceSelection("sun.awt.AppContext[threadGroup=system]");
    java.awt.Color var5 = var2.getSelectionColor();
    java.awt.Point var6 = var2.getLocation();
    java.awt.peer.ComponentPeer var7 = var2.getPeer();
    java.awt.Dimension var8 = var2.getPreferredSize();
    java.awt.im.InputMethodRequests var9 = var2.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JEditorPane var1 = new javax.swing.JEditorPane("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");
    java.util.Locale var3 = javax.swing.JComponent.getDefaultLocale();
    var2.setLocale(var3);
    boolean var5 = var2.getInheritsPopupMenu();
    var2.setToolTipText("sun.awt.AppContext[threadGroup=system]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

}
