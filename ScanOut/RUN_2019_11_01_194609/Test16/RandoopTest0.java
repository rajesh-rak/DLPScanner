
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.bind.v2.ContextFactory var0 = new com.sun.xml.internal.bind.v2.ContextFactory();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.misc.URLClassPath var0 = sun.misc.Launcher.getBootstrapClassPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var5 = java.lang.Class.forName("", false, var4);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("hi!", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("", true, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("hi!", true, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var5 = java.lang.Class.forName("", true, var4);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var6 = java.lang.Class.forName("hi!", true, var5);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.misc.Launcher var2 = new sun.misc.Launcher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("hi!", false, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.misc.Launcher var2 = new sun.misc.Launcher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = java.lang.Class.forName("", true, var3);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = java.lang.Class.forName("", false, var7);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var6 = java.lang.Class.forName("hi!", false, var5);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var6 = java.lang.Class.forName("", false, var5);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var7 = java.lang.Class.forName("hi!", false, var6);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var9 = java.lang.Class.forName("hi!", false, var8);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.misc.Launcher var2 = new sun.misc.Launcher();
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
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = java.lang.Class.forName("hi!", false, var7);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var7 = java.lang.Class.forName("", false, var6);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = java.lang.Class.forName("", true, var7);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var11 = java.lang.Class.forName("", true, var10);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var10 = java.lang.Class.forName("", true, var9);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var11 = java.lang.Class.forName("hi!", true, var10);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    java.lang.ClassLoader var11 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var12 = java.lang.Class.forName("hi!", false, var11);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    java.lang.ClassLoader var11 = var2.getClassLoader();
    java.lang.ClassLoader var12 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var13 = java.lang.Class.forName("", true, var12);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.misc.Launcher var0 = new sun.misc.Launcher();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    java.lang.ClassLoader var2 = var0.getClassLoader();
    java.lang.ClassLoader var3 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var11 = java.lang.Class.forName("hi!", false, var10);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var5 = java.lang.Class.forName("hi!", true, var4);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    java.lang.ClassLoader var11 = var2.getClassLoader();
    java.lang.ClassLoader var12 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var13 = java.lang.Class.forName("hi!", false, var12);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var10 = java.lang.Class.forName("hi!", false, var9);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var6 = java.lang.Class.forName("", true, var5);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    java.lang.ClassLoader var11 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var12 = java.lang.Class.forName("hi!", true, var11);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    sun.misc.Launcher var2 = sun.misc.Launcher.getLauncher();
    java.lang.ClassLoader var3 = var2.getClassLoader();
    java.lang.ClassLoader var4 = var2.getClassLoader();
    java.lang.ClassLoader var5 = var2.getClassLoader();
    java.lang.ClassLoader var6 = var2.getClassLoader();
    java.lang.ClassLoader var7 = var2.getClassLoader();
    java.lang.ClassLoader var8 = var2.getClassLoader();
    java.lang.ClassLoader var9 = var2.getClassLoader();
    java.lang.ClassLoader var10 = var2.getClassLoader();
    java.lang.ClassLoader var11 = var2.getClassLoader();
    java.lang.ClassLoader var12 = var2.getClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var13 = java.lang.Class.forName("", false, var12);
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

}
