
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.WeakHashMap var1 = new java.util.WeakHashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("", "{}", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.lang.Object var7 = var3.get((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.util.Collection var6 = var3.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.WeakHashMap var1 = new java.util.WeakHashMap(0);
    java.security.Provider[] var2 = java.security.Security.getProviders((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.lang.SecurityManager var6 = new java.lang.SecurityManager();
    boolean var7 = var6.getInCheck();
    java.lang.Object var9 = var3.put((java.lang.Object)var6, (java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("{}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.lang.SecurityManager var6 = new java.lang.SecurityManager();
    boolean var7 = var6.getInCheck();
    java.lang.Object var9 = var3.put((java.lang.Object)var6, (java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.checkLink("{}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.lang.SecurityManager var6 = new java.lang.SecurityManager();
    boolean var7 = var6.getInCheck();
    java.lang.Object var9 = var3.put((java.lang.Object)var6, (java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.checkAccept("", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.util.WeakHashMap var1 = new java.util.WeakHashMap();
    int var2 = var1.size();
    java.util.Collection var3 = var1.values();
    boolean var4 = var0.equals((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    var3.clear();
    java.lang.SecurityManager var6 = new java.lang.SecurityManager();
    boolean var7 = var6.getInCheck();
    java.lang.Object var9 = var3.put((java.lang.Object)var6, (java.lang.Object)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.checkRead("", (java.lang.Object)(-1));
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Enumeration var2 = var0.elements();
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    int var4 = var3.size();
    java.lang.Object var5 = var0.get((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var5 = var2.put((java.lang.Object)(-1), (java.lang.Object)10.0d);
    java.util.WeakHashMap var7 = new java.util.WeakHashMap();
    java.lang.Object var9 = var7.get((java.lang.Object)true);
    java.lang.Object var10 = var2.put((java.lang.Object)10.0d, (java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.Provider[] var0 = java.security.Security.getProviders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    java.lang.Object var2 = var0.get((java.lang.Object)true);
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.Object var5 = var2.put((java.lang.Object)(-1), (java.lang.Object)10.0d);
    java.util.Collection var6 = var2.values();
    java.lang.SecurityManager var7 = new java.lang.SecurityManager();
    boolean var8 = var7.getInCheck();
    boolean var9 = var2.containsKey((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.checkPropertyAccess("{}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.WeakHashMap var0 = new java.util.WeakHashMap();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.WeakHashMap var3 = new java.util.WeakHashMap();
    java.lang.Object var4 = var2.remove((java.lang.Object)var3);
    boolean var5 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

}
