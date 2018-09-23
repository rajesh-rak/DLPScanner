
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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContext var1 = var0.getBeanContextPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.fireVetoableChange("", (java.lang.Object)(short)10, (java.lang.Object)0L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var4.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    int var11 = var10.size();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var10);
    var4.fireVetoableChange("", (java.lang.Object)var12, (java.lang.Object)false);
    boolean var15 = var4.isDelegated();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var16 = var2.getResourceAsStream("hi!", (java.beans.beancontext.BeanContextChild)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    var2.setBeanContext((java.beans.beancontext.BeanContext)var3);
    var3.okToUseGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    int var7 = var6.size();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var6);
    var0.fireVetoableChange("", (java.lang.Object)var8, (java.lang.Object)false);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    int var12 = var11.size();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var11);
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    int var15 = var14.size();
    boolean var16 = var13.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var14);
    java.lang.Object[] var17 = var14.toArray();
    boolean var18 = var0.containsAll((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    var2.setBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContext var6 = var3.getBeanContextPeer();
    boolean var7 = var3.isDelegated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    int var5 = var4.size();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var7 = var0.getResource("hi!", (java.beans.beancontext.BeanContextChild)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.retainAll((java.util.Collection)var1);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var1 = var0.isDelegated();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var2.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    int var9 = var8.size();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var8);
    var2.fireVetoableChange("", (java.lang.Object)var10, (java.lang.Object)false);
    boolean var13 = var0.containsKey((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isSerializing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    var2.setBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContext var6 = var3.getBeanContextPeer();
    java.lang.Object[] var8 = new java.lang.Object[] { (byte)10};
    java.lang.Object[] var9 = var3.toArray(var8);
    boolean var10 = var3.isSerializing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    boolean var5 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.lang.Object[] var6 = var3.toArray();
    java.beans.beancontext.BeanContextChild var7 = var3.getBeanContextChildPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isDelegated();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    int var5 = var4.size();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4);
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    int var8 = var7.size();
    boolean var9 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    var0.firePropertyChange("hi!", (java.lang.Object)var6, (java.lang.Object)(-1));
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var13.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    var13.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var19);
    var0.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var13);
    java.lang.Object[] var22 = var13.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    boolean var6 = var0.remove((java.lang.Object)(short)1);
    boolean var8 = var0.containsKey((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    int var5 = var4.size();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4);
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    int var8 = var7.size();
    boolean var9 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    var0.firePropertyChange("hi!", (java.lang.Object)var6, (java.lang.Object)(-1));
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    int var13 = var12.size();
    boolean var14 = var12.isDelegated();
    boolean var15 = var6.remove((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    boolean var6 = var0.remove((java.lang.Object)(short)1);
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    boolean var8 = var6.isDelegated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    int var5 = var4.size();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4);
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    int var8 = var7.size();
    boolean var9 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    var0.firePropertyChange("hi!", (java.lang.Object)var6, (java.lang.Object)(-1));
    java.beans.beancontext.BeanContext var12 = var6.getBeanContextPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.firePropertyChange("hi!", (java.lang.Object)0, (java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    int var7 = var6.size();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var6);
    var0.fireVetoableChange("", (java.lang.Object)var8, (java.lang.Object)false);
    boolean var12 = var8.remove((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    boolean var5 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.lang.Object[] var6 = var3.toArray();
    java.util.Iterator var7 = var3.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    int var1 = var0.size();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    int var4 = var3.size();
    var2.setBeanContext((java.beans.beancontext.BeanContext)var3);
    boolean var6 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

}
