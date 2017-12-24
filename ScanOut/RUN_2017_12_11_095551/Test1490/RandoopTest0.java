
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    var6.setFirstDayOfWeek(10);
    var6.setFirstDayOfWeek(10);
    int var15 = var6.getLeastMaximum(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 292269054);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    var6.setFirstDayOfWeek((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.add(292269054, 292269054);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.util.Set var2 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    var6.setFirstDayOfWeek(10);
    var6.clear();
    int var13 = var6.getFirstDayOfWeek();
    var6.set(10, 1, 10, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var2 = new java.util.HashMap(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.lang.annotation.Annotation[] var3 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    java.lang.annotation.Annotation[] var4 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.HashMap var1 = new java.util.HashMap(1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    boolean var11 = var6.isLeapYear(1);
    int var13 = var6.getGreatestMinimum(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var4 = var3.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    boolean var11 = var6.isLeapYear(1);
    int var13 = var6.getActualMaximum(1);
    boolean var15 = var6.isSet(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 292269054);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    boolean var11 = var6.isLeapYear(1);
    int var13 = var6.getActualMaximum(1);
    java.util.GregorianCalendar var20 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var21 = var20.isLenient();
    boolean var23 = var20.isSet(0);
    var20.setFirstDayOfWeek(10);
    var20.clear();
    int var28 = var20.getLeastMaximum(10);
    int var29 = var6.compareTo((java.util.Calendar)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 292269054);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.Object var6 = var3.put((java.lang.Object)0, (java.lang.Object)292269054);
    java.lang.Object var9 = var3.put((java.lang.Object)292269054, (java.lang.Object)100);
    java.util.Set var10 = var3.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date(10, 100, 11, 100, 0, 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.Object var6 = var3.put((java.lang.Object)0, (java.lang.Object)292269054);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{0=292269054}"+ "'", var7.equals("{0=292269054}"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var6 = java.util.Date.UTC((-1), 1, 0, 1, 3, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2237929021000L));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.getLeastMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(1, (-1), 1, 10, (-1), 1);
    boolean var7 = var6.isLenient();
    boolean var9 = var6.isSet(0);
    var6.setFirstDayOfWeek(10);
    var6.setFirstDayOfWeek(10);
    int var14 = var6.getMinimalDaysInFirstWeek();
    int var15 = var6.getFirstDayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.Object var6 = var3.put((java.lang.Object)0, (java.lang.Object)292269054);
    java.lang.Object var9 = var3.put((java.lang.Object)292269054, (java.lang.Object)100);
    java.util.HashMap var11 = new java.util.HashMap(10);
    java.lang.Object var12 = var11.clone();
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var11);
    var3.putAll((java.util.Map)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    boolean var3 = var1.equals((java.lang.Object)0.0f);
    java.util.Collection var4 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.security.CodeSigner[] var2 = new java.security.CodeSigner[] { };
    java.security.CodeSource var3 = new java.security.CodeSource(var1, var2);
    java.net.URL var5 = java.lang.ClassLoader.getSystemResource("hi!");
    java.security.CodeSigner[] var6 = new java.security.CodeSigner[] { };
    java.security.CodeSource var7 = new java.security.CodeSource(var5, var6);
    boolean var8 = var3.implies(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(1, 11, 3, 292269054, 100);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.HashMap var1 = new java.util.HashMap(10);
    java.lang.Object var2 = var1.clone();
    java.util.HashMap var4 = new java.util.HashMap(10);
    java.lang.Object var5 = var4.clone();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var4);
    boolean var7 = var1.containsValue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

}
