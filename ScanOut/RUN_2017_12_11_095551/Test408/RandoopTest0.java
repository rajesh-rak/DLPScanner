
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.spec.AlgorithmParameterSpec var1 = javax.crypto.Cipher.getMaxAllowedParameterSpec("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    int var7 = var6.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-318));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var6 = java.util.Date.UTC(10, 10, 0, 10, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1867240201000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var5.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    boolean var8 = var5.after((java.lang.Object)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.set((-1), (-318));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Collection var2 = var0.values();
    java.util.GregorianCalendar var8 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var9 = var8.getGregorianChange();
    java.lang.Object var10 = var0.remove((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    var6.setYear(1);
    int var9 = var6.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    boolean var8 = var5.after((java.lang.Object)100L);
    var5.set((-318), (-1), (-1));
    var5.set((-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var2 = new java.util.Properties();
    java.util.Properties var3 = new java.util.Properties(var2);
    java.util.Collection var4 = var2.values();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.validator.Validator var5 = sun.security.validator.Validator.getInstance("Fri Oct 15 05:30:00 IST 1582", "hi!", var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    java.lang.String var7 = var6.toString();
    int var8 = var6.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Fri Oct 15 05:30:00 IST 1582"+ "'", var7.equals("Fri Oct 15 05:30:00 IST 1582"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, 0, 0, 0, 10, (-318));
    java.util.GregorianCalendar var12 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.TimeZone var13 = var12.getTimeZone();
    var6.setTimeZone(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Fri Oct 15 05:30:00 IST 1582");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    var5.setTimeInMillis(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var5.getActualMaximum(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties(var0);
    java.util.Collection var2 = var0.values();
    java.util.Enumeration var3 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    int var7 = var5.get(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.TimeZone var6 = var5.getTimeZone();
    var5.roll(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    var6.setYear(1);
    java.util.GregorianCalendar var14 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var15 = var14.getGregorianChange();
    java.util.GregorianCalendar var21 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var22 = var21.getGregorianChange();
    var22.setYear(1);
    boolean var25 = var15.before(var22);
    java.util.GregorianCalendar var31 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var32 = var31.getGregorianChange();
    sun.security.x509.CertificateValidity var33 = new sun.security.x509.CertificateValidity(var15, var32);
    boolean var34 = var6.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var7 = var6.getGregorianChange();
    java.lang.Object var9 = var0.put((java.lang.Object)var6, (java.lang.Object)10);
    java.lang.Object var12 = var0.setProperty("hi!", "Fri Oct 15 05:30:00 IST 1582");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var3 = new java.util.Date((-1), 1, 1);
    var3.setDate((-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var7 = var6.getGregorianChange();
    java.lang.Object var9 = var0.put((java.lang.Object)var6, (java.lang.Object)10);
    java.util.Properties var10 = new java.util.Properties();
    java.util.Properties var11 = new java.util.Properties(var10);
    java.util.Collection var12 = var10.values();
    var0.putAll((java.util.Map)var10);
    java.util.Collection var14 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    boolean var8 = var5.after((java.lang.Object)100L);
    var5.set((-318), (-1), (-1));
    java.util.Date var13 = var5.getTime();
    int var14 = var5.getFirstDayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.GregorianCalendar var6 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var7 = var6.getGregorianChange();
    java.lang.Object var9 = var0.put((java.lang.Object)var6, (java.lang.Object)10);
    boolean var11 = var0.contains((java.lang.Object)15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar(10, (-1), 100, 0, 10);
    java.util.Date var6 = var5.getGregorianChange();
    boolean var8 = var5.after((java.lang.Object)100L);
    boolean var9 = var5.isLenient();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var5.getLeastMaximum(30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    int var1 = sun.util.calendar.BaseCalendar.getDayOfWeekFromFixedDate(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

}
