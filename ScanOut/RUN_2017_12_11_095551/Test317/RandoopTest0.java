
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1L);
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
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.needsGui();
    java.util.Locale var4 = var1.getLocale();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    java.util.Locale var10 = var7.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var11 = var1.getResourceAsStream("hi!", (java.beans.beancontext.BeanContextChild)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport();
    boolean var38 = var36.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var37);
    boolean var39 = var37.needsGui();
    java.util.Locale var40 = var37.getLocale();
    java.lang.Object[] var41 = new java.lang.Object[] { var40};
    java.lang.Object[] var42 = var31.toArray(var41);
    java.lang.Object[] var43 = var31.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport();
    boolean var38 = var36.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var37);
    boolean var39 = var37.needsGui();
    java.util.Locale var40 = var37.getLocale();
    java.lang.Object[] var41 = new java.lang.Object[] { var40};
    java.lang.Object[] var42 = var31.toArray(var41);
    java.beans.beancontext.BeanContextSupport var43 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var44 = new java.beans.beancontext.BeanContextSupport();
    boolean var45 = var43.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var44);
    java.beans.beancontext.BeanContextSupport var47 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var48 = new java.beans.beancontext.BeanContextSupport();
    boolean var49 = var47.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var48);
    boolean var50 = var48.needsGui();
    var44.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var52 = var31.retainAll((java.util.Collection)var48);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.needsGui();
    java.util.Locale var4 = var1.getLocale();
    boolean var6 = var1.contains((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.containsKey((java.lang.Object)(short)(-1));
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    var12.okToUseGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var13);
    boolean var15 = var13.needsGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.lang.Object[] var1 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    var3.setDesignTime(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContext var36 = var12.getBeanContext();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContext var36 = var12.getBeanContext();
    java.beans.beancontext.BeanContext var37 = var12.getBeanContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.needsGui();
    boolean var5 = var1.containsKey((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var13);
    int var15 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport();
    boolean var38 = var36.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var37);
    boolean var39 = var37.needsGui();
    java.util.Locale var40 = var37.getLocale();
    boolean var41 = var37.avoidingGui();
    java.lang.reflect.AccessibleObject[] var42 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.Object[] var47 = var37.toArray((java.lang.Object[])var42);
    boolean var48 = var12.containsKey((java.lang.Object)var37);
    java.beans.beancontext.BeanContextSupport var49 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var37);
    java.beans.beancontext.BeanContextSupport var50 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var51 = new java.beans.beancontext.BeanContextSupport();
    boolean var52 = var50.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var51);
    java.beans.beancontext.BeanContextSupport var54 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var55 = new java.beans.beancontext.BeanContextSupport();
    boolean var56 = var54.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var55);
    boolean var57 = var55.needsGui();
    var51.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var55);
    java.beans.beancontext.BeanContextSupport var60 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var62 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var63 = new java.beans.beancontext.BeanContextSupport();
    boolean var64 = var62.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var63);
    java.beans.beancontext.BeanContextSupport var66 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var67 = new java.beans.beancontext.BeanContextSupport();
    boolean var68 = var66.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var67);
    boolean var69 = var67.needsGui();
    var63.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var67);
    var60.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var63);
    java.beans.beancontext.BeanContextSupport var73 = new java.beans.beancontext.BeanContextSupport();
    var60.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var73);
    var51.removeVetoableChangeListener("", (java.beans.VetoableChangeListener)var60);
    java.beans.beancontext.BeanContextSupport var76 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var77 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var78 = new java.beans.beancontext.BeanContextSupport();
    boolean var79 = var77.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var78);
    boolean var80 = var78.needsGui();
    java.util.Locale var81 = var78.getLocale();
    java.beans.beancontext.BeanContextSupport var82 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var76, var81);
    var51.setLocale(var81);
    java.beans.beancontext.BeanContextSupport var86 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var49, var81, true, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport();
    boolean var38 = var36.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var37);
    boolean var39 = var37.needsGui();
    java.util.Locale var40 = var37.getLocale();
    boolean var41 = var37.avoidingGui();
    java.lang.reflect.AccessibleObject[] var42 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.Object[] var47 = var37.toArray((java.lang.Object[])var42);
    boolean var48 = var12.containsKey((java.lang.Object)var37);
    java.beans.beancontext.BeanContextSupport var49 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var37);
    java.beans.beancontext.BeanContextSupport var51 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var52 = new java.beans.beancontext.BeanContextSupport();
    boolean var53 = var51.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var52);
    var49.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var52);
    var52.dontUseGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var13);
    java.util.Iterator var15 = var0.iterator();
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    boolean var19 = var17.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var18);
    boolean var20 = var18.needsGui();
    java.util.Locale var21 = var18.getLocale();
    boolean var22 = var18.avoidingGui();
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var24 = new java.beans.beancontext.BeanContextSupport();
    boolean var25 = var23.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var24);
    boolean var26 = var24.needsGui();
    java.util.Locale var27 = var24.getLocale();
    boolean var28 = var24.avoidingGui();
    boolean var29 = var18.containsKey((java.lang.Object)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var30 = var0.getResource("hi!", (java.beans.beancontext.BeanContextChild)var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.needsGui();
    java.util.Locale var4 = var1.getLocale();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var10);
    boolean var12 = var10.needsGui();
    var6.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var10);
    java.util.Locale var14 = var10.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var1.removeAll((java.util.Collection)var10);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.lang.reflect.AccessibleObject[] var12 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var12, false);
    java.lang.reflect.AccessibleObject.setAccessible(var12, false);
    boolean var17 = var3.containsKey((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    boolean var9 = var7.needsGui();
    var3.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var7);
    var0.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var3);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    boolean var21 = var19.needsGui();
    var15.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var19);
    var12.addVetoableChangeListener("hi!", (java.beans.VetoableChangeListener)var15);
    boolean var24 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    java.beans.beancontext.BeanContextSupport var30 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var31 = new java.beans.beancontext.BeanContextSupport();
    boolean var32 = var30.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var31);
    boolean var33 = var31.needsGui();
    var27.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    var12.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var31);
    java.beans.beancontext.BeanContextSupport var36 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var37 = new java.beans.beancontext.BeanContextSupport();
    boolean var38 = var36.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var37);
    boolean var39 = var37.needsGui();
    java.util.Locale var40 = var37.getLocale();
    boolean var41 = var37.avoidingGui();
    java.lang.reflect.AccessibleObject[] var42 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.reflect.AccessibleObject.setAccessible(var42, false);
    java.lang.Object[] var47 = var37.toArray((java.lang.Object[])var42);
    boolean var48 = var12.containsKey((java.lang.Object)var37);
    java.beans.beancontext.BeanContextSupport var49 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var37);
    var37.dontUseGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

}
