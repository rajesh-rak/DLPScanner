
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.containsKey((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Set var2 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    java.lang.String var10 = var6.toString();
    var6.setMinutes(1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("Thu Jan 01 05:30:00 IST 1970");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getMaximum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var2 = javax.naming.spi.NamingManager.getInitialContext((java.util.Hashtable)var0);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    java.lang.String var10 = var6.toString();
    java.util.Date var17 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var17.setTime(10L);
    int var20 = var17.getSeconds();
    boolean var21 = var6.before(var17);
    java.lang.Object var22 = var17.clone();
    int var23 = var17.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    boolean var4 = var0.isWeekDateSupported();
    var0.setLenient(false);
    java.lang.Object var7 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    java.lang.String var10 = var6.toString();
    java.util.Date var17 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var17.setTime(10L);
    int var20 = var17.getSeconds();
    boolean var21 = var6.before(var17);
    java.lang.Object var22 = var17.clone();
    int var23 = var17.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    int var10 = var6.getMinutes();
    java.lang.Object var11 = var6.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delete("hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    java.lang.String var10 = var6.toString();
    java.util.Date var17 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var17.setTime(10L);
    int var20 = var17.getSeconds();
    boolean var21 = var6.before(var17);
    var6.setMonth(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    java.lang.Object var4 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.roll(100, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(30, 1, 100, 1, 30, (-1));
    int var7 = var6.getMonth();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var1 = new byte[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var2 = new sun.security.x509.X509CertImpl(var1);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

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


    byte[] var2 = new byte[] { (byte)1, (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertImpl var3 = new sun.security.x509.X509CertImpl(var2);
      fail("Expected exception of type java.security.cert.CertificateException");
    } catch (java.security.cert.CertificateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.setProperty("Thu Jan 01 05:30:00 IST 1970", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    int var4 = var0.getMinimalDaysInFirstWeek();
    var0.setLenient(true);
    long var7 = var0.getTimeInMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1481420774918L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    int var4 = var0.getMinimalDaysInFirstWeek();
    int var5 = var0.getWeeksInWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 53);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.setTimeInMillis((-1L));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    java.lang.String var10 = var6.toString();
    java.util.Date var17 = new java.util.Date(30, 1, 100, 1, 30, (-1));
    boolean var18 = var6.before(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.security.x509.CertificateValidity var0 = new sun.security.x509.CertificateValidity();
    java.lang.String var1 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.get("");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var6 = java.util.Date.UTC((-1), 1, (-1), 100, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2237653200000L));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setTime(10L);
    int var9 = var6.getSeconds();
    int var10 = var6.getMinutes();
    int var11 = var6.getTimezoneOffset();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.roll(1, false);
    boolean var4 = var0.isWeekDateSupported();
    var0.setLenient(false);
    boolean var8 = var0.equals((java.lang.Object)0L);
    java.util.Date var9 = var0.getTime();
    var0.set(30, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
