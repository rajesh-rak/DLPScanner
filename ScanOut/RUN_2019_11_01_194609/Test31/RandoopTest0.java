
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.misc.VM.unsuspendThreads();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.VM.awaitBooted();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.System.gc();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var0 = sun.misc.VM.suspendThreads();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.System.runFinalizersOnExit(false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.SecurityManager var0 = java.lang.System.getSecurityManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = java.lang.System.getProperty("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var0 = sun.misc.VM.getPeakFinalRefCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 242);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.util.Enumeration var1 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var0 = sun.misc.VM.isDirectMemoryPageAligned();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    javax.swing.border.Border var2 = var0.getBorder((java.lang.Object)10L);
    java.awt.Insets var4 = var0.getInsets((java.lang.Object)0);
    boolean var5 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    javax.swing.border.Border var2 = var0.getBorder((java.lang.Object)10L);
    java.awt.Color var4 = var0.getColor((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.System.clearProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1865411560);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1599153420);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.Object var5 = var0.get((java.lang.Object)(short)0);
    javax.swing.UIDefaults var6 = new javax.swing.UIDefaults();
    java.lang.Object var9 = var6.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    var0.putAll((java.util.Map)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.Object var6 = var0.replace((java.lang.Object)10L, (java.lang.Object)"");
    java.util.Locale var7 = var0.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    int var0 = sun.misc.VM.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.putIfAbsent((java.lang.Object)0, (java.lang.Object)'#');
    javax.swing.UIDefaults var4 = new javax.swing.UIDefaults();
    javax.swing.border.Border var6 = var4.getBorder((java.lang.Object)10L);
    java.awt.Insets var8 = var4.getInsets((java.lang.Object)0);
    java.lang.Object var9 = var0.get((java.lang.Object)var4);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.Object var5 = var0.get((java.lang.Object)(short)0);
    var0.addResourceBundle("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.ClassLoader var5 = sun.misc.VM.latestUserDefinedLoader0();
    java.lang.Class var6 = var0.getUIClass("hi!", var5);
    var0.addResourceBundle("hi!");
    java.awt.Insets var10 = var0.getInsets((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.Object var5 = var0.remove((java.lang.Object)0);
    javax.swing.UIDefaults var6 = new javax.swing.UIDefaults();
    java.lang.Object var9 = var6.putIfAbsent((java.lang.Object)0, (java.lang.Object)'#');
    javax.swing.UIDefaults var10 = new javax.swing.UIDefaults();
    javax.swing.border.Border var12 = var10.getBorder((java.lang.Object)10L);
    java.awt.Insets var14 = var10.getInsets((java.lang.Object)0);
    java.lang.Object var15 = var6.get((java.lang.Object)var10);
    java.awt.Dimension var16 = var0.getDimension((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    var0.clear();
    javax.swing.UIDefaults var3 = new javax.swing.UIDefaults();
    java.lang.Object var6 = var3.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.ClassLoader var8 = sun.misc.VM.latestUserDefinedLoader0();
    java.lang.Class var9 = var3.getUIClass("hi!", var8);
    java.lang.Class var10 = var0.getUIClass("hi!", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.plaf.multi.MultiLookAndFeel var0 = new javax.swing.plaf.multi.MultiLookAndFeel();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.String var2 = java.lang.System.getProperty("\n", "\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\n"+ "'", var2.equals("\n"));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.putIfAbsent((java.lang.Object)0, (java.lang.Object)'#');
    javax.swing.UIDefaults var4 = new javax.swing.UIDefaults();
    javax.swing.border.Border var6 = var4.getBorder((java.lang.Object)10L);
    java.awt.Insets var8 = var4.getInsets((java.lang.Object)0);
    java.lang.Object var9 = var0.get((java.lang.Object)var4);
    java.util.Hashtable var10 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    javax.swing.UIDefaults var0 = new javax.swing.UIDefaults();
    java.lang.Object var3 = var0.replace((java.lang.Object)10.0f, (java.lang.Object)0L);
    java.lang.Object var5 = var0.get((java.lang.Object)(short)0);
    java.util.Map var7 = java.lang.System.getenv();
    javax.swing.UIDefaults var8 = new javax.swing.UIDefaults();
    javax.swing.border.Border var10 = var8.getBorder((java.lang.Object)10L);
    java.awt.Insets var12 = var8.getInsets((java.lang.Object)0);
    java.util.Set var13 = var8.entrySet();
    boolean var14 = var0.replace((java.lang.Object)0.0f, (java.lang.Object)var7, (java.lang.Object)var8);
    java.lang.Object[] var16 = new java.lang.Object[] { ' '};
    javax.swing.text.JTextComponent.KeyBinding[] var17 = javax.swing.LookAndFeel.makeKeyBindings(var16);
    javax.swing.Icon var18 = var0.getIcon((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

}
