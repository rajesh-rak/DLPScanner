
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var2 = java.security.cert.CertificateFactory.getInstance("", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("{}", "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    boolean var5 = var1.containsKey((java.lang.Object)(-1.0d));
    boolean var7 = var1.containsKey((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Set var2 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    var1.clear();
    java.lang.Object var7 = var1.put((java.lang.Object)(-1L), (java.lang.Object)(byte)(-1));
    java.lang.Object var8 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    boolean var5 = var1.containsKey((java.lang.Object)(-1.0d));
    java.util.Hashtable var7 = new java.util.Hashtable(100);
    java.util.Enumeration var8 = var7.keys();
    java.util.Enumeration var9 = var7.keys();
    boolean var10 = var1.containsKey((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Enumeration var2 = var1.keys();
    java.util.Hashtable var4 = new java.util.Hashtable(100);
    java.util.Enumeration var5 = var4.keys();
    java.lang.String var6 = var4.toString();
    boolean var7 = var1.containsValue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPropertyAccess("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    java.util.Hashtable var6 = new java.util.Hashtable(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 100, (java.lang.Object)100);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    com.sun.crypto.provider.JceKeyStore var2 = new com.sun.crypto.provider.JceKeyStore();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!", (java.lang.Object)var2);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("hi!");
    boolean var6 = var0.checkTopLevelWindow((java.lang.Object)var3);
    java.lang.SecurityManager var9 = new java.lang.SecurityManager();
    var9.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var12 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var14 = var12.engineGetCertificate("hi!");
    boolean var15 = var9.checkTopLevelWindow((java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 0, (java.lang.Object)var15);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var1 = java.security.cert.CertificateFactory.getInstance("{}");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    boolean var5 = var1.containsKey((java.lang.Object)(-1.0d));
    java.util.Set var6 = var1.entrySet();
    java.util.Hashtable var8 = new java.util.Hashtable(100);
    java.util.Collection var9 = var8.values();
    java.util.Set var10 = var8.keySet();
    boolean var11 = var1.containsKey((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    byte[] var6 = new byte[] { (byte)100, (byte)1};
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("{}", var6, var7);
    java.security.cert.Certificate var10 = var0.engineGetCertificate("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("hi!");
    boolean var6 = var0.checkTopLevelWindow((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!", (java.lang.Object)(byte)1);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("hi!");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.Provider var1 = java.security.Security.getProvider("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    byte[] var6 = new byte[] { (byte)100, (byte)1};
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("{}", var6, var7);
    boolean var10 = var0.engineIsCertificateEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("hi!");
    boolean var6 = var0.checkTopLevelWindow((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("{}");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageDefinition("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSetFactory();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("hi!");
    boolean var6 = var0.checkTopLevelWindow((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("hi!");
    boolean var6 = var0.checkTopLevelWindow((java.lang.Object)var3);
    boolean var8 = var3.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
