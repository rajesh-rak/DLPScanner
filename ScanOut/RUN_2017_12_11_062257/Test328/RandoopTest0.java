
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


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.clear((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date(0L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var7 = var5.getMaximum(4);
    int var9 = var5.getLeastMaximum(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var7 = var5.getMaximum(4);
    int var9 = var5.getGreatestMinimum(1);
    java.util.TimeZone var10 = var5.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Date var4 = new java.util.Date(100L);
    boolean var5 = var2.contains((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var7 = var5.getMaximum(4);
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var8.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    boolean var6 = var0.engineContainsAlias("hi!");
    boolean var8 = var0.engineIsKeyEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    boolean var6 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    char[] var9 = new char[] { '4', '#', 'a'};
    java.security.Key var10 = var0.engineGetKey("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore((-1L), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var7 = var5.getMaximum(4);
    int var9 = var5.getGreatestMinimum(1);
    int var11 = var5.getLeastMaximum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.keySet();
    java.lang.Object var4 = var2.clone();
    java.util.Set var5 = var2.keySet();
    java.util.Hashtable var8 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var9 = var8.keySet();
    java.lang.Object var10 = var8.clone();
    int var11 = var8.size();
    java.util.GregorianCalendar var17 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var19 = var17.getMaximum(4);
    boolean var20 = var8.contains((java.lang.Object)var19);
    java.lang.Object var21 = var2.remove((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 1, 1);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 1, 1);
    java.util.GregorianCalendar var10 = new java.util.GregorianCalendar(0, 0, 10, 1, 0);
    int var12 = var10.getMaximum(4);
    boolean var14 = var10.isLeapYear(10);
    int var15 = var0.compareTo((java.util.Calendar)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 6, 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date((-1), 6, 6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(0, 1, 1);
    java.util.Date var5 = var0.getTime();
    var5.setTime(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var6 = new java.util.Date(1, 0, (-1), 1, (-1), 10);
    java.util.Date var13 = new java.util.Date(1, 0, (-1), 1, (-1), 10);
    boolean var14 = var6.after(var13);
    var6.setTime(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.keySet();
    java.lang.Object var4 = var2.clone();
    java.util.Set var5 = var2.entrySet();
    java.util.Collection var6 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
