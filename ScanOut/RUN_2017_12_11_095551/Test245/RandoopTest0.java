
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(1);
    boolean var16 = sun.reflect.Reflection.verifyMemberAccess(var11, var13, (java.lang.Object)false, (-1));
    java.io.InputStream var18 = var11.getResourceAsStream("hi!");
    boolean var19 = var11.isSynthetic();
    java.lang.Class var20 = var3.asSubclass(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var3.newInstance();
      fail("Expected exception of type java.lang.InstantiationException");
    } catch (java.lang.InstantiationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.reflect.Field[] var10 = var3.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)(byte)1);
    boolean var3 = var0.isEmpty();
    java.util.Enumeration var4 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Class[] var10 = var1.getClasses();
    java.lang.annotation.Annotation[] var11 = var1.getAnnotations();
    java.lang.reflect.Method var12 = var1.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.io.InputStream var8 = var1.getResourceAsStream("hi!");
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var14 = sun.reflect.Reflection.getCallerClass(1);
    boolean var17 = sun.reflect.Reflection.verifyMemberAccess(var12, var14, (java.lang.Object)false, (-1));
    boolean var18 = var10.isAnnotationPresent(var12);
    java.lang.Class[] var19 = var10.getClasses();
    java.lang.annotation.Annotation[] var20 = var10.getAnnotations();
    java.lang.reflect.Method var21 = var10.getEnclosingMethod();
    java.lang.Class[] var22 = new java.lang.Class[] { var10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var23 = var1.getDeclaredConstructor(var22);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.io.InputStream var8 = var1.getResourceAsStream("hi!");
    boolean var9 = var1.isLocalClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var11 = var1.getField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.979112075725762d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var8, var10, (java.lang.Object)false, (-1));
    java.io.InputStream var15 = var8.getResourceAsStream("hi!");
    boolean var16 = var3.isInstance((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(1);
    boolean var16 = sun.reflect.Reflection.verifyMemberAccess(var11, var13, (java.lang.Object)false, (-1));
    java.io.InputStream var18 = var11.getResourceAsStream("hi!");
    boolean var19 = var11.isSynthetic();
    java.lang.Class var20 = var3.asSubclass(var11);
    java.lang.annotation.Annotation[] var21 = var3.getAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Class[] var10 = var1.getClasses();
    java.lang.reflect.Method var11 = var1.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    boolean var11 = sun.reflect.Reflection.quickCheckMemberAccess(var3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@70ec46ff (\n)\n"+ "'", var1.equals("java.security.Permissions@70ec46ff (\n)\n"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.io.InputStream var8 = var1.getResourceAsStream("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var10 = var1.getDeclaredField("");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.io.InputStream var8 = var1.getResourceAsStream("hi!");
    boolean var9 = var1.isSynthetic();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(1);
    boolean var16 = sun.reflect.Reflection.verifyMemberAccess(var11, var13, (java.lang.Object)false, (-1));
    boolean var17 = var1.isAnnotationPresent(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = java.security.SecureRandom.getSeed((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.SecureRandom var1 = new java.security.SecureRandom();
    java.security.Provider var2 = var1.getProvider();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.SecureRandom var3 = java.security.SecureRandom.getInstance("hi!", var2);
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.security.Provider var1 = var0.getProvider();
    byte[] var5 = new byte[] { (byte)1, (byte)10, (byte)100};
    var0.nextBytes(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.lang.reflect.TypeVariable[] var7 = var1.getTypeParameters();
    java.lang.ClassLoader var8 = var1.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var3 = var1.getDeclaredField("");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    boolean var6 = sun.reflect.Reflection.verifyMemberAccess(var1, var3, (java.lang.Object)false, (-1));
    java.lang.reflect.Method[] var7 = var1.getMethods();
    java.lang.reflect.Method[] var8 = var1.getDeclaredMethods();
    java.lang.String var9 = var1.getSimpleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MethodReflectionCode"+ "'", var9.equals("MethodReflectionCode"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Class[] var10 = var1.getClasses();
    java.lang.annotation.Annotation[] var11 = var1.getAnnotations();
    java.lang.reflect.Field[] var12 = var1.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var3, var5, (java.lang.Object)false, (-1));
    boolean var9 = var1.isAnnotationPresent(var3);
    java.lang.Package var10 = var1.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.security.Provider var1 = var0.getProvider();
    java.util.Enumeration var2 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var1 = var0.isEmpty();
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    boolean var9 = sun.reflect.Reflection.verifyMemberAccess(var4, var6, (java.lang.Object)false, (-1));
    boolean var10 = var0.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var1 = var0.isEmpty();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.String var5 = var0.getProperty("MethodReflectionCode", "java.security.Permissions@70ec46ff (\n)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.security.Permissions@70ec46ff (\n)\n"+ "'", var5.equals("java.security.Permissions@70ec46ff (\n)\n"));

  }

}
