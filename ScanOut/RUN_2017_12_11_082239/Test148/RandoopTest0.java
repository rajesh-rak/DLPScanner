
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)'a');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.swing.text.LayoutQueue var0 = new javax.swing.text.LayoutQueue();
    javax.swing.text.LayoutQueue.setDefaultQueue(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.swing.text.LayoutQueue var0 = javax.swing.text.LayoutQueue.getDefaultQueue();
    javax.swing.text.LayoutQueue.setDefaultQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    boolean var4 = var0.isDisposed();
    boolean var5 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var6 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    boolean var4 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var5 = var0.getPropertyChangeListeners();
    java.lang.ThreadGroup var6 = var0.getThreadGroup();
    java.lang.ClassLoader var7 = var0.getContextClassLoader();
    java.util.Set var8 = sun.awt.AppContext.getAppContexts();
    sun.awt.AppContext var9 = sun.awt.AppContext.getAppContext();
    boolean var10 = sun.awt.AppContext.isMainContext(var9);
    java.lang.Object var11 = var0.put((java.lang.Object)var8, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    boolean var3 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners();
    java.beans.PropertyChangeListener[] var6 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    boolean var4 = var0.isDisposed();
    java.lang.reflect.AccessibleObject[] var5 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var5, false);
    java.lang.reflect.AccessibleObject.setAccessible(var5, true);
    java.lang.Object var10 = var0.get((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    java.lang.String var4 = var0.toString();
    java.lang.Object var6 = var0.remove((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var4.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    boolean var4 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var5 = var0.getPropertyChangeListeners();
    java.lang.ThreadGroup var6 = var0.getThreadGroup();
    java.lang.ClassLoader var7 = var0.getContextClassLoader();
    java.lang.Class[] var8 = new java.lang.Class[] { };
    java.lang.Class var9 = java.lang.reflect.Proxy.getProxyClass(var7, var8);
    java.io.ObjectStreamClass var10 = java.io.ObjectStreamClass.lookupAny(var9);
    long var11 = var10.getSerialVersionUID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    java.lang.ThreadGroup var3 = var0.getThreadGroup();
    boolean var4 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var5 = var0.getPropertyChangeListeners();
    sun.awt.AppContext var6 = sun.awt.AppContext.getAppContext();
    java.lang.Object var8 = var6.remove((java.lang.Object)1);
    java.lang.ThreadGroup var9 = var6.getThreadGroup();
    boolean var10 = var6.isDisposed();
    boolean var11 = var6.isDisposed();
    java.lang.Object var12 = var0.get((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    boolean var3 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners();
    java.lang.ClassLoader var5 = var0.getContextClassLoader();
    sun.awt.AppContext var6 = sun.awt.AppContext.getAppContext();
    java.lang.Object var8 = var6.remove((java.lang.Object)1);
    java.lang.ThreadGroup var9 = var6.getThreadGroup();
    boolean var10 = var6.isDisposed();
    java.beans.PropertyChangeListener[] var11 = var6.getPropertyChangeListeners();
    java.lang.ThreadGroup var12 = var6.getThreadGroup();
    java.lang.ClassLoader var13 = var6.getContextClassLoader();
    java.lang.Class[] var14 = new java.lang.Class[] { };
    java.lang.Class var15 = java.lang.reflect.Proxy.getProxyClass(var13, var14);
    sun.awt.AppContext var16 = sun.awt.AppContext.getAppContext();
    java.lang.Object var18 = var16.remove((java.lang.Object)1);
    java.lang.ThreadGroup var19 = var16.getThreadGroup();
    boolean var20 = var16.isDisposed();
    java.beans.PropertyChangeListener[] var21 = var16.getPropertyChangeListeners();
    java.lang.ThreadGroup var22 = var16.getThreadGroup();
    java.lang.ClassLoader var23 = var16.getContextClassLoader();
    java.lang.Class[] var24 = new java.lang.Class[] { };
    java.lang.Class var25 = java.lang.reflect.Proxy.getProxyClass(var23, var24);
    java.lang.Class var26 = java.lang.reflect.Proxy.getProxyClass(var13, var24);
    java.lang.Class var27 = java.lang.reflect.Proxy.getProxyClass(var5, var24);
    boolean var28 = java.lang.reflect.Proxy.isProxyClass(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)1);
    boolean var3 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners();
    java.lang.ClassLoader var5 = var0.getContextClassLoader();
    sun.awt.AppContext var6 = sun.awt.AppContext.getAppContext();
    java.lang.Object var8 = var6.remove((java.lang.Object)1);
    java.lang.ThreadGroup var9 = var6.getThreadGroup();
    boolean var10 = var6.isDisposed();
    java.beans.PropertyChangeListener[] var11 = var6.getPropertyChangeListeners();
    java.lang.ThreadGroup var12 = var6.getThreadGroup();
    java.lang.ClassLoader var13 = var6.getContextClassLoader();
    java.lang.Class[] var14 = new java.lang.Class[] { };
    java.lang.Class var15 = java.lang.reflect.Proxy.getProxyClass(var13, var14);
    sun.awt.AppContext var16 = sun.awt.AppContext.getAppContext();
    java.lang.Object var18 = var16.remove((java.lang.Object)1);
    java.lang.ThreadGroup var19 = var16.getThreadGroup();
    boolean var20 = var16.isDisposed();
    java.beans.PropertyChangeListener[] var21 = var16.getPropertyChangeListeners();
    java.lang.ThreadGroup var22 = var16.getThreadGroup();
    java.lang.ClassLoader var23 = var16.getContextClassLoader();
    java.lang.Class[] var24 = new java.lang.Class[] { };
    java.lang.Class var25 = java.lang.reflect.Proxy.getProxyClass(var23, var24);
    java.lang.Class var26 = java.lang.reflect.Proxy.getProxyClass(var13, var24);
    java.lang.Class var27 = java.lang.reflect.Proxy.getProxyClass(var5, var24);
    java.io.ObjectStreamClass var28 = java.io.ObjectStreamClass.lookupAny(var27);
    java.io.ObjectStreamField var30 = var28.getField("sun.awt.AppContext[threadGroup=system]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.lang.ThreadGroup var2 = var0.getThreadGroup();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var3.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ThreadGroup var1 = var0.getThreadGroup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var2 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
