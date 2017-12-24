
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC((-1), 10, 1, (-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2214262730000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.roll((-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    int var4 = var3.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var2 = var0.isLeapYear(21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    int var4 = var3.getSeconds();
    java.lang.String var5 = var3.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "11 Dec, 2017 12:01:21 PM"+ "'", var5.equals("11 Dec, 2017 12:01:21 PM"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.util.Set var2 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    int var4 = var3.getTimezoneOffset();
    java.lang.Object var5 = var3.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    var3.setTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var0);
    int var3 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    var0.putAll((java.util.Map)var1);
    java.util.Collection var3 = var1.values();
    java.util.Enumeration var4 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.lang.String var3 = var0.toString();
    var0.set(100, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512973881722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=722,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512973881722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=722,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    int var4 = var3.getSeconds();
    int var5 = var3.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 117);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWeekDate(21, 0, 29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.lang.String var3 = var0.toString();
    var0.set(100, 117, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512973881736,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=736,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512973881736,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=736,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    java.util.GregorianCalendar var4 = new java.util.GregorianCalendar();
    int var6 = var4.get(1);
    java.util.Date var7 = var4.getTime();
    int var8 = var7.getTimezoneOffset();
    var0.setGregorianChange(var7);
    var0.set(1, 10);
    boolean var14 = var0.after((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    var0.clear(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.lang.String var3 = var0.toString();
    int var5 = var0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512973881753,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=753,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512973881753,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=1,SECOND=21,MILLISECOND=753,ZONE_OFFSET=19800000,DST_OFFSET=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    var0.set(21, 100, 1, 1, 21);
    int var10 = var0.getWeekYear();
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar();
    int var13 = var11.get(1);
    java.util.Date var14 = var11.getTime();
    var0.setTime(var14);
    int var16 = var0.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 52);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date((-330), 29, 21, 2017, 100);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    int var4 = var3.getTimezoneOffset();
    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar();
    int var7 = var5.get(1);
    java.util.Date var8 = var5.getTime();
    var5.set(21, 100, 1, 1, 21);
    int var15 = var5.getWeekYear();
    java.util.GregorianCalendar var16 = new java.util.GregorianCalendar();
    int var18 = var16.get(1);
    java.util.Date var19 = var16.getTime();
    var5.setTime(var19);
    boolean var21 = var3.after(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    var0.set(21, 100, 1, 1, 21);
    int var10 = var0.getWeekYear();
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar();
    int var13 = var11.get(1);
    java.util.Date var14 = var11.getTime();
    var0.setTime(var14);
    long var16 = var14.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1512973881775L);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = new java.util.Properties();
    int var1 = var0.size();
    java.util.Enumeration var2 = var0.elements();
    java.util.Properties var3 = new java.util.Properties();
    java.util.Properties var4 = new java.util.Properties();
    var3.putAll((java.util.Map)var4);
    java.lang.String var8 = var4.getProperty("", "hi!");
    java.security.ProtectionDomain[] var10 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var11 = new java.security.AccessControlContext(var10);
    java.security.DomainCombiner var12 = var11.getDomainCombiner();
    java.lang.Object var13 = var4.put((java.lang.Object)' ', (java.lang.Object)var11);
    var0.putAll((java.util.Map)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

}
