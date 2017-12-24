
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var1 = new java.util.Vector(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)100.0d, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.ListIterator var2 = var1.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.insertElementAt((java.lang.Object)0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.insertElementAt((java.lang.Object)1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var1.lastIndexOf((java.lang.Object)1.0d, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    java.util.ListIterator var7 = var1.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("", "hi!", "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("hi!", "", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var2.subList(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("hi!", false);
    sun.misc.Resource var7 = var1.getResource("hi!", false);
    sun.misc.Resource var9 = var1.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    java.util.Iterator var2 = var0.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    java.util.Vector var9 = new java.util.Vector(1);
    var9.addElement((java.lang.Object)(-1.0d));
    var9.setSize(100);
    java.util.ArrayList var14 = new java.util.ArrayList((java.util.Collection)var9);
    var6.add(1, (java.lang.Object)var9);
    java.lang.Object var18 = var6.set(1, (java.lang.Object)1.0f);
    java.util.Vector var21 = new java.util.Vector(10, 0);
    int var22 = var6.lastIndexOf((java.lang.Object)0);
    java.util.ListIterator var24 = var6.listIterator(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByAddress(var0);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    var1.ensureCapacity(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var1.subList((-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    java.util.Vector var9 = new java.util.Vector(1);
    var9.addElement((java.lang.Object)(-1.0d));
    var9.setSize(100);
    java.util.ArrayList var14 = new java.util.ArrayList((java.util.Collection)var9);
    var6.add(1, (java.lang.Object)var9);
    java.lang.Object var18 = var6.set(1, (java.lang.Object)1.0f);
    boolean var19 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("hi!", false);
    java.util.List var5 = var1.closeLoaders();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    java.util.Vector var3 = new java.util.Vector(1);
    var3.addElement((java.lang.Object)(-1.0d));
    var3.setSize(100);
    java.util.ArrayList var8 = new java.util.ArrayList((java.util.Collection)var3);
    java.util.Vector var11 = new java.util.Vector(1);
    var11.addElement((java.lang.Object)(-1.0d));
    var11.setSize(100);
    java.util.ArrayList var16 = new java.util.ArrayList((java.util.Collection)var11);
    var8.add(1, (java.lang.Object)var11);
    java.lang.Object var20 = var8.set(1, (java.lang.Object)1.0f);
    boolean var21 = var0.add((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var1 = var0.toArray();
    java.util.Vector var3 = new java.util.Vector(1);
    var3.addElement((java.lang.Object)(-1.0d));
    var3.setSize(100);
    java.util.ArrayList var8 = new java.util.ArrayList((java.util.Collection)var3);
    java.util.Vector var11 = new java.util.Vector(1);
    var11.addElement((java.lang.Object)(-1.0d));
    var11.setSize(100);
    java.util.ArrayList var16 = new java.util.ArrayList((java.util.Collection)var11);
    var8.add(1, (java.lang.Object)var11);
    java.util.Vector var19 = new java.util.Vector(1);
    java.util.ListIterator var20 = var19.listIterator();
    boolean var21 = var11.add((java.lang.Object)var20);
    int var22 = var0.lastIndexOf((java.lang.Object)var20);
    java.util.Enumeration var23 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var3 = new java.util.Vector();
    java.lang.Object[] var4 = var3.toArray();
    java.util.Vector var6 = new java.util.Vector(1);
    var6.addElement((java.lang.Object)(-1.0d));
    var6.setSize(100);
    java.util.ArrayList var11 = new java.util.ArrayList((java.util.Collection)var6);
    java.util.Vector var14 = new java.util.Vector(1);
    var14.addElement((java.lang.Object)(-1.0d));
    var14.setSize(100);
    java.util.ArrayList var19 = new java.util.ArrayList((java.util.Collection)var14);
    var11.add(1, (java.lang.Object)var14);
    java.util.Vector var22 = new java.util.Vector(1);
    java.util.ListIterator var23 = var22.listIterator();
    boolean var24 = var14.add((java.lang.Object)var23);
    int var25 = var3.lastIndexOf((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add(10, (java.lang.Object)var23);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    java.util.Vector var9 = new java.util.Vector(1);
    var9.addElement((java.lang.Object)(-1.0d));
    var9.setSize(100);
    java.util.ArrayList var14 = new java.util.ArrayList((java.util.Collection)var9);
    var6.add(1, (java.lang.Object)var9);
    java.util.Vector var18 = new java.util.Vector(1);
    var18.addElement((java.lang.Object)(-1.0d));
    java.util.Enumeration var21 = var18.elements();
    boolean var22 = var9.addAll(1, (java.util.Collection)var18);
    var18.ensureCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    java.lang.Object var8 = var6.get(10);
    var6.add(0, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(1);
    var1.addElement((java.lang.Object)(-1.0d));
    var1.setSize(100);
    java.util.ArrayList var6 = new java.util.ArrayList((java.util.Collection)var1);
    int var7 = var1.size();
    java.util.Vector var9 = new java.util.Vector(1);
    var9.addElement((java.lang.Object)(-1.0d));
    var9.setSize(100);
    java.util.ArrayList var14 = new java.util.ArrayList((java.util.Collection)var9);
    boolean var15 = var1.containsAll((java.util.Collection)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("hi!", false);
    java.util.Enumeration var7 = var1.findResources("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
