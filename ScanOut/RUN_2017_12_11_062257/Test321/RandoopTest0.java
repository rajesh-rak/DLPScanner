
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(1, 1, 10, (-1), (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2174000461000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.lang.String var1 = var0.toString();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.ProtectionDomain[] var2 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var3 = new java.security.AccessControlContext(var2);
    boolean var4 = var1.equals((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    boolean var3 = var2.isEmpty();
    java.util.Enumeration var4 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals(var1);
    java.lang.String var3 = var1.toString();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "validity"+ "'", var2.equals("validity"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.lang.String var1 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.set("", (java.lang.Object)"");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "info"+ "'", var1.equals("info"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 0, 100, 100, 10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    java.lang.String var1 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Collection var3 = var2.values();
    java.util.Set var4 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Collection var3 = var2.values();
    boolean var5 = var2.containsValue((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Hashtable var6 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var7 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var6);
    java.util.Hashtable var10 = new java.util.Hashtable(1, 10.0f);
    java.util.Hashtable var11 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var10);
    java.lang.Object var12 = var2.put((java.lang.Object)var7, (java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var6 = new java.util.Date(1, (-1), (-1), 100, 10, 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Enumeration var3 = var2.keys();
    java.util.Enumeration var4 = var2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Collection var3 = var2.values();
    sun.security.x509.X509CertInfo var4 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertInfo var5 = new sun.security.x509.X509CertInfo();
    boolean var6 = var4.equals(var5);
    boolean var7 = var2.containsKey((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.util.Enumeration var1 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    java.util.Date var7 = new java.util.Date(10, (-1), 10, 0, 1, 10);
    int var8 = var7.getMonth();
    var0.valid(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 10, 0, 1, 10);
    var6.setHours(11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 10, 0, 1, 10);
    int var7 = var6.getMonth();
    int var8 = var6.getHours();
    int var9 = var6.getHours();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("validity");
    char[] var5 = new char[] { '4'};
    java.security.Key var6 = var0.engineGetKey("info", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("validity");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals(var1);
    java.lang.String var3 = var0.getName();
    byte[] var4 = var0.getEncodedInfo();

  }

}
