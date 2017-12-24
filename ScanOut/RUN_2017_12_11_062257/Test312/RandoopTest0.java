
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    int[] var6 = new int[] { 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.getOffsetsByStandard(1L, var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeeksInWeekYear();
    boolean var3 = var0.equals((java.lang.Object)(-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.clear();
    int var2 = var0.getFirstDayOfWeek();
    java.util.Date var3 = var0.getGregorianChange();
    int var4 = var3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, (-1), 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var3.getWeeksInWeekYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(100, 5, 5, 1, 52, 100);
    long var7 = var6.getTime();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(52, "", 52, 1, 5, (-1), 10, 1, 10, 10, (-1), 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset(52, 0, 10, 52, 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.util.Date var10 = new java.util.Date(100, 5, 5, 1, 52, 100);
    boolean var11 = var2.inDaylightTime(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.getDisplayName(false, 5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, (-1), 10);
    int var4 = var3.getWeekYear();
    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar();
    var5.clear();
    int var7 = var3.compareTo((java.util.Calendar)var5);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeeksInWeekYear();
    java.util.GregorianCalendar var2 = new java.util.GregorianCalendar();
    var2.clear();
    int var4 = var2.getFirstDayOfWeek();
    java.util.Date var5 = var2.getGregorianChange();
    var0.setGregorianChange(var5);
    int var7 = var0.getFirstDayOfWeek();
    var0.set((-1), 5, (-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    int var4 = var2.getOffset((-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.util.Date var10 = new java.util.Date(100, 5, 5, 1, 52, 100);
    boolean var11 = var2.inDaylightTime(var10);
    var10.setMinutes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeeksInWeekYear();
    java.util.GregorianCalendar var2 = new java.util.GregorianCalendar();
    var2.clear();
    int var4 = var2.getFirstDayOfWeek();
    java.util.Date var5 = var2.getGregorianChange();
    var0.setGregorianChange(var5);
    int var8 = var0.getMinimum(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.util.Date var10 = new java.util.Date(100, 5, 5, 1, 52, 100);
    boolean var11 = var2.inDaylightTime(var10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.util.Date var10 = new java.util.Date(100, 5, 5, 1, 52, 100);
    boolean var11 = var2.inDaylightTime(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var2.getOffset(1, 52, 52, (-1), 52, 5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.clear();
    int var2 = var0.getFirstDayOfWeek();
    java.util.Date var3 = var0.getGregorianChange();
    java.lang.String var4 = var3.toGMTString();
    var3.setHours(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "15 Oct 1582 00:00:00 GMT"+ "'", var4.equals("15 Oct 1582 00:00:00 GMT"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.clear();
    int var2 = var0.getFirstDayOfWeek();
    java.util.Date var3 = var0.getGregorianChange();
    var0.add(0, 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.setProperty("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toGMTString();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getWeeksInWeekYear();
    var0.clear(0);
    java.util.GregorianCalendar var4 = new java.util.GregorianCalendar();
    var4.clear();
    int var6 = var4.getFirstDayOfWeek();
    java.util.Date var7 = var4.getGregorianChange();
    int var8 = var0.compareTo((java.util.Calendar)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var2 = var0.getProperty("");
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

}
