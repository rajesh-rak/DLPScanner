
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var1 = java.lang.Integer.numberOfTrailingZeros(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 32);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.NumberFormatException var1 = new java.lang.NumberFormatException("");

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Exception var1 = new java.lang.Exception("");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    int var1 = java.lang.Integer.highestOneBit(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Integer var1 = java.lang.Integer.valueOf(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + 100+ "'", var1.equals(100));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var0 = java.lang.reflect.Modifier.methodModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 3391);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var1 = sun.security.util.Debug.isOn("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.Integer.toString(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10"+ "'", var1.equals("10"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)(-1)};
    java.lang.String var3 = java.lang.String.format("4 a", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4 a"+ "'", var3.equals("4 a"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "10");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Integer var1 = new java.lang.Integer("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var3 = new char[] { '4', ' ', 'a'};
    java.lang.String var4 = java.lang.String.valueOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = java.lang.String.valueOf(var3, 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "4 a"+ "'", var4.equals("4 a"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Thread var0 = new java.lang.Thread();
    java.lang.Thread var1 = new java.lang.Thread((java.lang.Runnable)var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.security.util.Debug.println("", "hi!");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var1 = java.lang.Integer.numberOfTrailingZeros(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = java.lang.Integer.parseInt("10", (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var2, "10");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "", "10", var3);
    java.lang.String var5 = var4.getUnresolvedType();
    java.lang.String var6 = var4.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.security.AccessController.checkPermission((java.security.Permission)var4);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(unresolved   10)"+ "'", var6.equals("(unresolved   10)"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var1 = java.lang.reflect.Modifier.isProtected(3391);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "", "10", var3);
    java.lang.String var5 = var4.getUnresolvedType();
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.getUnresolvedType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(unresolved   10)"+ "'", var6.equals("(unresolved   10)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    char[] var1 = new char[] { '#'};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = java.lang.String.copyValueOf(var1, 100, 3391);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#"+ "'", var2.equals("#"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var1 = java.lang.reflect.Modifier.isTransient(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.String var1 = java.lang.reflect.Modifier.toString((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "public protected private abstract static final transient volatile synchronized native strictfp interface"+ "'", var1.equals("public protected private abstract static final transient volatile synchronized native strictfp interface"));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "\u0000", "", var3);
    java.lang.String var5 = var4.getUnresolvedName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0000"+ "'", var5.equals("\u0000"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    int var1 = java.lang.Integer.lowestOneBit(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "", "10", var3);
    java.lang.String var5 = var4.getUnresolvedType();
    java.security.cert.Certificate[] var9 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var10 = new java.security.UnresolvedPermission("", "\u0000", "", var9);
    boolean var11 = var4.implies((java.security.Permission)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = java.lang.Integer.parseInt("#");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    int var1 = java.lang.Integer.bitCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.PrintStream var1 = new java.io.PrintStream("public protected private abstract static final transient volatile synchronized native strictfp interface");
    var1.println(2);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    int var1 = java.lang.Integer.highestOneBit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2147483648));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.io.PrintStream var1 = new java.io.PrintStream("public protected private abstract static final transient volatile synchronized native strictfp interface");
    var1.print(10L);
    var1.println('#');

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.lang.reflect.Modifier var0 = new java.lang.reflect.Modifier();

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    byte[] var1 = new byte[] { (byte)0};
    java.lang.String var2 = new java.lang.String(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = new java.lang.String(var1, 32, (-1), "4 a");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "\u0000"+ "'", var2.equals("\u0000"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.String var1 = java.lang.Integer.toBinaryString(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0"+ "'", var1.equals("0"));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.security.cert.Certificate[] var3 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var4 = new java.security.UnresolvedPermission("", "", "10", var3);
    java.lang.String var5 = var4.getUnresolvedType();
    boolean var7 = var4.equals((java.lang.Object)(byte)(-1));
    java.lang.String var8 = var4.getUnresolvedName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    char[] var1 = new char[] { '#'};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    java.lang.String var5 = java.lang.String.valueOf(var1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "#"+ "'", var2.equals("#"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.security.cert.Certificate[] var6 = new java.security.cert.Certificate[] { };
    java.security.UnresolvedPermission var7 = new java.security.UnresolvedPermission("", "", "10", var6);
    java.security.UnresolvedPermission var8 = new java.security.UnresolvedPermission("", "hi!", "0", var6);
    java.lang.String var9 = var8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

}
