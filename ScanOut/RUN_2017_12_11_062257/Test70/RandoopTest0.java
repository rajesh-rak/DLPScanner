
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(1, (java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(100, (java.lang.Object)10.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add((-1), (java.lang.Object)(-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var4 = new java.util.Hashtable(1);
    java.util.Collection var5 = var4.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var7 = new com.sun.jndi.ldap.LdapCtx("", "hi!", 10, var4, false);
      fail("Expected exception of type javax.naming.CommunicationException");
    } catch (javax.naming.CommunicationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    boolean var3 = var1.containsValue((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var1.addAll((java.util.Collection)var2);
    java.util.ListIterator var4 = var1.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var4, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var4 = new java.util.Hashtable(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jndi.ldap.LdapCtx var6 = new com.sun.jndi.ldap.LdapCtx("[]", "[]", 10, var4, true);
      fail("Expected exception of type javax.naming.InvalidNameException");
    } catch (javax.naming.InvalidNameException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.lang.String var3 = var1.toString();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var6 = var1.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var0.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var0.subList((-1), (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Collection var2 = var1.values();
    java.lang.Object var5 = var1.put((java.lang.Object)(byte)0, (java.lang.Object)100.0f);
    java.util.Set var6 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var1.lastIndexOf((java.lang.Object)100.0f, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    int var8 = var1.indexOf((java.lang.Object)var7);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var9.addAll((java.util.Collection)var10);
    java.lang.String var12 = var10.toString();
    boolean var13 = var10.isEmpty();
    int var14 = var1.indexOf((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var1.equals((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var4 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var4.addAll((java.util.Collection)var5);
    var5.setSize(1);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var9.addAll((java.util.Collection)var10);
    int var12 = var5.indexOf((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var12, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    int var8 = var1.indexOf((java.lang.Object)var7);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var9.addAll((java.util.Collection)var10);
    boolean var12 = var1.retainAll((java.util.Collection)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

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


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Collection var2 = var1.values();
    java.lang.Object var5 = var1.put((java.lang.Object)(byte)0, (java.lang.Object)100.0f);
    java.lang.String var6 = var1.toString();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{0=100.0}"+ "'", var6.equals("{0=100.0}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.Object var2 = var1.clone();
    java.util.Enumeration var3 = var1.elements();
    java.util.Vector var4 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var4.addAll((java.util.Collection)var5);
    var5.setSize(1);
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var9.addAll((java.util.Collection)var10);
    int var12 = var5.indexOf((java.lang.Object)var11);
    java.util.Vector var13 = new java.util.Vector();
    java.util.Vector var14 = new java.util.Vector();
    boolean var15 = var13.addAll((java.util.Collection)var14);
    boolean var16 = var5.retainAll((java.util.Collection)var14);
    java.lang.Object var17 = var1.remove((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.lang.String var3 = var1.toString();
    java.util.Hashtable var5 = new java.util.Hashtable(0);
    java.lang.Object var6 = var5.clone();
    boolean var7 = var1.add((java.lang.Object)var5);
    int var8 = var5.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Enumeration var2 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.set(100, (java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    int var8 = var1.indexOf((java.lang.Object)var7);
    java.lang.Object var9 = var1.lastElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var5 = var4.toArray();
    var3.copyInto(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var1.subList(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.Object var2 = var1.clone();
    java.util.Enumeration var3 = var1.elements();
    java.util.Collection var4 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var0);
    var3.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var2.addAll((java.util.Collection)var3);
    java.lang.String var5 = var3.toString();
    java.util.Hashtable var7 = new java.util.Hashtable(0);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var3.add((java.lang.Object)var7);
    java.util.ListIterator var11 = var3.listIterator(0);
    var0.addElement((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var0);
    var3.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
