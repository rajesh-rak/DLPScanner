
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.getAlgorithmId("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isBlockOrSF("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Provider var1 = java.security.Security.getProvider("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var2 = sun.security.x509.AlgorithmId.makeSigAlg("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "with"+ "'", var2.equals("with"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getStandardDigestName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "with");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.get("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.getAlgorithmId("with");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.Security.setProperty("with", "with");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getEncAlgFromSigAlg("with");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.security.Provider[] var3 = java.security.Security.getProviders((java.util.Map)var0);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var0.containsKey(var4);
    java.util.Enumeration var6 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.List var3 = sun.security.jca.GetInstance.getServices("hi!", "hi!");
    java.util.List var4 = sun.security.jca.GetInstance.getServices(var3);
    java.util.List var5 = sun.security.jca.GetInstance.getServices("", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.security.Provider[] var3 = java.security.Security.getProviders((java.util.Map)var0);
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var3 = var0.clone();
    java.security.Provider[] var4 = java.security.Security.getProviders((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Enumeration var4 = var3.keys();
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var3);
    java.util.Hashtable var7 = new java.util.Hashtable(1);
    boolean var8 = var3.equals((java.lang.Object)var7);
    java.lang.Object var9 = var0.remove((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("", "with", "with");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    java.util.Collection var2 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.Security.setProperty("hi!", "hi!");

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();
    java.util.LinkedList var2 = var0.get("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    sun.security.jca.ProviderList var1 = sun.security.jca.ProviderList.newList(var0);
    int var3 = var1.getIndex("{}");
    java.util.List var7 = sun.security.jca.GetInstance.getServices("hi!", "hi!");
    java.util.List var8 = sun.security.jca.GetInstance.getServices(var7);
    java.util.List var9 = var1.getServices("with", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    sun.security.jca.ProviderList var1 = sun.security.jca.ProviderList.newList(var0);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[sun.security.provider.Sun, sun.security.rsa.SunRsaSign, sun.security.ec.SunEC, com.sun.net.ssl.internal.ssl.Provider, com.sun.crypto.provider.SunJCE, sun.security.jgss.SunProvider, com.sun.security.sasl.Provider, org.jcp.xml.dsig.internal.dom.XMLDSigRI, sun.security.smartcardio.SunPCSC, apple.security.AppleProvider]"+ "'", var2.equals("[sun.security.provider.Sun, sun.security.rsa.SunRsaSign, sun.security.ec.SunEC, com.sun.net.ssl.internal.ssl.Provider, com.sun.crypto.provider.SunJCE, sun.security.jgss.SunProvider, com.sun.security.sasl.Provider, org.jcp.xml.dsig.internal.dom.XMLDSigRI, sun.security.smartcardio.SunPCSC, apple.security.AppleProvider]"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Enumeration var3 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
