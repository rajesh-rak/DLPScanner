
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Enumeration var0 = java.net.NetworkInterface.getNetworkInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(100);
    java.lang.Object var4 = var1.put((java.lang.Object)'a', (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(100);
    java.util.Collection var2 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.lang.reflect.AccessibleObject[] var2 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var2, true);
    boolean var5 = var1.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(100);
    boolean var2 = var1.isEmpty();
    sun.security.provider.PolicyFile var3 = new sun.security.provider.PolicyFile();
    java.lang.Object var4 = var1.get((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Policy.Parameters var1 = var0.getParameters();
    java.lang.String var2 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var2 = var0.getResource("hi!");
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var5 = var3.getResource("hi!");
    boolean var7 = sun.reflect.Reflection.quickCheckMemberAccess(var3, 10);
    java.lang.Class[] var8 = new java.lang.Class[] { var3};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var9 = var0.getDeclaredConstructor(var8);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.InetAddress var1 = java.net.InetAddress.getByName("");
    boolean var2 = var1.isMulticastAddress();
    boolean var3 = var1.isMulticastAddress();
    byte[] var4 = var1.getAddress();
    java.net.InetAddress var6 = java.net.InetAddress.getByName("");
    boolean var7 = var6.isMulticastAddress();
    boolean var8 = var6.isMulticastAddress();
    byte[] var9 = var6.getAddress();
    java.net.NetworkInterface var10 = java.net.NetworkInterface.getByInetAddress(var6);
    java.lang.String var11 = var10.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var1.isReachable(var10, (-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "lo0"+ "'", var11.equals("lo0"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("localhost");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.WeakHashMap var2 = new java.util.WeakHashMap(0, 1.0f);
    java.util.Set var3 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var2 = var0.getResource("hi!");
    boolean var4 = sun.reflect.Reflection.quickCheckMemberAccess(var0, 10);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var8 = var6.getResource("hi!");
    java.lang.Class[] var9 = new java.lang.Class[] { var6};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var10 = var0.getDeclaredMethod("lo0", var9);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.InetAddress var1 = java.net.InetAddress.getByName("");
    boolean var2 = var1.isMulticastAddress();
    boolean var3 = var1.isAnyLocalAddress();
    java.lang.String var4 = var1.getCanonicalHostName();
    boolean var6 = var1.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "localhost"+ "'", var4.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var2 = var0.getResource("hi!");
    boolean var4 = sun.reflect.Reflection.quickCheckMemberAccess(var0, 10);
    boolean var5 = var0.isSynthetic();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var8 = var6.getResource("hi!");
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var11 = var9.getResource("hi!");
    boolean var13 = sun.reflect.Reflection.quickCheckMemberAccess(var9, 10);
    boolean var14 = var6.isAnnotationPresent(var9);
    java.lang.reflect.Field[] var15 = var6.getFields();
    java.lang.reflect.Field[] var16 = sun.reflect.Reflection.filterFields(var0, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.InetAddress var1 = java.net.InetAddress.getByName("");
    boolean var2 = var1.isMulticastAddress();
    boolean var3 = var1.isMulticastAddress();
    byte[] var4 = var1.getAddress();
    java.net.NetworkInterface var5 = java.net.NetworkInterface.getByInetAddress(var1);
    java.util.WeakHashMap var7 = new java.util.WeakHashMap(100);
    boolean var8 = var7.isEmpty();
    java.util.Set var9 = var7.keySet();
    boolean var10 = var5.equals((java.lang.Object)var7);
    boolean var11 = var5.supportsMulticast();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var2 = var0.getResource("hi!");
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var5 = var3.getResource("hi!");
    boolean var7 = sun.reflect.Reflection.quickCheckMemberAccess(var3, 10);
    boolean var8 = var0.isAnnotationPresent(var3);
    java.lang.reflect.Field[] var9 = var0.getFields();
    java.lang.String[] var11 = new java.lang.String[] { "lo0"};
    sun.reflect.Reflection.registerFieldsToFilter(var0, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.InetAddress var1 = java.net.InetAddress.getByName("");
    boolean var2 = var1.isMulticastAddress();
    boolean var3 = var1.isMulticastAddress();
    byte[] var4 = var1.getAddress();
    java.net.NetworkInterface var5 = java.net.NetworkInterface.getByInetAddress(var1);
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var8 = var6.getResource("hi!");
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass();
    java.net.URL var11 = var9.getResource("hi!");
    boolean var13 = sun.reflect.Reflection.quickCheckMemberAccess(var9, 10);
    boolean var14 = var6.isAnnotationPresent(var9);
    boolean var15 = var5.equals((java.lang.Object)var9);
    java.util.Enumeration var16 = var5.getSubInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

}
