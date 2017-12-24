
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var1 = java.lang.reflect.Modifier.isFinal(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.Reflection var0 = new sun.reflect.Reflection();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.reflect.ReflectionFactory var0 = sun.reflect.ReflectionFactory.getReflectionFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var1 = java.lang.reflect.Modifier.isStatic(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var0 = java.lang.reflect.Modifier.constructorModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 7);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = var1.codePointCount(10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    boolean var1 = java.lang.reflect.Modifier.isAbstract(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    char[] var6 = new char[] { '#'};
    java.lang.StringBuffer var7 = var1.insert(0, var6);
    java.lang.StringBuffer var10 = var7.insert(0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setCharAt(7, '#');
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    boolean var2 = var0.equals((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var0 = java.lang.reflect.Modifier.classModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3103);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var1 = java.lang.reflect.Modifier.isNative(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.misc.FloatingDecimal var1 = sun.misc.FloatingDecimal.readJavaFormatString("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var1 = java.lang.reflect.Modifier.isStatic(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    int var6 = var1.lastIndexOf("", 100);
    java.lang.StringBuffer var8 = new java.lang.StringBuffer(1);
    var8.setLength(1);
    char[] var13 = new char[] { '#'};
    java.lang.StringBuffer var14 = var8.insert(0, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var17 = var1.append((java.lang.CharSequence)var14, 1, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.CharSequence var4 = var1.subSequence(10, 3103);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var1 = new java.lang.StringBuilder((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(1);
    java.lang.StringBuilder var4 = new java.lang.StringBuilder(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var7 = var1.insert(3103, (java.lang.CharSequence)var4, 1, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    char[] var6 = new char[] { '#'};
    java.lang.StringBuffer var7 = var1.insert(0, var6);
    java.lang.StringBuffer var10 = var7.insert(0, false);
    char[] var12 = new char[] { ' '};
    java.lang.StringBuffer var13 = var7.append(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var16 = var13.insert((-1), 100.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    boolean var1 = java.lang.reflect.Modifier.isNative(3103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "", 100, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var4 = var1.insert(10, 0.0d);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    char[] var6 = new char[] { '#'};
    java.lang.StringBuffer var7 = var1.insert(0, var6);
    java.lang.StringBuffer var10 = var7.insert(0, false);
    char[] var12 = new char[] { ' '};
    java.lang.StringBuffer var13 = var7.append(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var17 = var13.replace(10, 1, "");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    boolean var1 = java.lang.reflect.Modifier.isAbstract(3103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(1);
    java.lang.String var2 = var1.toString();
    java.lang.StringBuilder var4 = var1.append(0.0f);
    java.lang.StringBuilder var5 = var1.reverse();
    java.lang.StringBuilder var7 = new java.lang.StringBuilder(1);
    java.lang.String var8 = var7.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var11 = var5.append((java.lang.CharSequence)var7, 0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(1);
    java.lang.StringBuilder var2 = var1.reverse();
    java.lang.StringBuffer var5 = new java.lang.StringBuffer(1);
    var5.setLength(1);
    char[] var10 = new char[] { '#'};
    java.lang.StringBuffer var11 = var5.insert(0, var10);
    java.lang.StringBuffer var14 = var11.insert(0, false);
    char[] var16 = new char[] { ' '};
    java.lang.StringBuffer var17 = var11.append(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var18 = var2.insert(10, var16);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.lang.StringBuilder var1 = new java.lang.StringBuilder(1);
    java.lang.String var2 = var1.toString();
    java.lang.StringBuilder var4 = var1.append(0.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var7 = var4.insert(10, 0.0d);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    int var0 = java.lang.reflect.Modifier.methodModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3391);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var1 = java.lang.reflect.Modifier.isStrict(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    char[] var6 = new char[] { '#'};
    java.lang.StringBuffer var7 = var1.insert(0, var6);
    java.lang.StringBuffer var9 = var1.append(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var9.codePointBefore((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.String var1 = java.lang.reflect.Modifier.toString(3391);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "public protected private abstract static final synchronized native strictfp"+ "'", var1.equals("public protected private abstract static final synchronized native strictfp"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer("public protected private abstract static final synchronized native strictfp");

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    var1.setLength(1);
    char[] var6 = new char[] { '#'};
    java.lang.StringBuffer var7 = var1.insert(0, var6);
    java.lang.StringBuffer var9 = var7.append("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
