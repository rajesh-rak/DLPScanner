
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var1 = sun.security.util.Debug.isOn("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = sun.security.util.Debug.isOn("\u221E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var3 = new char[] { 'a', '4', 'a'};
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

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getInfinity();
    var0.setPercent(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("\u221E", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var4 = var1.setScale(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getDigit();
    var0.setCurrencySymbol("\u221E");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);
    boolean var3 = var1.equals((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    int var2 = var1.signum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('4');
    var0.setZeroDigit('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getDigit();
    var0.setInternationalCurrencySymbol("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.util.Debug.println("\u221E", "");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('4');
    java.lang.String var3 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Rs."+ "'", var3.equals("Rs."));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('4');
    var0.setPatternSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "hi!");
    var0.info("Rs.");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("\u221E", "Rs.");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = var1.setScale(0);
    int var4 = var1.scale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = var1.setScale(0);
    java.math.BigDecimal var5 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var7 = var5.setScale(0);
    int var8 = var7.scale();
    int var9 = var3.compareTo(var7);
    java.math.BigDecimal var11 = new java.math.BigDecimal(100.0d);
    java.math.BigDecimal var12 = var3.subtract(var11);
    java.math.BigDecimal var14 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var15 = var3.max(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    byte var2 = var1.byteValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (byte)1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "hi!");
    java.util.logging.Logger var4 = var0.getParent();
    java.util.logging.Level var5 = var0.getLevel();
    java.util.logging.Level var6 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getResourceBundleName();
    var0.finest("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "hi!");
    java.util.logging.Logger var4 = var0.getParent();
    boolean var5 = var0.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var3 = var1.setScale(0);
    java.math.BigDecimal var5 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var7 = var5.setScale(0);
    int var8 = var7.scale();
    int var9 = var3.compareTo(var7);
    java.math.BigDecimal var11 = new java.math.BigDecimal(100.0d);
    java.math.BigDecimal var12 = var3.subtract(var11);
    java.math.BigDecimal var14 = new java.math.BigDecimal(1.0d);
    java.math.BigDecimal var16 = var14.setScale(0);
    java.math.BigDecimal var17 = var3.multiply(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

}
