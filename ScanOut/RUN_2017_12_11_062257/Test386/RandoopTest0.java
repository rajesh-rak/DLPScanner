
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.String var2 = var0.getInfinity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u221E"+ "'", var2.equals("\u221E"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 1, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var1 = new char[] { '4'};
    java.lang.String var2 = new java.lang.String(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var1, 1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    char var6 = var0.getMonetaryDecimalSeparator();
    char var7 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '\u2030');

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    char var6 = var0.getMonetaryDecimalSeparator();
    char var7 = var0.getGroupingSeparator();
    char var8 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '\u2030');

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("0.0", "1");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var3 = new char[] { 'a', 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    var0.setNaN("4");
    var0.setNaN("0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    var2.setZeroDigit(' ');
    java.lang.Object var5 = var1.get((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var3 = new char[] { '4', 'a', '4'};
    java.lang.String var4 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "4a4"+ "'", var4.equals("4a4"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    java.lang.String var6 = var0.getInternationalCurrencySymbol();
    var0.setCurrencySymbol("0.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "INR"+ "'", var6.equals("INR"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    int var2 = var1.size();
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    int var5 = var4.size();
    var1.putAll((java.util.Map)var4);
    java.text.DecimalFormatSymbols var7 = new java.text.DecimalFormatSymbols();
    char var8 = var7.getDigit();
    java.lang.Object var9 = var7.clone();
    var7.setMonetaryDecimalSeparator('4');
    boolean var12 = var1.containsValue((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Formatter var0 = new java.util.Formatter();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.equals((java.lang.Object)'%');
    java.util.Set var4 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setZeroDigit(' ');
    java.lang.String var3 = var0.getNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "\uFFFD"+ "'", var3.equals("\uFFFD"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    int var2 = var1.size();
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    int var5 = var4.size();
    var1.putAll((java.util.Map)var4);
    var4.clear();
    java.lang.Object var8 = var4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    byte[] var2 = new byte[] { (byte)100, (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "d\u00FF"+ "'", var4.equals("d\u00FF"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    byte[] var2 = new byte[] { (byte)1, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 10, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 0};
    java.lang.String var3 = java.lang.String.format("4a4", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4a4"+ "'", var3.equals("4a4"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    char var6 = var0.getDecimalSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '.');

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("\uFFFD", "d\u00FF");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    var0.setNaN("4");
    var0.setCurrencySymbol("4a4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var0 = new java.util.Hashtable();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    char var6 = var0.getMonetaryDecimalSeparator();
    char var7 = var0.getGroupingSeparator();
    java.util.Hashtable var9 = new java.util.Hashtable(10);
    boolean var11 = var9.equals((java.lang.Object)'%');
    boolean var12 = var0.equals((java.lang.Object)var9);
    java.text.DecimalFormatSymbols var13 = new java.text.DecimalFormatSymbols();
    var13.setZeroDigit(' ');
    java.lang.Object var17 = var9.put((java.lang.Object)var13, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getDigit();
    java.lang.Object var2 = var0.clone();
    var0.setMonetaryDecimalSeparator('4');
    char var5 = var0.getPercent();
    char var6 = var0.getMonetaryDecimalSeparator();
    char var7 = var0.getGroupingSeparator();
    var0.setNaN("INR");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '%');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == ',');

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    int var2 = var1.size();
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    int var5 = var4.size();
    var1.putAll((java.util.Map)var4);
    var4.clear();
    java.util.Set var8 = var4.entrySet();
    boolean var10 = var4.equals((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
