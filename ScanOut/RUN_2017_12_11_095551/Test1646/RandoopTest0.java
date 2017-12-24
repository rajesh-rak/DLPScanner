
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 10, 1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(0, 0, 10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, 100, 0);
    var3.expire(100L);
    java.lang.String var6 = var3.toString();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Hi!"+ "'", var1.equals("Hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("Hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://Hi!/"+ "'", var1.equals("http://Hi!/"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://hi!/"+ "'", var1.equals("http://hi!/"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 100, (-1));
    var3.expire(100L);
    var3.expire(0L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("http://hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Http://hi!/"+ "'", var1.equals("Http://hi!/"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, (-1), 1);
    java.lang.String var4 = var3.toString();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, 10, (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("Http://hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Http://hi!/"+ "'", var1.equals("Http://hi!/"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, 100, 0);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var6 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.capitalize("http://Hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Http://Hi!/"+ "'", var1.equals("Http://Hi!/"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 100, 0);
    var3.expire(10L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(100, 100, (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = com.sun.xml.internal.ws.model.RuntimeModeler.getNamespace("http://hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "http://http://hi!//"+ "'", var1.equals("http://http://hi!//"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(100, 0, 100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), (-1), (-1));
    var3.expire(10L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(10, (-1), (-1));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, (-1), 1);
    var3.expire(0L);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(100, 1, 1);
    var3.expire(1L);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 100, (-1));
    var3.expire(100L);
    var3.expire(10L);
    java.lang.String var8 = var3.toString();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 10, (-1));
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)"http://Hi!/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
