
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug.println("hi!", "");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.valueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.lang.String var2 = var0.getProperty("hi!");
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}"+ "'", var4.equals("{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.util.Debug.println("{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}", "{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.lang.String var2 = var0.getProperty("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Collection var4 = var0.values();
    java.lang.Object var6 = var0.get((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, 100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.exiting("hi!", "hi!", (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var5 = var3.getMinimum(1);
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar(0, 100, (-1));
    int var10 = var3.compareTo((java.util.Calendar)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.lang.String var2 = var0.getProperty("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Collection var4 = var0.values();
    int var5 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    var3.setMinimalDaysInFirstWeek(0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)0, (byte)0, (byte)1};
    java.lang.String var5 = new java.lang.String(var3, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = new java.lang.String(var3, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0A00\u0A00\u0A01"+ "'", var5.equals("\u0A00\u0A00\u0A01"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = new java.lang.String(var0, "{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var5 = var3.getMinimum(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var3.getMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    char[] var3 = new char[] { '#', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, (-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Exception var1 = new java.lang.Exception((java.lang.Throwable)var0);
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var4 = var3.getFirstDayOfWeek();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=100,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var5.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=100,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Exception var1 = new java.lang.Exception((java.lang.Throwable)var0);
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    int var3 = var1.lastIndexOf("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Handler[] var1 = var0.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    java.lang.StringBuilder var3 = var1.append((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.lang.String var2 = var0.getProperty("hi!");
    boolean var3 = var0.isEmpty();
    java.util.Set var4 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var5 = var3.getMinimum(1);
    var3.setMinimalDaysInFirstWeek(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var5 = var3.getMinimum(1);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=100,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var6.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=100,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var3.getLeastMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    int var4 = var3.getFirstDayOfWeek();
    boolean var5 = var3.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var1.insert(9, 10.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Exception var1 = new java.lang.Exception((java.lang.Throwable)var0);
    sun.rmi.server.UnicastServerRef.clearStackTraces((java.lang.Throwable)var0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 100, (-1));
    var3.add(10, 0);
    var3.roll(0, true);
    var3.roll(10, false);

  }

}
