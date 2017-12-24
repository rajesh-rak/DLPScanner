
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 100, 1, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.Provider var1 = java.security.Security.getProvider("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.lang.String var2 = var1.toPlainString();
    short var3 = var1.shortValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (short)(-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var3 = sun.security.jca.GetInstance.getService("0", "-1", "0");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var1 = java.security.SecureRandom.getSeed(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 10, (-1), "0");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-1"+ "'", var5.equals("-1"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.math.BigDecimal var6 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var8 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var9 = var6.remainder(var8);
    java.math.BigDecimal var10 = var4.subtract(var9);
    int var11 = var9.scale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    boolean var1 = var0.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.lang.String var5 = var4.toEngineeringString();
    java.math.BigDecimal var7 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var10 = var7.remainder(var9);
    java.lang.String var11 = var10.toEngineeringString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var14 = var4.divide(var10, 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "0"+ "'", var11.equals("0"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var1 = java.security.Security.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    float var2 = var1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.lang.String var5 = var4.toEngineeringString();
    java.math.BigDecimal var7 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var10 = var7.remainder(var9);
    java.math.BigDecimal var12 = new java.math.BigDecimal((-1L));
    int var13 = var7.compareTo(var12);
    java.math.BigDecimal var14 = var4.multiply(var12);
    long var15 = var4.longValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.math.BigDecimal var5 = var1.ulp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.lang.String var5 = var4.toEngineeringString();
    java.math.BigDecimal var7 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var10 = var7.remainder(var9);
    java.math.BigDecimal var12 = new java.math.BigDecimal((-1L));
    int var13 = var7.compareTo(var12);
    java.math.BigDecimal var14 = var4.multiply(var12);
    java.math.BigDecimal var16 = var4.movePointRight(100);
    java.math.BigDecimal var17 = var16.plus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    char[] var1 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var4 = new java.math.BigDecimal(var1, 10, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var1 = java.security.SecureRandom.getSeed(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 0, 100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var3 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var4 = var1.remainder(var3);
    java.lang.String var5 = var4.toEngineeringString();
    java.math.BigDecimal var7 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1L));
    java.math.BigDecimal var10 = var7.remainder(var9);
    java.math.BigDecimal var12 = new java.math.BigDecimal((-1L));
    int var13 = var7.compareTo(var12);
    java.math.BigDecimal var14 = var4.multiply(var12);
    java.math.BigDecimal var15 = var14.plus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0"+ "'", var5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('#');
    var0.setDecimalSeparator('4');
    char var5 = var0.getDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '#');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('#');
    var0.setPercent('4');

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.valueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('#');
    var0.setInfinity("10.0");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var1 = java.lang.String.valueOf(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Exception var1 = new java.lang.Exception("-1");
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: java.lang.Exception: -1"+ "'", var3.equals("java.lang.Throwable: java.lang.Exception: -1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.Throwable: java.lang.Exception: -1"+ "'", var4.equals("java.lang.Throwable: java.lang.Exception: -1"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1L));
    java.lang.String var2 = var1.toPlainString();
    int var3 = var1.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("java.lang.Throwable: java.lang.Exception: -1");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    byte[] var1 = java.security.SecureRandom.getSeed(1);
    java.lang.String var3 = new java.lang.String(var1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit('#');
    char var3 = var0.getPerMill();
    char var4 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u2030');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '%');

  }

}
