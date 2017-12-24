
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    char[] var3 = new char[] { ' ', '4', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var4 = new java.math.BigDecimal(var3);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    char var2 = var0.getDecimalSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '.');

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('.');
    char var3 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '0');

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('4');
    char var3 = var0.getGroupingSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ',');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    int var2 = var1.signum();
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(1.0d);
    byte var5 = var4.byteValueExact();
    java.math.BigInteger var6 = var4.toBigIntegerExact();
    java.math.BigDecimal var7 = var1.add(var4);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1.0d);
    byte var10 = var9.byteValueExact();
    boolean var12 = var9.equals((java.lang.Object)(short)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var15 = var4.divide(var9, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("INR", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    java.util.Currency var3 = var2.getCurrency();
    var0.setCurrency(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    char var2 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '%');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Formatter var1 = new java.util.Formatter("INR");
    java.lang.String var2 = var1.toString();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    int var2 = var1.signum();
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(1.0d);
    byte var5 = var4.byteValueExact();
    java.math.BigInteger var6 = var4.toBigIntegerExact();
    java.math.BigDecimal var7 = var1.add(var4);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(1.0d);
    int var10 = var9.signum();
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(1.0d);
    byte var13 = var12.byteValueExact();
    java.math.BigInteger var14 = var12.toBigIntegerExact();
    java.math.BigDecimal var15 = var9.add(var12);
    java.math.BigDecimal var16 = var4.divideToIntegralValue(var12);
    int var17 = var12.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getPatternSeparator();
    char var2 = var0.getDecimalSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ';');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '.');

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('.');
    var0.setPercent(' ');

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    byte var2 = var1.byteValueExact();
    java.math.BigInteger var3 = var1.toBigIntegerExact();
    long var4 = var1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    byte var2 = var1.byteValueExact();
    boolean var4 = var1.equals((java.lang.Object)(short)100);
    java.math.BigInteger var5 = var1.toBigInteger();
    java.math.BigDecimal var6 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    byte var2 = var1.byteValueExact();
    boolean var4 = var1.equals((java.lang.Object)(short)100);
    java.math.BigInteger var5 = var1.toBigInteger();
    java.math.BigDecimal var7 = new java.math.BigDecimal(var5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('%');

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Exception var1 = new java.lang.Exception("INR");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Throwable var2 = new java.lang.Throwable("hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("", var2);
    java.lang.Throwable[] var4 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(1L, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    int var2 = var1.signum();
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 1);
    java.math.BigDecimal var6 = var1.subtract(var5);
    short var7 = var1.shortValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 1);
    int var3 = var2.intValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPatternSeparator(';');

  }

}
