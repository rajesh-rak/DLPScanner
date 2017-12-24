
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String[] var0 = sun.util.calendar.ZoneInfo.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
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
      boolean var1 = sun.misc.VMSupport.isClassPathAttributePresent("");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    byte[] var0 = sun.misc.VMSupport.serializePropertiesToByteArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    var0.clear();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.VMSupport var0 = new sun.misc.VMSupport();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var0 = sun.misc.VMSupport.getVMTemporaryDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var0.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Collection var1 = var0.values();
    boolean var2 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    byte[] var0 = sun.misc.VMSupport.serializeAgentPropertiesToByteArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var5 = new java.util.Date(0, 1, 10, 10, 1);
    int var6 = var5.getDay();
    int var7 = var5.getHours();
    java.lang.String var8 = var5.toGMTString();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date("10 Feb 1900 04:07:40 GMT");

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var3 = var0.put((java.lang.Object)(byte)0, (java.lang.Object)(short)1);
    java.util.Enumeration var4 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    java.util.Date var6 = new java.util.Date(100, 0, (-1));
    var6.setMinutes(100);
    boolean var9 = var2.inDaylightTime(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = var2.getOffset(1, (-1), 1, 100, 1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.entrySet();
    java.lang.Object var3 = var0.remove((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    java.util.Date var6 = new java.util.Date(100, 0, (-1));
    var6.setMinutes(100);
    boolean var9 = var2.inDaylightTime(var6);
    boolean var10 = var2.useDaylightTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var5 = new java.util.Date(0, 1, 10, 10, 1);
    int var6 = var5.getDay();
    boolean var8 = var5.equals((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(0, "hi!");
    java.util.TimeZone.setDefault((java.util.TimeZone)var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();
    java.util.Enumeration var1 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.get("{}");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone(0, "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/", (-1), 6, (-1), 10, 6, 2, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date(10, 6, 0);
    java.lang.String var4 = var3.toString();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date(10, 6, 0);
    java.util.Date var9 = new java.util.Date(0, 1, 10, 10, 1);
    boolean var10 = var3.after(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var5 = new java.util.Date(0, 1, 10, 10, 1);
    int var6 = var5.getHours();
    java.util.Date var12 = new java.util.Date(0, 1, 10, 10, 1);
    int var13 = var12.getDay();
    int var14 = var12.getHours();
    long var15 = var12.getTime();
    java.lang.Object var16 = var12.clone();
    boolean var17 = var5.before(var12);
    java.util.Date var23 = new java.util.Date(0, 1, 10, 10, 1);
    int var24 = var23.getHours();
    int var25 = var12.compareTo(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.String var1 = var0.toString();
    java.util.Date var7 = new java.util.Date(0, 1, 10, 10, 1);
    int var8 = var7.getHours();
    java.lang.Object var9 = var0.get((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var5 = new java.util.Date(0, 1, 10, 10, 1);
    int var6 = var5.getDay();
    int var7 = var5.getMinutes();
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.SimpleTimeZone var2 = new java.util.SimpleTimeZone(6, "");

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var5 = new java.util.Date(0, 1, 10, 10, 1);
    int var6 = var5.getHours();
    java.util.Date var12 = new java.util.Date(0, 1, 10, 10, 1);
    int var13 = var12.getDay();
    int var14 = var12.getHours();
    long var15 = var12.getTime();
    java.lang.Object var16 = var12.clone();
    boolean var17 = var5.before(var12);
    java.lang.String var18 = var5.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

}
