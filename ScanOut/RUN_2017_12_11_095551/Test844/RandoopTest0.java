
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfoFile var0 = new sun.util.calendar.ZoneInfoFile();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    int var4 = var1.compareTo(var3);
    java.util.Date var6 = new java.util.Date(1L);
    java.util.Date var8 = new java.util.Date(1L);
    int var9 = var6.compareTo(var8);
    boolean var10 = var3.before(var6);
    var3.setHours(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var1 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getDay();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, 4, 4, 100, 4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("GMT");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Hashtable var3 = new java.util.Hashtable(1, 1.0f);
    java.util.Date var5 = new java.util.Date(1L);
    java.util.Date var7 = new java.util.Date(1L);
    int var8 = var5.compareTo(var7);
    java.lang.String var9 = var5.toGMTString();
    java.lang.Object var10 = var3.get((java.lang.Object)var9);
    java.lang.Object var12 = var0.put((java.lang.Object)var3, (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    java.util.TimeZone var10 = java.util.TimeZone.getTimeZone("");
    java.lang.String var11 = var10.getID();
    var6.setTimeZone(var10);
    java.lang.String var13 = var10.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "GMT"+ "'", var11.equals("GMT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "GMT"+ "'", var13.equals("GMT"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    var6.clear();
    var6.setLenient(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    long var9 = var6.getTimeInMillis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.getMinimum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-62172731999000L));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.util.Date var4 = new java.util.Date(1L);
    java.util.Date var6 = new java.util.Date(1L);
    int var7 = var4.compareTo(var6);
    java.lang.String var8 = var4.toGMTString();
    java.lang.Object var9 = var2.get((java.lang.Object)var8);
    int var10 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var6.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var7 = var6.isWeekDateSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    var6.roll(10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.util.Date var3 = new java.util.Date(1L);
    int var4 = var1.compareTo(var3);
    int var5 = var1.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.util.Date var4 = new java.util.Date(1L);
    java.util.Date var6 = new java.util.Date(1L);
    int var7 = var4.compareTo(var6);
    java.lang.String var8 = var4.toGMTString();
    java.lang.Object var9 = var2.get((java.lang.Object)var8);
    java.util.Map var10 = sun.util.calendar.ZoneInfo.getAliasTable();
    boolean var11 = var2.containsValue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.util.calendar.CalendarSystem var1 = sun.util.calendar.CalendarSystem.forName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar((-1), 10, 0, 10, 10, 1);
    boolean var8 = var6.isSet(1);
    java.util.TimeZone var10 = java.util.TimeZone.getTimeZone("");
    java.lang.String var11 = var10.getID();
    var6.setTimeZone(var10);
    java.util.Formatter var13 = new java.util.Formatter();
    java.util.Locale var14 = var13.locale();
    java.lang.String var15 = var10.getDisplayName(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "GMT"+ "'", var11.equals("GMT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Greenwich Mean Time"+ "'", var15.equals("Greenwich Mean Time"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("GMT", 100);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

}
