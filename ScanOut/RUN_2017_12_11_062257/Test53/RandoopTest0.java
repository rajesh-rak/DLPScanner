
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u2325+\u2303+Button2"+ "'", var1.equals("\u2325+\u2303+Button2"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.awt.event.MouseEvent.getMouseModifiersText(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    boolean var4 = var1.equals((java.lang.Object)(-1));
    sun.rmi.transport.tcp.TCPEndpoint var6 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    sun.rmi.transport.Transport var7 = var6.getOutboundTransport();
    boolean var9 = var6.equals((java.lang.Object)(-1));
    boolean var10 = var1.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    int var3 = var1.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setFocusCycleRoot(false);
    java.awt.Component var5 = var0.locate(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(0);
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    sun.rmi.transport.Transport var3 = var1.getOutboundTransport();
    sun.rmi.transport.Channel var4 = var1.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setFocusCycleRoot(false);
    java.awt.LayoutManager var3 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    var0.setFocusCycleRoot(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.areFocusTraversalKeysSet((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.event.HierarchyBoundsListener[] var2 = var0.getHierarchyBoundsListeners();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.Image var4 = var0.createImage(1, 100);
    var0.revalidate();
    java.awt.Container var6 = new java.awt.Container();
    boolean var7 = var6.requestFocusInWindow();
    java.awt.Dimension var8 = var6.preferredSize();
    int var9 = var6.getComponentCount();
    boolean var10 = var0.isFocusCycleRoot(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.enable(false);
    boolean var3 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setFocusCycleRoot(false);
    var0.transferFocus();
    java.awt.Point var4 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.Image var4 = var0.createImage(1, 100);
    var0.revalidate();
    boolean var6 = var0.isPreferredSizeSet();
    java.awt.Color var7 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("\u2325+\u2303+Button2", 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.Container var3 = new java.awt.Container();
    boolean var4 = var3.requestFocusInWindow();
    java.awt.Dimension var5 = var3.preferredSize();
    var0.setPreferredSize(var5);
    java.awt.image.VolatileImage var9 = var0.createVolatileImage(1, 0);
    java.awt.Container var10 = new java.awt.Container();
    boolean var11 = var10.requestFocusInWindow();
    java.awt.Dimension var12 = var10.preferredSize();
    var0.setMaximumSize(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setFocusCycleRoot(false);
    var0.transferFocus();
    java.lang.Object var4 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.peer.ComponentPeer var2 = var0.getPeer();
    java.awt.Container var3 = new java.awt.Container();
    boolean var4 = var3.requestFocusInWindow();
    java.awt.Dimension var5 = var3.preferredSize();
    var0.setPreferredSize(var5);
    java.awt.Dimension var7 = var0.getSize();
    var0.transferFocusBackward();
    java.awt.dnd.DropTarget var9 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.Dimension var2 = var0.preferredSize();
    int var3 = var0.getComponentCount();
    java.awt.Container var4 = new java.awt.Container();
    boolean var5 = var4.requestFocusInWindow();
    java.awt.peer.ComponentPeer var6 = var4.getPeer();
    java.awt.Container var7 = new java.awt.Container();
    boolean var8 = var7.requestFocusInWindow();
    java.awt.Dimension var9 = var7.preferredSize();
    var4.setPreferredSize(var9);
    var0.setSize(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    var0.setVisible(true);
    java.awt.Component.BaselineResizeBehavior var4 = var0.getBaselineResizeBehavior();
    var0.firePropertyChange("", 0.0f, 10.0f);
    java.awt.event.MouseWheelEvent var19 = new java.awt.event.MouseWheelEvent((java.awt.Component)var0, 10, 1L, 10, (-1), 10, 0, true, 100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage(100, 10);
    java.awt.Font var5 = var0.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    java.awt.Dimension var2 = var0.preferredSize();
    var0.addNotify();
    var0.setSize(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.requestFocusInWindow();
    var0.firePropertyChange("\u2325+\u2303+Button2", (short)0, (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

}
