
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date(0, 10, 10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var2 = var0.isSet(10);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512929072808,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=344,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=34,SECOND=32,MILLISECOND=808,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512929072808,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=344,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=34,SECOND=32,MILLISECOND=808,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
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
    assertTrue(var1 == 1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getMonth();
    java.util.Date var4 = new java.util.Date(0L);
    int var5 = var4.getMonth();
    int var6 = var1.compareTo(var4);
    java.util.Date var8 = new java.util.Date(0L);
    int var9 = var8.getMonth();
    boolean var10 = var1.before(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    sun.net.www.MimeEntry var3 = var0.findByFileName("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    var0.setTimeInMillis(1L);
    var0.set(10, 4, 4);
    java.util.Date var9 = new java.util.Date(0L);
    int var10 = var9.getMonth();
    int var11 = var9.getDay();
    var0.setTime(var9);
    boolean var14 = var0.isSet(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getTimezoneOffset();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    var0.setTimeInMillis(1L);
    var0.set(10, 4, 4);
    var0.set(4, 10, 100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    boolean var3 = var0.after((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getMonth();
    java.lang.String var3 = var1.toGMTString();
    java.lang.Object var4 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    var0.setTimeInMillis(1L);
    var0.set(10, 4, 4);
    java.util.Calendar var8 = java.util.Calendar.getInstance();
    java.util.Date var10 = new java.util.Date(0L);
    int var11 = var10.getMonth();
    java.util.Date var13 = new java.util.Date(0L);
    int var14 = var13.getMonth();
    int var15 = var10.compareTo(var13);
    var8.setTime(var10);
    int var17 = var0.compareTo(var8);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=4,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=1,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var18.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=4,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=1,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    java.util.Enumeration var2 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getMonth();
    int var3 = var1.getDay();
    java.util.Date var5 = new java.util.Date(0L);
    int var6 = var5.getMonth();
    boolean var7 = var1.after(var5);
    int var8 = var1.getTimezoneOffset();
    java.util.Date var10 = new java.util.Date(0L);
    int var11 = var10.getMonth();
    int var12 = var10.getDay();
    boolean var13 = var1.before(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getMinimalDaysInFirstWeek();
    var0.setTimeInMillis(1L);
    var0.set(10, 4, 4);
    java.util.Date var9 = new java.util.Date(0L);
    int var10 = var9.getMonth();
    int var11 = var9.getDay();
    var0.setTime(var9);
    int var13 = var9.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var2 = var0.isSet(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, 4, 10, 1, 4);
    int var7 = var5.getMaximum(1);
    int var8 = var5.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 292278994);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 52);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getMonth();
    int var3 = var1.getDay();
    java.util.Date var5 = new java.util.Date(0L);
    int var6 = var5.getMonth();
    boolean var7 = var1.after(var5);
    boolean var9 = var5.equals((java.lang.Object)4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.lang.String[] var2 = sun.util.calendar.ZoneInfo.getAvailableIDs((-1));
    boolean var3 = var0.equals((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("java.util.GregorianCalendar[time=1512929072808,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=344,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=34,SECOND=32,MILLISECOND=808,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    java.lang.String var2 = var1.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Greenwich Mean Time"+ "'", var2.equals("Greenwich Mean Time"));

  }

}
