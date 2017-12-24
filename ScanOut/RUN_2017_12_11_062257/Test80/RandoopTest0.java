
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var1 = new sun.security.util.DerInputStream(var0);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var7 = var6.toGMTString();
    boolean var9 = var6.equals((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String[] var1 = new java.lang.String[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.JarIndex var2 = new sun.misc.JarIndex(var1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)0, (byte)1, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var6 = new sun.security.util.DerInputStream(var3, (-1), 10);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var7 = var6.toGMTString();
    java.util.Date var14 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var15 = var14.toGMTString();
    boolean var16 = var6.before(var14);
    java.util.Date var23 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var24 = var23.toGMTString();
    java.util.Date var31 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var32 = var31.toGMTString();
    boolean var33 = var23.before(var31);
    boolean var34 = var6.after(var31);
    int var35 = var6.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("2 Nov 1901 22:06:50 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var6.setDate(10);
    java.util.Date var15 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var16 = var15.toGMTString();
    java.util.Date var23 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var24 = var23.toGMTString();
    boolean var25 = var15.before(var23);
    java.util.Date var32 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var33 = var32.toGMTString();
    java.util.Date var40 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var41 = var40.toGMTString();
    boolean var42 = var32.before(var40);
    boolean var43 = var15.after(var40);
    boolean var45 = var15.equals((java.lang.Object)(short)(-1));
    boolean var46 = var6.after(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var7 = var6.toGMTString();
    java.util.Date var14 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var15 = var14.toGMTString();
    boolean var16 = var6.before(var14);
    java.util.Date var23 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var24 = var23.toGMTString();
    java.util.Date var31 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var32 = var31.toGMTString();
    boolean var33 = var23.before(var31);
    java.util.Date var40 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var41 = var40.toGMTString();
    java.util.Date var48 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var49 = var48.toGMTString();
    boolean var50 = var40.before(var48);
    boolean var51 = var23.after(var48);
    int var52 = var6.compareTo(var23);
    var6.setHours(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var1 = new java.util.Date(0L);
    var1.setMonth(100);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var6.setDate(10);
    java.lang.String var9 = var6.toLocaleString();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var3 = var0.getDisplayName(false, 1);
    var0.setID("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "India Standard Time"+ "'", var3.equals("India Standard Time"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var7 = var6.toGMTString();
    java.util.Date var14 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var15 = var14.toGMTString();
    boolean var16 = var6.before(var14);
    java.util.Date var23 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var24 = var23.toGMTString();
    java.util.Date var31 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var32 = var31.toGMTString();
    boolean var33 = var23.before(var31);
    java.util.Date var40 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var41 = var40.toGMTString();
    java.util.Date var48 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var49 = var48.toGMTString();
    boolean var50 = var40.before(var48);
    boolean var51 = var23.after(var48);
    int var52 = var6.compareTo(var23);
    int var53 = var23.getTimezoneOffset();
    int var54 = var23.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var7 = var6.toGMTString();
    java.util.Date var14 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var15 = var14.toGMTString();
    boolean var16 = var6.before(var14);
    java.util.Date var23 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var24 = var23.toGMTString();
    java.util.Date var31 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var32 = var31.toGMTString();
    boolean var33 = var23.before(var31);
    java.util.Date var40 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var41 = var40.toGMTString();
    java.util.Date var48 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.lang.String var49 = var48.toGMTString();
    boolean var50 = var40.before(var48);
    boolean var51 = var23.after(var48);
    int var52 = var6.compareTo(var23);
    var6.setMonth((-353));
    int var55 = var6.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("India Standard Time");
    int var3 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var3 = var0.getDisplayName(false, 1);
    java.util.TimeZone.setDefault(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "India Standard Time"+ "'", var3.equals("India Standard Time"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var6 = new java.util.Date(10, 4, (-353), 1, 10, 100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var1 = new sun.security.timestamp.TimestampToken(var0);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 0, 100, 1, 0);
    int var7 = var6.getSeconds();
    int var8 = var6.getDate();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    long var6 = java.util.Date.UTC(7, 3, 7, 10, 0, (-353));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1979820353000L));

  }

}
