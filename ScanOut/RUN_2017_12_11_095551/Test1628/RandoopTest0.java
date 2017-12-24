
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Enumeration var0 = java.net.NetworkInterface.getNetworkInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor var2 = var1.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation[] var2 = var1.getDeclaredAnnotations();
    java.lang.Class var3 = var1.getSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.annotation.Annotation[] var3 = var1.getDeclaredAnnotations();
    java.lang.String var4 = var1.getName();
    boolean var5 = var1.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.reflect.Reflection"+ "'", var4.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var4 = new byte[] { (byte)(-1), (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var5 = java.net.InetAddress.getByAddress("hi!", var4);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    java.lang.Class var16 = sun.reflect.Reflection.getCallerClass(0);
    boolean var17 = var16.isInterface();
    java.lang.reflect.Constructor[] var18 = var16.getDeclaredConstructors();
    java.lang.Class var19 = var16.getSuperclass();
    java.lang.Class[] var20 = new java.lang.Class[] { var16};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var21 = var9.getDeclaredMethod("hi!", var20);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    boolean var14 = var4.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation[] var2 = var1.getDeclaredAnnotations();
    java.lang.Object[] var3 = var1.getSigners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var7 = new java.security.UnresolvedPermission("", "hi!", "", var6);
    java.security.UnresolvedPermission var8 = new java.security.UnresolvedPermission("", "", "", var6);
    java.security.cert.Certificate[] var12 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var13 = new java.security.UnresolvedPermission("", "hi!", "", var12);
    java.security.PermissionCollection var14 = var13.newPermissionCollection();
    var8.checkGuard((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.annotation.Annotation[] var2 = var1.getDeclaredAnnotations();
    boolean var3 = var1.isArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var5 = var4.getDeclaredConstructors();
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(0);
    boolean var8 = var7.isInterface();
    java.lang.reflect.Constructor[] var9 = var7.getDeclaredConstructors();
    java.lang.Class var10 = var7.getSuperclass();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(0);
    boolean var13 = var12.isInterface();
    java.lang.annotation.Annotation[] var14 = var12.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var4, var7, (java.lang.Object)var12, 100);
    java.lang.Class var18 = sun.reflect.Reflection.getCallerClass(0);
    boolean var19 = var18.isInterface();
    java.lang.reflect.Constructor[] var20 = var18.getDeclaredConstructors();
    java.lang.Class var21 = var18.getSuperclass();
    java.lang.reflect.Method[] var22 = var18.getMethods();
    boolean var24 = sun.reflect.Reflection.verifyMemberAccess(var1, var4, (java.lang.Object)var18, 100);
    java.lang.Class var26 = sun.reflect.Reflection.getCallerClass(0);
    boolean var27 = var26.isInterface();
    java.lang.reflect.Constructor[] var28 = var26.getDeclaredConstructors();
    java.lang.Class var29 = var26.getSuperclass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var18.cast((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.annotation.Annotation[] var3 = var1.getDeclaredAnnotations();
    java.lang.String var4 = var1.getName();
    boolean var5 = var1.isAnnotation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.reflect.Reflection"+ "'", var4.equals("sun.reflect.Reflection"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    boolean var14 = var9.isAnnotation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.annotation.Annotation[] var3 = var1.getDeclaredAnnotations();
    java.lang.Class[] var4 = var1.getDeclaredClasses();
    java.io.InputStream var6 = var1.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.annotation.Annotation[] var3 = var1.getDeclaredAnnotations();
    java.lang.Class[] var4 = var1.getDeclaredClasses();
    java.net.URL var6 = var1.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    boolean var2 = var1.isInterface();
    java.lang.reflect.Constructor[] var3 = var1.getDeclaredConstructors();
    java.lang.Class var4 = var1.getSuperclass();
    java.lang.reflect.Method[] var5 = var1.getMethods();
    java.lang.Object[] var6 = var1.getEnumConstants();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    java.lang.reflect.TypeVariable[] var14 = var1.getTypeParameters();
    java.lang.String var15 = var1.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "sun.reflect.Reflection"+ "'", var15.equals("sun.reflect.Reflection"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    java.lang.reflect.Field[] var14 = var9.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var2 = java.net.InetAddress.getByAddress("sun.reflect.Reflection", var1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(0);
    boolean var6 = var5.isInterface();
    java.lang.annotation.Annotation[] var7 = var5.getDeclaredAnnotations();
    java.lang.Class[] var8 = var5.getDeclaredClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var9 = var1.getDeclaredMethod("", var8);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    boolean var3 = var1.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.reflect.Constructor[] var2 = var1.getDeclaredConstructors();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(0);
    boolean var5 = var4.isInterface();
    java.lang.reflect.Constructor[] var6 = var4.getDeclaredConstructors();
    java.lang.Class var7 = var4.getSuperclass();
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    boolean var10 = var9.isInterface();
    java.lang.annotation.Annotation[] var11 = var9.getDeclaredAnnotations();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)var9, 100);
    java.lang.reflect.Method[] var14 = var1.getMethods();
    boolean var15 = var1.desiredAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
