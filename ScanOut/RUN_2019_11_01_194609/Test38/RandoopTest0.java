
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    int var7 = var6.getMonth();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var3 = new java.util.Date(0, 10, 1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var3 = var0.putIfAbsent((java.lang.Object)"hi!", (java.lang.Object)10);
    boolean var5 = var0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.logging.Logger var2 = var0.getLogger("30 Jan, 1899 10:01:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var7 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    boolean var10 = var0.replace((java.lang.Object)10, (java.lang.Object)'4', (java.lang.Object)var9);
    java.util.Date var17 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    int var18 = var17.getDay();
    java.util.Date var25 = new java.util.Date((-1), 1, (-1), 10, 1, 0);
    java.lang.String var26 = var25.toLocaleString();
    int var27 = var25.getMonth();
    boolean var28 = var17.before(var25);
    java.lang.Object var30 = var0.replace((java.lang.Object)var25, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var2 = var0.get((java.lang.Object)(byte)10);
    boolean var4 = var0.equals((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    java.util.logging.Level var2 = var0.getLevel();
    java.lang.String var3 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    int var7 = var6.getDay();
    var6.setSeconds(100);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    var0.clear();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var2 = var0.remove((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.warning("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var7 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    boolean var10 = var0.replace((java.lang.Object)10, (java.lang.Object)'4', (java.lang.Object)var9);
    java.lang.Object var13 = var0.getOrDefault((java.lang.Object)10L, (java.lang.Object)1.0f);
    java.lang.Object var16 = var0.setProperty("30 Jan, 1899 10:01:00 AM", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1.0f+ "'", var13.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var3 = new java.util.Date(0, 1, 11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var7 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    boolean var10 = var0.replace((java.lang.Object)10, (java.lang.Object)'4', (java.lang.Object)var9);
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    java.util.logging.Level var2 = var0.getLevel();
    var0.exiting("hi!", "", (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var7 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    boolean var10 = var0.replace((java.lang.Object)10, (java.lang.Object)'4', (java.lang.Object)var9);
    java.lang.Object var13 = var0.getOrDefault((java.lang.Object)10L, (java.lang.Object)1.0f);
    java.util.jar.Attributes var14 = new java.util.jar.Attributes();
    java.lang.Object var16 = var14.get((java.lang.Object)(byte)10);
    java.lang.Object var19 = var14.getOrDefault((java.lang.Object)"hi!", (java.lang.Object)(byte)100);
    boolean var20 = var0.contains((java.lang.Object)var14);
    boolean var22 = var14.equals((java.lang.Object)"30 Jan, 1899 10:01:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1.0f+ "'", var13.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (byte)100+ "'", var19.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Date var7 = new java.util.Date(100, (-1), 10, 1, 1, (-1));
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    boolean var10 = var0.replace((java.lang.Object)10, (java.lang.Object)'4', (java.lang.Object)var9);
    java.util.Enumeration var11 = var9.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.logging.Logger var2 = var0.getLogger("hi!");
    var0.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.lang.Object var2 = var0.get((java.lang.Object)(byte)10);
    java.util.Set var3 = var0.entrySet();
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

}
