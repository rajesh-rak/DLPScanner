
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkLink("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("hi!", 0);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("", 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl var0 = new com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl();
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPool var2 = var0.getThreadPool("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    boolean var7 = var1.allowThreadSuspension(true);
    var1.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    java.lang.ThreadGroup var2 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var5 = new java.lang.ThreadGroup[] { var4};
    int var6 = var2.enumerate(var5);
    boolean var7 = var0.checkTopLevelWindow((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.setMaxPriority(1);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.lang.ThreadGroup[name=hi!,maxpri=1]"+ "'", var8.equals("java.lang.ThreadGroup[name=hi!,maxpri=1]"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.setMaxPriority(1);
    var1.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageAccess("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    boolean var3 = var1.equals((java.lang.Object)0L);
    boolean var5 = var1.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var10 = new java.lang.ThreadGroup[] { var9};
    int var11 = var7.enumerate(var10);
    var7.destroy();
    java.lang.String var13 = var7.toString();
    boolean var14 = var1.parentOf(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "java.lang.ThreadGroup[name=hi!,maxpri=10]"+ "'", var13.equals("java.lang.ThreadGroup[name=hi!,maxpri=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl var0 = new com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl();
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolChooser var2 = var0.getThreadPoolChooser(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl var0 = new com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl();
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPool var2 = var0.getThreadPool("hi!");
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolChooser var4 = var0.getThreadPoolChooser("java.lang.ThreadGroup[name=hi!,maxpri=10]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl var0 = new com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolManagerImpl();
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPool var2 = var0.getThreadPool("hi!");
    com.sun.corba.se.spi.orbutil.threadpool.ThreadPool var4 = var0.getThreadPool("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var10 = new java.lang.ThreadGroup[] { var9};
    int var11 = var7.enumerate(var10);
    var7.interrupt();
    boolean var13 = var1.parentOf(var7);
    java.lang.ThreadGroup var14 = var7.getParent();
    java.lang.ThreadGroup var16 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var18 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var19 = new java.lang.ThreadGroup[] { var18};
    int var20 = var16.enumerate(var19);
    int var22 = var7.enumerate(var19, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkExit((-1));
    java.lang.Thread var3 = new java.lang.Thread();
    var0.checkAccess(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkConnect("hi!", (-1));
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var5 = var1.enumerate(var4);
    var1.setMaxPriority(1);
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var10 = new java.lang.Thread(var1, (java.lang.Runnable)var8, "java.lang.ThreadGroup[name=hi!,maxpri=1]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("java.lang.ThreadGroup[name=hi!,maxpri=10]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

}
