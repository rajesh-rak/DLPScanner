
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.String var2 = var1.toString();
    java.util.Set var3 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    java.security.DomainCombiner var3 = var2.getDomainCombiner();
    boolean var4 = var0.equals((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.lang.String var3 = var0.getProperty("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var2 = new java.util.Properties(var0);
    java.util.Properties var3 = new java.util.Properties();
    int var4 = var3.size();
    java.lang.String var6 = var3.getProperty("");
    boolean var7 = var2.contains((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.lang.String var3 = var0.getProperty("");
    java.util.Properties var4 = new java.util.Properties();
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var4);
    java.util.Properties var6 = new java.util.Properties(var4);
    java.lang.String var8 = var4.getProperty("hi!");
    boolean var9 = var0.containsKey((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var2 = new java.util.Properties(var0);
    boolean var4 = var0.equals((java.lang.Object)100L);
    java.util.Properties var5 = new java.util.Properties();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var5);
    java.lang.Object var9 = var5.setProperty("{}", "{}");
    java.lang.Object var12 = var5.setProperty("hi!", "hi!");
    java.util.Properties var13 = new java.util.Properties();
    java.util.Set var14 = var13.entrySet();
    java.lang.Object var15 = var0.put((java.lang.Object)"hi!", (java.lang.Object)var13);
    com.sun.crypto.provider.JceKeyStore var17 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate[] var19 = var17.engineGetCertificateChain("hi!");
    byte[] var24 = new byte[] { (byte)0, (byte)0, (byte)1};
    java.security.cert.Certificate[] var25 = new java.security.cert.Certificate[] { };
    var17.engineSetKeyEntry("hi!", var24, var25);
    java.lang.Object var27 = var0.put((java.lang.Object)(-1.0f), (java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var2 = new java.util.Properties(var0);
    boolean var4 = var0.equals((java.lang.Object)100L);
    java.util.Properties var5 = new java.util.Properties();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var5);
    java.lang.Object var9 = var5.setProperty("{}", "{}");
    java.lang.Object var12 = var5.setProperty("hi!", "hi!");
    java.util.Properties var13 = new java.util.Properties();
    java.util.Set var14 = var13.entrySet();
    java.lang.Object var15 = var0.put((java.lang.Object)"hi!", (java.lang.Object)var13);
    java.util.Properties var16 = new java.util.Properties();
    java.util.Hashtable var17 = new java.util.Hashtable((java.util.Map)var16);
    java.lang.String var18 = var17.toString();
    java.lang.Object var19 = var0.remove((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "{}"+ "'", var18.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Properties var3 = new java.util.Properties(var1);
    java.lang.String var5 = var1.getProperty("hi!");
    java.lang.Object var7 = var0.put((java.lang.Object)"hi!", (java.lang.Object)(-1L));
    java.util.Properties var8 = new java.util.Properties();
    java.util.Properties var9 = new java.util.Properties();
    java.util.Set var10 = var9.entrySet();
    java.lang.Object var11 = var0.put((java.lang.Object)var8, (java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("");
    char[] var6 = new char[] { '#', '#'};
    java.security.Key var7 = var0.engineGetKey("", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var4 = var0.setProperty("{}", "{}");
    java.lang.Object var6 = var0.remove((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.String var2 = var1.toString();
    java.util.Collection var3 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var3 = var0.get((java.lang.Object)1L);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("{}");
    java.util.Enumeration var5 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    int var2 = var0.engineSize();
    byte[] var7 = new byte[] { (byte)10, (byte)(-1), (byte)1};
    java.security.cert.Certificate[] var8 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var7, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var2 = new java.util.Properties(var0);
    boolean var4 = var0.equals((java.lang.Object)100L);
    boolean var6 = var0.contains((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.lang.String var3 = var0.getProperty("");
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var5 = new java.util.Properties();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var5);
    java.util.Properties var7 = new java.util.Properties();
    int var8 = var7.size();
    java.lang.String var10 = var7.getProperty("");
    int var11 = var7.size();
    boolean var12 = var5.containsValue((java.lang.Object)var7);
    boolean var13 = var0.contains((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

}
