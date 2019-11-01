
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("hi!", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var5 = var1.append((java.lang.CharSequence)"hi!", 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.println("hi!");
    var1.print(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.misc.HexDumpEncoder var0 = new sun.misc.HexDumpEncoder();
    sun.misc.HexDumpEncoder var1 = new sun.misc.HexDumpEncoder();
    byte[] var5 = new byte[] { (byte)0, (byte)1, (byte)1};
    java.rmi.server.LogStream var7 = java.rmi.server.LogStream.log("hi!");
    var1.encodeBuffer(var5, (java.io.OutputStream)var7);
    java.lang.String var9 = var0.encode(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0000: 00 01 01 "+ "'", var9.equals("0000: 00 01 01 "));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.lang.Object[] var4 = new java.lang.Object[] { 10L};
    java.io.PrintStream var5 = var1.printf("0000: 00 01 01 ", var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.OutputStreamWriter var7 = new java.io.OutputStreamWriter((java.io.OutputStream)var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.misc.HexDumpEncoder var0 = new sun.misc.HexDumpEncoder();
    byte[] var4 = new byte[] { (byte)0, (byte)1, (byte)1};
    java.rmi.server.LogStream var6 = java.rmi.server.LogStream.log("hi!");
    var0.encodeBuffer(var4, (java.io.OutputStream)var6);
    sun.misc.HexDumpEncoder var8 = new sun.misc.HexDumpEncoder();
    byte[] var12 = new byte[] { (byte)0, (byte)1, (byte)1};
    java.rmi.server.LogStream var14 = java.rmi.server.LogStream.log("hi!");
    var8.encodeBuffer(var12, (java.io.OutputStream)var14);
    java.rmi.server.LogStream var17 = java.rmi.server.LogStream.log("hi!");
    var17.println("hi!");
    var0.encode(var12, (java.io.OutputStream)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.println("hi!");
    var1.print(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.rmi.server.LogStream var3 = java.rmi.server.LogStream.log("hi!");
    java.lang.Object[] var6 = new java.lang.Object[] { 10L};
    java.io.PrintStream var7 = var3.printf("0000: 00 01 01 ", var6);
    var7.print('a');
    char[] var11 = new char[] { 'a'};
    var7.print(var11);
    var1.setOutputStream((java.io.OutputStream)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var1 = java.rmi.server.LogStream.parseLevel("0000: 00 01 01 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.io.PrintStream var3 = var1.append('#');
    java.io.OutputStreamWriter var4 = new java.io.OutputStreamWriter((java.io.OutputStream)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("0000: 00 01 01 ", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print('4');
    var1.write((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
