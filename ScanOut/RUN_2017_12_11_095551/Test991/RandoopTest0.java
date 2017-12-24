
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)10, (byte)1};
    java.lang.String var3 = sun.security.util.Debug.toString(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0a:01"+ "'", var3.equals("0a:01"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '%');

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var1 = sun.security.util.Debug.isOn("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("0a:01", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var13 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.valid();
      fail("Expected exception of type java.security.cert.CertificateExpiredException");
    } catch (java.security.cert.CertificateExpiredException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var13 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    int var15 = var13.getSeconds();
    var13.setMinutes(100);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.util.Debug.println("", "0a:01");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var13 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    java.util.Date var21 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    boolean var22 = var13.before(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var1 = new byte[] { (byte)0};
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

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("E");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var13 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    var13.setDate(100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    byte[] var1 = var0.getEncodedInfo();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var5 = new java.util.Date(10, 0, 0, 0, 1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var13 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var14 = new sun.security.x509.CertificateValidity(var6, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.set("0a:01", (java.lang.Object)'4');
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('4');
    java.lang.String var3 = var0.getExponentSeparator();
    var0.setInternationalCurrencySymbol("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "E"+ "'", var3.equals("E"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(59, 10.0f);
    int var3 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(59, 10.0f);
    var2.clear();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('4');
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPatternSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == ';');

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('4');
    var0.setMonetaryDecimalSeparator('4');
    var0.setPerMill('%');

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Throwable var1 = new java.lang.Throwable("E");

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("0a:01", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("0a:01");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Date var5 = new java.util.Date(0, 59, 0, 0, 0);
    java.util.Date var12 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var19 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var20 = new sun.security.x509.CertificateValidity(var12, var19);
    java.util.Date var27 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var34 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var35 = new sun.security.x509.CertificateValidity(var27, var34);
    boolean var36 = var19.before(var34);
    sun.security.x509.CertificateValidity var37 = new sun.security.x509.CertificateValidity(var5, var19);
    java.util.Date var44 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var51 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var52 = new sun.security.x509.CertificateValidity(var44, var51);
    java.util.Date var59 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var66 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var67 = new sun.security.x509.CertificateValidity(var59, var66);
    java.util.Date var74 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    java.util.Date var81 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    sun.security.x509.CertificateValidity var82 = new sun.security.x509.CertificateValidity(var74, var81);
    boolean var83 = var66.before(var81);
    var52.valid(var66);
    boolean var85 = var5.after(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    long var6 = java.util.Date.UTC((-1), 0, 0, 1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2240607001000L));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get("hi!");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }

  }

}
