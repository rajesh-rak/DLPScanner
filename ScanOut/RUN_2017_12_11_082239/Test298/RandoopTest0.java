
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "hi!");
    java.lang.Thread var5 = new java.lang.Thread((java.lang.Runnable)var1, "");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.applet.AppletViewer.networkProperties();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "hi!");
    java.lang.Thread var4 = new java.lang.Thread((java.lang.Runnable)var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var0 = sun.applet.AppletViewer.countApplets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();
    java.lang.Thread var5 = new java.lang.Thread("");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var5, "hi!");
    java.lang.Thread var9 = new java.lang.Thread((java.lang.Runnable)var5, "hi!");
    java.lang.Thread[] var10 = new java.lang.Thread[] { var9};
    int var12 = var1.enumerate(var10, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.lang.Thread var3 = new java.lang.Thread("");
    java.lang.Thread var5 = new java.lang.Thread((java.lang.Runnable)var3, "hi!");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var3, "hi!");
    java.lang.Object var8 = var0.get((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = sun.awt.AppContext.isMainContext(var0);
    java.lang.Object var3 = var0.remove((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.awt.Window[] var1 = java.awt.Window.getOwnerlessWindows();
    java.lang.Thread var3 = new java.lang.Thread("");
    java.lang.Object var4 = var0.put((java.lang.Object)var1, (java.lang.Object)"");
    java.lang.Thread var6 = new java.lang.Thread("");
    java.lang.Thread var8 = new java.lang.Thread((java.lang.Runnable)var6, "hi!");
    java.lang.Thread var10 = new java.lang.Thread((java.lang.Runnable)var6, "hi!");
    sun.awt.AppContext var11 = sun.awt.AppContext.getAppContext();
    java.awt.Window[] var12 = java.awt.Window.getOwnerlessWindows();
    java.lang.Thread var14 = new java.lang.Thread("");
    java.lang.Object var15 = var11.put((java.lang.Object)var12, (java.lang.Object)"");
    java.lang.Object var16 = var0.put((java.lang.Object)"hi!", (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();
    var1.destroy();
    java.lang.Thread var6 = new java.lang.Thread("");
    java.lang.Thread var8 = new java.lang.Thread((java.lang.Runnable)var6, "hi!");
    java.lang.Thread[] var9 = new java.lang.Thread[] { var6};
    int var10 = var1.enumerate(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.lang.Thread var3 = new java.lang.Thread("");
    java.lang.Object var4 = var0.remove((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, true);
    boolean var7 = var1.isDestroyed();
    java.lang.Thread var9 = new java.lang.Thread("");
    java.lang.Thread var11 = new java.lang.Thread((java.lang.Runnable)var9, "hi!");
    java.lang.Thread var12 = new java.lang.Thread((java.lang.Runnable)var11);
    java.lang.Thread[] var13 = new java.lang.Thread[] { var11};
    int var14 = var1.enumerate(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "hi!");
    java.lang.Thread var5 = new java.lang.Thread((java.lang.Runnable)var1, "hi!");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var1, "sun.awt.AppContext[threadGroup=system]");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.lang.String var2 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var2.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.lang.String var2 = var0.toString();
    java.lang.ClassLoader var3 = var0.getContextClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var2.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    boolean var3 = var1.isDaemon();
    java.lang.Thread var5 = new java.lang.Thread("");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var5, "hi!");
    java.lang.Thread var9 = new java.lang.Thread((java.lang.Runnable)var5, "");
    java.lang.Thread[] var10 = new java.lang.Thread[] { var5};
    int var12 = var1.enumerate(var10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, true);
    var5.interrupt();
    boolean var12 = var1.parentOf(var5);
    var5.interrupt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, true);
    var1.setDaemon(false);
    var1.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners("hi!");
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();
    var1.checkAccess();
    java.lang.Thread var5 = new java.lang.Thread();
    java.lang.Thread var8 = new java.lang.Thread(var1, (java.lang.Runnable)var5, "hi!", 1L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.stop();
    var1.stop();
    var1.destroy();
    boolean var5 = var1.isDaemon();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.destroy();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, true);
    var1.setDaemon(false);
    boolean var9 = var1.isDestroyed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

}
