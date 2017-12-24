
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Throwable: hi!"+ "'", var2.equals("java.lang.Throwable: hi!"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    int var5 = var1.precision();
    java.lang.String var6 = var1.toEngineeringString();
    int var7 = var1.intValue();
    java.math.BigDecimal var9 = var1.movePointLeft(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0"+ "'", var6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    java.math.BigDecimal var3 = var1.pow(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var5 = var3.pow((-1));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    java.math.BigDecimal var9 = new java.math.BigDecimal(0);
    boolean var11 = var9.equals((java.lang.Object)1.0d);
    byte var12 = var9.byteValueExact();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var14 = var6.divide(var9, 0);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (byte)0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("java.lang.Throwable: hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    int var8 = var7.precision();
    java.math.BigInteger var9 = var7.toBigIntegerExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    short var7 = var6.shortValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (short)0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var8 = new java.math.BigDecimal(0);
    boolean var10 = var8.equals((java.lang.Object)1.0d);
    byte var11 = var8.byteValueExact();
    java.math.BigDecimal var13 = var8.setScale((-1));
    java.math.BigDecimal var14 = var13.plus();
    int var15 = var14.precision();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var16 = var6.remainder(var14);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    java.math.BigDecimal var8 = var7.plus();
    java.math.BigDecimal var9 = var7.plus();
    long var10 = var9.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Formatter var0 = new java.util.Formatter();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    int var8 = var7.intValueExact();
    short var9 = var7.shortValueExact();
    java.math.BigDecimal var10 = var7.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    java.math.BigDecimal var3 = new java.math.BigDecimal(0);
    boolean var5 = var3.equals((java.lang.Object)1.0d);
    byte var6 = var3.byteValueExact();
    java.math.BigDecimal var8 = var3.setScale((-1));
    java.math.BigDecimal var9 = var8.plus();
    int var10 = var9.precision();
    int var11 = var1.compareTo(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    int var8 = var7.precision();
    int var9 = var7.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    int var5 = var1.precision();
    java.lang.String var6 = var1.toEngineeringString();
    java.math.BigDecimal var8 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var9 = var1.divide(var8);
    java.math.BigDecimal var11 = new java.math.BigDecimal(0);
    java.math.BigDecimal var13 = var11.pow(100);
    short var14 = var13.shortValueExact();
    java.math.BigDecimal var16 = var13.pow(1);
    boolean var17 = var9.equals((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0"+ "'", var6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Formatter var1 = new java.util.Formatter("0");
    java.lang.Appendable var2 = var1.out();
    java.lang.Appendable var3 = var1.out();
    java.lang.Throwable var7 = new java.lang.Throwable("hi!");
    java.lang.Throwable var8 = new java.lang.Throwable("", var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.util.Formatter var10 = var1.format("java.lang.Throwable: hi!", (java.lang.Object[])var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Throwable var2 = new java.lang.Throwable("hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("", var2);
    java.lang.Throwable[] var4 = var2.getSuppressed();
    java.lang.Throwable var5 = new java.lang.Throwable();
    var2.addSuppressed(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    java.math.BigDecimal var6 = var1.setScale((-1));
    java.math.BigDecimal var7 = var6.plus();
    java.math.BigDecimal var8 = var7.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    boolean var3 = var1.equals((java.lang.Object)1.0d);
    byte var4 = var1.byteValueExact();
    int var5 = var1.precision();
    java.lang.String var6 = var1.toEngineeringString();
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "0"+ "'", var6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0"+ "'", var7.equals("0"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);
    java.math.BigDecimal var3 = var1.pow(100);
    java.math.BigDecimal var5 = new java.math.BigDecimal(0);
    boolean var7 = var5.equals((java.lang.Object)1.0d);
    byte var8 = var5.byteValueExact();
    int var9 = var5.precision();
    java.lang.String var10 = var5.toEngineeringString();
    java.math.BigDecimal var12 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var13 = var5.divide(var12);
    java.math.BigDecimal var14 = var5.stripTrailingZeros();
    java.math.BigDecimal var15 = var3.max(var14);
    java.math.BigDecimal var17 = new java.math.BigDecimal(0);
    boolean var19 = var17.equals((java.lang.Object)1.0d);
    byte var20 = var17.byteValueExact();
    int var21 = var17.precision();
    java.lang.String var22 = var17.toEngineeringString();
    java.math.BigDecimal var24 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var25 = var17.divide(var24);
    java.math.BigDecimal var26 = var14.subtract(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "0"+ "'", var10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "0"+ "'", var22.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

}
