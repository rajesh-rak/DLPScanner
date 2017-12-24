
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    java.lang.String var7 = var6.toString();
    boolean var9 = var6.after((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=-1,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var7.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=-1,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    java.util.Date var7 = var6.getGregorianChange();
    var6.set(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDay();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getDate();
    java.util.Date var8 = new java.util.Date(100, 1, 1);
    int var9 = var8.getDate();
    boolean var10 = var3.after(var8);
    java.lang.String var11 = var3.toString();
    java.util.GregorianCalendar var18 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    int var19 = var18.getMinimalDaysInFirstWeek();
    boolean var20 = var3.equals((java.lang.Object)var18);
    long var21 = var3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getDate();
    java.util.Date var8 = new java.util.Date(100, 1, 1);
    int var9 = var8.getDate();
    boolean var10 = var3.after(var8);
    java.lang.String var11 = var3.toString();
    java.util.GregorianCalendar var18 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    int var19 = var18.getMinimalDaysInFirstWeek();
    boolean var20 = var3.equals((java.lang.Object)var18);
    int var21 = var18.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getDate();
    java.util.Date var8 = new java.util.Date(100, 1, 1);
    int var9 = var8.getDate();
    boolean var10 = var3.after(var8);
    java.lang.String var11 = var3.toString();
    java.util.GregorianCalendar var18 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    int var19 = var18.getMinimalDaysInFirstWeek();
    boolean var20 = var3.equals((java.lang.Object)var18);
    int var22 = var18.getGreatestMinimum(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "Tue Feb 01 00:00:00 IST 2000");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    java.lang.String var7 = var6.toString();
    int var9 = var6.getLeastMaximum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=-1,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var7.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=-1,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getDate();
    java.util.Date var8 = new java.util.Date(100, 1, 1);
    int var9 = var8.getDate();
    boolean var10 = var3.after(var8);
    int var11 = var3.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    java.util.Date var7 = var6.getGregorianChange();
    java.lang.String var8 = var7.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "15 Oct 1582 00:00:00 GMT"+ "'", var8.equals("15 Oct 1582 00:00:00 GMT"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.ZoneInfoFile var0 = new sun.util.calendar.ZoneInfoFile();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1, 53, 1, 53, 53);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]", (-1), 10, 53, 11, 100, 100, 11, 11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    int var7 = var6.getMinimalDaysInFirstWeek();
    var6.set(0, 53, 0);
    boolean var13 = var6.equals((java.lang.Object)"java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=-1,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    var6.set(53, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", 11, 11, 10, 11, 10, 11, 53, 53, 0, 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    long var7 = var6.getTimeInMillis();
    int var8 = var6.getWeeksInWeekYear();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-62108742601000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.util.GregorianCalendar[time=-62108742601000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=59,SECOND=59,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var9.equals("java.util.GregorianCalendar[time=-62108742601000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=59,SECOND=59,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 1);
    java.util.SimpleTimeZone var3 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 10, 1, 0, (-1));
    int var7 = var6.getMinimalDaysInFirstWeek();
    var6.setMinimalDaysInFirstWeek(0);
    var6.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 1);
    java.lang.String var3 = var2.toString();
    var2.setRawOffset(1);
    boolean var6 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(100, 1, 1);
    int var4 = var3.getDate();
    java.util.Date var8 = new java.util.Date(100, 1, 1);
    int var9 = var8.getDate();
    boolean var10 = var3.after(var8);
    java.util.Date var14 = new java.util.Date(100, 1, 1);
    int var15 = var14.getDate();
    java.util.Date var19 = new java.util.Date(100, 1, 1);
    int var20 = var19.getDate();
    boolean var21 = var14.after(var19);
    boolean var23 = var19.equals((java.lang.Object)100.0d);
    sun.security.x509.CertificateValidity var24 = new sun.security.x509.CertificateValidity(var3, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setDecimalSeparator('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.PrintStream var1 = new java.io.PrintStream("15 Oct 1582 00:00:00 GMT");

  }

}
