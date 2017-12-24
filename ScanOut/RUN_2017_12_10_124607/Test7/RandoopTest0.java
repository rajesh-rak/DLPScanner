
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.set(1, (java.lang.Object)10.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.lastIndexOf((java.lang.Object)0.0f, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)(-1.0f), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


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

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var5 = new java.util.Vector();
    java.lang.String var6 = var5.toString();
    var5.addElement((java.lang.Object)'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var2.addAll(1, (java.util.Collection)var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var2 = var1.isEmpty();
    var1.removeAllElements();
    java.util.Vector var4 = new java.util.Vector();
    var4.removeAllElements();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var4.removeAll((java.util.Collection)var6);
    boolean var8 = var1.retainAll((java.util.Collection)var4);
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var12 = var11.isEmpty();
    var11.removeAllElements();
    java.util.Vector var14 = new java.util.Vector();
    var14.removeAllElements();
    java.util.Vector var16 = new java.util.Vector();
    boolean var17 = var14.removeAll((java.util.Collection)var16);
    boolean var18 = var11.retainAll((java.util.Collection)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var1.set(100, (java.lang.Object)var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    var0.addElement((java.lang.Object)'a');
    java.util.Enumeration var4 = var0.elements();
    java.util.Vector var6 = new java.util.Vector();
    java.lang.String var7 = var6.toString();
    var6.addElement((java.lang.Object)'a');
    java.util.Enumeration var10 = var6.elements();
    java.util.ListIterator var11 = var6.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.addAll(100, (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.lang.String var2 = var1.toString();
    boolean var3 = var0.add((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[]"+ "'", var2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var2 = var1.isEmpty();
    var1.removeAllElements();
    java.util.Vector var4 = new java.util.Vector();
    var4.removeAllElements();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var4.removeAll((java.util.Collection)var6);
    boolean var8 = var1.retainAll((java.util.Collection)var4);
    int var9 = var1.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.set(1, (java.lang.Object)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.ListIterator var4 = var2.listIterator();
    java.util.ListIterator var5 = var2.listIterator();
    var2.removeAllElements();
    java.lang.Object[] var8 = new java.lang.Object[] { 1L};
    java.lang.Object[] var9 = var2.toArray(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var3 = new java.util.Vector();
    var3.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var3, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var4 = new java.util.Vector(10);
    boolean var5 = var4.isEmpty();
    var4.removeAllElements();
    java.util.Vector var7 = new java.util.Vector();
    var7.removeAllElements();
    java.util.Vector var9 = new java.util.Vector();
    boolean var10 = var7.removeAll((java.util.Collection)var9);
    boolean var11 = var4.retainAll((java.util.Collection)var7);
    boolean var12 = var2.containsAll((java.util.Collection)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.Vector var4 = new java.util.Vector();
    java.lang.String var5 = var4.toString();
    var4.addElement((java.lang.Object)'a');
    java.util.Enumeration var8 = var4.elements();
    java.util.ListIterator var9 = var4.listIterator();
    int var10 = var2.lastIndexOf((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    java.util.Vector var2 = new java.util.Vector();
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    var2.insertElementAt((java.lang.Object)(short)(-1), 0);
    boolean var8 = var0.contains((java.lang.Object)var2);
    java.lang.Object var9 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var2 = var1.isEmpty();
    var1.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)'a', 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.ListIterator var4 = var2.listIterator();
    java.util.ListIterator var5 = var2.listIterator();
    java.util.Vector var6 = new java.util.Vector();
    java.lang.String var7 = var6.toString();
    var6.addElement((java.lang.Object)'a');
    java.util.Enumeration var10 = var6.elements();
    java.util.ListIterator var11 = var6.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)var6, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.ListIterator var4 = var2.listIterator();
    java.util.ListIterator var5 = var2.listIterator();
    java.lang.Object var6 = var2.clone();
    java.util.Vector var7 = new java.util.Vector();
    var7.removeAllElements();
    java.util.Vector var9 = new java.util.Vector();
    boolean var10 = var7.removeAll((java.util.Collection)var9);
    java.util.ListIterator var11 = var9.listIterator();
    boolean var12 = var2.removeElement((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    var0.addElement((java.lang.Object)'a');
    java.util.Enumeration var4 = var0.elements();
    java.util.ListIterator var5 = var0.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var2 = var1.isEmpty();
    var1.addElement((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var4 = var2.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var2 = var1.isEmpty();
    var1.removeAllElements();
    java.util.Vector var4 = new java.util.Vector();
    var4.removeAllElements();
    java.util.Vector var6 = new java.util.Vector();
    boolean var7 = var4.removeAll((java.util.Collection)var6);
    boolean var8 = var1.retainAll((java.util.Collection)var4);
    int var9 = var1.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.String var1 = var0.toString();
    var0.addElement((java.lang.Object)'a');
    boolean var5 = var0.contains((java.lang.Object)100.0f);
    java.util.Vector var6 = new java.util.Vector();
    var6.removeAllElements();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var6.removeAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var8.listIterator();
    java.util.ListIterator var11 = var8.listIterator();
    java.lang.Object var12 = var8.clone();
    boolean var13 = var0.remove(var12);
    java.util.Iterator var14 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var0.removeAll((java.util.Collection)var2);
    java.util.ListIterator var4 = var2.listIterator();
    java.util.ListIterator var5 = var2.listIterator();
    java.lang.Object var6 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var8 = var2.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
