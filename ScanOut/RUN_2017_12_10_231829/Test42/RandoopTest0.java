
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.Point var2 = var0.location();
    java.awt.Insets var3 = var0.getInsets();
    boolean var4 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.event.HierarchyBoundsListener[] var1 = var0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.Point var2 = var0.location();
    java.awt.Panel var3 = new java.awt.Panel();
    java.awt.Toolkit var4 = var3.getToolkit();
    java.awt.Point var5 = var3.location();
    java.awt.Component var6 = var0.getComponentAt(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    boolean var3 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    java.awt.Color var3 = var0.getBackground();
    int var4 = var0.getComponentCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    java.awt.Point var3 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    java.awt.Color var3 = var0.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Locale var4 = var0.getLocale();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    var0.setFocusTraversalKeysEnabled(false);
    boolean var5 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.move((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    int var3 = var0.getWidth();
    var0.reshape(10, 1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    sun.rmi.transport.Transport var4 = var2.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    boolean var3 = var0.isFocusTraversable();
    java.awt.event.MouseListener[] var4 = var0.getMouseListeners();
    var0.repaint(0L, 100, 1, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.Point var2 = var0.location();
    java.awt.Insets var3 = var0.getInsets();
    java.awt.im.InputContext var4 = var0.getInputContext();
    boolean var5 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    java.awt.Color var3 = var0.getBackground();
    boolean var4 = var0.isFocusTraversable();
    java.lang.String var5 = var0.toString();
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.awt.Panel[panel1,0,0,0var5,invalid,layout=java.awt.FlowLayout]"+ "'", var5.equals("java.awt.Panel[panel1,0,0,0var5,invalid,layout=java.awt.FlowLayout]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    java.awt.Color var3 = var0.getBackground();
    boolean var4 = var0.isFocusTraversable();
    java.lang.String var5 = var0.toString();
    java.awt.Dimension var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.awt.Panel[panel2,0,0,0var5,invalid,layout=java.awt.FlowLayout]"+ "'", var5.equals("java.awt.Panel[panel2,0,0,0var5,invalid,layout=java.awt.FlowLayout]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    java.awt.Component[] var3 = var0.getComponents();
    java.awt.Dimension var4 = var0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.GraphicsConfiguration var2 = var0.getGraphicsConfiguration();
    var0.setFocusTraversalKeysEnabled(false);
    java.awt.event.ComponentListener[] var5 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    var0.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.Point var2 = var0.location();
    var0.transferFocusUpCycle();
    boolean var4 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    java.awt.Color var4 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Panel var0 = new java.awt.Panel();
    java.awt.Toolkit var1 = var0.getToolkit();
    java.awt.Point var2 = var0.location();
    var0.revalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var5 = var0.getMousePosition(false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Panel var0 = new java.awt.Panel();
    boolean var2 = var0.areFocusTraversalKeysSet(0);
    int var3 = var0.getWidth();
    var0.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

}
