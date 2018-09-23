
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(byte)1, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.lastIndexOf((java.lang.Object)100, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.lang.Object[] var6 = new java.lang.Object[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.copyInto(var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.indexOf((java.lang.Object)(short)0, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var1);
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var4 = new java.awt.DefaultKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var4);
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var3);
    java.beans.VetoableChangeListener[] var7 = var3.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var2.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var1);
    java.awt.Component var3 = var0.getPermanentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.util.ListIterator var5 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var1);
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var4 = new java.awt.DefaultKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var4);
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var3);
    java.awt.FocusTraversalPolicy var7 = var0.getDefaultFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    sun.rmi.transport.Transport var3 = var1.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.lang.Object var5 = var2.lastElement();
    java.util.ListIterator var6 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.lang.Object var5 = var2.lastElement();
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.lang.Object var5 = var2.lastElement();
    java.util.Enumeration var6 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    var2.clear();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.util.Vector var7 = new java.util.Vector(1, 10);
    boolean var8 = var2.contains((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var1);
    var0.downFocusCycle();
    java.awt.Component var4 = var0.getPermanentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    java.util.Iterator var10 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var1 = new java.awt.DefaultKeyboardFocusManager();
    var0.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var1);
    java.awt.DefaultKeyboardFocusManager var3 = new java.awt.DefaultKeyboardFocusManager();
    java.awt.DefaultKeyboardFocusManager var4 = new java.awt.DefaultKeyboardFocusManager();
    var3.removeKeyEventPostProcessor((java.awt.KeyEventPostProcessor)var4);
    var0.removeKeyEventDispatcher((java.awt.KeyEventDispatcher)var3);
    java.beans.PropertyChangeListener[] var7 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


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

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    int var3 = var1.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var2.containsAll((java.util.Collection)var10);
    java.lang.String var12 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    java.lang.Object var10 = var6.firstElement();
    java.util.Vector var13 = new java.util.Vector(1, 10);
    java.util.Vector var17 = new java.util.Vector(1, 10);
    var17.setSize(10);
    boolean var20 = var13.addAll(0, (java.util.Collection)var17);
    java.util.Vector var21 = new java.util.Vector();
    boolean var22 = var13.containsAll((java.util.Collection)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var24 = var6.lastIndexOf((java.lang.Object)var22, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    int var7 = var2.indexOf((java.lang.Object)0L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    boolean var11 = var6.remove((java.lang.Object)(short)100);
    boolean var13 = var6.remove((java.lang.Object)(byte)10);
    java.util.Vector var17 = new java.util.Vector(1, 10);
    java.util.Vector var21 = new java.util.Vector(1, 10);
    var21.setSize(10);
    boolean var24 = var17.addAll(0, (java.util.Collection)var21);
    java.lang.Object var25 = var21.firstElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var26 = var6.addAll((-1), (java.util.Collection)var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    boolean var11 = var6.equals((java.lang.Object)(byte)100);
    var6.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.setSize(10);
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.util.Vector var11 = new java.util.Vector(1, 10);
    var11.setSize(10);
    boolean var14 = var7.addAll(0, (java.util.Collection)var11);
    var2.addElement((java.lang.Object)var7);
    java.util.Vector var19 = new java.util.Vector(1, 10);
    var19.setSize(10);
    java.util.Vector var24 = new java.util.Vector(1, 10);
    var24.setSize(10);
    java.util.Vector var29 = new java.util.Vector(1, 10);
    java.util.Vector var33 = new java.util.Vector(1, 10);
    var33.setSize(10);
    boolean var36 = var29.addAll(0, (java.util.Collection)var33);
    var24.addElement((java.lang.Object)var29);
    var29.removeAllElements();
    var19.addElement((java.lang.Object)var29);
    var2.add(1, (java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.DefaultKeyboardFocusManager var0 = new java.awt.DefaultKeyboardFocusManager();
    var0.upFocusCycle();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var2.containsAll((java.util.Collection)var10);
    java.lang.Object[] var12 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.util.Vector var6 = new java.util.Vector(1, 10);
    var6.setSize(10);
    boolean var9 = var2.addAll(0, (java.util.Collection)var6);
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var2.containsAll((java.util.Collection)var10);
    int var12 = var10.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var10.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

}
