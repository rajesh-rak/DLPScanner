
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    var0.setMinusSign('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    char var4 = var0.getGroupingSeparator();
    var0.setMinusSign('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '.');

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    boolean var7 = var5.equals((java.lang.Object)0);
    boolean var8 = var2.retainAll((java.util.Collection)var5);
    java.text.DecimalFormatSymbols var9 = new java.text.DecimalFormatSymbols();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insertElementAt((java.lang.Object)var9, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var4 = var2.equals((java.lang.Object)0);
    var2.setSize(0);
    java.text.DecimalFormatSymbols var7 = new java.text.DecimalFormatSymbols();
    char var8 = var7.getMonetaryDecimalSeparator();
    var7.setGroupingSeparator('.');
    char var11 = var7.getGroupingSeparator();
    var7.setInternationalCurrencySymbol("");
    char var14 = var7.getMonetaryDecimalSeparator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)var7, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == '.');

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    boolean var2 = var0.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    var0.setPatternSeparator('.');
    java.lang.String var6 = var0.getInternationalCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "INR"+ "'", var6.equals("INR"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMinusSign('4');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var4 = var2.listIterator(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "INR");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    java.util.Vector var5 = new java.util.Vector(10, 100);
    boolean var7 = var5.equals((java.lang.Object)0);
    boolean var8 = var2.retainAll((java.util.Collection)var5);
    int var11 = var5.indexOf((java.lang.Object)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMinusSign(' ');
    char var3 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '0');

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    char var4 = var0.getGroupingSeparator();
    var0.setInternationalCurrencySymbol("");
    char var7 = var0.getMonetaryDecimalSeparator();
    char var8 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator(' ');
    char var11 = var0.getDecimalSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == '.');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var3 = var2.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10, 100);
    boolean var8 = var6.equals((java.lang.Object)0);
    var6.setSize(0);
    boolean var11 = var2.containsAll((java.util.Collection)var6);
    java.util.Vector var14 = new java.util.Vector(10, 100);
    boolean var15 = var14.isEmpty();
    java.util.Vector var18 = new java.util.Vector(10, 100);
    boolean var20 = var18.equals((java.lang.Object)0);
    var18.setSize(0);
    boolean var23 = var14.containsAll((java.util.Collection)var18);
    java.lang.Object[] var24 = var14.toArray();
    var6.copyInto(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var4 = var2.equals((java.lang.Object)0);
    java.util.Iterator var5 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var2.subList((-1), (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getGroupingSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ',');

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var4 = var2.equals((java.lang.Object)0);
    java.util.Iterator var5 = var2.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var2.lastIndexOf((java.lang.Object)false, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var3 = var2.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10, 100);
    boolean var8 = var6.equals((java.lang.Object)0);
    var6.setSize(0);
    boolean var11 = var2.containsAll((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var6.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('#');
    char var3 = var0.getDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '#');

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    char var4 = var0.getGroupingSeparator();
    var0.setInternationalCurrencySymbol("");
    char var7 = var0.getMonetaryDecimalSeparator();
    var0.setInternationalCurrencySymbol("INR");
    var0.setCurrencySymbol("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '.');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Currency var1 = java.util.Currency.getInstance("INR");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "INR"+ "'", var2.equals("INR"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    var0.setPatternSeparator('.');
    var0.setGroupingSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setGroupingSeparator('.');
    char var4 = var0.getGroupingSeparator();
    var0.setInternationalCurrencySymbol("");
    char var7 = var0.getMonetaryDecimalSeparator();
    var0.setInternationalCurrencySymbol("INR");
    char var10 = var0.getDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == '#');

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, 100);
    boolean var3 = var2.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10, 100);
    boolean var8 = var6.equals((java.lang.Object)0);
    var6.setSize(0);
    boolean var11 = var2.containsAll((java.util.Collection)var6);
    java.text.DecimalFormatSymbols var12 = new java.text.DecimalFormatSymbols();
    char var13 = var12.getMonetaryDecimalSeparator();
    var12.setGroupingSeparator('.');
    char var16 = var12.getGroupingSeparator();
    var12.setInternationalCurrencySymbol("");
    var12.setNaN("INR");
    boolean var21 = var6.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

}
