
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 1, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var6 = java.util.Date.UTC((-1), (-1), (-1), 0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2243375999000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var0 = sun.awt.X11.XWMHints.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 56);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    sun.misc.Resource var3 = var1.getResource("#");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)10, (byte)10, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var2 = new byte[] { (byte)0, (byte)0};
    java.lang.String var6 = new java.lang.String(var2, 10, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var2, 56, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u0A00"+ "'", var6.equals("\u0A00"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.String.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "\u0A00", 0, 1, (-1), 0, 0, 1, (-1), 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setEndRule(100, 56, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)0, (byte)0};
    java.lang.String var6 = new java.lang.String(var2, 10, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var2, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u0A00"+ "'", var6.equals("\u0A00"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(100, "1");

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "\u0A00", 0, 1, (-1), 0, 0, 1, (-1), 0, 10);
    var11.setStartRule(56, 0, 100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setStartRule((-1), (-1), 10, 56);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)0, (byte)(-1), (byte)(-1)};
    java.lang.String var5 = new java.lang.String(var3, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var3, 56, (-1), (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\uFF00\uFFFF\uFFFF"+ "'", var5.equals("\uFF00\uFFFF\uFFFF"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_flags();
    long var2 = var0.get_icon_window();
    long var3 = var0.get_window_group();
    var0.set_flags(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4611686018427387904L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    char[] var3 = new char[] { '#', 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_flags();
    long var2 = var0.get_icon_window();
    long var3 = var0.get_window_group();
    long var4 = var0.get_flags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4611686018427387904L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-4611686018427387904L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-4611686018427387904L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "\u0A00", 0, 1, (-1), 0, 0, 1, (-1), 0, 10);
    java.util.TimeZone.setDefault((java.util.TimeZone)var11);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var2 = com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText("\u0A00", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "no text found: key = \"\u0A00\", arguments = \"10\", \"null\", \"null\""+ "'", var2.equals("no text found: key = \"\u0A00\", arguments = \"10\", \"null\", \"null\""));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var6 = java.util.Date.UTC((-1), 10, 100, 0, 56, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2205702241000L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("");
    java.lang.String[] var3 = var1.split((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var1 = new java.util.Date(100L);
    boolean var3 = var1.equals((java.lang.Object)1L);
    java.util.Date var5 = new java.util.Date(100L);
    int var6 = var1.compareTo(var5);
    var5.setDate(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    sun.misc.Resource var4 = var1.getResource("true", true);
    java.net.URL[] var5 = var1.getURLs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("\u0A00");
    java.util.logging.Logger var3 = java.util.logging.Logger.getGlobal();
    var3.fine("");
    var3.fine("true");
    var0.setParent(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_flags();
    long var2 = var0.get_flags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4611686018427387904L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4611686018427387904L));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_flags();
    var0.set_icon_pixmap(10L);
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4611686018427387904L));

  }

}
