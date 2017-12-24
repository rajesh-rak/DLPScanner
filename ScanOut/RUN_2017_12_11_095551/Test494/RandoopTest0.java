
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.loading.MLet var0 = new javax.management.loading.MLet();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    var3.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var1, false);
    javax.management.loading.MLet var4 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var3);
    var3.preDeregister();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addURL("hi!");
      fail("Expected exception of type javax.management.ServiceNotFoundException");
    } catch (javax.management.ServiceNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var3 = var1.loadClass("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    javax.management.loading.MLet var5 = new javax.management.loading.MLet(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = java.net.URLClassLoader.newInstance(var0);
    var1.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var1, false);
    javax.management.loading.MLet var4 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var3);
    var4.preDeregister();
    var4.setLibraryDirectory("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URL[] var4 = new java.net.URL[] { };
    javax.management.loading.MLet var6 = new javax.management.loading.MLet(var4, false);
    javax.management.loading.MLet var7 = new javax.management.loading.MLet(var3, (java.lang.ClassLoader)var6);
    javax.management.loading.MLet var8 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var6);
    java.lang.String var9 = var6.getLibraryDirectory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"+ "'", var9.equals("/var/folders/yq/fp2z6tc962770qh327k_5d080000gn/T/"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URLClassLoader var3 = new java.net.URLClassLoader(var0);
    java.net.URL[] var4 = new java.net.URL[] { };
    javax.management.loading.MLet var6 = new javax.management.loading.MLet(var4, false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var4);
    java.net.URLClassLoader var8 = java.net.URLClassLoader.newInstance(var4);
    javax.management.loading.MLet var9 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URL[] var4 = new java.net.URL[] { };
    javax.management.loading.MLet var6 = new javax.management.loading.MLet(var4, false);
    javax.management.loading.MLet var7 = new javax.management.loading.MLet(var3, (java.lang.ClassLoader)var6);
    javax.management.loading.MLet var8 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var6);
    java.net.URL var10 = java.lang.ClassLoader.getSystemResource("");
    var6.addURL(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.addURL("hi!");
      fail("Expected exception of type javax.management.ServiceNotFoundException");
    } catch (javax.management.ServiceNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var0);
    var3.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    java.net.URL[] var2 = new java.net.URL[] { var1};
    java.net.URLClassLoader var3 = java.net.URLClassLoader.newInstance(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URL var4 = java.lang.ClassLoader.getSystemResource("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var5 = var2.getMBeansFromURL(var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var0);
    java.net.URL[] var4 = new java.net.URL[] { };
    javax.management.loading.MLet var6 = new javax.management.loading.MLet(var4, false);
    java.net.URLClassLoader var7 = new java.net.URLClassLoader(var4);
    java.net.URLClassLoader var8 = new java.net.URLClassLoader(var4);
    javax.management.loading.MLet var10 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var8, true);
    var8.setPackageAssertionStatus("", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.io.InputStream var4 = var2.getResourceAsStream("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addURL("hi!");
      fail("Expected exception of type javax.management.ServiceNotFoundException");
    } catch (javax.management.ServiceNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URL[] var4 = new java.net.URL[] { };
    javax.management.loading.MLet var6 = new javax.management.loading.MLet(var4, false);
    javax.management.loading.MLet var7 = new javax.management.loading.MLet(var3, (java.lang.ClassLoader)var6);
    javax.management.loading.MLet var8 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var6);
    java.net.URLClassLoader var9 = new java.net.URLClassLoader(var0);
    java.net.URLClassLoader var10 = java.net.URLClassLoader.newInstance(var0);
    var10.setDefaultAssertionStatus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URL[] var1 = new java.net.URL[] { };
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var1, false);
    javax.management.loading.MLet var4 = new javax.management.loading.MLet(var0, (java.lang.ClassLoader)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.addURL("");
      fail("Expected exception of type javax.management.ServiceNotFoundException");
    } catch (javax.management.ServiceNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    java.net.URL[] var3 = new java.net.URL[] { };
    java.net.URL[] var4 = new java.net.URL[] { };
    java.net.URL[] var5 = new java.net.URL[] { };
    javax.management.loading.MLet var7 = new javax.management.loading.MLet(var5, false);
    javax.management.loading.MLet var8 = new javax.management.loading.MLet(var4, (java.lang.ClassLoader)var7);
    java.net.URLClassLoader var9 = new java.net.URLClassLoader(var3, (java.lang.ClassLoader)var7);
    var7.postDeregister();
    java.net.URL var12 = var7.getResource("hi!");
    var2.addURL(var12);
    var2.setClassAssertionStatus("", false);
    var2.postDeregister();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    javax.management.loading.MLet var2 = new javax.management.loading.MLet(var0, false);
    javax.management.loading.MLet var3 = new javax.management.loading.MLet(var0);
    java.net.URL var5 = var3.findResource("hi!");
    var3.postRegister((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

}
