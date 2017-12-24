
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setMonetaryDecimalSeparator('a');
    char var3 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '\u2030');

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("-1");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var3 = new byte[] { (byte)1, (byte)10, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, 0, 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var2 = new byte[] { (byte)10, (byte)100};
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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var1 = new byte[] { (byte)10};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\n"+ "'", var2.equals("\n"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Formatter var1 = new java.util.Formatter("-1");
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    var3.setMonetaryDecimalSeparator('a');
    char var6 = var3.getPerMill();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    java.util.Formatter var8 = var1.format("hi!", var7);
    java.lang.String var9 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '\u2030');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDigit('4');
    java.lang.Object var3 = var0.clone();
    char var4 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '0');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    char var1 = var0.getGroupingSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ',');

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var3 = new char[] { 'a', '#', '#'};
    java.lang.String var4 = java.lang.String.copyValueOf(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a##"+ "'", var4.equals("a##"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Enumeration var3 = var2.keys();
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var1 = java.lang.String.valueOf(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDigit('4');
    char var3 = var0.getDecimalSeparator();
    char var4 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '0');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Formatter var2 = new java.util.Formatter("-1");
    java.text.DecimalFormatSymbols var4 = new java.text.DecimalFormatSymbols();
    var4.setMonetaryDecimalSeparator('a');
    char var7 = var4.getPerMill();
    java.lang.Object[] var8 = new java.lang.Object[] { var7};
    java.util.Formatter var9 = var2.format("hi!", var8);
    java.lang.String var10 = java.lang.String.format("hi!", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == '\u2030');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getGroupingSeparator();
    var0.setPerMill('#');
    char var4 = var0.getGroupingSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == ',');

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    boolean var4 = var2.contains((java.lang.Object)true);
    java.util.Set var5 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getGroupingSeparator();
    var0.setPerMill('#');
    var0.setDigit('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == ',');

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    var2.clear();
    boolean var5 = var2.containsKey((java.lang.Object)',');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Formatter var0 = new java.util.Formatter();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl var0 = new com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDigit('4');
    char var3 = var0.getDecimalSeparator();
    var0.setCurrencySymbol("-1");
    var0.setDecimalSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '.');

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    var2.clear();
    java.text.DecimalFormatSymbols var4 = new java.text.DecimalFormatSymbols();
    var4.setDigit('4');
    java.lang.Object var7 = var4.clone();
    char var8 = var4.getMinusSign();
    var4.setPercent('#');
    java.text.DecimalFormatSymbols var11 = new java.text.DecimalFormatSymbols();
    var11.setDigit('4');
    java.lang.Object var14 = var11.clone();
    java.lang.Object var15 = var2.put((java.lang.Object)var4, var14);
    java.util.Hashtable var18 = new java.util.Hashtable(100, 1.0f);
    boolean var20 = var18.contains((java.lang.Object)true);
    var2.putAll((java.util.Map)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 10.0f);
    java.util.Hashtable var6 = new java.util.Hashtable(100, 1.0f);
    var6.clear();
    java.text.DecimalFormatSymbols var8 = new java.text.DecimalFormatSymbols();
    var8.setDigit('4');
    java.lang.Object var11 = var8.clone();
    char var12 = var8.getMinusSign();
    var8.setPercent('#');
    java.text.DecimalFormatSymbols var15 = new java.text.DecimalFormatSymbols();
    var15.setDigit('4');
    java.lang.Object var18 = var15.clone();
    java.lang.Object var19 = var6.put((java.lang.Object)var8, var18);
    java.lang.Object var20 = var2.put((java.lang.Object)' ', (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == '-');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDigit('4');
    char var3 = var0.getDecimalSeparator();
    char var4 = var0.getPerMill();
    char var5 = var0.getDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '\u2030');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '4');

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    char[] var2 = new char[] { ' ', '#'};
    java.lang.String var3 = new java.lang.String(var2);
    java.lang.String var4 = java.lang.String.valueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " #"+ "'", var3.equals(" #"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " #"+ "'", var4.equals(" #"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = java.lang.String.copyValueOf(var0, 100, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
