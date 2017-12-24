
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
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
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "", 10, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.net.www.ParseUtil var0 = new sun.net.www.ParseUtil();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "hi!", 0, "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = sun.net.www.ParseUtil.decode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.Permissions var0 = new java.security.Permissions();
    boolean var1 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.cast((java.lang.Object)false);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.reflect.Type[] var3 = var1.getGenericInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var3 = var0.containsKey((java.lang.Object)(byte)10);
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var4);
    java.lang.Class var7 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var10 = var9.getDeclaringClass();
    java.lang.Class var12 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var7, var9, (java.lang.Object)1, 1);
    boolean var15 = var5.contains((java.lang.Object)1);
    var0.putAll((java.util.Map)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var4 = var3.getDeclaringClass();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)1, 1);
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var13 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var14 = var13.getDeclaringClass();
    java.lang.Class var16 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var11, var13, (java.lang.Object)1, 1);
    java.lang.Class[] var19 = new java.lang.Class[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var20 = var1.getDeclaredMethod("", var19);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var4 = var3.getDeclaringClass();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)1, 1);
    java.lang.reflect.Method[] var9 = var3.getDeclaredMethods();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var3.cast((java.lang.Object)'#');
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var4 = var3.getDeclaringClass();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)1, 1);
    java.lang.Class[] var9 = var1.getInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.File var1 = new java.io.File("hi!");
    java.lang.String[] var2 = var1.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var3, var5, (java.lang.Object)1, 1);
    java.lang.reflect.Method[] var11 = var5.getDeclaredMethods();
    java.lang.reflect.Method[] var12 = sun.reflect.Reflection.filterMethods(var1, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.File var2 = new java.io.File("hi!", "hi!");
    boolean var3 = var2.isFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "hi!", 10, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.File var1 = new java.io.File("hi!");
    java.io.File var3 = new java.io.File("hi!");
    boolean var4 = var1.renameTo(var3);
    boolean var6 = var3.setWritable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var4 = var3.getDeclaringClass();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)1, 1);
    java.lang.reflect.Method[] var9 = var3.getDeclaredMethods();
    java.lang.reflect.Type var10 = var3.getGenericSuperclass();
    java.lang.reflect.Type var11 = var3.getGenericSuperclass();
    boolean var12 = var3.isEnum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.io.File var2 = new java.io.File("hi!");
    java.io.File var4 = new java.io.File("hi!");
    boolean var5 = var2.renameTo(var4);
    long var6 = var2.length();
    java.lang.Object var8 = var0.put((java.lang.Object)var2, (java.lang.Object)true);
    long var9 = var2.getUsableSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = sun.net.www.ParseUtil.encodePath("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.Permissions var0 = new java.security.Permissions();
    var0.setReadOnly();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var3 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.Class var4 = var3.getDeclaringClass();
    java.lang.Class var6 = sun.reflect.Reflection.getCallerClass(1);
    sun.reflect.Reflection.ensureMemberAccess(var1, var3, (java.lang.Object)1, 1);
    java.lang.Class var9 = var3.getComponentType();
    java.lang.Package var10 = var3.getPackage();
    java.lang.reflect.Field[] var11 = var3.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
