
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


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Enumeration var2 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    int var10 = var6.getMaximum(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 292278994);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    boolean var7 = var6.isLenient();
    int var9 = var6.getActualMinimum(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var17 = var15.getLeastMaximum(10);
    int var18 = var6.compareTo((java.util.Calendar)var15);
    java.util.Hashtable var20 = new java.util.Hashtable(1);
    java.lang.Object var22 = var20.remove((java.lang.Object)0);
    int var23 = var20.size();
    boolean var24 = var15.before((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.lang.Object var3 = var1.get((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var17 = var15.getLeastMaximum(10);
    int var18 = var6.compareTo((java.util.Calendar)var15);
    var6.setTimeInMillis((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date(1, 10, (-1));
    java.util.Date var7 = new java.util.Date(0, 10, 10);
    var7.setDate(1);
    boolean var10 = var3.after(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    boolean var7 = var6.isLenient();
    var6.set(100, 0, 292278994, 0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var17 = var15.getLeastMaximum(10);
    int var18 = var6.compareTo((java.util.Calendar)var15);
    java.util.Date var22 = new java.util.Date(1, 10, (-1));
    var6.setGregorianChange(var22);
    java.util.Date var27 = new java.util.Date(0, 10, 10);
    var27.setDate(1);
    var27.setMinutes(292278994);
    var27.setDate(0);
    var6.setTime(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), 1, 1, 1, 11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(1, 292278994, 11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var3 = var1.remove((java.lang.Object)0);
    int var4 = var1.size();
    java.util.Hashtable var6 = new java.util.Hashtable(1);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    var1.putAll((java.util.Map)var7);
    java.util.Enumeration var9 = var7.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.equals((java.lang.Object)(-1.0f));
    int var10 = var6.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var3 = new java.util.Date(0, 10, 10);
    var3.setDate(1);
    var3.setSeconds(292278994);
    int var8 = var3.getSeconds();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.xml.datatype.DatatypeFactory var0 = javax.xml.datatype.DatatypeFactory.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var17 = var15.getLeastMaximum(10);
    int var18 = var6.compareTo((java.util.Calendar)var15);
    var6.set(34, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    java.util.Date var1 = var0.getTime();
    var0.clear(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var3 = var1.remove((java.lang.Object)0);
    int var4 = var1.size();
    boolean var6 = var1.contains((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    boolean var7 = var6.isLenient();
    java.util.TimeZone var8 = var6.getTimeZone();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=100,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var9.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=100,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.contains((java.lang.Object)1);
    java.util.Collection var4 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var8 = var6.getLeastMaximum(10);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(1, (-1), 1, 1, (-1), 100);
    int var17 = var15.getLeastMaximum(10);
    int var18 = var6.compareTo((java.util.Calendar)var15);
    java.lang.String var19 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=100,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var19.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=100,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.Permissions var0 = new java.security.Permissions();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.security.Permissions@249f120 (\n)\n"+ "'", var1.equals("java.security.Permissions@249f120 (\n)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
