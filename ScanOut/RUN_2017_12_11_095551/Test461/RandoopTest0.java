
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


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Exception var1 = new java.lang.Exception();
    var0.addSuppressed((java.lang.Throwable)var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var2 = new char[] { '#', '#'};
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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var5 = new java.util.Date(100, 1, 10, 0, (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 826771333);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Throwable var0 = new java.lang.Throwable();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date(10, 1, 10, 10, 1);
    java.lang.String var6 = var5.toString();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(826771333);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var0 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var3 = new java.math.BigDecimal(var0, (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    char[] var1 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.copyValueOf(var1, 826771333, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var2 = new byte[] { (byte)10, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = new java.lang.String(var2, 1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var3 = new char[] { '4', 'a', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var6 = new java.math.BigDecimal(var3, 1, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Exception var2 = new java.lang.Exception(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Set var0 = java.util.Currency.getAvailableCurrencies();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setDecimalSeparator('a');
    char var3 = var0.getGroupingSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == ',');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 573291651);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.System.getenv("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var5 = new java.util.Date(100, 573291651, 10, 1, 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(100, "");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512983268254L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInfinity("Thu Feb 10 10:01:00 IST 1910");

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Thu Feb 10 10:01:00 IST 1910");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    boolean var4 = var0.equals((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("");

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    java.lang.String var3 = var2.toString();
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getOffset(826771333, 826771333, (-1), 826771333, 573291651, 826771333);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var3.equals("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    int var3 = var0.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var2 = java.lang.System.setProperty("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var0 = new java.util.Date();
    java.util.Date var1 = new java.util.Date();
    boolean var2 = var0.after(var1);
    int var3 = var1.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", (-1));
    java.util.SimpleTimeZone var3 = var2.getLastRuleInstance();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"+ "'", var4.equals("sun.util.calendar.ZoneInfo[id=\"hi!\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Formatter var0 = new java.util.Formatter();

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    char[] var3 = new char[] { ' ', '#', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = java.lang.String.copyValueOf(var3, 573291651, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("hi!");
    java.lang.StringBuilder var4 = var1.insert(0, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
