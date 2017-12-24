
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


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Container var0 = new java.awt.Container();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var2 = var0.getFocusTraversalKeys(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Point var3 = var2.location();
    int var4 = var0.getComponentZOrder((java.awt.Component)var2);
    java.awt.LayoutManager var5 = var0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.Dimension var2 = var0.size();
    java.awt.Dimension var3 = var0.getSize();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.focusNextComponent();
    java.beans.VetoableChangeListener[] var2 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Point var3 = var2.location();
    int var4 = var0.getComponentZOrder((java.awt.Component)var2);
    boolean var5 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage(10, (-1));
    var0.show(false);
    java.awt.Container var7 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Point var1 = var0.location();
    boolean var4 = var0.contains(1, 10);
    java.awt.peer.ComponentPeer var5 = var0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isValidateRoot();
    java.lang.String var3 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Locale var4 = var0.getLocale();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Container[,0,0,0var3,invalid]"+ "'", var3.equals("java.awt.Container[,0,0,0var3,invalid]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isValidateRoot();
    boolean var3 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.Container var2 = new java.awt.Container();
    java.awt.Point var3 = var2.location();
    int var4 = var0.getComponentZOrder((java.awt.Component)var2);
    java.awt.Container var5 = new java.awt.Container();
    java.awt.Point var6 = var5.location();
    java.awt.Container var7 = new java.awt.Container();
    java.awt.Point var8 = var7.location();
    java.awt.Component var9 = var5.getComponentAt(var8);
    java.awt.Component var10 = var0.getComponentAt(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage(10, (-1));
    java.awt.LayoutManager var5 = var0.getLayout();
    var0.show(false);
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Point var1 = var0.location();
    boolean var4 = var0.contains(1, 10);
    java.awt.Rectangle var5 = var0.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isValidateRoot();
    java.lang.String var3 = var0.toString();
    java.awt.Dimension var4 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Container[,0,0,0var3,invalid]"+ "'", var3.equals("java.awt.Container[,0,0,0var3,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isValidateRoot();
    java.lang.String var3 = var0.toString();
    boolean var5 = var0.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Container[,0,0,0var3,invalid]"+ "'", var3.equals("java.awt.Container[,0,0,0var3,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.awt.Container var0 = new java.awt.Container();
    java.lang.String var1 = var0.toString();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage(10, (-1));
    var0.show(false);
    var0.setBounds(1, (-1), (-1), 0);
    var0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.awt.Container[,0,0,0var1,invalid]"+ "'", var1.equals("java.awt.Container[,0,0,0var1,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.applet.Applet var0 = new java.applet.Applet();
    java.applet.AppletContext var1 = var0.getAppletContext();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.focusNextComponent();
    var0.focusNextComponent();
    var0.clearGlobalFocusOwner();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.setFocusable(false);
    var0.setBounds(100, (-1), 1, 10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.applet.Applet var0 = new java.applet.Applet();
    var0.destroy();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.awt.Container var3 = new java.awt.Container();
    java.lang.String var4 = var3.toString();
    java.awt.image.VolatileImage var7 = var3.createVolatileImage(10, (-1));
    var3.show(false);
    var3.setBounds(1, (-1), (-1), 0);
    boolean var15 = var2.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Container[,0,0,0var4,invalid]"+ "'", var4.equals("java.awt.Container[,0,0,0var4,invalid]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.plaf.basic.BasicOptionPaneUI var0 = new javax.swing.plaf.basic.BasicOptionPaneUI();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Point var1 = var0.location();
    boolean var2 = var0.isDoubleBuffered();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var4 = var0.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
