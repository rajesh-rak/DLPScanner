
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var6 = java.util.Date.UTC(10, 1, 10, 0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1889993999000L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var1 = var0.clone();
    boolean var2 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.stringPropertyNames();
    java.util.Properties var2 = new java.util.Properties();
    java.lang.Object var3 = var2.clone();
    java.lang.Object var5 = var0.putIfAbsent((java.lang.Object)var2, (java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.stringPropertyNames();
    java.lang.Object var3 = var0.get((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getSeconds();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getTimezoneOffset();
    java.lang.String var2 = var0.toGMTString();
    int var3 = var0.getMinutes();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    long var6 = java.util.Date.UTC(45, 45, 51, 51, 0, 51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-666133149000L));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.lang.String var2 = var0.getContentTypeFor("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    int var3 = var0.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    boolean var5 = var0.replace((java.lang.Object)(-1L), (java.lang.Object)"hi!", (java.lang.Object)1L);
    boolean var7 = var0.containsKey((java.lang.Object)(short)10);
    boolean var9 = var0.containsValue((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getYear();

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Set var1 = var0.stringPropertyNames();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Properties var1 = var0.getAsProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    java.util.Date var3 = new java.util.Date();
    java.lang.String var4 = var3.toString();
    int var5 = var0.compareTo(var3);
    var0.setMinutes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    boolean var5 = var0.replace((java.lang.Object)(-1L), (java.lang.Object)"hi!", (java.lang.Object)1L);
    java.util.Set var6 = var0.stringPropertyNames();
    java.util.logging.Logger var9 = java.util.logging.Logger.getLogger("hi!");
    var9.warning("hi!");
    var9.fine("Fri Nov 01 19:51:45 IST 2019");
    java.lang.Object var14 = var0.put((java.lang.Object)1.0f, (java.lang.Object)"Fri Nov 01 19:51:45 IST 2019");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    int var3 = var0.getMinutes();
    var0.setTime((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.find("hi!");
    java.util.Properties var3 = var0.getAsProperties();
    sun.net.www.MimeEntry var5 = var0.findByFileName("1 Nov 2019 14:21:45 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    int var3 = var0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getTimezoneOffset();
    int var2 = var0.getMinutes();
    java.util.Date var3 = new java.util.Date();
    boolean var4 = var0.before(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var6 = java.util.Date.UTC(119, (-1), 119, 51, 100, 45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1554007245000L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.exiting("hi!", "hi!", (java.lang.Object)1);
    var1.severe("1 Nov 2019 14:21:45 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var0 = new java.util.Date();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    int var3 = var0.getMinutes();
    var0.setTime(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    java.util.Hashtable var3 = new java.util.Hashtable(119);
    java.lang.Object var4 = var0.get((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Properties var0 = new java.util.Properties();
    var0.clear();
    boolean var5 = var0.replace((java.lang.Object)(-1L), (java.lang.Object)"hi!", (java.lang.Object)1L);
    boolean var7 = var0.containsKey((java.lang.Object)(short)10);
    java.util.Properties var9 = new java.util.Properties();
    java.util.Set var10 = var9.stringPropertyNames();
    java.lang.Object var11 = var0.getOrDefault((java.lang.Object)true, (java.lang.Object)var10);
    boolean var13 = var0.equals((java.lang.Object)'a');
    boolean var15 = var0.equals((java.lang.Object)119);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

}
