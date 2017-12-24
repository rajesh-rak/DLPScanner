
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)true, (java.lang.Object)1L);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var4 = new java.util.Hashtable(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var6 = new com.sun.jndi.ldap.LdapCtx("hi!", "hi!", 1, var4, false);
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var1);
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Enumeration var2 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Hashtable var3 = new java.util.Hashtable(100);
    boolean var5 = var3.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var3);
    boolean var7 = var1.contains((java.lang.Object)var6);
    boolean var9 = var1.containsKey((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.lang.Object var4 = var1.put((java.lang.Object)'a', (java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object var5 = new java.lang.Object();
    boolean var6 = var4.contains(var5);
    boolean var8 = var4.remove((java.lang.Object)1.0f);
    boolean var9 = var0.removeAll((java.util.Collection)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var4.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Hashtable var3 = new java.util.Hashtable(100);
    boolean var5 = var3.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var3);
    boolean var7 = var1.contains((java.lang.Object)var6);
    int var8 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.containsKey((java.lang.Object)10.0f);
    java.util.Enumeration var4 = var1.keys();
    java.util.Hashtable var6 = new java.util.Hashtable(100);
    boolean var8 = var6.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Collection var10 = var9.values();
    java.lang.Object var11 = var1.remove((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var1);
    boolean var6 = var1.containsValue((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object var5 = new java.lang.Object();
    boolean var6 = var4.contains(var5);
    boolean var8 = var4.remove((java.lang.Object)1.0f);
    boolean var9 = var0.removeAll((java.util.Collection)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var11 = var0.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.trimToSize();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object var1 = new java.lang.Object();
    boolean var2 = var0.contains(var1);
    boolean var4 = var0.remove((java.lang.Object)1.0f);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.lastIndexOf((java.lang.Object)(byte)100, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Collection var5 = var4.values();
    java.util.Enumeration var6 = var4.elements();
    java.util.Hashtable var7 = new java.util.Hashtable();
    var7.clear();
    boolean var9 = var4.containsKey((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object var5 = new java.lang.Object();
    boolean var6 = var4.contains(var5);
    boolean var8 = var4.remove((java.lang.Object)1.0f);
    boolean var9 = var0.removeAll((java.util.Collection)var4);
    boolean var10 = var4.isEmpty();
    java.util.Hashtable var13 = new java.util.Hashtable(100);
    boolean var15 = var13.containsKey((java.lang.Object)10.0f);
    java.util.Hashtable var16 = new java.util.Hashtable((java.util.Map)var13);
    java.util.Collection var17 = var16.values();
    java.util.Enumeration var18 = var16.elements();
    java.util.Collection var19 = var16.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var4.addAll(1, var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.lang.String var3 = var2.toString();
    var2.clear();
    java.util.Vector var5 = new java.util.Vector((java.util.Collection)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object var5 = new java.lang.Object();
    boolean var6 = var4.contains(var5);
    boolean var8 = var4.remove((java.lang.Object)1.0f);
    boolean var9 = var0.removeAll((java.util.Collection)var4);
    java.lang.Object var10 = new java.lang.Object();
    boolean var11 = var4.removeElement(var10);
    int var14 = var4.indexOf((java.lang.Object)1L, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var4.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
