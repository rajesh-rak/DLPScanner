
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl(var2);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.X509CertImpl var1 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.security.auth.x500.X500Principal var2 = sun.security.x509.X509CertImpl.getIssuerX500Principal((java.security.cert.X509Certificate)var0);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(short)(-1), (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    int var1 = var0.getVersion();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.get("");
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var2.subList(1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    var2.trimToSize();
    boolean var4 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread[] var2 = new java.lang.Thread[] { };
    int var3 = var1.enumerate(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    int var5 = var2.indexOf((java.lang.Object)'a', 100);
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    var2.trimToSize();
    java.util.Enumeration var4 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    var1.suspend();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    var4.suspend();
    boolean var6 = var1.parentOf(var4);
    var1.setDaemon(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    var1.suspend();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    var4.suspend();
    boolean var6 = var1.parentOf(var4);
    int var7 = var1.activeCount();
    var1.interrupt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    var2.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Set var1 = var0.getCriticalExtensionOIDs();
    javax.security.auth.x500.X500Principal var2 = var0.getIssuerX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Vector var4 = new java.util.Vector(0, 0);
    int var7 = var4.indexOf((java.lang.Object)'a', 100);
    var4.clear();
    boolean var9 = var1.containsKey((java.lang.Object)var4);
    java.util.Set var10 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    int var2 = var1.activeGroupCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.SubjectAlternativeNameExtension var1 = var0.getSubjectAlternativeNameExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    int var1 = var0.getVersion();
    boolean var2 = var0.hasUnsupportedCriticalExtension();
    sun.security.x509.PolicyConstraintsExtension var3 = var0.getPolicyConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.X509CertImpl var1 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    java.util.Collection var2 = var0.getIssuerAlternativeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)'#', (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    var1.suspend();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    var4.suspend();
    boolean var6 = var1.parentOf(var4);
    java.lang.ThreadGroup var8 = new java.lang.ThreadGroup("");
    var8.suspend();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("");
    var11.suspend();
    boolean var13 = var8.parentOf(var11);
    java.lang.ThreadGroup[] var14 = new java.lang.ThreadGroup[] { var11};
    int var16 = var4.enumerate(var14, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.rmi.server.RMIFailureHandler var0 = java.rmi.server.RMISocketFactory.getFailureHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    int var1 = var0.getVersion();
    sun.security.x509.AuthorityInfoAccessExtension var2 = var0.getAuthorityInfoAccessExtension();
    sun.security.x509.SerialNumber var3 = var0.getSerialNumberObject();
    java.util.Date var4 = var0.getNotBefore();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.util.ListIterator var3 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Vector var4 = new java.util.Vector(0, 0);
    int var7 = var4.indexOf((java.lang.Object)'a', 100);
    var4.clear();
    boolean var9 = var1.containsKey((java.lang.Object)var4);
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.X509CertImpl var1 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var0);
    sun.security.x509.X509CertImpl var2 = sun.security.x509.X509CertImpl.toImpl((java.security.cert.X509Certificate)var1);
    javax.security.auth.x500.X500Principal var3 = var2.getIssuerX500Principal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
