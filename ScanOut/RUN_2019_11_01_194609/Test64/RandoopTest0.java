
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var2 = java.lang.System.getProperty("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.VM.unsuspendSomeThreads();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var0 = java.lang.System.nanoTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 805153217512850L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var0 = sun.misc.VM.threadsSuspended();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var2 = java.lang.System.setProperty("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.getProperty("", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.VM.asChange_otherthread(1, 1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.misc.VM.asChange_otherthread(10, 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(1, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var3 = var2.getDefaultLocale();
    java.lang.Object[] var4 = new java.lang.Object[] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

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


    boolean var0 = sun.misc.VM.isDirectMemoryPageAligned();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var0 = javax.naming.spi.NamingManager.hasInitialContextFactoryBuilder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.AccessControlContext var1 = java.security.AccessController.getContext();
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Collection var6 = var5.values();
    boolean var7 = var1.equals((java.lang.Object)var6);
    java.lang.Object var8 = javax.swing.LookAndFeel.getDesktopPropertyValue("hi!", (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var0 = sun.misc.VM.isBooted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.swing.plaf.multi.MultiComboBoxUI var0 = new javax.swing.plaf.multi.MultiComboBoxUI();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var6 = var5.getDefaultLocale();
    var2.setDefaultLocale(var6);
    java.util.Enumeration var8 = var2.keys();
    int var10 = var2.getInt((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.misc.VM.asChange(10, (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var6 = var5.getDefaultLocale();
    var2.setDefaultLocale(var6);
    java.util.Enumeration var8 = var2.keys();
    javax.swing.UIDefaults var11 = new javax.swing.UIDefaults(0, 1.0f);
    boolean var12 = var2.getBoolean((java.lang.Object)0);
    java.lang.String var13 = var2.toString();
    javax.swing.UIDefaults var18 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Collection var19 = var18.values();
    boolean var21 = var18.contains((java.lang.Object)10L);
    boolean var22 = var2.replace((java.lang.Object)100, (java.lang.Object)(-1), (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "{}"+ "'", var13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    int var0 = sun.misc.VM.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String var1 = java.lang.System.clearProperty("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = java.lang.System.clearProperty("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Collection var3 = var2.values();
    java.lang.Object[] var5 = new java.lang.Object[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.putDefaults(var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var6 = var5.getDefaultLocale();
    var2.setDefaultLocale(var6);
    java.util.Enumeration var8 = var2.keys();
    int var9 = java.lang.System.identityHashCode((java.lang.Object)var2);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 307127056);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    boolean var8 = var2.replace((java.lang.Object)1.0f, (java.lang.Object)(byte)1, (java.lang.Object)0);
    javax.swing.UIDefaults var11 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Collection var12 = var11.values();
    java.util.Set var13 = var11.entrySet();
    boolean var14 = var2.equals((java.lang.Object)var11);
    boolean var16 = var2.getBoolean((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Collection var3 = var2.values();
    boolean var5 = var2.contains((java.lang.Object)10L);
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var5 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var8 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var9 = var8.getDefaultLocale();
    var5.setDefaultLocale(var9);
    java.util.Enumeration var11 = var5.keys();
    javax.swing.UIDefaults var14 = new javax.swing.UIDefaults(0, 1.0f);
    boolean var15 = var5.getBoolean((java.lang.Object)0);
    boolean var16 = var2.containsKey((java.lang.Object)var5);
    javax.swing.UIDefaults var19 = new javax.swing.UIDefaults(0, 1.0f);
    javax.swing.UIDefaults var22 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var23 = var22.getDefaultLocale();
    var19.setDefaultLocale(var23);
    java.util.Enumeration var25 = var19.keys();
    int var26 = java.lang.System.identityHashCode((java.lang.Object)var19);
    boolean var27 = var2.equals((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1554559905);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.swing.UIDefaults var2 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var3 = var2.getDefaultLocale();
    javax.swing.UIDefaults var6 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var7 = var6.getDefaultLocale();
    java.security.AccessControlContext var8 = java.security.AccessController.getContext();
    java.lang.Object var10 = var6.put((java.lang.Object)var8, (java.lang.Object)100L);
    java.util.Hashtable var11 = new java.util.Hashtable((java.util.Map)var6);
    javax.swing.UIDefaults var14 = new javax.swing.UIDefaults(0, 1.0f);
    java.util.Locale var15 = var14.getDefaultLocale();
    boolean var16 = var2.getBoolean((java.lang.Object)var11, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

}
