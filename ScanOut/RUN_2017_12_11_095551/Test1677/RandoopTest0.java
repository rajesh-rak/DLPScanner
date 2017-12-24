
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var1 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, (-1), 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.getFileName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var1.insert(10, "");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuilder var2 = new java.lang.StringBuilder("");
    java.lang.Object[] var3 = new java.lang.Object[] { var2};
    java.lang.String var4 = java.lang.String.format("hi!", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    java.lang.String var1 = var0.remoteToString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "UnicastServerRef [liveRef: null]"+ "'", var1.equals("UnicastServerRef [liveRef: null]"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(0, 100.0f);
    var2.putAll((java.util.Map)var5);
    java.lang.Object var9 = var2.put((java.lang.Object)(byte)100, (java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(10, "-1", 1, 100, 1, 1, 10, 100, 100, (-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var6 = var1.insert(100, 1.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(10, (-1), (-1), 100, (-1), (-1));
    var6.setMinutes(1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.ZoneInfoFile var0 = new sun.util.calendar.ZoneInfoFile();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"-1");
    char[] var5 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var8 = var1.insert(10, var5, 0, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Enumeration var1 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Set var2 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 97L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var6 = new java.util.Date(10, (-1), (-1), 100, (-1), (-1));
    java.lang.Object var7 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"-1");
    java.lang.StringBuilder var6 = var1.insert(0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "-1");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var3 = new java.util.Date(0, 100, 100);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    char[] var1 = new char[] { 'a'};
    java.lang.String var2 = java.lang.String.copyValueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.rmi.server.UnicastServerRef var1 = new sun.rmi.server.UnicastServerRef(100);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");
    java.lang.StringBuilder var3 = var1.append((java.lang.CharSequence)"-1");
    java.lang.StringBuilder var4 = var3.reverse();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 100);
    java.lang.String var3 = var2.getID();
    var2.setID("UnicastServerRef [liveRef: null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

}
