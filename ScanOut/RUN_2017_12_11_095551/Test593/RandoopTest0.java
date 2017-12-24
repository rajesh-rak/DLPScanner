
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    boolean var7 = var0.contains((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    boolean var7 = var0.contains((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(10, (java.lang.Object)100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    int var2 = var0.indexOf((java.lang.Object)"hi!");
    boolean var3 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(1, (java.lang.Object)(byte)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var3 = var1.contains((java.lang.Object)100);
    int var4 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    java.util.Iterator var6 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var4 = new java.util.Vector();
    int var6 = var4.indexOf((java.lang.Object)"hi!");
    boolean var7 = var2.addAll((java.util.Collection)var4);
    boolean var9 = var2.contains((java.lang.Object)0L);
    java.lang.Object[] var11 = new java.lang.Object[] { (byte)100};
    java.lang.Object[] var12 = var2.toArray(var11);
    java.lang.Object[] var13 = var0.toArray(var12);
    java.util.Vector var14 = new java.util.Vector();
    java.util.Vector var15 = new java.util.Vector((java.util.Collection)var14);
    boolean var17 = var15.contains((java.lang.Object)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var0.indexOf((java.lang.Object)var15, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(10);
    var1.ensureCapacity(100);
    java.lang.Object[] var4 = var1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    int var6 = var0.size();
    int var7 = var0.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    boolean var5 = var3.contains((java.lang.Object)100);
    boolean var6 = var1.retainAll((java.util.Collection)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.lang.Object[] var2 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var4 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector();
    int var8 = var6.indexOf((java.lang.Object)"hi!");
    boolean var9 = var4.addAll((java.util.Collection)var6);
    boolean var11 = var4.contains((java.lang.Object)0L);
    java.lang.Object[] var13 = new java.lang.Object[] { (byte)100};
    java.lang.Object[] var14 = var4.toArray(var13);
    java.lang.Object[] var15 = var2.toArray(var14);
    java.lang.Object[] var16 = var0.toArray(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    java.util.Enumeration var6 = var2.elements();
    java.lang.Object var7 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    int var7 = var2.lastIndexOf((java.lang.Object)'a');
    java.lang.Object[] var8 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    int var2 = var0.indexOf((java.lang.Object)"hi!");
    boolean var3 = var0.isEmpty();
    boolean var5 = var0.contains((java.lang.Object)true);
    var0.setSize(1);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    boolean var11 = var0.removeAll((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(10);
    var1.ensureCapacity(100);
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var3 = var1.contains((java.lang.Object)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    int var6 = var0.size();
    java.lang.String var7 = var0.toString();
    var0.ensureCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    boolean var7 = var0.contains((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var9 = var0.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.set(10, (java.lang.Object)(-1.0f));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    boolean var3 = var1.contains((java.lang.Object)100);
    var1.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    boolean var7 = var0.contains((java.lang.Object)0L);
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    int var4 = var2.indexOf((java.lang.Object)"hi!");
    boolean var5 = var0.addAll((java.util.Collection)var2);
    boolean var7 = var0.contains((java.lang.Object)0L);
    java.util.Vector var8 = new java.util.Vector();
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var8);
    java.util.Vector var10 = new java.util.Vector();
    int var12 = var10.indexOf((java.lang.Object)"hi!");
    boolean var13 = var8.addAll((java.util.Collection)var10);
    boolean var14 = var0.retainAll((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var0 = new java.util.Vector();
    int var2 = var0.indexOf((java.lang.Object)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.indexOf((java.lang.Object)"hi!", (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

}
