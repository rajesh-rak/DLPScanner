
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.Integer.toString(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    char[] var3 = new char[] { 'a', 'a', '#'};
    java.lang.String var4 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "aa#"+ "'", var4.equals("aa#"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    short[] var2 = new short[] { (short)1, (short)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = java.util.Arrays.binarySearch(var2, (-1), (-1), (short)(-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var1 = java.lang.Long.highestOneBit(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var1 = java.lang.reflect.Modifier.isInterface(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    float[] var2 = new float[] { 10.0f, 1.0f};
    java.util.Arrays.sort(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    boolean var1 = java.lang.reflect.Modifier.isFinal(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    int var0 = java.lang.reflect.Modifier.classModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3103);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double[] var1 = new double[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.fill(var1, 100, (-1), 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    short[] var0 = new short[] { };
    int var2 = java.util.Arrays.binarySearch(var0, (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var0 = java.lang.reflect.Modifier.methodModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3391);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)0};
    java.lang.String var3 = java.util.Arrays.toString(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[-1, 0]"+ "'", var3.equals("[-1, 0]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double[] var1 = new double[] { (-1.0d)};
    java.lang.String var2 = java.util.Arrays.toString(var1);
    int var4 = java.util.Arrays.binarySearch(var1, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[-1.0]"+ "'", var2.equals("[-1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-2));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    long[] var1 = new long[] { (-1L)};
    java.lang.String var2 = java.util.Arrays.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[-1]"+ "'", var2.equals("[-1]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    char[] var3 = new char[] { '#', 'a', 'a'};
    char[] var6 = new char[] { ' ', '4'};
    boolean var7 = java.util.Arrays.equals(var3, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(3391);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getSigners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Field var3 = var0.getDeclaredField("-1");
      fail("Expected exception of type java.lang.NoSuchFieldException");
    } catch (java.lang.NoSuchFieldException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.Object[] var1 = new java.lang.Object[] { 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Arrays.fill(var1, 1, 100, (java.lang.Object)false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient((-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getSigners();
    boolean var2 = var0.isAnnotation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Integer var2 = java.lang.Integer.getInteger("[-1.0]", (java.lang.Integer)3103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 3103+ "'", var2.equals(3103));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    short[] var1 = new short[] { (short)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = java.util.Arrays.binarySearch(var1, 0, (-1), (short)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.String var1 = java.lang.Integer.toBinaryString(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1100100"+ "'", var1.equals("1100100"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    int var1 = java.lang.Integer.signum(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    int[] var2 = new int[] { 100, 1};
    java.util.Arrays.sort(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var2, 100, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = java.lang.Integer.parseInt("[-1.0]");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    double[] var1 = new double[] { (-1.0d)};
    java.lang.String var2 = java.util.Arrays.toString(var1);
    java.util.Arrays.fill(var1, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[-1.0]"+ "'", var2.equals("[-1.0]"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.ClassLoader var1 = var0.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.NoClassDefFoundError var1 = new java.lang.NoClassDefFoundError("hi!");

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getSigners();
    java.lang.reflect.Type var2 = var0.getGenericSuperclass();
    boolean var3 = var0.isPrimitive();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var5 = var4.getSigners();
    java.lang.String var6 = java.lang.String.valueOf((java.lang.Object)var4);
    java.lang.Class[] var7 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var8 = var0.getConstructor(var7);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "class randoop.util.ReflectionCode"+ "'", var6.equals("class randoop.util.ReflectionCode"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getSigners();
    java.lang.reflect.Type var2 = var0.getGenericSuperclass();
    java.io.ObjectStreamClass var3 = java.io.ObjectStreamClass.lookupAny(var0);
    java.lang.annotation.Annotation[] var4 = var0.getAnnotations();
    java.lang.reflect.Constructor var5 = var0.getEnclosingConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var1 = var0.getSigners();
    java.lang.reflect.Field[] var2 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var3 = sun.reflect.Reflection.filterFields(var0, var2);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass();
    java.lang.Object[] var6 = var5.getSigners();
    java.lang.String var7 = java.lang.String.valueOf((java.lang.Object)var5);
    java.lang.Object[] var8 = java.util.Arrays.copyOf((java.lang.Object[])var3, 100, var5);

  }

}
