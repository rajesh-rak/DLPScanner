
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


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

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var2 = new byte[] { (byte)(-1)};
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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCNodeLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var3 = new byte[] { (byte)0, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var4 = java.net.InetAddress.getByAddress("hi!", var3);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSecurityAccess("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.net.InetAddress var1 = java.net.InetAddress.getLoopbackAddress();
    boolean var2 = var1.isMCSiteLocal();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkMulticast(var1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCGlobal();
    boolean var2 = var0.isSiteLocalAddress();
    boolean var3 = var0.isMCOrgLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("");
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
      var0.checkPropertiesAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)100, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var3 = java.net.InetAddress.getByAddress(var2);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.net.InetAddress var3 = java.net.InetAddress.getLoopbackAddress();
    boolean var4 = var3.isMCGlobal();
    boolean var5 = var3.isSiteLocalAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", 0, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("localhost");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCOrgLocal();
    boolean var3 = var0.isReachable(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();
    java.security.Provider var1 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByInetAddress(var0);
    boolean var2 = var1.isLoopback();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCSiteLocal();
    boolean var2 = var0.isSiteLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByInetAddress(var0);
    java.util.Enumeration var2 = var1.getSubInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCGlobal();
    boolean var2 = var0.isSiteLocalAddress();
    boolean var3 = var0.isMCGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)(byte)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSecurityAccess("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isSiteLocalAddress();
    boolean var2 = var0.isSiteLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByInetAddress(var0);
    boolean var2 = var1.supportsMulticast();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCGlobal();
    boolean var2 = var0.isSiteLocalAddress();
    java.lang.String var3 = var0.getHostName();
    java.lang.String var4 = var0.getHostName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "localhost"+ "'", var3.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "localhost"+ "'", var4.equals("localhost"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    byte[] var2 = new byte[] { (byte)10, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var3 = java.net.InetAddress.getByAddress(var2);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByInetAddress(var0);
    boolean var2 = var1.isVirtual();
    boolean var3 = var1.isVirtual();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)(byte)10);
    var0.checkPackageAccess("localhost");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
