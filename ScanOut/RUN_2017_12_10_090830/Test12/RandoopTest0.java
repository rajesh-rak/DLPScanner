
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    short[] var0 = new short[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      short[] var3 = java.util.Arrays.copyOfRange(var0, 10, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var1 = java.lang.Integer.numberOfTrailingZeros((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = java.lang.reflect.Modifier.isPublic((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String var2 = java.lang.Integer.toString(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "1"+ "'", var2.equals("1"));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    short[] var3 = new short[] { (short)(-1), (short)(-1), (short)(-1)};
    short[] var6 = java.util.Arrays.copyOfRange(var3, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long[] var1 = new long[] { 0L};
    java.util.Arrays.fill(var1, 0, 1, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = java.lang.Integer.reverseBytes(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 167772160);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    int var1 = java.lang.Integer.highestOneBit(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Integer var1 = new java.lang.Integer(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 8+ "'", var1.equals(8));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    int var0 = java.lang.reflect.Modifier.constructorModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double[] var0 = new double[] { };
    double[] var2 = new double[] { 10.0d};
    boolean var3 = java.util.Arrays.equals(var0, var2);
    java.lang.String var4 = java.util.Arrays.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.reflect.Modifier var0 = new java.lang.reflect.Modifier();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    short[] var3 = new short[] { (short)10, (short)10, (short)1};
    java.lang.String var4 = java.util.Arrays.toString(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[10, 10, 1]"+ "'", var4.equals("[10, 10, 1]"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    java.util.Arrays.fill(var0, (byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.sort(var0, 8, 167772160);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int[] var1 = new int[] { 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = java.util.Arrays.binarySearch(var1, 8, 100, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var3 = var1.append((java.lang.CharSequence)"1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var1.codePointBefore(0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Object[] var1 = new java.lang.Object[] { "1.0"};
    java.util.List var2 = java.util.Arrays.asList(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    java.util.Arrays.fill(var0, (byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.fill(var0, 1, 10, (byte)(-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    int var1 = java.lang.Integer.signum(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1};
    java.util.Arrays.fill(var1, (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var3 = var1.append((java.lang.CharSequence)"1");
    java.lang.StringBuffer var5 = var3.append((java.lang.Object)(-1.0f));
    int var7 = var5.indexOf("[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.IOException var0 = new java.io.IOException();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var3 = var1.append((java.lang.CharSequence)"1");
    char[] var4 = new char[] { };
    java.lang.StringBuffer var5 = var1.append(var4);
    java.lang.String var6 = java.lang.String.valueOf(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 1};
    java.lang.String var2 = java.util.Arrays.deepToString(var1);
    java.util.Arrays.fill(var1, (java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[1]"+ "'", var2.equals("[1]"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    boolean var1 = sun.security.util.Debug.isOn("[10, 10, 1]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    float[] var0 = new float[] { };
    int var2 = java.util.Arrays.binarySearch(var0, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var3 = var1.append((java.lang.CharSequence)"1");
    java.lang.StringBuffer var5 = var3.append((java.lang.Object)(-1.0f));
    java.lang.StringBuffer var7 = var5.append(10.0f);
    java.lang.StringBuffer var10 = var7.insert(0, "1");
    var10.setLength(0);
    java.lang.StringBuffer var15 = var10.insert(0, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double[] var0 = new double[] { };
    double[] var2 = new double[] { 10.0d};
    boolean var3 = java.util.Arrays.equals(var0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = java.util.Arrays.binarySearch(var0, (-1), 0, (-1.0d));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    long[] var1 = new long[] { 0L};
    java.util.Arrays.sort(var1);
    int var4 = java.util.Arrays.binarySearch(var1, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var3 = var1.append((java.lang.CharSequence)"1");
    char[] var4 = new char[] { };
    java.lang.StringBuffer var5 = var1.append(var4);
    java.lang.String var6 = new java.lang.String(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    int[] var2 = new int[] { 0, 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.sort(var2, 7, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    double[] var3 = new double[] { 100.0d, 1.0d, 1.0d};
    double[] var5 = java.util.Arrays.copyOf(var3, 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    long[] var0 = new long[] { };
    java.lang.String var1 = java.util.Arrays.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = new java.lang.String(var0, "1.0");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    boolean[] var3 = new boolean[] { false, false, false};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.fill(var3, 10, 1, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
