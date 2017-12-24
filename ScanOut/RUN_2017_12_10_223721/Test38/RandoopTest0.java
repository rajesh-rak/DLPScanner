
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib.dylib"+ "'", var1.equals("lib.dylib"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.logging.LoggingMXBean var0 = java.util.logging.LogManager.getLoggingMXBean();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var0 = sun.misc.VM.allowGetCallerClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    long var0 = sun.misc.VM.maxDirectMemory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3817865216L);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("Thu Jan 01 05:30:00 IST 1970");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.misc.VM.asChange(100, (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.lang.Object var2 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.misc.VM.asChange_otherthread(0, 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toGMTString();
    java.util.Date var5 = new java.util.Date(1L);
    java.lang.String var6 = var5.toString();
    java.util.Date var8 = new java.util.Date(1L);
    int var9 = var5.compareTo(var8);
    boolean var10 = var1.after(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.arraycopy((java.lang.Object)' ', 0, (java.lang.Object)1.0d, 0, 0);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Date var3 = new java.util.Date((-1), 10, 1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.misc.VM.awaitBooted();

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.util.Date var4 = new java.util.Date(1L);
    int var5 = var1.compareTo(var4);
    int var6 = var1.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Map var0 = java.lang.System.getenv();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.util.Set var2 = var1.keySet();
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.util.Date var4 = new java.util.Date(1L);
    int var5 = var1.compareTo(var4);
    java.lang.String var6 = var4.toLocaleString();
    var4.setDate((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.logging.Logger var2 = var0.getLogger("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Date var6 = new java.util.Date(5, 1, 30, 100, 100, 30);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    java.util.logging.Logger var2 = var0.getLogger("\n");
    java.util.logging.Logger var4 = var0.getLogger("1 Jan 1970 00:00:00 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.logging.LogManager var0 = java.util.logging.LogManager.getLogManager();
    var0.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.util.Date var4 = new java.util.Date(1L);
    int var5 = var1.compareTo(var4);
    java.util.Date var7 = new java.util.Date(1L);
    java.lang.String var8 = var7.toString();
    java.util.Date var10 = new java.util.Date(1L);
    int var11 = var7.compareTo(var10);
    int var12 = var10.getMinutes();
    boolean var13 = var4.before(var10);
    var4.setDate(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.util.Date var4 = new java.util.Date(1L);
    int var5 = var1.compareTo(var4);
    java.lang.String var6 = var4.toLocaleString();
    java.util.Map var7 = java.lang.System.getenv();
    java.util.Hashtable var8 = new java.util.Hashtable(var7);
    java.util.Set var9 = var8.keySet();
    boolean var10 = var4.equals((java.lang.Object)var8);
    java.lang.Object var12 = var8.remove((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 270);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setDate(1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsValue((java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.VM.saveAndRemoveProperties(var0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.util.Date var1 = new java.util.Date(1L);
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 161007621);

  }

}
