
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable var4 = new java.lang.Throwable("hi!");
    var1.addSuppressed(var4);
    java.lang.Throwable var6 = new java.lang.Throwable("", var4);
    java.lang.Throwable[] var7 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.String var1 = var0.toString();
    java.lang.Throwable[] var2 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "java.lang.Throwable"+ "'", var1.equals("java.lang.Throwable"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: hi!"+ "'", var3.equals("java.lang.Throwable: hi!"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Throwable var2 = new java.lang.Throwable(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Throwable var2 = new java.lang.Throwable("");
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.Throwable var6 = new java.lang.Throwable("hi!");
    var3.addSuppressed(var6);
    var2.addSuppressed(var6);
    java.lang.String var9 = var6.toString();
    java.lang.Throwable var10 = new java.lang.Throwable("java.lang.Throwable", var6);
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.lang.Throwable: hi!"+ "'", var9.equals("java.lang.Throwable: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var11.equals("java.lang.Throwable: java.lang.Throwable"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable(var1);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.Throwable: hi!"+ "'", var4.equals("java.lang.Throwable: hi!"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Throwable var4 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var5 = new java.lang.Throwable("java.lang.Throwable: hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Throwable var2 = new java.lang.Throwable("hi!");
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Throwable var4 = new java.lang.Throwable("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    var0.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var3);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    var0.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var3);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Throwable var7 = new java.lang.Throwable();
    java.lang.Throwable[] var8 = var7.getSuppressed();
    java.lang.Throwable var10 = new java.lang.Throwable("hi!");
    var7.addSuppressed(var10);
    java.lang.Throwable var12 = new java.lang.Throwable(var10);
    var5.addSuppressed(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: hi!");
    java.lang.Throwable var2 = new java.lang.Throwable(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    var0.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var3);
    java.lang.Throwable var6 = new java.lang.Throwable(var3);
    java.lang.Throwable var8 = new java.lang.Throwable("");
    java.lang.Throwable var9 = new java.lang.Throwable(var8);
    var3.addSuppressed(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    var0.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var3);
    java.lang.Throwable var6 = new java.lang.Throwable(var3);
    java.lang.Throwable var7 = new java.lang.Throwable();
    java.lang.Throwable[] var8 = var7.getSuppressed();
    java.lang.Throwable var10 = new java.lang.Throwable("hi!");
    var7.addSuppressed(var10);
    java.lang.Throwable var12 = new java.lang.Throwable(var10);
    java.lang.Throwable var13 = new java.lang.Throwable(var10);
    var3.addSuppressed(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable("");
    java.lang.Throwable var5 = new java.lang.Throwable();
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Throwable var8 = new java.lang.Throwable("hi!");
    var5.addSuppressed(var8);
    var4.addSuppressed(var8);
    java.lang.String var11 = var8.toString();
    java.lang.Throwable var12 = new java.lang.Throwable("java.lang.Throwable", var8);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    var1.addSuppressed(var12);
    java.lang.Throwable var15 = new java.lang.Throwable("java.lang.Throwable: hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "java.lang.Throwable: hi!"+ "'", var11.equals("java.lang.Throwable: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Throwable var2 = new java.lang.Throwable("");
    java.lang.Throwable var4 = new java.lang.Throwable("");
    java.lang.Throwable var5 = new java.lang.Throwable(var4);
    var2.addSuppressed(var5);
    java.lang.Throwable[] var7 = var2.getSuppressed();
    java.lang.Throwable var8 = new java.lang.Throwable("java.lang.Throwable", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable");

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    var0.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var3);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.lang.Throwable: java.lang.Throwable: hi!"+ "'", var7.equals("java.lang.Throwable: java.lang.Throwable: hi!"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Throwable var2 = new java.lang.Throwable("hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("java.lang.Throwable: hi!", var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable");

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Throwable var5 = new java.lang.Throwable("hi!");
    var2.addSuppressed(var5);
    var1.addSuppressed(var5);
    java.lang.Throwable[] var8 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");
    java.lang.Throwable var3 = new java.lang.Throwable("");
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var1.addSuppressed(var4);
    java.lang.Throwable var6 = new java.lang.Throwable(var1);
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.lang.Throwable: "+ "'", var7.equals("java.lang.Throwable: "));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable var3 = new java.lang.Throwable(var1);
    java.lang.Throwable var4 = new java.lang.Throwable();
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.Throwable var7 = new java.lang.Throwable("hi!");
    var4.addSuppressed(var7);
    java.lang.Throwable var9 = new java.lang.Throwable(var4);
    var3.addSuppressed(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Throwable var4 = new java.lang.Throwable("");
    java.lang.Throwable var5 = new java.lang.Throwable();
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Throwable var8 = new java.lang.Throwable("hi!");
    var5.addSuppressed(var8);
    var4.addSuppressed(var8);
    java.lang.String var11 = var8.toString();
    java.lang.Throwable var12 = new java.lang.Throwable("java.lang.Throwable", var8);
    java.lang.Throwable var13 = new java.lang.Throwable("", var12);
    java.lang.Throwable[] var14 = var13.getSuppressed();
    java.lang.Throwable var15 = new java.lang.Throwable("hi!", var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "java.lang.Throwable: hi!"+ "'", var11.equals("java.lang.Throwable: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
