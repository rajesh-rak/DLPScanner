
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println('a');
    var1.print((-1L));
    var1.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var10 = var1.append((java.lang.CharSequence)"", 10, 1);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1, false, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.OutputStreamWriter var7 = new java.io.OutputStreamWriter((java.io.OutputStream)var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var1.write(1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    var1.print("hi!");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    java.rmi.server.LogStream.setDefaultStream(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    java.lang.Object[] var8 = new java.lang.Object[] { 1};
    java.io.PrintStream var9 = var1.format("", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var1 = java.rmi.server.LogStream.parseLevel("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    var1.close();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    var1.println((java.lang.Object)(-1.0d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var11 = var1.append((java.lang.CharSequence)"", 100, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    sun.net.www.http.ChunkedOutputStream var5 = new sun.net.www.http.ChunkedOutputStream(var1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.OutputStreamWriter var7 = new java.io.OutputStreamWriter((java.io.OutputStream)var1, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var4, true);
    var4.println(1.0f);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var6.print(100.0f);
    java.io.PrintStream var10 = new java.io.PrintStream("hi!");
    var10.println(100.0f);
    java.io.PrintStream var13 = new java.io.PrintStream((java.io.OutputStream)var10);
    java.io.PrintStream var15 = new java.io.PrintStream((java.io.OutputStream)var10, false);
    var10.println((-1.0d));
    var10.println(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.nio.cs.StreamEncoder var21 = sun.nio.cs.StreamEncoder.forOutputStreamWriter((java.io.OutputStream)var6, (java.lang.Object)var10, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.lang.Object[] var7 = new java.lang.Object[] { 10L};
    java.io.PrintStream var8 = var1.printf("", var7);
    char[] var9 = new char[] { };
    var8.println(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var4, true);
    var4.println();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println('a');
    var1.print((-1L));
    var1.close();
    var1.println((java.lang.Object)10L);
    java.rmi.server.LogStream.setDefaultStream(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    var6.println("hi!");
    var6.print(false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.lang.String var2 = var1.toString();
    java.io.OutputStream var3 = var1.getOutputStream();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.misc.HexDumpEncoder var0 = new sun.misc.HexDumpEncoder();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println('a');
    var1.print((-1L));
    var1.flush();

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.rmi.server.LogStream var1 = java.rmi.server.LogStream.log("hi!");
    java.io.OutputStream var2 = var1.getOutputStream();
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    java.io.PrintStream var4 = new java.io.PrintStream((java.io.OutputStream)var1);
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var4, true);
    var6.println(0.0f);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println(100.0f);
    var1.print(1);
    var1.println((java.lang.Object)(-1.0d));
    boolean var8 = var1.checkError();
    var1.println(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");
    var1.println('a');
    var1.print((-1L));
    var1.close();
    var1.print(true);
    var1.println("");

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.io.PrintStream var0 = java.rmi.server.LogStream.getDefaultStream();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
