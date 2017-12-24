
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(10, "hi!", 10, 0, 100, 1, 1, 100, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "hi!", 1, 10, 10, 1, 0, (-1), 1, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(54, 100, 0, 54, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var6 = new java.util.Date((-1), 10, 1);
    boolean var7 = var2.inDaylightTime(var6);
    var2.setRawOffset(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    boolean var4 = var0.engineContainsAlias("31 Oct 1899 18:30:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("31 Oct 1899 18:30:00 GMT");
    sun.net.www.MimeEntry var4 = var0.findByDescription("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var6 = new java.util.Date((-1), 10, 1);
    boolean var7 = var2.inDaylightTime(var6);
    java.lang.Object var8 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    int var3 = var2.getRawOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("hi!");
    java.util.Enumeration var3 = var0.elements();
    sun.net.www.MimeEntry var5 = var0.findByFileName("hi!");
    sun.net.www.MimeEntry var7 = var0.find("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var2 = new byte[] { (byte)100, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl(var2);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var6 = new java.util.Date((-1), 10, 1);
    boolean var7 = var2.inDaylightTime(var6);
    java.lang.String var8 = var6.toGMTString();
    var6.setHours((-1));
    var6.setMinutes((-1));
    int var13 = var6.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("hi!");
    int var3 = var0.getSize();
    var0.load();
    java.lang.String var6 = var0.getContentTypeFor("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("hi!");
    boolean var4 = var0.save("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Collection var3 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.util.SimpleTimeZone var4 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var8 = new java.util.Date((-1), 10, 1);
    boolean var9 = var4.inDaylightTime(var8);
    var4.setID("hi!");
    boolean var12 = var1.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var6 = new java.util.Date((-1), 10, 1);
    boolean var7 = var2.inDaylightTime(var6);
    int var8 = var6.getMinutes();
    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var15 = new java.util.Date((-1), 10, 1);
    boolean var16 = var11.inDaylightTime(var15);
    java.util.Date var20 = new java.util.Date((-1), 10, 1);
    boolean var21 = var11.inDaylightTime(var20);
    sun.security.x509.CertificateValidity var22 = new sun.security.x509.CertificateValidity(var6, var20);
    int var23 = var6.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var6 = new java.util.Date((-1), 10, 1);
    boolean var7 = var2.inDaylightTime(var6);
    java.lang.String var8 = var6.toGMTString();
    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var15 = new java.util.Date((-1), 10, 1);
    boolean var16 = var11.inDaylightTime(var15);
    int var17 = var15.getMinutes();
    java.util.SimpleTimeZone var20 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var24 = new java.util.Date((-1), 10, 1);
    boolean var25 = var20.inDaylightTime(var24);
    java.util.Date var29 = new java.util.Date((-1), 10, 1);
    boolean var30 = var20.inDaylightTime(var29);
    sun.security.x509.CertificateValidity var31 = new sun.security.x509.CertificateValidity(var15, var29);
    sun.security.x509.CertificateValidity var32 = new sun.security.x509.CertificateValidity(var6, var15);
    java.util.SimpleTimeZone var35 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var39 = new java.util.Date((-1), 10, 1);
    boolean var40 = var35.inDaylightTime(var39);
    java.lang.String var41 = var39.toGMTString();
    java.util.SimpleTimeZone var44 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var48 = new java.util.Date((-1), 10, 1);
    boolean var49 = var44.inDaylightTime(var48);
    int var50 = var48.getMinutes();
    java.util.SimpleTimeZone var53 = new java.util.SimpleTimeZone(10, "hi!");
    java.util.Date var57 = new java.util.Date((-1), 10, 1);
    boolean var58 = var53.inDaylightTime(var57);
    java.util.Date var62 = new java.util.Date((-1), 10, 1);
    boolean var63 = var53.inDaylightTime(var62);
    sun.security.x509.CertificateValidity var64 = new sun.security.x509.CertificateValidity(var48, var62);
    sun.security.x509.CertificateValidity var65 = new sun.security.x509.CertificateValidity(var39, var48);
    var32.valid(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

}
