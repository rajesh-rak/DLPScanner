
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Insets var1 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5"+ "'", var1.equals("\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    java.awt.Insets var5 = var0.insets();
    int var6 = var0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    java.awt.event.MouseWheelEvent var25 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 100, 1L, 1, 0, 0, 0, 1, 100, true, 10, 1, 10, 1.0d);
    boolean var26 = var25.isAltDown();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    java.awt.Dimension var12 = var0.getPreferredSize();
    boolean var13 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component[] var1 = var0.getComponents();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    var0.setVisible(true);
    boolean var5 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    java.awt.Component var7 = var0.locate(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    boolean var12 = var0.isFontSet();
    java.awt.Container var13 = new java.awt.Container();
    var13.setEnabled(true);
    boolean var16 = var13.isDisplayable();
    java.awt.Point var17 = var13.location();
    boolean var18 = var0.contains(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    var0.setVisible(true);
    java.awt.Rectangle var5 = var0.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component[] var1 = var0.getComponents();
    java.awt.Container var2 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var4 = var2.getPropertyChangeListeners("\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5");
    java.awt.Container var5 = new java.awt.Container();
    var5.setEnabled(true);
    boolean var8 = var5.isDisplayable();
    java.awt.Point var9 = var5.location();
    var5.resize((-1), 1);
    java.awt.Container var13 = new java.awt.Container();
    var13.setEnabled(true);
    java.awt.Component var16 = var5.add((java.awt.Component)var13);
    java.awt.Dimension var17 = var5.getPreferredSize();
    java.awt.Dimension var18 = var2.getSize(var17);
    var0.setPreferredSize(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.ComponentOrientation var6 = var0.getComponentOrientation();
    java.lang.String var7 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    java.lang.String var2 = var1.getHost();
    java.lang.String var3 = var1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5");
    boolean var3 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    boolean var12 = var11.isBackgroundSet();
    java.awt.ComponentOrientation var13 = var11.getComponentOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = java.awt.event.InputEvent.getModifiersExText(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5");
    java.awt.Container var3 = new java.awt.Container();
    var3.setEnabled(true);
    boolean var6 = var3.isDisplayable();
    java.awt.Point var7 = var3.location();
    var3.resize((-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    var11.setEnabled(true);
    java.awt.Component var14 = var3.add((java.awt.Component)var11);
    java.awt.Dimension var15 = var3.getPreferredSize();
    java.awt.Dimension var16 = var0.getSize(var15);
    var0.enableInputMethods(false);
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    java.awt.event.MouseWheelEvent var25 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 100, 1L, 1, 0, 0, 0, 1, 100, true, 10, 1, 10, 1.0d);
    int var26 = var25.getModifiers();
    int var27 = var25.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(true);
    boolean var3 = var0.isDisplayable();
    java.awt.Point var4 = var0.location();
    var0.resize((-1), 1);
    java.awt.Container var8 = new java.awt.Container();
    var8.setEnabled(true);
    java.awt.Component var11 = var0.add((java.awt.Component)var8);
    java.awt.Dimension var12 = var0.getPreferredSize();
    boolean var15 = var0.inside(10, 10);
    java.awt.Rectangle var16 = var0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

}
