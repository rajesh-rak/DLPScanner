
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var1 = new byte[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var4 = new sun.security.util.DerInputStream(var1, 1, 0);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", 100, 1, 10, 0, (-1), 100, 10, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", false);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte[] var4 = var3.getOctetString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)1, (byte)100, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var4 = new sun.security.timestamp.TimestampToken(var3);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.zip.ZipFile var1 = new java.util.zip.ZipFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var3.getBMPString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var3.getEnumerated();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era[] var1 = var0.getEras();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.lang.Object var3 = var1.remove((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.TimeZone.setDefault(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.containsKey((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var4 = new sun.security.timestamp.TimestampToken(var2);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);
    java.lang.String[] var3 = java.util.TimeZone.getAvailableIDs(1);
    sun.misc.JarIndex var4 = new sun.misc.JarIndex(var3);
    java.lang.String[] var6 = java.util.TimeZone.getAvailableIDs(1);
    sun.misc.JarIndex var7 = new sun.misc.JarIndex(var6);
    var7.add("hi!", "hi!");
    var7.add("", "");
    var4.merge(var7, "");
    java.lang.Object var16 = var1.remove((java.lang.Object)var7);
    int var17 = var1.size();
    java.util.Collection var18 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    byte[] var4 = var3.toByteArray();
    var3.mark(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue var4 = var3.getDerValue();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    byte[] var4 = var3.toByteArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var3.getInteger();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setMinimalDaysInFirstWeek(100);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512953837605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=100,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=27,SECOND=17,MILLISECOND=605,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512953837605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=100,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=27,SECOND=17,MILLISECOND=605,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar(var0);
    boolean var2 = var1.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    sun.security.util.DerInputStream var3 = new sun.security.util.DerInputStream(var2);
    byte[] var4 = var3.toByteArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var5 = var3.getPositiveBigInteger();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    boolean var3 = var2.isDirty();
    java.util.Date var9 = new java.util.Date(10, 0, 100, (-1), 0);
    boolean var10 = var2.inDaylightTime(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
