
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var3 = new byte[] { (byte)1, (byte)1, (byte)(-1)};
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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)100, (byte)(-1), (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var4 = new sun.security.x509.X509CertImpl(var3);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    byte[] var4 = var1.getTBSCertificate();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    sun.security.x509.SubjectKeyIdentifierExtension var4 = var1.getSubjectKeyIdentifierExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    byte[] var2 = var1.getSignature();
    java.util.List var3 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var1);
    sun.security.x509.PolicyConstraintsExtension var4 = var1.getPolicyConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    sun.security.x509.X509CertInfo var3 = new sun.security.x509.X509CertInfo();
    boolean var5 = var3.equals((java.lang.Object)100.0f);
    boolean var6 = var0.equals(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.CertificateExtensions var0 = new sun.security.x509.CertificateExtensions();
    java.util.Collection var1 = var0.getAllExtensions();
    boolean var2 = var0.hasUnsupportedCriticalExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    byte[] var2 = var1.getSignature();
    java.util.Set var3 = var1.getCriticalExtensionOIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    byte[] var1 = var0.getEncodedInfo();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    java.util.Set var4 = var1.getCriticalExtensionOIDs();
    java.util.Set var5 = var1.getCriticalExtensionOIDs();
    
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


    byte[] var1 = new byte[] { (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs.PKCS7 var2 = new sun.security.pkcs.PKCS7(var1);
      fail("Expected exception of type sun.security.pkcs.ParsingException");
    } catch (sun.security.pkcs.ParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    java.util.Set var4 = var1.getCriticalExtensionOIDs();
    sun.security.x509.PolicyMappingsExtension var5 = var1.getPolicyMappingsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var1 = new byte[] { (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var2 = new sun.security.x509.X509CertImpl(var1);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.CertificateExtensions var0 = new sun.security.x509.CertificateExtensions();
    java.util.Collection var1 = var0.getAllExtensions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.checkValidity();
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.lang.String var2 = var0.toString();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    int var4 = var1.getBasicConstraints();
    java.util.Set var5 = var1.getCriticalExtensionOIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    byte[] var2 = var1.getSignature();
    java.security.PublicKey var3 = var1.getPublicKey();
    byte[] var4 = var1.getSigAlgParams();
    java.util.Set var5 = var1.getCriticalExtensionOIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    java.util.Set var4 = var1.getCriticalExtensionOIDs();
    java.security.Principal var5 = var1.getSubjectDN();
    sun.security.x509.CertificatePoliciesExtension var6 = var1.getCertificatePoliciesExtension();
    
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

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean[] var1 = var0.getKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo(var0);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    java.util.Set var2 = var1.getNonCriticalExtensionOIDs();
    sun.security.x509.AuthorityInfoAccessExtension var3 = var1.getAuthorityInfoAccessExtension();
    int var4 = var1.getBasicConstraints();
    boolean var5 = var1.hasUnsupportedCriticalExtension();
    boolean var7 = var1.equals((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.set("", (java.lang.Object)1.0f);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertImpl var1 = new sun.security.x509.X509CertImpl(var0);
    byte[] var2 = var1.getSignature();
    java.security.PublicKey var3 = var1.getPublicKey();
    sun.security.x509.BasicConstraintsExtension var4 = var1.getBasicConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
