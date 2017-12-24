
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var5 = new java.util.Date(1, 10, 0, 100, 1);
    int var6 = var5.getHours();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(1, 10, 0, 100, 1);
    boolean var7 = var5.equals((java.lang.Object)(byte)1);
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC(4, 100, 100, 100, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1811015999000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var5 = new java.util.Date(1, 10, 0, 100, 1);
    int var6 = var5.getDate();
    int var7 = var5.getMonth();
    var5.setHours(1);
    int var10 = var5.getMonth();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String[] var0 = java.util.Locale.getISOCountries();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Locale var3 = new java.util.Locale("hi!", "", "hi!");

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.lang.String var2 = var1.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var0.getOffset(0, 10, 0, 4, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date(1, 10, 0, 100, 1);
    java.lang.Object var6 = var5.clone();
    var5.setSeconds(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    boolean var3 = var1.equals((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date(4, 0, (-1), 4, 100, 4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.util.Date var6 = new java.util.Date(1, 10, 0, 100, 1);
    boolean var8 = var6.equals((java.lang.Object)(byte)1);
    java.lang.String var9 = var6.toString();
    long var10 = var6.getTime();
    boolean var11 = var0.inDaylightTime(var6);
    boolean var13 = var6.equals((java.lang.Object)(-1811015999000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setStartRule(10, 0, 0, 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(4);
    java.util.Hashtable var3 = new java.util.Hashtable(4);
    var1.putAll((java.util.Map)var3);
    boolean var6 = var3.equals((java.lang.Object)0);
    boolean var7 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.util.CoreResourceBundleControl var0 = sun.util.CoreResourceBundleControl.getRBControlInstance();
    java.util.List var2 = var0.getFormats("Mon Nov 04 04:01:00 IST 1901");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(1, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(4);
    var1.clear();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(4);
    java.util.Hashtable var3 = new java.util.Hashtable(4);
    var1.putAll((java.util.Map)var3);
    java.util.Set var5 = var1.keySet();
    java.util.Enumeration var6 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setStartYear((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStartRule(1, 100, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.lang.String var2 = var1.getLanguage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("Mon Nov 04 04:01:00 IST 1901");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Locale var2 = new java.util.Locale("Mon Nov 04 04:01:00 IST 1901", "");

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.util.Date var6 = new java.util.Date(1, 10, 0, 100, 1);
    boolean var8 = var6.equals((java.lang.Object)(byte)1);
    java.lang.String var9 = var6.toString();
    long var10 = var6.getTime();
    boolean var11 = var0.inDaylightTime(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var18 = var0.getOffset(4, (-1), 1, 1, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "global"+ "'", var1.equals("global"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("global");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(1, "");
    var2.setDSTSavings(10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(1, "Mon Nov 04 04:01:00 IST 1901", (-1), 0, 10, 0, 0, 1, 4, (-1), 10, (-1), 4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.lang.String var2 = var1.getDisplayLanguage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

}
