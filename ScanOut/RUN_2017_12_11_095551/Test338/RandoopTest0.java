
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getFirstDayOfWeek();
    var0.set(1, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "", 10, 1, 10, 10, 1, 0, (-1), 1, (-1), 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    long var2 = var1.getSize();
    var1.setComment("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 10, 10, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getFirstDayOfWeek();
    var0.setMinimalDaysInFirstWeek(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    var0.setLenient(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    var1.setID("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    java.lang.String var2 = var1.getComment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.Calendar var1 = java.util.Calendar.getInstance(var0);
    java.util.GregorianCalendar var2 = new java.util.GregorianCalendar(var0);
    java.util.TimeZone var3 = var2.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    long var2 = var1.getSize();
    var1.setSize(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMethod((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    var1.setID("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.Calendar var1 = java.util.Calendar.getInstance(var0);
    java.util.GregorianCalendar var2 = new java.util.GregorianCalendar(var0);
    var2.roll(10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    var3.setMinimalDaysInFirstWeek(100);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, 10, 10, 0, 0, 10, 1);
    var10.setRawOffset(100);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    int var9 = var8.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, 10, 10, 0, 0, 10, 1);
    int var12 = var10.getOffset(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setMinimalDaysInFirstWeek(1);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512981156553,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=2,SECOND=36,MILLISECOND=553,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512981156553,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=2,SECOND=36,MILLISECOND=553,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    long var2 = var1.getSize();
    var1.setSize(1L);
    var1.setComment("java.util.GregorianCalendar[time=1512981156553,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=2,SECOND=36,MILLISECOND=553,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(1, "hi!", 1, 10, 1, (-1), 10, 0, 1, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.Calendar var1 = java.util.Calendar.getInstance(var0);
    java.util.GregorianCalendar var2 = new java.util.GregorianCalendar(var0);
    java.util.Date var3 = var2.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    java.util.Calendar var9 = java.util.Calendar.getInstance();
    var9.setLenient(true);
    java.util.Calendar var12 = java.util.Calendar.getInstance();
    int var13 = var12.getFirstDayOfWeek();
    boolean var15 = var12.before((java.lang.Object)0.0f);
    int var16 = var9.compareTo(var12);
    java.util.Date var17 = var12.getTime();
    boolean var18 = var3.after((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    boolean var10 = var8.equals((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, 10, 10, 0, 0, 10, 1);
    java.util.Calendar var11 = java.util.Calendar.getInstance();
    var11.setLenient(true);
    java.util.Calendar var14 = java.util.Calendar.getInstance();
    int var15 = var14.getFirstDayOfWeek();
    boolean var17 = var14.before((java.lang.Object)0.0f);
    int var18 = var11.compareTo(var14);
    java.util.Date var19 = var14.getTime();
    boolean var20 = var10.inDaylightTime(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    var3.set((-1), 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, 10, 10, 0, 0, 10, 1);
    var10.setRawOffset(1);
    boolean var13 = var10.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, 10, 10, 0, 0, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setEndRule(100, 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    int var4 = var3.getFirstDayOfWeek();
    boolean var6 = var3.before((java.lang.Object)0.0f);
    int var7 = var0.compareTo(var3);
    java.util.Date var8 = var3.getTime();
    int var9 = var8.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 117);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.zip.ZipEntry var1 = new java.util.zip.ZipEntry("");
    long var2 = var1.getSize();
    java.lang.String var3 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

}
