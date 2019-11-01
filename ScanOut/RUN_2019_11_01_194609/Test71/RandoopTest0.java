
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

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


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getDay();
    java.time.Instant var3 = var1.toInstant();
    int var4 = var1.getTimezoneOffset();
    java.util.Date var6 = new java.util.Date(1L);
    int var7 = var6.getDay();
    boolean var8 = var1.after(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.checkAccess();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    int var1 = var0.getSize();
    sun.net.www.MimeEntry var3 = var0.findByFileName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var1 = new java.util.Date(10L);
    boolean var3 = var1.equals((java.lang.Object)(byte)100);
    java.lang.String var4 = var1.toLocaleString();
    var1.setHours((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "1 Jan, 1970 5:30:00 AM");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    sun.net.www.MimeEntry var5 = var2.remove("hi!");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    int var1 = var0.getSize();
    int var2 = var0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(10L);
    int var2 = var1.getHours();
    java.util.Date var4 = new java.util.Date(10L);
    sun.net.www.MimeTable var5 = sun.net.www.MimeTable.getDefaultTable();
    boolean var6 = var4.equals((java.lang.Object)var5);
    java.time.Instant var7 = var4.toInstant();
    boolean var8 = var1.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var1 = new java.util.Date(1L);
    int var2 = var1.getDay();
    var1.setSeconds(5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var6 = new java.util.Date((-1), 10, 1, 1, 10, 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getMinutes();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    var2.load();
    java.util.Properties var5 = var2.getAsProperties();
    java.util.Date var8 = new java.util.Date(1L);
    int var9 = var8.getDay();
    java.time.Instant var10 = var8.toInstant();
    java.util.Date var11 = java.util.Date.from(var10);
    boolean var12 = var5.remove((java.lang.Object)1, (java.lang.Object)var11);
    java.util.Date var14 = new java.util.Date(10L);
    sun.net.www.MimeTable var15 = sun.net.www.MimeTable.getDefaultTable();
    boolean var16 = var14.equals((java.lang.Object)var15);
    var15.load();
    java.util.Properties var18 = var15.getAsProperties();
    java.util.Date var21 = new java.util.Date(1L);
    int var22 = var21.getDay();
    java.time.Instant var23 = var21.toInstant();
    java.util.Date var24 = java.util.Date.from(var23);
    boolean var25 = var18.remove((java.lang.Object)1, (java.lang.Object)var24);
    var5.putAll((java.util.Map)var18);
    java.util.Properties var27 = new java.util.Properties(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(4, 0, 1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.checkAccess();
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    var2.load();
    java.util.Properties var5 = var2.getAsProperties();
    boolean var7 = var5.containsKey((java.lang.Object)(byte)0);
    java.util.Hashtable var8 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var2 = new java.util.Date(10L);
    sun.net.www.MimeTable var3 = sun.net.www.MimeTable.getDefaultTable();
    boolean var4 = var2.equals((java.lang.Object)var3);
    var3.load();
    java.util.Properties var6 = var3.getAsProperties();
    java.util.Date var9 = new java.util.Date(1L);
    int var10 = var9.getDay();
    java.time.Instant var11 = var9.toInstant();
    java.util.Date var12 = java.util.Date.from(var11);
    boolean var13 = var6.remove((java.lang.Object)1, (java.lang.Object)var12);
    javax.naming.Context var14 = javax.naming.spi.NamingManager.getURLContext("hi!", (java.util.Hashtable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    sun.net.www.MimeEntry var5 = var2.findByFileName("1 Jan, 1970 5:30:00 AM");
    sun.net.www.MimeEntry var7 = var2.findByDescription("1 Jan, 1970 5:30:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    var2.load();
    java.util.Properties var5 = var2.getAsProperties();
    boolean var7 = var5.equals((java.lang.Object)"1 Jan, 1970 5:30:00 AM");
    java.util.Enumeration var8 = var5.propertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.naming.Context var9 = javax.naming.spi.NamingManager.getInitialContext((java.util.Hashtable)var5);
      fail("Expected exception of type javax.naming.NoInitialContextException");
    } catch (javax.naming.NoInitialContextException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var1 = new java.util.Date(10L);
    sun.net.www.MimeTable var2 = sun.net.www.MimeTable.getDefaultTable();
    boolean var3 = var1.equals((java.lang.Object)var2);
    var2.load();
    java.util.Properties var5 = var2.getAsProperties();
    boolean var7 = var5.containsKey((java.lang.Object)(byte)0);
    java.lang.Object var10 = var5.replace((java.lang.Object)1.0f, (java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

}
