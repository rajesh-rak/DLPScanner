
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
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = new javax.management.ObjectName("", "", "");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var1 = new javax.management.ObjectName("Mon Dec 11 14:43:30 IST 2017");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 100, 1, 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    java.lang.String var8 = var7.getCanonicalName();
    boolean var9 = var3.apply(var7);
    javax.management.ObjectName var10 = javax.management.ObjectName.getInstance(var3);
    java.lang.String var11 = var10.getCanonicalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!:hi!="+ "'", var8.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!:hi!="+ "'", var11.equals("hi!:hi!="));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    int var3 = var0.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.ObjectName var3 = javax.management.ObjectName.getInstance("hi!", "Mon Dec 11 14:43:30 IST 2017", "Mon Dec 11 14:43:30 IST 2017");
      fail("Expected exception of type javax.management.MalformedObjectNameException");
    } catch (javax.management.MalformedObjectNameException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var7 = new javax.management.ObjectName("hi!", "hi!", "");
    java.lang.String var8 = var7.getCanonicalName();
    boolean var9 = var3.apply(var7);
    javax.management.ObjectName var13 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var17 = new javax.management.ObjectName("hi!", "hi!", "");
    java.lang.String var18 = var17.getCanonicalName();
    boolean var19 = var13.apply(var17);
    javax.management.ObjectName var20 = javax.management.ObjectName.getInstance(var13);
    boolean var21 = var3.apply(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!:hi!="+ "'", var8.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!:hi!="+ "'", var18.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(100, 100, 1, (-1), 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var4 = var3.isPropertyValuePattern();
    java.lang.String var6 = var3.getKeyProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    java.util.Collection var2 = var0.values();
    java.util.Enumeration var3 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    java.util.Collection var2 = var0.values();
    java.util.Properties var3 = new java.util.Properties(var0);
    java.lang.Object var5 = var0.get((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    java.util.Set var2 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var0 = new java.util.Date();
    long var1 = var0.getTime();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var4 = var3.isPropertyValuePattern();
    boolean var6 = var3.equals((java.lang.Object)(-1.0d));
    boolean var7 = var3.isPropertyValuePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.jmx.mbeanserver.Repository var2 = new com.sun.jmx.mbeanserver.Repository("", true);
    javax.management.ObjectName var6 = new javax.management.ObjectName("hi!", "hi!", "");
    javax.management.ObjectName var10 = new javax.management.ObjectName("hi!", "hi!", "");
    java.lang.String var11 = var10.getCanonicalName();
    boolean var12 = var6.apply(var10);
    boolean var13 = var2.contains(var10);
    javax.management.ObjectName var17 = new javax.management.ObjectName("hi!", "hi!", "");
    boolean var18 = var17.isPropertyValuePattern();
    boolean var20 = var17.equals((java.lang.Object)(-1.0d));
    javax.management.DynamicMBean var21 = var2.retrieve(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!:hi!="+ "'", var11.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    int var3 = var0.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.management.ObjectName var3 = new javax.management.ObjectName("hi!", "hi!", "");
    java.lang.String var4 = var3.getCanonicalName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var3.isPropertyValuePattern("Mon Dec 11 14:43:30 IST 2017");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!:hi!="+ "'", var4.equals("hi!:hi!="));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "Mon Dec 11 14:43:30 IST 2017");
    java.lang.String var3 = var2.toString();
    boolean var4 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.SimpleTimeZone[id=Mon Dec 11 14:43:30 IST 2017,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"+ "'", var3.equals("java.util.SimpleTimeZone[id=Mon Dec 11 14:43:30 IST 2017,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("hi!:hi!=", "hi!:hi!=");
    int var4 = var0.size();
    java.util.Enumeration var5 = var0.elements();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!:hi!="+ "'", var3.equals("hi!:hi!="));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

}
