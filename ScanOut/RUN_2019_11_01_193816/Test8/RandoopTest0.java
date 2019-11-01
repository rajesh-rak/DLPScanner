
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    var0.clear();
    var0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var8.retainAll((java.util.Collection)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.add((-1), (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    var0.clear();
    java.util.Vector var3 = new java.util.Vector();
    java.util.stream.Stream var4 = var3.parallelStream();
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var3.retainAll((java.util.Collection)var5);
    boolean var7 = var0.removeAll((java.util.Collection)var3);
    boolean var8 = var3.isEmpty();
    java.util.Spliterator var9 = var3.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    var0.clear();
    java.util.Vector var3 = new java.util.Vector();
    java.util.stream.Stream var4 = var3.parallelStream();
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var3.retainAll((java.util.Collection)var5);
    boolean var7 = var0.removeAll((java.util.Collection)var3);
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    java.util.Vector var10 = new java.util.Vector();
    java.util.stream.Stream var11 = var10.parallelStream();
    boolean var12 = var8.removeAll((java.util.Collection)var10);
    boolean var13 = var0.addAll((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    java.util.stream.Stream var6 = var5.parallelStream();
    boolean var7 = var5.isEmpty();
    java.lang.Object[] var9 = new java.lang.Object[] { (-1.0d)};
    java.lang.Object[] var10 = var5.toArray(var9);
    boolean var11 = var0.contains((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var14 = var0.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.stream.Stream var2 = var1.parallelStream();
    java.util.Vector var3 = new java.util.Vector();
    java.util.stream.Stream var4 = var3.parallelStream();
    java.util.Vector var5 = new java.util.Vector();
    java.util.stream.Stream var6 = var5.parallelStream();
    boolean var7 = var3.removeAll((java.util.Collection)var5);
    boolean var8 = var1.removeAll((java.util.Collection)var5);
    boolean var9 = var0.retainAll((java.util.Collection)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


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

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.util.Vector var7 = new java.util.Vector();
    java.util.stream.Stream var8 = var7.parallelStream();
    var7.clear();
    java.util.Vector var10 = new java.util.Vector();
    java.util.stream.Stream var11 = var10.parallelStream();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var10.retainAll((java.util.Collection)var12);
    boolean var14 = var7.removeAll((java.util.Collection)var10);
    boolean var15 = var0.retainAll((java.util.Collection)var7);
    int var17 = var7.indexOf((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.util.Vector var7 = new java.util.Vector();
    java.util.stream.Stream var8 = var7.parallelStream();
    var7.clear();
    java.util.Vector var10 = new java.util.Vector();
    java.util.stream.Stream var11 = var10.parallelStream();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var10.retainAll((java.util.Collection)var12);
    boolean var14 = var7.removeAll((java.util.Collection)var10);
    boolean var15 = var0.retainAll((java.util.Collection)var7);
    java.util.Iterator var16 = var7.iterator();
    java.util.stream.Stream var17 = var7.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Enumeration var2 = var0.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var8 = var0.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    java.util.stream.Stream var6 = var5.parallelStream();
    boolean var7 = var5.isEmpty();
    java.lang.Object[] var9 = new java.lang.Object[] { (-1.0d)};
    java.lang.Object[] var10 = var5.toArray(var9);
    boolean var11 = var0.contains((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector((java.util.Collection)var0);
    java.util.Enumeration var13 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    java.util.Vector var10 = new java.util.Vector();
    java.util.stream.Stream var11 = var10.parallelStream();
    boolean var12 = var8.removeAll((java.util.Collection)var10);
    java.util.Vector var13 = new java.util.Vector();
    boolean var14 = var8.remove((java.lang.Object)var13);
    java.util.Vector var15 = new java.util.Vector();
    java.util.stream.Stream var16 = var15.parallelStream();
    var15.clear();
    java.util.Vector var18 = new java.util.Vector();
    java.util.stream.Stream var19 = var18.parallelStream();
    java.util.Vector var20 = new java.util.Vector();
    boolean var21 = var18.retainAll((java.util.Collection)var20);
    boolean var22 = var15.removeAll((java.util.Collection)var18);
    boolean var23 = var8.retainAll((java.util.Collection)var15);
    java.util.Iterator var24 = var15.iterator();
    var15.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var0.set(100, (java.lang.Object)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    var0.clear();
    java.util.Vector var3 = new java.util.Vector();
    java.util.stream.Stream var4 = var3.parallelStream();
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var3.retainAll((java.util.Collection)var5);
    boolean var7 = var0.removeAll((java.util.Collection)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var9 = var0.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.stream.Stream var2 = var1.parallelStream();
    java.util.Vector var3 = new java.util.Vector();
    java.util.stream.Stream var4 = var3.parallelStream();
    boolean var5 = var1.removeAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var1.remove((java.lang.Object)var6);
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    var8.clear();
    java.util.Vector var11 = new java.util.Vector();
    java.util.stream.Stream var12 = var11.parallelStream();
    java.util.Vector var13 = new java.util.Vector();
    boolean var14 = var11.retainAll((java.util.Collection)var13);
    boolean var15 = var8.removeAll((java.util.Collection)var11);
    boolean var16 = var1.retainAll((java.util.Collection)var8);
    java.util.Iterator var17 = var8.iterator();
    var8.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var8, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    java.util.Vector var4 = new java.util.Vector();
    java.util.stream.Stream var5 = var4.parallelStream();
    boolean var6 = var2.removeAll((java.util.Collection)var4);
    boolean var7 = var0.removeAll((java.util.Collection)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var4.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    java.util.stream.Stream var6 = var5.parallelStream();
    boolean var7 = var5.isEmpty();
    java.lang.Object[] var9 = new java.lang.Object[] { (-1.0d)};
    java.lang.Object[] var10 = var5.toArray(var9);
    boolean var11 = var0.contains((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.lang.Object var7 = var5.clone();
    java.util.stream.Stream var8 = var5.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Enumeration var5 = var2.elements();
    java.util.Vector var6 = new java.util.Vector();
    java.util.stream.Stream var7 = var6.parallelStream();
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    boolean var10 = var6.removeAll((java.util.Collection)var8);
    java.util.Vector var11 = new java.util.Vector();
    boolean var12 = var6.remove((java.lang.Object)var11);
    java.util.Vector var13 = new java.util.Vector();
    java.util.stream.Stream var14 = var13.parallelStream();
    var13.clear();
    java.util.Vector var16 = new java.util.Vector();
    java.util.stream.Stream var17 = var16.parallelStream();
    java.util.Vector var18 = new java.util.Vector();
    boolean var19 = var16.retainAll((java.util.Collection)var18);
    boolean var20 = var13.removeAll((java.util.Collection)var16);
    boolean var21 = var6.retainAll((java.util.Collection)var13);
    boolean var22 = var2.retainAll((java.util.Collection)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var13.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.retainAll((java.util.Collection)var2);
    java.lang.Object[] var4 = var2.toArray();
    java.util.Vector var6 = new java.util.Vector();
    java.util.stream.Stream var7 = var6.parallelStream();
    java.util.Vector var8 = new java.util.Vector();
    java.util.stream.Stream var9 = var8.parallelStream();
    boolean var10 = var6.removeAll((java.util.Collection)var8);
    java.util.Vector var11 = new java.util.Vector();
    java.util.stream.Stream var12 = var11.parallelStream();
    boolean var13 = var11.isEmpty();
    java.lang.Object[] var15 = new java.lang.Object[] { (-1.0d)};
    java.lang.Object[] var16 = var11.toArray(var15);
    boolean var17 = var6.contains((java.lang.Object)var15);
    java.util.Vector var18 = new java.util.Vector((java.util.Collection)var6);
    var2.add(0, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    java.util.Vector var7 = new java.util.Vector();
    java.util.stream.Stream var8 = var7.parallelStream();
    var7.clear();
    java.util.Vector var10 = new java.util.Vector();
    java.util.stream.Stream var11 = var10.parallelStream();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var10.retainAll((java.util.Collection)var12);
    boolean var14 = var7.removeAll((java.util.Collection)var10);
    boolean var15 = var0.retainAll((java.util.Collection)var7);
    java.util.Vector var17 = new java.util.Vector();
    java.util.stream.Stream var18 = var17.parallelStream();
    java.util.Vector var19 = new java.util.Vector();
    java.util.stream.Stream var20 = var19.parallelStream();
    boolean var21 = var17.removeAll((java.util.Collection)var19);
    java.util.Enumeration var22 = var19.elements();
    boolean var23 = var0.addAll(0, (java.util.Collection)var19);
    int var26 = var0.indexOf((java.lang.Object)(short)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    boolean var4 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var0.remove((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setElementAt((java.lang.Object)'4', (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.stream.Stream var1 = var0.parallelStream();
    java.util.Vector var2 = new java.util.Vector();
    java.util.stream.Stream var3 = var2.parallelStream();
    java.util.Vector var4 = new java.util.Vector();
    java.util.stream.Stream var5 = var4.parallelStream();
    boolean var6 = var2.removeAll((java.util.Collection)var4);
    boolean var7 = var0.removeAll((java.util.Collection)var4);
    int var10 = var4.indexOf((java.lang.Object)(byte)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

}
