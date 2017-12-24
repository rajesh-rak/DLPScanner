
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.Object var1 = var0.clone();
    var0.setMonetaryDecimalSeparator('a');
    char var4 = var0.getPatternSeparator();
    var0.setInternationalCurrencySymbol("Indian Rupee");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == ';');

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    var0.setGroupingSeparator('4');
    var0.setInfinity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    java.lang.String var2 = var1.getDisplayName();
    java.lang.String var3 = var1.getDisplayName();
    int var4 = var1.getDefaultFractionDigits();
    int var5 = var1.getDefaultFractionDigits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Indian Rupee"+ "'", var2.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Indian Rupee"+ "'", var3.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    java.util.Currency var4 = var3.getCurrency();
    java.lang.String var5 = var4.getDisplayName();
    java.lang.String var6 = var4.getDisplayName();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    var2.copyInto(var7);
    java.util.ListIterator var9 = var2.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var2.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Indian Rupee"+ "'", var5.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Indian Rupee"+ "'", var6.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    var0.setGroupingSeparator('4');
    java.lang.String var4 = var0.getNaN();
    java.lang.String var5 = var0.getCurrencySymbol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD"+ "'", var4.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Rs."+ "'", var5.equals("Rs."));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.util.Vector var5 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var6 = new java.text.DecimalFormatSymbols();
    java.util.Currency var7 = var6.getCurrency();
    java.lang.String var8 = var7.getDisplayName();
    java.lang.String var9 = var7.getDisplayName();
    java.lang.Object[] var10 = new java.lang.Object[] { var9};
    var5.copyInto(var10);
    java.lang.Object[] var12 = var5.toArray();
    boolean var13 = var2.contains((java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var16 = var2.subList(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Indian Rupee"+ "'", var8.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Indian Rupee"+ "'", var9.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("Rs.", "\uFFFD");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = java.text.DecimalFormatSymbols.getInstance();
    char var4 = var3.getMonetaryDecimalSeparator();
    var3.setMonetaryDecimalSeparator('4');
    var2.addElement((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == '.');

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    var0.setGroupingSeparator('4');
    java.lang.String var4 = var0.getNaN();
    char var5 = var0.getMinusSign();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD"+ "'", var4.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == '-');

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    java.util.Currency var4 = var3.getCurrency();
    java.lang.String var5 = var4.getDisplayName();
    java.lang.String var6 = var4.getDisplayName();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    var2.copyInto(var7);
    java.util.ListIterator var9 = var2.listIterator();
    java.text.DecimalFormatSymbols var10 = new java.text.DecimalFormatSymbols();
    var10.setMonetaryDecimalSeparator(' ');
    char var13 = var10.getDecimalSeparator();
    boolean var14 = var2.equals((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Indian Rupee"+ "'", var5.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Indian Rupee"+ "'", var6.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    java.util.Currency var4 = var3.getCurrency();
    java.lang.String var5 = var4.getDisplayName();
    java.lang.String var6 = var4.getDisplayName();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    var2.copyInto(var7);
    java.lang.Object[] var9 = var2.toArray();
    java.util.Vector var12 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var13 = new java.text.DecimalFormatSymbols();
    java.util.Currency var14 = var13.getCurrency();
    java.lang.String var15 = var14.getDisplayName();
    java.lang.String var16 = var14.getDisplayName();
    java.lang.Object[] var17 = new java.lang.Object[] { var16};
    var12.copyInto(var17);
    boolean var19 = var2.addAll((java.util.Collection)var12);
    var2.trimToSize();
    int var21 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Indian Rupee"+ "'", var5.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Indian Rupee"+ "'", var6.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Indian Rupee"+ "'", var15.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Indian Rupee"+ "'", var16.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    char var2 = var0.getMonetaryDecimalSeparator();
    var0.setMonetaryDecimalSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == '.');

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.util.Currency var1 = var0.getCurrency();
    java.lang.String var2 = var1.getDisplayName();
    java.lang.String var3 = var1.getDisplayName();
    int var4 = var1.getDefaultFractionDigits();
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Indian Rupee"+ "'", var2.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Indian Rupee"+ "'", var3.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "INR"+ "'", var5.equals("INR"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    java.util.Currency var4 = var3.getCurrency();
    java.lang.String var5 = var4.getDisplayName();
    java.lang.String var6 = var4.getDisplayName();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    var2.copyInto(var7);
    boolean var10 = var2.contains((java.lang.Object)';');
    java.lang.String var11 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Indian Rupee"+ "'", var5.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Indian Rupee"+ "'", var6.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.util.Currency var1 = var0.getCurrency();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var3 = new java.text.DecimalFormatSymbols();
    java.util.Currency var4 = var3.getCurrency();
    java.lang.String var5 = var4.getDisplayName();
    java.lang.String var6 = var4.getDisplayName();
    java.lang.Object[] var7 = new java.lang.Object[] { var6};
    var2.copyInto(var7);
    java.lang.Object[] var9 = var2.toArray();
    java.util.Vector var12 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var13 = new java.text.DecimalFormatSymbols();
    java.util.Currency var14 = var13.getCurrency();
    java.lang.String var15 = var14.getDisplayName();
    java.lang.String var16 = var14.getDisplayName();
    java.lang.Object[] var17 = new java.lang.Object[] { var16};
    var12.copyInto(var17);
    boolean var19 = var2.addAll((java.util.Collection)var12);
    java.util.Vector var22 = new java.util.Vector(0, 0);
    java.text.DecimalFormatSymbols var23 = new java.text.DecimalFormatSymbols();
    java.util.Currency var24 = var23.getCurrency();
    java.lang.String var25 = var24.getDisplayName();
    java.lang.String var26 = var24.getDisplayName();
    java.lang.Object[] var27 = new java.lang.Object[] { var26};
    var22.copyInto(var27);
    boolean var29 = var12.removeAll((java.util.Collection)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Indian Rupee"+ "'", var5.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Indian Rupee"+ "'", var6.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Indian Rupee"+ "'", var15.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Indian Rupee"+ "'", var16.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Indian Rupee"+ "'", var25.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Indian Rupee"+ "'", var26.equals("Indian Rupee"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.Object var1 = var0.clone();
    var0.setInfinity("\uFFFD");
    var0.setMinusSign('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    java.lang.Object var1 = var0.clone();
    var0.setInfinity("\uFFFD");
    var0.setMinusSign('-');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
