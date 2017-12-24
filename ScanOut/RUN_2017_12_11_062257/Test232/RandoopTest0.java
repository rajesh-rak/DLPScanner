
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
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
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(10L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(1L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.lang.String var4 = var1.getProperty("Thu Jan 01 05:30:00 IST 1970", "Thu Jan 01 05:30:00 IST 1970");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Thu Jan 01 05:30:00 IST 1970"+ "'", var4.equals("Thu Jan 01 05:30:00 IST 1970"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var1 = new java.util.Date(100L);
    java.util.Properties var2 = new java.util.Properties();
    java.util.Properties var3 = new java.util.Properties(var2);
    java.util.Properties var4 = new java.util.Properties(var3);
    boolean var5 = var1.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Properties var2 = new java.util.Properties();
    java.util.Set var3 = var2.stringPropertyNames();
    java.util.Enumeration var4 = var2.propertyNames();
    java.util.Properties var5 = new java.util.Properties();
    java.util.Properties var6 = new java.util.Properties(var5);
    java.lang.Object var7 = var0.put((java.lang.Object)var4, (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Thu Jan 01 05:30:00 IST 1970");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    long var6 = java.util.Date.UTC(1, 0, 1, 100, (-1), 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2177092855000L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(100L);
    long var2 = var1.getTime();
    java.lang.String var3 = var1.toString();
    java.util.Date var5 = new java.util.Date(100L);
    long var6 = var5.getTime();
    java.lang.String var7 = var5.toString();
    int var8 = var5.getHours();
    boolean var9 = var1.before(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    java.util.Properties var2 = new java.util.Properties(var1);
    java.util.Properties var3 = new java.util.Properties(var2);
    java.lang.Object var4 = var0.remove((java.lang.Object)var3);
    java.util.Enumeration var5 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(100, (-1), 100, 1, (-1), 10);
    var6.setDate((-1));
    java.util.Date var10 = new java.util.Date(100L);
    long var11 = var10.getTime();
    java.lang.String var12 = var10.toString();
    java.lang.String var13 = var10.toLocaleString();
    boolean var14 = var6.before(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.stringPropertyNames();
    java.lang.annotation.Annotation[] var2 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var0);
    int var3 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    long var6 = java.util.Date.UTC(3, 10, 0, 1, 3, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2088197815000L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var3 = new java.util.Date(0, 10, 10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(100L);
    long var2 = var1.getTime();
    java.util.Properties var3 = new java.util.Properties();
    java.util.Set var4 = var3.stringPropertyNames();
    java.util.Enumeration var5 = var3.keys();
    boolean var6 = var1.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var1 = new java.util.Date(100L);
    long var2 = var1.getTime();
    java.lang.String var3 = var1.toString();
    var1.setMonth((-1));
    java.lang.String var6 = var1.toString();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    java.util.Date var3 = var0.engineGetCreationDate("Thu Jan 01 05:30:00 IST 1970");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 5);
    java.util.Properties var4 = new java.util.Properties();
    java.util.Properties var5 = new java.util.Properties(var4);
    java.util.Properties var6 = new java.util.Properties(var5);
    java.util.Properties var7 = new java.util.Properties(var6);
    java.util.Properties var8 = new java.util.Properties();
    java.util.Properties var9 = new java.util.Properties(var8);
    java.util.Properties var10 = new java.util.Properties(var9);
    boolean var11 = var7.containsValue((java.lang.Object)var9);
    boolean var12 = var3.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    long var6 = java.util.Date.UTC(10, 3, 10, 10, 100, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1884860395000L));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Properties var2 = new java.util.Properties(var1);
    var1.clear();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(10, 0, 5);
    var3.setTimeInMillis((-1L));
    var3.clear(0);

  }

}
