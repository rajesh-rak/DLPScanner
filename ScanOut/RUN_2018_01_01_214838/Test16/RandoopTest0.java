
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.suspend();
    boolean var3 = var1.isDestroyed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var0 = sun.applet.AppletViewer.countApplets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    boolean var5 = var4.isDestroyed();
    int var6 = var4.getMaxPriority();
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var4};
    int var8 = var1.enumerate(var7);
    var1.setDaemon(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.ThreadGroup[name=hi!,maxpri=10]"+ "'", var4.equals("java.lang.ThreadGroup[name=hi!,maxpri=10]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    boolean var5 = var4.isDestroyed();
    int var6 = var4.getMaxPriority();
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var4};
    int var8 = var1.enumerate(var7);
    java.lang.String var9 = var1.getName();
    var1.setMaxPriority((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var2);
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    boolean var8 = var7.isDestroyed();
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup("hi!");
    boolean var11 = var10.isDestroyed();
    int var12 = var10.getMaxPriority();
    java.lang.ThreadGroup[] var13 = new java.lang.ThreadGroup[] { var10};
    int var14 = var7.enumerate(var13);
    int var16 = var1.enumerate(var13, false);
    boolean var18 = var1.allowThreadSuspension(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var14 = new java.lang.Thread(var1, (java.lang.Runnable)var12, "hi!");
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    boolean var5 = var4.isDestroyed();
    int var6 = var4.getMaxPriority();
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var4};
    int var8 = var1.enumerate(var7);
    var1.interrupt();
    var1.resume();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.suspend();
    java.lang.Thread var4 = new java.lang.Thread(var1, "");
    var1.setMaxPriority((-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    var3.suspend();
    java.lang.Thread var6 = new java.lang.Thread(var3, "");
    java.lang.Thread[] var7 = new java.lang.Thread[] { var6};
    int var9 = var1.enumerate(var7, false);
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("hi!");
    var11.suspend();
    java.lang.Thread var14 = new java.lang.Thread(var11, "");
    java.lang.Thread[] var15 = new java.lang.Thread[] { var14};
    int var17 = var1.enumerate(var15, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    var1.suspend();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup(var1, "hi!");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var2);
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "");
    var1.setMaxPriority(100);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    boolean var5 = var4.isDestroyed();
    int var6 = var4.getMaxPriority();
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var4};
    int var8 = var1.enumerate(var7);
    java.lang.String var9 = var1.getName();
    var1.setDaemon(true);
    var1.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var14 = new java.lang.Thread(var1, (java.lang.Runnable)var12, "hi!");
    var1.setMaxPriority(100);
    var1.setDaemon(true);
    java.lang.ThreadGroup var20 = new java.lang.ThreadGroup("hi!");
    boolean var21 = var20.isDestroyed();
    int var22 = var20.getMaxPriority();
    java.lang.ThreadGroup var24 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var25 = new java.lang.Thread();
    java.lang.Thread var26 = new java.lang.Thread((java.lang.Runnable)var25);
    java.lang.Thread var28 = new java.lang.Thread(var24, (java.lang.Runnable)var25, "");
    java.lang.Thread var30 = new java.lang.Thread(var20, (java.lang.Runnable)var28, "");
    var20.stop();
    java.lang.ThreadGroup[] var32 = new java.lang.ThreadGroup[] { var20};
    int var34 = var1.enumerate(var32, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var14 = new java.lang.Thread(var1, (java.lang.Runnable)var12, "hi!");
    java.lang.String var15 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    var1.setMaxPriority(1);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    boolean var8 = var7.isDestroyed();
    int var9 = var7.getMaxPriority();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var13 = new java.lang.Thread((java.lang.Runnable)var12);
    java.lang.Thread var15 = new java.lang.Thread(var11, (java.lang.Runnable)var12, "");
    java.lang.Thread var17 = new java.lang.Thread(var7, (java.lang.Runnable)var15, "");
    java.lang.Thread[] var18 = new java.lang.Thread[] { var17};
    int var19 = var1.enumerate(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    var1.suspend();
    var1.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var1 = new java.lang.Thread((java.lang.Runnable)var0);
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "java.lang.ThreadGroup[name=hi!,maxpri=10]");

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    var1.setMaxPriority(1);
    java.lang.Thread var7 = new java.lang.Thread(var1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var14 = new java.lang.Thread(var1, (java.lang.Runnable)var12, "hi!");
    var1.setMaxPriority(100);
    var1.setDaemon(true);
    java.lang.ThreadGroup var19 = var1.getParent();
    var19.setDaemon(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    var1.setMaxPriority(1);
    int var6 = var1.activeCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    boolean var4 = var3.isDestroyed();
    int var5 = var3.getMaxPriority();
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var9 = new java.lang.Thread((java.lang.Runnable)var8);
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "");
    java.lang.Thread var13 = new java.lang.Thread(var3, (java.lang.Runnable)var11, "");
    java.lang.Thread[] var14 = new java.lang.Thread[] { var13};
    int var16 = var1.enumerate(var14, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDestroyed();
    int var3 = var1.getMaxPriority();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var6 = new java.lang.Thread();
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    java.lang.Thread var9 = new java.lang.Thread(var5, (java.lang.Runnable)var6, "");
    java.lang.Thread var11 = new java.lang.Thread(var1, (java.lang.Runnable)var9, "");
    java.lang.Thread var12 = new java.lang.Thread();
    java.lang.Thread var14 = new java.lang.Thread(var1, (java.lang.Runnable)var12, "hi!");
    var1.setMaxPriority(100);
    var1.setDaemon(true);
    java.lang.ThreadGroup var19 = var1.getParent();
    java.lang.String var20 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    var3.suspend();
    java.lang.Thread var6 = new java.lang.Thread(var3, "");
    java.lang.Thread[] var7 = new java.lang.Thread[] { var6};
    int var8 = var1.enumerate(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

}
