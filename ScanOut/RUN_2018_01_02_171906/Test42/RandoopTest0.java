
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var2 = new char[] { '4', '4'};
    java.math.BigDecimal var3 = new java.math.BigDecimal(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    short var7 = var2.shortValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100.0d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.util.Debug.println("", "100");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    java.lang.String var3 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ff"+ "'", var2.equals("ff"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ff"+ "'", var3.equals("ff"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var6.divide(var9, 1, 1);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf(10L, (-1));
    java.lang.String var20 = var19.toEngineeringString();
    java.math.BigDecimal var21 = var9.multiply(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var24 = var19.setScale(10, (-1));
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100"+ "'", var20.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    byte var7 = var5.byteValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (byte)100);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var6.divide(var9, 1, 1);
    int var17 = var9.precision();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.logging.Logger var2 = var0.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var2 = new char[] { '4', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var3 = new java.math.BigDecimal(var2);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var6.divide(var9, 1, 1);
    int var17 = var16.signum();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var6.divide(var9, 1, 1);
    java.math.BigInteger var17 = var9.toBigIntegerExact();
    java.lang.String var18 = sun.security.util.Debug.toHexString(var17);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "    64"+ "'", var18.equals("    64"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    int var2 = var1.scale();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var7 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var8 = var4.multiply(var7);
    java.math.BigDecimal var10 = var4.setScale((-1));
    float var11 = var4.floatValue();
    java.math.BigDecimal var12 = var1.divideToIntegralValue(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "ff");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var6.divide(var9, 1, 1);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf(10L, (-1));
    java.lang.String var20 = var19.toEngineeringString();
    java.math.BigDecimal var21 = var9.multiply(var19);
    java.lang.String var22 = var19.toEngineeringString();
    java.math.BigInteger var23 = var19.toBigInteger();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100"+ "'", var20.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "100"+ "'", var22.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var3 = new char[] { ' ', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = new java.math.BigDecimal(var3, (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setNaN("100");
    char var3 = var0.getPatternSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ';');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("ff");
    var0.setZeroDigit(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("ff");
    var0.setMonetaryDecimalSeparator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var8 = var2.setScale((-1));
    java.math.BigDecimal var11 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var15 = var11.multiply(var14);
    java.math.BigDecimal var18 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var21 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var22 = var18.multiply(var21);
    java.math.BigDecimal var25 = var15.divide(var18, 1, 1);
    java.math.BigDecimal var26 = var2.multiply(var15);
    java.math.BigDecimal var28 = var15.setScale(2);
    java.math.BigDecimal var31 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var34 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var35 = var31.multiply(var34);
    java.math.BigDecimal var37 = var34.scaleByPowerOfTen(100);
    java.math.BigDecimal var38 = var15.divideToIntegralValue(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Throwable var1 = new java.lang.Throwable("100");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var8 = var2.setScale((-1));
    float var9 = var2.floatValue();
    java.math.BigDecimal var11 = var2.pow(100);
    long var12 = var11.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var8 = var5.scaleByPowerOfTen(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte var9 = var8.byteValueExact();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

}
