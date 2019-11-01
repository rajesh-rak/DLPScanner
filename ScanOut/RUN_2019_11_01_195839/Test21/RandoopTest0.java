
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
      java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
      fail("Expected exception of type java.lang.InternalError");
    } catch (java.lang.InternalError e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var3 = var0.longs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    long var3 = var0.nextLong();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 4072142036655552113L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Random var1 = new java.util.Random((-1L));
    java.util.stream.DoubleStream var4 = var1.doubles((-1.0d), 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    boolean var9 = var0.nextBoolean();
    int var10 = var0.nextInt();
    java.util.stream.IntStream var12 = var0.ints(4072142036655552113L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 52699159);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    float var5 = var0.nextFloat();
    byte[] var7 = new byte[] { (byte)0};
    var0.nextBytes(var7);
    byte[] var10 = new byte[] { (byte)100};
    var0.nextBytes(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2689426f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    int var13 = var0.nextInt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1941176418));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Random var1 = new java.util.Random(10L);
    int var2 = var1.nextInt();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1157793070));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    java.security.DomainCombiner var1 = var0.getDomainCombiner();
    java.security.DomainCombiner var2 = var0.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    double var10 = var0.nextGaussian();
    java.util.stream.IntStream var11 = var0.ints();
    double var12 = var0.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0534899740148704d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2.2106337882542078d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    java.util.stream.LongStream var14 = var0.longs(4072142036655552113L);
    double var15 = var0.nextDouble();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5480346480322552d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.nextInt((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    java.util.stream.DoubleStream var6 = var0.doubles(0L);
    byte[] var10 = new byte[] { (byte)1, (byte)10, (byte)1};
    var0.nextBytes(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    java.util.stream.LongStream var4 = var0.longs(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    int var14 = var0.nextInt(10);
    java.util.stream.DoubleStream var16 = var0.doubles(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    double var13 = var0.nextGaussian();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0534899740148704d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Random var1 = new java.util.Random(4072142036655552113L);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.stream.DoubleStream var5 = var0.doubles(10L, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    float var5 = var0.nextFloat();
    var0.setSeed(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2689426f);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    int var14 = var0.nextInt(10);
    java.util.stream.DoubleStream var16 = var0.doubles(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Random var1 = new java.util.Random((-1L));
    java.util.stream.DoubleStream var2 = var1.doubles();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    java.util.stream.LongStream var14 = var0.longs(4072142036655552113L);
    long var15 = var0.nextLong();
    java.util.stream.LongStream var18 = var0.longs((-8337289232527761815L), 0L);
    java.util.stream.IntStream var19 = var0.ints();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-8337289232527761815L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Random var0 = new java.util.Random();
    java.util.stream.IntStream var1 = var0.ints();
    java.util.stream.LongStream var2 = var0.longs();
    var0.setSeed((-1L));
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    var0.nextBytes(var7);
    double var9 = var0.nextDouble();
    java.util.stream.DoubleStream var12 = var0.doubles(0.0d, 1.0d);
    java.util.stream.LongStream var14 = var0.longs(4072142036655552113L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.stream.LongStream var16 = var0.longs((-8337289232527761815L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4395620079676803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
