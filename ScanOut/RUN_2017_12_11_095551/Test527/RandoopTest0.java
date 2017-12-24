
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.removeAll((java.util.Collection)var1);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var5 = var3.contains((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.removeAll((java.util.Collection)var3);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var4 = var3.getLocale();
    var0.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var3);
    var3.fireVetoableChange("hi!", (java.lang.Object)(byte)(-1), (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Iterator var1 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isSerializing();
    boolean var5 = var0.containsKey((java.lang.Object)(byte)100);
    java.beans.beancontext.BeanContextChild var6 = var0.getBeanContextChildPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var1 = var0.isDesignTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var4 = var3.getLocale();
    var0.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var6 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var9 = var8.getLocale();
    var5.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var8);
    java.beans.beancontext.BeanContext var11 = var5.getBeanContext();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    boolean var4 = var0.needsGui();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.contains((java.lang.Object)10);
    boolean var8 = var5.isSerializing();
    boolean var10 = var5.containsKey((java.lang.Object)(byte)100);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var15 = var14.getLocale();
    var11.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var14);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var18 = var17.getLocale();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var14, var18);
    java.beans.beancontext.BeanContextSupport var21 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var5, var18, true);
    java.beans.beancontext.BeanContextSupport var24 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0, var18, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isSerializing();
    boolean var5 = var0.containsKey((java.lang.Object)(byte)100);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var10 = var9.getLocale();
    var6.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var9);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var13 = var12.getLocale();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var9, var13);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0, var13, true);
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var21 = var19.contains((java.lang.Object)10);
    boolean var22 = var19.isDelegated();
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    boolean var25 = var23.contains((java.lang.Object)10);
    boolean var26 = var23.isSerializing();
    boolean var27 = var19.containsAll((java.util.Collection)var23);
    boolean var28 = var19.avoidingGui();
    var16.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var4 = var3.getLocale();
    var0.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var3);
    var3.dontUseGui();
    boolean var7 = var3.isDelegated();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var1 = var0.getLocale();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.contains((java.lang.Object)10);
    boolean var5 = var2.isDelegated();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.contains((java.lang.Object)10);
    boolean var9 = var6.isSerializing();
    boolean var10 = var2.containsAll((java.util.Collection)var6);
    boolean var11 = var0.containsAll((java.util.Collection)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var1 = var0.avoidingGui();
    boolean var2 = var0.isDelegated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    boolean var4 = var0.needsGui();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var5 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var4 = var3.getLocale();
    var0.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var3);
    java.beans.beancontext.BeanContext var6 = var0.getBeanContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.instantiateChild("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var1 = var0.getLocale();
    boolean var3 = var0.add((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.contains((java.lang.Object)10);
    boolean var8 = var5.isDelegated();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var10 = var9.getLocale();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var5, var10, false);
    var0.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var4.contains((java.lang.Object)10);
    boolean var7 = var4.isSerializing();
    boolean var8 = var0.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.contains((java.lang.Object)10);
    boolean var12 = var9.isDelegated();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var17 = var16.getLocale();
    var13.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var16);
    java.lang.Object[] var19 = new java.lang.Object[] { var13};
    java.lang.Object[] var20 = var9.toArray(var19);
    java.util.Locale var21 = var9.getLocale();
    boolean var22 = var4.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var4 = var3.getLocale();
    var0.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var7 = var6.getLocale();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var3, var7);
    boolean var9 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isSerializing();
    boolean var5 = var0.containsKey((java.lang.Object)(byte)100);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var10 = var9.getLocale();
    var6.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var9);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var13 = var12.getLocale();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var9, var13);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0, var13, true);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var4.contains((java.lang.Object)10);
    boolean var7 = var4.isSerializing();
    boolean var8 = var0.containsAll((java.util.Collection)var4);
    java.util.Iterator var9 = var0.iterator();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.contains((java.lang.Object)10);
    boolean var3 = var0.isDelegated();
    boolean var4 = var0.needsGui();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var9 = var8.getLocale();
    var5.fireVetoableChange("", (java.lang.Object)1, (java.lang.Object)var8);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var12 = var11.getLocale();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var8, var12);
    var0.setBeanContext((java.beans.beancontext.BeanContext)var13);
    int var15 = var0.size();
    boolean var16 = var0.isSerializing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.util.Locale var1 = var0.getLocale();
    boolean var3 = var0.add((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var5.avoidingGui();
    var5.okToUseGui();
    java.util.Iterator var8 = var5.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var9 = var0.getResourceAsStream("hi!", (java.beans.beancontext.BeanContextChild)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
