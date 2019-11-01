
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var1 = java.lang.reflect.Modifier.isStrict((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    boolean var1 = java.lang.reflect.Modifier.isStatic((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.offsetByCodePoints((-1), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var2 = var0.charAt(0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.substring(1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = sun.misc.FloatingDecimal.toJavaFormatString(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var1 = java.lang.reflect.Modifier.isSynchronized(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    boolean var1 = java.lang.reflect.Modifier.isStatic(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var1 = java.lang.reflect.Modifier.isInterface(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.reflect.Modifier.toString(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "public"+ "'", var1.equals("public"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var7 = var0.insert((-1), '4');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var1 = java.lang.reflect.Modifier.isStrict(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("public", "1.0");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.security.provider.PolicyFile var0 = new sun.security.provider.PolicyFile();

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    boolean var1 = java.lang.reflect.Modifier.isStatic(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLength((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    char[] var9 = new char[] { 'a', 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.getChars(1, 0, var9, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.appendCodePoint(1);
    java.lang.StringBuffer var4 = var0.append(1.0d);
    java.lang.StringBuffer var6 = var4.append("hi!");
    java.lang.StringBuffer var7 = new java.lang.StringBuffer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var10 = var4.append((java.lang.CharSequence)var7, 100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setCharAt((-1), ' ');
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    java.lang.StringBuffer var6 = var0.append((java.lang.Object)(byte)1);
    java.lang.StringBuffer var8 = var6.append((-1.0d));
    java.util.stream.IntStream var9 = var8.chars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.appendCodePoint(1);
    java.lang.StringBuffer var4 = var0.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var6 = var0.charAt(10);
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
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    java.lang.StringBuffer var6 = var0.append((java.lang.Object)(byte)1);
    java.lang.StringBuffer var8 = var6.append((-1.0d));
    var8.setLength(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    java.lang.StringBuffer var6 = var0.append((java.lang.Object)(byte)1);
    java.lang.StringBuffer var8 = var6.append((-1.0d));
    java.lang.StringBuffer var10 = var6.append(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    java.lang.StringBuffer var6 = var0.append((java.lang.Object)(byte)1);
    java.lang.StringBuffer var8 = var6.append((-1.0d));
    java.util.stream.IntStream var9 = var6.chars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    sun.misc.FloatingDecimal var3 = new sun.misc.FloatingDecimal();
    java.lang.StringBuffer var4 = var0.append((java.lang.Object)var3);
    java.lang.StringBuffer var6 = var0.append((java.lang.Object)(byte)1);
    java.lang.StringBuffer var8 = var6.append((-1.0d));
    var6.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.append("1.0");
    java.lang.StringBuffer var5 = var0.delete(0, 1);
    var5.ensureCapacity(10);
    var5.ensureCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var1 = java.lang.reflect.Modifier.isPrivate(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var1 = new java.lang.Thread((java.lang.Runnable)var0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var3 = var0.insert(1, ' ');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();
    java.lang.StringBuffer var2 = var0.appendCodePoint(1);
    java.lang.StringBuffer var4 = var0.append(1.0d);
    java.lang.StringBuilder var5 = new java.lang.StringBuilder((java.lang.CharSequence)var4);
    java.util.stream.IntStream var6 = var5.chars();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
