
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = new java.util.Properties();
    sun.util.calendar.ZoneInfo var3 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var4 = var0.containsValue((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var3 = var2.clone();
    sun.util.calendar.ZoneInfo var6 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var7 = var6.clone();
    boolean var8 = var2.hasSameRules((java.util.TimeZone)var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var12 = var2.hasSameRules((java.util.TimeZone)var11);
    java.lang.String var13 = var2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    java.util.Collection var4 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    long var6 = java.util.Date.UTC(0, 10, (-1), 10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2182859940000L));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var3 = var2.clone();
    int var4 = var2.getRawOffset();
    var2.setID("");
    boolean var7 = var2.isDirty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    sun.util.calendar.ZoneInfo var6 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var7 = var6.clone();
    sun.util.calendar.ZoneInfo var10 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var11 = var10.clone();
    boolean var12 = var6.hasSameRules((java.util.TimeZone)var10);
    sun.util.calendar.ZoneInfo var15 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var16 = var6.hasSameRules((java.util.TimeZone)var15);
    java.lang.Object var18 = var0.put((java.lang.Object)var6, (java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var5 = new java.util.Date(10, (-1), (-1), (-1), 0);
    int var6 = var5.getHours();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date(0, 0, 0, 1, 100, 100);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 10, 23, (-1), (-1), 1);
    var6.set(100, 1, 100, 1, 23, 100);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    boolean var5 = var0.contains((java.lang.Object)"");
    java.lang.Object var7 = var0.remove((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, 10, 23, (-1), (-1), 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var6.getGreatestMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    boolean var5 = var0.contains((java.lang.Object)"");
    java.util.Enumeration var6 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "hi!", 100, 0, (-1), 100, (-1), (-1), 10, 23, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "", (-1), 100, 10, 10, 10, (-1), 100, 0, 23, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), (-1), 10, 0, (-1), (-1));
    sun.util.calendar.ZoneInfo var9 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var10 = var6.after((java.lang.Object)"hi!");
    sun.util.calendar.ZoneInfo var13 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.util.SimpleTimeZone var14 = var13.getLastRuleInstance();
    var13.setID("");
    java.util.Date var22 = new java.util.Date(10, (-1), (-1), (-1), 0);
    int var23 = var22.getMinutes();
    boolean var24 = var13.inDaylightTime(var22);
    boolean var25 = var6.after((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "");
    sun.util.calendar.Gregorian var4 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    java.lang.Object var5 = var0.get((java.lang.Object)var4);
    sun.util.calendar.ZoneInfo var8 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.lang.Object var9 = var8.clone();
    int var10 = var8.getRawOffset();
    boolean var11 = var8.useDaylightTime();
    java.lang.Object var12 = var0.remove((java.lang.Object)var11);
    java.util.Set var13 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), (-1), 10, 0, (-1), (-1));
    sun.util.calendar.ZoneInfo var9 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var10 = var6.after((java.lang.Object)"hi!");
    var6.set(100, 1, 10, 100, 23, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), (-1), 10, 0, (-1), (-1));
    sun.util.calendar.ZoneInfo var9 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var10 = var6.after((java.lang.Object)"hi!");
    var6.setLenient(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var6.isSet((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
