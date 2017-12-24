
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var2 = var0.getTBSCertificate();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkValidity();
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(10L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)var1);
    java.util.Properties var3 = new java.util.Properties();
    var0.putAll((java.util.Map)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.set("", (java.lang.Object)true);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyMappingsExtension var1 = var0.getPolicyMappingsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    var2.clear();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.BasicConstraintsExtension var1 = var0.getBasicConstraintsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var2 = sun.security.x509.X509CertImpl.getSubjectX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)var1);
    java.util.Enumeration var3 = var1.getElements();
    java.util.Date var4 = var1.getNotAfter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    sun.security.x509.PrivateKeyUsageExtension var2 = var0.getPrivateKeyUsageExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkValidity();
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    sun.security.x509.PrivateKeyUsageExtension var2 = var0.getPrivateKeyUsageExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var4 = sun.security.x509.X509CertImpl.getIssuerX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)var1);
    java.lang.String var3 = var1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "X.509"+ "'", var3.equals("X.509"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)var1);
    java.lang.Object var4 = var1.get((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)var1);
    java.util.Enumeration var3 = var1.getElements();
    boolean[] var4 = var1.getKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    java.util.List var2 = var0.getExtendedKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    sun.security.x509.PrivateKeyUsageExtension var2 = var0.getPrivateKeyUsageExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var0.getEncoded();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var4 = var3.getGregorianChange();
    java.util.Date var5 = var3.getGregorianChange();
    boolean var7 = var5.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    java.lang.String var2 = var0.getSigAlgOID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    var3.set(0, 1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.GregorianCalendar var7 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var8 = var7.getGregorianChange();
    var3.setGregorianChange(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var4 = var3.getGregorianChange();
    java.util.Date var5 = var3.getGregorianChange();
    var3.setWeekDate(1, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var3.isSet((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var4 = var3.getGregorianChange();
    java.util.Date var5 = var3.getGregorianChange();
    java.util.TimeZone var6 = var3.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var4 = var3.getGregorianChange();
    java.util.Date var5 = var3.getGregorianChange();
    boolean var7 = var3.after((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("X.509");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    sun.security.x509.PrivateKeyUsageExtension var2 = var0.getPrivateKeyUsageExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    java.security.Principal var4 = var0.getIssuerDN();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.get("X.509");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)var1);
    java.util.Enumeration var3 = var1.getElements();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 0, 1);
    boolean var5 = var3.before((java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setWeekDate(0, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    java.util.Enumeration var3 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = var0.hasUnsupportedCriticalExtension();
    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), 0, 1);
    java.util.Date var6 = var5.getGregorianChange();
    java.util.Date var7 = var5.getGregorianChange();
    var7.setSeconds(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkValidity(var7);
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
