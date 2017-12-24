
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


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"hi!", 10, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    var1.print("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.io.PrintStream var2 = new java.io.PrintStream((java.io.OutputStream)var0, false);
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    java.io.PrintStream var6 = var2.printf("", var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    java.io.OutputStream var4 = var1.getOutputStream();
    java.io.PrintStream var6 = new java.io.PrintStream(var4, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    boolean var2 = var1.checkError();
    boolean var3 = var1.checkError();
    java.rmi.server.LogStream var5 = java.rmi.server.LogStream.log("hi!");
    var5.print("hi!");
    char[] var8 = new char[] { };
    var5.println(var8);
    var1.println(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    sun.net.www.http.ChunkedOutputStream var1 = new sun.net.www.http.ChunkedOutputStream(var0);
    var0.println(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    char[] var4 = new char[] { };
    var1.println(var4);
    sun.net.www.http.ChunkedOutputStream var7 = new sun.net.www.http.ChunkedOutputStream((java.io.PrintStream)var1, 1);
    boolean var8 = var7.checkError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    sun.net.www.http.ChunkedOutputStream var1 = new sun.net.www.http.ChunkedOutputStream(var0);
    sun.misc.HexDumpEncoder var2 = new sun.misc.HexDumpEncoder();
    byte[] var3 = new byte[] { };
    java.lang.String var4 = var2.encode(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.write(var3, 1, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    char[] var4 = new char[] { };
    var1.println(var4);
    sun.net.www.http.ChunkedOutputStream var7 = new sun.net.www.http.ChunkedOutputStream((java.io.PrintStream)var1, 1);
    var1.println(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print('#');
    var0.print(1.0f);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var0, true);
    var6.print(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    var1.print(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    char[] var4 = new char[] { };
    var1.println(var4);
    sun.misc.HexDumpEncoder var6 = new sun.misc.HexDumpEncoder();
    byte[] var7 = new byte[] { };
    java.lang.String var8 = var6.encode(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.write(var7, 10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    java.io.OutputStreamWriter var6 = new java.io.OutputStreamWriter((java.io.OutputStream)var5);
    var6.flush();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.write("hi!", 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.print('#');
    var0.print(1.0f);
    var0.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    java.io.OutputStreamWriter var6 = new java.io.OutputStreamWriter((java.io.OutputStream)var5);
    var6.write((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    sun.net.www.http.ChunkedOutputStream var1 = new sun.net.www.http.ChunkedOutputStream(var0);
    int var2 = var1.size();
    var1.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    int var1 = java.rmi.server.LogStream.parseLevel("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    boolean var2 = var1.checkError();
    var1.println(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var8 = var1.append((java.lang.CharSequence)"hi!", 100, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("");
    var1.println((-1L));
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    java.io.OutputStreamWriter var6 = new java.io.OutputStreamWriter((java.io.OutputStream)var5);
    var6.flush();
    java.io.Writer var9 = var6.append((java.lang.CharSequence)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print("hi!");
    char[] var4 = new char[] { };
    var1.println(var4);
    sun.net.www.http.ChunkedOutputStream var7 = new sun.net.www.http.ChunkedOutputStream((java.io.PrintStream)var1, 1);
    var7.print(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"hi!");
    sun.misc.HexDumpEncoder var8 = new sun.misc.HexDumpEncoder();
    byte[] var9 = new byte[] { };
    java.lang.String var10 = var8.encode(var9);
    var7.write(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    var1.print(1L);
    java.io.PrintStream var5 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    java.io.PrintStream var7 = var1.append((java.lang.CharSequence)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var10 = new java.io.PrintStream((java.io.OutputStream)var1, true, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
