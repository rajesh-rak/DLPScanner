
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("4");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setMonetaryDecimalSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var2 = new char[] { 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getDecimalSeparator();
    var0.setGroupingSeparator('#');
    var0.setDecimalSeparator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var2 = new char[] { '#', '4'};
    java.lang.String var5 = new java.lang.String(var2, 1, 1);
    java.lang.String var6 = java.lang.String.valueOf(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var9 = new java.math.BigDecimal(var2, 0, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "4"+ "'", var5.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "#4"+ "'", var6.equals("#4"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("-1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("4");
    java.util.Formatter var2 = new java.util.Formatter(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var2 = var1.negate();
    java.math.BigDecimal var4 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var5 = var4.negate();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    int var7 = var5.scale();
    long var8 = var5.longValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-10L));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    int var2 = var1.getPort();
    java.lang.String var3 = var1.getPath();
    java.lang.String var4 = var1.getUserInfo();
    java.lang.String var5 = var1.getProtocol();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "/Users/rajesh/code/DLPScanner/"+ "'", var3.equals("/Users/rajesh/code/DLPScanner/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "file"+ "'", var5.equals("file"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    char[] var2 = new char[] { '#', '4'};
    java.lang.String var5 = new java.lang.String(var2, 1, 1);
    java.lang.String var6 = new java.lang.String(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "4"+ "'", var5.equals("4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "#4"+ "'", var6.equals("#4"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("file");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    char var1 = var0.getDecimalSeparator();
    java.lang.String var2 = var0.getExponentSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == '.');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "E"+ "'", var2.equals("E"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var2 = var1.negate();
    java.math.BigDecimal var4 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var5 = var4.negate();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var8 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var9 = var8.negate();
    java.math.BigDecimal var11 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var12 = var11.negate();
    java.math.BigDecimal var13 = var9.divideToIntegralValue(var12);
    java.math.BigDecimal var15 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var16 = var15.negate();
    java.math.BigDecimal var18 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var19 = var18.negate();
    java.math.BigDecimal var20 = var16.divideToIntegralValue(var19);
    int var21 = var19.scale();
    java.math.BigDecimal[] var22 = var13.divideAndRemainder(var19);
    java.math.BigDecimal var23 = var6.subtract(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("4");
    java.lang.Object[] var4 = new java.lang.Object[] { '#'};
    java.io.PrintStream var5 = var1.format("/Users/rajesh/code/DLPScanner/", var4);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"4");
    byte[] var8 = new byte[] { };
    var7.write(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String var2 = java.security.Security.getAlgorithmProperty("hi!", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10.0d);
    boolean var3 = var1.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.List var2 = sun.security.jca.GetInstance.getServices("/Users/rajesh/code/DLPScanner/", "#4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("4");
    java.lang.Object[] var4 = new java.lang.Object[] { '#'};
    java.io.PrintStream var5 = var1.format("/Users/rajesh/code/DLPScanner/", var4);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var2 = var1.negate();
    java.math.BigDecimal var4 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var5 = var4.negate();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var8 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var9 = var8.negate();
    java.math.BigDecimal var11 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var12 = var11.negate();
    java.math.BigDecimal var13 = var9.divideToIntegralValue(var12);
    int var14 = var12.scale();
    java.math.BigDecimal[] var15 = var6.divideAndRemainder(var12);
    java.math.BigInteger var16 = var12.toBigInteger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.Provider.Service var2 = sun.security.jca.GetInstance.getService("#4", "hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var2 = var1.negate();
    java.math.BigDecimal var4 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var5 = var4.negate();
    java.math.BigDecimal var6 = var2.divideToIntegralValue(var5);
    java.math.BigDecimal var8 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var9 = var8.negate();
    java.math.BigDecimal var11 = new java.math.BigDecimal(10.0d);
    java.math.BigDecimal var12 = var11.negate();
    java.math.BigDecimal var13 = var9.divideToIntegralValue(var12);
    java.math.BigDecimal var15 = var5.divide(var9, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var3 = new byte[] { (byte)10, (byte)100, (byte)1};
    java.lang.String var5 = new java.lang.String(var3, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = new java.lang.String(var3, 0, 0, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u010A\u0164\u0101"+ "'", var5.equals("\u010A\u0164\u0101"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    int var2 = var1.getPort();
    java.lang.String var3 = var1.getPath();
    java.lang.String var4 = var1.getUserInfo();
    java.lang.String var5 = var1.getRef();
    java.net.URL var7 = java.lang.ClassLoader.getSystemResource("");
    int var8 = var7.getPort();
    java.lang.String var9 = var7.getPath();
    java.lang.String var10 = var7.getUserInfo();
    boolean var11 = var1.sameFile(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "/Users/rajesh/code/DLPScanner/"+ "'", var3.equals("/Users/rajesh/code/DLPScanner/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "/Users/rajesh/code/DLPScanner/"+ "'", var9.equals("/Users/rajesh/code/DLPScanner/"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

}
