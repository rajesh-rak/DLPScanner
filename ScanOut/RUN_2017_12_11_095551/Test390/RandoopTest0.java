
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var0);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var2 = var0.getExtensionValue("hi!");
    int var3 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = var0.getEncodedInternal();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var4 = new sun.security.x509.X509CertInfo(var3);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    java.util.List var2 = var0.getExtendedKeyUsage();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var3 = sun.security.x509.X509CertImpl.getSubjectX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var6 = java.util.Date.UTC(0, (-1), 10, 1, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2210885930000L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.BasicConstraintsExtension var3 = var2.getBasicConstraintsExtension();
    boolean var5 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var2, "x509");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.BasicConstraintsExtension var3 = var2.getBasicConstraintsExtension();
    sun.security.x509.SubjectAlternativeNameExtension var4 = var2.getSubjectAlternativeNameExtension();
    sun.security.x509.CertificatePoliciesExtension var5 = var2.getCertificatePoliciesExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.BasicConstraintsExtension var3 = var2.getBasicConstraintsExtension();
    java.util.List var4 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var2);
    java.lang.String var5 = var2.getName();
    java.security.Principal var6 = var2.getSubjectDN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "x509"+ "'", var5.equals("x509"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.BasicConstraintsExtension var3 = var2.getBasicConstraintsExtension();
    java.util.List var4 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var2);
    java.util.List var5 = var2.getExtendedKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date(10, (-1), 10);
    var3.setHours(1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.IssuerAlternativeNameExtension var3 = var0.getIssuerAlternativeNameExtension();
    java.util.Collection var4 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var0);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.PolicyMappingsExtension var3 = var2.getPolicyMappingsExtension();
    java.util.Collection var4 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.IssuerAlternativeNameExtension var3 = var0.getIssuerAlternativeNameExtension();
    sun.security.x509.PolicyMappingsExtension var4 = var0.getPolicyMappingsExtension();
    int var5 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("hi!");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    byte[] var7 = new byte[] { (byte)1, (byte)100, (byte)100};
    sun.security.x509.X509CertImpl var8 = new sun.security.x509.X509CertImpl();
    java.util.Set var9 = var8.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var10 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var8);
    sun.security.x509.IssuerAlternativeNameExtension var11 = var8.getIssuerAlternativeNameExtension();
    sun.security.x509.PolicyMappingsExtension var12 = var8.getPolicyMappingsExtension();
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { var8};
    var0.engineSetKeyEntry("hi!", var7, var13);
    java.security.cert.Certificate[] var16 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate[] var18 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate[] var20 = var0.engineGetCertificateChain("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.IssuerAlternativeNameExtension var3 = var0.getIssuerAlternativeNameExtension();
    boolean[] var4 = var0.getIssuerUniqueID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    byte[] var7 = new byte[] { (byte)1, (byte)100, (byte)100};
    sun.security.x509.X509CertImpl var8 = new sun.security.x509.X509CertImpl();
    java.util.Set var9 = var8.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var10 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var8);
    sun.security.x509.IssuerAlternativeNameExtension var11 = var8.getIssuerAlternativeNameExtension();
    sun.security.x509.PolicyMappingsExtension var12 = var8.getPolicyMappingsExtension();
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { var8};
    var0.engineSetKeyEntry("hi!", var7, var13);
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    byte[] var4 = var2.getExtensionValue("x509");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = var2.getEncodedInternal();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    byte[] var3 = var0.getIssuerKeyIdentifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(10, (-1), 10);
    java.util.Date var7 = new java.util.Date(10, (-1), 10);
    boolean var8 = var3.after(var7);
    java.util.Date var12 = new java.util.Date(10, (-1), 10);
    java.util.Date var16 = new java.util.Date(10, (-1), 10);
    boolean var17 = var12.after(var16);
    boolean var18 = var3.before(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    java.util.List var2 = var0.getExtendedKeyUsage();
    java.security.Principal var3 = var0.getIssuerDN();
    java.security.PublicKey var4 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
