
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print(true);
    byte[] var6 = new byte[] { (byte)(-1), (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.write(var6, 100, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var1 = java.rmi.server.LogStream.parseLevel("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var6 = var0.append((java.lang.CharSequence)"", 10, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var3 = java.rmi.server.LogStream.getDefaultStream();
    boolean var4 = var3.checkError();
    java.lang.Object[] var5 = new java.lang.Object[] { var3};
    java.io.PrintStream var6 = var0.printf("", var5);
    java.io.PrintStream var7 = java.rmi.server.LogStream.getDefaultStream();
    boolean var8 = var7.checkError();
    java.io.PrintStream var10 = java.rmi.server.LogStream.getDefaultStream();
    boolean var11 = var10.checkError();
    java.lang.Object[] var12 = new java.lang.Object[] { var10};
    java.io.PrintStream var13 = var7.printf("", var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.nio.cs.StreamEncoder var15 = sun.nio.cs.StreamEncoder.forOutputStreamWriter((java.io.OutputStream)var0, (java.lang.Object)"", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var0, true, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = var0.append((java.lang.CharSequence)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var6 = var2.append((java.lang.CharSequence)"", (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.misc.HexDumpEncoder var0 = new sun.misc.HexDumpEncoder();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = var0.append((java.lang.CharSequence)"");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var6 = var0.append((java.lang.CharSequence)"hi!", 1, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    var0.write((-1));
    java.rmi.server.LogStream.setDefaultStream(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var3 = java.rmi.server.LogStream.getDefaultStream();
    boolean var4 = var3.checkError();
    java.lang.Object[] var5 = new java.lang.Object[] { var3};
    java.io.PrintStream var6 = var0.printf("", var5);
    java.io.PrintStream var8 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var10 = var8.append((java.lang.CharSequence)"");
    java.io.PrintStream var12 = java.rmi.server.LogStream.getDefaultStream();
    var12.print(true);
    char[] var17 = new char[] { '#', '#'};
    var12.print(var17);
    java.lang.Object[] var19 = new java.lang.Object[] { var12};
    java.io.PrintStream var20 = var10.printf("hi!", var19);
    java.io.PrintStream var21 = var0.printf("hi!", var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.nio.cs.StreamEncoder var5 = sun.nio.cs.StreamEncoder.forOutputStreamWriter((java.io.OutputStream)var2, (java.lang.Object)(byte)10, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = var0.append((java.lang.CharSequence)"");
    java.io.PrintStream var4 = java.rmi.server.LogStream.getDefaultStream();
    var4.print(true);
    char[] var9 = new char[] { '#', '#'};
    var4.print(var9);
    java.lang.Object[] var11 = new java.lang.Object[] { var4};
    java.io.PrintStream var12 = var2.printf("hi!", var11);
    var12.print(100);
    var12.println(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var3 = java.rmi.server.LogStream.getDefaultStream();
    boolean var4 = var3.checkError();
    java.lang.Object[] var5 = new java.lang.Object[] { var3};
    java.io.PrintStream var6 = var0.printf("", var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var10 = var6.append((java.lang.CharSequence)"", 100, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.rmi.server.LogStream.setDefaultStream(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0);
    var2.print(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = java.rmi.server.LogStream.getDefaultStream();
    boolean var3 = var2.checkError();
    java.io.PrintStream var5 = java.rmi.server.LogStream.getDefaultStream();
    boolean var6 = var5.checkError();
    java.lang.Object[] var7 = new java.lang.Object[] { var5};
    java.io.PrintStream var8 = var2.printf("", var7);
    java.io.PrintStream var9 = var0.format("", var7);
    java.io.PrintStream var11 = var9.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var13 = var9.append((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = java.rmi.server.LogStream.getDefaultStream();
    boolean var3 = var2.checkError();
    java.io.PrintStream var5 = java.rmi.server.LogStream.getDefaultStream();
    boolean var6 = var5.checkError();
    java.lang.Object[] var7 = new java.lang.Object[] { var5};
    java.io.PrintStream var8 = var2.printf("", var7);
    java.io.PrintStream var9 = var0.format("", var7);
    java.io.PrintStream var11 = var9.append((java.lang.CharSequence)"hi!");
    java.rmi.server.LogStream.setDefaultStream(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0);
    java.io.OutputStreamWriter var3 = new java.io.OutputStreamWriter((java.io.OutputStream)var2);
    boolean var4 = var2.checkError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = var0.append((java.lang.CharSequence)"");
    java.io.PrintStream var4 = java.rmi.server.LogStream.getDefaultStream();
    var4.print(true);
    char[] var9 = new char[] { '#', '#'};
    var4.print(var9);
    java.lang.Object[] var11 = new java.lang.Object[] { var4};
    java.io.PrintStream var12 = var2.printf("hi!", var11);
    var2.print(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var3 = java.rmi.server.LogStream.getDefaultStream();
    boolean var4 = var3.checkError();
    java.lang.Object[] var5 = new java.lang.Object[] { var3};
    java.io.PrintStream var6 = var0.printf("", var5);
    char[] var7 = new char[] { };
    var0.print(var7);
    byte[] var10 = new byte[] { (byte)10};
    var0.write(var10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    var0.write((-1));
    var0.print(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0);
    java.io.OutputStreamWriter var3 = new java.io.OutputStreamWriter((java.io.OutputStream)var2);
    java.io.PrintStream var4 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var6 = var4.append((java.lang.CharSequence)"");
    java.io.PrintStream var8 = java.rmi.server.LogStream.getDefaultStream();
    var8.print(true);
    char[] var13 = new char[] { '#', '#'};
    var8.print(var13);
    java.lang.Object[] var15 = new java.lang.Object[] { var8};
    java.io.PrintStream var16 = var6.printf("hi!", var15);
    var16.print("");
    java.io.PrintStream var19 = java.rmi.server.LogStream.getDefaultStream();
    var19.print(true);
    char[] var24 = new char[] { '#', '#'};
    var19.print(var24);
    var16.println((java.lang.Object)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var24, (-1), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.OutputStreamWriter var2 = new java.io.OutputStreamWriter((java.io.OutputStream)var0, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    boolean var2 = var0.checkError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = var0.append((java.lang.CharSequence)"");
    var2.println((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0);
    java.io.OutputStreamWriter var3 = new java.io.OutputStreamWriter((java.io.OutputStream)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var7 = var3.append((java.lang.CharSequence)"hi!", 1, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.io.PrintStream var2 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var4 = var2.append((java.lang.CharSequence)"");
    var4.println(10L);
    var1.setOutputStream((java.io.OutputStream)var4);
    java.io.OutputStream var8 = var1.getOutputStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    boolean var1 = var0.checkError();
    java.io.PrintStream var3 = java.rmi.server.LogStream.getDefaultStream();
    boolean var4 = var3.checkError();
    java.lang.Object[] var5 = new java.lang.Object[] { var3};
    java.io.PrintStream var6 = var0.printf("", var5);
    char[] var7 = new char[] { };
    var0.print(var7);
    var0.println("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print('a');
    java.io.PrintStream var4 = var0.append((java.lang.CharSequence)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
