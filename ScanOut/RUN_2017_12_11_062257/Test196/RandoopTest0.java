
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var3 = var0.getFocusTraversalKeys(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    boolean var2 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    java.awt.event.MouseWheelEvent var21 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 10, 0L, (-1), 100, 10, 1, 0, (-1), true, 1, 1, 10, (-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var22 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    java.awt.Dimension var3 = var0.getPreferredSize();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    var2.setSize((-1), 1);
    boolean var11 = var2.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    java.awt.event.MouseWheelEvent var21 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 10, 0L, (-1), 100, 10, 1, 0, (-1), true, 1, 1, 10, (-1.0d));
    boolean var22 = var21.isAltDown();
    java.awt.Component var23 = var21.getComponent();
    boolean var24 = var23.isPreferredSizeSet();
    int var25 = var23.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    var2.setSize((-1), 1);
    var2.setIgnoreRepaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.removeAll();
    int var5 = var0.getBaseline(1, 100);
    float var6 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    java.awt.event.ContainerListener[] var3 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Package var1 = java.lang.Package.getPackage("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    java.awt.Dimension var3 = var0.getPreferredSize();
    var0.setFocusTraversalKeysEnabled(true);
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Dimension var7 = var6.getPreferredSize();
    java.awt.Container var8 = new java.awt.Container();
    java.awt.Dimension var9 = var8.getPreferredSize();
    java.awt.Container var10 = new java.awt.Container();
    java.awt.Dimension var11 = var10.getPreferredSize();
    int var12 = var10.getX();
    var8.add((java.awt.Component)var10, (java.lang.Object)10.0f, 0);
    var0.add((java.awt.Component)var6, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5"+ "'", var1.equals("\u2325+\u2318+\u2303+\u21E7+\u2325+Button1+Button2+Button3+Button4+Button5"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    var0.setSize(10, 1);
    int var5 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    boolean var5 = var0.contains(0, (-1));
    var0.enable();
    java.awt.Container var7 = new java.awt.Container();
    java.awt.Dimension var8 = var7.getPreferredSize();
    java.awt.Container var9 = new java.awt.Container();
    java.awt.Dimension var10 = var9.getPreferredSize();
    int var11 = var9.getX();
    var7.add((java.awt.Component)var9, (java.lang.Object)10.0f, 0);
    java.awt.event.MouseWheelEvent var28 = new java.awt.event.MouseWheelEvent((java.awt.Component)var7, 10, 0L, (-1), 100, 10, 1, 0, (-1), true, 1, 1, 10, (-1.0d));
    double var29 = var28.getPreciseWheelRotation();
    var0.dispatchEvent((java.awt.AWTEvent)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1.0d));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    boolean var5 = var0.contains(0, (-1));
    var0.enable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    java.awt.event.MouseWheelEvent var21 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 10, 0L, (-1), 100, 10, 1, 0, (-1), true, 1, 1, 10, (-1.0d));
    boolean var22 = var21.isAltDown();
    java.awt.Component var23 = var21.getComponent();
    boolean var24 = var23.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.removeAll();
    boolean var3 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    var1.setClassAssertionStatus("hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    boolean var5 = var0.contains(0, (-1));
    var0.enable();
    java.awt.Dimension var7 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Image var3 = var0.createImage(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Point var1 = var0.location();
    java.awt.Dimension var2 = var0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.getPreferredSize();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Dimension var3 = var2.getPreferredSize();
    int var4 = var2.getX();
    var0.add((java.awt.Component)var2, (java.lang.Object)10.0f, 0);
    var2.setSize((-1), 1);
    java.awt.Color var11 = var2.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.addNotify();
    java.awt.Dimension var3 = var0.getPreferredSize();
    var0.setFocusTraversalKeysEnabled(true);
    boolean var6 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

}
