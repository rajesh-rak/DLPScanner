
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    int var7 = var6.getHours();
    boolean var9 = var6.equals((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    var6.setMinutes((-1));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    var1.setID("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var7 = var6.clone();
    int var8 = var6.getDay();
    int var9 = var6.getDay();
    var6.setMonth(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(100, "", (-2), 10, 10, 10, 6, (-2), (-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");
    boolean var2 = var1.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Package[] var0 = java.lang.Package.getPackages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.String var7 = var6.toGMTString();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    int var7 = var6.getHours();
    java.util.Date var14 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var15 = var14.clone();
    int var16 = var14.getDay();
    int var17 = var6.compareTo(var14);
    java.lang.String var18 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Package var1 = java.lang.Package.getPackage("Sat Dec 10 00:59:01 IST 1898");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "*:*", 1, 59, 1, 10, (-2), 10, 1, (-2), (-2), 59, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var7 = var6.clone();
    int var8 = var6.getDay();
    int var9 = var6.getDate();
    var6.setYear((-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var7 = var6.clone();
    int var8 = var6.getYear();
    var6.setHours(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    var6.setDate(100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    int var7 = var6.getHours();
    java.util.Date var14 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var15 = var14.clone();
    int var16 = var14.getDay();
    int var17 = var6.compareTo(var14);
    int var18 = var14.getMinutes();
    var14.setTime(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    var1.setID("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var1.getDisplayName(true, 6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    int var7 = var6.getHours();
    java.util.Date var14 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var15 = var14.clone();
    int var16 = var14.getDay();
    int var17 = var6.compareTo(var14);
    int var18 = var14.getMinutes();
    int var19 = var14.getSeconds();
    int var20 = var14.getMonth();
    int var21 = var14.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var6 = java.util.Date.UTC(0, (-2), (-1), 6, 11, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2214409740000L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("Sat Dec 10 00:59:01 IST 1898");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var5 = new java.util.Date((-2), (-2), (-1), 10, 10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");
    java.lang.String var2 = var1.toString();
    boolean var3 = var1.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "*:*"+ "'", var2.equals("*:*"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.management.ObjectName var1 = new javax.management.ObjectName("");
    boolean var2 = var1.isPattern();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "*:*"+ "'", var3.equals("*:*"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var7 = var6.clone();
    int var8 = var6.getYear();
    java.util.Date var15 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    int var16 = var15.getHours();
    java.util.Date var23 = new java.util.Date((-1), (-1), 10, 1, (-1), 1);
    java.lang.Object var24 = var23.clone();
    int var25 = var23.getDay();
    int var26 = var15.compareTo(var23);
    boolean var27 = var6.before(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "9 Dec 1898 19:29:01 GMT");

  }

}
