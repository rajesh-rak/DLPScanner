
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


    java.lang.String var1 = sun.security.krb5.KrbException.returnCodeSymbol(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "not yet implemented"+ "'", var1.equals("not yet implemented"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)1, (byte)1};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var6 = new java.lang.String(var3, 10);
    java.lang.String var8 = new java.lang.String(var3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD\u0001\u0001"+ "'", var4.equals("\uFFFD\u0001\u0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u0AFF\u0A01\u0A01"+ "'", var6.equals("\u0AFF\u0A01\u0A01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\u00FF\u0001\u0001"+ "'", var8.equals("\u00FF\u0001\u0001"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = new char[] { '4', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var5 = new java.math.BigDecimal(var2, 100, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = new java.lang.String(var0);
    java.lang.String var2 = java.lang.String.valueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var5 = var1.divide(var3, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var12 = var11.plus();
    java.math.BigDecimal var14 = new java.math.BigDecimal(100);
    short var15 = var14.shortValueExact();
    java.math.BigDecimal var16 = var14.stripTrailingZeros();
    long var17 = var14.longValueExact();
    java.math.BigDecimal var19 = new java.math.BigDecimal(100);
    short var20 = var19.shortValueExact();
    java.math.BigDecimal var21 = var19.stripTrailingZeros();
    long var22 = var19.longValueExact();
    java.math.BigDecimal var23 = var14.max(var19);
    java.math.BigDecimal var24 = var12.remainder(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Exception var0 = new java.lang.Exception();
    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException(1);
    var0.addSuppressed((java.lang.Throwable)var2);
    java.lang.String var4 = var2.returnCodeMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Client's entry in database expired"+ "'", var4.equals("Client's entry in database expired"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var12 = var11.plus();
    java.math.BigDecimal var14 = var11.setScale(10);
    java.lang.String var15 = var14.toEngineeringString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100.0000000000"+ "'", var15.equals("100.0000000000"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var13 = new java.math.BigDecimal(100);
    short var14 = var13.shortValueExact();
    java.math.BigDecimal var15 = var13.stripTrailingZeros();
    long var16 = var13.longValueExact();
    java.math.BigDecimal var18 = new java.math.BigDecimal(100);
    short var19 = var18.shortValueExact();
    java.math.BigDecimal var20 = var18.stripTrailingZeros();
    long var21 = var18.longValueExact();
    java.math.BigDecimal var22 = var13.max(var18);
    java.math.BigDecimal var23 = var13.abs();
    java.math.BigDecimal var24 = var1.subtract(var13);
    int var25 = var24.signum();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("\u00FF\u0001\u0001", "a");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = new java.lang.String(var0);
    java.lang.String var2 = new java.lang.String(var0);
    java.lang.String var3 = java.lang.String.valueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int[] var1 = new int[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, (-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = new java.lang.String("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    java.math.BigDecimal var5 = var3.pow(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.lang.String var12 = var1.toPlainString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100"+ "'", var12.equals("100"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Exception var1 = new java.lang.Exception("100");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var3 = new byte[] { (byte)(-1), (byte)1, (byte)1};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var6 = new java.lang.String(var3, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var3, (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD\u0001\u0001"+ "'", var4.equals("\uFFFD\u0001\u0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u0AFF\u0A01\u0A01"+ "'", var6.equals("\u0AFF\u0A01\u0A01"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var13 = new java.math.BigDecimal(100);
    short var14 = var13.shortValueExact();
    java.math.BigDecimal var15 = var13.stripTrailingZeros();
    long var16 = var13.longValueExact();
    java.math.BigDecimal var18 = new java.math.BigDecimal(100);
    short var19 = var18.shortValueExact();
    java.math.BigDecimal var20 = var18.stripTrailingZeros();
    long var21 = var18.longValueExact();
    java.math.BigDecimal var22 = var13.max(var18);
    java.math.BigDecimal var23 = var13.abs();
    java.math.BigDecimal var24 = var1.subtract(var13);
    java.math.BigDecimal var26 = var24.setScale(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var2 = new java.math.BigDecimal(100);
    java.math.BigDecimal var4 = new java.math.BigDecimal(100);
    java.math.BigDecimal[] var5 = var2.divideAndRemainder(var4);
    java.lang.String var6 = java.lang.String.format("hi!", (java.lang.Object[])var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100.0d);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var12 = var11.plus();
    java.math.BigDecimal var14 = new java.math.BigDecimal(100);
    short var15 = var14.shortValueExact();
    double var16 = var14.doubleValue();
    java.math.BigDecimal[] var17 = var11.divideAndRemainder(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Exception var0 = new java.lang.Exception();
    sun.security.krb5.KrbException var2 = new sun.security.krb5.KrbException(1);
    var0.addSuppressed((java.lang.Throwable)var2);
    java.lang.String var4 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.Exception"+ "'", var4.equals("java.lang.Exception"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    long var4 = var1.longValueExact();
    java.math.BigDecimal var6 = new java.math.BigDecimal(100);
    short var7 = var6.shortValueExact();
    java.math.BigDecimal var8 = var6.stripTrailingZeros();
    long var9 = var6.longValueExact();
    java.math.BigDecimal var10 = var1.max(var6);
    java.math.BigDecimal var11 = var1.abs();
    java.math.BigDecimal var13 = new java.math.BigDecimal(100);
    short var14 = var13.shortValueExact();
    java.math.BigDecimal var15 = var13.stripTrailingZeros();
    long var16 = var13.longValueExact();
    java.math.BigDecimal var18 = new java.math.BigDecimal(100);
    short var19 = var18.shortValueExact();
    java.math.BigDecimal var20 = var18.stripTrailingZeros();
    long var21 = var18.longValueExact();
    java.math.BigDecimal var22 = var13.max(var18);
    java.math.BigDecimal var23 = var13.abs();
    java.math.BigDecimal var24 = var1.subtract(var13);
    java.math.BigDecimal var26 = new java.math.BigDecimal(100);
    short var27 = var26.shortValueExact();
    java.math.BigDecimal var28 = var26.stripTrailingZeros();
    long var29 = var26.longValueExact();
    java.math.BigDecimal var31 = new java.math.BigDecimal(100);
    short var32 = var31.shortValueExact();
    java.math.BigDecimal var33 = var31.stripTrailingZeros();
    long var34 = var31.longValueExact();
    java.math.BigDecimal var35 = var26.max(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var38 = var13.divide(var35, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
