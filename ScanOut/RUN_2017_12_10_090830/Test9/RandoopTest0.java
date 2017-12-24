
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Throwable var1 = new java.lang.Throwable("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    var0.addSuppressed(var1);
    java.lang.Throwable var4 = new java.lang.Throwable();
    java.lang.Throwable var5 = new java.lang.Throwable(var4);
    var1.addSuppressed(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.Throwable var2 = new java.lang.Throwable(var0);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable"+ "'", var3.equals("java.lang.Throwable"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var2.addSuppressed(var3);
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var7 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var6);
    java.lang.Throwable var8 = new java.lang.Throwable(var6);
    java.lang.String var9 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.lang.Throwable: java.lang.Throwable: hi!"+ "'", var9.equals("java.lang.Throwable: java.lang.Throwable: hi!"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.Throwable var2 = new java.lang.Throwable(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    java.lang.String var3 = var2.toString();
    java.lang.Throwable var4 = new java.lang.Throwable(var2);
    java.lang.Throwable var5 = new java.lang.Throwable();
    java.lang.Throwable var6 = new java.lang.Throwable(var5);
    java.lang.Throwable var7 = new java.lang.Throwable(var5);
    var4.addSuppressed(var5);
    java.lang.Throwable var9 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: hi!", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var3.equals("java.lang.Throwable: java.lang.Throwable"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    var0.addSuppressed(var1);
    java.lang.Throwable var4 = new java.lang.Throwable(var0);
    java.lang.Throwable[] var5 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var2.addSuppressed(var3);
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var7 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var6);
    java.lang.Throwable[] var8 = var6.getSuppressed();
    java.lang.String var9 = var6.toString();
    java.lang.Throwable var10 = new java.lang.Throwable();
    java.lang.Throwable var11 = new java.lang.Throwable(var10);
    java.lang.Throwable var12 = new java.lang.Throwable(var10);
    var6.addSuppressed(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.lang.Throwable: hi!"+ "'", var9.equals("java.lang.Throwable: hi!"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var2.addSuppressed(var3);
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var7 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var6);
    java.lang.Throwable var8 = new java.lang.Throwable(var6);
    java.lang.Throwable var11 = new java.lang.Throwable();
    java.lang.Throwable var12 = new java.lang.Throwable();
    java.lang.Throwable var13 = new java.lang.Throwable(var12);
    var11.addSuppressed(var12);
    java.lang.Throwable var15 = new java.lang.Throwable("hi!", var11);
    java.lang.Throwable var16 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var15);
    java.lang.Throwable[] var17 = var15.getSuppressed();
    java.lang.String var18 = var15.toString();
    var8.addSuppressed(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "java.lang.Throwable: hi!"+ "'", var18.equals("java.lang.Throwable: hi!"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    java.lang.String var3 = var2.toString();
    java.lang.Throwable var4 = new java.lang.Throwable(var2);
    java.lang.Throwable var5 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var4);
    java.lang.String var6 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var3.equals("java.lang.Throwable: java.lang.Throwable"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "java.lang.Throwable: java.lang.Throwable: java.lang.Throwable"+ "'", var6.equals("java.lang.Throwable: java.lang.Throwable: java.lang.Throwable"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable();
    java.lang.Throwable var5 = new java.lang.Throwable(var4);
    var3.addSuppressed(var4);
    java.lang.Throwable var7 = new java.lang.Throwable("hi!", var3);
    java.lang.Throwable var8 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    java.lang.String var10 = var7.toString();
    java.lang.Throwable var11 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "java.lang.Throwable: hi!"+ "'", var10.equals("java.lang.Throwable: hi!"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.Throwable var4 = new java.lang.Throwable();
    java.lang.Throwable var5 = new java.lang.Throwable();
    java.lang.Throwable var6 = new java.lang.Throwable(var5);
    var4.addSuppressed(var5);
    java.lang.Throwable var8 = new java.lang.Throwable("hi!", var4);
    java.lang.Throwable var9 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var8);
    var0.addSuppressed(var8);
    java.lang.Throwable[] var11 = var8.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: java.lang.Throwable");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable(var2);
    var1.addSuppressed(var2);
    java.lang.Throwable var5 = new java.lang.Throwable("", var1);
    java.lang.Throwable var6 = new java.lang.Throwable(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: hi!");
    java.lang.Throwable var2 = new java.lang.Throwable(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("hi!");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    var1.addSuppressed(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.String var2 = var1.toString();
    java.lang.Throwable var3 = new java.lang.Throwable(var1);
    java.lang.Throwable var4 = new java.lang.Throwable();
    java.lang.Throwable var5 = new java.lang.Throwable(var4);
    java.lang.Throwable var6 = new java.lang.Throwable(var4);
    var3.addSuppressed(var4);
    java.lang.Throwable[] var8 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var2.equals("java.lang.Throwable: java.lang.Throwable"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    java.lang.String var3 = var2.toString();
    java.lang.Throwable var4 = new java.lang.Throwable(var2);
    java.lang.Throwable var5 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var4);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var3.equals("java.lang.Throwable: java.lang.Throwable"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable(var1);
    java.lang.Throwable var3 = new java.lang.Throwable(var1);
    java.lang.String var4 = var3.toString();
    java.lang.Throwable var5 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: hi!", var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var4.equals("java.lang.Throwable: java.lang.Throwable"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Throwable var2 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: hi!");
    java.lang.Throwable var3 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable: java.lang.Throwable", var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.String var2 = var1.toString();
    java.lang.Throwable var3 = new java.lang.Throwable(var1);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Throwable: java.lang.Throwable"+ "'", var2.equals("java.lang.Throwable: java.lang.Throwable"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.lang.Throwable: java.lang.Throwable: java.lang.Throwable"+ "'", var5.equals("java.lang.Throwable: java.lang.Throwable: java.lang.Throwable"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var2.addSuppressed(var3);
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var7 = new java.lang.Throwable("java.lang.Throwable: java.lang.Throwable", var6);
    java.lang.Throwable[] var8 = var6.getSuppressed();
    java.lang.String var9 = var6.toString();
    java.lang.Throwable[] var10 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "java.lang.Throwable: hi!"+ "'", var9.equals("java.lang.Throwable: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Throwable var1 = new java.lang.Throwable("java.lang.Throwable: hi!");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Throwable var0 = new java.lang.Throwable();
    java.lang.Throwable var1 = new java.lang.Throwable(var0);
    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable(var2);
    var1.addSuppressed(var3);
    java.lang.Throwable var5 = new java.lang.Throwable(var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Throwable var2 = new java.lang.Throwable();
    java.lang.Throwable var3 = new java.lang.Throwable();
    java.lang.Throwable var4 = new java.lang.Throwable(var3);
    var2.addSuppressed(var3);
    java.lang.Throwable var6 = new java.lang.Throwable("hi!", var2);
    java.lang.Throwable var7 = new java.lang.Throwable("hi!", var2);

  }

}
