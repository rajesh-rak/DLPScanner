
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.io.IOException var1 = var0.ioException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.flush();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print(100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var11 = var1.append((java.lang.CharSequence)"hi!", (-1), 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var5 = new java.util.Formatter((java.io.OutputStream)var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    var0.setNaN("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Package[] var2 = java.lang.Package.getPackages();
    java.util.Formatter var3 = var0.format("hi!", (java.lang.Object[])var2);
    var0.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var0.toString();
      fail("Expected exception of type java.util.FormatterClosedException");
    } catch (java.util.FormatterClosedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    var0.setDecimalSeparator('%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Package[] var2 = java.lang.Package.getPackages();
    java.util.Formatter var3 = var0.format("hi!", (java.lang.Object[])var2);
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    char var2 = var0.getPercent();
    char var3 = var0.getPerMill();
    var0.setInfinity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u2030');

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print("");
    var1.println(0);
    var1.println(100.0d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print("");
    var1.println(0);
    var1.print(1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.flush();
    var1.println(1);
    var1.write(10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    var0.setInternationalCurrencySymbol("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    java.lang.Package[] var5 = java.lang.Package.getPackages();
    java.io.PrintStream var6 = var1.printf("", (java.lang.Object[])var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print("");
    java.util.Formatter var8 = new java.util.Formatter(var1);
    java.util.Formatter var9 = new java.util.Formatter((java.io.OutputStream)var1);
    com.sun.jndi.ldap.LdapPoolManager.showStats(var1);
    var1.close();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print("");
    java.util.Formatter var8 = new java.util.Formatter(var1);
    java.io.PrintStream var10 = var1.append((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    var1.print(false);
    var1.print("");
    char[] var10 = new char[] { 'a', '#'};
    var1.println(var10);
    var1.print((-1.0d));
    java.lang.Object[] var16 = new java.lang.Object[] { '\u2030'};
    java.io.PrintStream var17 = var1.printf("hi!", var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println("");
    java.util.Formatter var4 = new java.util.Formatter((java.io.OutputStream)var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getInternationalCurrencySymbol();
    char var2 = var0.getPercent();
    char var3 = var0.getPerMill();
    java.lang.String var4 = var0.getInternationalCurrencySymbol();
    var0.setCurrencySymbol("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "INR"+ "'", var1.equals("INR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u2030');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "INR"+ "'", var4.equals("INR"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Package var1 = java.lang.Package.getPackage("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = var1.append('a');
    byte[] var6 = new byte[] { (byte)1, (byte)10};
    var1.write(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
