
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Package var1 = java.lang.Package.getPackage("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Package var1 = java.lang.Package.getPackage("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var2 = var1.getParent();
    java.lang.Class[] var3 = new java.lang.Class[] { };
    java.lang.Class var4 = java.lang.reflect.Proxy.getProxyClass(var1, var3);
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass(var0, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.namespace.QName var6 = com.sun.xml.internal.ws.model.RuntimeModeler.getServiceName(var5);
      fail("Expected exception of type com.sun.xml.internal.ws.model.RuntimeModelerException");
    } catch (com.sun.xml.internal.ws.model.RuntimeModelerException e) {
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass(var0, var2);
    java.lang.String var4 = com.sun.xml.internal.ws.server.EndpointFactory.getWsdlLocation(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!"+ "'", var1.equals("Hi!"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("Hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://Hi!/"+ "'", var1.equals("http://Hi!/"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL var4 = var0.getResource("http://Hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    var1.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var3 = var1.loadClass("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass(var0, var2);
    com.sun.xml.internal.ws.handler.HandlerChainsModel var4 = com.sun.xml.internal.ws.util.HandlerAnnotationProcessor.buildHandlerChainsModel(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.namespace.QName var5 = com.sun.xml.internal.ws.model.RuntimeModeler.getServiceName(var3);
      fail("Expected exception of type com.sun.xml.internal.ws.model.RuntimeModelerException");
    } catch (com.sun.xml.internal.ws.model.RuntimeModelerException e) {
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
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var2 = var1.getParent();
    java.lang.Class[] var3 = new java.lang.Class[] { };
    java.lang.Class var4 = java.lang.reflect.Proxy.getProxyClass(var1, var3);
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass(var0, var3);
    java.util.Enumeration var7 = var0.getResources("hi!");
    var0.clearAssertionStatus();
    var0.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var2 = var1.getParent();
    java.lang.Class[] var3 = new java.lang.Class[] { };
    java.lang.Class var4 = java.lang.reflect.Proxy.getProxyClass(var1, var3);
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass(var0, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.namespace.QName var7 = com.sun.xml.internal.ws.model.RuntimeModeler.getPortName(var5, "hi!");
      fail("Expected exception of type com.sun.xml.internal.ws.model.RuntimeModelerException");
    } catch (com.sun.xml.internal.ws.model.RuntimeModelerException e) {
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass(var0, var2);
    com.sun.xml.internal.ws.handler.HandlerChainsModel var4 = com.sun.xml.internal.ws.util.HandlerAnnotationProcessor.buildHandlerChainsModel(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.namespace.QName var6 = com.sun.xml.internal.ws.model.RuntimeModeler.getPortName(var3, "hi!");
      fail("Expected exception of type com.sun.xml.internal.ws.model.RuntimeModelerException");
    } catch (com.sun.xml.internal.ws.model.RuntimeModelerException e) {
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
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL[] var3 = new java.net.URL[] { var2};
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var5 = var4.getParent();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3, var5);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var3);
    var7.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass(var0, var2);
    com.sun.xml.internal.ws.handler.HandlerChainsModel var4 = com.sun.xml.internal.ws.util.HandlerAnnotationProcessor.buildHandlerChainsModel(var3);
    com.sun.xml.internal.ws.handler.HandlerChainsModel var5 = com.sun.xml.internal.ws.util.HandlerAnnotationProcessor.buildHandlerChainsModel(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL[] var3 = new java.net.URL[] { var2};
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var5 = var4.getParent();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3, var5);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var3);
    java.lang.ClassLoader var8 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var10 = var8.getResource("");
    java.net.URLClassLoader var11 = java.net.URLClassLoader.newInstance(var3, var8);
    java.lang.ClassLoader var12 = var11.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL[] var3 = new java.net.URL[] { var2};
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var5 = var4.getParent();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3, var5);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var3);
    java.lang.ClassLoader var8 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var10 = var8.getResource("");
    java.net.URLClassLoader var11 = java.net.URLClassLoader.newInstance(var3, var8);
    java.net.URLClassLoader var12 = java.net.URLClassLoader.newInstance(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL[] var3 = new java.net.URL[] { var2};
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var5 = var4.getParent();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3, var5);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var3);
    java.net.URL[] var8 = var7.getURLs();
    java.net.URLClassLoader var9 = java.net.URLClassLoader.newInstance(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(100, 1, 1);
    var3.expire(100L);
    var3.expire(10L);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var2 = var1.getParent();
    java.lang.Class[] var3 = new java.lang.Class[] { };
    java.lang.Class var4 = java.lang.reflect.Proxy.getProxyClass(var1, var3);
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass(var0, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = com.sun.xml.internal.ws.server.EndpointFactory.verifyImplementorClass(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var2 = var0.getResource("");
    java.net.URL[] var3 = new java.net.URL[] { var2};
    java.lang.ClassLoader var4 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var5 = var4.getParent();
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3, var5);
    var6.setClassAssertionStatus("Hi!", false);
    java.io.InputStream var11 = var6.getResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass(var0, var2);
    com.sun.xml.internal.ws.handler.HandlerChainsModel var4 = com.sun.xml.internal.ws.util.HandlerAnnotationProcessor.buildHandlerChainsModel(var3);
    boolean var5 = java.lang.reflect.Proxy.isProxyClass(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(10, 1, 100);

  }

}
