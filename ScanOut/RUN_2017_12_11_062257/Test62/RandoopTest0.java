
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    int var3 = var2.getDSTSavings();
    var2.setID("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "", 1, (-1), 10, (-1), (-1), 1, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var2.getOffset((-1), 0, 10, 10, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.TimeZone var1 = sun.util.calendar.ZoneInfo.getTimeZone("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    int var3 = var2.getDSTSavings();
    java.lang.String var4 = var2.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "GMT+00:00"+ "'", var4.equals("GMT+00:00"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getDisplayName(true, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(10, 1, 10);
    java.util.Date var7 = new java.util.Date(10, 1, 10);
    boolean var8 = var3.before(var7);
    int var9 = var3.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var6 = new java.util.Date(100, 100, 0, 1, 1, 100);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    int var3 = var2.getDSTSavings();
    var2.setID("hi!");
    var2.setRawOffset(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var3 = new java.util.Date(10, 1, 10);
    long var4 = var3.getTime();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("GMT+00:00");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var2);
    boolean var7 = var2.isEmpty();
    boolean var8 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date(1, 10, 10, 1, 0, (-1));
    var6.setDate(10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "", 1, 10, 0, 100, (-1), 0, 0, 0, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Hashtable var9 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var12 = var9.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    boolean var13 = var2.containsValue((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    var0.engineDeleteEntry("");
    java.util.Enumeration var3 = var0.engineAliases();
    var0.engineDeleteEntry("");
    boolean var7 = var0.engineContainsAlias("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var2);
    java.lang.Object var7 = var2.clone();
    java.util.Hashtable var10 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var13 = var10.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    boolean var14 = var2.containsValue((java.lang.Object)(byte)(-1));
    java.lang.Object var16 = var2.get((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date(1, 10, 10, 1, 0, (-1));
    java.util.Date var10 = new java.util.Date(100, (-1), 100);
    int var11 = var6.compareTo(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(100L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsKeyEntry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var5 = var2.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Hashtable var9 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var12 = var9.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var9);
    var6.putAll((java.util.Map)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var2 = new sun.util.calendar.ZoneInfo("", 1);
    int var3 = var2.getDSTSavings();
    var2.setID("hi!");
    int var7 = var2.getOffset((-1L));
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.util.Hashtable var3 = new java.util.Hashtable(100, 1.0f);
    java.lang.Object var6 = var3.put((java.lang.Object)'#', (java.lang.Object)(byte)(-1));
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var3);
    java.lang.Object var8 = var3.clone();
    boolean var9 = var0.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("hi!");
    java.util.TimeZone.setDefault(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
