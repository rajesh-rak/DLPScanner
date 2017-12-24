
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.plus();
    int var3 = var2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(10.0d);
    java.math.BigInteger var2 = var1.toBigInteger();
    java.lang.String var3 = sun.security.util.Debug.toHexString(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "    0a"+ "'", var3.equals("    0a"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var4 = var1.subtract(var3);
    java.math.BigDecimal var5 = var3.plus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var4 = var1.subtract(var3);
    java.math.BigDecimal var6 = var3.movePointRight((-1));
    java.math.BigInteger var7 = var6.toBigIntegerExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10.0d);
    java.math.BigInteger var5 = var4.toBigInteger();
    int var6 = var1.compareTo(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Exception var1 = new java.lang.Exception();
    var0.addSuppressed((java.lang.Throwable)var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var5 = var4.plus();
    java.math.BigDecimal var6 = var5.abs();
    java.math.BigDecimal var7 = var1.remainder(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var2 = new byte[] { (byte)10, (byte)100};
    java.lang.String var3 = sun.security.util.Debug.toString(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0a:64"+ "'", var3.equals("0a:64"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var4 = var1.subtract(var3);
    int var5 = var1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getPercent();
    java.util.Currency var2 = var0.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.util.Locale var2 = var1.locale();
    java.util.Formatter var4 = new java.util.Formatter("hi!");
    java.util.Locale var5 = var4.locale();
    java.security.ProtectionDomain[] var7 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var8 = new java.security.AccessControlContext(var7);
    java.util.Formatter var9 = var1.format(var5, "1", (java.lang.Object[])var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)"    0a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getPerMill();
    var0.setMonetaryDecimalSeparator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '\u2030');

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.util.Debug.println("1", "0a:64");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var5 = var4.plus();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var8 = var6.movePointRight(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getPercent();
    java.lang.String var2 = var0.getInfinity();
    char var3 = var0.getPatternSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u221E"+ "'", var2.equals("\u221E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ';');

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var3 = var2.abs();
    java.math.BigDecimal var5 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var6 = var5.plus();
    java.math.BigDecimal var7 = var6.abs();
    java.math.BigDecimal var9 = var6.scaleByPowerOfTen(10);
    java.math.BigDecimal var11 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var12 = var11.plus();
    java.lang.String var13 = var11.toPlainString();
    int var14 = var9.compareTo(var11);
    java.math.BigDecimal[] var15 = var3.divideAndRemainder(var11);
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf(0L);
    java.math.BigDecimal var20 = var17.subtract(var19);
    java.math.BigDecimal var22 = var19.movePointRight((-1));
    java.math.BigDecimal var24 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var25 = var24.plus();
    java.math.BigDecimal var26 = var25.abs();
    java.math.BigDecimal var28 = var25.scaleByPowerOfTen(10);
    java.math.BigDecimal var29 = var19.subtract(var28);
    java.math.BigDecimal var30 = var11.min(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "1"+ "'", var13.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(10.0d);
    java.math.BigInteger var2 = var1.toBigInteger();
    java.math.BigDecimal var4 = new java.math.BigDecimal(var2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Thread var1 = new java.lang.Thread("0a:64");

  }

}
