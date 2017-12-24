
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = javax.management.ObjectName.quote("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\"hi!\""+ "'", var1.equals("\"hi!\""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(0L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("hi!", false);
    java.lang.Integer var3 = var2.getCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var0 = new java.util.Date();
    var0.setSeconds(10);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    var0.putAll((java.util.Map)var1);
    java.util.Set var3 = var1.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var1 = var0.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Asia/Kolkata"+ "'", var1.equals("Asia/Kolkata"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var1 = new java.util.Properties();
    java.util.Properties var2 = new java.util.Properties();
    var1.putAll((java.util.Map)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var4 = javax.management.ObjectName.getInstance("", (java.util.Hashtable)var1);
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("Asia/Kolkata", false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = new javax.management.ObjectName("Asia/Kolkata");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    var0.putAll((java.util.Map)var1);
    java.util.Properties var3 = new java.util.Properties(var1);
    sun.util.calendar.ZoneInfo var6 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.util.Date var7 = new java.util.Date();
    var7.setYear(1);
    int var10 = var7.getSeconds();
    boolean var11 = var6.inDaylightTime(var7);
    boolean var12 = var1.containsValue((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    int var3 = var0.indexOf((java.lang.Object)true, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.stringPropertyNames();
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("\"hi!\"", "Asia/Kolkata");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Asia/Kolkata"+ "'", var3.equals("Asia/Kolkata"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    boolean var2 = var0.isEmpty();
    int var3 = var0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("Asia/Kolkata");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = javax.management.ObjectName.unquote("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear(1);
    int var3 = var0.getSeconds();
    var0.setHours(1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.rmi.server.RMISocketFactory var0 = java.rmi.server.RMISocketFactory.getSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    java.util.Date var3 = new java.util.Date();
    var3.setYear(1);
    int var6 = var3.getSeconds();
    boolean var7 = var2.inDaylightTime(var3);
    int var8 = var3.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    boolean var2 = var0.isEmpty();
    java.rmi.server.RMISocketFactory var3 = java.rmi.server.RMISocketFactory.getDefaultSocketFactory();
    var0.addElement((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(11, "Asia/Kolkata", 100, 100, 1, 100, 3, 100, (-1), 11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear(1);
    int var3 = var0.getMonth();
    int var4 = var0.getDay();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    int[] var6 = new int[] { 1, 1};
    int var7 = var2.getOffsets(1L, var6);
    int[] var9 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var2.getOffsetsByWall(0L, var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    boolean var2 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.set(1, (java.lang.Object)'a');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var0 = new java.util.Date();
    var0.setYear(1);
    var0.setDate(9);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Vector var0 = new java.util.Vector();
    int var1 = var0.capacity();
    int var3 = var0.indexOf((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

}
