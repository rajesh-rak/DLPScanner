
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var8 = var4.replace((-1), 10, "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    char[] var7 = new char[] { '4', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var10 = var1.append(var7, 10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = sun.util.calendar.ZoneInfoFile.toCustomID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "GMT+00:00"+ "'", var1.equals("GMT+00:00"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Timestamp var7 = new java.sql.Timestamp(0, (-1), 100, 10, 1, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var1 = sun.util.calendar.ZoneInfoFile.getZoneInfo("hi!");
    int[] var4 = new int[] { (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var1.getOffsets(1L, var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var8 = var4.append((java.lang.CharSequence)"", 10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var7 = var1.insert(1, "GMT+00:00");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.flush();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    boolean var3 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var3 = new byte[] { (byte)100, (byte)100, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var3, 1, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.lang.StringBuilder var3 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var6 = var3.delete(0, 10);
    java.lang.StringBuilder var8 = var6.append((-1));
    char[] var11 = new char[] { '4', '#'};
    java.lang.StringBuilder var12 = var8.append(var11);
    java.io.PrintStream var13 = var1.append((java.lang.CharSequence)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    int var3 = var2.getRawOffset();
    int var5 = var2.getOffset(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.util.calendar.ZoneInfo var1 = sun.util.calendar.ZoneInfoFile.getZoneInfo("hi!");
    int var2 = var1.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    java.lang.StringBuilder var7 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var10 = var7.delete(0, 10);
    java.lang.StringBuilder var12 = var10.append((-1));
    char[] var15 = new char[] { '4', '#'};
    java.lang.StringBuilder var16 = var12.append(var15);
    java.lang.StringBuilder var18 = var16.append(100L);
    java.lang.StringBuilder var21 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var24 = var21.delete(0, 10);
    java.lang.StringBuilder var26 = var24.append((-1));
    char[] var29 = new char[] { '4', '#'};
    java.lang.StringBuilder var30 = var26.append(var29);
    java.lang.StringBuilder var31 = var16.insert(1, var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var32 = var4.insert(10, var29);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    java.lang.StringBuilder var6 = var4.append((-1));
    char[] var9 = new char[] { '4', '#'};
    java.lang.StringBuilder var10 = var6.append(var9);
    java.lang.StringBuilder var12 = var10.append(100L);
    java.lang.StringBuilder var15 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var18 = var15.delete(0, 10);
    java.lang.StringBuilder var20 = var18.append((-1));
    char[] var23 = new char[] { '4', '#'};
    java.lang.StringBuilder var24 = var20.append(var23);
    java.lang.StringBuilder var25 = var10.insert(1, var23);
    java.lang.String var26 = var25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "-4#14#100"+ "'", var26.equals("-4#14#100"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(10);
    java.lang.Object[] var6 = new java.lang.Object[] { 0};
    java.io.PrintStream var7 = var1.printf("0.0", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    java.lang.StringBuilder var6 = var1.append("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var9 = var1.insert(1, (-1.0d));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    java.lang.StringBuilder var6 = var1.append("");
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.write(100);
    var1.print(false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.util.calendar.ZoneInfo var2 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("", (-1));
    boolean var3 = var2.observesDaylightTime();
    sun.util.calendar.ZoneInfo var6 = sun.util.calendar.ZoneInfoFile.getCustomTimeZone("hi!", 1);
    boolean var7 = var2.hasSameRules((java.util.TimeZone)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.write(100);
    var1.flush();
    var1.print(10.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(10);
    var1.println("0.0");

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var4 = var1.delete(0, 10);
    java.lang.StringBuilder var6 = var4.append((-1));
    char[] var9 = new char[] { '4', '#'};
    java.lang.StringBuilder var10 = var6.append(var9);
    java.lang.StringBuilder var12 = var10.append(100L);
    java.lang.StringBuilder var15 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var18 = var15.delete(0, 10);
    java.lang.StringBuilder var20 = var18.append((-1));
    char[] var23 = new char[] { '4', '#'};
    java.lang.StringBuilder var24 = var20.append(var23);
    java.lang.StringBuilder var25 = var10.insert(1, var23);
    java.lang.StringBuilder var28 = new java.lang.StringBuilder(10);
    java.lang.StringBuilder var31 = var28.delete(0, 10);
    java.lang.StringBuilder var33 = var31.append((-1));
    char[] var36 = new char[] { '4', '#'};
    java.lang.StringBuilder var37 = var33.append(var36);
    java.lang.String var38 = new java.lang.String(var36);
    java.lang.StringBuilder var39 = var25.insert(0, var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "4#"+ "'", var38.equals("4#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder("0.0");
    java.lang.StringBuilder var3 = var1.append("4#");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
