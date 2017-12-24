
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
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.concurrent.ConcurrentHashMap var3 = new java.util.concurrent.ConcurrentHashMap(10, (-1.0f), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date(10, (-1), 10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    java.util.Set var3 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    java.util.Hashtable var2 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    java.util.Date var4 = new java.util.Date(10L);
    java.util.Properties var5 = new java.util.Properties();
    java.lang.Object var7 = var5.get((java.lang.Object)100L);
    java.util.Properties var8 = new java.util.Properties();
    java.lang.Object var10 = var8.get((java.lang.Object)100L);
    var5.putAll((java.util.Map)var8);
    java.lang.Object var14 = var8.put((java.lang.Object)10, (java.lang.Object)100);
    java.lang.Object var15 = var0.put((java.lang.Object)10L, (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    long var6 = java.util.Date.UTC(1, 10, 10, (-1), 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2150407201000L));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.concurrent.ConcurrentHashMap var1 = new java.util.concurrent.ConcurrentHashMap(10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.concurrent.ConcurrentHashMap var0 = new java.util.concurrent.ConcurrentHashMap();
    boolean var1 = var0.isEmpty();
    java.util.concurrent.ConcurrentHashMap var2 = new java.util.concurrent.ConcurrentHashMap();
    boolean var3 = var2.isEmpty();
    var0.putAll((java.util.Map)var2);
    boolean var6 = var2.containsKey((java.lang.Object)10.0f);
    int var7 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    int var4 = var3.getYear();
    int var5 = var3.getYear();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    java.util.Enumeration var2 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)100L);
    java.util.Properties var6 = new java.util.Properties();
    java.lang.Object var8 = var6.get((java.lang.Object)100L);
    var3.putAll((java.util.Map)var6);
    java.lang.Object var10 = var0.remove((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)100L);
    var0.putAll((java.util.Map)var3);
    java.util.Set var7 = var0.stringPropertyNames();
    java.util.Date var9 = new java.util.Date(10L);
    java.lang.Object var10 = var0.remove((java.lang.Object)var9);
    java.lang.String var12 = var0.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.concurrent.ConcurrentHashMap var0 = new java.util.concurrent.ConcurrentHashMap();
    boolean var1 = var0.isEmpty();
    java.util.concurrent.ConcurrentHashMap var2 = new java.util.concurrent.ConcurrentHashMap();
    boolean var3 = var2.isEmpty();
    var0.putAll((java.util.Map)var2);
    boolean var6 = var2.containsKey((java.lang.Object)10.0f);
    java.util.Collection var7 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)100L);
    var0.putAll((java.util.Map)var3);
    java.util.Set var7 = var0.stringPropertyNames();
    java.util.Date var9 = new java.util.Date(10L);
    java.lang.Object var10 = var0.remove((java.lang.Object)var9);
    int var11 = var9.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var5 = new java.util.Date(100, 10, 0, 1, 100);
    var5.setTime((-1L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)100L);
    var0.putAll((java.util.Map)var3);
    java.util.Set var7 = var0.stringPropertyNames();
    java.util.Enumeration var8 = var0.elements();
    java.util.Enumeration var9 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var5 = new java.util.Date(100, 10, 0, 1, 100);
    int var6 = var5.getMonth();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.concurrent.ConcurrentHashMap var0 = new java.util.concurrent.ConcurrentHashMap();
    java.util.Properties var1 = new java.util.Properties();
    java.lang.Object var3 = var1.get((java.lang.Object)100L);
    java.util.Properties var4 = new java.util.Properties();
    java.lang.Object var6 = var4.get((java.lang.Object)100L);
    var1.putAll((java.util.Map)var4);
    java.util.Set var8 = var1.stringPropertyNames();
    java.util.Enumeration var9 = var1.elements();
    var0.putAll((java.util.Map)var1);
    java.util.concurrent.ConcurrentHashMap var11 = new java.util.concurrent.ConcurrentHashMap();
    boolean var12 = var11.isEmpty();
    java.util.concurrent.ConcurrentHashMap var13 = new java.util.concurrent.ConcurrentHashMap();
    boolean var14 = var13.isEmpty();
    var11.putAll((java.util.Map)var13);
    java.util.Properties var16 = new java.util.Properties();
    java.lang.Object var18 = var16.get((java.lang.Object)100L);
    java.util.Properties var19 = new java.util.Properties();
    java.lang.Object var21 = var19.get((java.lang.Object)100L);
    var16.putAll((java.util.Map)var19);
    java.util.Set var23 = var16.stringPropertyNames();
    java.util.Properties var24 = new java.util.Properties(var16);
    java.util.Date var31 = new java.util.Date(0, 10, 10, 0, 1, (-1));
    java.lang.String var32 = var31.toGMTString();
    java.lang.Object var33 = var13.put((java.lang.Object)var24, (java.lang.Object)var31);
    java.lang.String var34 = var13.toString();
    java.util.concurrent.ConcurrentHashMap var35 = new java.util.concurrent.ConcurrentHashMap();
    boolean var36 = var35.isEmpty();
    java.util.concurrent.ConcurrentHashMap var37 = new java.util.concurrent.ConcurrentHashMap();
    boolean var38 = var37.isEmpty();
    var35.putAll((java.util.Map)var37);
    java.util.Properties var40 = new java.util.Properties();
    java.lang.Object var42 = var40.get((java.lang.Object)100L);
    java.util.Properties var43 = new java.util.Properties();
    java.lang.Object var45 = var43.get((java.lang.Object)100L);
    var40.putAll((java.util.Map)var43);
    java.util.Set var47 = var40.stringPropertyNames();
    java.util.Properties var48 = new java.util.Properties(var40);
    java.util.Date var55 = new java.util.Date(0, 10, 10, 0, 1, (-1));
    java.lang.String var56 = var55.toGMTString();
    java.lang.Object var57 = var37.put((java.lang.Object)var48, (java.lang.Object)var55);
    java.lang.String var58 = var37.toString();
    java.lang.Object var59 = var0.putIfAbsent((java.lang.Object)var13, (java.lang.Object)var37);
    java.util.Properties var60 = new java.util.Properties();
    java.lang.Object var62 = var60.get((java.lang.Object)100L);
    java.util.Properties var63 = new java.util.Properties();
    java.lang.Object var65 = var63.get((java.lang.Object)100L);
    var60.putAll((java.util.Map)var63);
    java.util.Set var67 = var60.stringPropertyNames();
    java.lang.Object var68 = var13.get((java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "{{}=Sat Nov 10 00:00:59 IST 1900}"+ "'", var34.equals("{{}=Sat Nov 10 00:00:59 IST 1900}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "{{}=Sat Nov 10 00:00:59 IST 1900}"+ "'", var58.equals("{{}=Sat Nov 10 00:00:59 IST 1900}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(10, 10, 0);
    java.lang.String var4 = var3.toLocaleString();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)100L);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)100L);
    var0.putAll((java.util.Map)var3);
    java.util.Set var7 = var0.stringPropertyNames();
    java.util.Date var9 = new java.util.Date(10L);
    java.lang.Object var10 = var0.remove((java.lang.Object)var9);
    java.util.Collection var11 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
