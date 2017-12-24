
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    java.awt.Container var6 = var0.getParent();
    var0.setBounds(10, 100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.swing.JDialog var0 = new javax.swing.JDialog();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    java.awt.Color var3 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.FocusTraversalPolicy var8 = var0.getFocusTraversalPolicy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.areFocusTraversalKeysSet(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.dnd.DropTarget var1 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    java.awt.Container var6 = var0.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var7 = var0.getMousePosition();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("java.awt.Container[,0,0,0x0,invalid]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    boolean var3 = var0.isForegroundSet();
    var0.firePropertyChange("java.awt.Container[,0,0,0x0,invalid]", '#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object var2 = javax.swing.LookAndFeel.getDesktopPropertyValue("java.awt.Container[,0,0,0x0,invalid]", (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0.0f+ "'", var2.equals(0.0f));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    boolean var3 = var0.isForegroundSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var4 = var0.getMousePosition();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    java.awt.Container var6 = var0.getParent();
    boolean var7 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFontSet();
    boolean var2 = var0.isBackgroundSet();
    var0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Locale var3 = var0.getLocale();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.FocusTraversalPolicy var8 = var0.getFocusTraversalPolicy();
    var0.resize(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.list();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.firePropertyChange("", 'a', '4');

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    java.awt.Rectangle var2 = var0.bounds();
    var0.validate();
    boolean var6 = var0.inside(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    var0.firePropertyChange("hi!", 1L, 1L);
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.FocusTraversalPolicy var8 = var0.getFocusTraversalPolicy();
    boolean var9 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    boolean var3 = var0.isFocusTraversalPolicySet();
    java.lang.String var4 = var0.toString();
    java.lang.Object[] var5 = new java.lang.Object[] { var0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var6 = javax.swing.LookAndFeel.makeInputMap(var5);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Container[,0,0,0var4,invalid]"+ "'", var4.equals("java.awt.Container[,0,0,0var4,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.firePropertyChange("hi!", 1L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.lang.String var3 = var0.toString();
    var0.firePropertyChange("java.awt.Container[,0,0,0x0,invalid]", (-1L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Container[,0,0,0var3,invalid]"+ "'", var3.equals("java.awt.Container[,0,0,0var3,invalid]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("java.awt.Container[,0,0,0x0,invalid]", 100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    java.awt.Insets var2 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.enableInputMethods(false);
    java.awt.event.ComponentListener[] var3 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    boolean var3 = var0.isFocusTraversalPolicySet();
    java.lang.String var4 = var0.toString();
    java.beans.PropertyChangeListener[] var6 = var0.getPropertyChangeListeners("hi!");
    javax.swing.text.JTextComponent.KeyBinding[] var7 = javax.swing.LookAndFeel.makeKeyBindings((java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Container[,0,0,0var4,invalid]"+ "'", var4.equals("java.awt.Container[,0,0,0var4,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    boolean var3 = var0.isFocusTraversalPolicySet();
    java.lang.String var4 = var0.toString();
    java.beans.PropertyChangeListener[] var6 = var0.getPropertyChangeListeners("hi!");
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Container[,0,0,0var4,invalid]"+ "'", var4.equals("java.awt.Container[,0,0,0var4,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
