
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


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    boolean var3 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.transferFocus();
    boolean var4 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    java.awt.Color var4 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.net.URL var3 = var1.findResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    java.awt.Component.BaselineResizeBehavior var5 = var0.getBaselineResizeBehavior();
    var0.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    boolean var14 = var11.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Package var1 = java.lang.Package.getPackage("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    int var4 = var0.getX();
    boolean var5 = var0.hasFocus();
    javax.accessibility.AccessibleContext var6 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    java.awt.im.InputContext var3 = var0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.transferFocus();
    boolean var4 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    java.awt.Component var15 = var0.getComponent(0);
    java.awt.Rectangle var16 = var15.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    java.awt.Container var14 = new java.awt.Container();
    boolean var15 = var14.isLightweight();
    var14.doLayout();
    var14.repaint();
    java.awt.event.ComponentListener[] var18 = var14.getComponentListeners();
    java.awt.Container var19 = new java.awt.Container();
    boolean var20 = var19.isLightweight();
    var19.doLayout();
    var19.repaint();
    int var23 = var19.getX();
    java.awt.Dimension var24 = var19.getMaximumSize();
    java.awt.Dimension var25 = var14.getSize(var24);
    var13.setMaximumSize(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    int var3 = var0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    java.awt.Component var15 = var0.getComponent(0);
    boolean var16 = var15.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    var0.transferFocusDownCycle();
    boolean var11 = var0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    java.awt.Container var14 = new java.awt.Container();
    boolean var15 = var14.isLightweight();
    var14.doLayout();
    var14.repaint();
    int var18 = var14.getX();
    java.awt.Dimension var19 = var14.getMaximumSize();
    var0.resize(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var22 = var0.getFocusTraversalKeys(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    java.awt.event.ComponentListener[] var4 = var0.getComponentListeners();
    java.awt.Container var5 = new java.awt.Container();
    boolean var6 = var5.isLightweight();
    var5.doLayout();
    var5.repaint();
    int var9 = var5.getX();
    java.awt.Dimension var10 = var5.getMaximumSize();
    java.awt.Dimension var11 = var0.getSize(var10);
    boolean var12 = var0.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    boolean var14 = var11.isMaximumSizeSet();
    java.beans.PropertyChangeListener[] var16 = var11.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    java.awt.Container var11 = new java.awt.Container();
    boolean var12 = var11.isLightweight();
    java.awt.Component var13 = var0.add("", (java.awt.Component)var11);
    java.awt.Component var15 = var0.getComponent(0);
    float var16 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    var0.transferFocusDownCycle();
    java.awt.Rectangle var11 = var0.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    var0.setBounds(0, 1, (-1), 1);
    float var10 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.5f);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Package var1 = java.lang.Package.getPackage("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.show();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    boolean var4 = var0.isShowing();
    boolean var5 = var0.isValid();
    boolean var6 = var0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Container var0 = new java.awt.Container();
    boolean var1 = var0.isLightweight();
    var0.doLayout();
    var0.repaint();
    var0.setBounds(0, 100, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

}
