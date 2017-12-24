
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.lang.String var2 = var1.toGMTString();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.concurrent.ConcurrentHashMap var1 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var2 = var1.keySet();
    java.util.Enumeration var3 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.concurrent.locks.ReentrantLock var1 = new java.util.concurrent.locks.ReentrantLock(false);
    int var2 = var1.getHoldCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var1 = java.util.Date.parse("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.concurrent.locks.ReentrantLock var1 = new java.util.concurrent.locks.ReentrantLock(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.unlock();
      fail("Expected exception of type java.lang.IllegalMonitorStateException");
    } catch (java.lang.IllegalMonitorStateException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.concurrent.ConcurrentHashMap var0 = new java.util.concurrent.ConcurrentHashMap();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var4 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    java.lang.Object var7 = var0.clone();
    java.util.Set var8 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.concurrent.locks.ReentrantLock var0 = new java.util.concurrent.locks.ReentrantLock();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.lang.Object var3 = var1.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var5 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var6 = var5.entrySet();
    var1.putAll((java.util.Map)var5);
    java.lang.Object var8 = var0.get((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var4 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    java.util.concurrent.ConcurrentHashMap var8 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var9 = var8.entrySet();
    java.util.Properties var10 = new java.util.Properties();
    java.lang.Object var12 = var10.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var14 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var15 = var14.entrySet();
    var10.putAll((java.util.Map)var14);
    java.lang.Object var18 = var8.replace((java.lang.Object)var14, (java.lang.Object)(short)(-1));
    var4.putAll((java.util.Map)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.concurrent.ConcurrentHashMap var1 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Properties var2 = new java.util.Properties();
    boolean var3 = var1.containsKey((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var4 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    java.lang.Object var7 = var0.clone();
    java.lang.String var10 = var0.getProperty("1 Jan 1970 00:00:00 GMT", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAwtEventQueueAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    int var4 = var3.getYear();
    java.lang.String var5 = var3.toGMTString();
    var3.setMonth(10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.concurrent.ConcurrentHashMap var1 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var7 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var8 = var7.entrySet();
    var3.putAll((java.util.Map)var7);
    java.lang.Object var11 = var1.replace((java.lang.Object)var7, (java.lang.Object)(short)(-1));
    java.util.Collection var12 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var4 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    java.lang.Object var7 = var0.clone();
    java.util.Enumeration var8 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date("1 Jan 1970 00:00:00 GMT");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    boolean var1 = var0.getInCheck();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getHours();
    var1.setMonth(10);
    java.util.Date var6 = new java.util.Date(100L);
    int var7 = var6.getHours();
    boolean var8 = var1.before(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkDelete("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.util.concurrent.ConcurrentHashMap var4 = new java.util.concurrent.ConcurrentHashMap(1);
    java.util.Set var5 = var4.entrySet();
    var0.putAll((java.util.Map)var4);
    java.lang.Object var7 = var0.clone();
    java.lang.Object var10 = var0.setProperty("1 Jan 1970 00:00:00 GMT", "1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10);
    java.lang.Object var5 = var0.setProperty("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
