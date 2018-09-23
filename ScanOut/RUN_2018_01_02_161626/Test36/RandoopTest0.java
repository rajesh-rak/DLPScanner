
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var5 = new java.util.Date(0, 100, 1, 1, 100);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(0, 100, 1, 1, 100);
    var5.setYear(1);
    int var8 = var5.getHours();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    int var9 = var3.getActualMaximum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var5 = new java.util.Date(0, 100, 1, 1, 100);
    var5.setMonth(1);
    int var8 = var5.getSeconds();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date(10L);
    var1.setTime((-1L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var3.getWeeksInWeekYear();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    java.util.GregorianCalendar var7 = new java.util.GregorianCalendar(0, 1, 1);
    var7.set(10, 10, 1);
    java.util.Hashtable var12 = new java.util.Hashtable();
    java.util.Set var13 = var12.keySet();
    boolean var14 = var7.after((java.lang.Object)var13);
    int var15 = var3.compareTo((java.util.Calendar)var7);
    java.util.Date var16 = var7.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    java.util.Hashtable var8 = new java.util.Hashtable();
    java.util.Set var9 = var8.keySet();
    boolean var10 = var3.after((java.lang.Object)var9);
    int var11 = var3.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    java.util.Date var13 = new java.util.Date(0, 100, 1, 1, 100);
    var13.setMonth(1);
    var3.setTime(var13);
    var3.set(10, (-353));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    int var1 = var0.size();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    boolean var8 = var3.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date(1, 1, (-353));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    java.util.GregorianCalendar var7 = new java.util.GregorianCalendar(0, 1, 1);
    var7.set(10, 10, 1);
    java.util.Hashtable var12 = new java.util.Hashtable();
    java.util.Set var13 = var12.keySet();
    boolean var14 = var7.after((java.lang.Object)var13);
    int var15 = var3.compareTo((java.util.Calendar)var7);
    var7.roll(1, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(0, 100, 1, 1, 100);
    int var6 = var5.getTimezoneOffset();
    var5.setHours(10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    java.util.GregorianCalendar var7 = new java.util.GregorianCalendar(0, 1, 1);
    var7.set(10, 10, 1);
    java.util.Hashtable var12 = new java.util.Hashtable();
    java.util.Set var13 = var12.keySet();
    boolean var14 = var7.after((java.lang.Object)var13);
    int var15 = var3.compareTo((java.util.Calendar)var7);
    var3.setMinimalDaysInFirstWeek((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(0, 100, 1, 1, 100);
    var5.setYear(1);
    boolean var9 = var5.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    long var6 = java.util.Date.UTC(100, 100, (-1), 11, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1209466801000L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    java.util.Hashtable var8 = new java.util.Hashtable();
    java.util.Set var9 = var8.keySet();
    boolean var10 = var3.after((java.lang.Object)var9);
    java.util.TimeZone var11 = var3.getTimeZone();
    int var12 = var3.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    int var1 = var0.getTransletIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 1);
    var3.setLenient(false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();
    int var2 = var0.size();
    boolean var4 = var0.containsKey((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.util.Date var8 = new java.util.Date(0, 100, 1, 1, 100);
    var8.setMonth(1);
    boolean var11 = var2.containsValue((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(0, 1, 1);
    var3.set(10, 10, 1);
    java.util.Date var13 = new java.util.Date(0, 100, 1, 1, 100);
    var13.setMonth(1);
    var3.setTime(var13);
    var13.setMonth(1);
    java.util.Date var24 = new java.util.Date(0, 100, 1, 1, 100);
    var24.setDate((-1));
    boolean var27 = var13.before(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 1);
    var3.clear();
    int var6 = var3.getLeastMaximum(10);
    int var8 = var3.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1970);

  }

}
