
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var1 = var0.getWeekLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    var6.setMinutes((-1));
    var6.setTime(0L);
    int var11 = var6.getMinutes();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Hashtable var5 = new java.util.Hashtable(1);
    java.lang.Object var6 = var2.put((java.lang.Object)1, (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var7 = var6.toGMTString();
    int var8 = var6.getMonth();
    int var9 = var6.getSeconds();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.lang.Object var4 = var1.put((java.lang.Object)10L, (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    java.util.Enumeration var2 = var1.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var5 = new java.util.Date(7, (-1), 30, (-1), (-1));
    java.lang.String var6 = var5.toString();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    boolean var3 = var1.containsKey((java.lang.Object)(-1.0f));
    java.lang.Object var5 = var1.get((java.lang.Object)"1 Aug, 1901 6:59:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var7 = var6.toGMTString();
    int var8 = var6.getSeconds();
    int var9 = var6.getHours();
    int var10 = var6.getHours();
    java.util.Date var17 = new java.util.Date(1, 7, 1, 7, 0, 0);
    var17.setMinutes((-1));
    boolean var20 = var6.before(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date(10, (-1), 1);
    var3.setTime((-1L));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    java.util.Date var8 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var9 = var8.toGMTString();
    boolean var10 = var1.contains((java.lang.Object)var8);
    boolean var12 = var1.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var7 = var6.toGMTString();
    int var8 = var6.getMonth();
    int var9 = var6.getDay();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(100, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var7 = var6.toGMTString();
    int var8 = var6.getSeconds();
    java.util.Date var15 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var16 = var15.toGMTString();
    int var17 = var15.getMonth();
    boolean var18 = var6.after(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var1 = new java.util.Hashtable(30);
    java.util.Date var8 = new java.util.Date(1, 7, 1, 7, 0, 0);
    java.lang.String var9 = var8.toGMTString();
    boolean var10 = var1.contains((java.lang.Object)var8);
    boolean var12 = var1.containsValue((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Collection var2 = var1.values();
    java.util.Set var3 = var1.keySet();
    java.util.Set var4 = var1.entrySet();
    java.util.Collection var5 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date(1, 7, 1, 7, 0, 0);
    var6.setMinutes((-1));
    java.lang.String var9 = var6.toLocaleString();
    java.util.Date var11 = new java.util.Date(10L);
    boolean var12 = var6.before(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var1.getRole("1 Aug, 1901 6:59:00 AM", "1 Aug, 1901 6:59:00 AM");
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(10, (-1), 1);
    int var4 = var3.getDay();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var1 = new java.util.Date(10L);
    int var2 = var1.getYear();

  }

}
