
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


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


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

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("hi!", "", "hi!", var3);
    java.lang.String var5 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


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

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var3 = new byte[] { (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var5 = java.net.Inet6Address.getByAddress("hi!", var3, 100);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


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

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.security.ProtectionDomain[] var1 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var1);
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var7 = new java.security.UnresolvedPermission("hi!", "", "hi!", var6);
    var2.checkPermission((java.security.Permission)var7);
    java.lang.String var9 = var7.getActions();
    java.lang.SecurityManager var10 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPermission((java.security.Permission)var7, (java.lang.Object)var10);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByAddress(var0);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("hi!", "", "hi!", var3);
    java.security.PermissionCollection var5 = var4.newPermissionCollection();
    java.lang.String var6 = var4.getActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("hi!", 100);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


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

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Provider var1 = var0.getProvider();
    java.security.Provider var2 = var0.getProvider();
    java.security.Policy.Parameters var3 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var6 = new java.security.UnresolvedPermission("hi!", "", "hi!", var5);
    var1.checkPermission((java.security.Permission)var6);
    java.lang.String var8 = var6.getActions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AccessController.checkPermission((java.security.Permission)var6);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var7 = new java.security.UnresolvedPermission("", "hi!", "", var6);
    java.security.UnresolvedPermission var8 = new java.security.UnresolvedPermission("hi!", "hi!", "", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var6 = new java.security.UnresolvedPermission("", "hi!", "", var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPermission((java.security.Permission)var6);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("hi!", "", "hi!", var3);
    java.security.cert.Certificate[] var5 = var4.getUnresolvedCerts();
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var10 = new java.security.UnresolvedPermission("hi!", "", "hi!", var9);
    java.security.PermissionCollection var11 = var10.newPermissionCollection();
    var4.checkGuard((java.lang.Object)var11);
    java.lang.String var13 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Provider var1 = var0.getProvider();
    java.security.Provider var2 = var0.getProvider();
    java.security.Policy.setPolicy((java.security.Policy)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

}
