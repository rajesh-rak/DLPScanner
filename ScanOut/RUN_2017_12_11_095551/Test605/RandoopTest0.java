
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.font.FontFamily var1 = sun.font.FontFamily.getFamily("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.copyValueOf(var0, 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)0};
    java.lang.String var5 = new java.lang.String(var3, 1);
    java.lang.String var6 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0164\u0101\u0100"+ "'", var5.equals("\u0164\u0101\u0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "d\u0001\u0000"+ "'", var6.equals("d\u0001\u0000"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "false"+ "'", var1.equals("false"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("100", "\u0164\u0101\u0100");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMinusSign();
    var0.setPercent('-');
    char var4 = var0.getPatternSeparator();
    var0.setPercent('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == ';');

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 0L};
    java.lang.String var3 = java.lang.String.format("false", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "false"+ "'", var3.equals("false"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var2 = new char[] { ' ', '4'};
    java.lang.String var3 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " 4"+ "'", var3.equals(" 4"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.Object var1 = var0.getSecurityContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "100");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMinusSign();
    char var2 = var0.getDecimalSeparator();
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)100, (byte)1, (byte)0};
    java.lang.String var5 = new java.lang.String(var3, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var3, 100, 10, "false");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0164\u0101\u0100"+ "'", var5.equals("\u0164\u0101\u0100"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPatternSeparator('4');
    var0.setMonetaryDecimalSeparator('a');
    var0.setInternationalCurrencySymbol("\u0164\u0101\u0100");
    char var7 = var0.getPercent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '%');

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPatternSeparator('4');
    var0.setMonetaryDecimalSeparator('a');
    var0.setInternationalCurrencySymbol("\u0164\u0101\u0100");
    var0.setDecimalSeparator('%');

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.util.Debug.println("\u0164\u0101\u0100", "hi!");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var2 = var1.cannotReadRepositoryDb();
    com.sun.corba.se.impl.logging.ActivationSystemException var4 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var5 = var4.cannotReadRepositoryDb();
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.omg.CORBA.OBJECT_NOT_EXIST var7 = var1.errorInBadServerIdHandler((java.lang.Throwable)var5);
    java.lang.Throwable[] var8 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite(" 4");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.copyValueOf(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMinusSign();
    var0.setExponentSeparator("hi!");
    var0.setInfinity("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMinusSign();
    var0.setDigit('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '-');

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPatternSeparator('4');
    var0.setMonetaryDecimalSeparator('a');
    var0.setPercent('a');
    java.text.DecimalFormatSymbols var7 = new java.text.DecimalFormatSymbols();
    var7.setPatternSeparator('4');
    var7.setMonetaryDecimalSeparator('a');
    java.util.Currency var12 = var7.getCurrency();
    var0.setCurrency(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Throwable var1 = new java.lang.Throwable("100");
    com.sun.corba.se.impl.logging.ActivationSystemException var3 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ActivationSystemException var5 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var6 = var5.cannotReadRepositoryDb();
    java.lang.Throwable var7 = new java.lang.Throwable((java.lang.Throwable)var6);
    org.omg.CORBA.INTERNAL var8 = var3.serverNotRunning(var7);
    var1.addSuppressed((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.corba.se.impl.logging.ActivationSystemException var1 = com.sun.corba.se.impl.logging.ActivationSystemException.get("hi!");
    org.omg.CORBA.INITIALIZE var2 = var1.cannotReadRepositoryDb();
    org.omg.CORBA.INTERNAL var3 = var1.serverNotRunning();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("false");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSetFactory();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

}
