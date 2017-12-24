
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


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = sun.net.www.ParseUtil.encodePath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = sun.net.www.ParseUtil.encodePath("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.Launcher var2 = new sun.misc.Launcher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("", true, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "hi!", "hi!", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var8, var10, (java.lang.Object)true, 100);
    java.lang.Class var14 = var3.asSubclass(var10);
    java.lang.Class var15 = var14.getSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var8, var10, (java.lang.Object)true, 100);
    java.lang.Class var14 = var3.asSubclass(var10);
    java.lang.reflect.Field[] var15 = var10.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class[] var10 = new java.lang.Class[] { var9};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var11 = var1.getDeclaredMethod("hi!", var10);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = new java.lang.reflect.Method[] { };
    java.lang.reflect.Method[] var2 = sun.reflect.Reflection.filterMethods(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class[] var9 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var10 = var3.getDeclaredConstructor(var9);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.reflect.Reflection var1 = new sun.reflect.Reflection();
    java.lang.Object var2 = var0.get((java.lang.Object)var1);
    java.util.Enumeration var3 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var8, var10, (java.lang.Object)true, 100);
    java.lang.Class var14 = var3.asSubclass(var10);
    java.lang.Object[] var15 = var14.getSigners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var8, var10, (java.lang.Object)true, 100);
    java.lang.Class var14 = var3.asSubclass(var10);
    java.lang.reflect.Method var15 = var14.getEnclosingMethod();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    sun.net.www.ParseUtil var3 = new sun.net.www.ParseUtil();
    java.lang.Object var4 = var0.put((java.lang.Object)1, (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isAbsolute();
    java.lang.String var4 = var2.getCanonicalPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test309/hi!/hi!"+ "'", var4.equals("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test309/hi!/hi!"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    boolean var7 = var1.isArray();
    boolean var8 = var1.isLocalClass();
    java.lang.Class var9 = var1.getEnclosingClass();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var11, var13, (java.lang.Object)true, 100);
    boolean var17 = var11.isArray();
    java.lang.ClassLoader var18 = var11.getClassLoader();
    java.lang.Class var19 = var1.asSubclass(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("/Users/rajesh/code/DLPScanner/ScanOut/RUN_2017_12_11_062257/Test309/hi!/hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.setProperty("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var8, var10, (java.lang.Object)true, 100);
    java.lang.Class var14 = var3.asSubclass(var10);
    boolean var15 = var3.isAnonymousClass();
    java.lang.reflect.Field[] var16 = var3.getDeclaredFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isAbsolute();
    boolean var4 = var2.mkdirs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    boolean var7 = var1.isArray();
    java.lang.Class var8 = var1.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isAbsolute();
    java.net.URL var4 = sun.net.www.ParseUtil.fileToEncodedURL(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(0);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(0);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)true, 100);
    boolean var7 = var1.isArray();
    java.lang.reflect.Constructor[] var8 = var1.getDeclaredConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
