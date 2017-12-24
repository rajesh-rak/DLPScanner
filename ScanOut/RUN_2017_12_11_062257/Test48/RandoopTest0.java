
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"", (java.lang.Object)(byte)1);
    java.util.Set var4 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 10, 0, 10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC(1, 1, (-1), 100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2174587190000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    var1.setID("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"", (java.lang.Object)(byte)1);
    java.lang.Object var5 = var0.remove((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)(byte)0, (java.lang.Object)0);
    java.lang.Object var6 = var0.put((java.lang.Object)(byte)10, (java.lang.Object)(-1L));
    boolean var8 = var0.contains((java.lang.Object)10.0d);
    java.util.Properties var9 = new java.util.Properties();
    java.lang.String var12 = var9.getProperty("", "hi!");
    java.util.Date var16 = new java.util.Date(100, (-1), 0);
    var16.setMonth(100);
    java.util.Date var22 = new java.util.Date(100, (-1), 0);
    var22.setMonth(100);
    boolean var25 = var16.after(var22);
    var16.setTime(0L);
    java.lang.String[] var29 = sun.util.calendar.ZoneInfo.getAvailableIDs(0);
    java.lang.Object var30 = var9.put((java.lang.Object)var16, (java.lang.Object)0);
    boolean var31 = var0.containsKey((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("{}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"", (java.lang.Object)(byte)1);
    boolean var5 = var0.containsValue((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    java.util.Properties var4 = new java.util.Properties();
    java.lang.String var7 = var4.getProperty("", "hi!");
    boolean var8 = var0.contains((java.lang.Object)"hi!");
    boolean var10 = var0.containsValue((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(100, "{}", 10, 0, (-1), (-1), 0, 100, 1, 100, (-1), (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var3 = new java.util.Date(100, (-1), 0);
    var3.setMonth(100);
    java.util.Date var9 = new java.util.Date(100, (-1), 0);
    var9.setMonth(100);
    boolean var12 = var3.after(var9);
    var3.setTime(0L);
    java.util.Date var18 = new java.util.Date((-1), 100, 1);
    var18.setTime(1L);
    boolean var21 = var3.after(var18);
    java.util.Date var25 = new java.util.Date(100, (-1), 0);
    boolean var26 = var3.after(var25);
    java.util.Date var30 = new java.util.Date(100, (-1), 0);
    java.lang.String var31 = var30.toLocaleString();
    java.lang.String var32 = var30.toString();
    boolean var33 = var25.before(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    var2.setStartYear(0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset((-1), (-1), 1, 10, 1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era[] var1 = var0.getEras();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.String var6 = var3.getProperty("", "hi!");
    java.lang.String var7 = var3.toString();
    java.util.Collection var8 = var3.values();
    boolean var9 = var2.containsValue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    java.util.SimpleTimeZone var5 = new java.util.SimpleTimeZone(0, "hi!");
    java.util.TimeZone.setDefault((java.util.TimeZone)var5);
    boolean var7 = var2.hasSameRules((java.util.TimeZone)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"", (java.lang.Object)(byte)1);
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{=1}"+ "'", var4.equals("{=1}"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)(byte)0, (java.lang.Object)0);
    java.lang.Object var6 = var0.put((java.lang.Object)(byte)10, (java.lang.Object)(-1L));
    boolean var8 = var0.contains((java.lang.Object)10.0d);
    boolean var10 = var0.containsValue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
