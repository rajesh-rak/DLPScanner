
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = java.awt.EventQueue.isDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var4 = var2.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var9 = var2.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    int var8 = var5.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var10 = var5.removeElement((java.lang.Object)0L);
    boolean var11 = var2.containsAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)1.0f, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    int var8 = var5.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var10 = var5.removeElement((java.lang.Object)0L);
    boolean var11 = var2.containsAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(1, (java.lang.Object)true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.lang.Object[] var8 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    boolean var9 = var2.contains((java.lang.Object)10.0d);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.insertElementAt((java.lang.Object)"", (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var6 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    boolean var4 = var2.equals((java.lang.Object)1.0d);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    var2.clear();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.addAll(0, (java.util.Collection)var11);
    java.util.Vector var32 = new java.util.Vector(1, (-1));
    int var35 = var32.lastIndexOf((java.lang.Object)(-1L), (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var11.addAll(100, (java.util.Collection)var32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    int var8 = var5.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var10 = var5.removeElement((java.lang.Object)0L);
    boolean var11 = var2.containsAll((java.util.Collection)var5);
    java.util.Iterator var12 = var5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.util.Vector var5 = new java.util.Vector(1, (-1));
    int var8 = var5.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var10 = var5.removeElement((java.lang.Object)0L);
    boolean var11 = var2.containsAll((java.util.Collection)var5);
    var5.removeAllElements();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    int var18 = var15.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var19 = var15.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insertElementAt((java.lang.Object)var19, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.addAll(0, (java.util.Collection)var11);
    java.util.Vector var32 = new java.util.Vector(1, (-1));
    java.lang.String var33 = var32.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((-1), (java.lang.Object)var32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.addAll(0, (java.util.Collection)var11);
    java.util.ListIterator var29 = var11.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var31 = var11.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.addAll(0, (java.util.Collection)var11);
    java.util.Vector var32 = new java.util.Vector(1, (-1));
    int var35 = var32.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var36 = var32.iterator();
    java.util.Vector var37 = new java.util.Vector((java.util.Collection)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var2.set((-1), (java.lang.Object)var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var6 = var2.iterator();
    var2.ensureCapacity(10);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.add((java.lang.Object)var11);
    java.util.Vector var31 = new java.util.Vector(1, (-1));
    int var34 = var31.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var36 = var31.removeElement((java.lang.Object)0L);
    boolean var38 = var31.contains((java.lang.Object)10.0d);
    java.util.Vector var39 = new java.util.Vector((java.util.Collection)var31);
    boolean var40 = var11.contains((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    boolean var9 = var2.contains((java.lang.Object)10.0d);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var2);
    var2.trimToSize();
    java.util.Enumeration var12 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    int var8 = var2.indexOf((java.lang.Object)(short)100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.lastIndexOf((java.lang.Object)(-1L), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var7 = var2.removeElement((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.addAll(0, (java.util.Collection)var11);
    java.util.Vector var31 = new java.util.Vector(1, (-1));
    java.util.Vector var34 = new java.util.Vector(1, (-1));
    int var37 = var34.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var39 = var34.removeElement((java.lang.Object)0L);
    boolean var40 = var31.containsAll((java.util.Collection)var34);
    boolean var42 = var34.add((java.lang.Object)100.0f);
    var34.removeAllElements();
    boolean var44 = var11.contains((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var6 = var2.iterator();
    var2.ensureCapacity(10);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.add((java.lang.Object)var11);
    java.util.Vector var31 = new java.util.Vector(1, (-1));
    java.util.Vector var34 = new java.util.Vector(1, (-1));
    int var37 = var34.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var39 = var34.removeElement((java.lang.Object)0L);
    boolean var40 = var31.containsAll((java.util.Collection)var34);
    boolean var41 = var2.add((java.lang.Object)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)10.0d, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(1, (-1));
    int var5 = var2.lastIndexOf((java.lang.Object)(-1L), (-1));
    java.util.Iterator var6 = var2.iterator();
    var2.ensureCapacity(10);
    java.util.Vector var11 = new java.util.Vector(1, (-1));
    java.lang.String var12 = var11.toString();
    java.util.Vector var15 = new java.util.Vector(1, (-1));
    java.util.Vector var18 = new java.util.Vector(1, (-1));
    int var21 = var18.lastIndexOf((java.lang.Object)(-1L), (-1));
    boolean var23 = var18.removeElement((java.lang.Object)0L);
    boolean var24 = var15.containsAll((java.util.Collection)var18);
    boolean var26 = var18.add((java.lang.Object)100.0f);
    boolean var27 = var11.remove((java.lang.Object)var26);
    boolean var28 = var2.add((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var2.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

}
