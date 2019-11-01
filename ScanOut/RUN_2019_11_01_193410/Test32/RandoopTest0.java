
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var0 = java.lang.reflect.Modifier.methodModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3391);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = sun.misc.FloatingDecimal.toJavaFormatString(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = new java.lang.StringBuilder((java.lang.CharSequence)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var16 = var6.append((java.lang.CharSequence)var13, 3391, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuilder var8 = var6.append((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    boolean var1 = java.lang.reflect.Modifier.isPrivate((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = sun.misc.FloatingDecimal.parseDouble("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    int var0 = java.lang.reflect.Modifier.classModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3103);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.StringBuffer var1 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var3 = var1.append("100.0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var5 = var1.charAt(3103);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var10 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var12 = var10.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var10);
    java.lang.StringBuilder var14 = new java.lang.StringBuilder((java.lang.CharSequence)var10);
    java.lang.StringBuffer var17 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var19 = var17.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var17);
    java.lang.StringBuilder var21 = var14.append((java.lang.CharSequence)var17);
    java.lang.StringBuilder var24 = var14.insert(10, (java.lang.Object)'a');
    java.lang.StringBuilder var26 = var14.append(0.0d);
    java.lang.StringBuilder var29 = var14.insert(1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var30 = var2.insert(10, (java.lang.Object)var29);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = var6.append((java.lang.CharSequence)var9);
    java.lang.StringBuffer var17 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var19 = var17.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var17);
    java.lang.StringBuilder var21 = new java.lang.StringBuilder((java.lang.CharSequence)var17);
    java.lang.StringBuffer var23 = var17.appendCodePoint(3391);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var24 = var9.insert(3391, (java.lang.CharSequence)var17);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.StringBuffer var3 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var5 = var3.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var3);
    java.lang.StringBuilder var7 = new java.lang.StringBuilder((java.lang.CharSequence)var3);
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var2 = var1.isLocalClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var1 = java.lang.reflect.Modifier.isAbstract(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.security.Policy var0 = java.security.Policy.getPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = new java.lang.StringBuilder((java.lang.CharSequence)var9);
    java.lang.StringBuffer var16 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var18 = var16.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var16);
    java.lang.StringBuilder var20 = var13.append((java.lang.CharSequence)var16);
    java.lang.StringBuffer var21 = var2.append(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var21.substring(100, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = new java.lang.StringBuilder((java.lang.CharSequence)var9);
    java.lang.StringBuffer var16 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var18 = var16.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var16);
    java.lang.StringBuilder var20 = var13.append((java.lang.CharSequence)var16);
    java.lang.StringBuffer var21 = var2.append(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var16.substring(100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = var6.append((java.lang.CharSequence)var9);
    java.lang.StringBuilder var16 = var6.insert(10, (java.lang.Object)'a');
    java.lang.StringBuilder var18 = var6.append(0.0d);
    java.lang.StringBuilder var21 = var6.insert(1, 10);
    char[] var23 = new char[] { 'a'};
    java.lang.StringBuilder var24 = var6.append(var23);
    java.lang.StringBuilder var26 = var24.append(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = new java.lang.StringBuilder((java.lang.CharSequence)var9);
    java.lang.StringBuffer var16 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var18 = var16.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var16);
    java.lang.StringBuilder var20 = var13.append((java.lang.CharSequence)var16);
    java.lang.StringBuffer var21 = var2.append(var16);
    java.lang.StringBuffer var23 = var2.append('a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char var25 = var2.charAt((-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Method[] var2 = var1.getMethods();
    java.lang.reflect.Type var3 = var1.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    int var6 = var2.length();
    java.lang.StringBuffer var9 = var2.insert(0, true);
    char var11 = var2.charAt(1);
    java.lang.StringBuffer var13 = var2.appendCodePoint(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 'r');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var8 = var2.appendCodePoint(3391);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer((java.lang.CharSequence)var2);
    var2.setLength(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var9 = var6.insert(10, 1.0f);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var3 = var1.isInstance((java.lang.Object)9);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var7 = var5.isInstance((java.lang.Object)9);
    boolean var8 = var1.isAssignableFrom(var5);
    java.lang.Class var10 = sun.reflect.Reflection.getCallerClass(1);
    java.lang.reflect.Method[] var11 = var10.getMethods();
    java.lang.reflect.Method[] var12 = sun.reflect.Reflection.filterMethods(var5, var11);
    java.lang.reflect.AccessibleObject.setAccessible((java.lang.reflect.AccessibleObject[])var12, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    boolean var1 = java.lang.reflect.Modifier.isFinal(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.StringBuffer var2 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var4 = var2.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var2);
    java.lang.StringBuilder var6 = new java.lang.StringBuilder((java.lang.CharSequence)var2);
    java.lang.StringBuffer var9 = new java.lang.StringBuffer(1);
    java.lang.StringBuffer var11 = var9.append("100.0");
    sun.misc.FloatingDecimal.appendTo((-1.0f), (java.lang.Appendable)var9);
    java.lang.StringBuilder var13 = var6.append((java.lang.CharSequence)var9);
    java.lang.StringBuilder var16 = var6.insert(10, (java.lang.Object)'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuilder var19 = var6.delete(100, 3103);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.StringBuffer var0 = new java.lang.StringBuffer();

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.Class var1 = sun.reflect.Reflection.getCallerClass(1);
    boolean var3 = var1.isInstance((java.lang.Object)9);
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass(1);
    boolean var7 = var5.isInstance((java.lang.Object)9);
    boolean var8 = var1.isAssignableFrom(var5);
    java.lang.String var9 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "class randoop.util.MethodReflectionCode"+ "'", var9.equals("class randoop.util.MethodReflectionCode"));

  }

}
