
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date();
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var2 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.formatDate("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    boolean var4 = var2.equals((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", 1);
    java.lang.String var3 = var2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "GMT+00:00"+ "'", var3.equals("GMT+00:00"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayAbbreviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Mon"+ "'", var0.equals("Mon"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.ZoneInfoFile var0 = new sun.util.calendar.ZoneInfoFile();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    int var3 = var2.getRawOffset();
    boolean var4 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.weekInYear("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 0, 1, 0, 0);
    int var7 = var6.getHours();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    int var3 = var2.getRawOffset();
    boolean var5 = var2.equals((java.lang.Object)Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.lang.String var1 = var0.toString();
    int var3 = var0.getGreatestMinimum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.util.GregorianCalendar[time=1512969420939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=939,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var1.equals("java.util.GregorianCalendar[time=1512969420939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=939,ZONE_OFFSET=19800000,DST_OFFSET=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(10, (-1), 0, 1, 0, 0);
    java.lang.String var7 = var6.toString();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthInYear("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", 1);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", 1);
    int[] var7 = new int[] { 10, 0, 10};
    int var8 = var2.getOffsets(10L, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    sun.util.calendar.ZoneInfo var3 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    var0.setTimeZone((java.util.TimeZone)var3);
    java.lang.Object var5 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    sun.util.calendar.ZoneInfo var3 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    var0.setTimeZone((java.util.TimeZone)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var3.getDisplayName(false, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "10:47:00+05:1800000"+ "'", var0.equals("10:47:00+05:1800000"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 100);
    java.math.BigDecimal var4 = var2.movePointRight((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.lang.String var1 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWeekDate((-1), 100, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.util.GregorianCalendar[time=1512969420974,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=974,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var1.equals("java.util.GregorianCalendar[time=1512969420974,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=974,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("1.0", "java.util.GregorianCalendar[time=1512969420939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=939,ZONE_OFFSET=19800000,DST_OFFSET=0]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigInteger var2 = var1.toBigIntegerExact();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var5 = var1.setScale(1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.lang.String var2 = var1.toPlainString();
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var7 = var4.setScale(0, 1);
    java.math.BigDecimal var8 = var1.divideToIntegralValue(var7);
    java.math.BigDecimal var10 = var1.movePointRight((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1.0"+ "'", var2.equals("1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(1, "java.util.GregorianCalendar[time=1512969420937,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=937,ZONE_OFFSET=19800000,DST_OFFSET=0]", 10, 10, 0, (-1), (-1), 0, 100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100.0d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.leapYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("java.util.GregorianCalendar[time=1512969420939,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=47,SECOND=0,MILLISECOND=939,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(0L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Date var0 = new java.util.Date();

  }

}
