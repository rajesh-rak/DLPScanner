
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.Signal var1 = new sun.misc.Signal("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Thread var1 = new java.lang.Thread("hi!");
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    var1.suspend();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    int var2 = var1.activeGroupCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    int var3 = var1.activeCount();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    java.lang.Thread var13 = new java.lang.Thread(var1, (java.lang.Runnable)var11);
    int var14 = var1.activeGroupCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    int var3 = var1.activeCount();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    java.lang.Thread var13 = new java.lang.Thread(var1, (java.lang.Runnable)var11);
    java.lang.Thread var15 = new java.lang.Thread((java.lang.Runnable)var11, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.Signal var1 = new sun.misc.Signal("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    boolean var4 = var1.allowThreadSuspension(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    java.lang.Thread var4 = new java.lang.Thread((java.lang.Runnable)var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    boolean var13 = var1.parentOf(var5);
    var5.interrupt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    boolean var2 = var1.isDestroyed();
    var1.interrupt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    boolean var2 = var1.isDestroyed();
    boolean var3 = var1.isDestroyed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    var1.checkAccess();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.Thread var4 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var3, (java.lang.Runnable)var4);
    java.lang.Thread[] var6 = new java.lang.Thread[] { var4};
    int var7 = var1.enumerate(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, false);
    java.lang.Thread var7 = new java.lang.Thread();
    java.lang.Thread var8 = new java.lang.Thread(var1, (java.lang.Runnable)var7);
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup("");
    java.lang.String var11 = var10.getName();
    java.lang.ThreadGroup var13 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var14 = new java.lang.ThreadGroup[] { var13};
    int var16 = var10.enumerate(var14, false);
    int var17 = var1.enumerate(var14);
    int var18 = var1.activeGroupCount();
    int var19 = var1.activeCount();
    var1.resume();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    int var3 = var1.activeCount();
    java.lang.Thread var5 = new java.lang.Thread(var1, "hi!");
    boolean var6 = var1.isDaemon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var6 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var6};
    int var9 = var4.enumerate(var7, false);
    int var11 = var1.enumerate(var7, true);
    var1.interrupt();
    java.lang.String var13 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "java.lang.ThreadGroup[name=,maxpri=10]"+ "'", var13.equals("java.lang.ThreadGroup[name=,maxpri=10]"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    boolean var13 = var1.parentOf(var5);
    boolean var14 = var5.isDaemon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    int var3 = var1.activeCount();
    java.lang.Thread var4 = new java.lang.Thread();
    java.lang.Thread var6 = new java.lang.Thread(var1, (java.lang.Runnable)var4, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var5 = new java.lang.ThreadGroup[] { var4};
    int var7 = var1.enumerate(var5, false);
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread[] var9 = new java.lang.Thread[] { var8};
    int var10 = var1.enumerate(var9);
    java.lang.ThreadGroup var12 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var14 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var15 = new java.lang.ThreadGroup[] { var14};
    int var17 = var12.enumerate(var15, false);
    java.lang.Thread var18 = new java.lang.Thread();
    java.lang.Thread var19 = new java.lang.Thread(var12, (java.lang.Runnable)var18);
    java.lang.Thread var21 = new java.lang.Thread(var1, (java.lang.Runnable)var19, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var6 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var6};
    int var9 = var4.enumerate(var7, false);
    int var11 = var1.enumerate(var7, true);
    java.lang.ThreadGroup var13 = new java.lang.ThreadGroup("");
    java.lang.String var14 = var13.getName();
    int var15 = var13.activeCount();
    java.lang.ThreadGroup var17 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var19 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var20 = new java.lang.ThreadGroup[] { var19};
    int var22 = var17.enumerate(var20, false);
    java.lang.Thread var23 = new java.lang.Thread();
    java.lang.Thread var24 = new java.lang.Thread(var17, (java.lang.Runnable)var23);
    java.lang.Thread var25 = new java.lang.Thread(var13, (java.lang.Runnable)var23);
    java.lang.Thread[] var26 = new java.lang.Thread[] { var23};
    int var28 = var1.enumerate(var26, true);
    var1.stop();
    var1.checkAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.String var2 = var1.getName();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var6 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var7 = new java.lang.ThreadGroup[] { var6};
    int var9 = var4.enumerate(var7, false);
    int var11 = var1.enumerate(var7, true);
    java.lang.ThreadGroup var12 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, false);
    java.lang.Thread var7 = new java.lang.Thread();
    java.lang.Thread var8 = new java.lang.Thread(var1, (java.lang.Runnable)var7);
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup("");
    java.lang.String var11 = var10.getName();
    java.lang.ThreadGroup var13 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var16 = new java.lang.ThreadGroup[] { var15};
    int var18 = var13.enumerate(var16, false);
    int var20 = var10.enumerate(var16, true);
    java.lang.ThreadGroup var22 = new java.lang.ThreadGroup("");
    java.lang.String var23 = var22.getName();
    int var24 = var22.activeCount();
    java.lang.ThreadGroup var26 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var28 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var29 = new java.lang.ThreadGroup[] { var28};
    int var31 = var26.enumerate(var29, false);
    java.lang.Thread var32 = new java.lang.Thread();
    java.lang.Thread var33 = new java.lang.Thread(var26, (java.lang.Runnable)var32);
    java.lang.Thread var34 = new java.lang.Thread(var22, (java.lang.Runnable)var32);
    java.lang.Thread[] var35 = new java.lang.Thread[] { var32};
    int var37 = var10.enumerate(var35, true);
    int var38 = var1.enumerate(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    boolean var13 = var1.parentOf(var5);
    boolean var14 = var1.isDaemon();
    var1.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var3 = new java.lang.Thread(var1, (java.lang.Runnable)var2);
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var8 = new java.lang.ThreadGroup[] { var7};
    int var10 = var5.enumerate(var8, false);
    java.lang.Thread var11 = new java.lang.Thread();
    java.lang.Thread var12 = new java.lang.Thread(var5, (java.lang.Runnable)var11);
    boolean var13 = var1.parentOf(var5);
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var17 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var18 = new java.lang.ThreadGroup[] { var17};
    int var20 = var15.enumerate(var18, false);
    java.lang.Thread var21 = new java.lang.Thread();
    java.lang.Thread var22 = new java.lang.Thread(var15, (java.lang.Runnable)var21);
    java.lang.ThreadGroup var24 = new java.lang.ThreadGroup("");
    java.lang.String var25 = var24.getName();
    java.lang.ThreadGroup var27 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var28 = new java.lang.ThreadGroup[] { var27};
    int var30 = var24.enumerate(var28, false);
    int var31 = var15.enumerate(var28);
    java.lang.ThreadGroup var33 = new java.lang.ThreadGroup("");
    java.lang.String var34 = var33.getName();
    java.lang.ThreadGroup var36 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var38 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var39 = new java.lang.ThreadGroup[] { var38};
    int var41 = var36.enumerate(var39, false);
    int var43 = var33.enumerate(var39, true);
    java.lang.ThreadGroup var45 = new java.lang.ThreadGroup("");
    java.lang.String var46 = var45.getName();
    int var47 = var45.activeCount();
    java.lang.ThreadGroup var49 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup var51 = new java.lang.ThreadGroup("");
    java.lang.ThreadGroup[] var52 = new java.lang.ThreadGroup[] { var51};
    int var54 = var49.enumerate(var52, false);
    java.lang.Thread var55 = new java.lang.Thread();
    java.lang.Thread var56 = new java.lang.Thread(var49, (java.lang.Runnable)var55);
    java.lang.Thread var57 = new java.lang.Thread(var45, (java.lang.Runnable)var55);
    java.lang.Thread[] var58 = new java.lang.Thread[] { var55};
    int var60 = var33.enumerate(var58, true);
    int var62 = var15.enumerate(var58, false);
    int var64 = var1.enumerate(var58, false);
    java.lang.Thread var65 = new java.lang.Thread();
    java.lang.Thread[] var66 = new java.lang.Thread[] { var65};
    int var67 = var1.enumerate(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);

  }

}
