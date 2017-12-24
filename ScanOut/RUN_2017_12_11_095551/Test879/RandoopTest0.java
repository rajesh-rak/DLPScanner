
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 10.0f);
    boolean var4 = var2.equals((java.lang.Object)'4');
    java.lang.Object var5 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var5 = new java.util.Hashtable(10, 10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var7 = new com.sun.jndi.ldap.LdapCtx("hi!", "", 100, var5, false);
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.KeyAgreement var1 = javax.crypto.KeyAgreement.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 10.0f);
    java.util.Set var3 = var2.entrySet();
    var2.clear();
    java.util.Set var5 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 10.0f);
    java.util.Set var3 = var2.entrySet();
    var2.clear();
    int var5 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);

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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("{}");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate[] var4 = var0.engineGetCertificateChain("hi!");
    boolean var6 = var0.engineIsCertificateEntry("hi!");
    boolean var8 = var0.engineIsKeyEntry("hi!");
    int var9 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("{}", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    java.security.cert.Certificate[] var4 = var0.engineGetCertificateChain("hi!");
    int var5 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 10.0f);
    java.util.Collection var3 = var2.values();
    java.util.Hashtable var6 = new java.util.Hashtable(10, 10.0f);
    java.util.Collection var7 = var6.values();
    var2.putAll((java.util.Map)var6);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    char[] var4 = new char[] { };
    java.security.Key var5 = var0.engineGetKey("{}", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var2, var3);
    boolean var6 = var0.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    boolean var3 = var1.isEmpty();
    java.util.Hashtable var5 = new java.util.Hashtable(10);
    java.lang.String var6 = var5.toString();
    boolean var7 = var1.contains((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var2 = new byte[] { (byte)1, (byte)0};
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

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var3 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var4 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var6 = new byte[] { };
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var4.engineSetKeyEntry("", var6, var7);
    java.lang.Object[] var9 = var3.toArray((java.lang.Object[])var7);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.get("");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(-1.0f), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { };
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var3.engineSetKeyEntry("", var5, var6);
    java.lang.Object[] var8 = var2.toArray((java.lang.Object[])var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var3 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var4 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var6 = new byte[] { };
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var4.engineSetKeyEntry("", var6, var7);
    java.lang.Object[] var9 = var3.toArray((java.lang.Object[])var7);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, var3);
    boolean var11 = var10.isCritical();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var3 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var4 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var6 = new byte[] { };
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var4.engineSetKeyEntry("", var6, var7);
    java.lang.Object[] var9 = var3.toArray((java.lang.Object[])var7);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, var3);
    boolean var12 = var3.remove((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var3 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var4 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var6 = new byte[] { };
    java.security.cert.Certificate[] var7 = new java.security.cert.Certificate[] { };
    var4.engineSetKeyEntry("", var6, var7);
    java.lang.Object[] var9 = var3.toArray((java.lang.Object[])var7);
    sun.security.x509.ExtendedKeyUsageExtension var10 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, var3);
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "ObjectId: 2.5.29.37 Criticality=true\nExtendedKeyUsages [\n  \n]\n"+ "'", var11.equals("ObjectId: 2.5.29.37 Criticality=true\nExtendedKeyUsages [\n  \n]\n"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { };
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var3.engineSetKeyEntry("", var5, var6);
    java.lang.Object[] var8 = var2.toArray((java.lang.Object[])var6);
    var2.addElement((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Hashtable var5 = new java.util.Hashtable(10, 10.0f);
    java.util.Collection var6 = var5.values();
    java.util.Hashtable var9 = new java.util.Hashtable(10, 10.0f);
    java.util.Collection var10 = var9.values();
    var5.putAll((java.util.Map)var9);
    boolean var12 = var1.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
