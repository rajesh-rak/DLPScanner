
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(1, (-1), 1, 1, (-1), 10);
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=-1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=1,MINUTE=-1,SECOND=10,MILLISECOND=513,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var8.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=-1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=1,MINUTE=-1,SECOND=10,MILLISECOND=513,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)100.0f);
    java.util.Set var3 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date(0, 10, 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var5 = new java.util.Date(1, 1, 10, 10, 1);
    java.util.Date var11 = new java.util.Date(1, 1, 10, 10, 1);
    int var12 = var11.getTimezoneOffset();
    var11.setMinutes(100);
    boolean var15 = var5.before(var11);
    java.lang.Object var16 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.clear(0);
    boolean var3 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, (-353), (-1), 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setWeekDate((-1), 1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, (-353), (-1), 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.clear((-353));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setTimeInMillis(0L);
    var0.clear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)100.0f);
    java.lang.Object var4 = var0.get((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var5 = new java.util.Date(1, 100, (-1), (-1), 10);
    int var6 = var5.getYear();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    int var1 = var0.getFirstDayOfWeek();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.util.GregorianCalendar[time=1512955595557,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=56,SECOND=35,MILLISECOND=557,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var2.equals("java.util.GregorianCalendar[time=1512955595557,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=56,SECOND=35,MILLISECOND=557,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var5 = new java.util.Date(1, 100, (-1), (-1), 10);
    var5.setYear(0);
    boolean var9 = var5.equals((java.lang.Object)0);
    int var10 = var5.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var1 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getDate();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    java.util.Enumeration var2 = var0.keys();
    java.util.Enumeration var3 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var5 = new java.util.Date(1, 1, 10, 10, 1);
    java.util.Date var11 = new java.util.Date(1, 1, 10, 10, 1);
    int var12 = var11.getTimezoneOffset();
    var11.setMinutes(100);
    boolean var15 = var5.before(var11);
    int var16 = var11.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, (-353), (-1), 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var5.getMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var5 = new java.util.Date(1, 1, 10, 10, 1);
    int var6 = var5.getTimezoneOffset();
    var5.setMinutes(100);
    int var9 = var5.getSeconds();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getMinutes();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(1, (-1), 1, 1, (-1), 10);
    boolean var9 = var0.before((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var3 = var0.put((java.lang.Object)'a', (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    boolean var3 = var1.containsValue((java.lang.Object)(-1.0d));
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Date var6 = new java.util.Date(1, 1, 10, 10, 1);
    java.util.Date var12 = new java.util.Date(1, 1, 10, 10, 1);
    int var13 = var12.getTimezoneOffset();
    var12.setMinutes(100);
    boolean var16 = var6.before(var12);
    java.util.Date var22 = new java.util.Date(1, 100, (-1), (-1), 10);
    java.lang.Object var23 = var0.put((java.lang.Object)var16, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, (-353), (-1), 1, 10);
    java.util.Date var11 = new java.util.Date(1, 100, (-1), (-1), 10);
    var11.setYear(0);
    var11.setTime(10L);
    var5.setGregorianChange(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var5.getActualMaximum((-353));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

}
