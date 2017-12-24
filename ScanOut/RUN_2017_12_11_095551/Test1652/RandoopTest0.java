
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    java.security.DomainCombiner var3 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    boolean var3 = var1.equals((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("class sun.reflect.Reflection");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class[] var7 = new java.lang.Class[] { var6};
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.security.ProtectionDomain[] var3 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var4 = new java.security.AccessControlContext(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 100, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("sun.reflect.Reflection", 100);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    java.io.InputStream var12 = var9.getResourceAsStream("hi!");
    boolean var14 = sun.reflect.Reflection.quickCheckMemberAccess(var9, (-1));
    boolean var15 = var9.isEnum();
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var18 = var17.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var9, var17, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var22 = var9.getMethods();
    java.lang.Class var23 = var1.asSubclass(var9);
    boolean var24 = var23.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    java.io.InputStream var12 = var9.getResourceAsStream("hi!");
    boolean var14 = sun.reflect.Reflection.quickCheckMemberAccess(var9, (-1));
    boolean var15 = var9.isEnum();
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var18 = var17.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var9, var17, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var22 = var9.getMethods();
    java.lang.Class var23 = var1.asSubclass(var9);
    java.lang.Class var24 = var23.getEnclosingClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    java.io.InputStream var12 = var9.getResourceAsStream("hi!");
    boolean var14 = sun.reflect.Reflection.quickCheckMemberAccess(var9, (-1));
    boolean var15 = var9.isEnum();
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var18 = var17.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var9, var17, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var22 = var9.getMethods();
    java.lang.Class var23 = var1.asSubclass(var9);
    boolean var24 = var9.isArray();
    java.lang.String[] var26 = new java.lang.String[] { "hi!"};
    sun.reflect.Reflection.registerMethodsToFilter(var9, var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var3 = var1.getField("class sun.reflect.Reflection");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var1, var9, (java.lang.Object)0L, (-1));
    java.lang.Class var15 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var16 = var15.getGenericInterfaces();
    java.io.InputStream var18 = var15.getResourceAsStream("hi!");
    boolean var20 = sun.reflect.Reflection.quickCheckMemberAccess(var15, (-1));
    boolean var21 = var15.isEnum();
    java.lang.Class var23 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var24 = var23.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var15, var23, (java.lang.Object)0L, (-1));
    boolean var28 = var1.isAssignableFrom(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    boolean var4 = var1.isInstance((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("sun.reflect.Reflection", 0);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var1, var9, (java.lang.Object)0L, (-1));
    java.io.InputStream var15 = var9.getResourceAsStream("class sun.reflect.Reflection");
    java.lang.Class[] var16 = var9.getInterfaces();
    java.lang.Class var17 = var9.getSuperclass();
    java.lang.reflect.Method var18 = var9.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var1, var9, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var14 = var1.getMethods();
    java.lang.annotation.Annotation[] var15 = var1.getAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var5 = var4.getGenericInterfaces();
    java.io.InputStream var7 = var4.getResourceAsStream("hi!");
    boolean var9 = sun.reflect.Reflection.quickCheckMemberAccess(var4, (-1));
    boolean var10 = var4.isEnum();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var13 = var12.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var4, var12, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var17 = var4.getMethods();
    java.lang.Class[] var18 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var19 = var1.getDeclaredMethod("", var18);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    java.io.InputStream var12 = var9.getResourceAsStream("hi!");
    boolean var14 = sun.reflect.Reflection.quickCheckMemberAccess(var9, (-1));
    boolean var15 = var9.isEnum();
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var18 = var17.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var9, var17, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var22 = var9.getMethods();
    java.lang.Class var23 = var1.asSubclass(var9);
    java.lang.Object[] var24 = var23.getSigners();
    java.lang.reflect.TypeVariable[] var25 = var23.getTypeParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var1, var9, (java.lang.Object)0L, (-1));
    java.io.InputStream var15 = var9.getResourceAsStream("class sun.reflect.Reflection");
    java.lang.Class[] var16 = var9.getInterfaces();
    java.lang.String var17 = var9.getCanonicalName();
    java.lang.Class[] var18 = var9.getDeclaredClasses();
    boolean var19 = var9.isMemberClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "sun.reflect.Reflection"+ "'", var17.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPropertyAccess("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var2 = var1.getGenericInterfaces();
    java.io.InputStream var4 = var1.getResourceAsStream("hi!");
    boolean var6 = sun.reflect.Reflection.quickCheckMemberAccess(var1, (-1));
    boolean var7 = var1.isEnum();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var10 = var9.getGenericInterfaces();
    java.io.InputStream var12 = var9.getResourceAsStream("hi!");
    boolean var14 = sun.reflect.Reflection.quickCheckMemberAccess(var9, (-1));
    boolean var15 = var9.isEnum();
    java.lang.Class var17 = sun.reflect.Reflection.getCallerClass((-1));
    java.lang.reflect.Type[] var18 = var17.getGenericInterfaces();
    sun.reflect.Reflection.ensureMemberAccess(var9, var17, (java.lang.Object)0L, (-1));
    java.lang.reflect.Method[] var22 = var9.getMethods();
    java.lang.Class var23 = var1.asSubclass(var9);
    boolean var24 = var9.isArray();
    java.security.ProtectionDomain var25 = var9.getProtectionDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
