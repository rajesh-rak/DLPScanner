
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var11 = var1.insert(1, 'a');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var3 = var1.deleteCharAt(1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var1.substring((-1), (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var1.append((java.lang.CharSequence)"", 0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var4 = var1.insert((-1), (java.lang.CharSequence)"");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.codePointCount(1, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    java.lang.StringBuffer var10 = new java.lang.StringBuffer("");
    int var13 = var10.indexOf("", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var16 = var1.append((java.lang.CharSequence)"", 10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    java.lang.StringBuffer var10 = new java.lang.StringBuffer(10);
    char[] var12 = new char[] { '4'};
    java.lang.StringBuffer var15 = var10.append(var12, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.getChars((-1), 100, var12, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    int var4 = var1.indexOf("", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.offsetByCodePoints((-1), (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLength((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var4 = var1.delete((-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var11 = var1.insert(1, (java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    var1.setLength(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var12 = var1.insert(10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    java.lang.StringBuffer var11 = new java.lang.StringBuffer(10);
    char[] var13 = new char[] { '4'};
    java.lang.StringBuffer var16 = var11.append(var13, 1, 0);
    java.lang.StringBuffer var17 = var1.append((java.lang.CharSequence)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var19 = var16.deleteCharAt(0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    java.lang.StringBuffer var11 = new java.lang.StringBuffer(10);
    char[] var13 = new char[] { '4'};
    java.lang.StringBuffer var16 = var11.append(var13, 1, 0);
    java.lang.StringBuffer var17 = var1.append((java.lang.CharSequence)var16);
    int var18 = var17.length();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    java.lang.StringBuffer var2 = new java.lang.StringBuffer((java.lang.CharSequence)"");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.substring(1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    char[] var1 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var4 = var0.append(var1, (-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    java.lang.StringBuffer var8 = var6.append((java.lang.Object)(-1L));
    int var10 = var8.indexOf("hi!");
    java.lang.StringBuffer var12 = var8.appendCodePoint(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    java.lang.StringBuffer var8 = var6.append((java.lang.Object)(-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.codePointCount(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    int var10 = var1.length();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    java.lang.StringBuffer var11 = new java.lang.StringBuffer(10);
    char[] var13 = new char[] { '4'};
    java.lang.StringBuffer var16 = var11.append(var13, 1, 0);
    java.lang.StringBuffer var17 = var1.append((java.lang.CharSequence)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var20 = var17.insert(10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var3 = new java.lang.StringBuffer(10);
    char[] var5 = new char[] { '4'};
    java.lang.StringBuffer var8 = var3.append(var5, 1, 0);
    java.lang.StringBuffer var11 = var3.insert(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var14 = var0.insert((-1), (java.lang.CharSequence)var3, 10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    int var1 = var0.length();
    char[] var6 = new char[] { '#', '#', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var9 = var0.insert(0, var6, (-1), 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.substring(100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    java.lang.StringBuffer var8 = new java.lang.StringBuffer(10);
    char[] var10 = new char[] { '4'};
    java.lang.StringBuffer var13 = var8.append(var10, 1, 0);
    java.lang.StringBuffer var16 = var6.append(var10, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    java.lang.StringBuffer var9 = var1.insert(0, 10);
    java.lang.StringBuffer var11 = var9.append(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var1.codePointBefore(10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var8 = var1.lastIndexOf("hi!");
    int var11 = var1.lastIndexOf("", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("");
    int var4 = var1.indexOf("", 0);
    int var7 = var1.indexOf("hi!", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(10);
    char[] var3 = new char[] { '4'};
    java.lang.StringBuffer var6 = var1.append(var3, 1, 0);
    int var9 = var1.indexOf("", 1);
    java.lang.StringBuffer var11 = new java.lang.StringBuffer(10);
    char[] var13 = new char[] { '4'};
    java.lang.StringBuffer var16 = var11.append(var13, 1, 0);
    java.lang.StringBuffer var17 = var1.append((java.lang.CharSequence)var16);
    char[] var22 = new char[] { ' ', ' ', '4'};
    java.lang.StringBuffer var23 = var16.insert(0, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    java.lang.StringBuffer var5 = new java.lang.StringBuffer(10);
    char[] var7 = new char[] { '4'};
    java.lang.StringBuffer var10 = var5.append(var7, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.getChars(100, 1, var7, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
