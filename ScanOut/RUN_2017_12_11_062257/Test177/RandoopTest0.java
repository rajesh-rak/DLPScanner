
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "hi!", (-1), 10, 1, 1, 10, (-1), 0, 1, 0, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    java.lang.String var19 = var13.getDisplayName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEndRule(0, 100, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "GMT+00:00"+ "'", var19.equals("GMT+00:00"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    java.lang.String var19 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]"+ "'", var19.equals("java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.lang.Object var4 = var3.clone();
    java.util.Collection var5 = var3.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    java.lang.String var19 = var13.getDisplayName();
    var13.setStartYear((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "GMT+00:00"+ "'", var19.equals("GMT+00:00"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    java.lang.String var19 = var13.getDisplayName();
    java.lang.String var22 = var13.getDisplayName(false, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "GMT+00:00"+ "'", var19.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GMT+00:00"+ "'", var22.equals("GMT+00:00"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Set var3 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    int var19 = var13.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]", 1);
    java.util.SimpleTimeZone var3 = var2.getLastRuleInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

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


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]", 1);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]\",offset=1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(10, "java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]", 10, 10, (-1), 1, (-1), (-1), 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date((-1), (-1), 1, 10, 1, 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("java.util.SimpleTimeZone[id=,offset=0,dstSavings=10,useDaylight=false,startYear=0,startMode=1,startMonth=10,startDay=1,startDayOfWeek=0,startTime=1,startTimeMode=-1,endMode=3,endMonth=-1,endDay=0,endDayOfWeek=10,endTime=10,endTimeMode=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var5 = new java.util.Date(0, 10, 10, (-1), 0);
    java.lang.String var6 = var5.toString();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setEndRule((-1), 0, 10, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEndRule(1, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.equals((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date(0, 10, 10, (-1), 0);
    var5.setTime(1L);
    java.util.Date var13 = new java.util.Date(0, 10, 10, (-1), 0);
    var13.setTime(1L);
    boolean var16 = var5.after(var13);
    int var17 = var5.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.lang.Object var4 = var3.clone();
    java.lang.Object var6 = var3.remove((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Hashtable var7 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    java.lang.Object var9 = var2.put((java.lang.Object)(-1.0f), (java.lang.Object)var8);
    boolean var10 = var8.isEmpty();
    java.util.Set var11 = var8.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 1.0f);
    java.util.SimpleTimeZone var16 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var16.setEndRule((-1), 0, 10, 10);
    java.lang.String var22 = var16.getDisplayName();
    boolean var23 = var2.containsKey((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GMT+00:00"+ "'", var22.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Hashtable var7 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    java.lang.Object var9 = var2.put((java.lang.Object)(-1.0f), (java.lang.Object)var8);
    java.util.Hashtable var12 = new java.util.Hashtable(10, 1.0f);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var12);
    java.lang.Object var14 = var13.clone();
    var8.putAll((java.util.Map)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var5 = new java.util.Date(0, 10, 10, (-1), 0);
    var5.setTime(1L);
    var5.setDate(0);
    var5.setYear(4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, 0, 1, 100);
    int var7 = var6.getYear();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    var13.setStartRule(100, 0, 4, (-1), false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 10, 1, 0, 1, (-1), 1, 1, (-1), 100, 0, 10);
    boolean var14 = var13.observesDaylightTime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setEndRule(100, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);

  }

}
