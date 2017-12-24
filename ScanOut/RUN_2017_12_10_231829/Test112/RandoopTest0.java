
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = new char[] { ' ', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = java.lang.String.valueOf(var2, (-1), 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 1, 100, 10);
    int var6 = var5.getDate();
    int var7 = var5.getSeconds();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.concurrent.locks.ReentrantLock var1 = new java.util.concurrent.locks.ReentrantLock(true);
    var1.lockInterruptibly();
    boolean var3 = var1.hasQueuedThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var1 = new byte[] { (byte)1};
    java.lang.String var3 = new java.lang.String(var1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var1, 5, 5, 5);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\u0A01"+ "'", var3.equals("\u0A01"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 100.0d};
    java.lang.String var3 = java.lang.String.format("4", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4"+ "'", var3.equals("4"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    char[] var2 = new char[] { ' ', '#'};
    java.lang.String var5 = new java.lang.String(var2, 1, 1);
    java.lang.String var6 = java.lang.String.valueOf(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var2, 0, 5);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "#"+ "'", var5.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " #"+ "'", var6.equals(" #"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "#");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var1.insert(100, '#');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    char[] var1 = new char[] { '4'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = java.lang.String.valueOf(var1, 100, 5);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(100);
    java.lang.StringBuilder var2 = var1.reverse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var6 = var1.replace((-1), 0, "\u0A01");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(100);
    java.lang.StringBuilder var3 = var1.append("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 1, 100, 10);
    int var6 = var5.getDate();
    java.util.Date var12 = new java.util.Date((-1), 0, 1, 100, 10);
    boolean var13 = var5.before(var12);
    int var14 = var5.getSeconds();
    java.lang.String var15 = var5.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var1 = new java.lang.Thread((java.lang.Runnable)var0);
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var0, "4");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.concurrent.ConcurrentHashMap var3 = new java.util.concurrent.ConcurrentHashMap(0, 100.0f, 5);
    java.lang.StringBuilder var5 = new java.lang.StringBuilder(100);
    java.lang.StringBuilder var6 = var5.reverse();
    java.lang.Object var8 = var3.put((java.lang.Object)var5, (java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.rmi.server.UnicastServerRef var1 = new sun.rmi.server.UnicastServerRef(true);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(100);
    java.lang.StringBuilder var2 = var1.reverse();
    java.lang.StringBuilder var4 = var2.append((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(100);
    java.lang.StringBuilder var2 = var1.reverse();
    java.lang.StringBuilder var4 = var2.append(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    char[] var1 = new char[] { '4'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    java.lang.String var3 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4"+ "'", var3.equals("4"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.concurrent.locks.ReentrantLock var1 = new java.util.concurrent.locks.ReentrantLock(true);
    int var2 = var1.getQueueLength();
    boolean var3 = var1.isFair();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.concurrent.locks.ReentrantLock var1 = new java.util.concurrent.locks.ReentrantLock(true);
    boolean var2 = var1.isLocked();
    var1.lockInterruptibly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.concurrent.ConcurrentHashMap var3 = new java.util.concurrent.ConcurrentHashMap(0, 100.0f, 5);
    boolean var5 = var3.containsValue((java.lang.Object)"false");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\n"+ "'", var2.equals("\n"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.concurrent.ConcurrentHashMap var3 = new java.util.concurrent.ConcurrentHashMap(0, 100.0f, 5);
    java.util.Collection var4 = var3.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.concurrent.locks.ReentrantLock var0 = new java.util.concurrent.locks.ReentrantLock();
    boolean var1 = var0.isFair();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

}
