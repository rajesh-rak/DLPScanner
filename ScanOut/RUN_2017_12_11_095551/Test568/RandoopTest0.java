
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var3 = var1.scaleByPowerOfTen((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var4 = var3.longValueExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    java.lang.String var3 = var0.getNaN();
    var0.setDigit('0');
    char var6 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '0');

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Exception var1 = new java.lang.Exception("java.lang.Exception: hi!");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.SecurityException var3 = new java.lang.SecurityException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Exception: hi!"+ "'", var2.equals("java.lang.Exception: hi!"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    char var3 = var0.getPatternSeparator();
    char var4 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ';');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '\u2030');

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable var3 = new java.lang.Throwable((java.lang.Throwable)var1);
    java.lang.Exception var4 = new java.lang.Exception((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Exception: hi!"+ "'", var2.equals("java.lang.Exception: hi!"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    java.lang.String var3 = var0.getNaN();
    var0.setDigit('0');
    var0.setDecimalSeparator(' ');
    java.lang.String var8 = var0.getNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\uFFFD"+ "'", var8.equals("\uFFFD"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    java.lang.String var3 = var0.getNaN();
    var0.setDigit('0');
    var0.setDecimalSeparator(' ');
    var0.setPercent('0');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var5 = var3.scaleByPowerOfTen((-1));
    java.math.BigDecimal var6 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var9 = var6.divide(var8);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.RuntimeException var0 = new java.lang.RuntimeException();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Formatter var1 = new java.util.Formatter("java.lang.Exception: hi!");
    java.lang.Object[] var4 = new java.lang.Object[] { 10.0d};
    java.util.Formatter var5 = var1.format("", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    java.util.Formatter var2 = new java.util.Formatter(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityException var1 = new java.lang.SecurityException("hi!");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var5 = var3.scaleByPowerOfTen((-1));
    java.math.BigDecimal var6 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var10 = var8.scaleByPowerOfTen((-1));
    java.math.BigDecimal var11 = var6.subtract(var10);
    long var12 = var6.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1L);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    java.lang.Appendable var2 = var0.out();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    char var3 = var0.getPatternSeparator();
    char var4 = var0.getZeroDigit();
    char var5 = var0.getPercent();
    java.lang.String var6 = var0.getInfinity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ';');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '0');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u221E"+ "'", var6.equals("\u221E"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var2 = var1.plus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('#');
    java.lang.String var3 = var0.getNaN();
    char var4 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '-');

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0.0d);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1L);
    java.math.BigDecimal var7 = var5.scaleByPowerOfTen((-1));
    java.math.BigDecimal var8 = var3.divideToIntegralValue(var5);
    java.lang.String var9 = var5.toPlainString();
    java.math.BigDecimal[] var10 = var1.divideAndRemainder(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "1"+ "'", var9.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
