
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("hi!");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512981030228L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.System.getenv("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.System.getenv("\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1556381412);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Collection var6 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.setProperty("", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.System.clearProperty("\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.System.runFinalization();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    com.sun.crypto.provider.JceKeyStore var8 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Hashtable var11 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var14 = var11.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Enumeration var15 = var11.keys();
    var11.clear();
    java.util.Enumeration var17 = var11.keys();
    java.lang.Object var18 = var2.put((java.lang.Object)var8, (java.lang.Object)var11);
    java.lang.Object var19 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Map var0 = java.lang.System.getenv();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    java.lang.Object var8 = var2.clone();
    java.util.Hashtable var11 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var14 = var11.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var16 = var11.equals((java.lang.Object)(short)1);
    java.util.Collection var17 = var11.values();
    var2.putAll((java.util.Map)var11);
    java.util.Hashtable var21 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var24 = var21.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var26 = var21.equals((java.lang.Object)(short)1);
    java.util.Collection var27 = var21.values();
    boolean var28 = var11.contains((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    java.security.cert.Certificate var6 = var0.engineGetCertificate("hi!");
    java.io.ByteArrayOutputStream var8 = new java.io.ByteArrayOutputStream(0);
    char[] var10 = new char[] { ' '};
    var0.engineStore((java.io.OutputStream)var8, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Enumeration var6 = var2.keys();
    var2.clear();
    java.util.Enumeration var8 = var2.keys();
    java.lang.String var9 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "{}"+ "'", var9.equals("{}"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Enumeration var6 = var2.keys();
    java.util.Hashtable var9 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var12 = var9.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var14 = var9.equals((java.lang.Object)(short)1);
    var2.putAll((java.util.Map)var9);
    java.util.Enumeration var16 = var2.elements();
    java.lang.Object var17 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.ByteArrayOutputStream var1 = new java.io.ByteArrayOutputStream(0);
    var1.reset();
    byte[] var3 = var1.toByteArray();
    java.io.ByteArrayOutputStream var5 = new java.io.ByteArrayOutputStream(0);
    var5.reset();
    byte[] var7 = var5.toByteArray();
    var1.write(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    com.sun.crypto.provider.JceKeyStore var8 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Hashtable var11 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var14 = var11.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Enumeration var15 = var11.keys();
    var11.clear();
    java.util.Enumeration var17 = var11.keys();
    java.lang.Object var18 = var2.put((java.lang.Object)var8, (java.lang.Object)var11);
    int var19 = var8.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.ByteArrayOutputStream var1 = new java.io.ByteArrayOutputStream(1);
    byte[] var2 = var1.toByteArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.ByteArrayOutputStream var1 = new java.io.ByteArrayOutputStream(1);
    int var2 = var1.size();
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.clearProperty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    boolean var7 = var2.equals((java.lang.Object)(short)1);
    com.sun.crypto.provider.JceKeyStore var8 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Hashtable var11 = new java.util.Hashtable(1, 1.0f);
    java.lang.Object var14 = var11.put((java.lang.Object)(short)10, (java.lang.Object)(byte)0);
    java.util.Enumeration var15 = var11.keys();
    var11.clear();
    java.util.Enumeration var17 = var11.keys();
    java.lang.Object var18 = var2.put((java.lang.Object)var8, (java.lang.Object)var11);
    boolean var20 = var8.engineIsKeyEntry("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

}
