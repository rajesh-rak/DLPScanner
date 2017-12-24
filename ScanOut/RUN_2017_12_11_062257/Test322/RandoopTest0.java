
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore((-1L), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.JarIndex var0 = new sun.misc.JarIndex();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    int var11 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    int var14 = var13.available();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue var15 = var13.getDerValue();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    int var6 = var5.getSeconds();
    var5.setMinutes(1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    int var14 = var13.available();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.getNull();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var13.getGeneralString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    var5.setTime(100L);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    boolean var12 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)(-1.0f));
    boolean var4 = var0.containsKey((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    var5.setMonth(1);
    int var8 = var5.getYear();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    com.sun.crypto.provider.JceKeyStore var2 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var4 = new byte[] { };
    java.security.cert.Certificate[] var5 = new java.security.cert.Certificate[] { };
    var2.engineSetKeyEntry("hi!", var4, var5);
    byte[] var10 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var11 = new java.security.cert.Certificate[] { };
    var2.engineSetKeyEntry("hi!", var10, var11);
    sun.security.util.DerInputStream var15 = new sun.security.util.DerInputStream(var10, (-1), 0);
    java.security.cert.Certificate[] var16 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var10, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    java.util.Enumeration var5 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    var5.setHours(0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerInputStream var5 = new sun.security.util.DerInputStream(var2);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var1 = var0.clone();
    int var2 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var13.getBMPString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var3 = new java.util.Date(10, 0, 0);
    long var4 = var3.getTime();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var13.getPrintableString();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    var5.setMonth(1);
    var5.setYear(1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    int var6 = var5.getDate();
    boolean var8 = var5.equals((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var2 = new byte[] { };
    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var2, var3);
    byte[] var8 = new byte[] { (byte)(-1), (byte)(-1)};
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("hi!", var8, var9);
    sun.security.util.DerInputStream var13 = new sun.security.util.DerInputStream(var8, (-1), 0);
    int var14 = var13.available();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.util.DerValue[] var17 = var13.getSet((-1), true);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Date var5 = new java.util.Date(10, 0, 10, 10, 1);
    int var6 = var5.getDate();
    java.lang.Object var7 = var5.clone();
    int var8 = var5.getSeconds();
    int var9 = var5.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)(-1.0f));
    int var3 = var0.size();
    java.util.Set var4 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
