
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


    javax.swing.text.EditorKit var1 = javax.swing.JEditorPane.createEditorKitForContentType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.swing.JEditorPane.registerEditorKitForContentType("", "hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    boolean var6 = var2.addAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.lastIndexOf((java.lang.Object)"hi!", 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var4 = var2.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    boolean var6 = var2.addAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    boolean var6 = var2.addAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var2.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = javax.swing.JEditorPane.getEditorKitClassNameForContentType("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Enumeration var3 = var2.elements();
    java.util.Enumeration var4 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    java.awt.event.HierarchyListener[] var1 = var0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    var0.readLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    java.util.Enumeration var6 = var5.elements();
    boolean var7 = var2.retainAll((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.doLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var4 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.firePropertyChange("hi!", (byte)0, (byte)100);
    java.lang.String var7 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "EditorPaneUI"+ "'", var7.equals("EditorPaneUI"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane();
    var2.setSelectionStart(1);
    var0.putProperty((java.lang.Object)1, (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.text.EditorKit var5 = var0.getEditorKit();
    var0.setAlignmentX((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    boolean var6 = var2.addAll((java.util.Collection)var5);
    int var7 = var5.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    boolean var6 = var2.addAll((java.util.Collection)var5);
    java.util.Iterator var7 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.setInheritsPopupMenu(true);
    java.util.Vector var10 = new java.util.Vector(1, (-1));
    java.util.Vector var13 = new java.util.Vector(1, (-1));
    boolean var14 = var10.addAll((java.util.Collection)var13);
    var0.add((java.awt.Component)var5, (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var17 = var5.getComponent(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.text.EditorKit var5 = var0.getEditorKit();
    javax.swing.text.NavigationFilter var6 = var0.getNavigationFilter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var8 = var0.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.setInheritsPopupMenu(true);
    java.util.Vector var10 = new java.util.Vector(1, (-1));
    java.util.Vector var13 = new java.util.Vector(1, (-1));
    boolean var14 = var10.addAll((java.util.Collection)var13);
    var0.add((java.awt.Component)var5, (java.lang.Object)var14);
    javax.swing.event.HyperlinkListener[] var16 = var0.getHyperlinkListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.firePropertyChange("hi!", (byte)0, (byte)100);
    javax.swing.text.DefaultStyledDocument var7 = new javax.swing.text.DefaultStyledDocument();
    var0.setDocument((javax.swing.text.Document)var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.setInheritsPopupMenu(true);
    java.util.Vector var10 = new java.util.Vector(1, (-1));
    java.util.Vector var13 = new java.util.Vector(1, (-1));
    boolean var14 = var10.addAll((java.util.Collection)var13);
    var0.add((java.awt.Component)var5, (java.lang.Object)var14);
    javax.swing.text.EditorKit var16 = var5.getEditorKit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    java.util.Enumeration var1 = var0.getStyleNames();
    java.util.Vector var4 = new java.util.Vector(1, (-1));
    java.util.Enumeration var5 = var4.elements();
    java.util.Vector var8 = new java.util.Vector(1, (-1));
    var0.putProperty((java.lang.Object)var5, (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    javax.swing.text.EditorKit var5 = var0.getEditorKit();
    javax.swing.text.NavigationFilter var6 = var0.getNavigationFilter();
    javax.swing.JToolTip var7 = var0.createToolTip();
    var7.setOpaque(true);
    boolean var10 = var7.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.setName("hi!");
    java.awt.im.InputMethodRequests var5 = var0.getInputMethodRequests();
    java.awt.event.MouseMotionListener[] var6 = var0.getMouseMotionListeners();
    var0.setEditable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.doLayout();
    boolean var4 = var0.isRequestFocusEnabled();
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.setInheritsPopupMenu(true);
    var5.setName("hi!");
    boolean var10 = var0.isAncestorOf((java.awt.Component)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setInheritsPopupMenu(true);
    var0.doLayout();
    boolean var4 = var0.isRequestFocusEnabled();
    java.awt.Dimension var5 = var0.getMinimumSize();

  }

}
