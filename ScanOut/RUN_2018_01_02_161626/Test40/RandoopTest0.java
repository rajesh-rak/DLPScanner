
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
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)0);
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
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.instantiateChild("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextChild var3 = var0.getBeanContextChildPeer();
    boolean var5 = var0.contains((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var4.setDesignTime(true);
    java.util.Iterator var7 = var4.iterator();
    var0.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    boolean var10 = var9.isSerializing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    boolean var4 = var0.isSerializing();
    java.beans.beancontext.BeanContext var5 = var0.getBeanContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContext var4 = var3.getBeanContext();
    java.beans.beancontext.BeanContextChild var5 = var3.getBeanContextChildPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    var3.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var3);
    java.lang.Object[] var7 = var6.toArray();
    boolean var8 = var0.add((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContext var4 = var3.getBeanContext();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var6.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    var10.setDesignTime(true);
    java.util.Iterator var13 = var10.iterator();
    var6.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var10);
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var6);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    var17.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var21 = new java.beans.beancontext.BeanContextSupport();
    var21.setDesignTime(true);
    java.util.Iterator var24 = var21.iterator();
    var17.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var21);
    var6.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var21);
    var3.removeVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.util.Iterator var3 = var0.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var4 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextChild var3 = var0.getBeanContextChildPeer();
    var0.setDesignTime(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var4.setDesignTime(true);
    java.util.Iterator var7 = var4.iterator();
    var0.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    var10.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    var14.setDesignTime(true);
    java.util.Iterator var17 = var14.iterator();
    var10.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var14);
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var10);
    java.util.Locale var20 = var19.getLocale();
    java.beans.beancontext.BeanContextSupport var21 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0, var20);
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    var23.setDesignTime(true);
    java.util.Iterator var26 = var23.iterator();
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.util.Iterator var3 = var0.iterator();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var4.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    var8.setDesignTime(true);
    java.util.Iterator var11 = var8.iterator();
    var4.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var8);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4);
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    var14.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    var18.setDesignTime(true);
    java.util.Iterator var21 = var18.iterator();
    var14.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var18);
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var14);
    java.util.Locale var24 = var23.getLocale();
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var4, var24);
    java.beans.beancontext.BeanContextSupport var28 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0, var24, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextChild var3 = var0.getBeanContextChildPeer();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    var4.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    var8.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    var12.setDesignTime(true);
    java.util.Iterator var15 = var12.iterator();
    var8.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var12);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var8);
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    var19.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    var23.setDesignTime(true);
    java.util.Iterator var26 = var23.iterator();
    var19.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var23);
    var8.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var23);
    var4.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var23);
    var0.setBeanContext((java.beans.beancontext.BeanContext)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    var0.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    java.beans.beancontext.BeanContext var4 = var3.getBeanContext();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var6.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var6);
    boolean var10 = var6.isSerializing();
    var3.addVetoableChangeListener("", (java.beans.VetoableChangeListener)var6);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    var12.setDesignTime(true);
    boolean var15 = var12.isEmpty();
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    var17.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var21 = new java.beans.beancontext.BeanContextSupport();
    var21.setDesignTime(true);
    java.util.Iterator var24 = var21.iterator();
    var17.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var21);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var17);
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    var27.setDesignTime(true);
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    var31.setDesignTime(true);
    java.util.Iterator var34 = var31.iterator();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    boolean var36 = var17.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var31);
    boolean var38 = var12.isSerializing();
    boolean var39 = var6.remove((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

}
