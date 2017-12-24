
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("hi!", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("", "{}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear(1);
    int var3 = var0.getSeconds();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    java.lang.SecurityManager var3 = new java.lang.SecurityManager();
    java.lang.SecurityManager var4 = new java.lang.SecurityManager();
    java.lang.Object var5 = var4.getSecurityContext();
    boolean var6 = var3.checkTopLevelWindow((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    boolean var1 = var0.isMCSiteLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isAnyLocalAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "localhost/127.0.0.1"+ "'", var1.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    java.lang.String var4 = var2.toString();
    java.lang.Object var7 = var2.put((java.lang.Object)1.0d, (java.lang.Object)(-1.0f));
    java.lang.Object var9 = var2.remove((java.lang.Object)(-1.0d));
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.net.InetAddress var1 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var2 = var1.toString();
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
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.SecurityManager var1 = new java.lang.SecurityManager();
    java.lang.Object var2 = var1.getSecurityContext();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.checkPropertiesAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var3 = new byte[] { (byte)1, (byte)(-1), (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var4 = java.net.InetAddress.getByAddress(var3);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var0 = new java.util.Date();
    long var1 = var0.getTime();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    int var1 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    java.lang.String var4 = var2.toString();
    java.util.Collection var5 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 10, 1, 1);
    int var6 = var5.getDay();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date((-1), 10, 1);
    int var4 = var3.getTimezoneOffset();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.SecurityManager var1 = new java.lang.SecurityManager();
    java.lang.Object var2 = var1.getSecurityContext();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.checkRead("{}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Enumeration var0 = java.net.NetworkInterface.getNetworkInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.SecurityManager var1 = new java.lang.SecurityManager();
    java.lang.Object var2 = var1.getSecurityContext();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.checkPropertyAccess("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 10, 1, 10);
    var6.set(0, 10, 10, 1, 100, 1);
    var6.clear();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 10, 1, 10);
    boolean var8 = var6.isLeapYear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var6 = java.util.Date.UTC(10, 1, 5, 10, 1, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1890395935000L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 10, 1, 10);
    var6.set(0, 10, 10, 1, 100, 1);
    var6.setFirstDayOfWeek(10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.SecurityManager var1 = new java.lang.SecurityManager();
    java.lang.Object var2 = var1.getSecurityContext();
    boolean var3 = var0.checkTopLevelWindow((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.checkPropertyAccess("localhost/127.0.0.1");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 10, 1, 10);
    var6.set((-1), 100, (-1));
    var6.setTimeInMillis(1L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 10, 1, 10);
    var6.set((-1), 100, (-1));
    boolean var12 = var6.after((java.lang.Object)10.0f);
    var6.set(5, 5, 5);
    java.lang.SecurityManager var17 = new java.lang.SecurityManager();
    var17.checkExit(10);
    boolean var20 = var6.before((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

}
