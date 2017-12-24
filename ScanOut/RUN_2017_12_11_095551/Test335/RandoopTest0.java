
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var3 = new byte[] { (byte)0, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var5 = java.net.Inet6Address.getByAddress("hi!", var3, 1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var2 = java.net.InetAddress.getByAddress("hi!", var1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.lang.String var1 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var4 = java.net.Inet6Address.getByAddress("hi!", var2, 100);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var3 = java.net.Inet6Address.getByAddress("hi!", var1, 10);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSetFactory();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("ReflectionCode", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Policy.Parameters var1 = var0.getParameters();
    java.security.Provider var2 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    java.lang.SecurityManager var2 = new java.lang.SecurityManager();
    var2.checkExit(10);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var6 = var5.getSimpleName();
    var2.checkMemberAccess(var5, (-1));
    java.lang.Class[] var9 = new java.lang.Class[] { var5};
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
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ReflectionCode"+ "'", var6.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    java.lang.String var2 = var0.getSimpleName();
    boolean var3 = var0.desiredAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ReflectionCode"+ "'", var2.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    var0.checkPackageAccess("ReflectionCode");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@60e950e9 (\n)\n"+ "'", var1.equals("java.security.Permissions@60e950e9 (\n)\n"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    java.lang.reflect.TypeVariable[] var2 = var0.getTypeParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    java.lang.String var2 = var0.getSimpleName();
    boolean var3 = var0.isAnonymousClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ReflectionCode"+ "'", var2.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var4 = var3.getSimpleName();
    var0.checkMemberAccess(var3, (-1));
    java.security.ProtectionDomain var7 = var3.getProtectionDomain();
    java.lang.String var8 = var3.getCanonicalName();
    java.lang.Class[] var9 = var3.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ReflectionCode"+ "'", var4.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "randoop.util.ReflectionCode"+ "'", var8.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var4 = var3.getSimpleName();
    var0.checkMemberAccess(var3, (-1));
    boolean var7 = var3.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ReflectionCode"+ "'", var4.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    int var2 = var0.getModifiers();
    boolean var3 = var0.isAnonymousClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    boolean var2 = var0.isLocalClass();
    boolean var3 = var0.isAnonymousClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = var0.getSuperclass();
    java.lang.reflect.Field[] var2 = var1.getFields();
    java.lang.reflect.AccessibleObject.setAccessible((java.lang.reflect.AccessibleObject[])var2, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var4 = var3.getSimpleName();
    var0.checkMemberAccess(var3, (-1));
    java.security.ProtectionDomain var7 = var3.getProtectionDomain();
    java.lang.String var8 = var3.getCanonicalName();
    java.lang.SecurityManager var9 = new java.lang.SecurityManager();
    var9.checkExit(10);
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var13 = var12.getSimpleName();
    var9.checkMemberAccess(var12, (-1));
    java.security.ProtectionDomain var16 = var12.getProtectionDomain();
    java.lang.String var17 = var12.getCanonicalName();
    java.lang.Class var18 = var3.asSubclass(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ReflectionCode"+ "'", var4.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "randoop.util.ReflectionCode"+ "'", var8.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ReflectionCode"+ "'", var13.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "randoop.util.ReflectionCode"+ "'", var17.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var1 = var0.getSimpleName();
    int var2 = var0.getModifiers();
    java.lang.reflect.Method[] var3 = var0.getMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ReflectionCode"+ "'", var1.equals("ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(10);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.String var4 = var3.getSimpleName();
    var0.checkMemberAccess(var3, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ReflectionCode"+ "'", var4.equals("ReflectionCode"));

  }

}
