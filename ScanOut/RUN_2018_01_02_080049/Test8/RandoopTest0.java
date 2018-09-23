
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.activeGroupCount();
    int var3 = var1.activeCount();
    var1.list();
    var1.checkAccess();
    var1.setDaemon(true);
    java.lang.String var8 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "hi!", 10L);
    java.lang.Thread[] var12 = new java.lang.Thread[] { var11};
    int var13 = var1.enumerate(var12);
    int var14 = var1.getMaxPriority();
    java.lang.Thread var16 = new java.lang.Thread("hi!");
    java.lang.Thread var18 = new java.lang.Thread(var1, (java.lang.Runnable)var16, "hi!");
    java.lang.ThreadGroup var20 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var21 = new java.lang.Thread();
    java.lang.Thread var24 = new java.lang.Thread(var20, (java.lang.Runnable)var21, "hi!", 10L);
    java.lang.ThreadGroup var26 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var27 = new java.lang.Thread();
    java.lang.Thread var30 = new java.lang.Thread(var26, (java.lang.Runnable)var27, "hi!", 10L);
    java.lang.Thread[] var31 = new java.lang.Thread[] { var30};
    int var32 = var20.enumerate(var31);
    int var33 = var20.getMaxPriority();
    java.lang.Thread var35 = new java.lang.Thread("hi!");
    java.lang.Thread var37 = new java.lang.Thread(var20, (java.lang.Runnable)var35, "hi!");
    java.lang.ThreadGroup[] var38 = new java.lang.ThreadGroup[] { var20};
    int var39 = var1.enumerate(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.activeGroupCount();
    int var3 = var1.activeCount();
    var1.list();
    var1.checkAccess();
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "hi!", 10L);
    int var12 = var7.activeCount();
    java.lang.ThreadGroup[] var13 = new java.lang.ThreadGroup[] { var7};
    int var15 = var1.enumerate(var13, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "hi!", 10L);
    java.lang.Thread[] var12 = new java.lang.Thread[] { var11};
    int var13 = var1.enumerate(var12);
    int var14 = var1.getMaxPriority();
    java.lang.Thread var16 = new java.lang.Thread("hi!");
    java.lang.Thread var18 = new java.lang.Thread(var1, (java.lang.Runnable)var16, "hi!");
    var1.setMaxPriority(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "hi!", 10L);
    java.lang.Thread[] var12 = new java.lang.Thread[] { var11};
    int var13 = var1.enumerate(var12);
    int var14 = var1.getMaxPriority();
    java.lang.ThreadGroup var16 = new java.lang.ThreadGroup(var1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, true);
    int var7 = var1.activeGroupCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var3 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var4 = new java.lang.ThreadGroup[] { var3};
    int var6 = var1.enumerate(var4, true);
    var1.stop();
    var1.resume();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    var1.stop();
    java.lang.Thread var8 = new java.lang.Thread(var1, "hi!");
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup(var1, "");
    java.lang.ThreadGroup var12 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var13 = new java.lang.Thread();
    java.lang.Thread var16 = new java.lang.Thread(var12, (java.lang.Runnable)var13, "hi!", 10L);
    java.lang.ThreadGroup var18 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var19 = new java.lang.Thread();
    java.lang.Thread var22 = new java.lang.Thread(var18, (java.lang.Runnable)var19, "hi!", 10L);
    java.lang.Thread[] var23 = new java.lang.Thread[] { var22};
    int var24 = var12.enumerate(var23);
    int var25 = var12.getMaxPriority();
    java.lang.Thread var27 = new java.lang.Thread("hi!");
    java.lang.Thread var29 = new java.lang.Thread(var12, (java.lang.Runnable)var27, "hi!");
    java.lang.Thread var32 = new java.lang.Thread(var10, (java.lang.Runnable)var29, "", 100L);
    java.lang.String var33 = var10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    var1.stop();
    java.lang.String var7 = var1.getName();
    java.lang.Thread var9 = new java.lang.Thread(var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    java.lang.ThreadGroup var7 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var8 = new java.lang.Thread();
    java.lang.Thread var11 = new java.lang.Thread(var7, (java.lang.Runnable)var8, "hi!", 10L);
    java.lang.Thread[] var12 = new java.lang.Thread[] { var11};
    int var13 = var1.enumerate(var12);
    boolean var14 = var1.isDestroyed();
    var1.suspend();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.activeGroupCount();
    int var3 = var1.activeCount();
    java.lang.Thread var4 = new java.lang.Thread();
    java.lang.Thread var6 = new java.lang.Thread(var1, (java.lang.Runnable)var4, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.activeGroupCount();
    var1.checkAccess();
    int var4 = var1.activeGroupCount();
    boolean var6 = var1.allowThreadSuspension(false);
    java.lang.ThreadGroup var7 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    var1.stop();
    java.lang.Thread var8 = new java.lang.Thread(var1, "hi!");
    java.lang.ThreadGroup var10 = new java.lang.ThreadGroup(var1, "");
    java.lang.ThreadGroup var12 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var13 = new java.lang.Thread();
    java.lang.Thread var16 = new java.lang.Thread(var12, (java.lang.Runnable)var13, "hi!", 10L);
    java.lang.ThreadGroup var18 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var19 = new java.lang.Thread();
    java.lang.Thread var22 = new java.lang.Thread(var18, (java.lang.Runnable)var19, "hi!", 10L);
    java.lang.Thread[] var23 = new java.lang.Thread[] { var22};
    int var24 = var12.enumerate(var23);
    int var25 = var12.getMaxPriority();
    java.lang.Thread var27 = new java.lang.Thread("hi!");
    java.lang.Thread var29 = new java.lang.Thread(var12, (java.lang.Runnable)var27, "hi!");
    java.lang.Thread var30 = new java.lang.Thread(var1, (java.lang.Runnable)var27);
    java.lang.ThreadGroup var32 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var34 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var35 = new java.lang.ThreadGroup[] { var34};
    int var37 = var32.enumerate(var35, true);
    int var38 = var32.activeCount();
    boolean var39 = var1.parentOf(var32);
    java.lang.ThreadGroup var41 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var42 = new java.lang.Thread();
    java.lang.Thread var45 = new java.lang.Thread(var41, (java.lang.Runnable)var42, "hi!", 10L);
    java.lang.Thread var46 = new java.lang.Thread((java.lang.Runnable)var42);
    java.lang.Thread var49 = new java.lang.Thread(var32, (java.lang.Runnable)var42, "hi!", 10L);
    java.lang.ThreadGroup var51 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup var53 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var54 = new java.lang.ThreadGroup[] { var53};
    int var56 = var51.enumerate(var54, true);
    int var57 = var32.enumerate(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    int var2 = var1.activeGroupCount();
    var1.checkAccess();
    java.lang.String var4 = var1.getName();
    java.lang.Thread var6 = new java.lang.Thread(var1, "");
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    var1.stop();
    java.lang.String var7 = var1.getName();
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var10 = new java.lang.Thread();
    java.lang.Thread var13 = new java.lang.Thread(var9, (java.lang.Runnable)var10, "hi!", 10L);
    int var14 = var9.activeCount();
    boolean var15 = var1.parentOf(var9);
    java.lang.String var16 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "java.lang.ThreadGroup[name=hi!,maxpri=10]"+ "'", var16.equals("java.lang.ThreadGroup[name=hi!,maxpri=10]"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread var2 = new java.lang.Thread();
    java.lang.Thread var5 = new java.lang.Thread(var1, (java.lang.Runnable)var2, "hi!", 10L);
    java.lang.Thread var6 = new java.lang.Thread((java.lang.Runnable)var2);
    java.lang.Thread var7 = new java.lang.Thread((java.lang.Runnable)var6);

  }

}
