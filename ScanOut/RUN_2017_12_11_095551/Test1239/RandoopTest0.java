
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayName("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 345.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var7 = var2.longValueExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var5.stripTrailingZeros();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var11 = var5.remainder(var10);
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var18 = var14.divideToIntegralValue(var17);
    java.math.BigDecimal var19 = var17.stripTrailingZeros();
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var23 = var17.remainder(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var26 = var11.divide(var22, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.intValueExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var6 = java.util.Date.UTC(0, 10, 10, 0, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2181945541000L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set((-1), 0, (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "10:46:56+05:1800000"+ "'", var0.equals("10:46:56+05:1800000"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var13 = var9.divideToIntegralValue(var12);
    java.math.BigDecimal var14 = var12.stripTrailingZeros();
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var18 = var12.remainder(var17);
    java.math.BigDecimal var19 = var2.remainder(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var5.stripTrailingZeros();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var11 = var5.remainder(var10);
    java.math.BigDecimal var12 = var5.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.setMinimalDaysInFirstWeek((-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(345.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    javax.xml.datatype.Duration var2 = var0.newDurationYearMonth((-2181945541000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var5.stripTrailingZeros();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var11 = var5.remainder(var10);
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var18 = var14.divideToIntegralValue(var17);
    java.math.BigDecimal var19 = var17.stripTrailingZeros();
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var23 = var17.remainder(var22);
    java.math.BigDecimal var24 = var10.min(var17);
    java.math.BigInteger var25 = var10.unscaledValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    double var1 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.secondInMinute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NaN);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    long var7 = var6.longValue();
    int var8 = var6.scale();
    java.math.BigDecimal var9 = var6.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.toCustomID(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GMT+00:00"+ "'", var1.equals("GMT+00:00"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 1, 100, 10);
    java.lang.String var6 = var5.toGMTString();
    java.lang.Object var7 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    javax.xml.datatype.XMLGregorianCalendar var2 = var0.newXMLGregorianCalendar(var1);
    int var4 = var1.getActualMinimum(0);
    boolean var6 = var1.isLeapYear(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var2 = var0.getYearFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    double var0 = com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dayInMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 11.0d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date((-1), 0, 1, 100, 10);
    java.lang.String var6 = var5.toLocaleString();
    java.lang.Object var7 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    long var7 = var6.longValue();
    int var8 = var6.scale();
    byte var9 = var8.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (byte)0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    javax.xml.datatype.XMLGregorianCalendar var2 = var0.newXMLGregorianCalendar(var1);
    long var3 = var1.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1512969416555L);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(1L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var5.stripTrailingZeros();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var11 = var5.remainder(var10);
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var18 = var14.divideToIntegralValue(var17);
    java.math.BigDecimal var19 = var17.stripTrailingZeros();
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var23 = var17.remainder(var22);
    java.math.BigDecimal var26 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var29 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var30 = var26.divideToIntegralValue(var29);
    java.math.BigDecimal var31 = var29.stripTrailingZeros();
    java.math.BigDecimal var34 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var35 = var29.remainder(var34);
    java.math.BigDecimal var36 = var22.min(var29);
    java.math.BigDecimal var37 = var5.divideToIntegralValue(var29);
    java.math.BigInteger var38 = var37.unscaledValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var5.stripTrailingZeros();
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var11 = var5.remainder(var10);
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var18 = var14.divideToIntegralValue(var17);
    java.math.BigDecimal var19 = var17.stripTrailingZeros();
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var23 = var17.remainder(var22);
    java.math.BigDecimal var26 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var29 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var30 = var26.divideToIntegralValue(var29);
    java.math.BigDecimal var31 = var29.stripTrailingZeros();
    java.math.BigDecimal var34 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var35 = var29.remainder(var34);
    java.math.BigDecimal var36 = var22.min(var29);
    java.math.BigDecimal var39 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var42 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var43 = var39.divideToIntegralValue(var42);
    java.math.BigDecimal var44 = var42.stripTrailingZeros();
    java.math.BigDecimal var47 = java.math.BigDecimal.valueOf(1L, 1);
    java.math.BigDecimal var48 = var42.remainder(var47);
    int var49 = var22.compareTo(var48);
    java.math.BigDecimal var50 = var11.remainder(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    javax.xml.datatype.XMLGregorianCalendar var2 = var0.newXMLGregorianCalendar(var1);
    java.lang.String var3 = var1.toString();
    var1.add(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512969416746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=56,MILLISECOND=746,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512969416746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=56,MILLISECOND=746,ZONE_OFFSET=19800000,DST_OFFSET=0]"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    java.util.GregorianCalendar var1 = new java.util.GregorianCalendar();
    javax.xml.datatype.XMLGregorianCalendar var2 = var0.newXMLGregorianCalendar(var1);
    java.lang.String var3 = var1.toString();
    long var4 = var1.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.util.GregorianCalendar[time=1512969416749,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=56,MILLISECOND=749,ZONE_OFFSET=19800000,DST_OFFSET=0]"+ "'", var3.equals("java.util.GregorianCalendar[time=1512969416749,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=345,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=46,SECOND=56,MILLISECOND=749,ZONE_OFFSET=19800000,DST_OFFSET=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1512969416749L);

  }

}
