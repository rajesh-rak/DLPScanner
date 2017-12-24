
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u2325+\u2303+Button2"+ "'", var1.equals("\u2325+\u2303+Button2"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.awt.event.InputEvent.getModifiersExText(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.awt.event.InputEvent.getModifiersExText(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var4 = var0.getHierarchyBoundsListeners();
    var0.revalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var7 = var0.getMousePosition(true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var4 = var0.getHierarchyBoundsListeners();
    java.awt.LayoutManager var5 = var0.getLayout();
    var0.setSize(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getY();
    java.awt.Cursor var2 = var0.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Container var1 = new java.awt.Container();
    var1.move(100, 100);
    java.awt.Font var5 = var1.getFont();
    java.awt.Component var6 = var0.add((java.awt.Component)var1);
    boolean var7 = var1.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.validate();
    java.awt.Dimension var2 = var0.getPreferredSize();
    var0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    var0.resize(1, 10);
    java.awt.event.MouseWheelListener[] var7 = var0.getMouseWheelListeners();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getY();
    java.awt.event.MouseMotionListener[] var2 = var0.getMouseMotionListeners();
    boolean var3 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    int var1 = var0.getY();
    java.awt.event.MouseMotionListener[] var2 = var0.getMouseMotionListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    var0.resize(1, 10);
    var0.firePropertyChange("\u2325+\u2303+Button2", (byte)(-1), (byte)0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFocusCycleRoot();
    int var2 = var0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFocusCycleRoot();
    java.awt.event.KeyListener[] var2 = var0.getKeyListeners();
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.validate();
    int var2 = var0.getHeight();
    java.awt.Container var3 = new java.awt.Container();
    var3.move(100, 100);
    var3.resize(1, 10);
    java.awt.event.MouseWheelListener[] var10 = var3.getMouseWheelListeners();
    boolean var11 = var3.hasFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var13 = var0.add((java.awt.Component)var3, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var4 = var0.getHierarchyBoundsListeners();
    java.awt.Container var5 = new java.awt.Container();
    var5.move(100, 100);
    var5.resize(1, 10);
    java.awt.event.MouseWheelListener[] var12 = var5.getMouseWheelListeners();
    var5.doLayout();
    var0.remove((java.awt.Component)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    var0.resize(1, 10);
    java.awt.Container var7 = new java.awt.Container();
    var7.move(100, 100);
    java.awt.Container var11 = new java.awt.Container();
    var11.move(100, 100);
    var11.resize(1, 10);
    java.awt.Container var18 = new java.awt.Container();
    var18.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var22 = var18.getHierarchyBoundsListeners();
    var7.add((java.awt.Component)var11, (java.lang.Object)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var25 = var0.add((java.awt.Component)var11, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var4 = var0.getHierarchyBoundsListeners();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    java.lang.String var2 = var1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.move(100, 100);
    java.awt.event.HierarchyBoundsListener[] var4 = var0.getHierarchyBoundsListeners();
    boolean var5 = var0.isFocusTraversable();
    var0.repaint(10L);
    java.awt.Container var8 = new java.awt.Container();
    boolean var9 = var8.isFocusCycleRoot();
    java.awt.event.KeyListener[] var10 = var8.getKeyListeners();
    java.awt.Dimension var11 = var8.getPreferredSize();
    java.awt.Container var12 = new java.awt.Container();
    var12.validate();
    java.awt.Dimension var14 = var12.getPreferredSize();
    var0.add((java.awt.Component)var8, (java.lang.Object)var14, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isFocusCycleRoot();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    java.awt.Container var3 = new java.awt.Container();
    var3.validate();
    java.awt.Dimension var5 = var3.getPreferredSize();
    var0.resize(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
