
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setSeconds(10);
    int var4 = var1.getDate();
    java.lang.String var5 = var1.toString();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var1 = new java.util.Date(1L);
    boolean var3 = var1.equals((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setSeconds(10);
    int var4 = var1.getDate();
    var1.setSeconds(1);
    var1.setMinutes(1);
    boolean var10 = var1.equals((java.lang.Object)"hi!");
    int var11 = var1.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setSeconds(10);
    int var4 = var1.getDate();
    var1.setSeconds(1);
    int var7 = var1.getDay();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.lang.Object var4 = var0.put((java.lang.Object)1.0f, (java.lang.Object)1.0f);
    java.lang.Object var6 = var0.remove((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 10);
    boolean var5 = var3.before((java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var3.getMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    long var6 = java.util.Date.UTC(1, (-1), 0, 10, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2180181659000L));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 100, 100, 0, 1, (-1));
    long var7 = var6.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-61769712541000L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    boolean var3 = var0.contains((java.lang.Object)10L);
    java.util.Hashtable var4 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Properties var5 = new java.util.Properties();
    var5.clear();
    java.lang.Object var9 = var5.put((java.lang.Object)1.0f, (java.lang.Object)1.0f);
    var0.putAll((java.util.Map)var5);
    java.lang.Object var11 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 100, 100, 0, 1, (-1));
    var6.setTimeInMillis(100L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 10);
    boolean var5 = var3.before((java.lang.Object)0);
    int var6 = var3.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.lang.Object var4 = var0.put((java.lang.Object)1.0f, (java.lang.Object)1.0f);
    java.util.Properties var5 = new java.util.Properties();
    var5.clear();
    boolean var8 = var5.contains((java.lang.Object)10L);
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var5);
    var0.putAll((java.util.Map)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Enumeration var11 = var0.propertyNames();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 100, 100, 0, 1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setWeekDate((-1), 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 100, 100, 0, 1, (-1));
    var6.setTimeInMillis((-1L));
    boolean var10 = var6.before((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setSeconds(10);
    int var4 = var1.getDate();
    var1.setSeconds(1);
    long var7 = var1.getTime();
    java.util.Date var9 = new java.util.Date(1L);
    java.lang.String var10 = var9.toString();
    boolean var11 = var1.after(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(4, 100, 100, 0, 1, (-1));
    java.util.Properties var7 = new java.util.Properties();
    var7.clear();
    boolean var9 = var6.before((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 10);
    var3.setMinimalDaysInFirstWeek(0);
    var3.roll(4, 4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 10);
    java.lang.Object var4 = var3.clone();
    var3.set((-1), 1, 1);
    java.util.Date var9 = var3.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setSeconds(10);
    java.lang.String var4 = var1.toLocaleString();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar(100, (-1), 10);
    boolean var5 = var3.before((java.lang.Object)0);
    java.util.Date var6 = var3.getGregorianChange();
    int var7 = var6.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-330));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    long var6 = java.util.Date.UTC((-1), 10, (-330), (-330), 10, (-330));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2244045330000L));

  }

}
