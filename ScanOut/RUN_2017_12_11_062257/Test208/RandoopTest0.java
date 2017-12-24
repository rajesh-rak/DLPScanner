
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Component var6 = var1.getComponentAt((-1), 10);
    java.awt.Container var7 = new java.awt.Container();
    java.awt.Component var10 = var7.getComponentAt(10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var12 = var1.add((java.awt.Component)var7, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.getComponentAt(10, 10);
    java.awt.event.ContainerListener[] var4 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getHeight();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u21E7"+ "'", var1.equals("\u21E7"));

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
    int var1 = var0.getHeight();
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Component var6 = var1.getComponentAt((-1), 10);
    int var7 = var1.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var8 = new java.lang.Class[] { var7};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var9 = var3.getDeclaredMethod("hi!", var8);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Type var2 = var1.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Component var6 = var1.getComponentAt((-1), 10);
    java.awt.Container var7 = new java.awt.Container();
    java.awt.Container var8 = new java.awt.Container();
    var7.add((java.awt.Component)var8, (java.lang.Object)(byte)10);
    java.awt.Container var11 = new java.awt.Container();
    java.awt.Component var14 = var11.getComponentAt(10, 10);
    boolean var15 = var8.isFocusCycleRoot(var11);
    boolean var16 = var11.isCursorSet();
    int var19 = var11.getBaseline(1, 100);
    java.awt.event.InputMethodListener[] var20 = var11.getInputMethodListeners();
    boolean var21 = var1.isAncestorOf((java.awt.Component)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Container var4 = new java.awt.Container();
    java.awt.Component var7 = var4.getComponentAt(10, 10);
    boolean var8 = var1.isFocusCycleRoot(var4);
    var1.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.security.ProtectionDomain var5 = var1.getProtectionDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Container var4 = new java.awt.Container();
    java.awt.Component var7 = var4.getComponentAt(10, 10);
    boolean var8 = var1.isFocusCycleRoot(var4);
    boolean var9 = var4.isCursorSet();
    int var12 = var4.getBaseline(1, 100);
    var4.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Component var6 = var1.getComponentAt((-1), 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var7 = var1.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Container var4 = new java.awt.Container();
    java.awt.Component var7 = var4.getComponentAt(10, 10);
    boolean var8 = var1.isFocusCycleRoot(var4);
    boolean var9 = var4.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkListen(1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getHeight();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Container var3 = new java.awt.Container();
    var2.add((java.awt.Component)var3, (java.lang.Object)(byte)10);
    java.awt.Container var6 = new java.awt.Container();
    java.awt.Component var9 = var6.getComponentAt(10, 10);
    boolean var10 = var3.isFocusCycleRoot(var6);
    boolean var11 = var6.isCursorSet();
    int var14 = var6.getBaseline(1, 100);
    java.awt.event.InputMethodListener[] var15 = var6.getInputMethodListeners();
    boolean var18 = var6.inside(10, 0);
    boolean var19 = var0.isFocusCycleRoot(var6);
    boolean var20 = var6.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Container var4 = new java.awt.Container();
    java.awt.Component var7 = var4.getComponentAt(10, 10);
    boolean var8 = var1.isFocusCycleRoot(var4);
    boolean var9 = var4.isCursorSet();
    int var12 = var4.getBaseline(1, 100);
    var4.firePropertyChange("\u21E7", ' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setEnabled(false);
    java.awt.peer.ComponentPeer var3 = var0.getPeer();
    java.awt.Component.BaselineResizeBehavior var4 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    java.awt.Container var4 = new java.awt.Container();
    java.awt.Component var7 = var4.getComponentAt(10, 10);
    boolean var8 = var1.isFocusCycleRoot(var4);
    boolean var9 = var4.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("\u21E7", 100);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getHeight();
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var0.add((java.awt.Component)var1, (java.lang.Object)(byte)10);
    var0.firePropertyChange("", '4', ' ');

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.reflect.Type var5 = var3.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getHeight();
    java.awt.event.MouseWheelEvent var15 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 1, 10L, 1, 100, 100, 100, 100, (-1), false, 1, 100, 1, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

}
