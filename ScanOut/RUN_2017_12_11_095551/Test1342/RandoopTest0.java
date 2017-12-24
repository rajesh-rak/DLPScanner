
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "hi!", 1, 1, 0, 0, 1, 1, 10, 10, 1, 10, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkPrintJobAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = var1.scaleByPowerOfTen((-1));
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1"+ "'", var4.equals("1"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"\u221E", (java.lang.Object)"hi!");
    java.util.Collection var4 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var4 = var1.max(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = var3.pow((-1));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInfinity();
    boolean var3 = var0.equals((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkListen(0);
    boolean var4 = var0.checkTopLevelWindow((java.lang.Object)"\u221E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "\u221E", 10, 1, (-1), 1, 10, (-1), 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setStartRule(10, (-1), 10, 100, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInfinity();
    java.lang.String var2 = var0.getNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\uFFFD"+ "'", var2.equals("\uFFFD"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.put((java.lang.Object)"\u221E", (java.lang.Object)"hi!");
    boolean var5 = var0.equals((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(1, (-1), 100);

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


    java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "\u221E", 10, 1, (-1), 1, 10, (-1), 1, 1);
    int var12 = var10.getOffset(10L);
    var10.setStartRule(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    short var2 = var1.shortValue();
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var6 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var8 = var6.scaleByPowerOfTen((-1));
    java.math.BigDecimal[] var9 = var4.divideAndRemainder(var8);
    java.math.BigDecimal var10 = var4.stripTrailingZeros();
    java.math.BigDecimal var11 = var1.remainder(var10);
    float var12 = var1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0f);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("\u221E");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInfinity();
    var0.setGroupingSeparator('4');
    char var4 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '-');

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInfinity();
    var0.setMinusSign('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u221E"+ "'", var1.equals("\u221E"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var4 = var1.max(var3);
    java.math.BigDecimal var6 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var8 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var10 = var8.scaleByPowerOfTen((-1));
    java.math.BigDecimal[] var11 = var6.divideAndRemainder(var10);
    java.math.BigDecimal var12 = var6.stripTrailingZeros();
    double var13 = var12.doubleValue();
    java.math.BigDecimal var14 = var3.max(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDate();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var1 = sun.security.util.Debug.isOn("\u221E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var5 = var3.scaleByPowerOfTen((-1));
    java.math.BigDecimal[] var6 = var1.divideAndRemainder(var5);
    java.math.BigDecimal var8 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var10 = var8.scaleByPowerOfTen((-1));
    java.math.BigDecimal var12 = var10.movePointRight((-1));
    java.math.BigDecimal var13 = var12.plus();
    java.math.BigDecimal var15 = var12.scaleByPowerOfTen((-1));
    java.math.BigDecimal var16 = var5.divideToIntegralValue(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(10, "", 100, 10, 10, 10, (-1), 100, 0, 11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
