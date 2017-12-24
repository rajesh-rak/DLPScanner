
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var2 = var1.getLevel();
    java.util.logging.Logger var6 = java.util.logging.Logger.getLogger("hi!");
    var1.entering("hi!", "hi!", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var6 = java.util.Date.UTC(0, 10, (-1), 10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2182859940000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf((-2182859940000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-2182859940000"+ "'", var1.equals("-2182859940000"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var3 = new char[] { 'a', '4', ' '};
    java.lang.String var6 = java.lang.String.copyValueOf(var3, 0, 0);
    java.lang.String var7 = java.lang.String.copyValueOf(var3);
    java.lang.String var8 = java.lang.String.copyValueOf(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "a4 "+ "'", var7.equals("a4 "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "a4 "+ "'", var8.equals("a4 "));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.lang.String var2 = var1.getResourceBundleName();
    java.util.logging.Logger var6 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var8 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var9 = var8.getLevel();
    java.util.logging.Logger var11 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var12 = var11.getLevel();
    var8.log(var12, "hi!", (java.lang.Object)1L);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var21 = var20.getLevel();
    java.lang.Object[] var22 = new java.lang.Object[] { var20};
    var6.logp(var12, "", "-1.0", "", var22);
    var1.entering("", "-2182859940000", var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    char[] var3 = new char[] { 'a', '4', ' '};
    java.lang.String var6 = java.lang.String.copyValueOf(var3, 0, 0);
    java.lang.String var7 = java.lang.String.copyValueOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = java.lang.String.copyValueOf(var3, 10, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "a4 "+ "'", var7.equals("a4 "));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var1, "-2182859940000");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    java.util.Enumeration var2 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.lang.String var2 = var1.getName();
    java.lang.String var3 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var1 = new java.util.Date(100L);
    var1.setMonth(10);
    int var4 = var1.getMonth();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var3 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var4 = var3.getLevel();
    java.util.logging.Logger var6 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var7 = var6.getLevel();
    var3.log(var7, "hi!", (java.lang.Object)1L);
    java.util.logging.Logger var15 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var16 = var15.getLevel();
    java.lang.Object[] var17 = new java.lang.Object[] { var15};
    var1.logp(var7, "", "-1.0", "", var17);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var22 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var23 = var22.getLevel();
    java.util.logging.Logger var25 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var26 = var25.getLevel();
    var22.log(var26, "hi!", (java.lang.Object)1L);
    char[] var37 = new char[] { 'a', '4', ' '};
    java.lang.String var40 = java.lang.String.copyValueOf(var37, 0, 0);
    var20.logrb(var26, "hi!", "hi!", "hi!", "hi!", (java.lang.Object)0);
    java.util.logging.Logger var47 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var49 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var50 = var49.getLevel();
    java.util.logging.Logger var52 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var53 = var52.getLevel();
    var49.log(var53, "hi!", (java.lang.Object)1L);
    java.util.logging.Logger var61 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var62 = var61.getLevel();
    java.lang.Object[] var63 = new java.lang.Object[] { var61};
    var47.logp(var53, "", "-1.0", "", var63);
    var1.logrb(var26, "a4 ", "-1.0", "-2182859940000", "-1.0", var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    java.lang.String var5 = new java.lang.String(var2, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0001"+ "'", var5.equals("\u0001"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.lang.String var2 = var1.getResourceBundleName();
    var1.info("-1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var3 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var4 = var3.getLevel();
    java.util.logging.Logger var6 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var7 = var6.getLevel();
    var3.log(var7, "hi!", (java.lang.Object)1L);
    java.util.logging.Logger var15 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var16 = var15.getLevel();
    java.lang.Object[] var17 = new java.lang.Object[] { var15};
    var1.logp(var7, "", "-1.0", "", var17);
    java.util.logging.Logger var20 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var22 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var23 = var22.getLevel();
    java.util.logging.Logger var25 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var26 = var25.getLevel();
    var22.log(var26, "hi!", (java.lang.Object)1L);
    java.util.logging.Logger var34 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var35 = var34.getLevel();
    java.lang.Object[] var36 = new java.lang.Object[] { var34};
    var20.logp(var26, "", "-1.0", "", var36);
    java.lang.Object[] var42 = new java.lang.Object[] { 10L};
    var1.logp(var26, "a4 ", "hi!", "\u0001", var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    long var6 = java.util.Date.UTC(1, 10, 100, 0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2142632900000L));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date(100L);
    var1.setMonth(10);
    var1.setHours(10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("a4 ");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var5 = new java.util.Date(1, 100, (-1), 1, 10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.lang.String var2 = var1.getResourceBundleName();
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("");
    java.util.logging.Level var5 = var4.getLevel();
    var1.logp(var5, "\u0001", "", "a4 ");
    java.util.Date var13 = new java.util.Date(100L);
    var13.setMonth(10);
    var1.entering("a4 ", "#", (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var1 = new java.util.Date(100L);
    var1.setMonth(10);
    var1.setMonth(10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var6 = new java.util.Date(10, 1, 10, 1, 10, 1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "\u0001");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


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

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var1 = new java.util.Date(100L);
    java.util.Date var5 = new java.util.Date((-1), 10, 10);
    boolean var6 = var1.after(var5);
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

}
