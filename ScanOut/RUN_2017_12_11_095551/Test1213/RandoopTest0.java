
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.security.util.Debug.println("", "hi!");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var1 = new byte[] { (byte)0};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u0000"+ "'", var2.equals("\u0000"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigInteger var2 = var1.toBigInteger();
    java.math.BigDecimal var3 = new java.math.BigDecimal(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var4 = var1.divideToIntegralValue(var3);
    java.math.BigDecimal var6 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigInteger var7 = var6.toBigInteger();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var9 = var1.divide(var6, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var3 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var4 = var3.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var5 = var1.cannotReadRepositoryDb((java.lang.Throwable)var4);
    java.lang.Throwable var6 = new java.lang.Throwable((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var3 = var1.cannotAddInitialNaming();
    java.lang.Exception var4 = new java.lang.Exception((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var4 = var1.divideToIntegralValue(var3);
    int var5 = var3.signum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var2 = var1.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var3 = var1.cannotAddInitialNaming();
    org.omg.CORBA.INTERNAL var4 = var1.serverNotRunning();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var3 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var4 = var3.cannotWriteRepositoryDb();
    org.omg.CORBA.INTERNAL var5 = var1.cannotWriteRepositoryDb((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setMinusSign('a');
    var0.setPercent('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var6 = var3.divideToIntegralValue(var5);
    java.math.BigDecimal var7 = var6.ulp();
    java.math.BigDecimal var8 = var1.remainder(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setMinusSign('a');
    java.util.Currency var3 = var0.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    java.util.logging.Logger var2 = var0.getParent();
    var0.finest("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);
    java.math.BigDecimal var2 = var1.ulp();
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var6 = java.math.BigDecimal.valueOf(1.0d);
    java.math.BigDecimal var7 = var4.divideToIntegralValue(var6);
    java.math.BigDecimal var8 = var7.ulp();
    java.math.BigDecimal var9 = var1.add(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var2 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var4 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var6 = var2.cannotReadRepositoryDb((java.lang.Throwable)var5);
    java.lang.Exception var7 = new java.lang.Exception("hi!", (java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ActivationSystemException var10 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var12 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var13 = var12.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var14 = var10.cannotReadRepositoryDb((java.lang.Throwable)var13);
    java.lang.Exception var15 = new java.lang.Exception("hi!", (java.lang.Throwable)var14);
    var7.addSuppressed((java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var14);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var2 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var4 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var5 = var4.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var6 = var2.cannotReadRepositoryDb((java.lang.Throwable)var5);
    java.lang.Exception var7 = new java.lang.Exception("hi!", (java.lang.Throwable)var6);
    java.lang.String var8 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.omg.CORBA.INITIALIZE:   vmcid: SUN  minor code: 401  completed: No"+ "'", var8.equals("org.omg.CORBA.INITIALIZE:   vmcid: SUN  minor code: 401  completed: No"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    int[] var2 = new int[] { 0, (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, (-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    java.util.logging.Logger var2 = var0.getParent();
    java.util.ResourceBundle var3 = var2.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    com.sun.corba.se.impl.logging.ActivationSystemException var3 = com.sun.corba.se.impl.logging.ActivationSystemException.get("");
    org.omg.CORBA.INTERNAL var4 = var3.cannotWriteRepositoryDb();
    org.omg.CORBA.INITIALIZE var5 = var1.cannotReadRepositoryDb((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cannotWriteRepositoryDb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("\u0000", "org.omg.CORBA.INITIALIZE:   vmcid: SUN  minor code: 401  completed: No");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getGroupingSeparator();
    java.lang.String var2 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Rs."+ "'", var2.equals("Rs."));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.Runtime.runFinalizersOnExit(true);

  }

}
