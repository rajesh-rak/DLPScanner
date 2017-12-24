
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512954230018L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.clear();
    java.util.Iterator var2 = var0.iterator();
    var0.ensureCapacity(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector();
    var9.clear();
    var5.addElement((java.lang.Object)var9);
    java.lang.Object var13 = var5.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    java.util.Vector var2 = new java.util.Vector();
    var2.clear();
    java.util.Iterator var4 = var2.iterator();
    var2.ensureCapacity(10);
    boolean var7 = var0.addAll((java.util.Collection)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.clear();
    java.util.Iterator var2 = var0.iterator();
    var0.ensureCapacity(10);
    int var6 = var0.indexOf((java.lang.Object)100.0f);
    java.util.Vector var7 = new java.util.Vector();
    var7.clear();
    boolean var9 = var0.addAll((java.util.Collection)var7);
    java.util.Vector var11 = new java.util.Vector();
    var11.setSize(100);
    boolean var15 = var11.remove((java.lang.Object)0L);
    java.util.Vector var16 = new java.util.Vector();
    var16.setSize(100);
    boolean var19 = var11.containsAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector();
    var20.clear();
    var16.addElement((java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var0.addAll(1, (java.util.Collection)var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector();
    var9.clear();
    var5.addElement((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector();
    var12.setSize(100);
    boolean var16 = var12.remove((java.lang.Object)0L);
    java.util.Vector var17 = new java.util.Vector();
    var17.setSize(100);
    boolean var20 = var12.containsAll((java.util.Collection)var17);
    java.util.Vector var21 = new java.util.Vector();
    var21.clear();
    var17.addElement((java.lang.Object)var21);
    boolean var24 = var5.containsAll((java.util.Collection)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var1 = var0.createSecondaryLoop();
    java.awt.EventQueue var2 = new java.awt.EventQueue();
    var0.push(var2);
    java.awt.SecondaryLoop var4 = var2.createSecondaryLoop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.EventQueue var0 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var1 = var0.createSecondaryLoop();
    java.awt.EventQueue var2 = new java.awt.EventQueue();
    var0.push(var2);
    java.awt.EventQueue var4 = new java.awt.EventQueue();
    java.awt.EventQueue var5 = new java.awt.EventQueue();
    java.awt.SecondaryLoop var6 = var5.createSecondaryLoop();
    var4.push(var5);
    var0.push(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    int var6 = var0.lastIndexOf((java.lang.Object)true);
    boolean var8 = var0.contains((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    var0.addElement((java.lang.Object)1512954230018L);
    boolean var11 = var0.isEmpty();
    var0.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    int var2 = var0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector();
    var9.clear();
    var5.addElement((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector();
    var12.setSize(100);
    boolean var16 = var12.remove((java.lang.Object)0L);
    int var18 = var12.lastIndexOf((java.lang.Object)true);
    boolean var19 = var5.addAll((java.util.Collection)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    var0.addElement((java.lang.Object)1512954230018L);
    boolean var11 = var0.isEmpty();
    boolean var13 = var0.remove((java.lang.Object)'a');
    var0.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector();
    var9.clear();
    var5.addElement((java.lang.Object)var9);
    java.util.Vector var12 = new java.util.Vector();
    int var13 = var12.capacity();
    java.lang.Object[] var14 = new java.lang.Object[] { var13};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.copyInto(var14);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    var0.addElement((java.lang.Object)1512954230018L);
    java.lang.Object var11 = var0.firstElement();
    java.util.Iterator var12 = var0.iterator();
    var0.removeElementAt(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)false, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.clear();
    java.util.Iterator var2 = var0.iterator();
    var0.ensureCapacity(10);
    int var6 = var0.indexOf((java.lang.Object)100.0f);
    java.util.Vector var7 = new java.util.Vector();
    var7.clear();
    boolean var9 = var0.addAll((java.util.Collection)var7);
    boolean var11 = var7.add((java.lang.Object)' ');
    java.lang.Object[] var12 = var7.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    int var4 = var0.lastIndexOf((java.lang.Object)1.0d, (-1));
    java.lang.Object var5 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    var0.setSize(100);
    boolean var4 = var0.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector();
    var5.setSize(100);
    boolean var8 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    int var4 = var0.lastIndexOf((java.lang.Object)1.0d, (-1));
    java.util.Vector var5 = new java.util.Vector();
    var5.clear();
    java.util.Iterator var7 = var5.iterator();
    var5.ensureCapacity(10);
    int var11 = var5.indexOf((java.lang.Object)100.0f);
    java.util.Vector var12 = new java.util.Vector();
    var12.clear();
    boolean var14 = var5.addAll((java.util.Collection)var12);
    int var15 = var0.indexOf((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

}
