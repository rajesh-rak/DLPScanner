
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = java.lang.Long.numberOfTrailingZeros((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.Long.toString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = java.lang.reflect.Modifier.isSynchronized(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    float[] var2 = new float[] { (-1.0f), 100.0f};
    java.util.Arrays.sort(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    short[] var0 = new short[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.sort(var0, 10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double[] var3 = new double[] { 10.0d, (-1.0d), 10.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = java.util.Arrays.binarySearch(var3, 0, 10, 10.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = java.lang.Integer.highestOneBit(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    byte[] var1 = new byte[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var1, 100, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    long[] var3 = new long[] { 1L, 1L, 0L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = java.util.Arrays.binarySearch(var3, (-1), 1, (-1L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    int var3 = java.util.Arrays.binarySearch(var1, (byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var1, (-4), 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Integer var1 = java.lang.Integer.valueOf("0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 0+ "'", var1.equals(0));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var2 = java.lang.Integer.compare(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    double[] var1 = new double[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.sort(var1, (-4), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected((-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    char[] var3 = new char[] { 'a', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = java.util.Arrays.binarySearch(var3, (-4), (-4), ' ');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    int var1 = java.lang.Integer.reverseBytes(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = java.lang.Integer.decode("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var1 = java.lang.Integer.parseInt("0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    float[] var3 = new float[] { 1.0f, 1.0f, (-1.0f)};
    int var5 = java.util.Arrays.binarySearch(var3, 10.0f);
    java.lang.Object[] var6 = new java.lang.Object[] { var5};
    java.lang.String var7 = java.util.Arrays.deepToString(var6);
    java.util.Arrays.sort(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[-4]"+ "'", var7.equals("[-4]"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    java.util.Arrays.fill(var1, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    int var1 = java.lang.Long.signum((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    int var0 = java.lang.reflect.Modifier.classModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3103);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.Throwable var1 = new java.lang.Throwable("hi!");
    java.lang.Exception var2 = new java.lang.Exception(var1);
    java.lang.Exception var3 = new java.lang.Exception((java.lang.Throwable)var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    int var0 = java.lang.reflect.Modifier.interfaceModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3087);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    long[] var2 = new long[] { 100L, 100L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.fill(var2, 3103, 10, (-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    long[] var0 = new long[] { };
    int var2 = java.util.Arrays.binarySearch(var0, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    float[] var3 = new float[] { (-1.0f), 0.0f, 0.0f};
    float[] var7 = new float[] { 1.0f, 1.0f, (-1.0f)};
    int var9 = java.util.Arrays.binarySearch(var7, 10.0f);
    boolean var10 = java.util.Arrays.equals(var3, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    long var2 = java.lang.Long.rotateRight((-1L), 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    char[] var2 = new char[] { ' ', '#'};
    char[] var5 = new char[] { 'a', 'a'};
    boolean var6 = java.util.Arrays.equals(var2, var5);
    java.lang.String var7 = java.lang.String.copyValueOf(var2);
    int var9 = java.util.Arrays.binarySearch(var2, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " #"+ "'", var7.equals(" #"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    long[] var2 = new long[] { 1L, 10L};
    java.util.Arrays.sort(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    int[] var3 = new int[] { 1, (-1), 10};
    int[] var5 = java.util.Arrays.copyOf(var3, 1);
    java.util.Arrays.sort(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    boolean var1 = sun.security.util.Debug.isOn(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.String var1 = java.lang.Long.toOctalString(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.Long var2 = java.lang.Long.getLong("[-4]", (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 100L+ "'", var2.equals(100L));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.lang.Integer var1 = new java.lang.Integer(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 10+ "'", var1.equals(10));

  }

}
