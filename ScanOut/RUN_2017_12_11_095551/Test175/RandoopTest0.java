
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    var0.setReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@53f2c2a3 (\n)\n"+ "'", var1.equals("java.security.Permissions@53f2c2a3 (\n)\n"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Field[] var1 = var0.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    java.lang.String[] var3 = new java.lang.String[] { ""};
    sun.reflect.Reflection.registerMethodsToFilter(var0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    boolean var3 = var0.isInstance((java.lang.Object)(short)100);
    java.lang.reflect.Field[] var4 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var5 = sun.reflect.Reflection.filterFields(var0, var4);
    java.lang.String var6 = var0.getCanonicalName();
    java.io.InputStream var8 = var0.getResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "randoop.util.ReflectionCode"+ "'", var6.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var2 = var1.getGenericSuperclass();
    boolean var4 = var1.isInstance((java.lang.Object)(short)100);
    java.lang.reflect.Field[] var5 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var6 = sun.reflect.Reflection.filterFields(var1, var5);
    java.lang.String var7 = var1.getCanonicalName();
    java.io.InputStream var9 = var1.getResourceAsStream("hi!");
    java.lang.Class[] var10 = new java.lang.Class[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var11 = var0.getConstructor(var10);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "randoop.util.ReflectionCode"+ "'", var7.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var2 = sun.reflect.Reflection.filterMethods(var0, var1);
    boolean var3 = var0.isSynthetic();
    java.lang.annotation.Annotation[] var4 = var0.getAnnotations();
    java.lang.reflect.Method[] var5 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var6 = sun.reflect.Reflection.filterMethods(var0, var5);
    java.lang.reflect.AccessibleObject.setAccessible((java.lang.reflect.AccessibleObject[])var5, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var4 = var3.getGenericSuperclass();
    boolean var6 = var3.isInstance((java.lang.Object)(short)100);
    boolean var7 = var2.isAnnotationPresent(var3);
    java.lang.reflect.Method var8 = var2.getEnclosingMethod();
    boolean var9 = var1.equals((java.lang.Object)var2);
    java.lang.reflect.TypeVariable[] var10 = var2.getTypeParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    boolean var3 = var0.isInstance((java.lang.Object)(short)100);
    java.lang.reflect.Field[] var4 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var5 = sun.reflect.Reflection.filterFields(var0, var4);
    java.lang.Class var6 = var0.getEnclosingClass();
    boolean var7 = var0.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var4 = var3.getGenericSuperclass();
    boolean var6 = var3.isInstance((java.lang.Object)(short)100);
    boolean var7 = var2.isAnnotationPresent(var3);
    java.lang.reflect.Method var8 = var2.getEnclosingMethod();
    boolean var9 = var1.equals((java.lang.Object)var2);
    java.lang.reflect.Type var10 = var2.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Constructor[] var1 = var0.getDeclaredConstructors();
    java.lang.ClassLoader var2 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var2 = sun.reflect.Reflection.filterMethods(var0, var1);
    java.lang.reflect.Constructor var3 = var0.getEnclosingConstructor();
    boolean var5 = sun.reflect.Reflection.quickCheckMemberAccess(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    java.lang.reflect.Method[] var2 = var0.getMethods();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    java.lang.reflect.Method[] var2 = var0.getMethods();
    boolean var4 = var0.isInstance((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    boolean var3 = var0.isInstance((java.lang.Object)(short)100);
    java.lang.reflect.Field[] var4 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var5 = sun.reflect.Reflection.filterFields(var0, var4);
    java.lang.String var6 = var0.getCanonicalName();
    boolean var7 = java.lang.reflect.Proxy.isProxyClass(var0);
    java.lang.Class var8 = var0.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "randoop.util.ReflectionCode"+ "'", var6.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var4 = var3.getGenericSuperclass();
    boolean var6 = var3.isInstance((java.lang.Object)(short)100);
    boolean var7 = var2.isAnnotationPresent(var3);
    java.lang.reflect.Method var8 = var2.getEnclosingMethod();
    boolean var9 = var1.equals((java.lang.Object)var2);
    java.lang.String var10 = var2.toString();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var12 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var13 = sun.reflect.Reflection.filterMethods(var11, var12);
    java.lang.reflect.Method[] var14 = sun.reflect.Reflection.filterMethods(var2, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "class randoop.util.ReflectionCode"+ "'", var10.equals("class randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var1 = var0.getGenericSuperclass();
    boolean var3 = var0.isInstance((java.lang.Object)(short)100);
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Type var6 = var5.getGenericSuperclass();
    boolean var8 = var5.isInstance((java.lang.Object)(short)100);
    java.lang.reflect.Field[] var9 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var10 = sun.reflect.Reflection.filterFields(var5, var9);
    java.lang.String var11 = var5.getCanonicalName();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var13 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var14 = sun.reflect.Reflection.filterMethods(var12, var13);
    boolean var15 = var12.isSynthetic();
    java.lang.annotation.Annotation[] var16 = var12.getAnnotations();
    java.lang.reflect.Method[] var17 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var18 = sun.reflect.Reflection.filterMethods(var12, var17);
    java.lang.reflect.Method[] var19 = sun.reflect.Reflection.filterMethods(var5, var17);
    boolean var20 = var4.contains((java.lang.Object)var19);
    java.lang.reflect.Method[] var21 = sun.reflect.Reflection.filterMethods(var0, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "randoop.util.ReflectionCode"+ "'", var11.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

}
