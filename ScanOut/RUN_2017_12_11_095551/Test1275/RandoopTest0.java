
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var6 = var1.getField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.annotation.Annotation[] var5 = var1.getAnnotations();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var7 = var1.getDeclaredField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var9 = var6.<java.lang.annotation.Annotation>getAnnotation(var8);
    java.lang.Class[] var10 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var11 = var3.getDeclaredConstructor(var10);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.annotation.Annotation[] var5 = var1.getAnnotations();
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var11 = var8.<java.lang.annotation.Annotation>getAnnotation(var10);
    java.lang.Class[] var12 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var13 = var1.getMethod("", var12);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.reflect.Method[] var5 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var6 = sun.reflect.Reflection.filterMethods(var3, var5);
    java.lang.String[] var8 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.reflect.Reflection.registerFieldsToFilter(var3, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.annotation.Annotation[] var5 = var1.getDeclaredAnnotations();
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var11 = var8.<java.lang.annotation.Annotation>getAnnotation(var10);
    java.lang.Class[] var12 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var13 = var1.getMethod("", var12);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("", (java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    java.net.URL var6 = var4.getResource("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", (-1), (java.lang.Object)"");
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    boolean var5 = var3.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.reflect.Method[] var5 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var6 = sun.reflect.Reflection.filterMethods(var3, var5);
    java.lang.reflect.Method[] var7 = var3.getDeclaredMethods();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var13 = var10.<java.lang.annotation.Annotation>getAnnotation(var12);
    java.lang.Class[] var14 = new java.lang.Class[] { var10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var15 = var3.getDeclaredMethod("", var14);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.net.URL var3 = var1.getResource("");
    java.lang.annotation.Annotation[] var4 = var1.getAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    boolean var5 = var1.isAnonymousClass();
    int var6 = var1.getModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.security.Provider[] var1 = java.security.Security.getProviders((java.util.Map)var0);
    java.lang.Object var3 = var0.remove((java.lang.Object)(byte)0);
    boolean var5 = var0.contains((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.reflect.Method[] var5 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var6 = sun.reflect.Reflection.filterMethods(var3, var5);
    java.lang.reflect.Constructor[] var7 = var3.getDeclaredConstructors();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var12 = var9.<java.lang.annotation.Annotation>getAnnotation(var11);
    java.util.Hashtable var13 = new java.util.Hashtable();
    java.security.Provider[] var14 = java.security.Security.getProviders((java.util.Map)var13);
    java.lang.Object var16 = var13.remove((java.lang.Object)(byte)0);
    sun.reflect.Reflection.ensureMemberAccess(var3, var11, (java.lang.Object)var13, 0);
    int var19 = var3.getModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.reflect.Method[] var5 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var6 = sun.reflect.Reflection.filterMethods(var3, var5);
    java.lang.reflect.Constructor[] var7 = var3.getDeclaredConstructors();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var12 = var9.<java.lang.annotation.Annotation>getAnnotation(var11);
    boolean var13 = var9.isAnonymousClass();
    java.lang.annotation.Annotation var14 = var3.<java.lang.annotation.Annotation>getAnnotation(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var4 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.annotation.Annotation[] var5 = var1.getAnnotations();
    boolean var6 = var1.isSynthetic();
    int var7 = var1.getModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.security.Provider[] var1 = java.security.Security.getProviders((java.util.Map)var0);
    java.lang.Object var3 = var0.remove((java.lang.Object)(byte)0);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var8 = var5.<java.lang.annotation.Annotation>getAnnotation(var7);
    java.lang.reflect.Method[] var9 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var10 = sun.reflect.Reflection.filterMethods(var7, var9);
    java.lang.reflect.Constructor[] var11 = var7.getDeclaredConstructors();
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation var16 = var13.<java.lang.annotation.Annotation>getAnnotation(var15);
    java.util.Hashtable var17 = new java.util.Hashtable();
    java.security.Provider[] var18 = java.security.Security.getProviders((java.util.Map)var17);
    java.lang.Object var20 = var17.remove((java.lang.Object)(byte)0);
    sun.reflect.Reflection.ensureMemberAccess(var7, var15, (java.lang.Object)var17, 0);
    java.lang.reflect.Type var23 = var7.getGenericSuperclass();
    boolean var24 = var0.containsKey((java.lang.Object)var7);
    java.lang.Object var25 = var0.clone();
    java.util.Enumeration var26 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.security.Provider[] var1 = java.security.Security.getProviders((java.util.Map)var0);
    java.lang.Object var4 = var0.put((java.lang.Object)"hi!", (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.util.Set var4 = java.security.Security.getAlgorithms("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", 10, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

}
