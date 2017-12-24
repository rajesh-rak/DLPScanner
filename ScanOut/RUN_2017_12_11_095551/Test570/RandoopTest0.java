
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    char[] var3 = new char[] { '#', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = new java.math.BigDecimal(var3, 0, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var4 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var5 = var4.plus();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(10L);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(10L);
    java.math.BigDecimal var4 = var1.divideToIntegralValue(var3);
    int var5 = var1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var2 = var1.plus();
    float var3 = var2.floatValue();
    float var4 = var2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0f);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.security.util.Debug.println("hi!", "hi!");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)(-1)};
    java.lang.String var3 = sun.security.util.Debug.toString(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ff:ff"+ "'", var3.equals("ff:ff"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var2 = var1.plus();
    long var3 = var1.longValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10L);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.info("hi!");
    java.lang.String var4 = var1.getName();
    java.math.BigDecimal var8 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var10 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var11 = var10.plus();
    java.math.BigDecimal var12 = var8.divideToIntegralValue(var10);
    java.math.BigDecimal var14 = var12.scaleByPowerOfTen(100);
    var1.entering("hi!", "", (java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var4 = var3.plus();
    java.math.BigDecimal var5 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var6 = var5.plus();
    java.math.BigDecimal var8 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var10 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var11 = var10.plus();
    java.math.BigDecimal var12 = var8.divideToIntegralValue(var10);
    java.math.BigDecimal var13 = var6.divideToIntegralValue(var12);
    java.math.BigDecimal var15 = var12.pow(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Exception var1 = new java.lang.Exception("");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Exception: "+ "'", var2.equals("java.lang.Exception: "));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var4 = var3.plus();
    java.math.BigDecimal var5 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var6 = var5.plus();
    java.math.BigDecimal var7 = var5.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var4 = var3.plus();
    java.math.BigDecimal var5 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var6 = var5.plus();
    java.math.BigDecimal var8 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var10 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var11 = var10.plus();
    java.math.BigDecimal var12 = var8.divideToIntegralValue(var10);
    java.math.BigDecimal var13 = var6.divideToIntegralValue(var12);
    java.math.BigDecimal var14 = var12.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var1 = new byte[] { (byte)1};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "01"+ "'", var2.equals("01"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var1 = var0.getLevel();
    var0.finer("java.lang.Exception: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.info("hi!");
    java.lang.String var4 = var1.getName();
    var1.exiting("java.lang.Exception: ", "", (java.lang.Object)"ff:ff");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Exception var1 = new java.lang.Exception("");
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Formatter var1 = new java.util.Formatter("java.lang.Exception: ");

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool(1, 10, 1);
    var3.expire(1L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("01");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10L);
    short var2 = var1.shortValueExact();
    java.math.BigDecimal var3 = var1.stripTrailingZeros();
    java.math.BigDecimal var5 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var7 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var8 = var7.plus();
    java.math.BigDecimal var9 = var5.divideToIntegralValue(var7);
    java.math.BigDecimal var10 = var9.plus();
    java.math.BigDecimal var12 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var14 = new java.math.BigDecimal(10L);
    java.math.BigDecimal var15 = var14.plus();
    java.math.BigDecimal var16 = var12.divideToIntegralValue(var14);
    java.math.BigDecimal var17 = var10.divideToIntegralValue(var16);
    boolean var18 = var1.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getPercent();
    java.math.BigDecimal var3 = new java.math.BigDecimal(10L);
    short var4 = var3.shortValueExact();
    java.math.BigDecimal var5 = var3.stripTrailingZeros();
    boolean var6 = var0.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.config("ff:ff");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var6 = var5.getLevel();
    var0.exiting("01", "01", (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(100);

  }

}
