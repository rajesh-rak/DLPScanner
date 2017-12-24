
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var4 = var3.getEnclosingMethod();
    java.lang.reflect.Type[] var5 = var3.getGenericInterfaces();
    boolean var7 = var3.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var8 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class[] var9 = var3.getDeclaredClasses();
    java.lang.reflect.Constructor[] var10 = var3.getDeclaredConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var3 = var2.getEnclosingMethod();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var8 = sun.reflect.Reflection.verifyMemberAccess(var2, var5, (java.lang.Object)1L, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkMemberAccess(var5, 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var4 = var3.getEnclosingMethod();
    java.lang.reflect.Type[] var5 = var3.getGenericInterfaces();
    boolean var7 = var3.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var8 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var14 = var13.getEnclosingMethod();
    java.lang.reflect.Type[] var15 = var13.getGenericInterfaces();
    boolean var17 = var13.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var18 = var11.<java.lang.annotation.Annotation>getAnnotation(var13);
    java.lang.Class[] var19 = var13.getDeclaredClasses();
    java.lang.reflect.Constructor[] var20 = var13.getDeclaredConstructors();
    java.lang.Class[] var21 = new java.lang.Class[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var22 = var3.getMethod("hi!", var21);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var4 = var3.getEnclosingMethod();
    java.lang.reflect.Type[] var5 = var3.getGenericInterfaces();
    boolean var7 = var3.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var8 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class[] var9 = var3.getDeclaredClasses();
    java.lang.reflect.Constructor var10 = var3.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var5 = var4.getEnclosingMethod();
    java.lang.reflect.Type[] var6 = var4.getGenericInterfaces();
    boolean var8 = var4.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var9 = var2.<java.lang.annotation.Annotation>getAnnotation(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkMemberAccess(var4, 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)1L, (-1));
    java.lang.Object var8 = var1.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkConnect("", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("java.security.Permissions@4f5bec86 (\n)\n", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSecurityAccess("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.Package var3 = var1.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.reflect.Type[] var3 = var1.getGenericInterfaces();
    boolean var4 = var1.isAnonymousClass();
    boolean var5 = var1.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var4 = var3.getEnclosingMethod();
    java.lang.reflect.Type[] var5 = var3.getGenericInterfaces();
    boolean var7 = var3.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var8 = var1.<java.lang.annotation.Annotation>getAnnotation(var3);
    java.lang.Class[] var9 = var3.getDeclaredClasses();
    java.lang.reflect.Method[] var10 = var3.getMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var3 = var1.getField("");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@39582e88 (\n)\n"+ "'", var1.equals("java.security.Permissions@39582e88 (\n)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.reflect.TypeVariable[] var3 = var1.getTypeParameters();
    java.lang.reflect.Constructor[] var4 = var1.getConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)1L, (-1));
    boolean var8 = var4.desiredAssertionStatus();
    boolean var10 = sun.reflect.Reflection.quickCheckMemberAccess(var4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.ThreadGroup var1 = var0.getThreadGroup();
    var0.checkPackageDefinition("class sun.reflect.Reflection");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var6 = var5.getEnclosingMethod();
    java.lang.reflect.Type[] var7 = var5.getGenericInterfaces();
    boolean var9 = var5.isInstance((java.lang.Object)' ');
    java.lang.annotation.Annotation var10 = var3.<java.lang.annotation.Annotation>getAnnotation(var5);
    java.lang.Class[] var11 = var5.getDeclaredClasses();
    java.lang.reflect.Constructor var12 = var1.getConstructor(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkConnect("", (-1));
    boolean var4 = var0.getInCheck();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    boolean var7 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)1L, (-1));
    java.lang.Object var8 = var4.newInstance();
    java.lang.Object[] var9 = var4.getEnumConstants();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass();
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var4, var10, (java.lang.Object)10L, 0);
    boolean var14 = var10.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Method var2 = var1.getEnclosingMethod();
    java.lang.reflect.Type[] var3 = var1.getGenericInterfaces();
    boolean var4 = var1.isAnonymousClass();
    java.lang.String var5 = var1.toString();
    java.lang.SecurityManager var6 = new java.lang.SecurityManager();
    var6.checkConnect("", (-1));
    boolean var10 = var6.getInCheck();
    boolean var11 = var1.isInstance((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.checkAccept("java.security.Permissions@4f5bec86 (\n)\n", 100);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "class sun.reflect.Reflection"+ "'", var5.equals("class sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

}
