
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var1.finer("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.exiting("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.setUseParentHandlers(true);
    var1.finer("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var1.fine("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.reset();
    var0.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.reset();
    java.util.logging.Logger var3 = var0.getLogger("hi!");
    var0.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.setUseParentHandlers(true);
    java.util.logging.Handler[] var4 = var1.getHandlers();
    var1.info("hi!");
    var1.severe("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var2.entering("hi!", "hi!");
    java.lang.String var6 = var2.getName();
    java.util.logging.Filter var7 = var2.getFilter();
    java.lang.String var8 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.lang.String var2 = var0.getProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var1.setUseParentHandlers(false);
    var1.entering("hi!", "hi!", (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var2.config("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var2.entering("hi!", "hi!");
    var2.exiting("hi!", "hi!");
    var2.setUseParentHandlers(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var3 = java.util.logging.Logger.getLogger("");
    var1.setParent(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var2.entering("hi!", "hi!");
    var2.exiting("hi!", "hi!");
    var2.config("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.setUseParentHandlers(true);
    var1.exiting("", "hi!", (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.Enumeration var1 = var0.getLoggerNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var1.setUseParentHandlers(false);
    java.util.logging.Filter var5 = var1.getFilter();
    var1.exiting("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    var1.finer("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.reset();
    java.util.logging.Logger var3 = var0.getLogger("hi!");
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    var1.setUseParentHandlers(true);
    java.util.logging.Handler[] var4 = var1.getHandlers();
    var1.config("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    java.util.ResourceBundle var3 = var1.getResourceBundle();
    var1.fine("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    java.util.logging.Logger var2 = var1.getParent();
    var2.entering("hi!", "hi!");
    var2.fine("");
    var2.finest("hi!");
    java.util.logging.LogManager var12 = java.util.logging.LogManager.getLogManager();
    var12.reset();
    var2.exiting("hi!", "hi!", (java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.readConfiguration();
    java.lang.String var3 = var0.getProperty("hi!");
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

}
