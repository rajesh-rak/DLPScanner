
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var15 = var14.keySet();
    var2.putAll((java.util.Map)var14);
    java.util.Collection var17 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)100.0f);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var4 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var5 = var4.keySet();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var4);
    java.util.Collection var7 = var6.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.rmi.registry.RegistryContext var8 = new com.sun.jndi.rmi.registry.RegistryContext("", (-1), var6);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Set var5 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)false);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    boolean var5 = var4.isEmpty();
    java.util.Set var6 = var4.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var5 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var15 = var14.keySet();
    java.util.Hashtable var16 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var14);
    boolean var17 = var7.containsValue((java.lang.Object)var14);
    int var18 = var14.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var15 = var14.keySet();
    var2.putAll((java.util.Map)var14);
    java.lang.String var17 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "{}"+ "'", var17.equals("{}"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var15 = var14.keySet();
    var2.putAll((java.util.Map)var14);
    java.util.Hashtable var17 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var15 = var14.keySet();
    var2.putAll((java.util.Map)var14);
    boolean var18 = var14.contains((java.lang.Object)'#');
    java.util.Hashtable var21 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var22 = var21.keySet();
    java.util.Hashtable var23 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var21);
    boolean var24 = var23.isEmpty();
    java.util.Enumeration var25 = var23.keys();
    boolean var26 = var14.contains((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var7 = var6.keySet();
    boolean var8 = var2.containsValue((java.lang.Object)var6);
    java.util.Collection var9 = var6.values();
    java.util.Hashtable var12 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var13 = var12.keySet();
    java.util.Hashtable var14 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var12);
    java.lang.Object var15 = var12.clone();
    boolean var16 = var6.containsValue(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var7 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var8 = var7.keySet();
    java.util.Hashtable var9 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var7);
    java.lang.Object var10 = var7.clone();
    var2.putAll((java.util.Map)var7);
    java.util.Properties var12 = new java.util.Properties();
    boolean var13 = var7.containsValue((java.lang.Object)var12);
    java.util.Set var14 = var12.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Collection var5 = var4.values();
    java.lang.Object var6 = var4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var7 = var6.keySet();
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var6);
    java.util.Hashtable var11 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var12 = var11.keySet();
    java.util.Hashtable var13 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var11);
    java.lang.Object var14 = var11.clone();
    var6.putAll((java.util.Map)var11);
    java.util.Hashtable var18 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var19 = var18.keySet();
    java.util.Hashtable var20 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var18);
    boolean var21 = var11.containsValue((java.lang.Object)var18);
    java.lang.Object var22 = var2.get((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Set var5 = var4.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var4 = var2.get((java.lang.Object)(byte)0);
    java.util.Hashtable var5 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "", 0);
    java.lang.String var6 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    var2.clear();
    java.util.Collection var6 = var2.values();
    java.util.Set var7 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
