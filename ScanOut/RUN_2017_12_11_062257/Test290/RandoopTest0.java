
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear((-1));
    int var3 = var0.getYear();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "hi!", 0, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = sun.net.www.ParseUtil.encodePath("", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.File[] var0 = java.io.File.listRoots();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    var1.setYear((-1));
    boolean var4 = var0.before(var1);
    int var5 = var0.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    var1.setYear((-1));
    boolean var4 = var0.before(var1);
    int var5 = var0.getDay();
    var0.setHours(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    var1.setYear((-1));
    boolean var4 = var0.before(var1);
    java.lang.String var5 = var1.toLocaleString();
    java.util.Date var6 = new java.util.Date();
    var6.setYear((-1));
    int var9 = var1.compareTo(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("11 Dec, 1899 7:07:05 AM", "", 1, "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var5 = new java.util.Date(7, (-1), (-1), 1, 1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("11 Dec, 1899 7:07:05 AM", "hi!", "11 Dec, 1899 7:07:05 AM");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear((-1));
    var0.setDate((-1));
    int var5 = var0.getMinutes();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("11 Dec, 1899 7:07:05 AM");
    java.util.Enumeration var3 = var0.engineAliases();
    boolean var5 = var0.engineIsKeyEntry("");
    boolean var7 = var0.engineIsCertificateEntry("11 Dec, 1899 7:07:05 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toString();
    java.util.Date var2 = new java.util.Date();
    java.util.Date var3 = new java.util.Date();
    var3.setYear((-1));
    boolean var6 = var2.before(var3);
    sun.security.x509.CertificateValidity var7 = new sun.security.x509.CertificateValidity(var0, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.delete("");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("11 Dec, 1899 7:07:05 AM");
    java.util.Enumeration var3 = var0.engineAliases();
    boolean var5 = var0.engineIsKeyEntry("");
    char[] var10 = new char[] { '#', 'a', '4'};
    java.security.Key var11 = var0.engineGetKey("hi!", var10);
    int var12 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "", "Mon Dec 11 07:07:05 IST 2017");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.File var1 = new java.io.File("11 Dec, 1899 7:07:05 AM");
    var1.deleteOnExit();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var6 = java.util.Date.UTC(7, 1, 10, 1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1984690200000L));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.File var1 = new java.io.File("11 Dec, 1899 7:07:05 AM");
    boolean var4 = var1.setReadable(true, false);
    java.io.File var5 = var1.getAbsoluteFile();
    boolean var7 = var5.setReadable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("hi!", "11 Dec, 1899 7:07:05 AM", "Mon Dec 11 07:07:05 IST 2017");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    var1.setYear((-1));
    boolean var4 = var0.before(var1);
    int var5 = var0.getDay();
    java.lang.Object var6 = var0.clone();
    java.util.Date var7 = new java.util.Date();
    java.util.Date var8 = new java.util.Date();
    var8.setYear((-1));
    boolean var11 = var7.before(var8);
    int var12 = var7.getDay();
    sun.security.x509.CertificateValidity var13 = new sun.security.x509.CertificateValidity(var0, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.toString();
    sun.security.x509.SubjectKeyIdentifierExtension var2 = var0.getSubjectKeyIdentifierExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityInfoAccessExtension var1 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.NameConstraintsExtension var2 = var0.getNameConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

}
