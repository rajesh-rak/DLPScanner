
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Level var1 = java.util.logging.Level.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    int var15 = var5.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    boolean var16 = var5.equals((java.lang.Object)"Wed May 01 10:01:00 IST 1918");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("Wed May 01 10:01:00 IST 1918");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("Wed May 01 10:01:00 IST 1918", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var5 = new java.util.Date((-330), (-330), 0, (-330), (-330));
    var5.setHours(100);
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    java.util.Date var20 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Date var27 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var28 = var27.toString();
    int var29 = var20.compareTo(var27);
    int var30 = var12.compareTo(var27);
    java.lang.Object var31 = var12.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    java.util.Date var20 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Date var27 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var28 = var27.toString();
    int var29 = var20.compareTo(var27);
    int var30 = var12.compareTo(var27);
    int var31 = var12.getTimezoneOffset();
    int var32 = var12.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.finer("");
    var0.info("hi!");
    var0.finest("Wed May 01 10:01:00 IST 1918");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.finer("");
    var0.setUseParentHandlers(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(0, (-330), 0, 100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-3076597201000L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var6 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var13 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var14 = var13.toString();
    int var15 = var6.compareTo(var13);
    boolean var17 = var6.equals((java.lang.Object)(-1.0f));
    int var18 = var6.getHours();
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    var19.finest("");
    java.lang.Object var22 = var0.getOrDefault((java.lang.Object)var6, (java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    java.util.Date var20 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Date var27 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var28 = var27.toString();
    int var29 = var20.compareTo(var27);
    int var30 = var12.compareTo(var27);
    var27.setSeconds(1);
    java.lang.String var33 = var27.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    java.util.Date var20 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Date var27 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var28 = var27.toString();
    int var29 = var20.compareTo(var27);
    int var30 = var12.compareTo(var27);
    int var31 = var12.getDay();
    int var32 = var12.getMonth();
    int var33 = var12.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    java.util.Date var20 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Date var27 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var28 = var27.toString();
    int var29 = var20.compareTo(var27);
    int var30 = var12.compareTo(var27);
    java.time.Instant var31 = var12.toInstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.finest("");
    var0.finest("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    java.util.Collection var2 = var0.values();
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var5 = new java.util.Date((-330), (-330), 0, (-330), (-330));
    var5.setHours(100);
    int var8 = var5.getMinutes();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    java.lang.Object var3 = var0.get((java.lang.Object)"Wed May 01 10:01:00 IST 1918");
    boolean var4 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var5 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var6 = var5.toString();
    java.util.Date var12 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var13 = var12.toString();
    int var14 = var5.compareTo(var12);
    int var15 = var12.getTimezoneOffset();
    java.time.Instant var16 = var12.toInstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var8 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var9 = var8.toString();
    java.util.Date var15 = new java.util.Date(10, 100, 1, 10, 1);
    java.lang.String var16 = var15.toString();
    int var17 = var8.compareTo(var15);
    boolean var18 = var0.replace((java.lang.Object)'#', (java.lang.Object)(short)(-1), (java.lang.Object)var15);
    java.util.Set var19 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date((-1), 30, 0);

  }

}
