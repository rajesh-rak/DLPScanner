
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


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

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC(1, 10, (-1), 100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2150999990000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone((-1), "", 10, (-1), 1, 1, 10, (-1), (-1), (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var2 = new sun.security.util.DerInputStream(var1);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    boolean var8 = var3.before((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    int var7 = var0.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "hi!", (-1), 10, 0, 10, 10, 1, 100, 1, 1, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.isSet((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.containsValue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    boolean var8 = var3.after((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    com.sun.crypto.provider.SunJCE var1 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var2 = var1.keys();
    boolean var4 = var1.contains((java.lang.Object)10);
    com.sun.crypto.provider.SunJCE var5 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var6 = var5.keys();
    java.lang.String var7 = var5.toString();
    var1.putAll((java.util.Map)var5);
    var0.putAll((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "SunJCE version 1.7"+ "'", var7.equals("SunJCE version 1.7"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    java.util.Enumeration var3 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("hi!", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var2 = var0.getProperty("");
    java.util.Enumeration var3 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.contains((java.lang.Object)10);
    java.lang.Object var5 = var0.get((java.lang.Object)"");
    java.lang.String var8 = var0.getProperty("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var8.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.contains((java.lang.Object)10);
    java.lang.Object var5 = var0.get((java.lang.Object)"");
    java.security.Provider.Service var8 = var0.getService("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var4 = new byte[] { (byte)100, (byte)10};
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("SunJCE version 1.7", var4, var5);
    boolean var8 = var0.engineIsKeyEntry("hi!");
    java.util.Date var10 = var0.engineGetCreationDate("SunJCE version 1.7");
    com.sun.crypto.provider.JceKeyStore var11 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var15 = new byte[] { (byte)100, (byte)10};
    java.security.cert.Certificate[] var16 = new java.security.cert.Certificate[] { };
    var11.engineSetKeyEntry("SunJCE version 1.7", var15, var16);
    boolean var19 = var11.engineIsKeyEntry("hi!");
    java.util.Date var21 = var11.engineGetCreationDate("SunJCE version 1.7");
    int var22 = var10.compareTo(var21);
    int var23 = var10.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var2 = new java.util.jar.JarFile("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=865,ZONE_OFFSET=19800000,DST_OFFSET=0]", true);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    var3.set(100, 1, 10);
    int var11 = var3.getMinimalDaysInFirstWeek();
    java.lang.String var12 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var3.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=909,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var12.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=1,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=26,SECOND=5,MILLISECOND=909,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.contains((java.lang.Object)10);
    com.sun.crypto.provider.SunJCE var4 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var5 = var4.keys();
    java.lang.String var6 = var4.toString();
    var0.putAll((java.util.Map)var4);
    java.util.Set var8 = var4.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "SunJCE version 1.7"+ "'", var6.equals("SunJCE version 1.7"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.contains((java.lang.Object)10);
    com.sun.crypto.provider.SunJCE var4 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var5 = var4.keys();
    java.lang.String var6 = var4.toString();
    var0.putAll((java.util.Map)var4);
    java.util.Set var8 = var4.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "SunJCE version 1.7"+ "'", var6.equals("SunJCE version 1.7"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.util.Enumeration var1 = var0.keys();
    boolean var3 = var0.contains((java.lang.Object)10);
    java.lang.Object var5 = var0.get((java.lang.Object)"");
    java.util.Set var6 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var4 = new byte[] { (byte)100, (byte)10};
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("SunJCE version 1.7", var4, var5);
    boolean var8 = var0.engineIsKeyEntry("hi!");
    java.util.Date var10 = var0.engineGetCreationDate("SunJCE version 1.7");
    com.sun.crypto.provider.JceKeyStore var11 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var15 = new byte[] { (byte)100, (byte)10};
    java.security.cert.Certificate[] var16 = new java.security.cert.Certificate[] { };
    var11.engineSetKeyEntry("SunJCE version 1.7", var15, var16);
    boolean var19 = var11.engineIsKeyEntry("hi!");
    java.util.Date var21 = var11.engineGetCreationDate("SunJCE version 1.7");
    int var22 = var10.compareTo(var21);
    var21.setYear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.SunJCE var0 = new com.sun.crypto.provider.SunJCE();
    java.lang.String var1 = var0.getInfo();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"+ "'", var1.equals("SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "SunJCE version 1.7"+ "'", var2.equals("SunJCE version 1.7"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.setLenient(true);
    java.util.Calendar var3 = java.util.Calendar.getInstance();
    var3.setLenient(true);
    int var6 = var0.compareTo(var3);
    var3.set(100, 1, 10);
    var3.setFirstDayOfWeek((-1));
    var3.set(100, 10, 10, 11, 10);
    int var19 = var3.getFirstDayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

}
