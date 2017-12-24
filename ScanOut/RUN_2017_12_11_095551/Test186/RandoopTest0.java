
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var6 = java.util.Date.UTC((-1), 100, 52, 0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1973370001000L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setWeekDate(100, 52, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    char[] var2 = sun.security.tools.KeyTool.getPassWithModifier("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setWeekDate(10, 0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1970, 52, 52, (-1), 100);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.util.Set var3 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var9 = var3.after((java.lang.Object)100L);
    boolean var11 = var3.isSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.clear();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    boolean var5 = var3.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var3 = new java.util.Date(1, 1970, 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.annotation.Annotation[] var1 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    java.lang.String var4 = var3.toGMTString();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    java.util.Date var6 = var3.getGregorianChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    var3.setDate(52);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var9 = var3.after((java.lang.Object)100L);
    java.util.Date var13 = new java.util.Date(10, 1970, 52);
    var3.setGregorianChange(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var3.getGreatestMinimum(1970);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var9 = var3.equals((java.lang.Object)'#');
    var3.set(1, 1970, 1970, 10, 0, 100);
    var3.setMinimalDaysInFirstWeek(1970);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var20 = var3.getMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("{}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var9 = var3.equals((java.lang.Object)'#');
    var3.clear(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    java.lang.String var4 = var3.toLocaleString();
    var3.setMonth(100);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var8 = var3.isWeekDateSupported();
    var3.set(52, 10, 1);
    int var14 = var3.get(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var15 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    var3.setTimeInMillis((-1L));
    int var6 = var3.getWeeksInWeekYear();
    int var7 = var3.getWeekYear();
    boolean var8 = var3.isWeekDateSupported();
    boolean var10 = var3.isLeapYear(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, 1, 10);
    int var5 = var3.getGreatestMinimum(1);
    java.util.Date var6 = var3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.util.Enumeration var2 = var0.elements();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    java.util.Hashtable var4 = new java.util.Hashtable();
    java.util.Enumeration var5 = var4.keys();
    boolean var7 = var4.containsValue((java.lang.Object)(byte)100);
    boolean var8 = var3.equals((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var3 = new java.util.Date(10, 1970, 52);
    var3.setSeconds(0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Enumeration var1 = var0.keys();
    java.lang.Object var4 = var0.put((java.lang.Object)(-1.0f), (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
