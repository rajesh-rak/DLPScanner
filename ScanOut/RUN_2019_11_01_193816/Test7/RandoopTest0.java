
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var3 = var1.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.set(10, (java.lang.Object)1L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.set(10, (java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    java.util.Vector var5 = new java.util.Vector(10);
    java.util.stream.Stream var6 = var5.stream();
    java.util.Iterator var7 = var5.iterator();
    var1.addElement((java.lang.Object)var7);
    java.lang.Object var9 = var1.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.Iterator var3 = var1.iterator();
    java.lang.String var4 = var1.toString();
    var1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.ListIterator var3 = var1.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(1, 0);
    java.util.Vector var4 = new java.util.Vector(10);
    java.util.stream.Stream var5 = var4.stream();
    java.lang.String var6 = var4.toString();
    java.util.Vector var8 = new java.util.Vector(10);
    java.lang.Object[] var9 = var8.toArray();
    java.lang.Object[] var10 = var4.toArray(var9);
    var2.copyInto(var9);
    java.util.Vector var13 = new java.util.Vector(10);
    java.util.stream.Stream var14 = var13.stream();
    java.lang.String var15 = var13.toString();
    java.util.Vector var17 = new java.util.Vector(10);
    java.util.stream.Stream var18 = var17.stream();
    java.util.Iterator var19 = var17.iterator();
    var13.addElement((java.lang.Object)var19);
    java.lang.Object var21 = var13.clone();
    java.util.Vector var23 = new java.util.Vector(10);
    java.lang.Object[] var24 = var23.toArray();
    boolean var25 = var13.containsAll((java.util.Collection)var23);
    boolean var26 = var2.retainAll((java.util.Collection)var13);
    java.util.Vector var28 = new java.util.Vector(10);
    java.util.stream.Stream var29 = var28.stream();
    java.util.ListIterator var30 = var28.listIterator();
    java.util.Enumeration var31 = var28.elements();
    boolean var32 = var13.containsAll((java.util.Collection)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    var1.ensureCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    java.util.Vector var5 = new java.util.Vector(10);
    java.util.stream.Stream var6 = var5.stream();
    java.util.Iterator var7 = var5.iterator();
    var1.addElement((java.lang.Object)var7);
    java.lang.Object var9 = var1.clone();
    java.lang.Object var10 = var1.lastElement();
    java.util.Vector var12 = new java.util.Vector(10);
    java.util.stream.Stream var13 = var12.stream();
    java.util.Iterator var14 = var12.iterator();
    boolean var15 = var1.containsAll((java.util.Collection)var12);
    int var16 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    java.util.Vector var5 = new java.util.Vector(10);
    java.util.stream.Stream var6 = var5.stream();
    java.util.Iterator var7 = var5.iterator();
    var1.addElement((java.lang.Object)var7);
    var1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.Vector var4 = new java.util.Vector(10);
    java.util.stream.Stream var5 = var4.stream();
    java.lang.String var6 = var4.toString();
    java.util.Vector var8 = new java.util.Vector(10);
    java.util.stream.Stream var9 = var8.stream();
    java.lang.String var10 = var8.toString();
    java.util.Vector var12 = new java.util.Vector(10);
    java.util.stream.Stream var13 = var12.stream();
    java.util.Iterator var14 = var12.iterator();
    var8.addElement((java.lang.Object)var14);
    java.lang.Object var16 = var8.clone();
    java.lang.Object var17 = var8.lastElement();
    boolean var18 = var4.removeAll((java.util.Collection)var8);
    boolean var19 = var1.removeAll((java.util.Collection)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    java.util.Vector var5 = new java.util.Vector(10);
    java.lang.Object[] var6 = var5.toArray();
    java.lang.Object[] var7 = var1.toArray(var6);
    int var8 = var1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.Iterator var3 = var1.iterator();
    java.lang.String var4 = var1.toString();
    java.util.Vector var6 = new java.util.Vector(10);
    java.util.stream.Stream var7 = var6.stream();
    java.lang.String var8 = var6.toString();
    java.util.Vector var10 = new java.util.Vector(10);
    java.lang.Object[] var11 = var10.toArray();
    java.lang.Object[] var12 = var6.toArray(var11);
    boolean var13 = var1.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.util.Iterator var3 = var1.iterator();
    java.lang.String var4 = var1.toString();
    int var5 = var1.capacity();
    boolean var7 = var1.removeElement((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(1, 0);
    java.util.Vector var4 = new java.util.Vector(10);
    java.util.stream.Stream var5 = var4.stream();
    java.lang.String var6 = var4.toString();
    java.util.Vector var8 = new java.util.Vector(10);
    java.lang.Object[] var9 = var8.toArray();
    java.lang.Object[] var10 = var4.toArray(var9);
    var2.copyInto(var9);
    java.util.Vector var13 = new java.util.Vector(10);
    java.util.stream.Stream var14 = var13.stream();
    java.lang.String var15 = var13.toString();
    java.util.Vector var17 = new java.util.Vector(10);
    java.util.stream.Stream var18 = var17.stream();
    java.util.Iterator var19 = var17.iterator();
    var13.addElement((java.lang.Object)var19);
    java.lang.Object var21 = var13.clone();
    java.util.Vector var23 = new java.util.Vector(10);
    java.lang.Object[] var24 = var23.toArray();
    boolean var25 = var13.containsAll((java.util.Collection)var23);
    boolean var26 = var2.retainAll((java.util.Collection)var13);
    java.util.Vector var28 = new java.util.Vector(10);
    java.util.stream.Stream var29 = var28.stream();
    java.util.ListIterator var30 = var28.listIterator();
    java.util.Enumeration var31 = var28.elements();
    boolean var32 = var13.removeAll((java.util.Collection)var28);
    java.util.Vector var34 = new java.util.Vector(10);
    java.util.stream.Stream var35 = var34.stream();
    java.util.ListIterator var36 = var34.listIterator();
    boolean var37 = var13.containsAll((java.util.Collection)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.stream.Stream var2 = var1.stream();
    java.lang.String var3 = var1.toString();
    java.util.Vector var5 = new java.util.Vector(10);
    java.util.stream.Stream var6 = var5.stream();
    java.util.Iterator var7 = var5.iterator();
    var1.addElement((java.lang.Object)var7);
    java.lang.Object var9 = var1.clone();
    var1.clear();
    java.util.Vector var13 = new java.util.Vector(1, 0);
    var1.addElement((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Stack var0 = new java.util.Stack();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.peek();
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 0);
    java.util.Vector var4 = new java.util.Vector(10);
    java.util.stream.Stream var5 = var4.stream();
    java.lang.String var6 = var4.toString();
    java.util.Vector var8 = new java.util.Vector(10);
    java.lang.Object[] var9 = var8.toArray();
    java.lang.Object[] var10 = var4.toArray(var9);
    var2.copyInto(var9);
    java.util.Vector var13 = new java.util.Vector(10);
    java.util.stream.Stream var14 = var13.stream();
    java.lang.String var15 = var13.toString();
    java.util.Vector var17 = new java.util.Vector(10);
    java.util.stream.Stream var18 = var17.stream();
    java.util.Iterator var19 = var17.iterator();
    var13.addElement((java.lang.Object)var19);
    java.lang.Object var21 = var13.clone();
    java.util.Vector var23 = new java.util.Vector(10);
    java.lang.Object[] var24 = var23.toArray();
    boolean var25 = var13.containsAll((java.util.Collection)var23);
    boolean var26 = var2.addAll((java.util.Collection)var13);
    java.util.Vector var28 = new java.util.Vector(10);
    java.util.stream.Stream var29 = var28.stream();
    java.lang.String var30 = var28.toString();
    java.util.Vector var32 = new java.util.Vector(10);
    java.util.stream.Stream var33 = var32.stream();
    java.util.Iterator var34 = var32.iterator();
    var28.addElement((java.lang.Object)var34);
    java.lang.Object var36 = var28.clone();
    java.util.Vector var38 = new java.util.Vector(10);
    java.lang.Object[] var39 = var38.toArray();
    boolean var40 = var28.containsAll((java.util.Collection)var38);
    boolean var41 = var13.removeAll((java.util.Collection)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Stack var0 = new java.util.Stack();
    java.util.Vector var2 = new java.util.Vector(10);
    java.util.stream.Stream var3 = var2.stream();
    java.lang.String var4 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10);
    java.lang.Object[] var7 = var6.toArray();
    java.lang.Object[] var8 = var2.toArray(var7);
    int var9 = var0.search((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

}
