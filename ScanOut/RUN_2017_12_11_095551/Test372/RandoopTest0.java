
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("");
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
      javax.crypto.ExemptionMechanism var1 = javax.crypto.ExemptionMechanism.getInstance("hi!");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.ExtendedKeyUsageExtension var2 = new sun.security.x509.ExtendedKeyUsageExtension((java.lang.Boolean)false, (java.lang.Object)(short)100);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.ExemptionMechanism var2 = javax.crypto.ExemptionMechanism.getInstance("hi!", "hi!");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    var2.ensureCapacity(100);
    java.util.Vector var5 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.ExemptionMechanism var1 = javax.crypto.ExemptionMechanism.getInstance("");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    boolean var7 = var2.add((java.lang.Object)'4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)1.0f, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    java.util.ListIterator var6 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.lang.String var4 = var3.getName();
    java.lang.String var5 = var3.getName();
    java.lang.String var6 = var3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ExtendedKeyUsage"+ "'", var4.equals("ExtendedKeyUsage"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "ExtendedKeyUsage"+ "'", var5.equals("ExtendedKeyUsage"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ExtendedKeyUsage"+ "'", var6.equals("ExtendedKeyUsage"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    var2.ensureCapacity(100);
    java.util.Vector var5 = new java.util.Vector((java.util.Collection)var2);
    java.util.Hashtable var6 = new java.util.Hashtable();
    boolean var8 = var6.equals((java.lang.Object)(short)100);
    java.util.Enumeration var9 = var6.elements();
    boolean var10 = var6.isEmpty();
    java.util.Collection var11 = var6.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setElementAt((java.lang.Object)var6, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    var2.ensureCapacity(100);
    java.util.Vector var5 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var9 = new java.util.Vector(10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var2.addAll(1, (java.util.Collection)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)(short)100);
    boolean var4 = var0.contains((java.lang.Object)0L);
    java.util.Hashtable var5 = new java.util.Hashtable();
    boolean var7 = var5.equals((java.lang.Object)(short)100);
    java.util.Enumeration var8 = var5.elements();
    boolean var9 = var0.containsValue((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    java.util.Hashtable var7 = new java.util.Hashtable();
    boolean var9 = var7.equals((java.lang.Object)(short)100);
    java.util.Enumeration var10 = var7.elements();
    boolean var11 = var7.isEmpty();
    java.util.Collection var12 = var7.values();
    boolean var13 = var2.addAll(0, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(0, "ExtendedKeyUsage");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("hi!");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    boolean var7 = var2.add((java.lang.Object)'4');
    java.util.Hashtable var9 = new java.util.Hashtable(0);
    int var10 = var2.indexOf((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.util.Enumeration var4 = var2.elements();
    java.util.Vector var7 = new java.util.Vector(10, (-1));
    var7.ensureCapacity(100);
    var7.ensureCapacity((-1));
    boolean var12 = var2.addAll((java.util.Collection)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    var2.ensureCapacity(100);
    java.util.Vector var7 = new java.util.Vector(10, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var8 = new sun.security.x509.ExtendedKeyUsageExtension(var7);
    java.util.Enumeration var9 = var7.elements();
    boolean var10 = var2.remove((java.lang.Object)var7);
    var2.addElement((java.lang.Object)'#');
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    sun.security.x509.ExtendedKeyUsageExtension var3 = new sun.security.x509.ExtendedKeyUsageExtension(var2);
    java.lang.String var4 = var3.getName();
    boolean var6 = var3.equals((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ExtendedKeyUsage"+ "'", var4.equals("ExtendedKeyUsage"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.equals((java.lang.Object)(short)100);
    java.util.Enumeration var5 = var2.elements();
    boolean var6 = var2.isEmpty();
    var1.putAll((java.util.Map)var2);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)(short)100);
    boolean var4 = var0.contains((java.lang.Object)0L);
    java.lang.Object var6 = var0.get((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var5 = var2.indexOf((java.lang.Object)10.0f, 100);
    java.util.Iterator var6 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
