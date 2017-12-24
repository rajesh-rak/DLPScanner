
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date((-1), 1, 10, (-1), 1, 1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    int var9 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Enumeration var9 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var3 = new java.util.Date(1, 10, 10);
    var3.setYear(1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Properties var9 = new java.util.Properties(var0);
    boolean var11 = var9.containsKey((java.lang.Object)true);
    java.util.Set var12 = var9.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("hi!");
    var0.fine("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    int var9 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.String var2 = var0.getProperty("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    boolean var4 = var0.contains((java.lang.Object)'#');
    boolean var6 = var0.equals((java.lang.Object)'#');
    java.util.Enumeration var7 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Properties var9 = new java.util.Properties(var0);
    java.util.Set var10 = var9.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Properties var9 = new java.util.Properties();
    java.lang.Object var11 = var9.get((java.lang.Object)10.0d);
    java.util.Properties var12 = new java.util.Properties();
    java.lang.Object var14 = var12.get((java.lang.Object)10.0d);
    boolean var16 = var12.contains((java.lang.Object)'#');
    java.lang.Object var17 = var9.get((java.lang.Object)var12);
    java.util.Properties var18 = new java.util.Properties(var9);
    boolean var20 = var18.equals((java.lang.Object)1.0d);
    var0.putAll((java.util.Map)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(1, 10, 10);
    java.lang.String var4 = var3.toGMTString();
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.severe("hi!");
    java.util.logging.Handler[] var8 = var5.getHandlers();
    boolean var9 = var3.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.logging.Logger var9 = java.util.logging.Logger.getGlobal();
    java.lang.Object[] var13 = new java.lang.Object[] { 10.0f};
    var9.entering("hi!", "hi!", var13);
    java.lang.Object var15 = var0.get((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    java.lang.Object[] var4 = new java.lang.Object[] { 10.0f};
    var0.entering("hi!", "hi!", var4);
    var0.finer("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.Object var1 = var0.clone();
    java.util.Date var2 = new java.util.Date();
    int var3 = var0.compareTo(var2);
    java.util.Date var7 = new java.util.Date(1, 10, 10);
    java.lang.String var8 = var7.toGMTString();
    int var9 = var2.compareTo(var7);
    java.util.Date var13 = new java.util.Date(1, 10, 10);
    int var14 = var2.compareTo(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Properties var9 = new java.util.Properties(var0);
    java.lang.Object var10 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.severe("hi!");
    java.util.logging.Logger var3 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var0 = new java.util.Date();
    java.lang.Object var1 = var0.clone();
    java.util.Date var2 = new java.util.Date();
    int var3 = var0.compareTo(var2);
    var2.setHours(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("hi!");
    var0.config("9 Nov 1901 18:06:40 GMT");
    java.util.logging.Filter var5 = var0.getFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.severe("hi!");
    java.util.logging.Handler[] var3 = var0.getHandlers();
    java.util.logging.Logger var4 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("9 Nov 1901 18:06:40 GMT", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.util.Properties var3 = new java.util.Properties();
    java.lang.Object var5 = var3.get((java.lang.Object)10.0d);
    boolean var7 = var3.contains((java.lang.Object)'#');
    java.lang.Object var8 = var0.get((java.lang.Object)var3);
    java.util.Properties var9 = new java.util.Properties(var0);
    boolean var11 = var9.containsKey((java.lang.Object)true);
    java.util.Properties var12 = new java.util.Properties(var9);
    java.util.Properties var13 = new java.util.Properties();
    java.lang.Object var15 = var13.get((java.lang.Object)10.0d);
    java.util.Properties var16 = new java.util.Properties();
    java.lang.Object var18 = var16.get((java.lang.Object)10.0d);
    boolean var20 = var16.contains((java.lang.Object)'#');
    java.lang.Object var21 = var13.get((java.lang.Object)var16);
    var9.putAll((java.util.Map)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.finest("hi!");
    java.util.logging.Logger var5 = java.util.logging.Logger.getGlobal();
    var5.severe("hi!");
    java.util.logging.Handler[] var8 = var5.getHandlers();
    var0.entering("", "9 Nov 1901 18:06:40 GMT", (java.lang.Object[])var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Properties var0 = new java.util.Properties();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    boolean var4 = var0.contains((java.lang.Object)'#');
    boolean var6 = var0.equals((java.lang.Object)'#');
    java.util.Set var7 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
