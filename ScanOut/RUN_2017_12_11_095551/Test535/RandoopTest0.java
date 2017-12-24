
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var2 = new char[] { 'a', 'a'};
    java.lang.String var3 = java.lang.String.copyValueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "aa"+ "'", var3.equals("aa"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.CoreResourceBundleControl var0 = sun.util.CoreResourceBundleControl.getRBControlInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    boolean var2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence)"0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var3 = new char[] { ' ', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var2 = java.util.regex.Pattern.matches("-1", (java.lang.CharSequence)"\u00FF\u0001");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("hi!", "-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Object[] var2 = new java.lang.Object[] { true};
    java.lang.String var3 = java.lang.String.format("0", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "0"+ "'", var3.equals("0"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV4("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = new java.lang.String(var2, (-1), 10, "-1");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u00FF\u0001"+ "'", var4.equals("\u00FF\u0001"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("\u00FF\u0001");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Q\u00FF\u0001\\E"+ "'", var1.equals("\\Q\u00FF\u0001\\E"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv4LiteralAddress("\\Q\u00FF\u0001\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var2, 0, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u00FF\u0001"+ "'", var4.equals("\u00FF\u0001"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("hi!", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    boolean var3 = var0.getUseParentHandlers();
    var0.info("\u00FF\u0001");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = new java.lang.String(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    var0.entering("0", "\u00FF\u0001", (java.lang.Object)100L);
    java.lang.Object[] var10 = new java.lang.Object[] { 100.0f};
    var0.entering("-1", "-1", var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    var0.entering("0", "\u00FF\u0001", (java.lang.Object)100L);
    java.util.logging.Logger var7 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var1 = java.lang.String.valueOf(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv6LiteralAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("\\Q\u00FF\u0001\\E");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    boolean var1 = var0.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    boolean var3 = var0.getUseParentHandlers();
    java.util.logging.Level var4 = var0.getLevel();
    java.util.logging.Handler[] var5 = var0.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    java.util.regex.Pattern var7 = java.util.regex.Pattern.compile("", 100);
    java.util.regex.Matcher var9 = var7.matcher((java.lang.CharSequence)"");
    var0.exiting("", "0", (java.lang.Object)var7);
    java.lang.String var11 = var7.pattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    boolean var3 = var0.getUseParentHandlers();
    java.util.logging.Level var4 = var0.getLevel();
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    var5.severe("0");
    java.util.regex.Pattern var12 = java.util.regex.Pattern.compile("", 100);
    java.util.regex.Matcher var14 = var12.matcher((java.lang.CharSequence)"");
    var5.exiting("", "0", (java.lang.Object)var12);
    var0.setParent(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("\u00FF\u0001");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.severe("0");
    java.util.regex.Pattern var7 = java.util.regex.Pattern.compile("", 100);
    java.util.regex.Matcher var9 = var7.matcher((java.lang.CharSequence)"");
    var0.exiting("", "0", (java.lang.Object)var7);
    java.lang.String var11 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, 0, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.String var1 = java.lang.String.valueOf(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    byte[] var2 = new byte[] { (byte)0, (byte)0};
    java.lang.String var4 = new java.lang.String(var2, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = new java.lang.String(var2, 100, 0, "\\Q\u00FF\u0001\\E");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0A00\u0A00"+ "'", var4.equals("\u0A00\u0A00"));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    char[] var1 = new char[] { ' '};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

}
