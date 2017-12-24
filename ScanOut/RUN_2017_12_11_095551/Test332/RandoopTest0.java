
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    boolean var9 = var2.equals((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var2 = new byte[] { (byte)0, (byte)(-1)};
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

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    boolean var9 = var5.contains((java.lang.Object)10L);
    java.util.Set var10 = var5.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(100, "{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var11 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    var14.clear();
    var11.putAll((java.util.Map)var14);
    java.lang.Object var17 = var14.clone();
    boolean var19 = var14.equals((java.lang.Object)(-1L));
    boolean var20 = var2.containsValue((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var11 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    var14.clear();
    var11.putAll((java.util.Map)var14);
    java.lang.Object var17 = var14.clone();
    java.lang.Object var18 = var8.remove((java.lang.Object)var14);
    java.util.Collection var19 = var14.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    boolean var9 = var5.contains((java.lang.Object)10L);
    java.util.Collection var10 = var5.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var1 = new byte[] { (byte)100};
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

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var8 = new java.util.Hashtable(100, 1.0f);
    var8.clear();
    var5.putAll((java.util.Map)var8);
    java.util.Hashtable var11 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var5);
    java.util.Hashtable var12 = new java.util.Hashtable((java.util.Map)var5);
    java.util.Hashtable var15 = new java.util.Hashtable(100, 1.0f);
    var15.clear();
    java.lang.Object var17 = var5.remove((java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var19 = new com.sun.jndi.ldap.LdapCtx("hi!", "hi!", 10, var5, false);
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.rmi.server.RMIFailureHandler var0 = java.rmi.server.RMISocketFactory.getFailureHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgOID();
    sun.security.x509.SerialNumber var2 = var0.getSerialNumberObject();
    java.util.List var3 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var0.getEncodedInternal();
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    boolean var9 = var5.contains((java.lang.Object)10L);
    boolean var11 = var5.containsKey((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.lang.Object var8 = var5.clone();
    java.util.Hashtable var11 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var14 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var17 = new java.util.Hashtable(100, 1.0f);
    var17.clear();
    var14.putAll((java.util.Map)var17);
    java.util.Hashtable var20 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var14);
    java.util.Hashtable var21 = new java.util.Hashtable((java.util.Map)var14);
    java.util.Hashtable var24 = new java.util.Hashtable(100, 1.0f);
    var24.clear();
    java.lang.Object var26 = var14.remove((java.lang.Object)var24);
    boolean var27 = var11.containsKey((java.lang.Object)var14);
    boolean var28 = var5.contains((java.lang.Object)var11);
    java.util.Set var29 = var5.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getName();
    sun.security.x509.PolicyConstraintsExtension var2 = var0.getPolicyConstraintsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "x509"+ "'", var1.equals("x509"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Set var10 = var9.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var10 = new java.util.Hashtable(100, 1.0f);
    var2.putAll((java.util.Map)var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    var2.clear();
    java.lang.String var4 = var2.toString();
    java.lang.Object var6 = var2.remove((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    sun.security.x509.PolicyMappingsExtension var1 = var0.getPolicyMappingsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getName();
    sun.security.x509.CRLDistributionPointsExtension var2 = var0.getCRLDistributionPointsExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "x509"+ "'", var1.equals("x509"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.lang.Object var9 = var2.get((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(100, 1.0f);
    var5.clear();
    var2.putAll((java.util.Map)var5);
    java.lang.Object var8 = var5.clone();
    java.lang.String var9 = var5.toString();
    java.util.Hashtable var10 = new java.util.Hashtable((java.util.Map)var5);
    java.util.Hashtable var13 = new java.util.Hashtable(100, 1.0f);
    java.util.Hashtable var16 = new java.util.Hashtable(100, 1.0f);
    var16.clear();
    var13.putAll((java.util.Map)var16);
    java.util.Hashtable var19 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var13);
    boolean var20 = var10.contains((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "{}"+ "'", var9.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.util.Collection var1 = sun.security.x509.X509CertImpl.getSubjectAlternativeNames((java.security.cert.X509Certificate)var0);
    byte[] var2 = var0.getSigAlgParams();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgOID();
    java.util.Enumeration var2 = var0.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var3 = sun.security.x509.X509CertImpl.getEncodedInternal((java.security.cert.Certificate)var0);
      fail("Expected exception of type java.security.cert.CertificateEncodingException");
    } catch (java.security.cert.CertificateEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.rmi.transport.proxy.RMIMasterSocketFactory var0 = new sun.rmi.transport.proxy.RMIMasterSocketFactory();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.security.x509.X509CertImpl var0 = new sun.security.x509.X509CertImpl();
    java.lang.String var1 = var0.getSigAlgOID();
    sun.security.x509.SerialNumber var2 = var0.getSerialNumberObject();
    java.util.List var3 = sun.security.x509.X509CertImpl.getExtendedKeyUsage((java.security.cert.X509Certificate)var0);
    sun.security.x509.AuthorityKeyIdentifierExtension var4 = var0.getAuthorityKeyIdentifierExtension();
    
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
