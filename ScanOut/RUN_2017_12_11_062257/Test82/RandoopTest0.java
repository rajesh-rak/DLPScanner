
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    boolean var4 = var1.before(var3);
    java.lang.String var5 = var1.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    byte[] var1 = var0.getEncodedInfo();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getDate();
    var1.setYear(1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var5 = new java.util.Date(10, 0, 1, (-1), 0);
    int var6 = var5.getDay();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var6 = new java.util.Date(0, 0, 1, (-1), 0, 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    int var8 = var1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "validity"+ "'", var8.equals("validity"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"+ "'", var9.equals("Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"+ "'", var10.equals("Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    var1.setDate((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals((java.lang.Object)"Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]");
    byte[] var3 = var0.getEncodedInfo();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    sun.security.x509.AuthorityKeyIdentifierExtension var3 = var0.getAuthorityKeyIdentifierExtension();
    java.util.Set var4 = var0.getNonCriticalExtensionOIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    int var8 = var5.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PrivateKeyUsageExtension var1 = var0.getPrivateKeyUsageExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.util.Enumeration var1 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    sun.security.x509.AuthorityKeyIdentifierExtension var3 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.IssuerAlternativeNameExtension var4 = var0.getIssuerAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    java.util.Date var9 = new java.util.Date(1L);
    java.util.Date var11 = new java.util.Date(1L);
    java.util.Date var13 = new java.util.Date(1L);
    boolean var14 = var11.before(var13);
    sun.security.x509.CertificateValidity var15 = new sun.security.x509.CertificateValidity(var9, var13);
    boolean var16 = var1.after(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.security.PublicKey var1 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    sun.security.x509.AuthorityKeyIdentifierExtension var3 = var0.getAuthorityKeyIdentifierExtension();
    java.util.Collection var4 = var0.getIssuerAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    java.lang.String var8 = var7.getName();
    java.lang.String var9 = var7.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var7.get("validity");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "validity"+ "'", var8.equals("validity"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"+ "'", var9.equals("Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    sun.security.x509.ExtendedKeyUsageExtension var2 = var0.getExtendedKeyUsageExtension();
    sun.security.x509.CertificatePoliciesExtension var3 = var0.getCertificatePoliciesExtension();
    javax.security.auth.x500.X500Principal var4 = var0.getSubjectX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals((java.lang.Object)"Validity: [From: Thu Jan 01 05:30:00 IST 1970,\n               To: Thu Jan 01 05:30:00 IST 1970]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.NameConstraintsExtension var1 = var0.getNameConstraintsExtension();
    sun.security.x509.ExtendedKeyUsageExtension var2 = var0.getExtendedKeyUsageExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    java.util.Collection var2 = var0.getSubjectAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    java.util.Date var5 = new java.util.Date(1L);
    boolean var6 = var3.before(var5);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var5);
    java.lang.String var8 = var5.toGMTString();
    int var9 = var5.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkListen(100);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

}
