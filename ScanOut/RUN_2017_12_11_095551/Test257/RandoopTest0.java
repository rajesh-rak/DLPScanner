
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 100, 1, "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.security.Permissions var0 = new java.security.Permissions();
    boolean var1 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.security.Security.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AlgorithmParameters var2 = java.security.AlgorithmParameters.getInstance("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = new java.lang.String(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getDigAlgFromSigAlg("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var0 = java.security.cert.CertPathBuilder.getDefaultType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "PKIX"+ "'", var0.equals("PKIX"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    java.lang.Object var2 = var0.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.SecureRandom var2 = java.security.SecureRandom.getInstance("PKIX", "PKIX");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "PKIX");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var3 = var2.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("hi!");
    boolean var4 = var0.engineIsCertificateEntry("#");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.String var1 = var0.getResourceBundleName();
    var0.finest("PKIX");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.info("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("hi!");
    var0.engineDeleteEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    java.lang.String var1 = var0.getContentDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = var0.getCharset();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("#", "NativePRNG");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var1 = new char[] { '#'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    java.lang.String var3 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#"+ "'", var2.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "#"+ "'", var3.equals("#"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    java.lang.String var1 = var0.getContentDescription();
    var0.setContentType("hi!");
    var0.setContentType("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    int var2 = var0.nextInt(100);
    java.lang.String var3 = var0.getAlgorithm();
    var0.setSeed(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NativePRNG"+ "'", var3.equals("NativePRNG"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    boolean var1 = var0.getUseParentHandlers();
    var0.entering("PKIX", "");
    java.lang.String var5 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.containsKey((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();
    javax.xml.soap.AttachmentPart var1 = var0.createAttachmentPart();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.SecureRandom var1 = java.security.SecureRandom.getInstance("#");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    int var2 = var0.nextInt(100);
    java.lang.String var3 = var0.getAlgorithm();
    float var4 = var0.nextFloat();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NativePRNG"+ "'", var3.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.30988848f);

  }

}
