
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

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


    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Enumeration var4 = var3.keys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var6 = new com.sun.jndi.ldap.LdapCtx("hi!", "hi!", 1, var3, true);
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var2.subList(0, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    var2.clear();
    var2.add(0, (java.lang.Object)(-1.0f));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.util.Hashtable var4 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var5 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.indexOf((java.lang.Object)var5, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    boolean var5 = var3.contains((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    boolean var5 = var2.removeElement((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var4 = new char[] { 'a', '4'};
    java.security.Key var5 = var0.engineGetKey("hi!", var4);
    java.util.Date var7 = var0.engineGetCreationDate("");
    var0.engineDeleteEntry("hi!");
    byte[] var11 = new byte[] { };
    java.security.cert.Certificate[] var12 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var11, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var4 = new char[] { 'a', '4'};
    java.security.Key var5 = var0.engineGetKey("hi!", var4);
    byte[] var10 = new byte[] { (byte)(-1), (byte)1, (byte)1};
    java.security.cert.Certificate[] var11 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var10, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var4 = new char[] { 'a', '4'};
    java.security.Key var5 = var0.engineGetKey("hi!", var4);
    java.util.Date var7 = var0.engineGetCreationDate("");
    var0.engineDeleteEntry("hi!");
    var0.engineDeleteEntry("[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(1, 1);
    java.lang.Object[] var8 = var7.toArray();
    boolean var9 = var2.retainAll((java.util.Collection)var7);
    java.util.Vector var13 = new java.util.Vector(1, 1);
    java.lang.Object[] var14 = var13.toArray();
    java.lang.String var15 = var13.toString();
    java.util.Vector var18 = new java.util.Vector(1, 1);
    java.lang.Object[] var19 = var18.toArray();
    boolean var20 = var13.retainAll((java.util.Collection)var18);
    boolean var21 = var13.isEmpty();
    java.util.Vector var24 = new java.util.Vector(1, 1);
    java.lang.Object[] var25 = var24.toArray();
    boolean var26 = var13.add((java.lang.Object)var24);
    boolean var27 = var2.addAll(0, (java.util.Collection)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(1, 1);
    java.lang.Object[] var8 = var7.toArray();
    boolean var9 = var2.retainAll((java.util.Collection)var7);
    java.util.Vector var12 = new java.util.Vector(1, 1);
    java.lang.Object[] var13 = var12.toArray();
    var2.copyInto(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Enumeration var4 = var1.elements();
    java.lang.Object var5 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Hashtable var2 = new java.util.Hashtable();
    var1.putAll((java.util.Map)var2);
    var2.clear();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(1, 1);
    java.lang.Object[] var8 = var7.toArray();
    boolean var9 = var2.retainAll((java.util.Collection)var7);
    boolean var10 = var2.isEmpty();
    java.util.Vector var13 = new java.util.Vector(1, 1);
    java.lang.Object[] var14 = var13.toArray();
    boolean var15 = var2.add((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var2.set(1, (java.lang.Object)0.0f);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Hashtable var5 = new java.util.Hashtable(0);
    java.util.Hashtable var6 = new java.util.Hashtable();
    var5.putAll((java.util.Map)var6);
    java.lang.Object var8 = var1.remove((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Enumeration var4 = var1.elements();
    boolean var6 = var1.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var2 = new java.util.Vector(1, 1);
    java.lang.Object[] var3 = var2.toArray();
    java.lang.String var4 = var2.toString();
    java.util.Vector var7 = new java.util.Vector(1, 1);
    java.lang.Object[] var8 = var7.toArray();
    boolean var9 = var2.retainAll((java.util.Collection)var7);
    java.util.Vector var13 = new java.util.Vector(1, 1);
    java.lang.Object[] var14 = var13.toArray();
    java.lang.String var15 = var13.toString();
    java.util.Vector var18 = new java.util.Vector(1, 1);
    java.lang.Object[] var19 = var18.toArray();
    boolean var20 = var13.retainAll((java.util.Collection)var18);
    boolean var21 = var13.isEmpty();
    java.util.Vector var24 = new java.util.Vector(1, 1);
    java.lang.Object[] var25 = var24.toArray();
    boolean var26 = var13.add((java.lang.Object)var24);
    boolean var27 = var2.addAll(0, (java.util.Collection)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var2.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

}
