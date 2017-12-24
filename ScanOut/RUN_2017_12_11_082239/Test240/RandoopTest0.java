
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInfinity("hi!");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1, false, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Locale var3 = new java.util.Locale("hi!");
    java.math.BigDecimal var6 = new java.math.BigDecimal(10);
    java.math.BigDecimal var8 = new java.math.BigDecimal(10);
    java.math.BigDecimal var9 = var6.multiply(var8);
    java.lang.Object[] var10 = new java.lang.Object[] { var8};
    java.io.PrintStream var11 = var1.format(var3, "hi!", var10);
    java.lang.String var12 = var3.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Locale var3 = new java.util.Locale("hi!");
    java.math.BigDecimal var6 = new java.math.BigDecimal(10);
    java.math.BigDecimal var8 = new java.math.BigDecimal(10);
    java.math.BigDecimal var9 = var6.multiply(var8);
    java.lang.Object[] var10 = new java.lang.Object[] { var8};
    java.io.PrintStream var11 = var1.format(var3, "hi!", var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var13 = new java.util.Formatter((java.io.OutputStream)var1, "\uFFFD");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('4');
    java.lang.String var3 = var0.getCurrencySymbol();
    var0.setPerMill(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Rs."+ "'", var3.equals("Rs."));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10);
    java.math.BigDecimal var2 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var5 = new java.io.PrintStream("hi!");
    java.util.Locale var7 = new java.util.Locale("hi!");
    java.math.BigDecimal var10 = new java.math.BigDecimal(10);
    java.math.BigDecimal var12 = new java.math.BigDecimal(10);
    java.math.BigDecimal var13 = var10.multiply(var12);
    java.lang.Object[] var14 = new java.lang.Object[] { var12};
    java.io.PrintStream var15 = var5.format(var7, "hi!", var14);
    java.lang.String var16 = var7.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var17 = new java.util.Formatter((java.io.OutputStream)var2, "INR", var7);
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Locale var2 = new java.util.Locale("hi!", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getISO3Country();
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Locale var1 = java.util.Locale.forLanguageTag("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0.0d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var4 = new char[] { 'a', 'a'};
    var1.print(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = new java.math.BigDecimal(var4);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("INR", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Locale var1 = new java.util.Locale("hi!");
    java.util.Locale var4 = new java.util.Locale("hi!", "hi!");
    java.lang.String var5 = var1.getDisplayName(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var4 = var1.append('4');
    var4.print(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();
    var0.println();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.flush();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('4');
    var0.setDigit('4');
    java.lang.String var5 = var0.getInternationalCurrencySymbol();
    char var6 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "INR"+ "'", var5.equals("INR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '-');

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('4');
    java.lang.String var3 = var0.getNaN();
    java.lang.String var4 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Rs."+ "'", var4.equals("Rs."));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10);
    java.math.BigDecimal var3 = new java.math.BigDecimal(10);
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var6 = var3.movePointLeft(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      byte var7 = var6.byteValueExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.security.util.Debug.println("", "");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPercent('4');
    var0.setDigit('4');
    java.lang.String var5 = var0.getInternationalCurrencySymbol();
    var0.setPerMill(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "INR"+ "'", var5.equals("INR"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.security.util.Debug.println("\uFFFD", "");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Locale var1 = new java.util.Locale("\uFFFD");
    java.lang.String var3 = var1.getExtension('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var1);
    byte[] var5 = new byte[] { (byte)1, (byte)0};
    var2.write(var5);
    java.io.PrintStream var7 = new java.io.PrintStream((java.io.OutputStream)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();
    var0.println("\uFFFD");
    var0.println("INR");

  }

}
