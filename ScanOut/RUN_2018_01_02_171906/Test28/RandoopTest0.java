
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


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(1, (java.lang.Object)(short)100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    java.util.ListIterator var8 = var5.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Iterator var7 = var5.iterator();
    java.util.Iterator var8 = var5.iterator();
    java.lang.Object[] var10 = new java.lang.Object[] { ""};
    var5.copyInto(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Iterator var7 = var5.iterator();
    java.util.Iterator var8 = var5.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Iterator var7 = var5.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.lang.Object[] var7 = var0.toArray();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.removeElement((java.lang.Object)10);
    boolean var7 = var3.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var8 = new java.util.Vector();
    int var9 = var3.indexOf((java.lang.Object)var8);
    java.util.Enumeration var10 = var8.elements();
    java.util.ListIterator var11 = var8.listIterator();
    boolean var12 = var0.contains((java.lang.Object)var8);
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.add((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var0.removeAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector();
    boolean var8 = var6.removeElement((java.lang.Object)10);
    java.util.Vector var9 = new java.util.Vector();
    boolean var11 = var9.removeElement((java.lang.Object)10);
    boolean var13 = var9.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var14 = new java.util.Vector();
    int var15 = var9.indexOf((java.lang.Object)var14);
    java.util.Enumeration var16 = var14.elements();
    java.util.ListIterator var17 = var14.listIterator();
    boolean var18 = var6.contains((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var3.set(100, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    boolean var9 = var5.remove((java.lang.Object)1L);
    java.util.Vector var11 = new java.util.Vector();
    boolean var13 = var11.removeElement((java.lang.Object)10);
    boolean var15 = var11.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var16 = new java.util.Vector();
    int var17 = var11.indexOf((java.lang.Object)var16);
    java.util.Enumeration var18 = var16.elements();
    java.util.ListIterator var19 = var16.listIterator();
    java.lang.Object var20 = var16.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var5.set(1, var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    boolean var9 = var5.remove((java.lang.Object)1L);
    boolean var11 = var5.remove((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    var0.setSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    var0.clear();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.lang.Object var7 = var5.clone();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    boolean var9 = var5.remove((java.lang.Object)1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Vector var7 = new java.util.Vector();
    boolean var9 = var7.removeElement((java.lang.Object)10);
    java.util.Vector var10 = new java.util.Vector();
    boolean var12 = var10.removeElement((java.lang.Object)10);
    boolean var14 = var10.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var15 = new java.util.Vector();
    int var16 = var10.indexOf((java.lang.Object)var15);
    java.util.Enumeration var17 = var15.elements();
    java.util.ListIterator var18 = var15.listIterator();
    boolean var19 = var7.contains((java.lang.Object)var15);
    java.util.Vector var20 = new java.util.Vector();
    boolean var22 = var20.removeElement((java.lang.Object)10);
    boolean var24 = var20.contains((java.lang.Object)(byte)(-1));
    var20.clear();
    boolean var26 = var7.containsAll((java.util.Collection)var20);
    boolean var27 = var5.removeAll((java.util.Collection)var7);
    boolean var29 = var7.equals((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    java.util.ListIterator var8 = var5.listIterator();
    java.lang.Object var9 = var5.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var5.subList((-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.removeElement((java.lang.Object)10);
    boolean var9 = var5.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var10 = new java.util.Vector();
    int var11 = var5.indexOf((java.lang.Object)var10);
    java.util.Enumeration var12 = var10.elements();
    java.util.ListIterator var13 = var10.listIterator();
    java.lang.Object var14 = var10.clone();
    java.lang.Object[] var15 = var10.toArray();
    java.lang.Object[] var16 = var0.toArray(var15);
    java.util.Vector var17 = new java.util.Vector();
    boolean var19 = var17.removeElement((java.lang.Object)10);
    boolean var21 = var17.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var22 = new java.util.Vector();
    int var23 = var17.indexOf((java.lang.Object)var22);
    java.util.Enumeration var24 = var22.elements();
    java.util.ListIterator var25 = var22.listIterator();
    java.lang.Object var26 = var22.clone();
    boolean var27 = var0.contains((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.ListIterator var7 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.removeElement((java.lang.Object)10);
    boolean var7 = var3.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var8 = new java.util.Vector();
    int var9 = var3.indexOf((java.lang.Object)var8);
    java.util.Enumeration var10 = var8.elements();
    java.util.ListIterator var11 = var8.listIterator();
    boolean var12 = var0.contains((java.lang.Object)var8);
    java.util.Vector var13 = new java.util.Vector();
    boolean var15 = var13.removeElement((java.lang.Object)10);
    boolean var17 = var13.contains((java.lang.Object)(byte)(-1));
    var13.clear();
    boolean var19 = var0.containsAll((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector();
    boolean var22 = var20.removeElement((java.lang.Object)10);
    java.util.Vector var23 = new java.util.Vector();
    boolean var24 = var20.removeAll((java.util.Collection)var23);
    boolean var25 = var13.containsAll((java.util.Collection)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    java.util.Vector var3 = new java.util.Vector();
    boolean var5 = var3.removeElement((java.lang.Object)10);
    boolean var7 = var3.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var8 = new java.util.Vector();
    int var9 = var3.indexOf((java.lang.Object)var8);
    java.util.Enumeration var10 = var8.elements();
    java.util.ListIterator var11 = var8.listIterator();
    boolean var12 = var0.contains((java.lang.Object)var8);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)10);
    boolean var4 = var0.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var5 = new java.util.Vector();
    int var6 = var0.indexOf((java.lang.Object)var5);
    java.util.Enumeration var7 = var5.elements();
    java.util.ListIterator var8 = var5.listIterator();
    java.lang.Object var9 = var5.clone();
    java.lang.Object[] var10 = var5.toArray();
    java.util.Vector var11 = new java.util.Vector();
    boolean var13 = var11.removeElement((java.lang.Object)10);
    java.util.Vector var14 = new java.util.Vector();
    boolean var16 = var14.removeElement((java.lang.Object)10);
    boolean var18 = var14.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var19 = new java.util.Vector();
    int var20 = var14.indexOf((java.lang.Object)var19);
    java.util.Enumeration var21 = var19.elements();
    java.util.ListIterator var22 = var19.listIterator();
    boolean var23 = var11.contains((java.lang.Object)var19);
    java.util.Vector var24 = new java.util.Vector();
    boolean var26 = var24.removeElement((java.lang.Object)10);
    boolean var28 = var24.contains((java.lang.Object)(byte)(-1));
    var24.clear();
    boolean var30 = var11.containsAll((java.util.Collection)var24);
    boolean var31 = var5.addAll((java.util.Collection)var11);
    java.util.Vector var32 = new java.util.Vector();
    boolean var34 = var32.removeElement((java.lang.Object)10);
    boolean var36 = var32.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var37 = new java.util.Vector();
    int var38 = var32.indexOf((java.lang.Object)var37);
    java.util.Vector var39 = new java.util.Vector();
    boolean var41 = var39.removeElement((java.lang.Object)10);
    java.util.Vector var42 = new java.util.Vector();
    boolean var44 = var42.removeElement((java.lang.Object)10);
    boolean var46 = var42.contains((java.lang.Object)(byte)(-1));
    java.util.Vector var47 = new java.util.Vector();
    int var48 = var42.indexOf((java.lang.Object)var47);
    java.util.Enumeration var49 = var47.elements();
    java.util.ListIterator var50 = var47.listIterator();
    boolean var51 = var39.contains((java.lang.Object)var47);
    java.util.Vector var52 = new java.util.Vector();
    boolean var54 = var52.removeElement((java.lang.Object)10);
    boolean var56 = var52.contains((java.lang.Object)(byte)(-1));
    var52.clear();
    boolean var58 = var39.containsAll((java.util.Collection)var52);
    boolean var59 = var37.removeAll((java.util.Collection)var39);
    int var61 = var5.indexOf((java.lang.Object)var37, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));

  }

}
