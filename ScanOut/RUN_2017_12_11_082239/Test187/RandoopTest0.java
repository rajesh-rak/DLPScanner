
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.Integer var2 = var1.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = new javax.management.ObjectName("DefaultDomain");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("DefaultDomain", "hi!", "hi!");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { (byte)10, (byte)10, (byte)1};
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("DefaultDomain", var5, var6);
    int var8 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    java.util.Set var5 = var4.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.annotation.Annotation[] var5 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var4);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var3 = new java.util.Hashtable(1, 1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = new javax.management.ObjectName("hi!", var3);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var2 = var1.getDefaultDomain();
    javax.management.ObjectName var6 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    javax.management.DynamicMBean var7 = var1.retrieve(var6);
    com.sun.jmx.mbeanserver.Repository var9 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var10 = var9.getDefaultDomain();
    javax.management.ObjectName var14 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    javax.management.DynamicMBean var15 = var9.retrieve(var14);
    boolean var16 = var1.contains(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "DefaultDomain"+ "'", var2.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "DefaultDomain"+ "'", var10.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var2 = var1.getDefaultDomain();
    javax.management.ObjectName var6 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    javax.management.DynamicMBean var7 = var1.retrieve(var6);
    java.lang.String var8 = var1.getDefaultDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "DefaultDomain"+ "'", var2.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "DefaultDomain"+ "'", var8.equals("DefaultDomain"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String[] var2 = var1.getDomains();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    java.util.Hashtable var4 = var3.getKeyPropertyList();
    boolean var6 = var3.equals((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var3 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var6 = var3.put((java.lang.Object)(-1L), (java.lang.Object)'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var7 = javax.management.ObjectName.getInstance("", var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

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


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var3 = var2.clone();
    boolean var5 = var2.containsKey((java.lang.Object)(byte)0);
    java.util.Collection var6 = var2.values();
    java.lang.annotation.Annotation[] var7 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.jmx.mbeanserver.Repository var1 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var2 = var1.getDefaultDomain();
    javax.management.ObjectName var6 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    javax.management.DynamicMBean var7 = var1.retrieve(var6);
    javax.management.ObjectName var11 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    java.util.Hashtable var12 = var11.getKeyPropertyList();
    javax.management.ObjectName var16 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    boolean var17 = var16.isPropertyPattern();
    java.util.Set var18 = var1.query(var11, (javax.management.QueryExp)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "DefaultDomain"+ "'", var2.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    boolean var4 = var3.isPropertyListPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("DefaultDomain", false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    boolean var4 = var0.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("", "hi!", var2, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    int var3 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var3 = var2.clone();
    boolean var5 = var2.containsKey((java.lang.Object)(byte)0);
    java.util.Collection var6 = var2.values();
    int var7 = var2.size();
    com.sun.jmx.mbeanserver.Repository var9 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var10 = var9.getDefaultDomain();
    javax.management.ObjectName var14 = javax.management.ObjectName.getInstance("DefaultDomain", "DefaultDomain", "");
    javax.management.DynamicMBean var15 = var9.retrieve(var14);
    javax.management.ObjectName var16 = javax.management.ObjectName.getInstance(var14);
    java.lang.String var17 = var16.getDomain();
    boolean var18 = var2.containsKey((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "DefaultDomain"+ "'", var10.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "DefaultDomain"+ "'", var17.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(-1L), (java.lang.Object)'a');
    java.util.Set var6 = var2.keySet();
    boolean var7 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var3 = var2.clone();
    boolean var5 = var2.containsKey((java.lang.Object)(byte)0);
    java.util.Collection var6 = var2.values();
    com.sun.jmx.mbeanserver.Repository var8 = new com.sun.jmx.mbeanserver.Repository("");
    java.lang.String var9 = var8.getDefaultDomain();
    java.lang.String[] var10 = var8.getDomains();
    boolean var11 = var2.containsKey((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "DefaultDomain"+ "'", var9.equals("DefaultDomain"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var3 = var2.clone();
    java.util.Enumeration var4 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
