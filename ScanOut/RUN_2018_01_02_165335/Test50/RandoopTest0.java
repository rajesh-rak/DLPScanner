
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("hi!", "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("hi!", "hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.crypto.provider.SunJCE var1 = new com.sun.crypto.provider.SunJCE();
    boolean var3 = var1.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var6 = var1.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.lang.Object var9 = var1.setProperty("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var10 = java.security.cert.CertificateFactory.getInstance("", (java.security.Provider)var1);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsValue((java.lang.Object)(short)0);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "SunJCE version 1.7"+ "'", var3.equals("SunJCE version 1.7"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var6 = var0.values();
    java.util.Set var7 = var0.stringPropertyNames();
    java.util.Enumeration var8 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var6 = var0.elements();
    java.util.Collection var7 = var0.values();
    java.lang.String var8 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "SunJCE"+ "'", var8.equals("SunJCE"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.SunJCE var2 = new com.sun.crypto.provider.SunJCE();
    boolean var4 = var2.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var7 = var2.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var8 = var2.values();
    java.util.Set var9 = var2.stringPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var10 = sun.security.jca.GetInstance.getService("hi!", "SunJCE", (java.security.Provider)var2);
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("SunJCE");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    boolean var8 = var6.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var11 = var6.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var12 = var6.values();
    boolean var13 = var0.equals((java.lang.Object)var12);
    java.lang.String var14 = var0.getName();
    java.util.Set var15 = var0.getServices();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "SunJCE"+ "'", var14.equals("SunJCE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsValue((java.lang.Object)(short)0);
    java.util.Collection var3 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    boolean var8 = var6.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var11 = var6.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var12 = var6.values();
    boolean var13 = var0.equals((java.lang.Object)var12);
    java.util.Set var14 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Set var6 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var6 = var0.values();
    com.sun.crypto.provider.SunJCE var8 = new com.sun.crypto.provider.SunJCE();
    com.sun.crypto.provider.SunJCE var9 = new com.sun.crypto.provider.SunJCE();
    var8.putAll((java.util.Map)var9);
    java.lang.Object var11 = var0.put((java.lang.Object)(byte)(-1), (java.lang.Object)var8);
    com.sun.crypto.provider.SunJCE var12 = new com.sun.crypto.provider.SunJCE();
    boolean var14 = var12.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var17 = var12.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var18 = var12.elements();
    java.util.Set var19 = var12.keySet();
    java.util.Enumeration var20 = var12.propertyNames();
    java.lang.Object var21 = var0.get((java.lang.Object)var20);
    com.sun.crypto.provider.SunJCE var22 = new com.sun.crypto.provider.SunJCE();
    boolean var24 = var22.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var27 = var22.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var28 = var22.elements();
    java.util.Collection var29 = var22.values();
    java.lang.Object var31 = var0.put((java.lang.Object)var22, (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.lang.Object var8 = var0.setProperty("hi!", "hi!");
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsValue((java.lang.Object)(short)0);
    java.lang.Object var5 = var0.setProperty("hi!", "");
    java.lang.Object var6 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var6 = var0.elements();
    com.sun.crypto.provider.SunJCE var7 = new com.sun.crypto.provider.SunJCE();
    boolean var9 = var7.containsValue((java.lang.Object)(short)0);
    java.lang.Object var12 = var7.setProperty("hi!", "");
    java.lang.Object var13 = var0.remove((java.lang.Object)var7);
    java.util.Enumeration var14 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var6 = var0.elements();
    java.util.Collection var7 = var0.values();
    java.util.Enumeration var8 = var0.keys();
    boolean var10 = var0.equals((java.lang.Object)1);
    java.lang.String var12 = var0.getProperty("SunJCE version 1.7");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    com.sun.crypto.provider.SunJCE var6 = new com.sun.crypto.provider.SunJCE();
    boolean var8 = var6.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var11 = var6.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var12 = var6.values();
    boolean var13 = var0.equals((java.lang.Object)var12);
    java.lang.String var14 = var0.getName();
    com.sun.crypto.provider.SunJCE var15 = new com.sun.crypto.provider.SunJCE();
    boolean var17 = var15.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var20 = var15.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var21 = var15.values();
    java.util.Set var22 = var15.stringPropertyNames();
    java.util.Enumeration var23 = var15.keys();
    boolean var24 = var0.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "SunJCE"+ "'", var14.equals("SunJCE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Collection var6 = var0.values();
    java.util.Set var7 = var0.stringPropertyNames();
    java.lang.String var8 = var0.toString();
    java.util.Enumeration var9 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "SunJCE version 1.7"+ "'", var8.equals("SunJCE version 1.7"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    boolean var2 = var0.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var5 = var0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration var6 = var0.elements();
    java.util.Collection var7 = var0.values();
    java.util.Enumeration var8 = var0.keys();
    boolean var10 = var0.equals((java.lang.Object)1);
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("SunJCE");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
