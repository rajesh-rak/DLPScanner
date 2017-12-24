
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)true, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.text.LayoutQueue var0 = new javax.swing.text.LayoutQueue();
    javax.swing.text.LayoutQueue.setDefaultQueue(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode((-1), "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    int var3 = var2.capacity();
    java.lang.String var4 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((-1), (java.lang.Object)10L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    var5.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var2.subList((-1), 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    int var8 = var5.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(100);
    int var2 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    java.lang.String var8 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    int var3 = var2.capacity();
    java.lang.String var4 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.lastIndexOf((java.lang.Object)100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var2 = new java.util.Vector();
    java.lang.Object[] var3 = new java.lang.Object[] { var2};
    java.lang.Object[] var4 = var1.toArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var2 = new javax.swing.text.LayoutQueue();
    boolean var3 = var1.remove((java.lang.Object)var2);
    java.util.Vector var6 = new java.util.Vector(10, 100);
    java.util.Vector var9 = new java.util.Vector(10, 100);
    int var10 = var9.capacity();
    boolean var11 = var6.removeAll((java.util.Collection)var9);
    boolean var13 = var6.equals((java.lang.Object)10.0f);
    java.lang.Object[] var14 = var6.toArray();
    var1.copyInto(var14);
    java.lang.String var16 = var1.toString();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[]"+ "'", var16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    int var9 = var5.indexOf((java.lang.Object)"[]");
    java.lang.Object var10 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var2 = new javax.swing.text.LayoutQueue();
    boolean var3 = var1.remove((java.lang.Object)var2);
    java.util.Vector var6 = new java.util.Vector(10, 100);
    java.util.Vector var9 = new java.util.Vector(10, 100);
    int var10 = var9.capacity();
    boolean var11 = var6.removeAll((java.util.Collection)var9);
    boolean var13 = var6.equals((java.lang.Object)10.0f);
    java.lang.Object[] var14 = var6.toArray();
    var1.copyInto(var14);
    java.util.ListIterator var16 = var1.listIterator();
    java.util.Vector var18 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var19 = new javax.swing.text.LayoutQueue();
    boolean var20 = var18.remove((java.lang.Object)var19);
    boolean var21 = var1.addAll((java.util.Collection)var18);
    boolean var23 = var18.remove((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var2 = new javax.swing.text.LayoutQueue();
    boolean var3 = var1.remove((java.lang.Object)var2);
    java.util.Vector var6 = new java.util.Vector(10, 100);
    java.util.Vector var9 = new java.util.Vector(10, 100);
    int var10 = var9.capacity();
    boolean var11 = var6.removeAll((java.util.Collection)var9);
    boolean var13 = var6.equals((java.lang.Object)10.0f);
    java.lang.Object[] var14 = var6.toArray();
    var1.copyInto(var14);
    java.util.ListIterator var16 = var1.listIterator();
    java.util.Vector var18 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var19 = new javax.swing.text.LayoutQueue();
    boolean var20 = var18.remove((java.lang.Object)var19);
    boolean var21 = var1.addAll((java.util.Collection)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var18.set(100, (java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    boolean var9 = var2.equals((java.lang.Object)10.0f);
    java.lang.Object[] var10 = var2.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(100);
    javax.swing.text.LayoutQueue var2 = new javax.swing.text.LayoutQueue();
    boolean var3 = var1.remove((java.lang.Object)var2);
    java.util.Vector var6 = new java.util.Vector(10, 100);
    java.util.Vector var9 = new java.util.Vector(10, 100);
    int var10 = var9.capacity();
    boolean var11 = var6.removeAll((java.util.Collection)var9);
    boolean var13 = var6.equals((java.lang.Object)10.0f);
    java.lang.Object[] var14 = var6.toArray();
    var1.copyInto(var14);
    var1.ensureCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    boolean var9 = var2.removeElement((java.lang.Object)(short)1);
    boolean var11 = var2.add((java.lang.Object)(short)0);
    java.lang.Object var12 = var2.firstElement();
    java.lang.Object var13 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)0+ "'", var12.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.lang.Object var3 = var0.get((java.lang.Object)"sun.awt.AppContext[threadGroup=system]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    int var6 = var5.capacity();
    boolean var7 = var2.removeAll((java.util.Collection)var5);
    int var8 = var2.capacity();
    var2.setSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

}
