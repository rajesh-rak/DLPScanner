
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var3 = var0.put((java.lang.Object)100.0f, (java.lang.Object)10.0f);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.lang.Object var5 = var1.clone();
    java.util.Enumeration var6 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.rmi.server.RMIFailureHandler var0 = java.rmi.server.RMISocketFactory.getFailureHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    boolean var6 = var1.removeElement((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.lang.Object var5 = var1.clone();
    java.lang.Object[] var6 = var1.toArray();
    java.util.ListIterator var7 = var1.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Thread var1 = new java.lang.Thread("");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "hi!");

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    boolean var2 = var1.isEmpty();
    var0.putAll((java.util.Map)var1);
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", 10);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.util.Vector var3 = new java.util.Vector(100);
    java.util.Vector var5 = new java.util.Vector(100);
    boolean var6 = var3.retainAll((java.util.Collection)var5);
    java.lang.Object var7 = var3.clone();
    java.lang.Object[] var8 = var3.toArray();
    java.util.ListIterator var9 = var3.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("hi!", (java.lang.Object)var9);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    boolean var6 = var3.equals((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var3.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)(short)100);
    java.util.Vector var4 = new java.util.Vector(100);
    java.util.Vector var6 = new java.util.Vector(100);
    boolean var7 = var4.retainAll((java.util.Collection)var6);
    boolean var8 = var0.containsKey((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    boolean var6 = var3.equals((java.lang.Object)10);
    java.lang.SecurityManager var7 = new java.lang.SecurityManager();
    boolean var8 = var3.equals((java.lang.Object)var7);
    java.util.Vector var10 = new java.util.Vector(100);
    boolean var11 = var7.checkTopLevelWindow((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Hashtable var5 = new java.util.Hashtable();
    boolean var6 = var5.isEmpty();
    var1.addElement((java.lang.Object)var6);
    java.util.Vector var9 = new java.util.Vector(100);
    boolean var10 = var1.containsAll((java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    boolean var6 = var3.equals((java.lang.Object)10);
    java.lang.SecurityManager var7 = new java.lang.SecurityManager();
    boolean var8 = var3.equals((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.checkWrite("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var2 = var0.checkTopLevelWindow((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.util.Vector var8 = new java.util.Vector(100);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.clone();
    java.lang.Object[] var11 = var6.toArray();
    java.lang.Object[] var12 = var1.toArray(var11);
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.rmi.server.RMISocketFactory var0 = java.rmi.server.RMISocketFactory.getSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.lang.Object var5 = var1.clone();
    java.lang.Object[] var6 = var1.toArray();
    java.util.ListIterator var7 = var1.listIterator();
    java.util.Vector var9 = new java.util.Vector(100);
    java.util.Vector var11 = new java.util.Vector(100);
    boolean var12 = var9.retainAll((java.util.Collection)var11);
    java.util.Vector var14 = new java.util.Vector(100);
    java.util.Vector var16 = new java.util.Vector(100);
    boolean var17 = var14.retainAll((java.util.Collection)var16);
    java.lang.Object var18 = var14.clone();
    java.lang.Object[] var19 = var14.toArray();
    java.lang.Object[] var20 = var9.toArray(var19);
    boolean var21 = var1.remove((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    boolean var2 = var1.isEmpty();
    var0.putAll((java.util.Map)var1);
    java.lang.SecurityManager var4 = new java.lang.SecurityManager();
    java.lang.Object var5 = var0.get((java.lang.Object)var4);
    var4.checkPackageAccess("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.util.Vector var3 = new java.util.Vector(100);
    boolean var4 = var1.retainAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.util.Vector var8 = new java.util.Vector(100);
    boolean var9 = var6.retainAll((java.util.Collection)var8);
    java.lang.Object var10 = var6.clone();
    java.lang.Object[] var11 = var6.toArray();
    java.lang.Object[] var12 = var1.toArray(var11);
    java.lang.Object var13 = new java.lang.Object();
    boolean var14 = var1.contains(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)(short)100);
    boolean var4 = var0.contains((java.lang.Object)'4');
    java.security.ProtectionDomain[] var5 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var6 = new java.security.AccessControlContext(var5);
    java.lang.Object var7 = var0.remove((java.lang.Object)var5);
    java.security.AccessControlContext var8 = new java.security.AccessControlContext(var5);
    boolean var10 = var8.equals((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable();
    boolean var2 = var1.isEmpty();
    var0.putAll((java.util.Map)var1);
    java.lang.SecurityManager var4 = new java.lang.SecurityManager();
    java.lang.Object var5 = var0.get((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.checkSecurityAccess("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
