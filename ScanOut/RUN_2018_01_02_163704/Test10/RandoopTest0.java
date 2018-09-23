
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var1 = new java.util.Date((-1L));
    int var2 = var1.getHours();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    int var6 = var5.getMonth();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    int var5 = var1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var1 = java.util.Date.parse("31 Dec 1969 23:59:59 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.containsValue((java.lang.Object)59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    int var5 = var3.getSeconds();
    int var6 = var3.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.lang.String var2 = var1.toGMTString();
    int var3 = var1.getTimezoneOffset();
    int var4 = var1.getDate();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    java.util.Date var7 = new java.util.Date((-1L));
    java.lang.String var8 = var7.toGMTString();
    java.lang.String var9 = var7.toGMTString();
    boolean var10 = var5.before(var7);
    java.util.Date var12 = new java.util.Date((-1L));
    java.util.Date var14 = new java.util.Date((-1L));
    int var15 = var12.compareTo(var14);
    int var16 = var14.getSeconds();
    boolean var17 = var7.after(var14);
    java.lang.String var18 = var14.toGMTString();
    java.util.Date var20 = new java.util.Date((-1L));
    java.util.Date var22 = new java.util.Date((-1L));
    int var23 = var20.compareTo(var22);
    int var24 = var20.getMinutes();
    boolean var25 = var14.after(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getYear();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var2 = var0.getYearFromFixedDate((-1000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    java.lang.Object var5 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.lang.String var2 = var1.toGMTString();
    var1.setMonth((-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    java.util.Date var6 = new java.util.Date((-1L));
    boolean var7 = var3.before(var6);
    java.lang.String var8 = var6.toGMTString();
    java.lang.String var9 = var6.toLocaleString();
    int var10 = var6.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    var5.setSeconds(100);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    java.util.Date var7 = new java.util.Date((-1L));
    java.lang.String var8 = var7.toGMTString();
    java.lang.String var9 = var7.toGMTString();
    boolean var10 = var5.before(var7);
    java.util.Date var12 = new java.util.Date((-1L));
    java.util.Date var14 = new java.util.Date((-1L));
    int var15 = var12.compareTo(var14);
    int var16 = var14.getSeconds();
    boolean var17 = var7.after(var14);
    int var18 = var7.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    var1.clear();
    boolean var4 = var1.equals((java.lang.Object)(byte)100);
    java.lang.Object var6 = var1.get((java.lang.Object)(-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.keys();
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    var1.putAll((java.util.Map)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    var3.setDate((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date((-1L));
    java.util.Date var3 = new java.util.Date((-1L));
    int var4 = var1.compareTo(var3);
    long var5 = var1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.keys();
    java.util.Date var4 = new java.util.Date((-1L));
    java.util.Date var6 = new java.util.Date((-1L));
    int var7 = var4.compareTo(var6);
    java.lang.Object var8 = var1.remove((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    java.util.Date var7 = new java.util.Date((-1L));
    java.lang.String var8 = var7.toGMTString();
    java.lang.String var9 = var7.toGMTString();
    boolean var10 = var5.before(var7);
    java.util.Date var12 = new java.util.Date((-1L));
    java.util.Date var14 = new java.util.Date((-1L));
    int var15 = var12.compareTo(var14);
    int var16 = var14.getSeconds();
    boolean var17 = var7.after(var14);
    java.lang.String var18 = var14.toGMTString();
    java.util.Date var19 = new java.util.Date();
    var19.setYear(1);
    int var22 = var14.compareTo(var19);
    int var23 = var14.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.keys();
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var5 = new java.util.Date(1, 10, 100, 1, 5);
    java.util.Date var7 = new java.util.Date((-1L));
    java.lang.String var8 = var7.toGMTString();
    java.lang.String var9 = var7.toGMTString();
    boolean var10 = var5.before(var7);
    java.util.Date var12 = new java.util.Date((-1L));
    java.util.Date var14 = new java.util.Date((-1L));
    int var15 = var12.compareTo(var14);
    int var16 = var14.getSeconds();
    boolean var17 = var7.after(var14);
    boolean var19 = var7.equals((java.lang.Object)(byte)(-1));
    int var20 = var7.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var5 = new java.util.Date(59, 1, (-2), 100, (-2));

  }

}
