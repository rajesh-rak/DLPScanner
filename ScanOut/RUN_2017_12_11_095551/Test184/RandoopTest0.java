
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    var0.setLenient(true);
    int var4 = var0.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    int var4 = var0.compareTo((java.util.Calendar)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.roll((-1), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    int var4 = var0.compareTo((java.util.Calendar)var3);
    var3.set(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)'a');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    int var3 = var0.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    int var4 = var0.compareTo((java.util.Calendar)var3);
    boolean var5 = var3.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(10L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var6.setDate(1);
    java.util.Date var10 = new java.util.Date(10L);
    java.lang.String var11 = var10.toLocaleString();
    int var12 = var6.compareTo(var10);
    java.util.Date var19 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var19.setDate(1);
    java.util.Date var23 = new java.util.Date(10L);
    java.lang.String var24 = var23.toLocaleString();
    int var25 = var19.compareTo(var23);
    int var26 = var10.compareTo(var19);
    int var27 = var10.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.getGreatestMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    var0.setLenient(true);
    java.util.Date var10 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var0.setGregorianChange(var10);
    int var12 = var10.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    int var4 = var0.compareTo((java.util.Calendar)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var0.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    var0.setLenient(true);
    java.util.Date var10 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var0.setGregorianChange(var10);
    java.util.Date var12 = var0.getGregorianChange();
    int var14 = var0.get(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var2 = var0.isSet(0);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.lang.String var2 = var1.toString();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 1, 0, (-1));
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    var0.setLenient(true);
    java.util.Date var10 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var0.setGregorianChange(var10);
    java.util.Date var12 = var0.getGregorianChange();
    var12.setMinutes(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    java.util.TimeZone var1 = var0.getTimeZone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var2 = var0.isSet(0);
    var0.clear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    int var2 = var0.getFirstDayOfWeek();
    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar();
    int var4 = var0.compareTo((java.util.Calendar)var3);
    var3.setFirstDayOfWeek(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var6 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    java.util.Date var13 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var13.setDate(1);
    java.util.Date var17 = new java.util.Date(10L);
    java.lang.String var18 = var17.toLocaleString();
    int var19 = var13.compareTo(var17);
    java.util.Date var26 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var26.setDate(1);
    java.util.Date var30 = new java.util.Date(10L);
    java.lang.String var31 = var30.toLocaleString();
    int var32 = var26.compareTo(var30);
    int var33 = var17.compareTo(var26);
    java.util.GregorianCalendar var34 = new java.util.GregorianCalendar();
    boolean var35 = var34.isLenient();
    var34.setLenient(true);
    java.util.Date var44 = new java.util.Date(1, 10, (-1), 100, 0, 10);
    var34.setGregorianChange(var44);
    boolean var46 = var17.after(var44);
    boolean var47 = var6.after(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 0, 0);
    java.util.Date var4 = var3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    long var2 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1512978925323L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collection var1 = sun.security.tools.KeyTool.loadCRLs("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    boolean var1 = var0.isLenient();
    var0.setLenient(true);
    var0.setLenient(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Date var1 = new java.util.Date(10L);
    java.lang.String var2 = var1.toLocaleString();
    var1.setDate((-1));
    int var5 = var1.getTimezoneOffset();

  }

}
