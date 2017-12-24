
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.KeyAgreement var1 = javax.crypto.KeyAgreement.getInstance("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "hi!", 1, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var16 = sun.reflect.Reflection.verifyMemberAccess(var10, var13, (java.lang.Object)0.0f, 10);
    java.lang.Class[] var17 = new java.lang.Class[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var18 = var1.getDeclaredMethod("sun.reflect.Reflection", var17);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var5 = var4.getMethods();
    java.lang.String var6 = var4.getName();
    java.lang.Class[] var7 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var8 = var1.getConstructor(var7);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "sun.reflect.Reflection"+ "'", var6.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var4 = var1.getDeclaredField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.KeyAgreement var2 = javax.crypto.KeyAgreement.getInstance("sun.reflect.Reflection", "sun.reflect.Reflection");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)"sun.reflect.Reflection");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "hi!", 0, "");
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
      java.net.URL var3 = new java.net.URL("hi!", "", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var10 = var9.getMethods();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var9, var12, (java.lang.Object)0.0f, 10);
    boolean var16 = var4.isAnnotationPresent(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var9 = var4.getField("sun.reflect.Reflection");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    boolean var8 = var4.isAnonymousClass();
    java.net.URL var10 = var4.getResource("hi!");
    java.lang.reflect.Field[] var11 = var4.getDeclaredFields();
    java.lang.Package var12 = var4.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.ClassLoader var8 = var4.getClassLoader();
    java.lang.Object[] var9 = var4.getSigners();
    java.lang.reflect.Method var10 = var4.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.ClassLoader var8 = var4.getClassLoader();
    java.lang.Object[] var9 = var4.getSigners();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var12 = var11.getMethods();
    java.lang.Class var14 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var17 = sun.reflect.Reflection.verifyMemberAccess(var11, var14, (java.lang.Object)0.0f, 10);
    boolean var18 = var14.isAnonymousClass();
    java.lang.reflect.Constructor[] var19 = var14.getDeclaredConstructors();
    boolean var20 = var4.isAnnotationPresent(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertTrue(var20 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var10 = var9.getMethods();
    java.lang.reflect.Method[] var11 = sun.reflect.Reflection.filterMethods(var4, var10);
    boolean var12 = var4.isEnum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.String var3 = var1.getName();
    java.lang.reflect.Type[] var4 = var1.getGenericInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.reflect.Reflection"+ "'", var3.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var4 = var3.getMethods();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var9 = sun.reflect.Reflection.verifyMemberAccess(var3, var6, (java.lang.Object)0.0f, 10);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var12 = var11.getMethods();
    java.lang.Class var14 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var17 = sun.reflect.Reflection.verifyMemberAccess(var11, var14, (java.lang.Object)0.0f, 10);
    java.lang.Class var18 = var6.asSubclass(var14);
    java.lang.Class[] var19 = new java.lang.Class[] { var18};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var20 = var1.getConstructor(var19);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.reflect.Field[] var3 = var1.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.String var3 = var1.getName();
    java.lang.reflect.Method[] var4 = var1.getMethods();
    java.lang.Object var5 = var1.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.reflect.Reflection"+ "'", var3.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var10 = var9.getMethods();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var15 = sun.reflect.Reflection.verifyMemberAccess(var9, var12, (java.lang.Object)0.0f, 10);
    java.lang.Class var16 = var4.asSubclass(var12);
    java.lang.reflect.Type[] var17 = var16.getGenericInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)0.0f, 10);
    java.lang.ClassLoader var8 = var4.getClassLoader();
    java.lang.Package var9 = var4.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
