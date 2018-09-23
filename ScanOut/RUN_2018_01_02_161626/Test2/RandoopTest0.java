
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    var1.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    int var4 = var1.getMaxPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    boolean var2 = var1.isDaemon();
    java.lang.ThreadGroup var4 = new java.lang.ThreadGroup("hi!");
    java.lang.String var5 = var4.getName();
    var4.list();
    java.lang.ThreadGroup var8 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var9 = new java.lang.Thread[] { };
    int var10 = var8.enumerate(var9);
    boolean var11 = var4.parentOf(var8);
    boolean var12 = var4.isDaemon();
    java.lang.ThreadGroup var14 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var15 = new java.lang.Thread[] { };
    int var16 = var14.enumerate(var15);
    int var17 = var4.enumerate(var15);
    java.lang.ThreadGroup[] var18 = new java.lang.ThreadGroup[] { var4};
    int var19 = var1.enumerate(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    boolean var9 = var1.isDaemon();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var12 = new java.lang.Thread[] { };
    int var13 = var11.enumerate(var12);
    int var14 = var1.enumerate(var12);
    java.lang.String var15 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    var5.checkAccess();
    boolean var10 = var5.isDestroyed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    int var9 = var1.activeCount();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("hi!");
    java.lang.String var12 = var11.getName();
    var11.list();
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var16 = new java.lang.Thread[] { };
    int var17 = var15.enumerate(var16);
    boolean var18 = var11.parentOf(var15);
    boolean var19 = var11.isDaemon();
    java.lang.Thread var20 = new java.lang.Thread();
    java.lang.Thread var23 = new java.lang.Thread(var11, (java.lang.Runnable)var20, "", 10L);
    var11.suspend();
    boolean var25 = var1.parentOf(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    var5.stop();
    java.lang.Thread var11 = new java.lang.Thread(var5, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    boolean var9 = var1.isDaemon();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup(var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.resume();
    java.lang.ThreadGroup var4 = var1.getParent();
    var1.list();
    var1.suspend();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var2 = new java.lang.Thread[] { };
    int var3 = var1.enumerate(var2);
    java.lang.Thread var5 = new java.lang.Thread("hi!");
    java.lang.Thread var6 = new java.lang.Thread((java.lang.Runnable)var5);
    java.lang.Thread var7 = new java.lang.Thread(var1, (java.lang.Runnable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.String var6 = var5.getName();
    var5.list();
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var10 = new java.lang.Thread[] { };
    int var11 = var9.enumerate(var10);
    boolean var12 = var5.parentOf(var9);
    boolean var13 = var1.parentOf(var9);
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("hi!");
    java.lang.String var16 = var15.getName();
    var15.list();
    java.lang.ThreadGroup var19 = new java.lang.ThreadGroup("hi!");
    java.lang.String var20 = var19.getName();
    var19.list();
    java.lang.ThreadGroup var23 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var24 = new java.lang.Thread[] { };
    int var25 = var23.enumerate(var24);
    boolean var26 = var19.parentOf(var23);
    boolean var27 = var15.parentOf(var23);
    boolean var28 = var9.parentOf(var23);
    java.lang.ThreadGroup var30 = new java.lang.ThreadGroup(var9, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.String var6 = var5.getName();
    var5.list();
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var10 = new java.lang.Thread[] { };
    int var11 = var9.enumerate(var10);
    boolean var12 = var5.parentOf(var9);
    boolean var13 = var1.parentOf(var9);
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var16 = new java.lang.ThreadGroup[] { var15};
    int var17 = var1.enumerate(var16);
    var1.setMaxPriority(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var2 = new java.lang.Thread[] { };
    int var3 = var1.enumerate(var2);
    java.lang.Thread var5 = new java.lang.Thread(var1, "hi!");
    java.lang.Thread var7 = new java.lang.Thread(var1, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.resume();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    int var8 = var1.enumerate(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.String var6 = var5.getName();
    var5.list();
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var10 = new java.lang.Thread[] { };
    int var11 = var9.enumerate(var10);
    boolean var12 = var5.parentOf(var9);
    boolean var13 = var1.parentOf(var9);
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("hi!");
    java.lang.String var16 = var15.getName();
    var15.list();
    java.lang.ThreadGroup var19 = new java.lang.ThreadGroup("hi!");
    java.lang.String var20 = var19.getName();
    var19.list();
    java.lang.ThreadGroup var23 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var24 = new java.lang.Thread[] { };
    int var25 = var23.enumerate(var24);
    boolean var26 = var19.parentOf(var23);
    boolean var27 = var15.parentOf(var23);
    boolean var28 = var9.parentOf(var23);
    java.lang.ThreadGroup var30 = new java.lang.ThreadGroup(var23, "hi!");
    java.lang.ThreadGroup var32 = new java.lang.ThreadGroup("hi!");
    java.lang.String var33 = var32.getName();
    var32.list();
    java.lang.ThreadGroup var36 = new java.lang.ThreadGroup("hi!");
    java.lang.String var37 = var36.getName();
    var36.list();
    java.lang.ThreadGroup var40 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var41 = new java.lang.Thread[] { };
    int var42 = var40.enumerate(var41);
    boolean var43 = var36.parentOf(var40);
    boolean var44 = var32.parentOf(var40);
    java.lang.ThreadGroup var46 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var47 = new java.lang.ThreadGroup[] { var46};
    int var48 = var32.enumerate(var47);
    int var49 = var23.enumerate(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.resume();
    boolean var5 = var1.allowThreadSuspension(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    int var9 = var1.activeCount();
    java.lang.ThreadGroup var11 = new java.lang.ThreadGroup("hi!");
    java.lang.String var12 = var11.getName();
    var11.list();
    java.lang.ThreadGroup var15 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var16 = new java.lang.Thread[] { };
    int var17 = var15.enumerate(var16);
    boolean var18 = var11.parentOf(var15);
    boolean var19 = var11.isDaemon();
    java.lang.Thread var20 = new java.lang.Thread();
    java.lang.Thread var23 = new java.lang.Thread(var11, (java.lang.Runnable)var20, "", 10L);
    java.lang.Thread[] var24 = new java.lang.Thread[] { var20};
    int var26 = var1.enumerate(var24, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var6 = new java.lang.Thread[] { };
    int var7 = var5.enumerate(var6);
    boolean var8 = var1.parentOf(var5);
    boolean var9 = var1.isDaemon();
    java.lang.Thread var10 = new java.lang.Thread();
    java.lang.Thread var13 = new java.lang.Thread(var1, (java.lang.Runnable)var10, "", 10L);
    java.lang.Thread var15 = new java.lang.Thread((java.lang.Runnable)var13, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.list();
    java.lang.ThreadGroup var5 = new java.lang.ThreadGroup("hi!");
    java.lang.String var6 = var5.getName();
    var5.list();
    java.lang.ThreadGroup var9 = new java.lang.ThreadGroup("hi!");
    java.lang.String var10 = var9.getName();
    var9.list();
    java.lang.ThreadGroup var13 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var14 = new java.lang.Thread[] { };
    int var15 = var13.enumerate(var14);
    boolean var16 = var9.parentOf(var13);
    boolean var17 = var5.parentOf(var13);
    java.lang.ThreadGroup var19 = new java.lang.ThreadGroup("hi!");
    java.lang.String var20 = var19.getName();
    var19.list();
    java.lang.ThreadGroup var23 = new java.lang.ThreadGroup("hi!");
    java.lang.String var24 = var23.getName();
    var23.list();
    java.lang.ThreadGroup var27 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var28 = new java.lang.Thread[] { };
    int var29 = var27.enumerate(var28);
    boolean var30 = var23.parentOf(var27);
    boolean var31 = var19.parentOf(var27);
    boolean var32 = var13.parentOf(var27);
    boolean var33 = var1.parentOf(var13);
    int var34 = var13.getMaxPriority();
    java.lang.ThreadGroup var36 = new java.lang.ThreadGroup("hi!");
    java.lang.String var37 = var36.getName();
    var36.list();
    java.lang.ThreadGroup var40 = new java.lang.ThreadGroup("hi!");
    java.lang.String var41 = var40.getName();
    var40.list();
    java.lang.ThreadGroup var44 = new java.lang.ThreadGroup("hi!");
    java.lang.Thread[] var45 = new java.lang.Thread[] { };
    int var46 = var44.enumerate(var45);
    boolean var47 = var40.parentOf(var44);
    boolean var48 = var36.parentOf(var44);
    java.lang.ThreadGroup var50 = new java.lang.ThreadGroup("hi!");
    java.lang.ThreadGroup[] var51 = new java.lang.ThreadGroup[] { var50};
    int var52 = var36.enumerate(var51);
    int var53 = var13.enumerate(var51);
    int var54 = var13.activeCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.ThreadGroup var1 = new java.lang.ThreadGroup("hi!");
    java.lang.String var2 = var1.getName();
    var1.resume();
    var1.suspend();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));

  }

}
