
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    int var4 = var3.getHours();
    var3.setTime(1L);
    java.lang.Object var7 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isEnum();
    boolean var2 = var0.isPrimitive();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var5 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var6 = var0.getDeclaredMethod("hi!", var5);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append((-1L));
    java.lang.StringBuilder var4 = var2.append(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var7 = var2.insert(100, 10L);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date(2, 0, 2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    int var4 = var3.getHours();
    int var5 = var3.getMonth();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    char[] var2 = new char[] { 'a'};
    java.lang.StringBuilder var3 = var0.append(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(100, 1, 1, (-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 949365700000L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append((-1L));
    int var5 = var0.lastIndexOf("", 10);
    java.lang.StringBuilder var7 = var0.append("hi!");
    int var9 = var7.lastIndexOf("randoop.util.ReflectionCode");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    java.lang.StringBuilder var2 = var0.append((-1L));
    java.lang.StringBuilder var5 = var0.delete(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 2, 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isEnum();
    java.lang.String var2 = var0.getCanonicalName();
    boolean var3 = var0.isPrimitive();
    java.lang.annotation.Annotation[] var4 = var0.getDeclaredAnnotations();
    boolean var5 = var0.desiredAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "randoop.util.ReflectionCode"+ "'", var2.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var5 = var4.getEnclosingClass();
    boolean var6 = var3.equals((java.lang.Object)var4);
    java.io.InputStream var8 = var4.getResourceAsStream("hi!");
    java.security.ProtectionDomain var9 = var4.getProtectionDomain();
    java.lang.String var10 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "ProtectionDomain  (file:/Users/rajesh/code/DLPScanner/lib/randoop.jar <no signer certificates>)\n sun.misc.Launcher$AppClassLoader@338bd37a\n <no principals>\n java.security.Permissions@65312942 (\n (\"java.net.SocketPermission\" \"localhost:1099\" \"listen,resolve\")\n (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")\n (\"java.util.PropertyPermission\" \"line.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor.url\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"path.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.version\" \"read\")\n (\"java.util.PropertyPermission\" \"os.arch\" \"read\")\n (\"java.util.PropertyPermission\" \"java.class.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.version\" \"read\")\n (\"java.util.PropertyPermission\" \"file.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.vendor\" \"read\")\n (\"java.io.FilePermission\" \"/Users/rajesh/code/DLPScanner/lib/randoop.jar\" \"read\")\n (\"java.lang.RuntimePermission\" \"stopThread\")\n (\"java.lang.RuntimePermission\" \"exitVM\")\n)\n\n"+ "'", var10.equals("ProtectionDomain  (file:/Users/rajesh/code/DLPScanner/lib/randoop.jar <no signer certificates>)\n sun.misc.Launcher$AppClassLoader@338bd37a\n <no principals>\n java.security.Permissions@65312942 (\n (\"java.net.SocketPermission\" \"localhost:1099\" \"listen,resolve\")\n (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")\n (\"java.util.PropertyPermission\" \"line.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor.url\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"path.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.version\" \"read\")\n (\"java.util.PropertyPermission\" \"os.arch\" \"read\")\n (\"java.util.PropertyPermission\" \"java.class.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.version\" \"read\")\n (\"java.util.PropertyPermission\" \"file.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.vendor\" \"read\")\n (\"java.io.FilePermission\" \"/Users/rajesh/code/DLPScanner/lib/randoop.jar\" \"read\")\n (\"java.lang.RuntimePermission\" \"stopThread\")\n (\"java.lang.RuntimePermission\" \"exitVM\")\n)\n\n"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isEnum();
    java.lang.String var2 = var0.getCanonicalName();
    java.lang.annotation.Annotation[] var3 = var0.getDeclaredAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "randoop.util.ReflectionCode"+ "'", var2.equals("randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var5 = var4.getEnclosingClass();
    boolean var6 = var3.equals((java.lang.Object)var4);
    int var7 = var3.getTimezoneOffset();
    var3.setSeconds(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var5 = var4.getEnclosingClass();
    boolean var6 = var3.equals((java.lang.Object)var4);
    java.io.InputStream var8 = var4.getResourceAsStream("hi!");
    java.security.ProtectionDomain var9 = var4.getProtectionDomain();
    java.lang.String var10 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "class randoop.util.ReflectionCode"+ "'", var10.equals("class randoop.util.ReflectionCode"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    int var4 = var3.getMonth();
    java.lang.String var5 = var3.toString();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");

  }

}
