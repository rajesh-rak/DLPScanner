
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.timestamp.TimestampToken var1 = new sun.security.timestamp.TimestampToken(var0);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    java.lang.Object var6 = var5.clone();
    int var7 = var5.getDay();
    int var8 = var5.getYear();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = sun.security.util.SignatureFileVerifier.isSigningRelated("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset(10, 1, 11, 6, (-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.lang.String var1 = var0.getDisplayName();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getDay();
    var5.setDate(99);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    var2.setRawOffset(6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var2.getOffset(0, 6, 99, 1, 99, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    java.util.Date var12 = new java.util.Date(100, (-1), 0, 100, 1);
    java.lang.Object var13 = var12.clone();
    int var14 = var12.getDay();
    int var15 = var12.getYear();
    boolean var16 = var5.equals((java.lang.Object)var12);
    java.util.Date var22 = new java.util.Date(100, (-1), 0, 100, 1);
    int var23 = var22.getDay();
    java.util.Date var29 = new java.util.Date(100, (-1), 0, 100, 1);
    int var30 = var29.getMonth();
    int var31 = var29.getSeconds();
    int var32 = var29.getDate();
    int var33 = var22.compareTo(var29);
    boolean var34 = var5.before(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    var2.setRawOffset(6);
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    var2.setRawOffset(6);
    boolean var5 = var2.isDirty();
    java.lang.String var8 = var2.getDisplayName(true, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "GMT+00:00"+ "'", var8.equals("GMT+00:00"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 0);
    boolean var5 = var3.equals((java.lang.Object)(short)10);
    long var6 = var3.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-59014396800006L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    long var6 = java.util.Date.UTC(99, 99, 6, 100, 6, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1176178059000L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    int var7 = var5.getSeconds();
    int var8 = var5.getDate();
    boolean var10 = var5.equals((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Sat Dec 04 04:01:00 IST 1999");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    java.util.Date var12 = new java.util.Date(100, (-1), 0, 100, 1);
    java.lang.Object var13 = var12.clone();
    int var14 = var12.getDay();
    int var15 = var12.getYear();
    boolean var16 = var5.equals((java.lang.Object)var12);
    int var17 = var12.getSeconds();
    var12.setYear(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 0);
    int var5 = var3.getMinimum(11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var3.getMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 0);
    var3.set(6, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.roll((-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("GMT+00:00");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("hi!", 1);
    var2.setRawOffset(6);
    boolean var5 = var2.isDirty();
    int var6 = var2.getDSTSavings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    int var7 = var5.getSeconds();
    int var8 = var5.getDate();
    int var9 = var5.getHours();
    int var10 = var5.getHours();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    var5.setHours((-1));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.JarFile var1 = new java.util.jar.JarFile("hi!");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var5 = new java.util.Date(100, (-1), 0, 100, 1);
    int var6 = var5.getMonth();
    int var7 = var5.getSeconds();
    int var8 = var5.getDate();
    int var9 = var5.getHours();
    int var10 = var5.getDate();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(100, (-1), 0);
    int var8 = var6.getMinimum(11);
    java.lang.Object var9 = var0.put((java.lang.Object)100.0d, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

}
