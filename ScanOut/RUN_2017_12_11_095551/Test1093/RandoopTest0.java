
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var3 = new java.util.Date((-1), 100, 54);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.remove("hi!");

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    var3.setDate(10);
    java.lang.String var6 = var3.toLocaleString();
    java.lang.String var7 = var3.toGMTString();
    var3.setYear(100);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    var3.setDate(10);
    java.lang.String var6 = var3.toLocaleString();
    java.lang.String var7 = var3.toGMTString();
    int var8 = var3.getMonth();
    int var9 = var3.getTimezoneOffset();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    sun.net.www.MimeEntry var3 = var0.find("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toGMTString();
    java.util.Date var9 = new java.util.Date(10, 1, (-1));
    var9.setDate(10);
    int var12 = var9.getTimezoneOffset();
    boolean var13 = var3.after(var9);
    java.lang.Object var14 = var9.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var5 = var0.getAsProperties();
    boolean var7 = var0.save("10 Jan, 1910 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    var3.setTime(100L);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("Sun Jan 30 00:00:00 IST 1910", "10 Jan, 1910 12:00:00 AM");
    boolean var4 = var0.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.finer("hi!");
    java.util.logging.Handler[] var4 = var1.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toGMTString();
    java.lang.String var6 = var3.toGMTString();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var5 = var0.getAsProperties();
    sun.net.www.MimeTable var6 = sun.net.www.MimeTable.getDefaultTable();
    var6.load();
    int var8 = var6.getSize();
    sun.net.www.MimeEntry var10 = var6.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var11 = var6.getAsProperties();
    var5.putAll((java.util.Map)var11);
    java.lang.Object var13 = var11.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var5 = var0.getAsProperties();
    sun.net.www.MimeEntry var7 = var0.remove("hi!");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.info("9 Jan 1910 18:06:40 GMT");
    var0.info("9 Jan 1910 18:06:40 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date(10, 1, (-1));
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toGMTString();
    int var6 = var3.getMinutes();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var5 = var0.getAsProperties();
    java.util.Enumeration var6 = var5.keys();
    boolean var8 = var5.containsKey((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    sun.net.www.MimeEntry var3 = var0.findByFileName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    sun.net.www.MimeEntry var4 = var0.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var5 = var0.getAsProperties();
    sun.net.www.MimeTable var6 = sun.net.www.MimeTable.getDefaultTable();
    var6.load();
    int var8 = var6.getSize();
    sun.net.www.MimeEntry var10 = var6.findByExt("9 Jan 1910 18:06:40 GMT");
    java.util.Properties var11 = var6.getAsProperties();
    var5.putAll((java.util.Map)var11);
    java.lang.Object var13 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var1 = new java.util.Date("10 Jan, 1910 12:00:00 AM");

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var1 = new java.util.Date("9 Jan 1910 18:06:40 GMT");

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("Sun Jan 30 00:00:00 IST 1910", "10 Jan, 1910 12:00:00 AM");
    java.util.logging.Level var4 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    int var2 = var0.getSize();
    java.lang.String var4 = var0.getContentTypeFor("9 Jan 1910 18:06:40 GMT");
    sun.net.www.MimeEntry var6 = var0.findByDescription("29 Jan 1910 18:06:40 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("Sun Jan 30 00:00:00 IST 1910", "10 Jan, 1910 12:00:00 AM");
    java.util.logging.Logger var5 = java.util.logging.Logger.getLogger("29 Jan 1910 18:06:40 GMT");
    var0.setParent(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(100L);

  }

}
