
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(10, (-1), (-1), 10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1896265199000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWeekDate(10, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWeekDate(1, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    var0.setLenient(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648789L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    int var1 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    var0.setTimeInMillis(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648797L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getWeekYear();
    int var3 = var0.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648802L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2017);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getWeekYear();
    boolean var3 = var0.isLenient();
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648803L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.util.GregorianCalendar[time=1512955648803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=57,SECOND=28,MILLISECOND=803,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var4.equals("java.util.GregorianCalendar[time=1512955648803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=57,SECOND=28,MILLISECOND=803,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 0, 2017);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1512955648803L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1512955648798L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getWeekYear();
    boolean var3 = var0.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getActualMinimum(2017);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648821L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("java.util.GregorianCalendar[time=1512955648803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=57,SECOND=28,MILLISECOND=803,ZONE_OFFSET=19800000,DST_OFFSET=0]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date(1, 1, 10, 2017, 2017);
    var5.setTime(1512955648802L);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getWeekYear();
    boolean var3 = var0.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getLeastMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648829L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getWeekYear();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    long var4 = var3.getTimeInMillis();
    int var5 = var0.compareTo((java.util.Calendar)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648830L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1512955648831L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 1, 2017);
    var3.setTimeInMillis(1512955648791L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getFirstDayOfWeek();
    int var3 = var0.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648837L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2017);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.setFirstDayOfWeek(2017);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.clear(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    int var2 = var0.getFirstDayOfWeek();
    java.util.Date var8 = new java.util.Date(1, 1, 10, 2017, 2017);
    var0.setGregorianChange(var8);
    int var10 = var8.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512955648842L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.annotation.Annotation[] var3 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    var0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    long var2 = var1.getTimeInMillis();
    int var3 = var1.getFirstDayOfWeek();
    java.util.Date var9 = new java.util.Date(1, 1, 10, 2017, 2017);
    var1.setGregorianChange(var9);
    boolean var11 = var0.containsKey((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1512955648850L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("hi!");
    boolean var4 = var0.engineIsCertificateEntry("hi!");
    boolean var6 = var0.engineIsKeyEntry("java.util.GregorianCalendar[time=1512955648803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=57,SECOND=28,MILLISECOND=803,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    char[] var2 = new char[] { };
    java.security.Key var3 = var0.engineGetKey("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    var1.clear();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "java.util.GregorianCalendar[time=1512955648803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=57,SECOND=28,MILLISECOND=803,ZONE_OFFSET=19800000,DST_OFFSET=0]");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

}
