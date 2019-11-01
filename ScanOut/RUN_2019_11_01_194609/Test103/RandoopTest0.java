
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var1 = new java.util.Vector(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var1 = new java.util.Vector(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var3 = new byte[] { (byte)10, (byte)1, (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var4 = java.net.InetAddress.getByAddress(var3);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Stack var0 = new java.util.Stack();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.util.Enumeration var4 = var1.getResources("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    java.lang.Object var11 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    boolean var12 = var1.contains((java.lang.Object)'4');
    java.lang.String var13 = var1.toString();
    java.util.Vector var15 = new java.util.Vector(100);
    java.net.URL[] var17 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var18 = var15.toArray((java.lang.Object[])var17);
    var1.copyInto(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var1.subList(1, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    boolean var12 = var1.contains((java.lang.Object)'4');
    java.lang.Object[] var13 = var1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("[]", false);
    java.net.URL var7 = var1.findResource("[]", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("[]");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.util.Stack var13 = new java.util.Stack();
    boolean var14 = var1.remove((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var13.pop();
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.util.Vector var14 = new java.util.Vector(100);
    java.net.URL[] var16 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var17 = var14.toArray((java.lang.Object[])var16);
    java.util.Vector var19 = new java.util.Vector(100);
    java.net.URL[] var21 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var22 = var19.toArray((java.lang.Object[])var21);
    boolean var23 = var14.removeAll((java.util.Collection)var19);
    boolean var25 = var14.contains((java.lang.Object)'4');
    var14.ensureCapacity(1);
    boolean var28 = var1.removeAll((java.util.Collection)var14);
    java.util.Vector var30 = new java.util.Vector(1);
    boolean var31 = var14.containsAll((java.util.Collection)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("[]", false);
    java.net.URL[] var5 = var1.getURLs();
    sun.misc.Resource var7 = var1.getResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ArrayList var1 = new java.util.ArrayList((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.util.Stack var13 = new java.util.Stack();
    boolean var14 = var1.remove((java.lang.Object)var13);
    var13.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    boolean var12 = var1.contains((java.lang.Object)'4');
    java.lang.String var13 = var1.toString();
    boolean var15 = var1.add((java.lang.Object)(byte)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var1.subList((-1), (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.util.Stack var13 = new java.util.Stack();
    boolean var14 = var1.remove((java.lang.Object)var13);
    java.lang.Object var15 = var1.lastElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.net.URL[] var14 = sun.misc.URLClassPath.pathToURLs("[]");
    boolean var15 = var1.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    boolean var12 = var1.contains((java.lang.Object)'4');
    java.lang.String var13 = var1.toString();
    java.util.Vector var15 = new java.util.Vector(100);
    java.net.URL[] var17 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var18 = var15.toArray((java.lang.Object[])var17);
    var1.copyInto(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var1.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Stack var0 = new java.util.Stack();
    java.util.Vector var2 = new java.util.Vector(100);
    java.net.URL[] var4 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var5 = var2.toArray((java.lang.Object[])var4);
    java.util.Vector var7 = new java.util.Vector(100);
    java.net.URL[] var9 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var10 = var7.toArray((java.lang.Object[])var9);
    boolean var11 = var2.removeAll((java.util.Collection)var7);
    boolean var13 = var2.contains((java.lang.Object)'4');
    java.lang.String var14 = var2.toString();
    boolean var16 = var2.add((java.lang.Object)(byte)1);
    boolean var18 = var2.equals((java.lang.Object)"");
    int var20 = var0.indexOf((java.lang.Object)var18, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    java.net.URL var4 = var1.findResource("[]", false);
    sun.misc.Resource var6 = var1.getResource("[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    var1.setSize(10);
    java.util.Stack var13 = new java.util.Stack();
    boolean var14 = var1.remove((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.insertElementAt((java.lang.Object)(byte)100, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(100);
    java.net.URL[] var3 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var4 = var1.toArray((java.lang.Object[])var3);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    boolean var10 = var1.removeAll((java.util.Collection)var6);
    boolean var12 = var6.removeElement((java.lang.Object)(-1));
    java.util.Vector var14 = new java.util.Vector(100);
    java.net.URL[] var16 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var17 = var14.toArray((java.lang.Object[])var16);
    java.util.Vector var19 = new java.util.Vector(100);
    java.net.URL[] var21 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var22 = var19.toArray((java.lang.Object[])var21);
    boolean var23 = var14.removeAll((java.util.Collection)var19);
    boolean var25 = var14.contains((java.lang.Object)'4');
    java.lang.String var26 = var14.toString();
    java.util.Vector var28 = new java.util.Vector(100);
    java.net.URL[] var30 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var31 = var28.toArray((java.lang.Object[])var30);
    var14.copyInto(var31);
    var14.add(0, (java.lang.Object)10.0f);
    boolean var36 = var14.isEmpty();
    boolean var37 = var6.addAll((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(100);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(10);
    int var4 = var1.indexOf((java.lang.Object)(byte)1, 0);
    java.util.Vector var6 = new java.util.Vector(100);
    java.net.URL[] var8 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var9 = var6.toArray((java.lang.Object[])var8);
    java.util.Vector var11 = new java.util.Vector(100);
    java.net.URL[] var13 = sun.misc.URLClassPath.pathToURLs("hi!");
    java.lang.Object[] var14 = var11.toArray((java.lang.Object[])var13);
    boolean var15 = var6.removeAll((java.util.Collection)var11);
    boolean var16 = var1.removeElement((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

}
