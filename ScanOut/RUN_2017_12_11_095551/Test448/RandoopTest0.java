
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.util.Enumeration var5 = var3.getResources("hi!");
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var3);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.util.Enumeration var3 = var1.getResources("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var5 = var1.loadClass("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var0.firePropertyChange("", (short)1, (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    java.awt.Point var5 = var1.getLocation();
    java.awt.Container var6 = var1.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    var1.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.util.Enumeration var5 = var3.getResources("hi!");
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var3);
    java.net.URL[] var7 = new java.net.URL[] { };
    java.net.URLClassLoader var8 = java.net.URLClassLoader.newInstance(var7);
    java.util.Enumeration var10 = var8.getResources("hi!");
    java.net.URLClassLoader var11 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var8);
    java.net.URL[] var12 = new java.net.URL[] { };
    java.net.URLClassLoader var13 = java.net.URLClassLoader.newInstance(var12);
    java.util.Enumeration var15 = var13.getResources("hi!");
    java.net.URLClassLoader var16 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    boolean var4 = var1.isFocusCycleRoot(var2);
    var2.removeAll();
    java.awt.Point var6 = var2.getLocation();
    var2.reshape(100, 100, 10, 1);
    var0.remove((java.awt.Component)var2);
    var2.move(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.io.InputStream var3 = var1.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    boolean var4 = var1.isFocusCycleRoot(var2);
    var2.removeAll();
    java.awt.Point var6 = var2.getLocation();
    var2.reshape(100, 100, 10, 1);
    var0.remove((java.awt.Component)var2);
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    boolean var4 = var1.isFocusCycleRoot(var2);
    var2.removeAll();
    java.awt.Point var6 = var2.getLocation();
    var2.reshape(100, 100, 10, 1);
    var0.remove((java.awt.Component)var2);
    java.lang.Object var13 = var2.getTreeLock();
    java.awt.Font var14 = var2.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var0 = java.rmi.server.RemoteServer.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.util.Enumeration var5 = var3.getResources("hi!");
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var3);
    java.net.URL[] var7 = new java.net.URL[] { };
    java.net.URLClassLoader var8 = java.net.URLClassLoader.newInstance(var7);
    java.util.Enumeration var10 = var8.getResources("hi!");
    java.net.URLClassLoader var11 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var8);
    var8.setDefaultAssertionStatus(false);
    var8.setPackageAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.LayoutManager var1 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    java.awt.Container var5 = new java.awt.Container();
    java.awt.Container var6 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var7 = var6.getInputMethodListeners();
    boolean var8 = var5.isFocusCycleRoot(var6);
    var6.removeAll();
    java.awt.Point var10 = var6.getLocation();
    boolean var11 = var1.contains(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = java.rmi.server.RemoteServer.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    java.awt.event.MouseWheelListener[] var4 = var1.getMouseWheelListeners();
    java.awt.peer.ComponentPeer var5 = var1.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var0.firePropertyChange("", (-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    boolean var4 = var1.isFocusCycleRoot(var2);
    var2.removeAll();
    java.awt.Point var6 = var2.getLocation();
    var2.reshape(100, 100, 10, 1);
    var0.remove((java.awt.Component)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var13 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    var1.setSize(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var3 = var2.getInputMethodListeners();
    boolean var4 = var1.isFocusCycleRoot(var2);
    var2.removeAll();
    java.awt.Point var6 = var2.getLocation();
    var2.reshape(100, 100, 10, 1);
    var0.remove((java.awt.Component)var2);
    var2.transferFocus();
    var2.repaint((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    java.awt.Point var4 = var0.location();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var5 = var0.getMousePosition();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    int var5 = var1.getX();
    boolean var6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    java.awt.event.InputMethodListener[] var2 = var1.getInputMethodListeners();
    boolean var3 = var0.isFocusCycleRoot(var1);
    var1.removeAll();
    java.awt.Dimension var5 = var1.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
