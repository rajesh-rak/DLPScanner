
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var3 = java.net.Inet6Address.getByAddress("hi!", var1, 100);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Policy.Parameters var1 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "localhost"+ "'", var1.equals("localhost"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var2 = java.net.InetAddress.getByAddress(var1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var2 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var3 = java.net.InetAddress.getByAddress("", var2);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var1 = var0.getComponentType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.security.ProtectionDomain var1 = var0.getProtectionDomain();
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ProtectionDomain  (file:/Users/rajesh/code/DLPScanner/lib/randoop.jar <no signer certificates>)\n sun.misc.Launcher$AppClassLoader@338bd37a\n <no principals>\n java.security.Permissions@51b69500 (\n (\"java.net.SocketPermission\" \"localhost:1099\" \"listen,resolve\")\n (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")\n (\"java.io.FilePermission\" \"/Users/rajesh/code/DLPScanner/lib/randoop.jar\" \"read\")\n (\"java.util.PropertyPermission\" \"line.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor.url\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"path.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.version\" \"read\")\n (\"java.util.PropertyPermission\" \"os.arch\" \"read\")\n (\"java.util.PropertyPermission\" \"java.class.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.version\" \"read\")\n (\"java.util.PropertyPermission\" \"file.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.vendor\" \"read\")\n (\"java.lang.RuntimePermission\" \"stopThread\")\n (\"java.lang.RuntimePermission\" \"exitVM\")\n)\n\n"+ "'", var2.equals("ProtectionDomain  (file:/Users/rajesh/code/DLPScanner/lib/randoop.jar <no signer certificates>)\n sun.misc.Launcher$AppClassLoader@338bd37a\n <no principals>\n java.security.Permissions@51b69500 (\n (\"java.net.SocketPermission\" \"localhost:1099\" \"listen,resolve\")\n (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")\n (\"java.io.FilePermission\" \"/Users/rajesh/code/DLPScanner/lib/randoop.jar\" \"read\")\n (\"java.util.PropertyPermission\" \"line.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor.url\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"path.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.version\" \"read\")\n (\"java.util.PropertyPermission\" \"os.arch\" \"read\")\n (\"java.util.PropertyPermission\" \"java.class.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.version\" \"read\")\n (\"java.util.PropertyPermission\" \"file.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.vendor\" \"read\")\n (\"java.lang.RuntimePermission\" \"stopThread\")\n (\"java.lang.RuntimePermission\" \"exitVM\")\n)\n\n"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isLinkLocalAddress();
    java.net.NetworkInterface var2 = java.net.NetworkInterface.getByInetAddress(var0);
    byte[] var3 = var2.getHardwareAddress();
    java.util.Enumeration var4 = var2.getInetAddresses();
    java.util.Enumeration var5 = var2.getSubInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var3 = var2.getMethods();
    boolean var5 = var2.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var6 = var0.<java.lang.annotation.Annotation>getAnnotation(var2);
    java.lang.Class var7 = var2.getComponentType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var3 = var2.getMethods();
    boolean var5 = var2.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var6 = var0.<java.lang.annotation.Annotation>getAnnotation(var2);
    java.lang.Class var8 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var9 = var8.getMethods();
    java.lang.Class[] var10 = new java.lang.Class[] { var8};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var11 = var2.getDeclaredMethod("ProtectionDomain  (file:/Users/rajesh/code/DLPScanner/lib/randoop.jar <no signer certificates>)\n sun.misc.Launcher$AppClassLoader@338bd37a\n <no principals>\n java.security.Permissions@51b69500 (\n (\"java.net.SocketPermission\" \"localhost:1099\" \"listen,resolve\")\n (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")\n (\"java.io.FilePermission\" \"/Users/rajesh/code/DLPScanner/lib/randoop.jar\" \"read\")\n (\"java.util.PropertyPermission\" \"line.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor.url\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"path.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"os.version\" \"read\")\n (\"java.util.PropertyPermission\" \"os.arch\" \"read\")\n (\"java.util.PropertyPermission\" \"java.class.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.version\" \"read\")\n (\"java.util.PropertyPermission\" \"file.separator\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vendor\" \"read\")\n (\"java.util.PropertyPermission\" \"java.vm.specification.name\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.version\" \"read\")\n (\"java.util.PropertyPermission\" \"java.specification.vendor\" \"read\")\n (\"java.lang.RuntimePermission\" \"stopThread\")\n (\"java.lang.RuntimePermission\" \"exitVM\")\n)\n\n", var10);
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Provider var1 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var3 = var2.getMethods();
    boolean var5 = var2.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var6 = var0.<java.lang.annotation.Annotation>getAnnotation(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var8 = var2.getDeclaredField("hi!");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var3 = var2.getMethods();
    boolean var5 = var2.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var6 = var0.<java.lang.annotation.Annotation>getAnnotation(var2);
    java.lang.Class[] var7 = var0.getInterfaces();
    java.lang.Package var8 = var0.getPackage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var3 = var2.getMethods();
    boolean var5 = var2.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var6 = var0.<java.lang.annotation.Annotation>getAnnotation(var2);
    boolean var8 = sun.reflect.Reflection.quickCheckMemberAccess(var2, 1);
    java.lang.Class var9 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var10 = var9.getMethods();
    java.lang.Class var11 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var12 = var11.getMethods();
    boolean var14 = var11.isInstance((java.lang.Object)(byte)100);
    java.lang.annotation.Annotation var15 = var9.<java.lang.annotation.Annotation>getAnnotation(var11);
    java.lang.Class[] var16 = var9.getInterfaces();
    java.lang.reflect.Field[] var17 = var9.getDeclaredFields();
    java.lang.Class var18 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var19 = var18.getMethods();
    boolean var21 = sun.reflect.Reflection.verifyMemberAccess(var2, var9, (java.lang.Object)var18, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Provider var1 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.security.ProtectionDomain var1 = var0.getProtectionDomain();
    java.lang.Class var2 = var0.getComponentType();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isLinkLocalAddress();
    java.net.NetworkInterface var2 = java.net.NetworkInterface.getByInetAddress(var0);
    int var3 = var2.getMTU();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16384);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var2 = var0.getField("localhost");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isLinkLocalAddress();
    java.net.NetworkInterface var2 = java.net.NetworkInterface.getByInetAddress(var0);
    byte[] var3 = var2.getHardwareAddress();
    boolean var4 = var2.isPointToPoint();
    int var5 = var2.getMTU();
    java.lang.String var6 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 16384);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "lo0"+ "'", var6.equals("lo0"));

  }

}
