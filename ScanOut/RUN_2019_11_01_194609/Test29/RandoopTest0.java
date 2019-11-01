
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var7 = var6.toGMTString();
    java.lang.String var8 = var6.toString();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Enumeration var1 = var0.elements();
    sun.net.www.MimeEntry var3 = var0.findByExt("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    var6.setMinutes(10);
    int var9 = var6.getDate();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Wed Jan 30 09:58:59 IST 1901");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var5 = new java.util.Date(30, 100, 100, 1, 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var3);
    java.util.Properties var5 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var6 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var5.putAll((java.util.Map)var6);
    java.util.Properties var8 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var5.putAll((java.util.Map)var8);
    java.util.Properties var10 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Set var11 = var10.stringPropertyNames();
    java.lang.Object var13 = var5.replace((java.lang.Object)var11, (java.lang.Object)"30 Jan 1901 04:37:49 GMT");
    java.util.Date var15 = new java.util.Date(10L);
    java.lang.Object var16 = var3.replace((java.lang.Object)"30 Jan 1901 04:37:49 GMT", (java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Enumeration var1 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    java.lang.String var3 = var0.getProperty("Wed Jan 30 09:58:59 IST 1901");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Set var1 = var0.stringPropertyNames();
    boolean var3 = var0.containsValue((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var1 = new java.util.Date(1L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var3);
    java.util.Date var11 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var12 = var11.toGMTString();
    var11.setDate((-1));
    int var15 = var11.getYear();
    java.lang.Object var16 = var3.get((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var3);
    java.util.Properties var5 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Set var6 = var5.stringPropertyNames();
    java.lang.Object var8 = var0.replace((java.lang.Object)var6, (java.lang.Object)"30 Jan 1901 04:37:49 GMT");
    java.util.Date var16 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var17 = var16.toGMTString();
    java.lang.Object var18 = var0.getOrDefault((java.lang.Object)10, (java.lang.Object)var17);
    java.lang.Object var21 = var0.setProperty("30 Jan 1901 04:37:49 GMT", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "30 Jan 1901 04:37:49 GMT"+ "'", var18.equals("30 Jan 1901 04:37:49 GMT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    int var7 = var6.getDate();
    java.time.Instant var8 = var6.toInstant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}"+ "'", var3.equals("{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.lang.String var4 = var1.getProperty("{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var3);
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var0);
    var5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Properties var1 = var0.getAsProperties();
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var4 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var3.putAll((java.util.Map)var4);
    var4.clear();
    boolean var7 = var1.remove((java.lang.Object)"{calendar.taiwanese.eras=name=MinGuo,since=-1830384000000, calendar.taiwanese.type=LocalGregorianCalendar, calendar.hijrah.Hijrah-umalqura=hijrah-config-umalqura.properties, calendar.hijrah.Hijrah-umalqura.type=islamic-umalqura, calendar.thai-buddhist.eras=name=BuddhistEra,abbr=B.E.,since=-79302585600000, calendar.thai-buddhist.type=LocalGregorianCalendar, calendar.thai-buddhist.year-boundary=day1=4-1,since=-79302585600000; day1=1-1,since=-915148800000, calendar.japanese.eras=name=Meiji,abbr=M,since=-3218832000000;  name=Taisho,abbr=T,since=-1812153600000; name=Showa,abbr=S,since=-1357603200000;  name=Heisei,abbr=H,since=600220800000;   name=Reiwa,abbr=R,since=1556668800000, calendar.japanese.type=LocalGregorianCalendar}", (java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    var6.setMinutes(10);
    boolean var10 = var6.equals((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.util.Date var13 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var14 = var13.toGMTString();
    int var15 = var13.getMinutes();
    boolean var16 = var6.after(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("Wed Jan 30 09:58:59 IST 1901");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var1 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var0.putAll((java.util.Map)var3);
    boolean var6 = var3.contains((java.lang.Object)100L);
    java.util.Properties var7 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    java.util.Properties var8 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var7.putAll((java.util.Map)var8);
    java.util.Properties var10 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    var7.putAll((java.util.Map)var10);
    java.util.Hashtable var12 = new java.util.Hashtable((java.util.Map)var7);
    boolean var13 = var3.containsValue((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var7 = var6.toGMTString();
    var6.setMonth(100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var6 = new java.util.Date(1, 1, (-1), 10, (-1), (-1));
    java.lang.String var7 = var6.toGMTString();
    int var8 = var6.getMinutes();
    boolean var10 = var6.equals((java.lang.Object)0L);
    int var11 = var6.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
