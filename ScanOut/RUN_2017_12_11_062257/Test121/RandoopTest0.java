
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.cast((java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var6 = new java.lang.Class[] { var5};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var7 = var0.getDeclaredMethod("", var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "hi!", 1, "randoop.util.ReflectionCode");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.annotation.Annotation[] var3 = var0.getDeclaredAnnotations();
    boolean var4 = var0.isMemberClass();
    java.lang.reflect.Field[] var5 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var6 = sun.reflect.Reflection.filterFields(var0, var5);
    java.lang.reflect.AccessibleObject.setAccessible((java.lang.reflect.AccessibleObject[])var5, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    boolean var3 = var0.desiredAssertionStatus();
    java.lang.Object[] var4 = var0.getEnumConstants();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.lang.reflect.Constructor var2 = var0.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.lang.String var2 = var0.getSimpleName();
    java.lang.Class var3 = var0.getSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ReflectionCode"+ "'", var2.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    java.lang.Class var4 = var0.getComponentType();
    java.lang.annotation.Annotation[] var5 = var0.getAnnotations();
    java.lang.reflect.Field[] var6 = var0.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getDeclaredClasses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "hi!", (-1), "randoop.util.ReflectionCode");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("ReflectionCode");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    java.lang.Class var4 = var0.getComponentType();
    java.lang.annotation.Annotation[] var5 = var0.getAnnotations();
    boolean var6 = var0.isEnum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    boolean var4 = var0.isPrimitive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("ReflectionCode");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var5 = var4.getCanonicalName();
    java.security.ProtectionDomain var6 = var4.getProtectionDomain();
    java.lang.ClassLoader var7 = var4.getClassLoader();
    java.lang.Class var8 = var4.getComponentType();
    java.lang.Class[] var9 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var10 = var0.getConstructor(var9);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "randoop.util.ReflectionCode"+ "'", var5.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.cast((java.lang.Object)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.security.Principal[] var3 = var2.getPrincipals();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageDefinition("ReflectionCode");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    boolean var3 = var0.desiredAssertionStatus();
    boolean var4 = var0.isAnonymousClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.annotation.Annotation[] var3 = var0.getDeclaredAnnotations();
    boolean var4 = var0.isMemberClass();
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "class randoop.util.ReflectionCode"+ "'", var5.equals("class randoop.util.ReflectionCode"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var3 = var2.getCanonicalName();
    java.security.ProtectionDomain var4 = var2.getProtectionDomain();
    java.lang.ClassLoader var5 = var4.getClassLoader();
    java.lang.Class var6 = java.lang.Class.forName("randoop.util.ReflectionCode", true, var5);
    java.lang.Class var7 = var6.getSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "randoop.util.ReflectionCode"+ "'", var3.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getCanonicalName();
    java.security.ProtectionDomain var2 = var0.getProtectionDomain();
    java.lang.annotation.Annotation[] var3 = var0.getDeclaredAnnotations();
    boolean var4 = var0.isMemberClass();
    java.lang.reflect.Field[] var5 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var6 = sun.reflect.Reflection.filterFields(var0, var5);
    java.lang.reflect.Field[] var7 = var0.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "randoop.util.ReflectionCode"+ "'", var1.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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

  }

}
