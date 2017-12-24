
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


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertElementAt((java.lang.Object)(-1), (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    var0.clear();
    java.util.Vector var10 = new java.util.Vector();
    int var12 = var10.indexOf((java.lang.Object)(-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var12, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(1, (java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var10.indexOf((java.lang.Object)0L, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    boolean var10 = var4.equals((java.lang.Object)100);
    java.util.Vector var11 = new java.util.Vector();
    var11.ensureCapacity(0);
    var11.trimToSize();
    boolean var15 = var4.retainAll((java.util.Collection)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var4.set((-1), (java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    int var10 = var0.capacity();
    java.util.Enumeration var11 = var0.elements();
    java.util.Vector var12 = new java.util.Vector();
    var12.ensureCapacity(0);
    var0.insertElementAt((java.lang.Object)var12, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var12.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    int var10 = var0.capacity();
    java.util.Enumeration var11 = var0.elements();
    boolean var12 = var0.isEmpty();
    java.util.ListIterator var14 = var0.listIterator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    var0.clear();
    int var11 = var0.lastIndexOf((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var12 = var10.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var11 = new java.util.Vector();
    java.lang.Object[] var13 = new java.lang.Object[] { (-1.0f)};
    var11.copyInto(var13);
    java.util.Vector var15 = new java.util.Vector();
    java.lang.Object[] var17 = new java.lang.Object[] { (-1.0f)};
    var15.copyInto(var17);
    boolean var19 = var11.addAll((java.util.Collection)var15);
    boolean var21 = var15.equals((java.lang.Object)100);
    java.util.Vector var22 = new java.util.Vector();
    var22.ensureCapacity(0);
    var22.trimToSize();
    boolean var26 = var15.retainAll((java.util.Collection)var22);
    boolean var27 = var0.add((java.lang.Object)var22);
    var0.trimToSize();
    java.util.Vector var29 = new java.util.Vector();
    java.lang.Object[] var31 = new java.lang.Object[] { (-1.0f)};
    var29.copyInto(var31);
    java.util.Vector var33 = new java.util.Vector();
    java.lang.Object[] var35 = new java.lang.Object[] { (-1.0f)};
    var33.copyInto(var35);
    boolean var37 = var29.addAll((java.util.Collection)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var39 = var0.indexOf((java.lang.Object)var33, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var11 = new java.util.Vector();
    java.lang.Object[] var13 = new java.lang.Object[] { (-1.0f)};
    var11.copyInto(var13);
    java.util.Vector var15 = new java.util.Vector();
    java.lang.Object[] var17 = new java.lang.Object[] { (-1.0f)};
    var15.copyInto(var17);
    boolean var19 = var11.addAll((java.util.Collection)var15);
    java.util.Enumeration var20 = var11.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var22 = var10.lastIndexOf((java.lang.Object)var11, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var0.add(var4);
    boolean var7 = var0.removeElement((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    int var10 = var0.capacity();
    java.util.Enumeration var11 = var0.elements();
    boolean var12 = var0.isEmpty();
    var0.addElement((java.lang.Object)(-1L));
    boolean var16 = var0.remove((java.lang.Object)1.0d);
    java.util.ListIterator var17 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var11 = new java.util.Vector();
    java.lang.Object[] var13 = new java.lang.Object[] { (-1.0f)};
    var11.copyInto(var13);
    java.lang.Object var15 = new java.lang.Object();
    boolean var16 = var11.add(var15);
    var11.clear();
    int var18 = var10.lastIndexOf((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var11 = new java.util.Vector();
    var11.ensureCapacity(0);
    var11.trimToSize();
    java.util.Vector var15 = new java.util.Vector();
    var15.ensureCapacity(0);
    java.lang.Object[] var18 = new java.lang.Object[] { 0};
    var11.copyInto(var18);
    boolean var20 = var10.addAll((java.util.Collection)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var22 = var11.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var11 = new java.util.Vector();
    var11.ensureCapacity(0);
    var11.trimToSize();
    java.util.Vector var15 = new java.util.Vector();
    var15.ensureCapacity(0);
    java.lang.Object[] var18 = new java.lang.Object[] { 0};
    var11.copyInto(var18);
    boolean var20 = var10.addAll((java.util.Collection)var11);
    java.util.Vector var21 = new java.util.Vector();
    java.lang.Object[] var23 = new java.lang.Object[] { (-1.0f)};
    var21.copyInto(var23);
    java.util.Vector var25 = new java.util.Vector();
    java.lang.Object[] var27 = new java.lang.Object[] { (-1.0f)};
    var25.copyInto(var27);
    boolean var29 = var21.addAll((java.util.Collection)var25);
    java.util.Enumeration var30 = var21.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setElementAt((java.lang.Object)var30, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var10.subList(100, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.util.Enumeration var9 = var0.elements();
    boolean var11 = var0.add((java.lang.Object)'a');
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[a]"+ "'", var12.equals("[a]"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.Object[] var6 = new java.lang.Object[] { (-1.0f)};
    var4.copyInto(var6);
    boolean var8 = var0.addAll((java.util.Collection)var4);
    java.lang.Object[] var9 = var0.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
