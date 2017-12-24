
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var1.getHours();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    var1.setYear(1);
    java.lang.String var4 = var1.toLocaleString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMinutes((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1 Jan, 1901 5:30:00 AM"+ "'", var4.equals("1 Jan, 1901 5:30:00 AM"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    var1.setYear(1);
    java.lang.String var4 = var1.toLocaleString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var1.getHours();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1 Jan, 1901 5:30:00 AM"+ "'", var4.equals("1 Jan, 1901 5:30:00 AM"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    var1.setYear(1);
    java.lang.String var4 = var1.toLocaleString();
    long var5 = var1.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "1 Jan, 1901 5:30:00 AM"+ "'", var4.equals("1 Jan, 1901 5:30:00 AM"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2177454200000L));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-2177454200000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.sql.Date var1 = java.sql.Date.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    int var4 = var3.getTimezoneOffset();
    boolean var6 = var3.equals((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    sun.util.calendar.Era var2 = var0.getEra("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    var1.setYear(1);
    int var4 = var1.getYear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var1.getMinutes();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    var3.setSeconds((-1));
    int var6 = var3.getDay();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.sql.Date var1 = new java.sql.Date((-2177454200000L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setMinutes(6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    var3.setSeconds((-1));
    int var6 = var3.getYear();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var0 = new java.util.Date();
    var0.setMinutes(1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    com.sun.crypto.provider.JceKeyStore var1 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { (byte)0, (byte)0};
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var1.engineSetKeyEntry("", var5, var6);
    java.lang.Object var8 = var0.remove((java.lang.Object)var6);
    java.util.Hashtable var9 = new java.util.Hashtable();
    com.sun.crypto.provider.JceKeyStore var10 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var14 = new byte[] { (byte)0, (byte)0};
    java.security.cert.Certificate[] var15 = new java.security.cert.Certificate[] { };
    var10.engineSetKeyEntry("", var14, var15);
    java.lang.Object var17 = var9.remove((java.lang.Object)var15);
    java.util.Enumeration var18 = var9.elements();
    boolean var19 = var0.containsValue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var1 = var0.getWeekLength();
    int var2 = var0.getWeekLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.sql.Date var1 = new java.sql.Date((-1L));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    var1.setYear(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSeconds(7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    int var4 = var3.getTimezoneOffset();
    var3.setDate((-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.sql.Date var1 = new java.sql.Date(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var1.getSeconds();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    long var6 = java.util.Date.UTC((-1), (-1), 10, 100, 100, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2242059597000L));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(0, 1, 1);
    var3.setSeconds((-1));
    var3.setDate(6);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date(10, 1, 10, 10, 1, (-353));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDay();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var4 = new byte[] { (byte)0, (byte)0};
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var4, var5);
    java.security.cert.Certificate var8 = var0.engineGetCertificate("1 Jan, 1901 5:30:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    com.sun.crypto.provider.JceKeyStore var1 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var5 = new byte[] { (byte)0, (byte)0};
    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    var1.engineSetKeyEntry("", var5, var6);
    java.lang.Object var8 = var0.remove((java.lang.Object)var6);
    java.util.Enumeration var9 = var0.elements();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.setProperty("{}", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
