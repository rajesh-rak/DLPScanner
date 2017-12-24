
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(short)1, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getReturnType();
    boolean var8 = var5.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 100);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getReturnType();
    java.lang.Object var7 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)1L);
    boolean var4 = var0.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "hi!", var4, "hi!", 100);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var4, "hi!", 1);
    java.lang.Object var11 = var10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    java.util.Enumeration var2 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "hi!", var4, "hi!", 100);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var4, "hi!", 1);
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]"+ "'", var11.equals("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var5 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var5, var6);
    boolean var9 = var0.engineContainsAlias("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable();
    var1.putAll((java.util.Map)var2);
    java.lang.annotation.Annotation[] var4 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)var0, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "hi!", var4, "hi!", 100);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var4, "hi!", 1);
    java.lang.String var11 = var10.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(byte)10, "javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)1L);
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable();
    var1.putAll((java.util.Map)var2);
    java.lang.Object var4 = var2.clone();
    java.lang.Object var5 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable();
    var1.putAll((java.util.Map)var2);
    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "hi!", var6, "hi!", 100);
    java.lang.Object var10 = var2.remove((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getDescription();
    java.lang.Object var7 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]");
    java.security.cert.Certificate var6 = var0.engineGetCertificate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]");
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.util.Set var3 = var2.entrySet();
    var0.putAll((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=action, descriptor={}]", var2, "hi!", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var6 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var5);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    byte[] var5 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var5, var6);
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var10 = var9.engineAliases();
    com.sun.crypto.provider.JceKeyStore var12 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var13 = var12.engineAliases();
    byte[] var17 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var18 = new java.security.cert.Certificate[] { };
    var12.engineSetKeyEntry("", var17, var18);
    com.sun.crypto.provider.JceKeyStore var20 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var21 = var20.engineAliases();
    byte[] var25 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var26 = new java.security.cert.Certificate[] { };
    var20.engineSetKeyEntry("", var25, var26);
    var9.engineSetKeyEntry("", var17, var26);
    com.sun.crypto.provider.JceKeyStore var29 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var30 = var29.engineAliases();
    com.sun.crypto.provider.JceKeyStore var32 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var33 = var32.engineAliases();
    byte[] var37 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var38 = new java.security.cert.Certificate[] { };
    var32.engineSetKeyEntry("", var37, var38);
    com.sun.crypto.provider.JceKeyStore var40 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var41 = var40.engineAliases();
    byte[] var45 = new byte[] { (byte)10, (byte)100};
    java.security.cert.Certificate[] var46 = new java.security.cert.Certificate[] { };
    var40.engineSetKeyEntry("", var45, var46);
    var29.engineSetKeyEntry("", var37, var46);
    var0.engineSetKeyEntry("", var17, var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "hi!", var4, "hi!", 100);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
