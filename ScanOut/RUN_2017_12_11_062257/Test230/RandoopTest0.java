
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    int var4 = var3.getMinutes();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDigit('#');

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var2);
    java.lang.ClassLoader var4 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    var3.setSeconds(10);
    boolean var7 = var3.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Package var1 = java.lang.Package.getPackage("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    java.lang.String var4 = var3.toString();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = java.net.URLClassLoader.newInstance(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    int var2 = var0.compareTo((java.util.Calendar)var1);
    java.lang.Object var3 = var0.clone();
    boolean var5 = var0.isLeapYear(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    var3.setHours((-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '%');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getFirstDayOfWeek();
    var0.add(0, 1);
    java.net.URL[] var5 = new java.net.URL[] { };
    java.net.URL[] var6 = new java.net.URL[] { };
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var6);
    java.net.URLClassLoader var8 = new java.net.URLClassLoader(var5, (java.lang.ClassLoader)var7);
    java.lang.Class[] var9 = new java.lang.Class[] { };
    java.lang.Class var10 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var8, var9);
    boolean var11 = var0.before((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var2);
    java.io.InputStream var5 = var3.getResourceAsStream("false");
    long var7 = var5.skip((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var2);
    java.lang.Class[] var4 = new java.lang.Class[] { };
    java.lang.Class var5 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var3, var4);
    boolean var6 = java.lang.reflect.Proxy.isProxyClass(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var2);
    java.io.InputStream var5 = var2.getResourceAsStream("false");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getFirstDayOfWeek();
    var0.add(0, 1);
    var0.set(10, 1, (-1), 0, 10, 10);
    var0.set(100, 0, (-1), 1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    int var2 = var0.compareTo((java.util.Calendar)var1);
    java.lang.Object var3 = var0.clone();
    long var4 = var0.getTimeInMillis();
    var0.set(0, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1512955635570L);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    int var2 = var0.compareTo((java.util.Calendar)var1);
    int var3 = var1.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var6 = java.util.Date.UTC(100, 1, 0, 0, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 949276741000L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    int var4 = var3.getYear();
    var3.setTime(1512955635507L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0, (java.lang.ClassLoader)var2);
    java.io.InputStream var5 = var3.getResourceAsStream("false");
    byte[] var6 = new byte[] { };
    int var7 = var5.read(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    int var2 = var0.compareTo((java.util.Calendar)var1);
    int var3 = var0.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 52);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getFirstDayOfWeek();
    var0.add(0, 1);
    var0.set(10, 1, (-1), 0, 10, 10);
    java.util.TimeZone var12 = var0.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("Mon Nov 29 00:00:00 IST 1909");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("false");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.reset();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var3 = new java.util.Date(10, (-1), (-1));
    var3.setSeconds(10);
    int var6 = var3.getSeconds();
    int var7 = var3.getMonth();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Hashtable var2 = new java.util.Hashtable(52, 10.0f);

  }

}
