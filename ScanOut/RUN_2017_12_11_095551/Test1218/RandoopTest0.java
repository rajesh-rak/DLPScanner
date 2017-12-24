
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone((-1), "", 1, 10, (-1), (-1), (-1), 0, 0, 1, 1, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var4 = var1.divide(var3);
    float var5 = var3.floatValue();
    java.math.BigDecimal var7 = new java.math.BigDecimal(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var10 = var3.divide(var7, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0f);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    boolean var1 = var0.isDirty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.lang.String var1 = var0.getDisplayName();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var4 = var1.divide(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)var4, 0, (java.lang.Object)true, (-1), 100);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var4 = var1.divide(var3);
    float var5 = var3.floatValue();
    java.math.BigInteger var6 = var3.unscaledValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var4 = var1.divide(var3);
    int var5 = java.lang.System.identityHashCode((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 611618594);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(1, "", 0, 611618594, 1, 100, 100, 1, 1, (-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(0, "", 100, 100, 1, (-1), 10, 10, 611618594, 100, 611618594, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var6 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var7 = var4.divide(var6);
    java.math.BigDecimal var8 = var2.subtract(var4);
    java.math.BigDecimal var11 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var13 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var15 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var16 = var13.divide(var15);
    java.math.BigDecimal var17 = var11.subtract(var13);
    java.math.BigDecimal var19 = new java.math.BigDecimal(1L);
    double var20 = var19.doubleValue();
    java.math.BigDecimal var21 = var17.divide(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var24 = var2.divide(var19, 1, 611618594);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Exception var0 = new java.lang.Exception();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    long var6 = java.util.Date.UTC(611618594, (-1), 1, 100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 854072328237247384L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(1, 10, 100);
    java.util.Date var7 = new java.util.Date(1, 10, 100);
    int var8 = var3.compareTo(var7);
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(10, "hi!", 611618594, 611618594, 611618594, (-1), 0, 0, 1, 10, (-1), 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setPercent(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    var0.setRawOffset(611618594);
    int[] var5 = new int[] { 1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.getOffsets(10L, var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    long var6 = java.util.Date.UTC(100, 100, (-1), 100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1209787139000L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    var0.setRawOffset(611618594);
    java.lang.String var3 = var0.getDisplayName();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var6 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var7 = var4.divide(var6);
    float var8 = var6.floatValue();
    java.math.BigDecimal var9 = var2.add(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var3 = new java.util.Date(1, 10, 100);
    java.util.Date var7 = new java.util.Date(1, 10, 100);
    int var8 = var3.compareTo(var7);
    long var9 = var7.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var7 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var9 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var10 = var7.divide(var9);
    java.math.BigDecimal var11 = var5.subtract(var7);
    java.math.BigDecimal var13 = new java.math.BigDecimal(1L);
    double var14 = var13.doubleValue();
    java.math.BigDecimal var15 = var11.divide(var13);
    java.math.BigDecimal var16 = var2.min(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var2 = var1.ulp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512969129615L);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.load("\n");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var3 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var4 = var1.divide(var3);
    int var5 = var3.intValueExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setInternationalCurrencySymbol("Sat Feb 08 00:00:00 IST 1902");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.lang.Object var1 = var0.clone();
    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo();
    java.lang.Object var3 = var2.clone();
    boolean var4 = var0.hasSameRules((java.util.TimeZone)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.math.BigDecimal var2 = java.math.BigDecimal.valueOf(100L, 1);
    java.math.BigDecimal var4 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var6 = new java.math.BigDecimal(1L);
    java.math.BigDecimal var7 = var4.divide(var6);
    java.math.BigDecimal var8 = var2.subtract(var4);
    java.math.BigDecimal var9 = var2.ulp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

}
