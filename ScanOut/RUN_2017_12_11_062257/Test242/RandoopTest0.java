
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0164\u0101"+ "'", var4.equals("\u0164\u0101"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.System.gc();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = sun.net.www.ParseUtil.encodePath("hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "libhi!.dylib"+ "'", var1.equals("libhi!.dylib"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.System.getProperty("\u0164\u0101");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.System.clearProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    char[] var0 = new char[] { };
    java.lang.String var1 = java.lang.String.valueOf(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = java.lang.String.copyValueOf(var0, 1, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    long var1 = var0.totalMemory();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadLibrary("libhi!.dylib");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2058878976L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.io.File[] var1 = java.io.File.listRoots();
    java.lang.Object var2 = var0.get((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.lang.ProcessBuilder.Redirect var9 = var8.redirectOutput();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Map var0 = java.lang.System.getenv();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.loadLibrary("hi!");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    boolean var9 = var6.isDirectory();
    boolean var11 = var6.setWritable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    long var1 = var0.totalMemory();
    java.lang.String[] var4 = new java.lang.String[] { "libhi!.dylib"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Process var5 = var0.exec("\u0164\u0101", var4);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2058878976L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    java.lang.String[] var2 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var3 = new java.lang.ProcessBuilder(var2);
    java.lang.String[] var5 = new java.lang.String[] { "\u0164\u0101"};
    java.lang.String[] var7 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var8 = new java.lang.ProcessBuilder(var7);
    java.util.Map var9 = var8.environment();
    java.io.File var12 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var13 = var12.list();
    java.lang.ProcessBuilder var14 = var8.redirectError(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Process var15 = var0.exec(var2, var5, var12);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.File var2 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var3 = var2.list();
    java.nio.file.Path var4 = var2.toPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = java.lang.System.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.lang.String var9 = var6.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10"+ "'", var9.equals("10"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String var1 = sun.net.www.ParseUtil.encodePath("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.io.File var11 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var12 = var11.list();
    java.lang.ProcessBuilder var13 = var2.redirectOutput(var11);
    java.lang.ProcessBuilder var14 = var13.inheritIO();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    long var1 = var0.totalMemory();
    var0.runFinalization();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2058878976L);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.Runtime var0 = java.lang.Runtime.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.load("");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    long var0 = java.lang.System.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512955760273L);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.io.File var11 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var12 = var11.list();
    java.lang.ProcessBuilder var13 = var2.redirectOutput(var11);
    java.net.URL var14 = sun.net.www.ParseUtil.fileToEncodedURL(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.io.File var11 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var12 = var11.list();
    java.lang.ProcessBuilder var13 = var2.redirectOutput(var11);
    java.io.File[] var14 = var11.listFiles();
    java.lang.String[] var16 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var17 = new java.lang.ProcessBuilder(var16);
    java.util.Map var18 = var17.environment();
    java.io.File var21 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var22 = var21.list();
    java.lang.ProcessBuilder var23 = var17.redirectError(var21);
    java.io.File var26 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var27 = var26.list();
    java.lang.ProcessBuilder var28 = var17.redirectOutput(var26);
    int var29 = var11.compareTo(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.String[] var1 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var2 = new java.lang.ProcessBuilder(var1);
    java.util.Map var3 = var2.environment();
    java.io.File var6 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var7 = var6.list();
    java.lang.ProcessBuilder var8 = var2.redirectError(var6);
    java.lang.String[] var10 = new java.lang.String[] { ""};
    java.lang.ProcessBuilder var11 = new java.lang.ProcessBuilder(var10);
    java.util.Map var12 = var11.environment();
    java.io.File var15 = new java.io.File("\u0164\u0101", "10");
    java.lang.String[] var16 = var15.list();
    java.lang.ProcessBuilder var17 = var11.redirectError(var15);
    boolean var18 = var15.isDirectory();
    java.lang.ProcessBuilder var19 = var2.redirectOutput(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.io.File var2 = new java.io.File("10", "sun.awt.AppContext[threadGroup=system]");

  }

}
