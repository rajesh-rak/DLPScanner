
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class[] var5 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var6 = var1.getDeclaredMethod("", var5);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var4 = var1.getDeclaredField("");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("", "", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var3 = var2.getConstructors();
    boolean var4 = var2.isPrimitive();
    java.lang.annotation.Annotation[] var5 = var2.getAnnotations();
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var8 = var7.getConstructors();
    boolean var9 = var7.isPrimitive();
    java.lang.annotation.Annotation[] var10 = var7.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var2, var7, (java.lang.Object)0L, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.jca.GetInstance.Instance var16 = sun.security.jca.GetInstance.getInstance("hi!", var2, "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var3 = var2.getConstructors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.jca.GetInstance.Instance var7 = sun.security.jca.GetInstance.getInstance("hi!", var2, "", (java.lang.Object)'a', "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var7 = var6.getConstructors();
    boolean var8 = var6.isPrimitive();
    java.lang.annotation.Annotation[] var9 = var6.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var6, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var13 = var1.getDeclaredConstructors();
    java.lang.reflect.Type var14 = var1.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isAnnotation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    java.lang.reflect.Field[] var5 = var1.getFields();
    java.lang.Package var6 = var1.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var7 = var6.getConstructors();
    boolean var8 = var6.isPrimitive();
    java.lang.annotation.Annotation[] var9 = var6.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var6, (java.lang.Object)0L, (-1));
    java.lang.Object[] var13 = var1.getEnumConstants();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    boolean var4 = var1.isAnonymousClass();
    java.io.ObjectStreamClass var5 = java.io.ObjectStreamClass.lookupAny(var1);
    long var6 = var5.getSerialVersionUID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var5 = var4.getConstructors();
    boolean var6 = var4.isPrimitive();
    java.lang.annotation.Annotation[] var7 = var4.getAnnotations();
    java.lang.Class[] var8 = var4.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.jca.GetInstance.Instance var10 = sun.security.jca.GetInstance.getInstance("", var1, "", (java.lang.Object)var8, "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var4 = var3.getConstructors();
    boolean var5 = var3.isPrimitive();
    boolean var6 = var3.isAnonymousClass();
    boolean var7 = var1.containsValue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.elements();
    int var3 = var1.size();
    java.util.Hashtable var5 = new java.util.Hashtable(10);
    java.util.Enumeration var6 = var5.elements();
    boolean var8 = var5.containsKey((java.lang.Object)0L);
    var1.putAll((java.util.Map)var5);
    java.security.Provider[] var10 = java.security.Security.getProviders();
    java.lang.Object var11 = var1.get((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Collection var2 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var4 = var3.getConstructors();
    boolean var5 = var3.isPrimitive();
    java.lang.annotation.Annotation[] var6 = var3.getAnnotations();
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var9 = var8.getConstructors();
    boolean var10 = var8.isPrimitive();
    java.lang.annotation.Annotation[] var11 = var8.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var3, var8, (java.lang.Object)0L, (-1));
    java.lang.Class var16 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var17 = var16.getConstructors();
    boolean var18 = var16.isPrimitive();
    java.lang.annotation.Annotation[] var19 = var16.getAnnotations();
    java.lang.Class var21 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var22 = var21.getConstructors();
    boolean var23 = var21.isPrimitive();
    java.lang.annotation.Annotation[] var24 = var21.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var16, var21, (java.lang.Object)0L, (-1));
    java.lang.Class var28 = var21.getDeclaringClass();
    java.lang.Class var29 = var3.asSubclass(var21);
    boolean var30 = var1.containsKey((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var7 = var6.getConstructors();
    boolean var8 = var6.isPrimitive();
    java.lang.annotation.Annotation[] var9 = var6.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var6, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var13 = var1.getDeclaredConstructors();
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var16 = var15.getConstructors();
    boolean var17 = var15.isPrimitive();
    java.lang.annotation.Annotation[] var18 = var15.getAnnotations();
    java.lang.Class var20 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var21 = var20.getConstructors();
    boolean var22 = var20.isPrimitive();
    java.lang.annotation.Annotation[] var23 = var20.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var15, var20, (java.lang.Object)0L, (-1));
    java.lang.Class var28 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var29 = var28.getConstructors();
    boolean var30 = var28.isPrimitive();
    java.lang.annotation.Annotation[] var31 = var28.getAnnotations();
    java.lang.Class var33 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var34 = var33.getConstructors();
    boolean var35 = var33.isPrimitive();
    java.lang.annotation.Annotation[] var36 = var33.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var28, var33, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var40 = var28.getDeclaredConstructors();
    boolean var42 = sun.reflect.Reflection.verifyMemberAccess(var1, var15, (java.lang.Object)var28, 100);
    java.lang.Class[] var43 = var15.getInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = java.security.Security.getProperty("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var3 = var2.getConstructors();
    boolean var4 = var2.isPrimitive();
    java.lang.annotation.Annotation[] var5 = var2.getAnnotations();
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var8 = var7.getConstructors();
    boolean var9 = var7.isPrimitive();
    java.lang.annotation.Annotation[] var10 = var7.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var2, var7, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var14 = var2.getDeclaredConstructors();
    java.lang.Class var16 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var17 = var16.getConstructors();
    boolean var18 = var16.isPrimitive();
    java.lang.annotation.Annotation[] var19 = var16.getAnnotations();
    java.lang.Class var21 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var22 = var21.getConstructors();
    boolean var23 = var21.isPrimitive();
    java.lang.annotation.Annotation[] var24 = var21.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var16, var21, (java.lang.Object)0L, (-1));
    java.lang.Class var29 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var30 = var29.getConstructors();
    boolean var31 = var29.isPrimitive();
    java.lang.annotation.Annotation[] var32 = var29.getAnnotations();
    java.lang.Class var34 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var35 = var34.getConstructors();
    boolean var36 = var34.isPrimitive();
    java.lang.annotation.Annotation[] var37 = var34.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var29, var34, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var41 = var29.getDeclaredConstructors();
    boolean var43 = sun.reflect.Reflection.verifyMemberAccess(var2, var16, (java.lang.Object)var29, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.jca.GetInstance.Instance var45 = sun.security.jca.GetInstance.getInstance("randoop.util.ReflectionCode", var2, "randoop.util.ReflectionCode");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getConstructors();
    boolean var3 = var1.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var7 = var6.getConstructors();
    boolean var8 = var6.isPrimitive();
    java.lang.annotation.Annotation[] var9 = var6.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var6, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var13 = var1.getDeclaredConstructors();
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var16 = var15.getConstructors();
    boolean var17 = var15.isPrimitive();
    java.lang.annotation.Annotation[] var18 = var15.getAnnotations();
    java.lang.Class var20 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var21 = var20.getConstructors();
    boolean var22 = var20.isPrimitive();
    java.lang.annotation.Annotation[] var23 = var20.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var15, var20, (java.lang.Object)0L, (-1));
    java.lang.Class var28 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var29 = var28.getConstructors();
    boolean var30 = var28.isPrimitive();
    java.lang.annotation.Annotation[] var31 = var28.getAnnotations();
    java.lang.Class var33 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var34 = var33.getConstructors();
    boolean var35 = var33.isPrimitive();
    java.lang.annotation.Annotation[] var36 = var33.getAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var28, var33, (java.lang.Object)0L, (-1));
    java.lang.reflect.Constructor[] var40 = var28.getDeclaredConstructors();
    boolean var42 = sun.reflect.Reflection.verifyMemberAccess(var1, var15, (java.lang.Object)var28, 100);
    java.lang.reflect.Constructor var43 = var15.getEnclosingConstructor();
    java.lang.String var44 = var15.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "sun.reflect.Reflection"+ "'", var44.equals("sun.reflect.Reflection"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.elements();
    boolean var4 = var1.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

}
