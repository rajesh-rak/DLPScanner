
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var1 = new java.util.HashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("hi!");
    char var3 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == '-');

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("hi!");
    java.util.Currency var3 = var0.getCurrency();
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "INR"+ "'", var4.equals("INR"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getMonetaryDecimalSeparator();
    var0.setPatternSeparator('a');
    var0.setInfinity("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.lang.Object var9 = var5.put((java.lang.Object)(-1), (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var1 = new java.lang.Thread((java.lang.Runnable)var0);
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var1);
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("\uFFFD");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Exception var1 = new java.lang.Exception("E");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Appendable var1 = var0.out();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable var1 = new java.lang.Throwable((java.lang.Throwable)var0);
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Exception"+ "'", var2.equals("java.lang.Exception"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setExponentSeparator("hi!");
    java.util.Currency var3 = var0.getCurrency();
    java.lang.String var4 = var3.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Indian Rupee"+ "'", var4.equals("Indian Rupee"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getMonetaryDecimalSeparator();
    char var2 = var0.getPerMill();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '\u2030');

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    java.lang.ClassLoader var2 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.String var1 = var0.getExponentSeparator();
    var0.setCurrencySymbol("java.lang.Exception");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "E"+ "'", var1.equals("E"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('-');
    boolean var4 = var0.equals((java.lang.Object)(short)0);
    java.lang.String var5 = var0.getNaN();
    char var6 = var0.getZeroDigit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\uFFFD"+ "'", var5.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == '0');

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.text.DecimalFormatSymbols var7 = java.text.DecimalFormatSymbols.getInstance();
    var7.setExponentSeparator("hi!");
    java.util.Currency var10 = var7.getCurrency();
    java.text.DecimalFormatSymbols var11 = java.text.DecimalFormatSymbols.getInstance();
    var11.setExponentSeparator("hi!");
    java.util.Currency var14 = var11.getCurrency();
    java.lang.Object var15 = var2.put((java.lang.Object)var10, (java.lang.Object)var11);
    java.lang.String var16 = var10.getSymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "INR"+ "'", var16.equals("INR"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 10.0f);
    var2.putAll((java.util.Map)var5);
    var2.clear();
    java.text.DecimalFormatSymbols var8 = java.text.DecimalFormatSymbols.getInstance();
    var8.setExponentSeparator("hi!");
    java.util.Currency var11 = var8.getCurrency();
    boolean var12 = var2.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setPerMill(' ');

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.close();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('-');
    boolean var4 = var0.equals((java.lang.Object)(short)0);
    var0.setMonetaryDecimalSeparator('.');
    java.lang.String var7 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Rs."+ "'", var7.equals("Rs."));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 10.0f);
    var2.putAll((java.util.Map)var5);
    java.util.Set var7 = var5.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 10.0f);
    var2.clear();

  }

}
