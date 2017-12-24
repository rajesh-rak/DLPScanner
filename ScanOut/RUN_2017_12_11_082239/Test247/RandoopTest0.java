
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = javax.management.ObjectName.getInstance("hi!");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    boolean var4 = var2.contains((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var4 = javax.management.ObjectName.getInstance(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    javax.management.ObjectName var12 = new javax.management.ObjectName("hi!", "hi!", "");
    int var13 = var7.compareTo(var12);
    java.lang.String var14 = var12.getCanonicalKeyPropertyListString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!="+ "'", var14.equals("hi!="));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.lang.String var3 = var2.toString();
    boolean var5 = var2.containsKey((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    boolean var10 = var3.equals((java.lang.Object)100);
    java.lang.String var11 = var3.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!:hi!="+ "'", var11.equals("hi!:hi!="));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    java.lang.String var9 = var3.getKeyPropertyListString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!="+ "'", var9.equals("hi!="));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = javax.management.ObjectName.quote("hi!:hi!=");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\"hi!:hi!=\""+ "'", var1.equals("\"hi!:hi!=\""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var9 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("", "hi!=", "hi!:hi!=");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = new javax.management.ObjectName("hi!=");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Set var3 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var4 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var3);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "", "hi!:hi!=");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    javax.management.ObjectName var12 = new javax.management.ObjectName("hi!", "hi!", "");
    int var13 = var7.compareTo(var12);
    java.lang.String var14 = var7.getCanonicalKeyPropertyListString();
    boolean var15 = var7.isPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!="+ "'", var14.equals("hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)(short)100);
    boolean var5 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var1 = javax.management.ObjectName.quote("DefaultDomain");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\"DefaultDomain\""+ "'", var1.equals("\"DefaultDomain\""));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    javax.management.ObjectName var12 = new javax.management.ObjectName("hi!", "hi!", "");
    int var13 = var7.compareTo(var12);
    java.lang.String var14 = var7.getCanonicalKeyPropertyListString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var15 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!="+ "'", var14.equals("hi!="));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var8 = var3.apply(var7);
    java.lang.String var9 = var3.getCanonicalName();
    boolean var10 = var3.isPropertyListPattern();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)var3, "hi!:hi!=");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!:hi!="+ "'", var9.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", false);
    java.lang.String[] var3 = var2.getDomains();
    java.lang.String var4 = var2.getDefaultDomain();
    javax.management.ObjectName var8 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var12 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var13 = var8.apply(var12);
    java.lang.String var14 = var8.getCanonicalName();
    boolean var15 = var8.isPropertyListPattern();
    boolean var16 = var2.contains(var8);
    boolean var17 = var8.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DefaultDomain"+ "'", var4.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!:hi!="+ "'", var14.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("hi!:hi!=");
    java.util.Enumeration var3 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", false);
    java.lang.Integer var3 = var2.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("\"hi!:hi!=\"", "\"DefaultDomain\"", var2, "hi!=", 0);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.lang.String var3 = var2.toString();
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var11 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var12 = var7.apply(var11);
    javax.management.ObjectName var16 = new javax.management.ObjectName("hi!", "hi!", "");
    int var17 = var11.compareTo(var16);
    boolean var18 = var2.contains((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 100.0f);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("hi!:hi!=");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("\"hi!:hi!=\"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
