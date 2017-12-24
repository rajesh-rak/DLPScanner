
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.nio.channels.Channel var0 = java.lang.System.inheritedChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var6 = java.util.Date.UTC((-1), 1, (-1), 10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2237977199000L));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    var3.setDate((-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    long var2 = sun.util.calendar.AbstractCalendar.getDayOfWeekDateOnOrBefore(10L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.System.getenv("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    sun.util.calendar.ZoneInfo var1 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.hasSameRules((java.util.TimeZone)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var0.getDisplayName(false, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    sun.util.calendar.ZoneInfo var1 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.hasSameRules((java.util.TimeZone)var1);
    int[] var6 = new int[] { (-1), (-1)};
    int var7 = var1.getOffsets((-1L), var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.net.URL var5 = var1.findResource("");
    java.util.Enumeration var7 = var1.findResources("10 Feb, 2000 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String[] var1 = sun.util.calendar.ZoneInfo.getAvailableIDs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.lang.Class[] var4 = var3.getInterfaces();
    java.lang.Class[] var5 = var3.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var3.newInstance();
      fail("Expected exception of type java.lang.InstantiationException");
    } catch (java.lang.InstantiationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.String var1 = java.lang.System.mapLibraryName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "libhi!.dylib"+ "'", var1.equals("libhi!.dylib"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.String var0 = java.lang.System.lineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "\n"+ "'", var0.equals("\n"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.lang.Class[] var4 = var3.getInterfaces();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.MBeanInfo var5 = com.sun.jmx.mbeanserver.Introspector.testCompliance(var3);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    java.lang.String var4 = var3.toLocaleString();
    java.util.Date var8 = new java.util.Date(100, 1, 10);
    java.lang.String var9 = var8.toLocaleString();
    boolean var10 = var3.after(var8);
    int var11 = var8.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Date var1 = new java.util.Date(0L);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var2 = java.lang.System.getProperty("\n", "10 Feb, 2000 12:00:00 AM");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "10 Feb, 2000 12:00:00 AM"+ "'", var2.equals("10 Feb, 2000 12:00:00 AM"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "10 Feb, 2000 12:00:00 AM", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var6 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    sun.util.calendar.ZoneInfo var1 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.hasSameRules((java.util.TimeZone)var1);
    boolean var3 = var0.isDirty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.lang.String var1 = var0.getID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Asia/Kolkata"+ "'", var1.equals("Asia/Kolkata"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("com.sun.proxy.$Proxy14");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.TimeZone var1 = java.util.TimeZone.getTimeZone("libhi!.dylib");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.net.URL var1 = java.lang.ClassLoader.getSystemResource("Asia/Kolkata");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.System.loadLibrary("\n");
      fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Date var3 = new java.util.Date(100, 1, 10);
    var3.setMinutes(100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.lang.annotation.Annotation[] var4 = var3.getDeclaredAnnotations();
    java.lang.reflect.Type var5 = var3.getGenericSuperclass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    sun.util.calendar.ZoneInfo var1 = new sun.util.calendar.ZoneInfo();
    boolean var2 = var0.hasSameRules((java.util.TimeZone)var1);
    java.lang.Object var3 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.lang.Package var4 = var3.getPackage();
    boolean var5 = var3.isArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.lang.Class[] var4 = var3.getInterfaces();
    java.lang.String var5 = var3.getCanonicalName();
    boolean var6 = var3.isSynthetic();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sun.proxy.$Proxy20"+ "'", var5.equals("com.sun.proxy.$Proxy20"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "10 Feb, 2000 12:00:00 AM", 10);
    java.lang.String var6 = var5.getDescription();
    java.lang.String var7 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();
    java.net.URL[] var1 = new java.net.URL[] { };
    java.net.URLClassLoader var2 = new java.net.URLClassLoader(var1);
    java.lang.Class[] var3 = new java.lang.Class[] { };
    java.lang.Class var4 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var2, var3);
    java.lang.annotation.Annotation[] var5 = var4.getDeclaredAnnotations();
    boolean var6 = var0.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    java.net.URLClassLoader var1 = new java.net.URLClassLoader(var0);
    java.lang.Class[] var2 = new java.lang.Class[] { };
    java.lang.Class var3 = java.lang.reflect.Proxy.getProxyClass((java.lang.ClassLoader)var1, var2);
    java.net.URL var5 = var1.findResource("");
    var1.setDefaultAssertionStatus(true);
    java.net.URL[] var8 = var1.getURLs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
