
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.util.Debug.println("", "hi!");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var3 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var2);
    java.lang.Object var4 = var3.clone();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"+ "'", var5.equals("javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    var0.dontUseGui();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    boolean var5 = var3.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var4);
    boolean var6 = var1.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var4);
    var4.firePropertyChange("javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]", (java.lang.Object)"javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]", (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0a"+ "'", var2.equals("0a"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    boolean var3 = var1.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var2);
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    var4.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var6);
    boolean var8 = var1.containsAll((java.util.Collection)var4);
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var10 = new java.beans.beancontext.BeanContextSupport();
    boolean var11 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var10);
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var13 = new java.beans.beancontext.BeanContextSupport();
    boolean var14 = var12.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var13);
    boolean var15 = var10.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var13);
    boolean var16 = var1.contains((java.lang.Object)var13);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    boolean var19 = var17.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var18);
    java.beans.beancontext.BeanContextSupport var20 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var22 = new java.beans.beancontext.BeanContextSupport();
    var20.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var22);
    boolean var24 = var17.containsAll((java.util.Collection)var20);
    java.beans.beancontext.BeanContextSupport var25 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var26 = new java.beans.beancontext.BeanContextSupport();
    boolean var27 = var25.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var26);
    java.beans.beancontext.BeanContextSupport var28 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var29 = new java.beans.beancontext.BeanContextSupport();
    boolean var30 = var28.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var29);
    boolean var31 = var26.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var29);
    boolean var32 = var17.contains((java.lang.Object)var29);
    var13.setBeanContext((java.beans.beancontext.BeanContext)var29);
    boolean var34 = var0.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var4 = new java.beans.beancontext.BeanContextSupport();
    boolean var5 = var3.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var4);
    boolean var6 = var1.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var4);
    javax.management.MBeanParameterInfo[] var9 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var10 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var9);
    boolean var11 = var1.contains((java.lang.Object)var9);
    boolean var13 = var1.remove((java.lang.Object)100.0f);
    java.beans.beancontext.BeanContextSupport var14 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var15 = new java.beans.beancontext.BeanContextSupport();
    boolean var16 = var14.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var15);
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var18 = new java.beans.beancontext.BeanContextSupport();
    boolean var19 = var17.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var18);
    boolean var20 = var15.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var18);
    javax.management.MBeanParameterInfo[] var23 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var24 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var23);
    boolean var25 = var15.contains((java.lang.Object)var23);
    boolean var27 = var15.remove((java.lang.Object)100.0f);
    boolean var28 = var1.containsAll((java.util.Collection)var15);
    boolean var29 = var15.isSerializing();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    var0.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var2);
    boolean var5 = var0.remove((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.beancontext.BeanContextSupport var2 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    boolean var4 = var2.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var3);
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var6 = new java.beans.beancontext.BeanContextSupport();
    boolean var7 = var5.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    boolean var8 = var3.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var6);
    javax.management.MBeanParameterInfo[] var11 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var12 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var11);
    boolean var13 = var3.contains((java.lang.Object)var11);
    javax.management.MBeanConstructorInfo var14 = new javax.management.MBeanConstructorInfo("hi!", "javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]", var11);
    java.lang.String var15 = var14.getDescription();
    java.lang.String var16 = var14.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"+ "'", var15.equals("javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"+ "'", var16.equals("javax.management.MBeanConstructorInfo[description=hi!, name=hi!, signature=[], descriptor={}]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var3 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var2);
    java.lang.Object var4 = var3.clone();
    javax.management.MBeanParameterInfo[] var9 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var10 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var9);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("hi!", "", var9, "hi!", 1);
    boolean var14 = var3.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var0.containsAll((java.util.Collection)var3);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    boolean var10 = var8.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var9);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    boolean var13 = var11.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var12);
    boolean var14 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var12);
    boolean var15 = var0.contains((java.lang.Object)var12);
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var0.containsAll((java.util.Collection)var3);
    java.util.Locale var8 = var3.getLocale();
    java.util.Currency var9 = java.util.Currency.getInstance(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.beans.beancontext.BeanContextSupport var0 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var1 = new java.beans.beancontext.BeanContextSupport();
    boolean var2 = var0.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var1);
    java.beans.beancontext.BeanContextSupport var3 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var5 = new java.beans.beancontext.BeanContextSupport();
    var3.removePropertyChangeListener("", (java.beans.PropertyChangeListener)var5);
    boolean var7 = var0.containsAll((java.util.Collection)var3);
    java.beans.beancontext.BeanContextSupport var8 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var9 = new java.beans.beancontext.BeanContextSupport();
    boolean var10 = var8.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var9);
    java.beans.beancontext.BeanContextSupport var11 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var12 = new java.beans.beancontext.BeanContextSupport();
    boolean var13 = var11.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var12);
    boolean var14 = var9.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var12);
    boolean var15 = var0.contains((java.lang.Object)var12);
    java.beans.beancontext.BeanContextSupport var16 = new java.beans.beancontext.BeanContextSupport();
    java.beans.beancontext.BeanContextSupport var17 = new java.beans.beancontext.BeanContextSupport();
    boolean var18 = var16.validatePendingSetBeanContext((java.beans.beancontext.BeanContext)var17);
    var17.okToUseGui();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var12.removeAll((java.util.Collection)var17);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Exception var1 = new java.lang.Exception("0a");
    java.lang.Exception var2 = new java.lang.Exception((java.lang.Throwable)var1);
    java.lang.Exception var4 = new java.lang.Exception("0a");
    var2.addSuppressed((java.lang.Throwable)var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var4);
    javax.management.MBeanOperationInfo var8 = new javax.management.MBeanOperationInfo("hi!", "", var4, "hi!", 1);
    java.lang.String var9 = var8.getName();
    boolean var11 = var8.equals((java.lang.Object)(-1L));
    java.lang.String var12 = var8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = var0.getComponentType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
