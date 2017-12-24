
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(10L, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    long var6 = var5.getTime();
    long var7 = var5.getTime();
    java.util.Date var13 = new java.util.Date(10, 0, 100, 1, 1);
    long var14 = var13.getTime();
    long var15 = var13.getTime();
    int var16 = var5.compareTo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    long var6 = var5.getTime();
    java.lang.String var7 = var5.toString();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    var5.setHours((-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    long var6 = var5.getTime();
    int var7 = var5.getDate();
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setTimeInMillis(5L);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=5,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=5,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=5,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=30,SECOND=0,MILLISECOND=5,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    long var1 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512961064396L);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    java.util.Date var11 = new java.util.Date(10, 0, 100, 1, 1);
    long var12 = var11.getTime();
    long var13 = var11.getTime();
    boolean var14 = var5.before(var11);
    var11.setHours(0);
    int var17 = var11.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(4, 0, 10, 0, 4);
    boolean var7 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 4, 100, 4, 4, 0);
    int var8 = var6.getGreatestMinimum(10);
    boolean var9 = var6.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var1 = new java.util.Date(10L);
    int var2 = var1.getTimezoneOffset();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var3 = new java.util.Date((-330), (-1), 10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(10, 0, 100, 1, 1);
    long var6 = var5.getTime();
    long var7 = var5.getTime();
    var5.setHours((-1));
    int var10 = var5.getSeconds();
    java.lang.Object var11 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 4, 100, 4, 4, 0);
    int var8 = var6.getGreatestMinimum(10);
    boolean var10 = var6.equals((java.lang.Object)100L);
    boolean var12 = var6.equals((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var1 = var0.clone();
    java.lang.String var2 = var0.toString();
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 4, 100, 4, 4, 0);
    int var7 = var6.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 52);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.clear(1);
    boolean var3 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var1 = var0.clone();
    int var2 = var0.size();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Collection var4 = var3.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var1 = var0.clone();
    int var2 = var0.size();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Date var9 = new java.util.Date(10, 0, 100, 1, 1);
    long var10 = var9.getTime();
    long var11 = var9.getTime();
    var9.setHours((-1));
    var9.setMonth(100);
    boolean var16 = var0.contains((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 4, 100, 4, 4, 0);
    int var8 = var6.getGreatestMinimum(10);
    boolean var10 = var6.equals((java.lang.Object)100L);
    var6.roll(100, 0);
    int var15 = var6.getLeastMaximum(1);
    int var16 = var6.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 292269054);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 4, 100, 4, 4, 0);
    int var8 = var6.getGreatestMinimum(10);
    boolean var10 = var6.equals((java.lang.Object)100L);
    var6.roll(100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var6.getActualMinimum((-330));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
