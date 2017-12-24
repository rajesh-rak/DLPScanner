
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.Set var3 = sun.awt.AppContext.getAppContexts();
    boolean var4 = var0.removeAll((java.util.Collection)var3);
    java.util.Set var5 = sun.awt.AppContext.getAppContexts();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var5, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector();
    var2.removeAllElements();
    boolean var5 = var2.removeElement((java.lang.Object)(byte)100);
    boolean var6 = var0.addAll(0, (java.util.Collection)var2);
    java.util.ListIterator var7 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    boolean var3 = var0.removeElement((java.lang.Object)(byte)100);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var4.subList(1, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var1.listIterator();
    int var4 = var1.capacity();
    java.util.ListIterator var5 = var1.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector();
    var2.removeAllElements();
    boolean var5 = var2.removeElement((java.lang.Object)(byte)100);
    boolean var6 = var0.addAll(0, (java.util.Collection)var2);
    var2.ensureCapacity(100);
    java.util.Iterator var9 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var2.subList(0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.awt.EventQueue var3 = new java.awt.EventQueue();
    int var4 = var0.lastIndexOf((java.lang.Object)var3);
    boolean var6 = var0.equals((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    boolean var3 = var0.removeElement((java.lang.Object)(byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var1.listIterator();
    int var4 = var1.capacity();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    boolean var3 = var0.removeElement((java.lang.Object)(byte)100);
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var0);
    java.awt.EventQueue var6 = new java.awt.EventQueue();
    java.awt.AWTEvent var7 = var6.peekEvent();
    java.awt.SecondaryLoop var8 = var6.createSecondaryLoop();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((-1), (java.lang.Object)var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.AWTEvent var1 = var0.peekEvent();
    java.awt.AWTEvent var2 = var0.peekEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.Set var3 = sun.awt.AppContext.getAppContexts();
    boolean var4 = var0.removeAll((java.util.Collection)var3);
    java.util.Vector var6 = new java.util.Vector();
    java.util.Vector var7 = new java.util.Vector();
    boolean var8 = var6.removeAll((java.util.Collection)var7);
    java.awt.EventQueue var9 = new java.awt.EventQueue();
    int var10 = var6.lastIndexOf((java.lang.Object)var9);
    boolean var11 = var0.addAll(0, (java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var6.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.EventQueue var1 = new java.awt.EventQueue();
    java.awt.AWTEvent var2 = var1.peekEvent();
    var0.push(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector();
    var2.removeAllElements();
    boolean var5 = var2.removeElement((java.lang.Object)(byte)100);
    boolean var6 = var0.addAll(0, (java.util.Collection)var2);
    var2.ensureCapacity(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.awt.EventQueue var3 = new java.awt.EventQueue();
    int var4 = var0.lastIndexOf((java.lang.Object)var3);
    boolean var6 = var0.equals((java.lang.Object)0);
    var0.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector();
    var5.removeAllElements();
    boolean var8 = var5.removeElement((java.lang.Object)(byte)100);
    boolean var9 = var3.addAll(0, (java.util.Collection)var5);
    var0.addElement((java.lang.Object)var3);
    java.util.Vector var11 = new java.util.Vector();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var11.removeAll((java.util.Collection)var12);
    java.util.Set var14 = sun.awt.AppContext.getAppContexts();
    boolean var15 = var11.removeAll((java.util.Collection)var14);
    boolean var16 = var0.contains((java.lang.Object)var14);
    var0.setSize(10);
    java.util.ListIterator var19 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector();
    var5.removeAllElements();
    boolean var8 = var5.removeElement((java.lang.Object)(byte)100);
    boolean var9 = var3.addAll(0, (java.util.Collection)var5);
    var0.addElement((java.lang.Object)var3);
    java.util.Vector var11 = new java.util.Vector();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var11.removeAll((java.util.Collection)var12);
    java.util.Set var14 = sun.awt.AppContext.getAppContexts();
    boolean var15 = var11.removeAll((java.util.Collection)var14);
    boolean var16 = var0.contains((java.lang.Object)var14);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    var1.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.lastIndexOf((java.lang.Object)(byte)(-1), 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.ListIterator var2 = var0.listIterator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.removeAllElements();
    var0.ensureCapacity(1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512964575174L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.removeAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector();
    java.util.Vector var5 = new java.util.Vector();
    var5.removeAllElements();
    boolean var8 = var5.removeElement((java.lang.Object)(byte)100);
    boolean var9 = var3.addAll(0, (java.util.Collection)var5);
    var0.addElement((java.lang.Object)var3);
    java.util.Vector var11 = new java.util.Vector();
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var11.removeAll((java.util.Collection)var12);
    java.util.Set var14 = sun.awt.AppContext.getAppContexts();
    boolean var15 = var11.removeAll((java.util.Collection)var14);
    boolean var16 = var0.contains((java.lang.Object)var14);
    java.lang.Object var17 = var0.firstElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var0.set(10, (java.lang.Object)0.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

}
