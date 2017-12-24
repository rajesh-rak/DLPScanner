
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"", 1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var1 = sun.util.calendar.ZoneInfoFile.getZoneInfo("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, true);
    byte[] var4 = new byte[] { };
    var3.write(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var7 = new java.util.Formatter((java.io.OutputStream)var3, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore((-1L), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.ZoneInfoFile var0 = new sun.util.calendar.ZoneInfoFile();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var1.print(false);
    var1.print((java.lang.Object)100.0f);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, true);
    java.io.PrintStream var5 = new java.io.PrintStream("hi!");
    java.io.PrintStream var7 = new java.io.PrintStream((java.io.OutputStream)var5, true);
    byte[] var8 = new byte[] { };
    var7.write(var8);
    var3.write(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    java.util.Date var11 = new java.util.Date(0, 1, 0, 0, 100);
    int var12 = var5.compareTo(var11);
    java.lang.String var13 = var11.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", (-1));
    boolean var3 = var2.useDaylightTime();
    int var4 = var2.getDSTSavings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getOffset(100, 100, 0, 1, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var5 = new java.util.Formatter((java.io.OutputStream)var1, "31 Jan, 1900 1:40:00 AM");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, true);
    var3.flush();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var2.flush();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var0 = java.lang.System.nanoTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512970079556019000L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", (-1));
    boolean var3 = var2.useDaylightTime();
    int var4 = var2.getDSTSavings();
    java.util.SimpleTimeZone var5 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    java.util.Date var11 = new java.util.Date(0, 1, 0, 0, 100);
    int var12 = var5.compareTo(var11);
    var11.setDate(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date(0, 1, 0, 0, 100);
    int var6 = var5.getMinutes();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "", 1, 100, (-1), 40, 100, 3, 100, (-1), 1, 3, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var1 = java.lang.System.getProperty("31 Jan, 1900 1:40:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, true);
    java.lang.System.setOut(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(10L);
    var1.close();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.toCustomID(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GMT+00:00"+ "'", var1.equals("GMT+00:00"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var1.print(false);
    java.io.PrintStream var7 = new java.io.PrintStream("hi!");
    var7.println(10L);
    var7.close();
    java.lang.Object[] var11 = new java.lang.Object[] { var7};
    java.io.PrintStream var12 = var1.printf("", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.HashMap var1 = new java.util.HashMap(3);
    var1.clear();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.io.OutputStream)var1);
    var1.print(false);
    var1.flush();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", (-1));
    boolean var3 = var2.useDaylightTime();
    int var4 = var2.getDSTSavings();
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    var2.setID("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

}
