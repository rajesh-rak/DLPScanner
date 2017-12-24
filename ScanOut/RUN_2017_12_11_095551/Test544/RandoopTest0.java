
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setExponentSeparator("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var5 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var6 = var3.divide(var5);
    java.math.BigDecimal var8 = var1.divide(var3, 1);
    double var9 = var8.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getNaN();
    var0.setInfinity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setEndRule(1, 100, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    long var6 = java.util.Date.UTC((-1), (-1), 0, 100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2242929440000L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var3 = new int[] { 1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getOffsetsByWall(10L, var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getNaN();
    var0.setZeroDigit('4');
    var0.setPercent('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.divide(var3);
    java.math.BigDecimal var6 = var3.movePointRight((-1));
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var10 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var13 = var10.divide(var12);
    java.math.BigDecimal var15 = var8.divide(var10, 1);
    java.math.BigDecimal var16 = var10.plus();
    java.math.BigDecimal var17 = var6.remainder(var16);
    java.math.BigDecimal var19 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var21 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var23 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var24 = var21.divide(var23);
    java.math.BigDecimal var26 = var19.divide(var21, 1);
    java.math.BigDecimal var27 = var21.plus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var30 = var17.divide(var21, 0, 100);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setDSTSavings(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var3 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var4 = var1.divide(var3);
    java.math.BigDecimal var5 = var1.stripTrailingZeros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getNaN();
    var0.setZeroDigit('4');
    var0.setPatternSeparator('4');
    java.lang.String var6 = var0.getInfinity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\u221E"+ "'", var6.equals("\u221E"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "");
    int var3 = var2.getRawOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    int[] var4 = new int[] { 100, 100};
    int var5 = var0.getOffsetsByWall(10L, var4);
    boolean var6 = var0.isDirty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    java.lang.String var1 = var0.getNaN();
    var0.setZeroDigit('4');
    var0.setPatternSeparator('4');
    var0.setDigit('4');
    var0.setPercent('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\uFFFD"+ "'", var1.equals("\uFFFD"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.math.BigDecimal var1 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var2 = var1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    int var2 = var1.getMonth();
    int var3 = var0.compareTo(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(10, "");
    var2.setStartRule(10, 0, 0, 10, true);
    var2.setEndRule(11, 0, 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(10, "", 11, 10, 1, 10, 10, 10, 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    var2.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var5 = var1.illegalIorToSocketInfoType((java.lang.Object)var2);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var8 = new java.text.DecimalFormatSymbols();
    var8.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var11 = var7.illegalIorToSocketInfoType((java.lang.Object)var8);
    org.omg.CORBA.BAD_PARAM var14 = var7.errorSettingField((java.lang.Object)(-1.0d), (java.lang.Object)11);
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var18 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var19 = var16.divide(var18);
    int var20 = var19.scale();
    java.math.BigDecimal var22 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var24 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var26 = java.math.BigDecimal.valueOf((-1L));
    java.math.BigDecimal var27 = var24.divide(var26);
    java.math.BigDecimal var29 = var22.divide(var24, 1);
    org.omg.CORBA.BAD_PARAM var31 = var1.couldNotCreateArray((java.lang.Throwable)var14, (java.lang.Object)var19, (java.lang.Object)var22, (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    var2.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var5 = var1.illegalIorToSocketInfoType((java.lang.Object)var2);
    org.omg.CORBA.BAD_PARAM var8 = var1.errorSettingField((java.lang.Object)(-1.0d), (java.lang.Object)11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var11 = new java.text.DecimalFormatSymbols();
    var11.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var14 = var10.illegalIorToSocketInfoType((java.lang.Object)var11);
    java.lang.Throwable var15 = new java.lang.Throwable((java.lang.Throwable)var14);
    org.omg.CORBA.COMM_FAILURE var16 = var1.invokeError(var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var19 = new java.text.DecimalFormatSymbols();
    var19.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var22 = var18.illegalIorToSocketInfoType((java.lang.Object)var19);
    org.omg.CORBA.BAD_PARAM var25 = var18.errorSettingField((java.lang.Object)(-1.0d), (java.lang.Object)11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var28 = new java.text.DecimalFormatSymbols();
    var28.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var31 = var27.illegalIorToSocketInfoType((java.lang.Object)var28);
    java.lang.Throwable var32 = new java.lang.Throwable((java.lang.Throwable)var31);
    org.omg.CORBA.COMM_FAILURE var33 = var18.invokeError(var32);
    org.omg.CORBA.BAD_OPERATION var34 = var1.extractNotInitialized(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    var2.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var5 = var1.illegalIorToSocketInfoType((java.lang.Object)var2);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var8 = new java.text.DecimalFormatSymbols();
    var8.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var11 = var7.illegalIorToSocketInfoType((java.lang.Object)var8);
    org.omg.CORBA.BAD_PARAM var14 = var7.errorSettingField((java.lang.Object)(-1.0d), (java.lang.Object)11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var17 = new java.text.DecimalFormatSymbols();
    var17.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var20 = var16.illegalIorToSocketInfoType((java.lang.Object)var17);
    java.lang.Throwable var21 = new java.lang.Throwable((java.lang.Throwable)var20);
    org.omg.CORBA.COMM_FAILURE var22 = var7.invokeError(var21);
    org.omg.CORBA.MARSHAL var23 = var1.valuehandlerReadException(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var2 = new java.text.DecimalFormatSymbols();
    var2.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var5 = var1.illegalIorToSocketInfoType((java.lang.Object)var2);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var8 = new java.text.DecimalFormatSymbols();
    var8.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var11 = var7.illegalIorToSocketInfoType((java.lang.Object)var8);
    org.omg.CORBA.BAD_PARAM var14 = var7.errorSettingField((java.lang.Object)(-1.0d), (java.lang.Object)11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.text.DecimalFormatSymbols var17 = new java.text.DecimalFormatSymbols();
    var17.setNaN("\uFFFD");
    org.omg.CORBA.DATA_CONVERSION var20 = var16.illegalIorToSocketInfoType((java.lang.Object)var17);
    java.lang.Throwable var21 = new java.lang.Throwable((java.lang.Throwable)var20);
    org.omg.CORBA.COMM_FAILURE var22 = var7.invokeError(var21);
    org.omg.CORBA.INTERNAL var23 = var1.stringifyWriteError(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

}
