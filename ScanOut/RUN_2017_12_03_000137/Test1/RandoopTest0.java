
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, (-1));
    boolean var13 = var7.debit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    Account var0 = new Account();
    boolean var2 = var0.debit((-1));
    var0.credit(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, 1);
    Account var12 = new Account();
    boolean var14 = var12.debit((-1));
    boolean var16 = var12.debit((-1));
    var0.transfer(var12, 1);
    boolean var20 = var12.debit(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, 1);
    var0.credit(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    var0.credit(10);
    var0.credit(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    boolean var4 = var0.debit(1);
    var0.credit(0);
    var0.credit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, 1);
    Account var12 = new Account();
    boolean var14 = var12.debit((-1));
    boolean var16 = var12.debit((-1));
    var0.transfer(var12, 1);
    boolean var20 = var0.debit(1);
    Account var21 = new Account();
    boolean var23 = var21.debit(10);
    var21.credit(100);
    boolean var27 = var21.debit(10);
    var21.credit(10);
    boolean var31 = var21.debit(0);
    var0.transfer(var21, 0);
    boolean var35 = var21.debit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    boolean var4 = var0.debit(1);
    var0.credit(0);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    boolean var11 = var7.debit(1);
    boolean var13 = var7.debit((-1));
    var0.transfer(var7, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, (-1));
    var7.credit(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    boolean var4 = var0.debit(1);
    Account var5 = new Account();
    boolean var7 = var5.debit(10);
    boolean var9 = var5.debit(1);
    var5.credit(0);
    var0.transfer(var5, 0);
    var5.credit(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    Account var3 = new Account();
    boolean var5 = var3.debit(10);
    boolean var7 = var3.debit(1);
    boolean var9 = var3.debit((-1));
    var0.transfer(var3, 100);
    Account var12 = new Account();
    boolean var14 = var12.debit(10);
    Account var15 = new Account();
    boolean var17 = var15.debit(10);
    boolean var19 = var15.debit(1);
    boolean var21 = var15.debit((-1));
    var12.transfer(var15, 100);
    var0.transfer(var12, 0);
    var0.credit(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, 1);
    Account var12 = new Account();
    boolean var14 = var12.debit((-1));
    boolean var16 = var12.debit((-1));
    var0.transfer(var12, 1);
    boolean var20 = var0.debit(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    boolean var4 = var0.debit(1);
    Account var5 = new Account();
    boolean var7 = var5.debit(10);
    boolean var9 = var5.debit(1);
    var5.credit(0);
    var0.transfer(var5, 0);
    var5.credit(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(1);
    var0.credit(1);
    Account var5 = new Account();
    boolean var7 = var5.debit(10);
    boolean var9 = var5.debit(1);
    Account var10 = new Account();
    boolean var12 = var10.debit(10);
    boolean var14 = var10.debit(1);
    var10.credit(0);
    var5.transfer(var10, 0);
    var10.credit(10);
    var0.transfer(var10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    Account var3 = new Account();
    boolean var5 = var3.debit(10);
    boolean var7 = var3.debit(1);
    boolean var9 = var3.debit((-1));
    var0.transfer(var3, 100);
    var3.credit(10);
    boolean var15 = var3.debit(100);
    var3.credit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    Account var3 = new Account();
    boolean var5 = var3.debit(10);
    boolean var7 = var3.debit(1);
    boolean var9 = var3.debit((-1));
    var0.transfer(var3, 100);
    Account var12 = new Account();
    boolean var14 = var12.debit(10);
    Account var15 = new Account();
    boolean var17 = var15.debit(10);
    boolean var19 = var15.debit(1);
    boolean var21 = var15.debit((-1));
    var12.transfer(var15, 100);
    var0.transfer(var12, 0);
    boolean var27 = var0.debit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    boolean var4 = var0.debit(1);
    var0.credit(0);
    boolean var8 = var0.debit(10);
    Account var9 = new Account();
    boolean var11 = var9.debit(10);
    boolean var13 = var9.debit(1);
    var9.credit(0);
    boolean var17 = var9.debit(10);
    var9.credit(10);
    var9.credit(10);
    var0.transfer(var9, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    var0.credit(0);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var7.credit(100);
    boolean var13 = var7.debit(10);
    Account var14 = new Account();
    boolean var16 = var14.debit(10);
    var7.transfer(var14, 1);
    Account var19 = new Account();
    boolean var21 = var19.debit((-1));
    boolean var23 = var19.debit((-1));
    var7.transfer(var19, 1);
    var0.transfer(var19, 10);
    Account var28 = new Account();
    boolean var30 = var28.debit(10);
    boolean var32 = var28.debit(1);
    Account var33 = new Account();
    boolean var35 = var33.debit(10);
    boolean var37 = var33.debit(1);
    var33.credit(0);
    var28.transfer(var33, 0);
    var0.transfer(var33, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    Account var3 = new Account();
    boolean var5 = var3.debit(10);
    boolean var7 = var3.debit(1);
    boolean var9 = var3.debit((-1));
    var0.transfer(var3, 100);
    Account var12 = new Account();
    boolean var14 = var12.debit(10);
    Account var15 = new Account();
    boolean var17 = var15.debit(10);
    boolean var19 = var15.debit(1);
    boolean var21 = var15.debit((-1));
    var12.transfer(var15, 100);
    var0.transfer(var12, 0);
    var12.credit(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    Account var0 = new Account();
    boolean var2 = var0.debit(10);
    var0.credit(100);
    boolean var6 = var0.debit(10);
    Account var7 = new Account();
    boolean var9 = var7.debit(10);
    var0.transfer(var7, 1);
    Account var12 = new Account();
    boolean var14 = var12.debit((-1));
    boolean var16 = var12.debit((-1));
    var0.transfer(var12, 1);
    boolean var20 = var0.debit(1);
    Account var21 = new Account();
    boolean var23 = var21.debit(10);
    var21.credit(100);
    boolean var27 = var21.debit(10);
    var21.credit(10);
    boolean var31 = var21.debit(0);
    var0.transfer(var21, 0);
    Account var34 = new Account();
    boolean var36 = var34.debit(10);
    var34.credit(100);
    boolean var40 = var34.debit(10);
    Account var41 = new Account();
    boolean var43 = var41.debit(10);
    var34.transfer(var41, (-1));
    var0.transfer(var34, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

}
