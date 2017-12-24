
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


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    int var3 = var1.indexOf((java.lang.Object)true);
    var1.removeElementAt(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


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


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Set var2 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    int var5 = var3.indexOf((java.lang.Object)true);
    boolean var6 = var1.removeAll((java.util.Collection)var3);
    var3.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.swing.JEditorPane var2 = new javax.swing.JEditorPane("", "sun.awt.AppContext[threadGroup=system]");

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)1L);
    java.util.Vector var7 = new java.util.Vector(10, 1);
    var7.addElement((java.lang.Object)1L);
    var2.addElement((java.lang.Object)var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isOpaque();
    var0.setText("sun.awt.AppContext[threadGroup=system]");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    boolean var3 = var0.isManagingFocus();
    javax.swing.JEditorPane var4 = new javax.swing.JEditorPane();
    var4.setFocusAccelerator('4');
    boolean var7 = var0.isAncestorOf((java.awt.Component)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    java.awt.LayoutManager var3 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    boolean var3 = var0.isManagingFocus();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    boolean var3 = var0.isManagingFocus();
    java.awt.event.MouseMotionListener[] var4 = var0.getMouseMotionListeners();
    java.lang.String var5 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isOpaque();
    var0.list();
    boolean var3 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    boolean var3 = var0.isManagingFocus();
    java.awt.Container var4 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Set var2 = sun.awt.AppContext.getAppContexts();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    int var5 = var3.indexOf((java.lang.Object)true);
    boolean var6 = var1.removeAll((java.util.Collection)var3);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isOpaque();
    var0.list();
    javax.swing.JEditorPane var3 = new javax.swing.JEditorPane();
    var3.setFocusAccelerator('4');
    java.awt.dnd.DropTarget var6 = var3.getDropTarget();
    var0.setNextFocusableComponent((java.awt.Component)var3);
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    var0.setFocusAccelerator('4');
    boolean var3 = var0.isManagingFocus();
    java.awt.event.MouseMotionListener[] var4 = var0.getMouseMotionListeners();
    javax.swing.JEditorPane var5 = new javax.swing.JEditorPane();
    var5.setFocusAccelerator('4');
    boolean var8 = var5.isManagingFocus();
    java.awt.event.MouseMotionListener[] var9 = var5.getMouseMotionListeners();
    java.lang.Object var10 = var0.getClientProperty((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isOpaque();
    boolean var2 = var0.isFocusTraversalPolicyProvider();
    boolean var3 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.JEditorPane var0 = new javax.swing.JEditorPane();
    boolean var1 = var0.isOpaque();
    boolean var2 = var0.isFocusTraversalPolicyProvider();
    var0.firePropertyChange("", (-1.0f), 1.0f);
    java.awt.event.MouseMotionListener[] var7 = var0.getMouseMotionListeners();
    var0.paste();

  }

}
