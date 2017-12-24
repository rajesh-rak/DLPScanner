
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var1.getDisplayName(false, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var6 = new java.util.Date((-1), 10, 100, 1, 100, 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 2);
    var5.setMonth((-1));
    var5.setHours((-1));
    var5.setSeconds(100);
    var5.setMonth((-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 2);
    var5.setMonth(2);
    int var8 = var5.getDate();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var1 = var0.getTBSCertificate();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 1.0f);
    java.util.Enumeration var3 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    boolean var4 = var2.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 2);
    var5.setMonth((-1));
    var5.setHours((-1));
    var5.setSeconds(100);
    java.lang.String var12 = var5.toGMTString();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var2 = var0.getExtensionValue("Greenwich Mean Time");
    sun.security.x509.SerialNumber var3 = var0.getSerialNumberObject();
    java.security.PublicKey var4 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 2);
    int var6 = var5.getDay();
    java.lang.Object var7 = var5.clone();
    int var8 = var5.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 2);
    var5.setMonth(2);
    java.lang.String var8 = var5.toLocaleString();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date(2, 0, 2, 1, 2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)'#');
    javax.security.auth.x500.X500Principal var3 = var0.getSubjectX500Principal();
    byte[] var5 = var0.getExtensionValue("");
    byte[] var6 = var0.getSubjectKeyIdentifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("9 Dec 1898 17:33:40 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getNonCriticalExtensionOIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var2 = var0.equals((java.lang.Object)'#');
    javax.security.auth.x500.X500Principal var3 = var0.getSubjectX500Principal();
    byte[] var5 = var0.getExtensionValue("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    java.lang.String var4 = var1.getDisplayName(true, 1);
    java.lang.String var5 = var1.getDisplayName();
    java.lang.String var6 = var1.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Greenwich Mean Time"+ "'", var4.equals("Greenwich Mean Time"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Greenwich Mean Time"+ "'", var5.equals("Greenwich Mean Time"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Greenwich Mean Time"+ "'", var6.equals("Greenwich Mean Time"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var2 = var0.getExtensionValue("Greenwich Mean Time");
    java.security.PublicKey var3 = var0.getPublicKey();
    java.lang.String var4 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "X.509"+ "'", var4.equals("X.509"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var2 = var0.getExtensionValue("Greenwich Mean Time");
    java.lang.String var3 = var0.getSigAlgName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
