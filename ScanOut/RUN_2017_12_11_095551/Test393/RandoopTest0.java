
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(10, 10, 1, (-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1867193400000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    java.lang.Object var7 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    long var9 = var6.getTime();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    java.lang.String var9 = var6.toGMTString();
    java.lang.Object var10 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    int var9 = var6.getTimezoneOffset();
    var6.setHours(11);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var7 = var6.getTimeInMillis();
    sun.util.calendar.ZoneInfo var8 = new sun.util.calendar.ZoneInfo();
    boolean var9 = var8.useDaylightTime();
    var6.setTimeZone((java.util.TimeZone)var8);
    java.util.GregorianCalendar var17 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var18 = var17.getTimeInMillis();
    sun.util.calendar.ZoneInfo var19 = new sun.util.calendar.ZoneInfo();
    boolean var20 = var19.useDaylightTime();
    var17.setTimeZone((java.util.TimeZone)var19);
    boolean var22 = var19.useDaylightTime();
    boolean var23 = var8.equals((java.lang.Object)var19);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    byte[] var4 = new byte[] { };
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("9 Dec, 1900 10:59:10 PM", var4, var5);
    com.sun.crypto.provider.JceKeyStore var8 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var10 = var8.engineGetCertificate("");
    byte[] var12 = new byte[] { };
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { };
    var8.engineSetKeyEntry("9 Dec, 1900 10:59:10 PM", var12, var13);
    java.security.cert.Certificate[] var15 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var12, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    java.lang.String var9 = var6.toGMTString();
    long var10 = var6.getTime();
    java.lang.String var11 = var6.toString();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    int var9 = var6.getTimezoneOffset();
    int var10 = var6.getSeconds();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(1, 0, 1, 100, (-1), (-353));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2177093213000L));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var7 = var6.getTimeInMillis();
    sun.util.calendar.ZoneInfo var8 = new sun.util.calendar.ZoneInfo();
    boolean var9 = var8.useDaylightTime();
    var6.setTimeZone((java.util.TimeZone)var8);
    int var11 = var6.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-59008613461000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 52);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var7 = var6.getTimeInMillis();
    int var8 = var6.getWeekYear();
    var6.set(1, (-1));
    java.util.GregorianCalendar var18 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var19 = var18.getTimeInMillis();
    int var20 = var6.compareTo((java.util.Calendar)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-59008613461000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-59008613461000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var7 = var6.getMonth();
    java.lang.String var8 = var6.toLocaleString();
    int var9 = var6.getTimezoneOffset();
    var6.setMonth(0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    var6.clear(10);
    boolean var10 = var6.isLeapYear(10);
    var6.roll(0, 10);
    boolean var15 = var6.after((java.lang.Object)1L);
    java.util.Date var16 = var6.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var7 = var6.getTimeInMillis();
    sun.util.calendar.ZoneInfo var8 = new sun.util.calendar.ZoneInfo();
    boolean var9 = var8.useDaylightTime();
    var6.setTimeZone((java.util.TimeZone)var8);
    java.lang.String var11 = var8.getID();
    boolean var12 = var8.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-59008613461000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("9 Dec 1900 17:05:50 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int var2 = var0.getOffset((-59008613461000L));
    boolean var3 = var0.observesDaylightTime();
    java.util.Calendar var4 = java.util.Calendar.getInstance((java.util.TimeZone)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 1, 1, 100, (-1), (-1));
    long var7 = var6.getTimeInMillis();
    int var8 = var6.getWeekYear();
    var6.set(1, (-1));
    java.util.TimeZone var12 = var6.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-59008613461000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
