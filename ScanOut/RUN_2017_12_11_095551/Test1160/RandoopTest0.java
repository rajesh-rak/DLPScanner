
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    int var3 = var1.intValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.entering("hi!", "", (java.lang.Object)(byte)0);
    var0.entering("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = var0.getParent();
    java.lang.Object[] var5 = new java.lang.Object[] { (short)10};
    var0.entering("", "", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var2 = var1.abs();
    java.math.BigDecimal var4 = var2.setScale(0);
    int var5 = var2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = var0.getParent();
    com.sun.corba.se.impl.logging.ActivationSystemException var2 = new com.sun.corba.se.impl.logging.ActivationSystemException(var0);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.INTERNAL var5 = var2.unableToStartProcess((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    long var3 = var1.longValueExact();
    int var4 = var1.signum();
    int var5 = var1.intValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    java.math.BigDecimal var4 = new java.math.BigDecimal((-1.0d));
    int var5 = var4.signum();
    long var6 = var4.longValueExact();
    java.math.BigDecimal var8 = new java.math.BigDecimal((-1.0d));
    int var9 = var8.precision();
    java.math.BigDecimal var10 = var4.divideToIntegralValue(var8);
    java.math.BigDecimal var12 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var13 = var12.abs();
    int var14 = var4.compareTo(var13);
    java.math.BigDecimal var15 = var1.divideToIntegralValue(var4);
    java.math.BigDecimal var16 = var4.ulp();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    long var3 = var1.longValueExact();
    java.math.BigDecimal var5 = new java.math.BigDecimal((-1.0d));
    int var6 = var5.precision();
    java.math.BigDecimal var7 = var1.divideToIntegralValue(var5);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-1"+ "'", var8.equals("-1"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    long var3 = var1.longValueExact();
    java.math.BigInteger var4 = var1.toBigInteger();
    java.math.BigDecimal var6 = new java.math.BigDecimal(var4, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finer("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(10L);
    java.math.BigDecimal var2 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0.0d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String[] var0 = java.util.Locale.getISOCountries();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("", "-1");
    var0.exiting("", "hi!", (java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = var0.getParent();
    com.sun.corba.se.impl.logging.ActivationSystemException var2 = new com.sun.corba.se.impl.logging.ActivationSystemException(var0);
    var0.exiting("hi!", "");
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var9 = var8.getParent();
    com.sun.corba.se.impl.logging.ActivationSystemException var10 = new com.sun.corba.se.impl.logging.ActivationSystemException(var8);
    java.lang.Object[] var11 = new java.lang.Object[] { var10};
    var0.entering("", "E", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    org.omg.CORBA.INTERNAL var2 = var1.serverNotRunning();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Logger var1 = var0.getParent();
    com.sun.corba.se.impl.logging.ActivationSystemException var2 = new com.sun.corba.se.impl.logging.ActivationSystemException(var0);
    java.lang.String var3 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    int var2 = var1.signum();
    long var3 = var1.longValueExact();
    java.math.BigDecimal var5 = new java.math.BigDecimal((-1.0d));
    int var6 = var5.precision();
    java.math.BigDecimal var7 = var1.divideToIntegralValue(var5);
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var10 = var9.abs();
    int var11 = var1.compareTo(var10);
    int var12 = var10.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getExponentSeparator();
    char var2 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "E"+ "'", var1.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '\u2030');

  }

}
