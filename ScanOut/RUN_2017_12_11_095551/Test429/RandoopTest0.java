
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var1 = new java.util.Formatter("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var3 = new char[] { 'a', '#', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = new java.math.BigDecimal(var3, (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L), 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var7 = var2.divide(var5, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.close();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    int var1 = var0.get_icon_y();
    long var2 = var0.get_icon_pixmap();
    var0.set_icon_window(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print("hi!");
    java.util.Locale[] var5 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.io.PrintStream var6 = var1.format("hi!", (java.lang.Object[])var5);
    java.io.PrintStream var8 = new java.io.PrintStream("hi!");
    var8.println((java.lang.Object)(short)1);
    byte[] var14 = new byte[] { (byte)(-1), (byte)0, (byte)0};
    var8.write(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.write(var14, 100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    char[] var1 = new char[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var4 = new java.math.BigDecimal(var1, (-1), (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var6 = var2.multiply(var5);
    int var7 = var2.signum();
    long var8 = var2.longValue();
    int var9 = var2.signum();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.security.ProtectionDomain[] var7 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var8 = new java.security.AccessControlContext(var7);
    boolean var9 = var5.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var5.divide(var12, 0, 1);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var23 = var19.multiply(var22);
    int var24 = var19.signum();
    long var25 = var19.longValue();
    java.math.BigDecimal var26 = var5.add(var19);
    java.lang.String var27 = var26.toPlainString();
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "-0.2"+ "'", var27.equals("-0.2"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_icon_pixmap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Exception var1 = new java.lang.Exception();
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);
    java.lang.Throwable var3 = new java.lang.Throwable(var2);
    java.lang.Exception var4 = new java.lang.Exception("", var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int var0 = sun.awt.X11.XWMHints.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 56);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println((java.lang.Object)(short)1);
    var1.print("");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    int var1 = var0.get_icon_y();
    var0.set_icon_mask(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 32677);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var6 = var2.multiply(var5);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf((-1L), 1);
    java.math.BigDecimal var13 = var9.multiply(var12);
    java.math.BigDecimal var16 = var5.divide(var12, 0, 1);
    int var17 = var5.intValue();
    
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
    assertTrue(var17 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();
    var0.println();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    long var1 = var0.get_icon_window();
    int var2 = var0.get_icon_x();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 214614016);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print("hi!");
    java.util.Locale[] var5 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.io.PrintStream var6 = var1.format("hi!", (java.lang.Object[])var5);
    java.io.PrintStream var8 = var6.append((java.lang.CharSequence)"");
    java.util.Locale[] var10 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.io.PrintStream var11 = var6.format("hi!", (java.lang.Object[])var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print("hi!");
    java.util.Locale[] var5 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    java.io.PrintStream var6 = var1.format("hi!", (java.lang.Object[])var5);
    java.io.PrintStream var8 = var6.append((java.lang.CharSequence)"");
    var8.println(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.awt.X11.XWMHints var0 = new sun.awt.X11.XWMHints();
    boolean var1 = var0.get_input();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

}
