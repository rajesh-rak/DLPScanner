
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.System.runFinalization();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    boolean var1 = sun.security.x509.X509CertImpl.isSelfIssued((java.security.cert.X509Certificate)var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var0 = java.lang.System.nanoTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512956880441160000L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var0 = sun.misc.VM.getFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.org.apache.xalan.internal.utils.ObjectFactory var0 = new com.sun.org.apache.xalan.internal.utils.ObjectFactory();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getOffset((-1), (-1), (-1), 0, 0, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.VM.addFinalRefCount(0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
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

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ClassLoader var0 = com.sun.org.apache.xalan.internal.utils.ObjectFactory.findClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.misc.VM.addFinalRefCount(10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URI var4 = new java.net.URI("", "", "", "");
      fail("Expected exception of type java.net.URISyntaxException");
    } catch (java.net.URISyntaxException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var2 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getOffsetsByWall(10L, var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URI var3 = new java.net.URI("", "", "hi!");
      fail("Expected exception of type java.net.URISyntaxException");
    } catch (java.net.URISyntaxException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    boolean var3 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var0, "");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.System.gc();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgOID();
    boolean var3 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var0, "hi!");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var0 = new java.util.Date();
    var0.setTime((-1L));
    java.util.Date var3 = new java.util.Date();
    var3.setTime((-1L));
    sun.security.x509.CertificateValidity var6 = new sun.security.x509.CertificateValidity(var0, var3);
    int var7 = var3.getTimezoneOffset();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var2 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.getOffsetsByWall(100L, var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 161);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var0 = new java.util.Date();
    var0.setTime((-1L));
    java.util.Date var3 = new java.util.Date();
    var3.setTime((-1L));
    sun.security.x509.CertificateValidity var6 = new sun.security.x509.CertificateValidity(var0, var3);
    boolean var8 = var3.equals((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    int var0 = sun.misc.VM.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "", "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.util.Date var1 = new java.util.Date();
    var1.setTime((-1L));
    java.util.Date var4 = new java.util.Date();
    var4.setTime((-1L));
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var1, var4);
    boolean var8 = var0.inDaylightTime(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.getOffset(0, 1, 1, 100, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    boolean var2 = var0.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    byte[] var1 = var0.getEncodedInfo();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var0 = new java.util.Date();
    var0.setTime((-1L));
    var0.setYear(100);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib.dylib"+ "'", var1.equals("lib.dylib"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("lib.dylib", "lib.dylib");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    java.lang.String var3 = var0.getSigAlgOID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    java.lang.String var3 = var0.getSigAlgOID();
    java.util.Collection var4 = sun.security.x509.X509CertImpl.getSubjectAlternativeNames((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var3 = var0.getTBSCertificate();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyConstraintsExtension var1 = var0.getPolicyConstraintsExtension();
    sun.security.x509.BasicConstraintsExtension var2 = var0.getBasicConstraintsExtension();
    sun.security.x509.SubjectKeyIdentifierExtension var3 = var0.getSubjectKeyIdentifierExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.util.Date var0 = new java.util.Date();
    var0.setTime((-1L));
    java.util.Date var3 = new java.util.Date();
    var3.setTime((-1L));
    sun.security.x509.CertificateValidity var6 = new sun.security.x509.CertificateValidity(var0, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.valid();
      fail("Expected exception of type java.security.cert.CertificateExpiredException");
    } catch (java.security.cert.CertificateExpiredException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("lib.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
