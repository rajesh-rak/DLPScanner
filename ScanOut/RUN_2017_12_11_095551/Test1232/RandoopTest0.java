
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var1 = new java.util.Date((-1L));
    var1.setDate((-1));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    java.lang.Object[] var6 = new java.lang.Object[] { '4'};
    var0.entering("hi!", "", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    boolean var6 = var0.containsValue((java.lang.Object)100.0f);
    boolean var8 = var0.contains((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    int var4 = var3.getTimezoneOffset();
    var3.setSeconds((-330));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.find("");
    var0.load();
    boolean var5 = var0.save("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    java.util.Set var5 = var0.stringPropertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    int var8 = var3.compareTo(var7);
    java.lang.String var9 = var3.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    java.util.Enumeration var2 = var1.elements();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.util.logging.Level var1 = var0.getLevel();
    java.util.logging.Level var2 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var1 = new java.util.Date(10L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.find("");
    var0.load();
    sun.net.www.MimeEntry var5 = var0.find("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    boolean var6 = var0.containsValue((java.lang.Object)100.0f);
    java.util.Set var7 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    boolean var6 = var0.containsValue((java.lang.Object)100.0f);
    java.util.Date var11 = new java.util.Date((-1), (-1), 10);
    java.util.Date var15 = new java.util.Date((-1), (-1), 10);
    int var16 = var11.compareTo(var15);
    java.lang.Object var17 = var0.put((java.lang.Object)(short)0, (java.lang.Object)var15);
    long var18 = var15.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Hashtable var1 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var0);
    java.util.Date var3 = new java.util.Date((-1L));
    java.lang.Object var4 = var0.remove((java.lang.Object)(-1L));
    java.util.Properties var5 = new java.util.Properties();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment((java.util.Hashtable)var5);
    var0.putAll((java.util.Map)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    boolean var6 = var0.containsValue((java.lang.Object)100.0f);
    java.lang.Object var9 = var0.setProperty("hi!", "10 Dec, 1898 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    java.lang.Object var6 = var0.remove((java.lang.Object)true);
    java.util.Set var7 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    int var8 = var3.compareTo(var7);
    int var9 = var3.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var3 = var0.getProperty("", "hi!");
    int var4 = var0.size();
    boolean var6 = var0.containsValue((java.lang.Object)100.0f);
    java.util.Date var11 = new java.util.Date((-1), (-1), 10);
    java.util.Date var15 = new java.util.Date((-1), (-1), 10);
    int var16 = var11.compareTo(var15);
    java.lang.Object var17 = var0.put((java.lang.Object)(short)0, (java.lang.Object)var15);
    java.util.logging.Logger var18 = java.util.logging.Logger.getGlobal();
    boolean var19 = var0.containsKey((java.lang.Object)var18);
    java.util.Properties var20 = new java.util.Properties();
    java.lang.String var23 = var20.getProperty("", "hi!");
    int var24 = var20.size();
    java.lang.Object var26 = var20.remove((java.lang.Object)true);
    java.lang.Object var27 = var0.get((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var3 = new java.util.Date((-1), (-1), 10);
    java.util.Date var7 = new java.util.Date((-1), (-1), 10);
    int var8 = var3.compareTo(var7);
    int var9 = var7.getMinutes();
    java.util.Date var13 = new java.util.Date((-1), (-1), 10);
    int var14 = var13.getTimezoneOffset();
    int var15 = var7.compareTo(var13);
    var7.setSeconds(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.findByFileName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var0 = new java.util.Date();

  }

}
