
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCharAt(100, ' ');
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var4 = var0.append((java.lang.CharSequence)var1, (-1), (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.CharSequence var3 = var0.subSequence(1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var2 = var0.deleteCharAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCharAt((-1), 'a');
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    char[] var7 = new char[] { ' ', '4', '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var10 = var0.insert(1, var7, 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.offsetByCodePoints(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var2.insert(10, 1L);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    var2.ensureCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    char[] var6 = new char[] { '#', '#', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var9 = var0.append(var6, 10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.substring(16, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    java.lang.StringBuffer var4 = var1.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var9 = var1.insert(0, (java.lang.CharSequence)"hi!", 0, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.substring(100, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    java.lang.StringBuffer var4 = new java.lang.StringBuffer();
    java.lang.StringBuffer var5 = new java.lang.StringBuffer();
    java.lang.StringBuffer var6 = var4.append((java.lang.CharSequence)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var0.insert(16, (java.lang.Object)var6);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    char[] var6 = new char[] { '#', '#', '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var9 = var2.append(var6, 16, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var2.insert(100, (java.lang.Object)(byte)1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer((java.lang.CharSequence)var2);
    java.lang.StringBuffer var5 = new java.lang.StringBuffer();
    java.lang.StringBuffer var6 = new java.lang.StringBuffer();
    java.lang.StringBuffer var7 = var5.append((java.lang.CharSequence)var6);
    int var8 = var7.capacity();
    java.lang.StringBuffer var9 = new java.lang.StringBuffer((java.lang.CharSequence)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var12 = var2.append((java.lang.CharSequence)var9, 16, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 16);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    char[] var5 = new char[] { '4', ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var8 = var2.append(var5, 100, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer((java.lang.CharSequence)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var4.insert((-1), (-1L));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var5 = var2.appendCodePoint(1);
    java.lang.StringBuffer var6 = new java.lang.StringBuffer((java.lang.CharSequence)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    java.lang.StringBuffer var6 = var0.replace(0, 0, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var8 = var6.deleteCharAt(16);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var4 = var2.deleteCharAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var5 = var0.indexOf("", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    java.lang.StringBuffer var4 = new java.lang.StringBuffer();
    java.lang.StringBuffer var6 = var4.append(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var1.insert((-1), (java.lang.CharSequence)var4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var4 = new java.lang.StringBuffer((java.lang.CharSequence)var2);
    java.lang.StringBuffer var5 = new java.lang.StringBuffer();
    java.lang.StringBuffer var7 = var5.append(true);
    java.lang.StringBuffer var11 = var5.replace(0, 0, "");
    java.lang.StringBuffer var12 = var4.append(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    java.lang.StringBuffer var4 = var1.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var4.codePointBefore(100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var5 = var2.insert(10, 1.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    java.lang.StringBuffer var6 = var0.replace(0, 0, "");
    java.lang.StringBuffer var7 = new java.lang.StringBuffer((java.lang.CharSequence)var6);
    var6.setCharAt(1, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var2.insert((-1), (java.lang.CharSequence)"", 10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    java.lang.StringBuffer var4 = var2.append((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var2.codePointAt(16);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    java.lang.StringBuffer var4 = var0.append('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var2.insert(100, (java.lang.CharSequence)"hi!", (-1), 16);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var4 = var1.indexOf("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    java.lang.StringBuffer var6 = var0.replace(0, 0, "");
    java.lang.StringBuffer var7 = new java.lang.StringBuffer((java.lang.CharSequence)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var7.codePointCount((-1), 16);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var5 = var2.appendCodePoint(1);
    char[] var8 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.getChars(10, (-1), var8, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var5 = var2.append(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(true);
    java.lang.StringBuffer var6 = var0.replace(0, 0, "");
    java.lang.StringBuffer var7 = new java.lang.StringBuffer((java.lang.CharSequence)var6);
    java.lang.String var9 = var6.substring(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "rue"+ "'", var9.equals("rue"));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var1 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append((java.lang.CharSequence)var1);
    int var3 = var2.capacity();
    java.lang.StringBuffer var5 = var2.appendCodePoint(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var2.codePointCount(100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append(0.0f);
    java.lang.StringBuffer var3 = new java.lang.StringBuffer();
    java.lang.StringBuffer var5 = var3.append(0.0f);
    java.lang.StringBuffer var6 = var2.append((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
