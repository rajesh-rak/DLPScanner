
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var2 = new byte[] { (byte)0, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var3 = new sun.security.x509.X509CertInfo(var2);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.lang.String var2 = var1.toString();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    java.io.IOException var2 = var1.ioException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("", "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.security.util.Debug.println("hi!", "");

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var1 = new java.io.PrintStream("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    var1.flush();

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var3 = new byte[] { (byte)0, (byte)10, (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.security.x509.X509CertInfo var4 = new sun.security.x509.X509CertInfo(var3);
      fail("Expected exception of type java.security.cert.CertificateParsingException");
    } catch (java.security.cert.CertificateParsingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    var6.setTime(100L);
    var6.setMinutes(0);
    java.lang.String var11 = var6.toLocaleString();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    var6.setTime(100L);
    var6.setMinutes(0);
    java.lang.String var11 = var6.toString();
    java.lang.String var12 = var6.toLocaleString();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    var6.setTime(100L);
    var6.setSeconds(10);
    int var11 = var6.getTimezoneOffset();
    long var12 = var6.getTime();

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    java.lang.String var3 = var1.toString();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = java.util.Date.parse("Thu Jan 01 05:00:00 IST 1970");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    byte[] var5 = new byte[] { (byte)1, (byte)100, (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.write(var5, 100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    boolean var1 = sun.security.util.Debug.isOn("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    java.util.Formatter var2 = new java.util.Formatter(var1);
    java.io.PrintStream var4 = var1.append((java.lang.CharSequence)"hi!");
    java.lang.Object[] var7 = new java.lang.Object[] { 0.0f};
    java.io.PrintStream var8 = var4.printf("Thu Jan 01 05:00:00 IST 1970", var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Formatter var1 = new java.util.Formatter("hi!");
    var1.flush();
    java.util.Formatter var5 = new java.util.Formatter("hi!");
    var5.flush();
    java.lang.String var7 = var5.toString();
    java.lang.Object[] var8 = new java.lang.Object[] { var5};
    java.util.Formatter var9 = var1.format("1 Jan, 1970 5:00:00 AM", var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Set var4 = var3.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    java.util.Formatter var2 = new java.util.Formatter(var1);
    java.io.PrintStream var4 = var1.append((java.lang.CharSequence)"hi!");
    var1.println(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    var6.setTime(100L);
    var6.setMinutes(0);
    var6.setYear(1);
    int var13 = var6.getMinutes();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Enumeration var4 = var3.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Throwable var1 = new java.lang.Throwable();
    java.lang.Throwable var2 = new java.lang.Throwable("1 Jan, 1970 5:00:00 AM", var1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var6 = new java.util.Date((-1), 0, 100, 1, 10, (-1));
    var6.setTime(100L);
    var6.setMinutes(0);
    var6.setMonth(10);
    java.lang.String var13 = var6.toString();

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    java.util.Formatter var2 = new java.util.Formatter(var1);
    java.io.PrintStream var4 = var1.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var6 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    byte[] var7 = new byte[] { };
    var6.write(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.write(var7, 100, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var2 = new java.util.Hashtable(100, 100.0f);
    java.util.Hashtable var3 = new java.util.Hashtable((java.util.Map)var2);
    java.util.Hashtable var6 = new java.util.Hashtable(100, 100.0f);
    java.util.Set var7 = var6.entrySet();
    boolean var8 = var3.containsValue((java.lang.Object)var6);
    int var9 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.security.x509.X509CertInfo var0 = new sun.security.x509.X509CertInfo();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.io.PrintStream var1 = new java.io.PrintStream("1 Jan, 1970 5:00:00 AM");
    java.util.Formatter var2 = new java.util.Formatter(var1);
    java.io.PrintStream var4 = var1.append((java.lang.CharSequence)"hi!");
    java.io.PrintStream var6 = new java.io.PrintStream((java.io.OutputStream)var4, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
