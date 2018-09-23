
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    var2.close();
    java.io.InputStream var5 = var2.getResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var3);
    var5.setPackageAssertionStatus("", true);
    java.net.URL[] var9 = var5.getURLs();
    java.util.Enumeration var11 = var5.findResources("hi!");
    java.net.URLClassLoader var12 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var5);
    java.net.URL var14 = var5.findResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    var2.setPackageAssertionStatus("", true);
    java.net.URL[] var6 = var2.getURLs();
    java.util.Enumeration var8 = var2.findResources("hi!");
    java.lang.ClassLoader var9 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    var4.close();
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var4);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    var4.close();
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var4);
    java.net.URL[] var7 = new java.net.URL[] { };
    java.net.URLClassLoader var8 = new java.net.URLClassLoader(var7);
    java.net.URLClassLoader var9 = new java.net.URLClassLoader(var7);
    java.net.URLClassLoader var10 = new java.net.URLClassLoader(var7);
    var10.setDefaultAssertionStatus(false);
    var10.setClassAssertionStatus("", true);
    java.net.URL var17 = var10.findResource("hi!");
    java.net.URLClassLoader var18 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.io.InputStream var4 = var2.getResourceAsStream("");
    var2.setClassAssertionStatus("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    var3.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var3);
    var5.setPackageAssertionStatus("", true);
    java.net.URL[] var9 = var5.getURLs();
    java.util.Enumeration var11 = var5.findResources("hi!");
    java.net.URLClassLoader var12 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var5);
    var12.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.io.InputStream var4 = var2.getResourceAsStream("");
    var2.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    java.net.URL[] var4 = new java.net.URL[] { };
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var4);
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var4);
    var6.close();
    java.net.URLClassLoader var8 = java.net.URLClassLoader.newInstance(var2, (java.lang.ClassLoader)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var9 = java.lang.Class.forName("", false, (java.lang.ClassLoader)var6);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var6);
    java.lang.ClassLoader var8 = var6.getParent();
    java.util.Enumeration var10 = var6.findResources("hi!");
    var6.setPackageAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var6);
    java.lang.ClassLoader var8 = var6.getParent();
    java.util.Enumeration var10 = var6.findResources("");
    java.util.Enumeration var12 = var6.findResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.util.Enumeration var2 = var0.getResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    var3.setDefaultAssertionStatus(false);
    var3.setClassAssertionStatus("", true);
    java.util.Enumeration var10 = var3.findResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URL[] var2 = new java.net.URL[] { };
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var2);
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var2);
    var4.close();
    java.net.URLClassLoader var6 = java.net.URLClassLoader.newInstance(var0, (java.lang.ClassLoader)var4);
    var4.setPackageAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    var2.setPackageAssertionStatus("", true);
    java.net.URL[] var6 = var2.getURLs();
    java.util.Enumeration var8 = var2.findResources("hi!");
    var2.close();
    java.net.URL[] var10 = var2.getURLs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    var3.setDefaultAssertionStatus(false);
    var3.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URLClassLoader var4 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var5 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var6 = new java.net.URLClassLoader(var3);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var2, (java.lang.ClassLoader)var6);
    var7.setPackageAssertionStatus("hi!", true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var12 = var7.loadClass("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
