
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


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkConnect("hi!", 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.elements();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkSecurityAccess("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.lang.Object var8 = var1.put((java.lang.Object)(-1L), (java.lang.Object)0.0d);
    java.util.Enumeration var9 = var1.keys();
    java.lang.Object var11 = var1.remove((java.lang.Object)(short)1);
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.lang.Object var8 = var1.put((java.lang.Object)(-1L), (java.lang.Object)0.0d);
    java.util.Enumeration var9 = var1.keys();
    java.lang.Object var11 = var1.remove((java.lang.Object)(short)1);
    java.util.Set var12 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.lang.Object var6 = var1.clone();
    java.lang.Object var8 = var1.get((java.lang.Object)' ');
    java.util.Enumeration var9 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    var8.checkExit(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Hashtable var7 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Object var3 = var1.remove((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    boolean var11 = var8.checkTopLevelWindow((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkWrite("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.lang.Object var8 = var1.put((java.lang.Object)(-1L), (java.lang.Object)0.0d);
    java.util.Enumeration var9 = var1.keys();
    java.lang.Object var11 = var1.remove((java.lang.Object)(short)1);
    java.util.Hashtable var12 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var1);
    java.util.Set var13 = var12.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.elements();
    java.util.Collection var3 = var1.values();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 100.0f);
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Collection var7 = var6.values();
    var4.putAll((java.util.Map)var6);
    java.lang.Object var11 = var4.put((java.lang.Object)(-1L), (java.lang.Object)0.0d);
    java.util.Collection var12 = var4.values();
    java.lang.Object var13 = var2.remove((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    var8.checkPackageDefinition("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkDelete("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var3 = new java.util.Hashtable(10);
    java.util.Collection var4 = var3.values();
    var1.putAll((java.util.Map)var3);
    java.util.Collection var6 = var3.values();
    java.util.Enumeration var7 = var3.keys();
    java.lang.SecurityManager var8 = new java.lang.SecurityManager();
    boolean var9 = var3.equals((java.lang.Object)var8);
    var8.checkPackageDefinition("");
    java.lang.ThreadGroup var12 = var8.getThreadGroup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.checkWrite("hi!");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
