
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    java.lang.ClassLoader var2 = var0.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = var2.loadClass("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setDefaultAssertionStatus(false);
    var1.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    var3.setPackageAssertionStatus("", true);
    var3.setPackageAssertionStatus("hi!", false);
    java.net.URL var11 = var3.getResource("hi!");
    java.util.Enumeration var13 = var3.getResources("hi!");
    var3.setPackageAssertionStatus("hi!", true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var17 = java.lang.Class.forName("hi!", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    java.net.URL var9 = var1.getResource("hi!");
    java.util.Enumeration var11 = var1.getResources("hi!");
    var1.setClassAssertionStatus("hi!", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    java.net.URL var9 = var1.getResource("hi!");
    java.util.Enumeration var11 = var1.getResources("hi!");
    java.io.InputStream var13 = var1.getResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    java.lang.ClassLoader var2 = var0.getClassLoader();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    var3.setPackageAssertionStatus("", true);
    var3.setDefaultAssertionStatus(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var9 = java.lang.Class.forName("hi!", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    var3.setPackageAssertionStatus("", true);
    var3.setPackageAssertionStatus("hi!", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var10 = java.lang.Class.forName("hi!", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    java.net.URL var6 = var1.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    var1.setDefaultAssertionStatus(true);
    var1.setClassAssertionStatus("hi!", true);
    var1.setDefaultAssertionStatus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    var3.setPackageAssertionStatus("", true);
    java.util.Enumeration var8 = var3.getResources("hi!");
    var3.clearAssertionStatus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var10 = java.lang.Class.forName("", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    var1.setPackageAssertionStatus("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    var1.setDefaultAssertionStatus(true);
    var1.setClassAssertionStatus("hi!", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    var1.clearAssertionStatus();
    java.util.Enumeration var10 = var1.getResources("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setDefaultAssertionStatus(false);
    java.net.URL var8 = var1.getResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", false);
    var1.setClassAssertionStatus("", true);
    java.net.URL var9 = var1.getResource("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    var3.setPackageAssertionStatus("", true);
    var3.setPackageAssertionStatus("hi!", false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var10 = java.lang.Class.forName("", true, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    java.util.Enumeration var6 = var1.getResources("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = var1.loadClass("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    var1.setDefaultAssertionStatus(true);
    java.util.Enumeration var11 = var1.getResources("hi!");
    java.net.URL var13 = var1.getResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.misc.Launcher var0 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    var1.setPackageAssertionStatus("", true);
    var1.setPackageAssertionStatus("hi!", false);
    java.net.URL var9 = var1.getResource("hi!");
    java.util.Enumeration var11 = var1.getResources("hi!");
    var1.setPackageAssertionStatus("hi!", true);
    var1.setClassAssertionStatus("", false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

}
