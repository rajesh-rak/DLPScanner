
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(100, 1, 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var2 = new java.net.Socket("", 10);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var4 = new java.net.Socket(var0, 10);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(10, 1, 0);
    var3.expire(10L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(10, 1, 0);
    var3.expire(100L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    java.net.URL var7 = var3.getResource("");
    java.util.Enumeration var9 = var3.getResources("");
    java.net.URL var11 = var3.findResource("hi!");
    var3.setClassAssertionStatus("hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.InetAddress var2 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var3 = var2.getHostAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var5 = new java.net.Socket("127.0.0.1", 10, var2, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "127.0.0.1"+ "'", var3.equals("127.0.0.1"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    boolean var3 = var0.isLoopbackAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var5 = new java.net.Socket(var0, 1);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    var3.setPackageAssertionStatus("hi!", true);
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    boolean var3 = var0.isLoopbackAddress();
    boolean var4 = var0.isMCOrgLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    java.net.URL var4 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var5 = new java.net.URL[] { var4};
    java.net.URL var7 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var8 = new java.net.URL[] { var7};
    java.net.URLClassLoader var9 = java.net.URLClassLoader.newInstance(var8);
    java.lang.Class[] var10 = new java.lang.Class[] { };
    java.lang.Class var11 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var9, var10);
    java.net.URL var13 = var9.getResource("");
    java.util.Enumeration var15 = var9.getResources("");
    java.net.URLClassLoader var16 = new java.net.URLClassLoader(var5, (java.lang.ClassLoader)var9);
    boolean var17 = var0.equals((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var19 = new java.net.Socket(var0, 1);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    java.net.URL var7 = var3.getResource("");
    java.util.Enumeration var9 = var3.getResources("");
    java.net.URL var11 = var3.findResource("hi!");
    java.lang.ClassLoader var12 = var3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, 1, (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    boolean var3 = var0.isLoopbackAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var5 = new java.net.Socket(var0, 0);
      fail("Expected exception of type java.net.NoRouteToHostException");
    } catch (java.net.NoRouteToHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.InetAddress var2 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var3 = var2.getHostAddress();
    java.lang.String var4 = var2.toString();
    boolean var5 = var2.isLoopbackAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var7 = new java.net.Socket("", 10, var2, 0);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "127.0.0.1"+ "'", var3.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "localhost/127.0.0.1"+ "'", var4.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getHostName();
    boolean var4 = var0.isMCSiteLocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "localhost"+ "'", var3.equals("localhost"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.InetAddress var2 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var3 = var2.getHostAddress();
    java.lang.String var4 = var2.toString();
    boolean var5 = var2.isLoopbackAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var7 = new java.net.Socket("", 100, var2, 100);
      fail("Expected exception of type java.net.BindException");
    } catch (java.net.BindException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "127.0.0.1"+ "'", var3.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "localhost/127.0.0.1"+ "'", var4.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    java.lang.String var6 = sun.rmi.server.Util.getUnqualifiedName(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "$Proxy16"+ "'", var6.equals("$Proxy16"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("localhost/127.0.0.1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    java.net.URL var7 = var3.getResource("");
    java.net.URL var9 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var10 = new java.net.URL[] { var9};
    java.net.URLClassLoader var11 = java.net.URLClassLoader.newInstance(var10);
    java.lang.Class[] var12 = new java.lang.Class[] { };
    java.lang.Class var13 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var11, var12);
    java.lang.Class var14 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("localhost");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    java.lang.String var2 = var0.toString();
    java.net.URL var4 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var5 = new java.net.URL[] { var4};
    java.net.URL var7 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var8 = new java.net.URL[] { var7};
    java.net.URLClassLoader var9 = java.net.URLClassLoader.newInstance(var8);
    java.lang.Class[] var10 = new java.lang.Class[] { };
    java.lang.Class var11 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var9, var10);
    java.net.URL var13 = var9.getResource("");
    java.util.Enumeration var15 = var9.getResources("");
    java.net.URLClassLoader var16 = new java.net.URLClassLoader(var5, (java.lang.ClassLoader)var9);
    java.lang.ClassLoader var17 = var9.getParent();
    boolean var18 = var0.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "localhost/127.0.0.1"+ "'", var2.equals("localhost/127.0.0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    java.lang.String var1 = var0.getHostAddress();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.Socket var4 = new java.net.Socket(var0, 10, true);
      fail("Expected exception of type java.net.ConnectException");
    } catch (java.net.ConnectException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "127.0.0.1"+ "'", var1.equals("127.0.0.1"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL var4 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var5 = new java.net.URL[] { var4};
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var5);
    java.lang.Class[] var7 = new java.lang.Class[] { };
    java.lang.Class var8 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var6, var7);
    java.net.URL var10 = var6.getResource("");
    java.net.URL[] var11 = var6.getURLs();
    java.net.URLClassLoader var12 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
