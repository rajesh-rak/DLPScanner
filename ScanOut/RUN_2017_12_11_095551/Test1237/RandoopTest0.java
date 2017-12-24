
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Monday"+ "'", var0.equals("Monday"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "10:46:29+05:1800000"+ "'", var0.equals("10:46:29+05:1800000"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthAbbreviation("Monday");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "Monday", (-1), 10, 0, 10, 10, 1, 0, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("10:46:29+05:1800000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var6 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    int var7 = var6.getDate();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 11.0d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var2 = new char[] { 'a', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var3 = new java.math.BigDecimal(var2);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.minuteInHour();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 46.0d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("10:46:29+05:1800000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 2.0d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    java.util.Date var13 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    int var14 = var6.compareTo(var13);
    var13.setMinutes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("10:46:29+05:1800000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date();
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    java.util.Date var13 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    int var14 = var6.compareTo(var13);
    var6.setDate(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date(29, (-1), (-1), 1, 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayName("java.util.GregorianCalendar[time=1512969389671,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=671,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 0, (-1), (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    java.util.Date var13 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    java.util.Date var20 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    int var21 = var13.compareTo(var20);
    boolean var22 = var6.before(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1L);
    java.lang.String var2 = var1.toString();
    java.math.BigDecimal var3 = var1.negate();
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toEngineeringString();
    java.math.BigDecimal var8 = var3.subtract(var5);
    java.math.BigDecimal var10 = var8.movePointLeft(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "1"+ "'", var6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "1"+ "'", var7.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    java.util.Date var13 = new java.util.Date((-1), 10, (-1), (-1), 10, 100);
    int var14 = var6.compareTo(var13);
    var6.setTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInYear("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.lang.String var1 = var0.toString();
    long var2 = var0.getTimeInMillis();
    var0.set(0, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.util.GregorianCalendar[time=1512969389713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=713,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var1.equals("java.util.GregorianCalendar[time=1512969389713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=713,ZONE_OFFSET=19800000,DST_OFFSET=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1512969389713L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1L);
    java.lang.String var2 = var1.toString();
    java.math.BigDecimal var5 = var1.setScale((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.secondInMinute("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(29, "java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.SimpleTimeZone[id=java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0],offset=29,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"+ "'", var3.equals("java.util.SimpleTimeZone[id=java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0],offset=29,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L);
    java.lang.String var3 = var2.toString();
    boolean var4 = var0.before((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.isSet((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "1"+ "'", var3.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.ClassLoader var1 = java.lang.ClassLoader.getSystemClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.datatype.DatatypeFactory var2 = javax.xml.datatype.DatatypeFactory.newInstance("Monday", var1);
      fail("Expected exception of type javax.xml.datatype.DatatypeConfigurationException");
    } catch (javax.xml.datatype.DatatypeConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(29, "java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(29, "java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.lang.String var1 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.isSet((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.util.GregorianCalendar[time=1512969389732,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0],offset=29,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=16,SECOND=29,MILLISECOND=761,ZONE_OFFSET=29,DST_OFFSET=0]"+ "'", var1.equals("java.util.GregorianCalendar[time=1512969389732,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=java.util.GregorianCalendar[time=1512969389705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=29,MILLISECOND=705,ZONE_OFFSET=19800000,DST_OFFSET=0],offset=29,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=16,SECOND=29,MILLISECOND=761,ZONE_OFFSET=29,DST_OFFSET=0]"));

  }

}
