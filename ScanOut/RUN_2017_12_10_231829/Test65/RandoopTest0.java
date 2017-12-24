
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    var6.setHours(10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    var6.setTime(0L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("Sun Dec 09 22:59:10 IST 1900");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var6 = new java.util.Date(11, 100, 1, 10, 11, 11);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    java.util.Date var13 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var14 = var13.getTime();
    java.util.Date var21 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var22 = var13.compareTo(var21);
    boolean var23 = var6.before(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var7 = var6.getTime();
    int var8 = var6.getMonth();
    var6.setYear(100);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var7 = var6.getTime();
    int var8 = var6.getMonth();
    var6.setMinutes(100);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(100, 1, (-1), 10, 10, 11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.FileNameMap var0 = sun.net.www.MimeTable.loadTable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date((-1), 10, 0, (-1), (-1), 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.util.Date var7 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var8 = var7.getTime();
    int var9 = var7.getMonth();
    boolean var10 = var0.equals((java.lang.Object)var7);
    boolean var12 = var0.equals((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    int var7 = var6.getYear();
    int var8 = var6.getMinutes();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    int var7 = var6.getYear();
    java.util.Date var14 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var15 = var14.getTime();
    java.util.Date var22 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var23 = var14.compareTo(var22);
    int var24 = var6.compareTo(var22);
    java.util.Date var31 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var32 = var31.getTime();
    int var33 = var31.getMonth();
    java.lang.String var34 = var31.toString();
    boolean var35 = var22.before(var31);
    int var36 = var31.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var6 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var7 = var6.getTime();
    java.util.Date var14 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var15 = var6.compareTo(var14);
    int var16 = var6.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("Sun Dec 09 22:59:10 IST 1900");
    var1.info("Sun Dec 09 22:59:10 IST 1900");
    java.util.Locale[] var6 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    var1.entering("hi!", "", (java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("Sun Dec 09 22:59:10 IST 1900");
    var1.info("Sun Dec 09 22:59:10 IST 1900");
    java.util.logging.Handler[] var4 = var1.getHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    int var7 = var6.getYear();
    java.util.Date var14 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var15 = var14.getTime();
    java.util.Date var22 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var23 = var14.compareTo(var22);
    int var24 = var6.compareTo(var22);
    java.util.Date var31 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var32 = var31.getTime();
    int var33 = var31.getMonth();
    java.lang.String var34 = var31.toString();
    boolean var35 = var22.before(var31);
    java.util.Date var42 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var43 = var42.getTime();
    int var44 = var42.getMonth();
    int var45 = var31.compareTo(var42);
    java.lang.String var46 = var31.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    int var7 = var6.getYear();
    java.util.Date var14 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var15 = var14.getTime();
    java.util.Date var22 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    int var23 = var14.compareTo(var22);
    int var24 = var6.compareTo(var22);
    java.util.Date var31 = new java.util.Date(1, (-1), 10, (-1), (-1), 10);
    long var32 = var31.getTime();
    int var33 = var31.getMonth();
    java.lang.String var34 = var31.toString();
    boolean var35 = var22.before(var31);
    java.lang.Object var36 = var22.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    java.util.Date var9 = new java.util.Date(10, 1, (-1), 1, 10, (-1));
    int var10 = var9.getYear();
    boolean var11 = var2.containsKey((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var3 = new java.util.Date((-1), 100, 9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("Sun Dec 09 22:59:10 IST 1900");
    var1.exiting("hi!", "hi!", (java.lang.Object)(byte)100);
    var1.setUseParentHandlers(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    boolean var3 = var1.contains((java.lang.Object)59);
    int var4 = var1.size();
    java.util.Enumeration var5 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);
    boolean var3 = var2.isEmpty();
    java.util.Enumeration var4 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
