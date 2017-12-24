
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.swing.text.LayoutQueue var0 = new javax.swing.text.LayoutQueue();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.removeElement((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    javax.swing.text.LayoutQueue var6 = javax.swing.text.LayoutQueue.getDefaultQueue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.set((-1), (java.lang.Object)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var2.addAll((java.util.Collection)var3);
    java.util.ListIterator var5 = var2.listIterator();
    boolean var6 = var1.addAll((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.lang.ClassLoader var2 = var0.getContextClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var0.listIterator();
    java.util.Enumeration var4 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.lang.Object[] var4 = new java.lang.Object[] { 1.0d};
    java.lang.Object[] var5 = var0.toArray(var4);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var2.addAll((java.util.Collection)var3);
    java.util.ListIterator var5 = var2.listIterator();
    boolean var6 = var1.addAll((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(0);
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
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Iterator var5 = var1.iterator();
    var1.trimToSize();
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var7.addAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var7.listIterator();
    int var12 = var1.indexOf((java.lang.Object)var7, 1);
    int var14 = var7.indexOf((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Iterator var5 = var1.iterator();
    var1.trimToSize();
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var7.addAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var7.listIterator();
    int var12 = var1.indexOf((java.lang.Object)var7, 1);
    java.util.Vector var13 = new java.util.Vector();
    java.util.Vector var14 = new java.util.Vector();
    java.util.Vector var15 = new java.util.Vector();
    boolean var16 = var14.addAll((java.util.Collection)var15);
    java.lang.Object[] var18 = new java.lang.Object[] { 1.0d};
    java.lang.Object[] var19 = var14.toArray(var18);
    java.lang.Object[] var20 = var13.toArray(var18);
    java.lang.Object[] var21 = var7.toArray(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Iterator var5 = var1.iterator();
    var1.trimToSize();
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var7.addAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var7.listIterator();
    int var11 = var1.indexOf((java.lang.Object)var7);
    java.util.ListIterator var13 = var1.listIterator(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var1.subList(1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isDisposed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var0.listIterator();
    java.lang.Object var4 = new java.lang.Object();
    boolean var5 = var0.removeElement(var4);
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var7);
    java.util.Iterator var9 = var7.iterator();
    var0.add(0, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Iterator var5 = var1.iterator();
    var1.trimToSize();
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var7.addAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var7.listIterator();
    int var11 = var1.indexOf((java.lang.Object)var7);
    javax.swing.text.LayoutQueue var12 = javax.swing.text.LayoutQueue.getDefaultQueue();
    var1.setElementAt((java.lang.Object)var12, 0);
    javax.swing.text.LayoutQueue.setDefaultQueue(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var2.addAll((java.util.Collection)var3);
    var3.setSize(1);
    java.util.Iterator var7 = var3.iterator();
    var3.trimToSize();
    java.util.Vector var9 = new java.util.Vector();
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var9.addAll((java.util.Collection)var10);
    java.util.ListIterator var12 = var9.listIterator();
    int var14 = var3.indexOf((java.lang.Object)var9, 1);
    boolean var15 = var0.removeAll((java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var2.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    var1.setSize(1);
    java.util.Iterator var5 = var1.iterator();
    var1.trimToSize();
    java.util.Vector var7 = new java.util.Vector();
    java.util.Vector var8 = new java.util.Vector();
    boolean var9 = var7.addAll((java.util.Collection)var8);
    java.util.ListIterator var10 = var7.listIterator();
    int var12 = var1.indexOf((java.lang.Object)var7, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var14 = var1.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var2 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var2.addAll((java.util.Collection)var3);
    java.util.ListIterator var5 = var2.listIterator();
    boolean var6 = var1.addAll((java.util.Collection)var2);
    int var7 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.ListIterator var3 = var0.listIterator();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector();
    boolean var3 = var1.addAll((java.util.Collection)var2);
    java.lang.Object[] var5 = new java.lang.Object[] { 1.0d};
    java.lang.Object[] var6 = var1.toArray(var5);
    java.lang.Object[] var7 = var0.toArray(var5);
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var2 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector();
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var3.addAll((java.util.Collection)var4);
    java.util.ListIterator var6 = var3.listIterator();
    boolean var7 = var2.addAll((java.util.Collection)var3);
    boolean var8 = var0.retainAll((java.util.Collection)var3);
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

}
