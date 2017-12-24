
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "December"+ "'", var0.equals("December"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInMonth("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("December");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var6 = java.util.Date.UTC(10, (-1), 100, 0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1887580100000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.hourInDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 15.0d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthName("December");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayOfWeekInMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 2.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "hi!", 10, 100, 1, 10, 0, (-1), 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.secondInMinute();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInYear("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.minuteInHour("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var4 = var2.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "GMT+00:00"+ "'", var4.equals("GMT+00:00"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.getFileName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Monday"+ "'", var0.equals("Monday"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.hourInDay("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(100, "", 1, 10, 10, (-1), 100, (-1), 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    boolean var9 = var2.equals((java.lang.Object)0.0f);
    int[] var12 = new int[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = var2.getOffsetsByStandard((-1L), var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("December");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "GMT+00:00", 10, (-1), 1, 0, 10, 1, (-1), 0, 10, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("December");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    java.lang.String var8 = var2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "GMT+00:00"+ "'", var8.equals("GMT+00:00"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(1, "December", 9, 100, (-1), 100, 100, 100, (-1), 9, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    boolean var9 = var2.equals((java.lang.Object)0.0f);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    boolean var11 = var2.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var1 = new java.util.HashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    boolean var9 = var2.equals((java.lang.Object)0.0f);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setWeekDate(9, 9, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    boolean var9 = var2.equals((java.lang.Object)0.0f);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    int var12 = var10.get(10);
    int var14 = var10.getGreatestMinimum(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayName("December");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 0);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var2.getOffsetsByWall(10L, var6);
    boolean var9 = var2.equals((java.lang.Object)0.0f);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    int var12 = var10.get(10);
    var10.setFirstDayOfWeek(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 9);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "Monday");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("December");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayAbbreviation("Monday");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.util.Date var1 = new java.util.Date(100L);
    java.util.Date var3 = new java.util.Date(100L);
    boolean var4 = var1.after(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 10);

  }

}
