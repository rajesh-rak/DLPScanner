
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AlgorithmParameters var1 = java.security.AlgorithmParameters.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.cert.CertificateFactory var2 = java.security.cert.CertificateFactory.getInstance("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.Security.removeProvider("hi!");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = sun.security.x509.AlgorithmId.getDigAlgFromSigAlg("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("hi!", "");
    java.util.List var3 = sun.security.jca.GetInstance.getServices(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("hi!", "NativePRNG", "NativePRNG");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Set var1 = java.security.Security.getAlgorithms("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.List var3 = sun.security.jca.GetInstance.getServices("NativePRNG", "hi!");
    java.util.List var4 = sun.security.jca.GetInstance.getServices("NativePRNG", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    java.lang.String var2 = var0.getAlgorithm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3109486645858677d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NativePRNG"+ "'", var2.equals("NativePRNG"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.lang.String var1 = var0.getAlgorithm();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.nextInt(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "NativePRNG"+ "'", var1.equals("NativePRNG"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.lang.String var1 = var0.getAlgorithm();
    boolean var2 = var0.nextBoolean();
    double var3 = var0.nextGaussian();
    var0.setSeed((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "NativePRNG"+ "'", var1.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.251478828654253d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    boolean var2 = var0.equals((java.lang.Object)(-1.0f));
    java.security.AlgorithmParameters var3 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    java.lang.String var1 = var0.getAlgorithm();
    boolean var2 = var0.nextBoolean();
    byte[] var3 = new byte[] { };
    var0.nextBytes(var3);
    boolean var5 = var0.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "NativePRNG"+ "'", var1.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var3 = var1.removeFromEnvironment("NativePRNG");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.unbind("");
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.AlgorithmId var1 = sun.security.x509.AlgorithmId.get("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.List var3 = sun.security.jca.GetInstance.getServices("hi!", "");
    java.util.List var4 = sun.security.jca.GetInstance.getServices("NativePRNG", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var3 = var1.removeFromEnvironment("NativePRNG");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.directory.DirContext var5 = var1.getSchemaClassDefinition("");
      fail("Expected exception of type javax.naming.OperationNotSupportedException");
    } catch (javax.naming.OperationNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.security.SecureRandom var3 = new java.security.SecureRandom();
    java.lang.String var4 = var3.getAlgorithm();
    float var5 = var3.nextFloat();
    java.lang.Object var6 = var2.remove((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NativePRNG"+ "'", var4.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2966503f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    sun.security.jca.ProviderList var1 = sun.security.jca.ProviderList.newList(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    java.lang.Object var3 = var1.removeFromEnvironment("NativePRNG");
    java.util.Hashtable var4 = var1.getEnvironment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.jndi.toolkit.dir.HierMemDirCtx var1 = new com.sun.jndi.toolkit.dir.HierMemDirCtx(false);
    javax.naming.NamingEnumeration var3 = var1.listBindings("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();
    double var1 = var0.nextGaussian();
    byte[] var5 = new byte[] { (byte)100, (byte)100, (byte)1};
    var0.nextBytes(var5);
    java.security.SecureRandom var7 = new java.security.SecureRandom(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4880296587305749d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
