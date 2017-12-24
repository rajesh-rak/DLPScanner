
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var2 = var0.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date((-1), 1, 10);
    int var4 = var3.getSeconds();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var3 = new java.util.Date((-1), 1, 10);
    java.util.Date var7 = new java.util.Date((-1), 1, 10);
    boolean var8 = var3.after(var7);
    var3.setSeconds((-1));
    java.lang.String var11 = var3.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    sun.util.calendar.ZoneInfo var22 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var26 = new int[] { 10, 10};
    int var27 = var22.getOffsetsByStandard(1L, var26);
    int var28 = var2.getOffsets(1L, var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("9 Feb, 1899 11:59:59 PM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var19 = var2.getID();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var2.getDisplayName(false, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var19 = var2.getID();
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var8.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    var8.setFirstDayOfWeek(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    int var10 = var8.get(10);
    boolean var11 = var8.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var3 = new java.util.Date((-1), 1, 10);
    java.util.Date var7 = new java.util.Date((-1), 1, 10);
    boolean var8 = var3.after(var7);
    int var9 = var3.getMinutes();
    java.util.Date var13 = new java.util.Date((-1), 1, 10);
    java.util.Date var17 = new java.util.Date((-1), 1, 10);
    boolean var18 = var13.after(var17);
    int var19 = var13.getMinutes();
    boolean var20 = var3.equals((java.lang.Object)var13);
    int var21 = var13.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var19 = var2.getID();
    java.lang.Object var20 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar((java.util.TimeZone)var2);
    int var10 = var8.get(10);
    int var12 = var8.getMaximum(10);
    var8.set(11, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "");
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var9 = new int[] { 10, 10};
    int var10 = var5.getOffsetsByStandard(1L, var9);
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar((java.util.TimeZone)var5);
    int var13 = var11.get(10);
    int var15 = var11.getMaximum(10);
    boolean var16 = var2.equals((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(11, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 0, (-1), (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "");
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var9 = new int[] { 10, 10};
    int var10 = var5.getOffsetsByStandard(1L, var9);
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar((java.util.TimeZone)var5);
    int var13 = var11.get(10);
    int var15 = var11.getMaximum(10);
    boolean var16 = var2.equals((java.lang.Object)10);
    int var17 = var2.getRawOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var19 = var2.getID();
    int[] var21 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var22 = var2.getOffsets(1L, var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var6 = new int[] { 10, 10};
    int var7 = var2.getOffsetsByStandard(1L, var6);
    sun.util.calendar.ZoneInfo var11 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var15 = new int[] { 10, 10};
    int var16 = var11.getOffsetsByStandard(1L, var15);
    int var17 = var2.getOffsetsByWall((-1L), var15);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    java.lang.String var19 = var2.getID();
    java.util.Hashtable var22 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var24 = new java.util.Hashtable(10);
    java.util.Hashtable var25 = new java.util.Hashtable((java.util.Map)var24);
    boolean var26 = var22.containsValue((java.lang.Object)var25);
    boolean var27 = var2.equals((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "9 Feb, 1899 11:59:59 PM", 100, 100, (-1), 11, 100, 0, (-1), 100, (-1), (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone((-1), "");
    sun.util.calendar.ZoneInfo var5 = new sun.util.calendar.ZoneInfo("hi!", 0);
    int[] var9 = new int[] { 10, 10};
    int var10 = var5.getOffsetsByStandard(1L, var9);
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar((java.util.TimeZone)var5);
    int var13 = var11.get(10);
    int var15 = var11.getMaximum(10);
    boolean var16 = var2.equals((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(0, 1, 10, (-1), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, 10, 100, (-1), 0, 1);

  }

}
