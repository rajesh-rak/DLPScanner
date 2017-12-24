
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var1 = java.util.Date.parse("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var6 = new java.util.Date(0, (-1), 100, 10, 1, 0);
    java.lang.Object var7 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date(100L);
    java.lang.String var2 = var1.toGMTString();
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getMonth();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(100L);
    var1.setSeconds(10);
    int var4 = var1.getDay();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "global", 4, 1, 11, 100, 100, 11, 1, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)0.0f);
    java.util.Collection var5 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 1);
    int var3 = var2.getDSTSavings();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var4.equals("sun.util.calendar.ZoneInfo[id=\"GMT+00:00\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    java.util.TimeZone var3 = java.util.TimeZone.getDefault();
    boolean var4 = var2.hasSameRules(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var6 = java.util.Date.UTC(4, 0, 11, 0, (-330), (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2082000930000L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.String var1 = var0.getName();
    var0.finer("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "global"+ "'", var1.equals("global"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    var2.setStartRule(1, 3, 4);
    var2.setEndRule(11, 3, (-1), 100);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    var2.setRawOffset((-1));
    java.util.SimpleTimeZone var7 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    java.lang.String var8 = var7.getDisplayName();
    boolean var9 = var2.hasSameRules((java.util.TimeZone)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(4, (-330), (-1), (-330));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "GMT+00:00"+ "'", var8.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT+00:00", 1);
    boolean var3 = var2.useDaylightTime();
    int var5 = var2.getOffset(10L);
    boolean var6 = var2.observesDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getTimezoneOffset();
    var0.setDate(100);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    var2.setRawOffset((-1));
    java.util.SimpleTimeZone var7 = new java.util.SimpleTimeZone((-1), "1 Jan 1970 00:00:00 GMT");
    java.lang.String var8 = var7.getDisplayName();
    boolean var9 = var2.hasSameRules((java.util.TimeZone)var7);
    int var11 = var7.getOffset(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "GMT+00:00"+ "'", var8.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

}
