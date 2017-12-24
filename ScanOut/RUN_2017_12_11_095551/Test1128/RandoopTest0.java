
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "0a"+ "'", var2.equals("0a"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("0a");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var6.getMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.util.Debug.println("", "0a");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.getGreatestMinimum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var7.setYear((-1));
    var7.setTime(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    java.util.Formatter var2 = new java.util.Formatter(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var7.setYear((-1));
    var7.setMonth(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    int var8 = var6.get(0);
    int var9 = var6.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 53);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable();
    var1.addSuppressed(var2);
    java.lang.Exception var4 = new java.lang.Exception("", var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.util.Formatter var8 = new java.util.Formatter();
    boolean var9 = var7.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.xml.datatype.DatatypeFactory var0 = javax.xml.datatype.DatatypeFactory.newInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.xml.datatype.XMLGregorianCalendar var5 = var0.newXMLGregorianCalendarTime(53, (-1), 1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var7.setYear((-1));
    var7.setDate(100);
    int var12 = var7.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    var1.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    var7.setYear((-1));
    java.util.GregorianCalendar var16 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var17 = var16.getTime();
    var17.setYear((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = var7.after(var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0a");
    var1.print(100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    boolean var9 = var6.before((java.lang.Object)(short)1);
    var6.setLenient(true);
    var6.setMinimalDaysInFirstWeek(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 1, 53);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    boolean var9 = var6.before((java.lang.Object)(short)1);
    var6.setLenient(true);
    long var12 = var6.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-62137330130000L));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(53);
    java.lang.String var2 = var1.toString();
    java.math.BigDecimal var3 = var1.plus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "53"+ "'", var2.equals("53"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 10, 100, 1, 10);
    java.util.Date var7 = var6.getTime();
    java.lang.String var8 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.util.GregorianCalendar[time=-62137330130000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=11,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var8.equals("java.util.GregorianCalendar[time=-62137330130000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=11,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=14,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=10,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0a");
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.io.PrintStream var5 = var1.printf("hi!", (java.lang.Object[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable();
    var0.addSuppressed(var1);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable"+ "'", var3.equals("java.lang.Throwable"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

}
