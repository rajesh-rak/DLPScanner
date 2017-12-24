
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.misc.VM.awaitBooted();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.loadLibrary("\n");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.misc.VM.booted();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    var1.clear();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.Console var0 = java.lang.System.console();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Thread.State var1 = sun.misc.VM.toThreadState(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.finest("10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.warning("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("4", "", (java.lang.Object)'a');
    java.util.logging.Handler[] var5 = var0.getHandlers();
    var0.fine("\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var1 = sun.misc.VMSupport.isClassPathAttributePresent("hi!");
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String var1 = java.lang.String.valueOf('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("4", "", (java.lang.Object)'a');
    java.util.logging.Logger var5 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.String var1 = java.lang.System.getenv("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.VM var0 = new sun.misc.VM();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "lib1.0.dylib"+ "'", var1.equals("lib1.0.dylib"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    boolean var0 = sun.misc.VM.allowArraySyntax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.misc.VMSupport var0 = new sun.misc.VMSupport();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = java.lang.String.valueOf(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "true"+ "'", var1.equals("true"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    int var1 = java.lang.System.identityHashCode((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 769697122);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.loadLibrary("");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var2 = java.lang.System.getProperty("a", "lib1.0.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "lib1.0.dylib"+ "'", var2.equals("lib1.0.dylib"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    java.util.logging.Filter var2 = var0.getFilter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String var2 = java.lang.System.getProperty("10.0", "lib1.0.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "lib1.0.dylib"+ "'", var2.equals("lib1.0.dylib"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("4", "", (java.lang.Object)'a');
    java.util.logging.Handler[] var5 = var0.getHandlers();
    var0.info("4");
    var0.entering("\n", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.util.ResourceBundle var1 = var0.getResourceBundle();
    var0.setUseParentHandlers(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl var0 = new com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl();
    int var1 = var0.getTransletIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Set var2 = var1.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    boolean var0 = sun.misc.VM.allowGetCallerClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    byte[] var0 = sun.misc.VMSupport.serializeAgentPropertiesToByteArray();
    java.lang.String var2 = new java.lang.String(var0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u0123\u014D\u016F\u016E\u0120\u0144\u0165\u0163\u0120\u0131\u0131\u0120\u0131\u0130\u013A\u0130\u0134\u013A\u0133\u0138\u0120\u0149\u0153\u0154\u0120\u0132\u0130\u0131\u0137\u010A\u0173\u0175\u016E\u012E\u016A\u0176\u016D\u012E\u0161\u0172\u0167\u0173\u013D\u012D\u0158\u016D\u0173\u0132\u0130\u0134\u0138\u016D\u0120\u012D\u0158\u016D\u0178\u0134\u0130\u0139\u0136\u016D\u010A\u0173\u0175\u016E\u012E\u016A\u0176\u016D\u012E\u0166\u016C\u0161\u0167\u0173\u013D\u010A\u0173\u0175\u016E\u012E\u016A\u0161\u0176\u0161\u012E\u0163\u016F\u016D\u016D\u0161\u016E\u0164\u013D\u0172\u0161\u016E\u0164\u016F\u016F\u0170\u012E\u016D\u0161\u0169\u016E\u012E\u014D\u0161\u0169\u016E\u0120\u0167\u0165\u016E\u0174\u0165\u0173\u0174\u0173\u0120\u012D\u012D\u0163\u016C\u0161\u0173\u0173\u016C\u0169\u0173\u0174\u015C\u013D\u0163\u016C\u0161\u0173\u0173\u016C\u0169\u0173\u0174\u012E\u0174\u0178\u0174\u0120\u012D\u012D\u0174\u0169\u016D\u0165\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0133\u0130\u0120\u012D\u012D\u0169\u016E\u0170\u0175\u0174\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0135\u0130\u0120\u012D\u012D\u016F\u0175\u0174\u0170\u0175\u0174\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0134\u0130\u010A"+ "'", var2.equals("\u0123\u014D\u016F\u016E\u0120\u0144\u0165\u0163\u0120\u0131\u0131\u0120\u0131\u0130\u013A\u0130\u0134\u013A\u0133\u0138\u0120\u0149\u0153\u0154\u0120\u0132\u0130\u0131\u0137\u010A\u0173\u0175\u016E\u012E\u016A\u0176\u016D\u012E\u0161\u0172\u0167\u0173\u013D\u012D\u0158\u016D\u0173\u0132\u0130\u0134\u0138\u016D\u0120\u012D\u0158\u016D\u0178\u0134\u0130\u0139\u0136\u016D\u010A\u0173\u0175\u016E\u012E\u016A\u0176\u016D\u012E\u0166\u016C\u0161\u0167\u0173\u013D\u010A\u0173\u0175\u016E\u012E\u016A\u0161\u0176\u0161\u012E\u0163\u016F\u016D\u016D\u0161\u016E\u0164\u013D\u0172\u0161\u016E\u0164\u016F\u016F\u0170\u012E\u016D\u0161\u0169\u016E\u012E\u014D\u0161\u0169\u016E\u0120\u0167\u0165\u016E\u0174\u0165\u0173\u0174\u0173\u0120\u012D\u012D\u0163\u016C\u0161\u0173\u0173\u016C\u0169\u0173\u0174\u015C\u013D\u0163\u016C\u0161\u0173\u0173\u016C\u0169\u0173\u0174\u012E\u0174\u0178\u0174\u0120\u012D\u012D\u0174\u0169\u016D\u0165\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0133\u0130\u0120\u012D\u012D\u0169\u016E\u0170\u0175\u0174\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0135\u0130\u0120\u012D\u012D\u016F\u0175\u0174\u0170\u0175\u0174\u016C\u0169\u016D\u0169\u0174\u015C\u013D\u0134\u0130\u010A"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    long var0 = sun.misc.VM.maxDirectMemory();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3817865216L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.util.Hashtable var2 = new java.util.Hashtable(10, 100.0f);
    boolean var4 = var2.containsValue((java.lang.Object)10L);
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.lang.Object var7 = var2.remove((java.lang.Object)10);
    java.util.Collection var8 = var2.values();
    boolean var10 = var2.containsValue((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.String var1 = java.lang.String.valueOf(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

}
