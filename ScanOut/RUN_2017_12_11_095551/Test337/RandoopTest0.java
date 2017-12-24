
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.util.Date var3 = new java.util.Date(10L);
    int var4 = var3.getDate();
    boolean var5 = var1.before(var3);
    long var6 = var1.getTime();
    long var7 = var1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date(10L);
    var1.setDate(10);
    var1.setDate(0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.util.Date var3 = new java.util.Date(10L);
    int var4 = var3.getDate();
    boolean var5 = var1.before(var3);
    boolean var7 = var3.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("");
    char[] var5 = new char[] { '#'};
    java.security.Key var6 = var0.engineGetKey("hi!", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    java.lang.String var3 = var0.getSigAlgName();
    boolean[] var4 = var0.getKeyUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    java.security.Principal var4 = var0.getIssuerDN();
    java.util.Collection var5 = var0.getIssuerAlternativeNames();
    
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

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    java.lang.String var4 = var0.getSigAlgName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 0, 100, 100, 10);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    java.security.Principal var4 = var0.getIssuerDN();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkValidity();
      fail("Expected exception of type java.security.cert.CertificateNotYetValidException");
    } catch (java.security.cert.CertificateNotYetValidException e) {
      // Expected exception.
    }
    
    
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


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    java.security.Principal var4 = var0.getIssuerDN();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.get("hi!");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date((-1), 1, (-1), 10, 100, 1);
    java.util.Date var8 = new java.util.Date(10L);
    java.util.Date var10 = new java.util.Date(10L);
    int var11 = var10.getDate();
    boolean var12 = var8.before(var10);
    boolean var13 = var6.after(var10);
    int var14 = var10.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

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


    java.util.Date var1 = new java.util.Date(10L);
    java.util.Date var3 = new java.util.Date(10L);
    int var4 = var3.getDate();
    boolean var5 = var1.before(var3);
    var1.setMonth(70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Enumeration var1 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    sun.security.x509.SerialNumber var4 = var0.getSerialNumberObject();
    
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


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    java.util.Enumeration var2 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date((-1), 1, (-1), 10, 100, 1);
    int var7 = var6.getDay();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var4 = var3.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var5 = var3.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var6 = var3.getPolicyMappingsExtension();
    boolean var7 = var3.hasUnsupportedCriticalExtension();
    var0.engineSetCertificateEntry("", (java.security.cert.Certificate)var3);
    byte[] var10 = new byte[] { };
    com.sun.crypto.provider.JceKeyStore var11 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var12 = var11.engineAliases();
    sun.security.x509.X509CertImpl var14 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var15 = var14.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var16 = var14.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var17 = var14.getPolicyMappingsExtension();
    boolean var18 = var14.hasUnsupportedCriticalExtension();
    var11.engineSetCertificateEntry("", (java.security.cert.Certificate)var14);
    java.security.cert.Certificate[] var20 = new java.security.cert.Certificate[] { var14};
    var0.engineSetKeyEntry("hi!", var10, var20);
    boolean var23 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date(10L);
    int var2 = var1.getDate();
    var1.setTime((-1L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var4 = var3.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var5 = var3.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var6 = var3.getPolicyMappingsExtension();
    boolean var7 = var3.hasUnsupportedCriticalExtension();
    var0.engineSetCertificateEntry("", (java.security.cert.Certificate)var3);
    sun.security.x509.IssuerAlternativeNameExtension var9 = var3.getIssuerAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var3 = var0.getPolicyMappingsExtension();
    boolean var4 = var0.hasUnsupportedCriticalExtension();
    int var5 = var0.getVersion();
    sun.security.x509.BasicConstraintsExtension var6 = var0.getBasicConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var1 = var0.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    java.lang.String var3 = var0.getSigAlgName();
    sun.security.x509.BasicConstraintsExtension var4 = var0.getBasicConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date((-1), 1, (-1), 10, 100, 1);
    java.util.Date var8 = new java.util.Date(10L);
    java.util.Date var10 = new java.util.Date(10L);
    int var11 = var10.getDate();
    boolean var12 = var8.before(var10);
    boolean var13 = var6.after(var10);
    long var14 = var10.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var4 = var3.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var5 = var3.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var6 = var3.getPolicyMappingsExtension();
    boolean var7 = var3.hasUnsupportedCriticalExtension();
    var0.engineSetCertificateEntry("", (java.security.cert.Certificate)var3);
    byte[] var10 = new byte[] { };
    com.sun.crypto.provider.JceKeyStore var11 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var12 = var11.engineAliases();
    sun.security.x509.X509CertImpl var14 = new sun.security.x509.X509CertImpl();
    javax.security.auth.x500.X500Principal var15 = var14.getSubjectX500Principal();
    sun.security.x509.BasicConstraintsExtension var16 = var14.getBasicConstraintsExtension();
    sun.security.x509.PolicyMappingsExtension var17 = var14.getPolicyMappingsExtension();
    boolean var18 = var14.hasUnsupportedCriticalExtension();
    var11.engineSetCertificateEntry("", (java.security.cert.Certificate)var14);
    java.security.cert.Certificate[] var20 = new java.security.cert.Certificate[] { var14};
    var0.engineSetKeyEntry("hi!", var10, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var22 = new sun.security.x509.X509CertInfo(var10);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

}
