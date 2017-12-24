
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigInteger var5 = var3.toBigIntegerExact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    int var5 = var1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var7 = var4.setScale(10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.Object[] var3 = new java.lang.Object[] { 10};
    java.util.Formatter var4 = var0.format("", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var6 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var9 = var6.multiply(var8);
    java.math.BigDecimal var12 = var8.setScale(0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var15 = var1.divide(var8, 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    int var12 = var7.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Formatter var0 = new java.util.Formatter();
    var0.close();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getMonth();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.ZoneInfo var1 = sun.util.calendar.ZoneInfoFile.getZoneInfo("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var15 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var16 = var13.multiply(var15);
    int var17 = var9.compareTo(var15);
    java.lang.String var18 = var9.toPlainString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-1"+ "'", var18.equals("-1"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var2 = var1.plus();
    java.math.BigDecimal var3 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    long var6 = java.util.Date.UTC(100, 10, 11, 1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 973904999000L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 100);
    java.lang.String var5 = var2.getDisplayName(false, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "GMT+00:00"+ "'", var5.equals("GMT+00:00"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("-1");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.warning("");
    java.util.logging.Logger var3 = var0.getParent();
    java.lang.String var4 = var3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("-1", "GMT+00:00");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var15 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var16 = var13.multiply(var15);
    int var17 = var9.compareTo(var15);
    java.math.BigDecimal var19 = var15.movePointRight(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();
    var0.setSeconds((-1));
    var0.setYear(0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 100);
    boolean var3 = var2.isDirty();
    java.lang.String var4 = var2.getDisplayName();
    boolean var5 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "GMT+00:00"+ "'", var4.equals("GMT+00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.warning("");
    java.util.logging.Logger var3 = var0.getParent();
    var3.entering("-1", "");
    var3.info("GMT+00:00");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    int var12 = var7.intValue();
    java.math.BigDecimal var14 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var17 = var14.multiply(var16);
    java.math.BigDecimal var20 = var16.setScale(0, 0);
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var23 = var22.toPlainString();
    java.math.BigDecimal var24 = var20.max(var22);
    java.math.BigDecimal var26 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var28 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var29 = var26.multiply(var28);
    int var30 = var22.compareTo(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var32 = var7.divide(var28, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "-1"+ "'", var23.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.warning("");
    java.util.logging.Logger var3 = var0.getParent();
    var3.entering("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    java.math.BigInteger var12 = var9.unscaledValue();
    java.math.BigDecimal var14 = var9.movePointRight((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.multiply(var3);
    java.math.BigDecimal var7 = var3.setScale(0, 0);
    java.math.BigDecimal var9 = java.math.BigDecimal.valueOf((-1L));
    java.lang.String var10 = var9.toPlainString();
    java.math.BigDecimal var11 = var7.max(var9);
    java.math.BigDecimal var13 = var7.movePointLeft((-1));
    java.math.BigDecimal var15 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var17 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var18 = var15.multiply(var17);
    java.math.BigDecimal var19 = var18.ulp();
    java.math.BigDecimal var20 = var13.max(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-1"+ "'", var10.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

}
