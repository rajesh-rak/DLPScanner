
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs11.SunPKCS11 var0 = new sun.security.pkcs11.SunPKCS11();
      fail("Expected exception of type java.security.ProviderException");
    } catch (java.security.ProviderException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs11.SunPKCS11 var1 = new sun.security.pkcs11.SunPKCS11("hi!");
      fail("Expected exception of type java.security.ProviderException");
    } catch (java.security.ProviderException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.pkcs11.SunPKCS11 var1 = new sun.security.pkcs11.SunPKCS11("");
      fail("Expected exception of type java.security.ProviderException");
    } catch (java.security.ProviderException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(true);
    java.lang.ThreadGroup var8 = new java.lang.ThreadGroup("hi!");
    var8.setDaemon(true);
    var8.interrupt();
    boolean var13 = var8.allowThreadSuspension(true);
    java.lang.ThreadGroup[] var14 = new java.lang.ThreadGroup[] { var8};
    int var15 = var1.enumerate(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(true);
    int var7 = var1.getMaxPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(true);
    boolean var8 = var1.allowThreadSuspension(true);
    var1.interrupt();
    var1.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(true);
    boolean var8 = var1.allowThreadSuspension(true);
    int var9 = var1.activeGroupCount();
    var1.list();
    var1.list();
    java.lang.Thread var13 = new java.lang.Thread("hi!");
    java.lang.Thread[] var14 = new java.lang.Thread[] { var13};
    int var15 = var1.enumerate(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var3 = var0.put((java.lang.Object)1.0d, (java.lang.Object)'a');
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    var5.setDaemon(true);
    java.lang.Object var8 = var0.remove((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.getMaxPriority();
    int var3 = var1.activeGroupCount();
    java.lang.Thread var5 = new java.lang.Thread("hi!");
    java.lang.Thread var6 = new java.lang.Thread(var1, (java.lang.Runnable)var5);
    java.lang.Thread var7 = new java.lang.Thread();
    java.lang.Thread var8 = new java.lang.Thread(var1, (java.lang.Runnable)var7);
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup(var1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ThreadGroup var2 = new java.lang.ThreadGroup("hi!");
    var2.setDaemon(true);
    var2.interrupt();
    boolean var7 = var2.allowThreadSuspension(true);
    boolean var9 = var2.allowThreadSuspension(true);
    var2.interrupt();
    java.lang.Object var11 = var0.remove((java.lang.Object)var2);
    var2.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    int var5 = var4.getMaxPriority();
    int var6 = var4.activeGroupCount();
    java.lang.Thread var8 = new java.lang.Thread("hi!");
    java.lang.Thread var9 = new java.lang.Thread(var4, (java.lang.Runnable)var8);
    java.lang.Thread var12 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "hi!", 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.getMaxPriority();
    int var3 = var1.activeGroupCount();
    java.lang.Thread var5 = new java.lang.Thread("hi!");
    java.lang.Thread var6 = new java.lang.Thread(var1, (java.lang.Runnable)var5);
    java.lang.Thread var7 = new java.lang.Thread();
    java.lang.Thread var8 = new java.lang.Thread(var1, (java.lang.Runnable)var7);
    java.lang.Thread var9 = new java.lang.Thread((java.lang.Runnable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup(var1, "hi!");

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.checkAccess();
    var1.setDaemon(true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread[] var3 = new java.lang.Thread[] { var2};
    int var5 = var1.enumerate(var3, true);
    var1.setMaxPriority(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.getMaxPriority();
    java.lang.Thread var3 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var3, "");
    int var6 = var1.getMaxPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ClassLoader var1 = var0.getContextClassLoader();
    java.lang.ClassLoader var2 = var0.getContextClassLoader();
    java.beans.PropertyChangeListener[] var4 = var0.getPropertyChangeListeners("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ThreadGroup var2 = new java.lang.ThreadGroup("hi!");
    var2.setDaemon(true);
    var2.interrupt();
    boolean var7 = var2.allowThreadSuspension(true);
    boolean var9 = var2.allowThreadSuspension(true);
    var2.interrupt();
    java.lang.Object var11 = var0.remove((java.lang.Object)var2);
    java.beans.PropertyChangeListener[] var13 = var0.getPropertyChangeListeners("");
    java.lang.Object var15 = var0.get((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.setDaemon(true);
    var1.interrupt();
    boolean var6 = var1.allowThreadSuspension(true);
    var1.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.getMaxPriority();
    int var3 = var1.activeGroupCount();
    java.lang.String var4 = var1.getName();
    java.lang.ThreadGroup var6 = new java.lang.ThreadGroup(var1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

}
