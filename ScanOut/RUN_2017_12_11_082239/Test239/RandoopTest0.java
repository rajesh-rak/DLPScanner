
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(4, 100, 1, 10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1819893541000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var6 = new java.util.Date(100, (-1), 10, 1, (-1), 100);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)(byte)10);
    java.util.Set var3 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.contains((java.lang.Object)(byte)10);
    java.util.Enumeration var3 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(100, 4, 4);
    var3.setHours((-1));
    int var6 = var3.getMonth();
    java.lang.String var7 = var3.toGMTString();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    int var7 = var3.getGreatestMinimum(0);
    java.lang.Object var8 = var3.clone();
    var3.roll(10, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    long var6 = java.util.Date.UTC(10, 4, 4, 1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1882825200000L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    int var7 = var3.getGreatestMinimum(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var3.isSet(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    java.lang.Object var6 = var3.clone();
    var3.setFirstDayOfWeek(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date(100, 4, 4);
    var3.setTime(10L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(100, 0, 1, 10, 100);
    java.lang.String var6 = var5.toLocaleString();
    int var7 = var5.getTimezoneOffset();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date(100, 0, 1, 10, 100);
    java.util.Date var11 = new java.util.Date(100, 0, 1, 10, 100);
    java.lang.String var12 = var11.toLocaleString();
    int var13 = var5.compareTo(var11);
    int var14 = var5.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    int var7 = var3.getGreatestMinimum(0);
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar(10, 0, 4);
    int var12 = var3.compareTo((java.util.Calendar)var11);
    var11.set((-330), 0, 1);
    boolean var18 = var11.isLeapYear((-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var1 = new java.util.Date(0L);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    int var4 = var3.getWeekYear();
    var3.setLenient(false);
    int var7 = var3.getFirstDayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    int var7 = var3.getGreatestMinimum(0);
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar(10, 0, 4);
    int var12 = var3.compareTo((java.util.Calendar)var11);
    var11.add(1, 4);
    java.util.Date var16 = var11.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    int var7 = var3.getGreatestMinimum(0);
    java.util.Date var8 = var3.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    java.lang.Object var6 = var3.clone();
    int var7 = var3.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 52);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date(100, 0, 1, 10, 100);
    java.lang.String var6 = var5.toLocaleString();
    java.lang.String var7 = var5.toLocaleString();
    int var8 = var5.getMonth();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    var3.setFirstDayOfWeek((-1));
    java.lang.Object var6 = var3.clone();
    int var7 = var3.getMinimalDaysInFirstWeek();
    var3.setMinimalDaysInFirstWeek((-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 4);
    int var4 = var3.getWeekYear();
    var3.setLenient(false);
    int var7 = var3.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(11, 100, (-330), 4, 0, 0);

  }

}
