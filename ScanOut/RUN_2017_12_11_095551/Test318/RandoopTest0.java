
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var1 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var2 = new sun.security.x509.X509CertInfo(var1);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var6 = java.util.Date.UTC(10, (-1), 1, 10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1896097799000L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    var11.setTime(100L);
    int var15 = var11.getDay();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]", "Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]", "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    java.lang.String var13 = var12.toString();
    java.lang.String var14 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"+ "'", var13.equals("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"+ "'", var14.equals("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var1 = var0.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "India Standard Time"+ "'", var1.equals("India Standard Time"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("India Standard Time");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

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
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    java.util.Date var18 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var24 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var25 = new sun.security.x509.CertificateValidity(var18, var24);
    sun.security.x509.CertificateValidity var26 = new sun.security.x509.CertificateValidity(var5, var24);
    int var27 = var24.getDay();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


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

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "hi!", (-1), 0, 3, 4, 3, 2, 3, 3, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("India Standard Time");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "info"+ "'", var1.equals("info"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    java.util.Date var18 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var24 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var25 = new sun.security.x509.CertificateValidity(var18, var24);
    sun.security.x509.CertificateValidity var26 = new sun.security.x509.CertificateValidity(var5, var24);
    java.util.Date var32 = new java.util.Date(1, 10, (-1), (-1), (-1));
    boolean var33 = var24.equals((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "India Standard Time");
    var2.setDSTSavings(1);
    int var6 = var2.getOffset(10L);
    boolean var8 = var2.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    java.util.Date var18 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var24 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var25 = new sun.security.x509.CertificateValidity(var18, var24);
    sun.security.x509.CertificateValidity var26 = new sun.security.x509.CertificateValidity(var5, var24);
    var24.setMinutes(4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "hi!", (-1), 4, 3, 10, 10, 4, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    long var6 = java.util.Date.UTC(0, 3, 100, 2, 0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2192651998000L));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    var5.setTime((-1896097799000L));
    long var8 = var5.getTime();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "India Standard Time");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getDisplayName(false, 2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "India Standard Time");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(100, 2, 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "India Standard Time");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset(1, 100, 0, 1, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Date var5 = new java.util.Date(1, 10, (-1), (-1), (-1));
    java.util.Date var11 = new java.util.Date(1, 10, (-1), (-1), (-1));
    sun.security.x509.CertificateValidity var12 = new sun.security.x509.CertificateValidity(var5, var11);
    java.lang.String var13 = var12.toString();
    java.util.Enumeration var14 = var12.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"+ "'", var13.equals("Validity: [From: Tue Oct 29 22:59:00 IST 1901,\n               To: Tue Oct 29 22:59:00 IST 1901]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.util.Enumeration var1 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "India Standard Time");
    var2.setStartRule(1, 4, 4, 1, false);

  }

}
