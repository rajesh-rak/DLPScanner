
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = var1.append(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var7 = var1.charAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var1.insert(100, true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = var5.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setLength((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var4.codePointAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    int var13 = var12.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 19);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var3 = var1.append(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var3.codePointCount(10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var15 = var5.insert((-1), false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, "hi!");
    java.lang.StringBuffer var10 = var5.append(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var3 = var1.append(1L);
    java.lang.StringBuffer var5 = var3.appendCodePoint(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var8 = var3.insert(19, (-1.0d));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = var5.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var10 = var7.insert(19, 0.0d);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = var5.append(1.0d);
    int var8 = var5.length();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var1.insert(19, '4');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, (java.lang.Object)0);
    int var10 = var8.lastIndexOf("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var3 = var1.append(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var6 = var3.delete((-1), 19);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, (java.lang.Object)0);
    int var11 = var5.lastIndexOf("", 19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var14 = var5.insert(19, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.CharSequence var15 = var12.subSequence(100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    var4.ensureCapacity(100);
    java.util.stream.IntStream var8 = var4.chars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, (java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var13 = var8.insert(100, (java.lang.CharSequence)"hi!", 7, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var10.substring(10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    java.io.OptionalDataException var2 = var0.newOptionalDataExceptionForSerialization(false);
    java.io.OptionalDataException var4 = var0.newOptionalDataExceptionForSerialization(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var5.substring(10, 7);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var10.offsetByCodePoints((-1), 19);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var6 = var1.reverse();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.codePointCount(0, 19);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, (java.lang.Object)0);
    int var11 = var5.lastIndexOf("", 19);
    java.lang.StringBuffer var14 = var5.insert(0, 10L);
    java.lang.StringBuffer var16 = var14.appendCodePoint(0);
    int var17 = var14.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 19);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var3 = var1.append(1L);
    java.lang.StringBuffer var5 = var1.append('#');
    java.lang.StringBuffer var8 = new java.lang.StringBuffer("hi!");
    int var9 = var8.capacity();
    java.lang.StringBuffer var11 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var12 = var8.append((java.lang.CharSequence)var11);
    java.lang.StringBuffer var15 = var12.insert(1, (java.lang.Object)0);
    int var18 = var12.lastIndexOf("", 19);
    java.lang.StringBuffer var21 = var12.insert(0, 10L);
    java.lang.StringBuffer var23 = var21.appendCodePoint(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var26 = var1.insert(100, (java.lang.CharSequence)var23, 0, 9);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var7 = new java.lang.StringBuffer("hi!");
    int var8 = var7.capacity();
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var11 = var7.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var12 = var5.append((java.lang.CharSequence)var10);
    java.lang.StringBuffer var13 = var12.reverse();
    java.util.stream.IntStream var14 = var13.chars();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var3 = var1.append(1L);
    java.lang.StringBuffer var5 = var1.append("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    java.io.OptionalDataException var2 = var0.newOptionalDataExceptionForSerialization(false);
    java.io.OptionalDataException var4 = var0.newOptionalDataExceptionForSerialization(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    int var2 = var1.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)var4);
    java.lang.StringBuffer var8 = var5.insert(1, (java.lang.Object)0);
    int var11 = var5.lastIndexOf("", 19);
    java.lang.StringBuffer var14 = var5.insert(0, 10L);
    java.lang.StringBuffer var16 = new java.lang.StringBuffer("hi!");
    int var17 = var16.capacity();
    java.lang.StringBuffer var19 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var20 = var16.append((java.lang.CharSequence)var19);
    java.lang.StringBuffer var23 = var20.insert(1, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var26 = var5.append((java.lang.CharSequence)var23, 10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

}
