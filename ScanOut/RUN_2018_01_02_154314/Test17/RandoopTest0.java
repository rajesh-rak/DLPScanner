
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "hi!", 100, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    boolean var3 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "", 10, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "hi!", 1, "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    int var3 = var2.size();
    java.lang.String var4 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    boolean var6 = var2.containsValue((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)10.0d);
    java.util.HashMap var10 = new java.util.HashMap(10, 1.0f);
    var5.putAll((java.util.Map)var10);
    boolean var12 = var2.containsKey((java.lang.Object)var10);
    java.util.Set var13 = var10.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 100.0f);
    java.lang.Object var4 = var2.get((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    java.net.URL var3 = java.lang.ClassLoader.getSystemResource("{}");
    int var4 = var3.getPort();
    java.lang.Class[] var5 = new java.lang.Class[] { };
    java.lang.Object var6 = var3.getContent(var5);
    boolean var7 = var1.sameFile(var3);
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "file:/Users/rajesh/code/DLPScanner/%7b%7d"+ "'", var8.equals("file:/Users/rajesh/code/DLPScanner/%7b%7d"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)10.0d);
    boolean var8 = var2.containsValue((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.HashMap var1 = new java.util.HashMap(10);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var1 = new byte[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var2 = java.net.InetAddress.getByAddress(var1);
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    java.net.URL var3 = java.lang.ClassLoader.getSystemResource("{}");
    int var4 = var3.getPort();
    java.lang.Class[] var5 = new java.lang.Class[] { };
    java.lang.Object var6 = var3.getContent(var5);
    boolean var7 = var1.sameFile(var3);
    java.lang.String var8 = var1.getQuery();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    java.net.URL var3 = java.lang.ClassLoader.getSystemResource("{}");
    int var4 = var3.getPort();
    java.lang.Class[] var5 = new java.lang.Class[] { };
    java.lang.Object var6 = var3.getContent(var5);
    boolean var7 = var1.sameFile(var3);
    java.lang.Class[] var8 = new java.lang.Class[] { };
    java.lang.Object var9 = var1.getContent(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    int var3 = var2.size();
    boolean var5 = var2.containsValue((java.lang.Object)"hi!");
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    java.net.URL var3 = java.lang.ClassLoader.getSystemResource("{}");
    int var4 = var3.getPort();
    java.lang.Class[] var5 = new java.lang.Class[] { };
    java.lang.Object var6 = var3.getContent(var5);
    boolean var7 = var1.sameFile(var3);
    java.lang.String var8 = var3.getFile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "/Users/rajesh/code/DLPScanner/%7b%7d"+ "'", var8.equals("/Users/rajesh/code/DLPScanner/%7b%7d"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.HashMap var0 = new java.util.HashMap();
    java.util.HashMap var3 = new java.util.HashMap(1, 10.0f);
    java.util.Set var4 = var3.entrySet();
    java.lang.Object var5 = var0.get((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.HashMap var0 = new java.util.HashMap();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.net.URL var1 = new java.net.URL("file:/Users/rajesh/code/DLPScanner/%7b%7d");
    int var2 = var1.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.HashMap var0 = new java.util.HashMap();
    java.lang.Object var1 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.net.URL var5 = java.lang.ClassLoader.getSystemResource("{}");
    java.net.URL var7 = java.lang.ClassLoader.getSystemResource("{}");
    int var8 = var7.getPort();
    java.lang.Class[] var9 = new java.lang.Class[] { };
    java.lang.Object var10 = var7.getContent(var9);
    boolean var11 = var5.sameFile(var7);
    sun.net.www.protocol.ftp.Handler var13 = new sun.net.www.protocol.ftp.Handler();
    java.net.URL var14 = new java.net.URL(var5, "{}", (java.net.URLStreamHandler)var13);
    java.net.URL var15 = new java.net.URL("", "/Users/rajesh/code/DLPScanner/%7b%7d", 100, "/Users/rajesh/code/DLPScanner/%7b%7d", (java.net.URLStreamHandler)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    int var3 = var2.size();
    java.util.Set var4 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    int var3 = var2.size();
    java.lang.Object var4 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    java.util.HashMap var7 = new java.util.HashMap(10, 1.0f);
    var2.putAll((java.util.Map)var7);
    java.util.Collection var9 = var7.values();
    java.util.Enumeration var11 = java.lang.ClassLoader.getSystemResources("hi!");
    boolean var12 = var7.containsKey((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    java.util.Collection var3 = var2.values();
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    java.lang.String var2 = var1.getHost();
    java.lang.String var3 = var1.toExternalForm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "file:/Users/rajesh/code/DLPScanner/%7b%7d"+ "'", var3.equals("file:/Users/rajesh/code/DLPScanner/%7b%7d"));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
