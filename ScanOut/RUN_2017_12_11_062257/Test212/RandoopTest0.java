
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    int var2 = var0.size();
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    java.lang.Object var2 = var1.clone();
    var0.putAll((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.lang.Object var3 = var2.clone();
    var0.putAll((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.lang.Object var3 = var0.remove((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var2 = var1.getEnclosingClass();
    java.lang.Class[] var3 = var1.getDeclaredClasses();
    java.lang.reflect.Method[] var4 = var1.getDeclaredMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Method[] var4 = var3.getDeclaredMethods();
    java.lang.Object var5 = var0.remove((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var2 = var1.getClasses();
    boolean var3 = var1.desiredAssertionStatus();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var6 = var5.getEnclosingClass();
    java.lang.Class[] var7 = var5.getDeclaredClasses();
    java.lang.Class var8 = var5.getDeclaringClass();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var11 = var10.getClasses();
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var1, var5, (java.lang.Object)var10, 17);
    java.lang.Class var14 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.isAnnotation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    java.util.Enumeration var2 = var0.keys();
    java.util.Enumeration var3 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Enumeration var2 = var0.keys();
    boolean var3 = var0.isEmpty();
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.lang.String var5 = var4.toString();
    java.util.Enumeration var6 = var4.keys();
    java.util.Set var7 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{}"+ "'", var5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    int var2 = var1.getModifiers();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = var4.getEnclosingClass();
    java.lang.Class[] var6 = var4.getDeclaredClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var7 = var1.getDeclaredConstructor(var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    java.security.DomainCombiner var2 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.lang.String var3 = var2.toString();
    java.util.Enumeration var4 = var2.keys();
    boolean var5 = var0.contains((java.lang.Object)var4);
    java.util.Hashtable var6 = new java.util.Hashtable();
    java.lang.String var7 = var6.toString();
    java.util.Enumeration var8 = var6.keys();
    java.util.Set var9 = var6.entrySet();
    var0.putAll((java.util.Map)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.lang.String var3 = var2.toString();
    java.util.Enumeration var4 = var2.keys();
    boolean var5 = var0.contains((java.lang.Object)var4);
    boolean var7 = var0.containsValue((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var2 = var1.getClasses();
    boolean var3 = var1.desiredAssertionStatus();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var6 = var5.getEnclosingClass();
    java.lang.Class[] var7 = var5.getDeclaredClasses();
    java.lang.Class var8 = var5.getDeclaringClass();
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var11 = var10.getClasses();
    boolean var13 = sun.reflect.Reflection.verifyMemberAccess(var1, var5, (java.lang.Object)var10, 17);
    java.lang.Class[] var14 = var1.getDeclaredClasses();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var2 = var1.getClasses();
    boolean var3 = var1.desiredAssertionStatus();
    java.lang.reflect.Method[] var4 = var1.getDeclaredMethods();
    java.lang.String var5 = var1.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "randoop.util.MethodReflectionCode"+ "'", var5.equals("randoop.util.MethodReflectionCode"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.desiredAssertionStatus();
    boolean var3 = var1.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class[] var2 = var1.getClasses();
    boolean var3 = var1.desiredAssertionStatus();
    java.lang.reflect.Constructor var4 = var1.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 10.0f);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.desiredAssertionStatus();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass(1);
    boolean var5 = var4.desiredAssertionStatus();
    sun.reflect.Reflection.ensureMemberAccess(var1, var4, (java.lang.Object)(short)(-1), (-1));
    java.lang.reflect.Field[] var9 = var4.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("{}", "", "", var3);
    java.lang.String var5 = var4.getUnresolvedName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

}
