
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date(0L);
    var1.setTime((-1L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var1 = new java.util.Date(0L);
    java.lang.String var2 = var1.toString();
    var1.setYear(1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Set var2 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(0L);
    var1.setYear(100);
    int var4 = var1.getDate();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", (-1));
    java.lang.String var3 = var2.getID();
    int[] var7 = new int[] { (-1), 1};
    int var8 = var2.getOffsetsByWall(10L, var7);
    int var9 = var2.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.lang.String var2 = var1.toString();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var2 = new java.util.Hashtable(0);
    boolean var3 = var0.equals((java.lang.Object)0);
    sun.reflect.annotation.AnnotationParser var4 = new sun.reflect.annotation.AnnotationParser();
    boolean var5 = var0.containsKey((java.lang.Object)var4);
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", (-1));
    boolean var3 = var2.isDirty();
    java.lang.String var6 = var2.getDisplayName(false, 0);
    java.lang.String var7 = var2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "GMT+00:00"+ "'", var6.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date(0L);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toGMTString();
    var1.setDate((-1));
    java.util.Date var12 = new java.util.Date(0, 10, 10, 1, 100, 1);
    long var13 = var12.getTime();
    boolean var14 = var1.before(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "Thu Jan 01 05:30:00 IST 1970", 1, 3, 3, 100, (-1), 100, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray(var0);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Enumeration var2 = var1.elements();
    java.util.Date var4 = new java.util.Date(0L);
    java.lang.String var5 = var4.toString();
    java.lang.String var6 = var4.toGMTString();
    java.lang.Object var7 = var4.clone();
    boolean var8 = var1.containsValue(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", (-1));
    java.lang.String var3 = var2.getID();
    int[] var7 = new int[] { (-1), 1};
    int var8 = var2.getOffsetsByWall(10L, var7);
    boolean var9 = var2.useDaylightTime();
    sun.util.calendar.ZoneInfo var12 = new sun.util.calendar.ZoneInfo("", (-1));
    boolean var13 = var12.isDirty();
    boolean var14 = var2.hasSameRules((java.util.TimeZone)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(0L);
    var1.setYear(100);
    var1.setSeconds(10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var3 = new java.util.Date(1, 3, (-1));
    var3.setMonth(3);

  }

}
