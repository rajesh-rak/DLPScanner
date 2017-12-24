
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, (-1), (-1), 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var2 = new byte[] { (byte)1, (byte)1};
    java.lang.String var5 = new java.lang.String(var2, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0001"+ "'", var5.equals("\u0001"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.System.runFinalization();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u01FF\u01FF"+ "'", var4.equals("\u01FF\u01FF"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var2 = java.lang.System.setProperty("4", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var3 = new byte[] { (byte)10, (byte)10, (byte)1};
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

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    char[] var2 = new char[] { 'a', '4'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a4"+ "'", var3.equals("a4"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var3 = new java.util.Date(10, 1, 100);
    int var4 = var3.getHours();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.keys();
    boolean var4 = var1.equals((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("4");
    java.lang.String var2 = var1.getDisplayName();
    java.util.TimeZone.setDefault(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Greenwich Mean Time"+ "'", var2.equals("Greenwich Mean Time"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.System.clearProperty("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URLConnection var2 = var1.openConnection();
    java.lang.String var3 = var1.getAuthority();
    boolean var5 = var1.equals((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var4 = new byte[] { (byte)1, (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var5 = java.net.InetAddress.getByAddress("\u01FF\u01FF", var4);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.net.www.protocol.ftp.Handler var0 = new sun.net.www.protocol.ftp.Handler();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    long var6 = java.util.Date.UTC(0, 100, 100, 10, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1937570240000L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var3 = new java.util.Date(10, 1, 100);
    int var4 = var3.getSeconds();
    long var5 = var3.getTime();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var6 = java.util.Date.UTC((-1), 0, 0, 100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2240251201000L));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var3 = new java.net.URL("hi!", "Greenwich Mean Time", "1.0");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URLConnection var2 = var1.openConnection();
    java.lang.String var3 = var1.getUserInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var2 = java.lang.System.getProperty("4", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var3 = new java.util.Date(10, 1, 100);
    java.util.Date var7 = new java.util.Date(10, 1, 100);
    int var8 = var7.getSeconds();
    boolean var9 = var3.before(var7);
    java.util.Date var13 = new java.util.Date(10, 1, 100);
    java.util.Date var17 = new java.util.Date(10, 1, 100);
    int var18 = var17.getSeconds();
    boolean var19 = var13.before(var17);
    boolean var20 = var3.after(var13);
    var3.setTime((-1937570240000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "libhi!.dylib"+ "'", var1.equals("libhi!.dylib"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.containsKey((java.lang.Object)(byte)(-1));
    boolean var5 = var1.containsKey((java.lang.Object)1);
    java.lang.String var6 = var1.toString();
    java.util.Date var11 = new java.util.Date(10, 1, 100);
    java.util.Date var15 = new java.util.Date(10, 1, 100);
    int var16 = var15.getSeconds();
    boolean var17 = var11.before(var15);
    java.util.Date var21 = new java.util.Date(10, 1, 100);
    java.util.Date var25 = new java.util.Date(10, 1, 100);
    int var26 = var25.getSeconds();
    boolean var27 = var21.before(var25);
    boolean var28 = var11.after(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)var1, 11, (java.lang.Object)var28, (-1), 1);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var3 = new java.util.Date(10, 1, 100);
    java.util.Date var7 = new java.util.Date(10, 1, 100);
    int var8 = var7.getSeconds();
    boolean var9 = var3.before(var7);
    java.util.Date var13 = new java.util.Date(10, 1, 100);
    java.util.Date var17 = new java.util.Date(10, 1, 100);
    int var18 = var17.getSeconds();
    boolean var19 = var13.before(var17);
    boolean var20 = var3.after(var13);
    int var21 = var13.getTimezoneOffset();
    int var22 = var13.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Date var5 = new java.util.Date((-1), 1, 0, 10, 10);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.Date var3 = new java.util.Date(10, 1, 100);
    java.util.Date var7 = new java.util.Date(10, 1, 100);
    int var8 = var7.getSeconds();
    boolean var9 = var3.before(var7);
    java.util.Date var13 = new java.util.Date(10, 1, 100);
    int var14 = var13.getSeconds();
    int var15 = var13.getDate();
    int var16 = var3.compareTo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

}
