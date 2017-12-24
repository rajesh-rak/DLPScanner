
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("", "hi!");
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
      java.io.PrintStream var2 = new java.io.PrintStream("", "");
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
      java.io.PrintStream var2 = new java.io.PrintStream("0000: 00 64 64 ", "0000: 00 64 64 ");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.misc.HexDumpEncoder var0 = new sun.misc.HexDumpEncoder();
    byte[] var4 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.lang.String var5 = var0.encode(var4);
    sun.misc.HexDumpEncoder var6 = new sun.misc.HexDumpEncoder();
    byte[] var10 = new byte[] { (byte)0, (byte)100, (byte)100};
    java.lang.String var11 = var6.encode(var10);
    java.lang.String var12 = var0.encode(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "0000: 00 64 64 "+ "'", var5.equals("0000: 00 64 64 "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "0000: 00 64 64 "+ "'", var11.equals("0000: 00 64 64 "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "0000: 00 64 64 "+ "'", var12.equals("0000: 00 64 64 "));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println(100L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.print('4');

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    sun.net.www.http.ChunkedOutputStream var4 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.close();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println();
    sun.net.www.http.ChunkedOutputStream var3 = new sun.net.www.http.ChunkedOutputStream(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var1, true, "0000: 01 FF ");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    java.io.PrintStream var4 = var2.append((java.lang.CharSequence)"hi!");
    sun.misc.HexDumpEncoder var5 = new sun.misc.HexDumpEncoder();
    byte[] var8 = new byte[] { (byte)1, (byte)(-1)};
    java.lang.String var9 = var5.encode(var8);
    var2.write(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "0000: 01 FF "+ "'", var9.equals("0000: 01 FF "));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    var1.println(100.0f);
    var1.println('#');

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    java.io.PrintStream var4 = var2.append((java.lang.CharSequence)"hi!");
    byte[] var7 = new byte[] { (byte)(-1), (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.write(var7, (-1), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println((-1.0f));
    var1.print((java.lang.Object)0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.write(100);
    var1.print("0000: 00 64 64 ");
    var1.print(1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.write(100);
    var1.println((-1.0f));
    var1.println();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println();
    sun.net.www.http.ChunkedOutputStream var3 = new sun.net.www.http.ChunkedOutputStream(var1);
    var3.print(' ');

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    sun.net.www.http.ChunkedOutputStream var4 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.print(100L);
    java.lang.Object[] var9 = new java.lang.Object[] { 0};
    java.io.PrintStream var10 = var1.format("0000: 01 FF ", var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var2.print((java.lang.Object)(short)1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    sun.net.www.http.ChunkedOutputStream var4 = new sun.net.www.http.ChunkedOutputStream(var1);
    var4.flush();
    var4.reset();
    var4.print(10L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    sun.net.www.http.ChunkedOutputStream var4 = new sun.net.www.http.ChunkedOutputStream(var1);
    var4.flush();
    var4.reset();
    var4.print(10.0d);
    byte[] var11 = new byte[] { (byte)0, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.write(var11, 10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println();
    sun.net.www.http.ChunkedOutputStream var3 = new sun.net.www.http.ChunkedOutputStream(var1);
    int var4 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.write(100);
    var1.print("0000: 00 64 64 ");
    var1.print(100.0f);
    var1.println((java.lang.Object)(byte)(-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    java.io.OutputStreamWriter var4 = new java.io.OutputStreamWriter((java.io.OutputStream)var1);
    java.io.BufferedWriter var5 = new java.io.BufferedWriter((java.io.Writer)var4);
    var5.flush();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    var1.println((-1.0f));
    var1.print(100.0f);
    var1.println();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.io.PrintStream var1 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var2 = new sun.net.www.http.ChunkedOutputStream(var1);
    var1.flush();
    java.io.OutputStreamWriter var4 = new java.io.OutputStreamWriter((java.io.OutputStream)var1);
    java.io.BufferedWriter var5 = new java.io.BufferedWriter((java.io.Writer)var4);
    var5.close();
    java.io.PrintStream var8 = new java.io.PrintStream("0000: 01 FF ");
    sun.net.www.http.ChunkedOutputStream var9 = new sun.net.www.http.ChunkedOutputStream(var8);
    var8.flush();
    java.io.OutputStreamWriter var11 = new java.io.OutputStreamWriter((java.io.OutputStream)var8);
    java.io.BufferedWriter var12 = new java.io.BufferedWriter((java.io.Writer)var11);
    char[] var14 = new char[] { '4'};
    var11.write(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.write(var14);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
