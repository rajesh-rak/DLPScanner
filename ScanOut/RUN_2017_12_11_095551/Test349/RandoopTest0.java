
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(0, "hi!", 1, 1, 100, (-1), (-1), 10, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


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

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean[] var1 = var0.getIssuerUniqueID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    java.math.BigInteger var2 = var0.getSerialNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    var1.setID("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    boolean[] var2 = var0.getIssuerUniqueID();
    javax.security.auth.x500.X500Principal var3 = var0.getIssuerX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    byte[] var2 = var0.getSignature();
    java.security.Principal var3 = var0.getSubjectDN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgName();
    int var2 = var0.getBasicConstraints();
    sun.security.x509.X509CertImpl var3 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    java.math.BigInteger var4 = var0.getSerialNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.CertificatePoliciesExtension var2 = var0.getCertificatePoliciesExtension();
    sun.security.x509.SubjectAlternativeNameExtension var3 = var0.getSubjectAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(0, 10, 0);
    java.util.Date var7 = new java.util.Date(0, 10, 0);
    int var8 = var7.getHours();
    int var9 = var7.getMonth();
    sun.security.x509.CertificateValidity var10 = new sun.security.x509.CertificateValidity(var3, var7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    boolean[] var2 = var0.getIssuerUniqueID();
    java.lang.String var3 = var0.getSigAlgOID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date(0, 10, 0);
    int var4 = var3.getHours();
    int var5 = var3.getMonth();
    java.util.Date var9 = new java.util.Date(0, 10, 0);
    int var10 = var9.getHours();
    sun.security.x509.CertificateValidity var11 = new sun.security.x509.CertificateValidity(var3, var9);
    int var12 = var3.getSeconds();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    boolean[] var2 = var0.getIssuerUniqueID();
    sun.security.x509.ExtendedKeyUsageExtension var3 = var0.getExtendedKeyUsageExtension();
    java.security.Principal var4 = var0.getSubjectDN();
    
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


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    boolean[] var2 = var0.getIssuerUniqueID();
    sun.security.x509.ExtendedKeyUsageExtension var3 = var0.getExtendedKeyUsageExtension();
    sun.security.x509.AuthorityKeyIdentifierExtension var4 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.IssuerAlternativeNameExtension var5 = var0.getIssuerAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("hi!", "hi!", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(0, 10, 0);
    int var4 = var3.getHours();
    int var5 = var3.getMonth();
    java.util.Date var9 = new java.util.Date(0, 10, 0);
    int var10 = var9.getHours();
    sun.security.x509.CertificateValidity var11 = new sun.security.x509.CertificateValidity(var3, var9);
    java.lang.Object var12 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date(0, 10, 0);
    int var4 = var3.getHours();
    int var5 = var3.getMonth();
    java.util.Date var9 = new java.util.Date(0, 10, 0);
    int var10 = var9.getHours();
    sun.security.x509.CertificateValidity var11 = new sun.security.x509.CertificateValidity(var3, var9);
    java.lang.String var12 = var3.toString();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.lang.String var1 = var0.toString();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(0, 10, 0);
    int var4 = var3.getHours();
    int var5 = var3.getMonth();
    int var6 = var3.getYear();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgName();
    int var2 = var0.getBasicConstraints();
    sun.security.x509.X509CertImpl var3 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.BasicConstraintsExtension var4 = var3.getBasicConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(2, "hi!");
    var2.setID("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(0, (-1), 2, (-1), false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgName();
    int var2 = var0.getBasicConstraints();
    byte[] var3 = var0.getSignature();
    java.math.BigInteger var4 = var0.getSerialNumber();
    java.util.Collection var5 = var0.getSubjectAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
