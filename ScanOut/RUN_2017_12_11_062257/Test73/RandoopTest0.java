
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var2 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var0);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    javax.security.auth.x500.X500Principal var4 = var0.getIssuerX500Principal();
    boolean var6 = sun.security.x509.X509CertImpl.isSelfSigned((java.security.cert.X509Certificate)var0, "hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var2 = sun.security.x509.X509CertImpl.getSubjectX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    var0.putAll((java.util.Map)var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    sun.security.x509.SubjectKeyIdentifierExtension var3 = var0.getSubjectKeyIdentifierExtension();
    java.lang.String var4 = var0.toString();
    java.util.Collection var5 = var0.getIssuerAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    sun.security.x509.SubjectKeyIdentifierExtension var3 = var0.getSubjectKeyIdentifierExtension();
    java.util.Collection var4 = sun.security.x509.X509CertImpl.getIssuerAlternativeNames((java.security.cert.X509Certificate)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    sun.security.x509.X509CertImpl var5 = new sun.security.x509.X509CertImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.set("", (java.lang.Object)var5);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    boolean[] var4 = var0.getIssuerUniqueID();
    java.security.Principal var5 = var0.getIssuerDN();
    sun.security.x509.SerialNumber var6 = var0.getSerialNumberObject();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    int var4 = var0.getBasicConstraints();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    java.lang.String var4 = var0.getName();
    javax.security.auth.x500.X500Principal var5 = var0.getSubjectX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "x509"+ "'", var4.equals("x509"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var4 = var0.put((java.lang.Object)100, (java.lang.Object)false);
    int var5 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var4 = var0.put((java.lang.Object)100, (java.lang.Object)false);
    java.lang.String var5 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "{100=false}"+ "'", var5.equals("{100=false}"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.util.Hashtable var2 = new java.util.Hashtable();
    java.util.Set var3 = var2.entrySet();
    java.lang.Object var5 = var0.put((java.lang.Object)var2, (java.lang.Object)(-1.0f));
    int var6 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    boolean var3 = var0.equals((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    sun.security.x509.SubjectAlternativeNameExtension var2 = var0.getSubjectAlternativeNameExtension();
    java.security.PublicKey var3 = var0.getPublicKey();
    java.util.Collection var4 = var0.getSubjectAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    java.lang.Object var3 = var0.get((java.lang.Object)'a');
    java.util.Enumeration var4 = var0.keys();
    java.util.Hashtable var5 = new java.util.Hashtable();
    java.util.Set var6 = var5.entrySet();
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var6);
    boolean var8 = var0.containsKey((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var4 = new java.lang.Object[] { 0.0d};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Hashtable var6 = new java.util.Hashtable();
    java.util.Set var7 = var6.entrySet();
    var2.addElement((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    java.util.Collection var3 = var0.getSubjectAlternativeNames();
    sun.security.x509.PolicyConstraintsExtension var4 = var0.getPolicyConstraintsExtension();
    java.security.Principal var5 = var0.getIssuerDN();
    
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


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    byte[] var1 = var0.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    java.util.Collection var3 = var0.getSubjectAlternativeNames();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var4 = new java.lang.Object[] { 0.0d};
    java.lang.Object[] var5 = var2.toArray(var4);
    java.util.Hashtable var7 = new java.util.Hashtable();
    java.util.Set var8 = var7.entrySet();
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var8);
    boolean var10 = var2.addAll(0, (java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.AuthorityKeyIdentifierExtension var1 = var0.getAuthorityKeyIdentifierExtension();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    java.util.Collection var3 = var0.getSubjectAlternativeNames();
    java.security.PublicKey var4 = var0.getPublicKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
