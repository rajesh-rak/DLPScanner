
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
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    boolean var12 = var10.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var11);
    boolean var13 = var11.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStream var14 = var1.getResourceAsStream("", (java.beans.beancontext.BeanContextChild)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    boolean var5 = var3.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var4);
    var4.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var1.addAll((java.util.Collection)var4);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    var6.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var13 = var6.containsKey((java.lang.Object)100L);
    boolean var15 = var6.contains((java.lang.Object)100);
    var1.firePropertyChange("", (java.lang.Object)var15, (java.lang.Object)"");
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    var19.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var26 = var19.containsKey((java.lang.Object)100L);
    boolean var28 = var19.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var29 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var30 = var1.retainAll((java.util.Collection)var19);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    var6.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var13 = var6.containsKey((java.lang.Object)100L);
    boolean var15 = var6.contains((java.lang.Object)100);
    var1.firePropertyChange("", (java.lang.Object)var15, (java.lang.Object)"");
    boolean var18 = var1.isDesignTime();
    java.beans.beancontext.BeanContextChild var19 = var1.getBeanContextChildPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    boolean var10 = var1.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    boolean var5 = var1.add((java.lang.Object)true);
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var7 = new java.beans.beancontext.BeanContextSupport();
    boolean var8 = var6.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var7);
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    boolean var12 = var10.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var11);
    var11.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var18 = var11.containsKey((java.lang.Object)100L);
    boolean var19 = var11.needsGui();
    var6.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var11);
    boolean var21 = var11.isSerializing();
    boolean var22 = var1.containsKey((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.lang.Object[] var1 = var0.toArray();
    java.beans.beancontext.BeanContext var2 = var0.getBeanContextPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.lang.Object[] var1 = var0.toArray();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    var3.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var10 = var3.containsKey((java.lang.Object)100L);
    boolean var12 = var3.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.retainAll((java.util.Collection)var13);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var10);
    var10.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    var1.setBeanContext((java.beans.beancontext.BeanContext)var10);
    java.util.Locale var17 = var1.getLocale();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    boolean var20 = var18.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var19);
    var19.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var25 = var19.isDelegated();
    boolean var26 = var1.contains((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    boolean var10 = var1.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var1);
    boolean var12 = var1.isDesignTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var4.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var5);
    var5.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var12 = var5.containsKey((java.lang.Object)100L);
    boolean var13 = var5.needsGui();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    boolean var18 = var16.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var17);
    var17.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var24 = var17.containsKey((java.lang.Object)100L);
    boolean var26 = var17.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var17);
    var0.removeVetoableChangeListener("", (java.beans.VetoableChangeListener)var17);
    boolean var29 = var0.isDesignTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var10);
    var10.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    var1.setBeanContext((java.beans.beancontext.BeanContext)var10);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    boolean var19 = var17.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var18);
    var18.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var25 = var18.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var27 = new java.beans.beancontext.BeanContextSupport();
    boolean var28 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var27);
    var27.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    var18.setBeanContext((java.beans.beancontext.BeanContext)var27);
    java.util.Locale var34 = var18.getLocale();
    java.lang.Object[] var35 = new java.lang.Object[] { var18};
    java.lang.Object[] var36 = var10.toArray(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    boolean var5 = var1.add((java.lang.Object)true);
    java.lang.Object[] var7 = new java.lang.Object[] { 0.0f};
    java.lang.Object[] var8 = var1.toArray(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.lang.Object[] var1 = var0.toArray();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    var3.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var10 = var3.containsKey((java.lang.Object)100L);
    boolean var12 = var3.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var3);
    java.util.Locale var14 = var3.getLocale();
    var0.setBeanContext((java.beans.beancontext.BeanContext)var3);
    var3.setDesignTime(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    boolean var10 = var8.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var9);
    boolean var11 = var9.isEmpty();
    boolean var13 = var9.add((java.lang.Object)true);
    var1.removeVetoableChangeListener("", (java.beans.VetoableChangeListener)var9);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var17 = var1.getResource("", (java.beans.beancontext.BeanContextChild)var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    boolean var10 = var1.contains((java.lang.Object)100);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport((java.beans.beancontext.BeanContext)var1);
    java.util.Locale var12 = var1.getLocale();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    boolean var15 = var13.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var14);
    var14.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var20 = var14.isDelegated();
    boolean var21 = var14.isDelegated();
    java.beans.beancontext.BeanContextSupport var22 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var23 = new java.beans.beancontext.BeanContextSupport();
    boolean var24 = var22.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var23);
    var23.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var30 = var23.containsKey((java.lang.Object)100L);
    boolean var31 = var23.needsGui();
    boolean var32 = var14.contains((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var33 = var1.removeAll((java.util.Collection)var14);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var10);
    var10.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    var1.setBeanContext((java.beans.beancontext.BeanContext)var10);
    java.util.Locale var17 = var1.getLocale();
    java.beans.beancontext.BeanContextSupport var19 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    boolean var21 = var19.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var20);
    var20.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var27 = var20.containsKey((java.lang.Object)100L);
    java.beans.beancontext.BeanContextSupport var28 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var29 = new java.beans.beancontext.BeanContextSupport();
    boolean var30 = var28.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var29);
    var29.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    var20.setBeanContext((java.beans.beancontext.BeanContext)var29);
    var1.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    java.beans.beancontext.BeanContext var4 = var1.getBeanContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var8 = var1.containsKey((java.lang.Object)100L);
    boolean var9 = var1.needsGui();
    var1.setDesignTime(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var4.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var5);
    var5.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var12 = var5.containsKey((java.lang.Object)100L);
    boolean var13 = var5.needsGui();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var15 = var5.isSerializing();
    java.lang.Object[] var16 = var5.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    boolean var3 = var1.isEmpty();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    var6.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var13 = var6.containsKey((java.lang.Object)100L);
    boolean var15 = var6.contains((java.lang.Object)100);
    var1.firePropertyChange("", (java.lang.Object)var15, (java.lang.Object)"");
    boolean var18 = var1.isDesignTime();
    java.beans.beancontext.BeanContext var19 = var1.getBeanContextPeer();
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var21 = new java.beans.beancontext.BeanContextSupport();
    boolean var22 = var20.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var21);
    boolean var23 = var21.isEmpty();
    boolean var25 = var21.add((java.lang.Object)true);
    boolean var26 = var1.containsAll((java.util.Collection)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var1.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    boolean var10 = var8.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var9);
    boolean var11 = var9.isEmpty();
    boolean var13 = var9.add((java.lang.Object)true);
    var1.removeVetoableChangeListener("", (java.beans.VetoableChangeListener)var9);
    java.beans.beancontext.BeanContext var15 = var1.getBeanContextPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    boolean var6 = var4.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var5);
    var5.firePropertyChange("", (java.lang.Object)'#', (java.lang.Object)1L);
    boolean var12 = var5.containsKey((java.lang.Object)100L);
    boolean var13 = var5.needsGui();
    var0.addPropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    boolean var17 = var15.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var16);
    boolean var18 = var16.isEmpty();
    boolean var19 = var0.remove((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

}
