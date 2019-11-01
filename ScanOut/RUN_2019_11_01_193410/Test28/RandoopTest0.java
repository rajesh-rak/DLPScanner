
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.remove((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 100, 1, 100);
    int var6 = var5.getYear();
    int var7 = var5.getHours();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.equals((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.remove((java.lang.Object)(-1.0f));
    java.util.Properties var4 = new java.util.Properties();
    java.util.Collection var5 = var4.values();
    boolean var6 = var0.remove((java.lang.Object)true, (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Date var6 = new java.util.Date(1, 0, 1, 1, (-1), 2);
    int var7 = var6.getYear();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var1 = new java.util.Date(0L);
    int var2 = var1.getHours();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var6 = new java.util.Date(1, 0, 1, 1, (-1), 2);
    var6.setYear(10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var4 = var0.replace((java.lang.Object)(byte)100, (java.lang.Object)100, (java.lang.Object)1L);
    boolean var6 = var0.equals((java.lang.Object)"1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.setUseParentHandlers(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var5 = new java.util.Date((-1), 10, 100, 1, 100);
    int var6 = var5.getYear();
    java.util.Date var8 = new java.util.Date(0L);
    boolean var9 = var5.before(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var4 = var0.replace((java.lang.Object)(byte)100, (java.lang.Object)100, (java.lang.Object)1L);
    java.lang.Object var7 = var0.put((java.lang.Object)0L, (java.lang.Object)100.0f);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var6 = new java.util.Date(0, 0, 1, 1, 10, 10);
    java.util.Date var8 = new java.util.Date(0L);
    java.lang.String var9 = var8.toLocaleString();
    java.lang.String var10 = var8.toGMTString();
    boolean var11 = var6.after(var8);
    java.lang.String var12 = var6.toGMTString();
    int var13 = var6.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var3 = var2.getLevel();
    boolean var4 = var2.getUseParentHandlers();
    boolean var5 = var0.containsValue((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var2 = var0.getProperty("1 Jan, 1970 5:30:00 AM");
    java.util.Set var3 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Logger var1 = var0.getParent();
    var0.entering("1 Jan 1970 00:00:00 GMT", "1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var2 = var0.getProperty("1 Jan, 1970 5:30:00 AM");
    boolean var4 = var0.containsKey((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date(0, 0, 1, 1, 10, 10);
    java.util.Date var8 = new java.util.Date(0L);
    java.lang.String var9 = var8.toLocaleString();
    java.lang.String var10 = var8.toGMTString();
    boolean var11 = var6.after(var8);
    int var12 = var8.getDate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var6 = new java.util.Date(0, 0, 1, 1, 10, 10);
    java.time.Instant var7 = var6.toInstant();
    int var8 = var6.getDate();
    int var9 = var6.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var1 = var0.getLevel();
    boolean var2 = var0.getUseParentHandlers();
    java.util.ResourceBundle var3 = var0.getResourceBundle();
    java.lang.String var4 = var0.getResourceBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.entrySet();
    java.util.Properties var2 = new java.util.Properties();
    java.lang.Object var4 = var2.remove((java.lang.Object)(-1.0f));
    boolean var8 = var2.replace((java.lang.Object)'#', (java.lang.Object)"hi!", (java.lang.Object)100.0d);
    java.util.Set var9 = var2.entrySet();
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    java.util.logging.Level var11 = var10.getLevel();
    boolean var12 = var10.getUseParentHandlers();
    boolean var13 = var0.remove((java.lang.Object)var2, (java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.remove((java.lang.Object)(-1.0f));
    java.lang.String var4 = var0.getProperty("");
    java.util.Properties var5 = new java.util.Properties();
    java.util.Collection var6 = var5.values();
    boolean var7 = var0.contains((java.lang.Object)var5);
    java.util.Enumeration var8 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
