
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var1 = new java.util.Date(100L);
    var1.setDate(0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.toCustomID((-353));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GMT+00:00"+ "'", var1.equals("GMT+00:00"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    java.math.BigDecimal var7 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal[] var8 = var3.divideAndRemainder(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.sql.Timestamp var1 = new java.sql.Timestamp(0L);
    java.util.Date var5 = new java.util.Date(0, 1, 1);
    long var6 = var5.getTime();
    int var7 = var1.compareTo(var5);
    java.lang.String var8 = var5.toLocaleString();
    int var9 = var5.getTimezoneOffset();
    int var10 = var5.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    int var6 = var1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    double var6 = var1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.HashMap var0 = new java.util.HashMap();
    java.util.HashMap var1 = new java.util.HashMap();
    var0.putAll((java.util.Map)var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    long var4 = var3.getTime();
    int var5 = var3.getTimezoneOffset();
    var3.setMonth(10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    java.util.Date var9 = new java.util.Date(0, 1, 1);
    long var10 = var9.getTime();
    boolean var11 = var3.equals((java.lang.Object)var10);
    int var12 = var3.intValue();
    java.lang.String var13 = var3.toString();
    long var14 = var3.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-1"+ "'", var13.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1L));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("GMT+00:00");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    java.util.Date var9 = new java.util.Date(0, 1, 1);
    long var10 = var9.getTime();
    boolean var11 = var3.equals((java.lang.Object)var10);
    java.lang.String var12 = var3.toString();
    int var13 = var3.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-1"+ "'", var12.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.sql.Timestamp var1 = new java.sql.Timestamp(0L);
    java.util.Date var5 = new java.util.Date(0, 1, 1);
    long var6 = var5.getTime();
    int var7 = var1.compareTo(var5);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "1970-01-01 05:30:00.0"+ "'", var8.equals("1970-01-01 05:30:00.0"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    java.util.Date var9 = new java.util.Date(0, 1, 1);
    long var10 = var9.getTime();
    boolean var11 = var3.equals((java.lang.Object)var10);
    int var12 = var3.intValue();
    java.lang.String var13 = var3.toString();
    int var14 = var3.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-1"+ "'", var13.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1.0d));
    java.lang.String var4 = var3.toString();
    java.math.BigDecimal[] var5 = var1.divideAndRemainder(var3);
    java.util.Date var9 = new java.util.Date(0, 1, 1);
    long var10 = var9.getTime();
    boolean var11 = var3.equals((java.lang.Object)var10);
    int var12 = var3.intValue();
    java.math.BigDecimal var13 = var3.stripTrailingZeros();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-1"+ "'", var4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("GMT+00:00");
    java.lang.String var2 = var1.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "GMT+00:00"+ "'", var2.equals("GMT+00:00"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var1 = new java.util.Date(100L);
    int var2 = var1.getDay();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.security.CodeSigner[] var2 = new java.security.CodeSigner[] { };
    java.security.CodeSource var3 = new java.security.CodeSource(var1, var2);
    java.net.URL var5 = java.lang.ClassLoader.getSystemResource("hi!");
    java.security.CodeSigner[] var6 = new java.security.CodeSigner[] { };
    java.security.CodeSource var7 = new java.security.CodeSource(var5, var6);
    boolean var8 = var3.implies(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

}
