
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var3, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    var0.set(10, 1, (-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Calendar var0 = java.util.Calendar.getInstance();
    boolean var1 = var0.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var3.getGreatestMinimum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(100L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 97L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var1 = new java.util.Date((-1L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var2 = var0.getLeastMaximum(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    int var5 = var3.getWeeksInWeekYear();
    java.util.TimeZone var6 = var3.getTimeZone();
    java.util.Calendar var7 = java.util.Calendar.getInstance(var6);
    int var8 = var7.getFirstDayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date((-1), 10, 100, 1, 10, 0);
    var6.setDate(52);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date((-1), 10, 100, 1, 10, 0);
    java.lang.String var7 = var6.toLocaleString();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    java.util.Date var5 = var3.getTime();
    var5.setSeconds((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    int var5 = var3.getWeeksInWeekYear();
    java.util.TimeZone var6 = var3.getTimeZone();
    boolean var7 = var3.isLenient();
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar((-1), 10, 1);
    int var12 = var11.getWeekYear();
    java.util.Date var13 = var11.getTime();
    int var14 = var3.compareTo((java.util.Calendar)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("");
    boolean var4 = var0.engineIsKeyEntry("8 Feb, 1900 1:10:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)52);
    var0.setTime(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    int var5 = var3.getWeeksInWeekYear();
    java.lang.Object var6 = var3.clone();
    var3.clear();
    java.util.GregorianCalendar var11 = new java.util.GregorianCalendar((-1), 10, 1);
    int var12 = var11.getWeekYear();
    int var13 = var11.getWeeksInWeekYear();
    java.lang.Object var14 = var11.clone();
    var11.clear();
    int var16 = var3.compareTo((java.util.Calendar)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.util.Calendar var2 = java.util.Calendar.getInstance();
    java.util.Hashtable var3 = new java.util.Hashtable();
    java.util.Collection var4 = var3.values();
    boolean var5 = var2.after((java.lang.Object)var3);
    var1.putAll((java.util.Map)var3);
    java.util.Enumeration var7 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDate();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("hi!");
    int var3 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)52);
    int var3 = var0.getDate();
    int var4 = var0.getMinutes();
    var0.setMonth(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(52, 52, 11, 52, 52);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    java.util.Date var5 = var3.getTime();
    int var6 = var5.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var3 = new java.util.GregorianCalendar((-1), 10, 1);
    int var4 = var3.getWeekYear();
    int var5 = var3.getWeeksInWeekYear();
    int var6 = var3.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 52);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var2 = new java.util.Hashtable(52, 100.0f);

  }

}
