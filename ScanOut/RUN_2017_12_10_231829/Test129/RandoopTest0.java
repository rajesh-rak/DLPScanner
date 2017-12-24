
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1);
    java.security.AccessControlContext var3 = java.security.AccessController.getContext();
    boolean var4 = var2.containsValue((java.lang.Object)var3);
    java.util.Collection var5 = var2.values();
    javax.naming.Context var6 = javax.naming.spi.NamingManager.getURLContext("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0.0f);
    java.lang.Object var4 = var0.remove((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    boolean var3 = var1.containsValue((java.lang.Object)var2);
    java.lang.Object var5 = var1.remove((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var6 = new java.security.UnresolvedPermission("", "hi!", "hi!", var5);
    java.lang.String var7 = var6.getName();
    java.security.cert.Certificate[] var8 = var6.getUnresolvedCerts();
    var1.checkPermission((java.security.Permission)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

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


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    boolean var3 = var1.containsValue((java.lang.Object)var2);
    boolean var5 = var2.equals((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var5 = new java.security.UnresolvedPermission("", "hi!", "hi!", var4);
    var0.add((java.security.Permission)var5);
    java.security.cert.Certificate[] var7 = var5.getUnresolvedCerts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    boolean var3 = var1.containsValue((java.lang.Object)var2);
    java.util.Collection var4 = var1.values();
    java.util.Set var5 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.AccessControlContext var2 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var5 = new java.security.UnresolvedPermission("", "hi!", "hi!", var4);
    var0.add((java.security.Permission)var5);
    boolean var7 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.util.Enumeration var1 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "hi!", "hi!", var3);
    boolean var6 = var4.equals((java.lang.Object)"(unresolved  hi! hi!)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.contains((java.lang.Object)0.0f);
    java.util.Set var5 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable();
    var2.putAll((java.util.Map)var6);
    var1.putAll((java.util.Map)var6);
    java.util.Hashtable var9 = new java.util.Hashtable();
    java.util.Hashtable var10 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var9);
    java.util.Hashtable var11 = new java.util.Hashtable();
    boolean var13 = var11.contains((java.lang.Object)0.0f);
    java.util.Set var14 = var11.entrySet();
    java.util.Hashtable var15 = new java.util.Hashtable();
    var11.putAll((java.util.Map)var15);
    var10.putAll((java.util.Map)var15);
    java.lang.Object var18 = var1.get((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "hi!", "hi!", var3);
    java.lang.String var5 = var4.getName();
    java.security.cert.Certificate[] var6 = var4.getUnresolvedCerts();
    java.lang.String var7 = var4.toString();
    java.security.cert.Certificate[] var8 = var4.getUnresolvedCerts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(unresolved  hi! hi!)"+ "'", var7.equals("(unresolved  hi! hi!)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0.0f);
    java.lang.Object var4 = var0.get((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var5 = new java.security.UnresolvedPermission("", "hi!", "hi!", var4);
    var0.add((java.security.Permission)var5);
    java.util.Enumeration var7 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)0.0f);
    java.util.Set var3 = var0.entrySet();
    java.security.Permissions var5 = new java.security.Permissions();
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var10 = new java.security.UnresolvedPermission("", "hi!", "hi!", var9);
    var5.add((java.security.Permission)var10);
    java.lang.Object var12 = var0.put((java.lang.Object)'4', (java.lang.Object)var10);
    java.lang.Object var14 = var0.remove((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(100);
    java.lang.SecurityManager var4 = new java.lang.SecurityManager();
    var4.checkExit(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("", (java.lang.Object)var4);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("", 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Hashtable var4 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var3);
    java.util.Hashtable var5 = new java.util.Hashtable();
    boolean var7 = var5.contains((java.lang.Object)0.0f);
    java.util.Set var8 = var5.entrySet();
    java.util.Hashtable var9 = new java.util.Hashtable();
    var5.putAll((java.util.Map)var9);
    var4.putAll((java.util.Map)var9);
    var0.putAll((java.util.Map)var9);
    java.util.Enumeration var13 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.security.AccessControlContext var2 = java.security.AccessController.getContext();
    boolean var3 = var1.containsValue((java.lang.Object)var2);
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

}
