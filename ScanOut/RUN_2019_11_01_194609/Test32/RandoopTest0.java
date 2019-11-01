
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    var6.setFirstDayOfWeek(0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.time.ZonedDateTime var7 = var6.toZonedDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var11 = var10.getTimeZone();
    var0.setTimeZone(var11);
    boolean var14 = var0.before((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 0, 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var0 = new java.util.Date();
    var0.setDate(1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    int var5 = var0.get(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 44);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.getOrDefault((java.lang.Object)100.0d, (java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1)+ "'", var3.equals((-1)));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    int var5 = var0.getGreatestMinimum(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Set var0 = java.util.Calendar.getAvailableCalendarTypes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    java.time.ZonedDateTime var4 = var0.toZonedDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(100, (-1), 119, 1, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 954205801000L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(1, 1, 3, 44, (-1), 3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var0 = new java.util.Date();
    java.time.Instant var1 = var0.toInstant();
    int var2 = var0.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    var6.set(2019, 1, 44, 3, 19, 2019);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    var6.setMinimalDaysInFirstWeek(44);
    boolean var9 = var6.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var7 = var6.getTimeZone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.roll(51, 51);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var10 = var9.getTimeZone();
    java.lang.Object var11 = var0.getOrDefault((java.lang.Object)var1, (java.lang.Object)var9);
    java.lang.Object var14 = var1.setProperty("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getHours();
    long var2 = var0.getTime();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getYear();
    int var2 = var0.getMinutes();
    int var3 = var0.getMonth();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = new java.util.Hashtable((java.util.Map)var0);
    boolean var3 = var0.containsValue((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getHours();
    var0.setDate((-1));
    java.lang.String var4 = var0.toString();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var10 = var9.getTimeZone();
    java.lang.Object var11 = var0.getOrDefault((java.lang.Object)var1, (java.lang.Object)var9);
    boolean var13 = var1.containsKey((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var11 = var10.getTimeZone();
    var0.setTimeZone(var11);
    java.util.Date var13 = new java.util.Date();
    java.time.Instant var14 = var13.toInstant();
    java.util.Date var15 = java.util.Date.from(var14);
    java.lang.String var16 = var15.toString();
    var0.setGregorianChange(var15);
    var15.setYear(2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Fri Nov 01 19:51:50 IST 2019"+ "'", var16.equals("Fri Nov 01 19:51:50 IST 2019"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    var0.setLenient(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWeekDate(10, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeekYear();
    var0.setFirstDayOfWeek(3);
    var0.setLenient(false);
    var0.setFirstDayOfWeek(44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2019);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var10 = var9.getTimeZone();
    java.lang.Object var11 = var0.getOrDefault((java.lang.Object)var1, (java.lang.Object)var9);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "{}"+ "'", var12.equals("{}"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.GregorianCalendar var9 = new java.util.GregorianCalendar(10, (-1), 10, (-1), 0, 3);
    java.util.TimeZone var10 = var9.getTimeZone();
    java.lang.Object var11 = var0.getOrDefault((java.lang.Object)var1, (java.lang.Object)var9);
    java.util.Date var12 = var9.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
