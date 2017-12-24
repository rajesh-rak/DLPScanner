
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.elementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.size();
    int var5 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.Object var3 = var2.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var2.subList(0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Iterator var4 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.set(0, (java.lang.Object)10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(100, (-1));
    java.lang.String var7 = var6.toString();
    int var8 = var6.size();
    boolean var9 = var2.containsAll((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var6.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.set((-1), (java.lang.Object)(byte)100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(100, (-1));
    java.lang.String var7 = var6.toString();
    int var8 = var6.size();
    boolean var9 = var2.containsAll((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var2.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.ListIterator var4 = var2.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.ListIterator var4 = var2.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var2.subList((-1), 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Iterator var4 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.set(0, (java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.size();
    int var6 = var2.lastIndexOf((java.lang.Object)10.0f);
    java.util.Vector var9 = new java.util.Vector(100, (-1));
    java.lang.String var10 = var9.toString();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    java.lang.Object[] var13 = var2.toArray(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    boolean var4 = var2.equals((java.lang.Object)10.0f);
    java.util.Vector var8 = new java.util.Vector(100, (-1));
    java.lang.Object var9 = var8.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(1, var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.LayoutQueue var0 = javax.swing.text.LayoutQueue.getDefaultQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    var2.removeAllElements();
    var2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var7 = new java.util.Vector(100, (-1));
    java.lang.String var8 = var7.toString();
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var4.lastIndexOf((java.lang.Object)var9, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(100, (-1));
    java.lang.String var7 = var6.toString();
    int var8 = var6.size();
    boolean var9 = var2.containsAll((java.util.Collection)var6);
    java.util.List var12 = var2.subList(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var2.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    var2.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var2.lastIndexOf((java.lang.Object)false, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(100, (-1));
    java.lang.String var7 = var6.toString();
    int var8 = var6.size();
    boolean var9 = var2.containsAll((java.util.Collection)var6);
    var6.trimToSize();
    var6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    boolean var4 = var2.equals((java.lang.Object)10.0f);
    java.util.Vector var7 = new java.util.Vector(100, (-1));
    boolean var9 = var7.remove((java.lang.Object)10.0f);
    boolean var10 = var2.removeElement((java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var7.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Iterator var4 = var2.iterator();
    java.util.Vector var7 = new java.util.Vector(100, (-1));
    java.lang.String var8 = var7.toString();
    var2.addElement((java.lang.Object)var7);
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    int var3 = var2.size();
    var2.trimToSize();
    java.lang.Object[] var6 = new java.lang.Object[] { "hi!"};
    var2.copyInto(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    var2.removeAllElements();
    var2.setSize(100);
    java.util.Vector var10 = new java.util.Vector(100, (-1));
    java.lang.String var11 = var10.toString();
    int var12 = var10.size();
    java.util.Vector var15 = new java.util.Vector(100, (-1));
    java.lang.String var16 = var15.toString();
    java.util.Iterator var17 = var15.iterator();
    boolean var18 = var10.addAll((java.util.Collection)var15);
    var2.setElementAt((java.lang.Object)var15, 1);
    var2.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[]"+ "'", var16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Vector var4 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var4.subList(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, 10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(100, (-1));
    java.lang.String var3 = var2.toString();
    java.util.Iterator var4 = var2.iterator();
    java.util.Vector var7 = new java.util.Vector(100, (-1));
    java.lang.String var8 = var7.toString();
    var2.addElement((java.lang.Object)var7);
    var7.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

}
