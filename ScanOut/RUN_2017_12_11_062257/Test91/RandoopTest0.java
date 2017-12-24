
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    java.lang.String var1 = var0.getName();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var0 = new byte[] { };
    java.security.SecureRandom var1 = new java.security.SecureRandom(var0);
    double var2 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3309383190910903d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.Provider var1 = java.security.Security.getProvider("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var0 = new byte[] { };
    java.security.SecureRandom var1 = new java.security.SecureRandom(var0);
    var1.setSeed(1L);
    java.lang.String var4 = var1.getAlgorithm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NativePRNG"+ "'", var4.equals("NativePRNG"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.SecureRandom var1 = java.security.SecureRandom.getInstance("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)100L);
    java.lang.Object var4 = var0.remove((java.lang.Object)true);
    java.security.Provider[] var5 = java.security.Security.getProviders((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var0 = new byte[] { };
    java.security.SecureRandom var1 = new java.security.SecureRandom(var0);
    var1.setSeed(1L);
    boolean var4 = var1.nextBoolean();
    float var5 = var1.nextFloat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5238914f);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    sun.security.util.ObjectIdentifier var1 = var0.getOID();
    java.security.AlgorithmParameters var2 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AlgorithmParameters var2 = java.security.AlgorithmParameters.getInstance("hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("", "hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    java.util.Properties var2 = new java.util.Properties();
    boolean var4 = var2.containsValue((java.lang.Object)100L);
    java.lang.Object var6 = var2.remove((java.lang.Object)true);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var9 = var2.remove((java.lang.Object)'#');
    java.util.Set var10 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    byte[] var2 = var0.encode();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.SecureRandom var1 = java.security.SecureRandom.getInstance("NativePRNG");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    java.util.Properties var2 = new java.util.Properties();
    boolean var4 = var2.containsValue((java.lang.Object)100L);
    java.lang.Object var6 = var2.remove((java.lang.Object)true);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var9 = var2.remove((java.lang.Object)'#');
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Set var1 = java.security.Security.getAlgorithms("NativePRNG");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider[] var1 = java.security.Security.getProviders("{}");
      fail("Expected exception of type java.security.InvalidParameterException");
    } catch (java.security.InvalidParameterException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.SecureRandom var0 = new java.security.SecureRandom();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    java.util.Properties var2 = new java.util.Properties();
    boolean var4 = var2.containsValue((java.lang.Object)100L);
    java.lang.Object var6 = var2.remove((java.lang.Object)true);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var9 = var2.remove((java.lang.Object)'#');
    java.lang.String var12 = var2.getProperty("", "");
    sun.security.x509.AlgorithmId var13 = new sun.security.x509.AlgorithmId();
    byte[] var14 = var13.getEncodedParams();
    java.util.Properties var15 = new java.util.Properties();
    boolean var17 = var15.containsValue((java.lang.Object)100L);
    java.lang.Object var19 = var15.remove((java.lang.Object)true);
    boolean var20 = var13.equals((java.lang.Object)var15);
    java.lang.Object var22 = var15.remove((java.lang.Object)'#');
    boolean var23 = var2.equals((java.lang.Object)var15);
    java.util.Enumeration var24 = var15.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("NativePRNG", "", "NativePRNG");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    java.util.Properties var2 = new java.util.Properties();
    boolean var4 = var2.containsValue((java.lang.Object)100L);
    java.lang.Object var6 = var2.remove((java.lang.Object)true);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var9 = var2.remove((java.lang.Object)'#');
    sun.security.x509.AlgorithmId var10 = new sun.security.x509.AlgorithmId();
    byte[] var11 = var10.getEncodedParams();
    java.util.Properties var12 = new java.util.Properties();
    boolean var14 = var12.containsValue((java.lang.Object)100L);
    java.lang.Object var16 = var12.remove((java.lang.Object)true);
    boolean var17 = var10.equals((java.lang.Object)var12);
    java.security.Provider[] var18 = java.security.Security.getProviders();
    boolean var19 = var12.containsValue((java.lang.Object)var18);
    boolean var20 = var2.contains((java.lang.Object)var18);
    sun.security.jca.ProviderList var21 = sun.security.jca.ProviderList.newList(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    byte[] var0 = new byte[] { };
    java.security.SecureRandom var1 = new java.security.SecureRandom(var0);
    var1.setSeed(1L);
    boolean var4 = var1.nextBoolean();
    double var5 = var1.nextGaussian();
    double var6 = var1.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1.3383086355468574d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-0.5665009863835169d));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var0 = new byte[] { };
    java.security.SecureRandom var1 = new java.security.SecureRandom(var0);
    java.lang.String var2 = var1.getAlgorithm();
    java.lang.String var3 = var1.getAlgorithm();
    boolean var4 = var1.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NativePRNG"+ "'", var2.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NativePRNG"+ "'", var3.equals("NativePRNG"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.security.x509.AlgorithmId var0 = new sun.security.x509.AlgorithmId();
    byte[] var1 = var0.getEncodedParams();
    java.util.Properties var2 = new java.util.Properties();
    boolean var4 = var2.containsValue((java.lang.Object)100L);
    java.lang.Object var6 = var2.remove((java.lang.Object)true);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var9 = var2.remove((java.lang.Object)'#');
    java.lang.String var12 = var2.getProperty("", "");
    byte[] var13 = new byte[] { };
    java.security.SecureRandom var14 = new java.security.SecureRandom(var13);
    var14.setSeed(1L);
    boolean var17 = var14.nextBoolean();
    double var18 = var14.nextGaussian();
    boolean var19 = var2.containsKey((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-0.08553505980100581d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

}
