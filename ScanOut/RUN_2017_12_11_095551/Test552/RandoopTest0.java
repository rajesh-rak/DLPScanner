
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.removeAll();
    var0.transferFocusUpCycle();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    int var3 = var2.getListenPort();
    java.lang.String var4 = var2.toString();
    sun.rmi.transport.Channel var5 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[:10]"+ "'", var4.equals("[:10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var0.getMousePosition(true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.removeAll();
    var0.revalidate();
    boolean var4 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.removeAll();
    java.awt.Container var3 = new java.awt.Container();
    var3.doLayout();
    java.awt.Insets var5 = var3.getInsets();
    java.awt.Container var6 = new java.awt.Container();
    boolean var7 = var6.isFocusTraversable();
    boolean var8 = var3.isFocusCycleRoot(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var3, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.removeAll();
    var0.revalidate();
    var0.requestFocus();
    var0.show();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.beans.VetoableChangeListener[] var2 = var0.getVetoableChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Container var3 = new java.awt.Container();
    var3.doLayout();
    var3.addNotify();
    boolean var6 = var3.isShowing();
    boolean var7 = var0.isFocusCycleRoot(var3);
    var3.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.addNotify();
    boolean var3 = var0.isShowing();
    var0.doLayout();
    float var5 = var0.getAlignmentX();
    boolean var6 = var0.isDisplayable();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.addKeyEventDispatcher((java.awt.KeyEventDispatcher)var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFocusTraversable();
    boolean var2 = var0.hasFocus();
    var0.setBounds(1, 10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.addNotify();
    boolean var3 = var0.isShowing();
    var0.doLayout();
    float var5 = var0.getAlignmentX();
    java.awt.event.HierarchyBoundsListener[] var6 = var0.getHierarchyBoundsListeners();
    int var7 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Point var2 = var1.getLocation();
    java.awt.Component var3 = var0.findComponentAt(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Container var3 = new java.awt.Container();
    boolean var4 = var3.isFocusTraversable();
    boolean var5 = var0.isFocusCycleRoot(var3);
    java.awt.Insets var6 = var0.getInsets();
    java.awt.GraphicsConfiguration var7 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFocusTraversable();
    java.util.Set var3 = var0.getFocusTraversalKeys(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.areFocusTraversalKeysSet(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var1 = var0.getDefaultRootElement();
    javax.swing.text.DocumentFilter var2 = var0.getDocumentFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    var0.removeAll();
    var0.revalidate();
    boolean var4 = var0.isFocusOwner();
    boolean var5 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.doLayout();
    java.awt.Insets var2 = var0.getInsets();
    java.awt.Container var3 = new java.awt.Container();
    var3.doLayout();
    var3.addNotify();
    boolean var6 = var3.isShowing();
    boolean var7 = var0.isFocusCycleRoot(var3);
    boolean var8 = var3.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
