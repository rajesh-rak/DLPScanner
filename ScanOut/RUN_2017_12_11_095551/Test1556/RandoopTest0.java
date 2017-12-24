
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.lang.String var2 = var1.toString();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.io.IOException var2 = var1.ioException();
    var1.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.io.IOException var2 = var1.ioException();
    java.io.IOException var3 = var1.ioException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    boolean var5 = var1.containsKey((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.jndi.ldap.LdapPoolManager.expire(10L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.util.Formatter var5 = new java.util.Formatter("hi!");
    java.lang.Object[] var8 = new java.lang.Object[] { 100.0d};
    java.util.Formatter var9 = var5.format("", var8);
    boolean var10 = var1.containsKey((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.close();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var1.containsValue(var4);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Hashtable var8 = new java.util.Hashtable(1);
    boolean var10 = var8.containsValue((java.lang.Object)10.0d);
    java.lang.Object var11 = new java.lang.Object();
    boolean var12 = var8.containsValue(var11);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var8);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var8);
    var6.putAll((java.util.Map)var8);
    boolean var17 = var6.containsValue((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var1.containsValue(var4);
    int var6 = var1.size();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    boolean var5 = var3.containsValue((java.lang.Object)10.0d);
    java.lang.Object var6 = new java.lang.Object();
    boolean var7 = var3.containsValue(var6);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var3);
    java.util.Hashtable var10 = new java.util.Hashtable(1);
    boolean var12 = var10.containsValue((java.lang.Object)10.0d);
    java.lang.Object var13 = new java.lang.Object();
    boolean var14 = var10.containsValue(var13);
    java.util.Hashtable var15 = new java.util.Hashtable((java.util.Map)var10);
    java.util.Hashtable var16 = new java.util.Hashtable((java.util.Map)var10);
    var8.putAll((java.util.Map)var10);
    boolean var18 = var0.containsValue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), (-1), 1);
    var3.expire(0L);
    var3.expire(1L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.io.IOException var2 = var1.ioException();
    java.util.Formatter var5 = new java.util.Formatter("hi!");
    java.lang.Object[] var8 = new java.lang.Object[] { 100.0d};
    java.util.Formatter var9 = var5.format("", var8);
    java.util.Formatter var10 = var1.format("hi!", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var1.containsValue(var4);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Hashtable var8 = new java.util.Hashtable(1);
    boolean var10 = var8.containsValue((java.lang.Object)10.0d);
    java.lang.Object var11 = new java.lang.Object();
    boolean var12 = var8.containsValue(var11);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var8);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var8);
    var6.putAll((java.util.Map)var8);
    java.util.Set var16 = var8.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var1.containsValue(var4);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Hashtable var8 = new java.util.Hashtable(1);
    boolean var10 = var8.containsValue((java.lang.Object)10.0d);
    java.lang.Object var11 = new java.lang.Object();
    boolean var12 = var8.containsValue(var11);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var8);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var8);
    var6.putAll((java.util.Map)var8);
    java.util.Formatter var16 = new java.util.Formatter();
    java.lang.Object var17 = var8.get((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.containsValue((java.lang.Object)10.0d);
    java.util.Enumeration var4 = var1.keys();
    boolean var6 = var1.containsValue((java.lang.Object)'4');
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.String var8 = var7.toString();
    java.util.Hashtable var9 = new java.util.Hashtable();
    java.lang.Object var10 = new java.lang.Object();
    boolean var11 = var9.contains(var10);
    boolean var13 = var9.containsValue((java.lang.Object)(short)1);
    var7.putAll((java.util.Map)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "{}"+ "'", var8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(10, 100, 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
