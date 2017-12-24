
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var6 = java.util.Date.UTC((-1), (-1), 10, 100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2242065440000L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    boolean var7 = var5.isLeapYear(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var5.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    var5.set(9, (-1800), (-1800), (-1), 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setWeekDate(0, 9, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(0L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    var7.setDate((-1));
    var7.setHours(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setWeekDate(100, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    int var7 = var6.getMonth();
    var6.setMonth(9);
    java.util.GregorianCalendar var15 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var16 = var15.getTime();
    int var17 = var16.getMonth();
    boolean var18 = var6.after(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    var5.set(0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var5.isSet((-1800));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    var5.set(0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var5.getActualMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    long var6 = java.util.Date.UTC(10, (-1800), 9, 100, 100, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-6625909191000L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    int var9 = var5.getActualMaximum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    int var7 = var6.getMonth();
    long var8 = var6.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-58985299860000L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    boolean var9 = var5.equals((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.set((-1), 11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    long var6 = java.util.Date.UTC(10, 0, 9, 1, 100, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1892755191000L));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    int var8 = var7.getDay();
    int var9 = var7.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    boolean var9 = var5.equals((java.lang.Object)0);
    int var11 = var5.getGreatestMinimum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    int var7 = var6.getYear();
    boolean var9 = var6.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1800));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    int var8 = var7.getDay();
    var7.setYear(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    var7.setDate((-1));
    int var10 = var7.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    java.util.Date var7 = var5.getGregorianChange();
    java.lang.Object var8 = var7.clone();
    java.util.GregorianCalendar var14 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var15 = var14.getTime();
    java.util.Date var16 = var14.getGregorianChange();
    int var17 = var16.getDay();
    boolean var18 = var7.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    boolean var7 = var5.isLeapYear(1);
    var5.set((-1), 11, 11, 5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var1 = new sun.security.x509.X509CertInfo(var0);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    boolean var7 = var5.isLeapYear(1);
    var5.set(100, (-1800), 1, 10, (-1), (-1800));
    java.lang.String var15 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=100,MONTH=-1800,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=10,MINUTE=-1,SECOND=-1800,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var15.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=100,MONTH=-1800,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=10,MINUTE=-1,SECOND=-1800,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "validity"+ "'", var1.equals("validity"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    var5.set(0, 1);
    var5.setMinimalDaysInFirstWeek((-1));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    boolean var7 = var5.isLeapYear(1);
    var5.roll(9, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    var5.set(9, (-1800), (-1800), (-1), 100, 1);
    var5.setFirstDayOfWeek((-1800));
    var5.setTimeInMillis((-6625909191000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    int var7 = var6.getMonth();
    var6.setMonth(9);
    int var10 = var6.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1800));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 1, 0, (-1));
    java.util.Date var6 = var5.getTime();
    var5.set(9, (-1800), (-1800), (-1), 100, 1);
    boolean var14 = var5.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

}
