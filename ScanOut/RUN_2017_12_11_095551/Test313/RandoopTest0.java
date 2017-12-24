
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl(var2);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var3 = var1.getEncoded();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.lang.String var2 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "info"+ "'", var2.equals("info"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.get("info");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.lang.String var2 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.get("hi!");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "info"+ "'", var2.equals("info"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    sun.security.x509.NameConstraintsExtension var3 = var1.getNameConstraintsExtension();
    boolean[] var4 = var1.getSubjectUniqueID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    java.security.Principal var5 = var1.getSubjectDN();
    java.lang.String var6 = var1.getSigAlgOID();
    sun.security.x509.AuthorityInfoAccessExtension var7 = var1.getAuthorityInfoAccessExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var2 = sun.security.x509.X509CertImpl.getSubjectX500Principal((java.security.cert.X509Certificate)var1);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    java.util.Date var4 = var1.getNotAfter();
    byte[] var5 = var1.getTBSCertificate();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    java.util.Collection var3 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    sun.security.x509.SerialNumber var3 = var1.getSerialNumberObject();
    javax.security.auth.x500.X500Principal var4 = var1.getIssuerX500Principal();
    sun.security.x509.CertificatePoliciesExtension var5 = var1.getCertificatePoliciesExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    sun.security.x509.SerialNumber var3 = var1.getSerialNumberObject();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.set("", (java.lang.Object)1.0d);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    sun.security.x509.SubjectKeyIdentifierExtension var2 = var1.getSubjectKeyIdentifierExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var3 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var1);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    java.util.Date var4 = var1.getNotAfter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var5 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var1);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    java.util.Date var4 = var1.getNotAfter();
    java.util.Collection var5 = var1.getSubjectAlternativeNames();
    sun.security.x509.SubjectKeyIdentifierExtension var6 = var1.getSubjectKeyIdentifierExtension();
    sun.security.x509.CRLDistributionPointsExtension var7 = var1.getCRLDistributionPointsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    sun.security.x509.SerialNumber var3 = var1.getSerialNumberObject();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    java.util.List var5 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    sun.security.x509.SubjectKeyIdentifierExtension var2 = var1.getSubjectKeyIdentifierExtension();
    boolean var3 = var1.hasUnsupportedCriticalExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    java.security.Principal var5 = var1.getSubjectDN();
    java.lang.String var6 = var1.getSigAlgOID();
    java.security.Principal var7 = var1.getSubjectDN();
    java.util.Set var8 = var1.getCriticalExtensionOIDs();
    java.security.PublicKey var9 = var1.getPublicKey();
    boolean var11 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var1, "hi!");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.security.PublicKey var2 = var1.getPublicKey();
    javax.security.auth.x500.X500Principal var3 = var1.getSubjectX500Principal();
    java.lang.String var4 = var1.getSigAlgOID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.List var2 = var1.getExtendedKeyUsage();
    boolean[] var3 = var1.getIssuerUniqueID();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    java.security.Principal var5 = var1.getSubjectDN();
    java.lang.String var6 = var1.getSigAlgOID();
    java.security.Principal var7 = var1.getSubjectDN();
    sun.security.x509.SerialNumber var8 = var1.getSerialNumberObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

}
