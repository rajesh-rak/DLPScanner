
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    int var5 = var3.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 9);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var9 = var8.isLenient();
    var8.clear();
    int var11 = var3.compareTo((java.util.Calendar)var8);
    boolean var13 = var8.after((java.lang.Object)9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Enumeration var3 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var9 = var8.isLenient();
    var8.clear();
    int var11 = var3.compareTo((java.util.Calendar)var8);
    boolean var13 = var3.after((java.lang.Object)100L);
    int var15 = var3.getActualMinimum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDate();
    int var2 = var0.getMinutes();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Set var3 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("{}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    var3.clear();
    var3.clear(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var3.getActualMinimum(30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDate();
    int var2 = var0.getDay();
    var0.setTime(10L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    var3.set(0, 7, 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var9 = var8.isLenient();
    var8.clear();
    int var11 = var3.compareTo((java.util.Calendar)var8);
    int var13 = var8.getActualMaximum(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 292278994);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isWeekDateSupported();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var3.getActualMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    var3.clear();
    var3.clear(0);
    var3.setFirstDayOfWeek(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    int var2 = var1.size();
    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var7 = var6.isWeekDateSupported();
    int var9 = var6.getGreatestMinimum(0);
    boolean var10 = var1.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    int var2 = var1.size();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.Date var5 = var3.getTime();
    var3.add(10, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.contains((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    int var5 = var3.get(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.setProperty("", "{}");
    java.util.Properties var4 = new java.util.Properties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(7, 10, 11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var9 = var8.isLenient();
    var8.clear();
    int var11 = var3.compareTo((java.util.Calendar)var8);
    boolean var13 = var8.after((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.String var1 = var0.toLocaleString();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDate();
    var0.setDate(11);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isLenient();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var9 = var8.isLenient();
    var8.clear();
    int var11 = var3.compareTo((java.util.Calendar)var8);
    var3.setFirstDayOfWeek(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var3.getMaximum(30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.String var2 = var1.toString();
    java.util.Set var3 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, (-1), (-1));
    boolean var4 = var3.isWeekDateSupported();
    var3.roll(1, true);
    boolean var8 = var3.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

}
