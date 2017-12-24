
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var2 = new byte[] { (byte)1, (byte)1};
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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var6.getEnumerated();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var7 = var6.getBitString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue[] var9 = var6.getSet(10, false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var9 = var6.subStream(10, false);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var7 = var6.getGeneralizedTime();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue[] var9 = var6.getSet((-1), true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var6.getInteger();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.CertificateExtensions var7 = new sun.security.x509.CertificateExtensions(var6);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    boolean var4 = var0.engineIsKeyEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    java.util.Enumeration var3 = var0.engineAliases();
    boolean var5 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue[] var8 = var6.getSet((-1));
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    java.util.Enumeration var3 = var0.engineAliases();
    int var4 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.security.PublicKey var1 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var3 = var0.getEncoded();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    byte[] var10 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var10, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.getBytes(var10);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.CRLDistributionPointsExtension var3 = var0.getCRLDistributionPointsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var4 = sun.security.x509.X509CertImpl.getSubjectX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.security.Principal var1 = var0.getSubjectDN();
    java.util.Enumeration var2 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var6.peekByte();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.security.Principal var1 = var0.getSubjectDN();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    java.lang.String var3 = var2.getSigAlgName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    sun.security.util.DerInputStream var9 = var6.subStream(0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var10 = var9.getPositiveBigInteger();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.CRLDistributionPointsExtension var3 = var0.getCRLDistributionPointsExtension();
    byte[] var4 = var0.getSigAlgParams();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.CRLDistributionPointsExtension var3 = var0.getCRLDistributionPointsExtension();
    boolean var4 = sun.security.x509.X509CertImpl.isSelfIssued((java.security.cert.X509Certificate)var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    java.util.Enumeration var3 = var0.engineAliases();
    sun.security.x509.X509CertImpl var4 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var5 = var4.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var6 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var4);
    sun.security.x509.CRLDistributionPointsExtension var7 = var4.getCRLDistributionPointsExtension();
    java.util.Collection var8 = sun.security.x509.X509CertImpl.getSubjectAlternativeNames((java.security.cert.X509Certificate)var4);
    java.lang.String var9 = var0.engineGetCertificateAlias((java.security.cert.Certificate)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 0);
    sun.security.util.DerInputStream var9 = var6.subStream(0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var6.getIA5String();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)(short)100);
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.util.Set var2 = var0.entrySet();
    sun.security.x509.X509CertImpl var4 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var5 = var4.getAuthorityInfoAccessExtension();
    sun.security.x509.X509CertImpl var6 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var4);
    sun.security.x509.X509CertImpl var7 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var4);
    java.lang.Object var8 = var0.put((java.lang.Object)10L, (java.lang.Object)var7);
    byte[] var12 = new byte[] { (byte)0, (byte)1, (byte)1};
    sun.security.util.DerInputStream var15 = new sun.security.util.DerInputStream(var12, (-1), 0);
    java.lang.Object var16 = new java.lang.Object();
    java.lang.Object var17 = var0.put((java.lang.Object)0, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

}
