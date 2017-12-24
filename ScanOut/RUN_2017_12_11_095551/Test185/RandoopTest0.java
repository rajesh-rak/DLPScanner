
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collection var1 = sun.security.tools.KeyTool.loadCRLs("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    char[] var2 = sun.security.tools.KeyTool.getPassWithModifier("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    long var7 = var6.getTime();
    java.lang.Object var8 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    long var1 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1512978943644L);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    long var7 = var6.getTime();
    var6.setDate(1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(1);
    boolean var2 = var1.isEmpty();
    java.util.Vector var4 = new java.util.Vector(1);
    boolean var5 = var4.isEmpty();
    boolean var6 = var1.removeAll((java.util.Collection)var4);
    java.util.Date var13 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    var13.setYear(1);
    int var16 = var1.lastIndexOf((java.lang.Object)var13);
    long var17 = var13.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(100, 10, 0, 0, 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(1);
    boolean var2 = var1.isEmpty();
    java.util.Vector var4 = new java.util.Vector(1);
    boolean var5 = var4.isEmpty();
    boolean var6 = var1.removeAll((java.util.Collection)var4);
    java.util.Date var13 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    var13.setYear(1);
    int var16 = var1.lastIndexOf((java.lang.Object)var13);
    java.util.Date var23 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    var23.setMinutes(10);
    java.util.Date var32 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    long var33 = var32.getTime();
    java.util.Date var35 = new java.util.Date(10L);
    int var36 = var35.getDate();
    boolean var37 = var32.after(var35);
    boolean var38 = var23.after(var32);
    int var39 = var1.lastIndexOf((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(9, 9);
    var0.setMinimalDaysInFirstWeek((-1));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(1);
    boolean var2 = var1.isEmpty();
    java.util.Vector var4 = new java.util.Vector(1);
    boolean var5 = var4.isEmpty();
    boolean var6 = var1.removeAll((java.util.Collection)var4);
    java.util.Vector var8 = new java.util.Vector(1);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var4.removeAll((java.util.Collection)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    long var7 = var6.getTime();
    java.util.Date var9 = new java.util.Date(10L);
    int var10 = var9.getDate();
    boolean var11 = var6.after(var9);
    java.util.Date var13 = new java.util.Date(10L);
    int var14 = var9.compareTo(var13);
    java.lang.String var15 = var9.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.get(1);
    java.util.Date var3 = var0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    long var7 = var6.getTime();
    java.util.Date var9 = new java.util.Date(10L);
    int var10 = var9.getDate();
    boolean var11 = var6.after(var9);
    int var12 = var6.getHours();
    long var13 = var6.getTime();
    var6.setHours(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 1, 10, (-1), 1);
    var6.setMinutes(10);
    var6.setMinutes((-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.rmi.server.RMIFailureHandler var0 = java.rmi.server.RMISocketFactory.getFailureHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(1);
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var4 = new java.util.Vector(1);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    java.lang.Object[] var8 = new java.lang.Object[] { (byte)(-1)};
    java.lang.Object[] var9 = var4.toArray(var8);
    java.lang.Object[] var10 = var1.toArray(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.elementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    char[] var2 = sun.security.tools.KeyTool.getPassWithModifier("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(9, 9);
    var0.set(100, 100, 1, (-1), 10, 10);
    java.util.Date var11 = var0.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
