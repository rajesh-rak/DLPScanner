
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 1, 1, 10, 10, 1, 10, 10, 1, 0, (-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC(1, 0, 10, (-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2176678199000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "Mon Jan 10 00:00:00 IST 2000", 23, 100, 23, 23, 0, 23, (-1), 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    int[] var5 = new int[] { 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var2.getOffsets((-2176678199000L), var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var3 = new java.util.Date(100, 0, 10);
    java.util.Date var7 = new java.util.Date(100, 0, 10);
    int var8 = var3.compareTo(var7);
    var7.setHours((-1));
    java.util.Date var14 = new java.util.Date(100, 0, 10);
    java.util.Date var18 = new java.util.Date(100, 0, 10);
    int var19 = var14.compareTo(var18);
    var18.setHours((-1));
    boolean var22 = var7.before(var18);
    var18.setTime(0L);
    java.lang.String var25 = var18.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("Mon Jan 10 00:00:00 IST 2000");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(100, 0, 10);
    java.util.Date var7 = new java.util.Date(100, 0, 10);
    java.util.Date var11 = new java.util.Date(100, 0, 10);
    int var12 = var7.compareTo(var11);
    var11.setHours((-1));
    java.util.Date var18 = new java.util.Date(100, 0, 10);
    java.util.Date var22 = new java.util.Date(100, 0, 10);
    int var23 = var18.compareTo(var22);
    var22.setHours((-1));
    boolean var26 = var11.before(var22);
    int var27 = var11.getHours();
    boolean var28 = var3.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    boolean var6 = var2.hasSameRules((java.util.TimeZone)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(1, "hi!", 100, (-1), 10, 1, 100, 10, 23, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)(short)10);
    java.util.Hashtable var4 = new java.util.Hashtable(0);
    boolean var5 = var0.contains((java.lang.Object)var4);
    java.util.Set var6 = var4.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("Mon Jan 10 00:00:00 IST 2000");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)(short)10);
    java.util.Hashtable var4 = new java.util.Hashtable(0);
    boolean var5 = var0.contains((java.lang.Object)var4);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var1 = new java.util.Date("1 Jan 1970 00:00:00 GMT");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs();
    boolean var2 = var0.contains((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    int[] var5 = new int[] { 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var2.getOffsets(10L, var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    int[] var5 = new int[] { 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var2.getOffsetsByWall(1L, var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    java.lang.String var3 = var2.getID();
    java.util.SimpleTimeZone var4 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Mon Jan 10 00:00:00 IST 2000"+ "'", var3.equals("Mon Jan 10 00:00:00 IST 2000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(100, 0, 10);
    java.lang.String var4 = var3.toString();
    var3.setYear((-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    java.lang.String var3 = var2.getID();
    int var4 = var2.getRawOffset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getOffset(7, 23, 23, 23, 23, 23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Mon Jan 10 00:00:00 IST 2000"+ "'", var3.equals("Mon Jan 10 00:00:00 IST 2000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("Mon Jan 10 00:00:00 IST 2000", 100);
    int[] var4 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.getOffsets((-1L), var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(100, 0, 10);
    java.util.Date var7 = new java.util.Date(100, 0, 10);
    int var8 = var3.compareTo(var7);
    int var9 = var3.getMonth();
    java.util.Date var13 = new java.util.Date(100, 0, 10);
    java.util.Date var17 = new java.util.Date(100, 0, 10);
    int var18 = var13.compareTo(var17);
    var17.setHours((-1));
    var17.setYear(100);
    int var23 = var3.compareTo(var17);
    var3.setMinutes(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    java.util.Date var5 = new java.util.Date(100, 0, 10);
    java.util.Date var9 = new java.util.Date(100, 0, 10);
    int var10 = var5.compareTo(var9);
    int var11 = var5.getDate();
    boolean var12 = var0.containsKey((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

}
