
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.HashMap var2 = new java.util.HashMap(1, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    boolean var5 = var3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.InputStream var1 = java.lang.ClassLoader.getSystemResourceAsStream("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)(-1.0d));
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    java.util.Enumeration var5 = var1.keys();
    int var6 = var1.size();
    java.util.Hashtable var8 = new java.util.Hashtable(1);
    java.util.Hashtable var10 = new java.util.Hashtable(1);
    var8.putAll((java.util.Map)var10);
    java.lang.Object var12 = var1.remove((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    long var6 = java.util.Date.UTC(1, 10, 10, (-1), 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2150407201000L));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    int var8 = var6.getSeconds();
    long var9 = var6.getTime();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var14 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var15 = var14.toString();
    boolean var16 = var6.after(var14);
    int var17 = var6.getMonth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    java.util.Enumeration var5 = var1.keys();
    int var6 = var1.size();
    java.lang.Object var7 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var14 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var15 = var14.toString();
    boolean var16 = var6.after(var14);
    java.lang.String var17 = var14.toLocaleString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    java.lang.annotation.Annotation[] var5 = sun.reflect.annotation.AnnotationParser.toArray((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var1 = new java.util.Date("31 Jan, 1901 12:01:01 AM");

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var14 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var15 = var14.toString();
    int var16 = var6.compareTo(var14);
    int var17 = var14.getDay();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    java.util.Enumeration var5 = var1.keys();
    java.lang.Object var7 = var1.remove((java.lang.Object)1.0f);
    java.util.Enumeration var8 = var1.keys();
    boolean var10 = var1.equals((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    var0.clearAssertionStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var1 = new java.util.Date(1L);
    var1.setMinutes(0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Date var0 = new java.util.Date();

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    boolean var3 = var1.equals((java.lang.Object)(byte)(-1));
    java.util.Set var4 = var1.keySet();
    java.util.Set var5 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.HashMap var0 = new java.util.HashMap();
    boolean var1 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.ClassLoader var0 = java.lang.ClassLoader.getSystemClassLoader();
    java.lang.ClassLoader var1 = var0.getParent();
    java.util.Enumeration var3 = var1.getResources("31 Jan, 1901 12:01:01 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Properties var0 = new java.util.Properties();

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.HashMap var2 = new java.util.HashMap(1, 1.0f);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.HashMap var0 = new java.util.HashMap();
    boolean var2 = var0.equals((java.lang.Object)100.0f);
    java.util.Hashtable var4 = new java.util.Hashtable(1);
    boolean var6 = var4.equals((java.lang.Object)(byte)(-1));
    java.util.Set var7 = var4.keySet();
    var0.putAll((java.util.Map)var4);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var14 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var15 = var14.toString();
    int var16 = var6.compareTo(var14);
    var14.setHours((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Date var6 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var7 = var6.toString();
    java.util.Date var14 = new java.util.Date(1, 1, 0, 0, 1, 1);
    java.lang.String var15 = var14.toString();
    boolean var16 = var6.after(var14);
    var6.setHours((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);
    java.util.Hashtable var3 = new java.util.Hashtable(1);
    var1.putAll((java.util.Map)var3);
    java.util.Enumeration var5 = var1.keys();
    java.lang.Object var7 = var1.remove((java.lang.Object)1.0f);
    java.lang.Object var9 = var1.remove((java.lang.Object)(-1.0f));
    java.util.Enumeration var10 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
