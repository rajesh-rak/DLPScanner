
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthAbbreviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "Dec"+ "'", var0.equals("Dec"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.secondInMinute();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 51.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInMonth("Dec");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "2017-12-11T12:20:51+05:1800000"+ "'", var0.equals("2017-12-11T12:20:51+05:1800000"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(1, 1, 10, (-1), (-1));
    int var7 = var0.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 53);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var6 = java.util.Date.UTC(10, 53, 0, (-1), 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1754269100000L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time("Dec");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var3 = var1.getReferencedMBeans("hi!");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.monthName("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.minuteInHour();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 20.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayOfWeekInMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 2.0d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 345.0d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var4 = var1.getRoleCardinality("Dec", "2017-12-11T12:20:51+05:1800000");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(1, 1, 10, (-1), (-1));
    boolean var7 = var0.isLenient();
    int var8 = var0.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 53);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.toCustomID(53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GMT+00:00"+ "'", var1.equals("GMT+00:00"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(53, "2017-12-11T12:20:51+05:1800000", 100, 0, 1, (-1), 0, 0, 1, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.setTimeInMillis(10L);
    long var3 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "2017-12-11T12:20:51+05:1800000", 1, 100, 1, 1, 100, (-1), 10, 1, 100, 10, 53);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 2.0d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(1, 1, 10, (-1), (-1));
    var0.setFirstDayOfWeek(53);
    boolean var10 = var0.before((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("Dec", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRole("2017-12-11T12:20:51+05:1800000", "");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.org.apache.xalan.internal.lib.ExsltDatetime var0 = new com.sun.org.apache.xalan.internal.lib.ExsltDatetime();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(1, 1, 10, (-1), (-1));
    boolean var7 = var0.isLenient();
    int var8 = var0.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int var1 = var0.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.setTimeInMillis(10L);
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    var3.set(1, 1, 10, (-1), (-1));
    var3.setFirstDayOfWeek(53);
    boolean var12 = var0.equals((java.lang.Object)var3);
    java.util.TimeZone var13 = var3.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    var1.set(1, 1, 10, (-1), (-1));
    boolean var8 = var1.isLenient();
    var1.set(10, 10);
    int var12 = var0.compareTo((java.util.Calendar)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 53, 53);
    java.util.Date var11 = new java.util.Date(100, 1, 10, 53, 53);
    boolean var12 = var5.after(var11);
    long var13 = var11.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 53, 53);
    int var6 = var5.getDay();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Map var3 = var1.getReferencedMBeans("Dec");
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.secondInMinute("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.util.Date var3 = new java.util.Date(53, 53, (-1));
    java.lang.String var4 = var3.toLocaleString();

  }

}
