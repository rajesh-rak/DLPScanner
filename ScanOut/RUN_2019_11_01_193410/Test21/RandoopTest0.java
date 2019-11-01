
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Random var0 = new java.util.Random();
    int var1 = var0.nextInt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1620945793);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Provider var1 = var0.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.LongStream var4 = var0.longs(10L, 1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '4'};
    var1.print(var3);
    var1.print("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    java.security.Policy.Parameters var1 = var0.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '#'};
    var1.println(var3);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"hi!");
    var1.println((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var1.println(10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var2 = new java.lang.Thread((java.lang.Runnable)var0, "");

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '#'};
    var1.println(var3);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"hi!");
    var7.print('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '#'};
    var1.println(var3);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1);
    var5.print((-1L));
    var5.print(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '#'};
    var1.println(var3);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1);
    var1.println(1.0f);
    boolean var8 = var1.checkError();
    var1.println(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '4'};
    var1.print(var3);
    java.io.PrintStream var6 = var1.append('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Random var0 = new java.util.Random();
    int var2 = var0.nextInt(1620945793);
    double var3 = var0.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1129680409);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.016542229882497657d));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    char[] var3 = new char[] { '#'};
    var1.println(var3);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1);
    boolean var6 = var5.checkError();
    var5.println('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Random var0 = new java.util.Random();
    int var2 = var0.nextInt(1620945793);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.stream.LongStream var6 = var0.longs(10L, 0L, (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1427794037);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Random var0 = new java.util.Random();
    byte[] var3 = new byte[] { (byte)100, (byte)10};
    var0.nextBytes(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Exception var2 = new java.lang.Exception("hi!");
    java.lang.Throwable var3 = new java.lang.Throwable((java.lang.Throwable)var2);
    java.lang.Exception var5 = new java.lang.Exception("hi!");
    java.lang.Throwable var6 = new java.lang.Throwable((java.lang.Throwable)var5);
    var3.addSuppressed(var6);
    java.lang.Throwable var8 = new java.lang.Throwable("", var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.print(10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var1.print(10.0d);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Random var0 = new java.util.Random();
    int var2 = var0.nextInt(1620945793);
    java.util.stream.LongStream var4 = var0.longs(1L);
    java.util.stream.LongStream var6 = var0.longs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 94517149);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    java.io.PrintStream var3 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var1.print((-1.0f));
    java.security.ProtectionDomain[] var7 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var8 = new java.security.AccessControlContext(var7);
    java.io.PrintStream var9 = var1.printf("hi!", (java.lang.Object[])var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);
    java.lang.String var3 = var2.toString();
    java.lang.Throwable[] var4 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.lang.Throwable: java.lang.Exception: hi!"+ "'", var3.equals("java.lang.Throwable: java.lang.Exception: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Exception var1 = new java.lang.Exception("hi!");
    java.lang.Throwable var2 = new java.lang.Throwable((java.lang.Throwable)var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    java.lang.Throwable var5 = new java.lang.Throwable((java.lang.Throwable)var4);
    var2.addSuppressed(var5);
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.Throwable var8 = new java.lang.Throwable();
    var5.addSuppressed(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
