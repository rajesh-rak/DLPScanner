
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var1.getMinutes();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var4 = new byte[] { (byte)(-1), (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var5 = java.net.InetAddress.getByAddress("", var4);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var2 = new byte[] { (byte)10};
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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.SocketPermission var2 = new java.net.SocketPermission("1 Jan, 1970 5:29:59 AM", "1 Jan, 1970 5:29:59 AM");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var1 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Inet6Address var3 = java.net.Inet6Address.getByAddress("", var1, 4);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.sql.Date var5 = new java.sql.Date((-1L));
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    int var8 = var1.compareTo((java.util.Date)var5);
    java.lang.String var9 = var1.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "31 Dec 1969 23:59:59 GMT"+ "'", var9.equals("31 Dec 1969 23:59:59 GMT"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.lang.String var4 = var1.toLocaleString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setHours((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1 Jan, 1970 5:29:59 AM"+ "'", var4.equals("1 Jan, 1970 5:29:59 AM"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("1 Jan, 1970 5:29:59 AM");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.NetworkInterface var1 = java.net.NetworkInterface.getByName("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.sql.Date var5 = new java.sql.Date((-1L));
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    int var8 = var1.compareTo((java.util.Date)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var1.getMinutes();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    java.sql.Date var3 = new java.sql.Date((-1L));
    boolean var5 = var3.equals((java.lang.Object)"hi!");
    java.sql.Date var7 = new java.sql.Date((-1L));
    boolean var9 = var7.equals((java.lang.Object)"hi!");
    int var10 = var3.compareTo((java.util.Date)var7);
    boolean var11 = var1.after((java.util.Date)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    long var6 = java.util.Date.UTC((-1), (-1), 10, 10, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2242389600000L));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.sql.Date var5 = new java.sql.Date((-1L));
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    int var8 = var1.compareTo((java.util.Date)var5);
    int var9 = var1.getDay();
    java.lang.String var10 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "1970-01-01"+ "'", var10.equals("1970-01-01"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(100, 4, 10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.util.Set var3 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    long var1 = java.util.Date.parse("31 Dec 1969 23:59:59 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1000L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMinutes(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.net.URL var4 = java.lang.ClassLoader.getSystemResource("");
    java.net.URL[] var5 = new java.net.URL[] { var4};
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var5);
    boolean var7 = var2.equals((java.lang.Object)var5);
    java.util.Collection var8 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.lang.String var3 = var2.toString();
    java.util.HashMap var6 = new java.util.HashMap(100, 1.0f);
    java.lang.String var7 = var6.toString();
    java.lang.Object var8 = var2.get((java.lang.Object)var7);
    boolean var10 = var2.containsValue((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.sql.Date var5 = new java.sql.Date((-1L));
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    int var8 = var1.compareTo((java.util.Date)var5);
    int var9 = var1.getMonth();
    int var10 = var1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


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

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Date var1 = java.sql.Date.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.lang.String var3 = var2.toString();
    java.lang.Object var5 = var2.remove((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.sql.Date var1 = new java.sql.Date((-1L));
    boolean var3 = var1.equals((java.lang.Object)"hi!");
    java.sql.Date var5 = new java.sql.Date((-1L));
    boolean var7 = var5.equals((java.lang.Object)"hi!");
    int var8 = var1.compareTo((java.util.Date)var5);
    int var9 = var1.getDay();
    java.sql.Date var11 = new java.sql.Date((-1L));
    boolean var13 = var11.equals((java.lang.Object)"hi!");
    java.lang.String var14 = var11.toLocaleString();
    java.lang.String var15 = var11.toString();
    int var16 = var1.compareTo((java.util.Date)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1 Jan, 1970 5:29:59 AM"+ "'", var14.equals("1 Jan, 1970 5:29:59 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "1970-01-01"+ "'", var15.equals("1970-01-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.lang.String var3 = var2.toString();
    java.util.HashMap var6 = new java.util.HashMap(100, 1.0f);
    java.lang.String var7 = var6.toString();
    java.lang.Object var8 = var2.get((java.lang.Object)var7);
    java.util.HashMap var9 = new java.util.HashMap((java.util.Map)var2);
    java.sql.Date var11 = new java.sql.Date((-1L));
    boolean var13 = var11.equals((java.lang.Object)"hi!");
    java.lang.String var14 = var11.toLocaleString();
    java.lang.Object var15 = var9.remove((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "1 Jan, 1970 5:29:59 AM"+ "'", var14.equals("1 Jan, 1970 5:29:59 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.HashMap var2 = new java.util.HashMap(100, 1.0f);
    java.lang.String var3 = var2.toString();
    java.util.Collection var4 = var2.values();
    java.util.Set var5 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getDay();

  }

}
