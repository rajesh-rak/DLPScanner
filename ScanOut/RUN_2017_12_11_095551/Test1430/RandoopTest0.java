
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var0, "hi!");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate var9 = var0.engineGetCertificate("");
    boolean var11 = var0.engineContainsAlias("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("hi!");
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    byte[] var7 = new byte[] { };
    com.sun.crypto.provider.JceKeyStore var8 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var11 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var12 = new java.security.cert.Certificate[] { };
    var8.engineSetKeyEntry("hi!", var11, var12);
    var0.engineSetKeyEntry("hi!", var7, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    java.util.Hashtable var9 = new java.util.Hashtable(1, 100.0f);
    java.lang.Object var10 = var5.remove((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate var9 = var0.engineGetCertificate("");
    boolean var11 = var0.engineIsKeyEntry("hi!");
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate var9 = var0.engineGetCertificate("");
    boolean var11 = var0.engineIsKeyEntry("hi!");
    boolean var13 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    java.lang.Object var7 = var5.clone();
    int var8 = var5.size();
    int var9 = var5.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    java.security.cert.Certificate[] var7 = var0.engineGetCertificateChain("hi!");
    java.security.cert.Certificate var9 = var0.engineGetCertificate("");
    byte[] var13 = new byte[] { (byte)100, (byte)10};
    com.sun.crypto.provider.JceKeyStore var14 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var17 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var18 = new java.security.cert.Certificate[] { };
    var14.engineSetKeyEntry("hi!", var17, var18);
    var0.engineSetKeyEntry("hi!", var13, var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("hi!");
    char[] var4 = new char[] { };
    java.security.Key var5 = var0.engineGetKey("", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    boolean var4 = var2.contains((java.lang.Object)(-1.0d));
    java.util.Hashtable var5 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var2);
    java.util.Enumeration var6 = var2.keys();
    java.util.Enumeration var7 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var3 = new java.util.Hashtable(0, 100.0f);
    boolean var5 = var3.contains((java.lang.Object)(-1.0d));
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var3);
    var0.putAll((java.util.Map)var6);
    java.util.Set var8 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    java.lang.Object var8 = var5.remove((java.lang.Object)100L);
    java.util.Enumeration var9 = var5.elements();
    boolean var11 = var5.contains((java.lang.Object)(byte)0);
    java.util.Hashtable var14 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var17 = new java.util.Hashtable(0, 100.0f);
    var14.putAll((java.util.Map)var17);
    java.lang.Object var20 = var17.remove((java.lang.Object)100L);
    java.util.Enumeration var21 = var17.elements();
    boolean var23 = var17.contains((java.lang.Object)(byte)0);
    var5.putAll((java.util.Map)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    java.security.DomainCombiner var2 = var0.getDomainCombiner();
    java.security.DomainCombiner var3 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    boolean var7 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    boolean var8 = var5.contains((java.lang.Object)10);
    java.util.Enumeration var9 = var5.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);

  }

}
