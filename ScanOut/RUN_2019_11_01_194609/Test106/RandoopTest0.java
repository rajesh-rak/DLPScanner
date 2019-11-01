
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.VM.unsuspendThreads();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.ClassLoader var0 = sun.misc.VM.latestUserDefinedLoader0();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var2 = new java.lang.Throwable(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ClassLoader var0 = sun.misc.VM.latestUserDefinedLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var1 = var0.getWeekLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.System.runFinalizersOnExit(false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.valueOf(var0, 7, 7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(7, "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]", 100, 1, 7, (-1), 7, 7, 7, (-1), 1, 0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", 0, 0, 1, 1, 0, 0, 1, 1, 10, 10, 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"+ "'", var14.equals("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"+ "'", var15.equals("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", 0, 0, 1, 1, 0, 0, 1, 1, 10, 10, 1);
    int var14 = var13.getRawOffset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setDSTSavings(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = sun.misc.VM.getSavedProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = sun.util.calendar.CalendarSystem.getCalendarProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var1 = new char[] { '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, (-1), 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", 0, 0, 1, 1, 0, 0, 1, 1, 10, 10, 1);
    java.lang.String var14 = var13.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setStartRule((-1), 10, 10, 7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"+ "'", var14.equals("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = java.lang.String.valueOf(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.util.Properties var2 = java.lang.System.getProperties();
    java.util.Enumeration var3 = var2.elements();
    java.lang.Object var4 = var0.replace((java.lang.Object)(byte)1, (java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.util.Debug.println("100", "");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.getProperty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var1 = java.lang.System.clearProperty("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"+ "'", var1.equals("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var3 = new java.util.Date(0, 7, 100);
    java.util.Date var7 = new java.util.Date(0, 7, 100);
    boolean var8 = var3.before(var7);
    int var9 = var3.getTimezoneOffset();
    java.lang.String var10 = var3.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    java.lang.Object var3 = var0.setProperty("100", "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]");
    java.lang.System.setProperties(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", 0, 0, 1, 1, 0, 0, 1, 1, 10, 10, 1);
    java.lang.String var14 = var13.toString();
    java.lang.String var17 = var13.getDisplayName(true, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"+ "'", var14.equals("java.util.SimpleTimeZone[id=hi!,offset=-1,dstSavings=1,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=1,startTime=1,startTimeMode=0,endMode=2,endMonth=0,endDay=1,endDayOfWeek=1,endTime=10,endTimeMode=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "GMT+00:00"+ "'", var17.equals("GMT+00:00"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Date var3 = new java.util.Date(0, 7, 100);
    java.util.Date var7 = new java.util.Date(0, 7, 100);
    boolean var8 = var3.before(var7);
    int var9 = var3.getSeconds();
    int var10 = var3.getSeconds();
    var3.setYear((-321));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    char[] var2 = new char[] { '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = java.lang.String.valueOf(var2, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
