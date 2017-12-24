
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.entering("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.WeakHashMap var1 = new java.util.WeakHashMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.ResourceBundle var2 = var1.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = new char[] { 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var3 = new java.math.BigDecimal(var2);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var5 = var1.append((java.lang.CharSequence)"hi!", 100, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.info("");
    var1.fine("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.config("");
    java.lang.String var4 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var6 = var2.min(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var5.intValueExact();
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    boolean var4 = var2.equals((java.lang.Object)'a');
    boolean var6 = var2.equals((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.jndi.ldap.pool.Pool var3 = new com.sun.jndi.ldap.pool.Pool((-1), 100, 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.info("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.config("");
    boolean var4 = var1.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    var1.close();
    java.io.PrintStream var6 = new java.io.PrintStream("hi!");
    java.util.Formatter var7 = new java.util.Formatter((java.lang.Appendable)var6);
    var6.close();
    java.lang.Object[] var11 = new java.lang.Object[] { 1.0d};
    java.io.PrintStream var12 = var6.printf("", var11);
    java.io.PrintStream var13 = var1.format("hi!", var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var3 = new java.io.PrintStream("hi!");
    java.util.Formatter var4 = new java.util.Formatter((java.lang.Appendable)var3);
    java.util.Locale var5 = var4.locale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var6 = new java.util.Formatter("hi!", "hi!", var5);
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var1 = java.util.Currency.getInstance("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var4 = var2.movePointRight(0);
    java.math.BigInteger var5 = var2.unscaledValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(10L, 10);
    java.math.BigDecimal var4 = var2.movePointRight(0);
    java.math.BigDecimal var7 = var2.setScale(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    java.lang.Object[] var5 = new java.lang.Object[] { 1.0d};
    java.util.Formatter var6 = var2.format("hi!", var5);
    java.io.PrintStream var8 = new java.io.PrintStream("hi!");
    java.util.Formatter var9 = new java.util.Formatter((java.lang.Appendable)var8);
    java.util.Locale var10 = var9.locale();
    java.util.Currency var11 = java.util.Currency.getInstance(var10);
    java.io.PrintStream var14 = new java.io.PrintStream("hi!");
    java.io.PrintStream var17 = new java.io.PrintStream("hi!");
    java.util.Formatter var18 = new java.util.Formatter((java.lang.Appendable)var17);
    var17.close();
    java.lang.Object[] var22 = new java.lang.Object[] { 1.0d};
    java.io.PrintStream var23 = var17.printf("", var22);
    java.io.PrintStream var24 = var14.printf("hi!", var22);
    java.util.Formatter var25 = var6.format(var10, "", var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    var1.close();
    java.lang.Object[] var6 = new java.lang.Object[] { 1.0d};
    java.io.PrintStream var7 = var1.printf("", var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var11 = var7.append((java.lang.CharSequence)"hi!", 0, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("", "");
    var0.info("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.util.Formatter var2 = new java.util.Formatter((java.lang.Appendable)var1);
    var1.flush();
    java.io.PrintStream var5 = new java.io.PrintStream("hi!");
    java.util.Formatter var6 = new java.util.Formatter((java.lang.Appendable)var5);
    java.util.Locale var7 = var6.locale();
    java.io.PrintStream var10 = new java.io.PrintStream("hi!");
    java.util.Formatter var11 = new java.util.Formatter((java.lang.Appendable)var10);
    java.lang.Object[] var14 = new java.lang.Object[] { 1.0d};
    java.util.Formatter var15 = var11.format("hi!", var14);
    java.io.PrintStream var16 = var1.printf(var7, "hi!", var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf(1.0d);
    int var2 = var1.intValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

}
