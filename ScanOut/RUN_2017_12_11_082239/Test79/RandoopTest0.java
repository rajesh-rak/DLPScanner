
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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "", 10, "hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "hi!", 1, "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    boolean var6 = var2.containsValue((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var1 = new java.net.URL("");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Enumeration var1 = java.lang.ClassLoader.getSystemResources("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    java.util.HashMap var7 = new java.util.HashMap(10, 1.0f);
    var2.putAll((java.util.Map)var7);
    java.util.Collection var9 = var7.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress var1 = java.net.InetAddress.getByName("{}");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    int var3 = var2.size();
    java.lang.String var4 = var2.toString();
    java.util.Set var5 = var2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetAddress[] var1 = java.net.InetAddress.getAllByName("{}");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)10.0d);
    java.util.HashMap var10 = new java.util.HashMap(10, 1.0f);
    var5.putAll((java.util.Map)var10);
    boolean var12 = var2.containsKey((java.lang.Object)var10);
    java.util.Set var13 = var10.keySet();
    java.lang.String var14 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "{}"+ "'", var14.equals("{}"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    java.lang.Object var7 = var2.put((java.lang.Object)10.0f, (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    java.util.HashMap var7 = new java.util.HashMap(1, 10.0f);
    java.util.HashMap var10 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var12 = var10.remove((java.lang.Object)10.0d);
    java.util.HashMap var15 = new java.util.HashMap(10, 1.0f);
    var10.putAll((java.util.Map)var15);
    boolean var17 = var7.containsKey((java.lang.Object)var15);
    java.lang.Object var19 = var7.remove((java.lang.Object)(byte)10);
    java.util.Set var20 = var7.entrySet();
    java.lang.Object var21 = var2.get((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)10.0d);
    java.util.HashMap var8 = new java.util.HashMap((java.util.Map)var5);
    var2.putAll((java.util.Map)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    boolean var4 = var2.containsValue((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    var0.setDefaultAssertionStatus(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = var0.loadClass("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var2 = var0.loadClass("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    boolean var4 = var2.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("hi!", "{}", 1, "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.HashMap var0 = new java.util.HashMap();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.HashMap var2 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var4 = var2.remove((java.lang.Object)10.0d);
    java.util.HashMap var7 = new java.util.HashMap(10, 1.0f);
    var2.putAll((java.util.Map)var7);
    java.lang.Object var9 = var7.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.net.URLConnection var2 = var1.openConnection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    var0.setDefaultAssertionStatus(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = var0.loadClass("{}");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.util.Enumeration var2 = var0.getResources("{}");
    var0.setClassAssertionStatus("{}", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    boolean var3 = var2.isEmpty();
    java.lang.String var4 = var2.toString();
    java.lang.Object var6 = var2.remove((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 10.0f);
    java.util.HashMap var5 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var7 = var5.remove((java.lang.Object)10.0d);
    java.util.HashMap var10 = new java.util.HashMap(10, 1.0f);
    var5.putAll((java.util.Map)var10);
    boolean var12 = var2.containsKey((java.lang.Object)var10);
    java.util.HashMap var15 = new java.util.HashMap(10, 1.0f);
    java.lang.Object var17 = var15.remove((java.lang.Object)10.0d);
    java.util.HashMap var20 = new java.util.HashMap(10, 1.0f);
    var15.putAll((java.util.Map)var20);
    var10.putAll((java.util.Map)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.net.InetAddress var0 = java.net.InetAddress.getLoopbackAddress();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("");
    java.lang.ClassLoader var2 = java.lang.ClassLoader.getSystemClassLoader();
    java.net.URL var4 = var2.getResource("hi!");
    boolean var5 = var1.sameFile(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

}
