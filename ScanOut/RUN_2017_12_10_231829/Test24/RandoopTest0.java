
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.roll((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var7.toLocaleString();
    int var9 = var7.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var8.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1800));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var6.getActualMaximum((-1800));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var7.toLocaleString();
    java.lang.String var9 = var7.toString();
    long var10 = var7.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var8.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Tue Jan 14 04:01:10 IST 100"+ "'", var9.equals("Tue Jan 14 04:01:10 IST 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-59010514130000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isLenient();
    var6.roll(0, 1);
    java.util.Date var11 = var6.getGregorianChange();
    int var12 = var6.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-99));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var7.toLocaleString();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var8.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Tue Jan 14 04:01:10 IST 100"+ "'", var9.equals("Tue Jan 14 04:01:10 IST 100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Tue Jan 14 04:01:10 IST 100"+ "'", var10.equals("Tue Jan 14 04:01:10 IST 100"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var6.setMinimalDaysInFirstWeek(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.getActualMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("14 Jan, 0100 4:01:10 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    int var7 = var6.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    int var7 = var6.getWeekYear();
    java.util.GregorianCalendar var14 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var15 = var14.isLenient();
    var14.roll(0, 1);
    var14.roll(1, true);
    int var22 = var6.compareTo((java.util.Calendar)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isLenient();
    var6.roll(0, 1);
    java.util.GregorianCalendar var17 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var18 = var17.getTime();
    java.lang.String var19 = var18.toLocaleString();
    var6.setTime(var18);
    int var21 = var18.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var19.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-330));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    long var8 = var7.getTime();
    var7.setDate(2);
    int var11 = var7.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-59010514130000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.roll((-1800), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 2, (-1800));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set((-1800), 1, 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var3 = new java.util.Date(2, 100, 2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.clear();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var2.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    long var1 = java.util.Date.parse("14 Jan, 0100 4:01:10 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-59010514130000L));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isWeekDateSupported();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.roll((-1), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var6.setTimeInMillis((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var7.toLocaleString();
    int var9 = var7.getDay();
    var7.setMonth((-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var8.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 2, (-99), 10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var7.toLocaleString();
    int var9 = var7.getDay();
    int var10 = var7.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var8.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-330));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var1 = var0.getWeekLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var6.set(7, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    long var8 = var7.getTime();
    var7.setHours(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-59010514130000L));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("Tue Jan 14 04:01:10 IST 100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(10, (-1), 7, 0, 7, 2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var7 = var6.isLenient();
    var6.roll(0, 1);
    java.util.GregorianCalendar var17 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    java.util.Date var18 = var17.getTime();
    java.lang.String var19 = var18.toLocaleString();
    var6.setTime(var18);
    java.util.GregorianCalendar var27 = new java.util.GregorianCalendar(100, 0, 10, 100, 1, 10);
    boolean var28 = var27.isLenient();
    var27.roll(0, 1);
    java.util.Date var32 = var27.getGregorianChange();
    boolean var33 = var18.before(var32);
    int var34 = var32.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "14 Jan, 0100 4:01:10 AM"+ "'", var19.equals("14 Jan, 0100 4:01:10 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 9);

  }

}
