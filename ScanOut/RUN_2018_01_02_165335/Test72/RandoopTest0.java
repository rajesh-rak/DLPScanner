
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var2 = var1.getParent();
    var1.finest("hi!");
    var1.entering("", "", (java.lang.Object)(short)(-1));
    var1.fine("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var2 = var1.getParent();
    var1.warning("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsKey((java.lang.Object)100);
    java.util.Enumeration var3 = var0.propertyNames();
    java.lang.String var6 = var0.getProperty("", "");
    boolean var8 = var0.containsValue((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsKey((java.lang.Object)100);
    java.util.Enumeration var3 = var0.propertyNames();
    java.lang.String var6 = var0.getProperty("", "");
    boolean var7 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Collection var1 = var0.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var2 = var1.getParent();
    var1.finest("hi!");
    var1.entering("", "", (java.lang.Object)(short)(-1));
    var1.finest("hi!");
    javax.management.MBeanParameterInfo[] var15 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var18 = new javax.management.MBeanOperationInfo("", "hi!", var15, "", 0);
    javax.management.Descriptor var19 = var18.getDescriptor();
    var1.exiting("hi!", "", (java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.jmx.remote.util.ClassLogger var2 = new com.sun.jmx.remote.util.ClassLogger("", "hi!");
    var2.config("hi!", "");

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.jmx.remote.util.ClassLogger var2 = new com.sun.jmx.remote.util.ClassLogger("", "hi!");
    boolean var3 = var2.traceOn();
    boolean var4 = var2.warningOn();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.jmx.remote.util.ClassLogger var2 = new com.sun.jmx.remote.util.ClassLogger("", "hi!");
    var2.debug("", "");
    boolean var6 = var2.debugOn();
    boolean var7 = var2.infoOn();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Properties var0 = new java.util.Properties();
    boolean var2 = var0.containsKey((java.lang.Object)100);
    java.util.Enumeration var3 = var0.elements();
    java.util.Properties var4 = new java.util.Properties();
    boolean var6 = var4.containsKey((java.lang.Object)100);
    boolean var7 = var0.contains((java.lang.Object)var6);
    java.lang.Object var10 = var0.setProperty("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var2 = var1.getParent();
    var1.finest("hi!");
    var1.entering("", "", (java.lang.Object)(short)(-1));
    var1.finest("hi!");
    java.util.logging.Logger var14 = java.util.logging.Logger.getLogger("");
    var1.exiting("hi!", "hi!", (java.lang.Object)var14);
    java.util.ResourceBundle var16 = var1.getResourceBundle();
    java.util.logging.Level var17 = var1.getLevel();
    java.util.logging.Logger var19 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var20 = var19.getParent();
    var19.finest("hi!");
    var19.entering("", "", (java.lang.Object)(short)(-1));
    var19.finest("hi!");
    java.util.logging.Logger var32 = java.util.logging.Logger.getLogger("");
    var19.exiting("hi!", "hi!", (java.lang.Object)var32);
    java.util.ResourceBundle var34 = var19.getResourceBundle();
    java.util.logging.Level var35 = var19.getLevel();
    java.util.logging.Logger var37 = java.util.logging.Logger.getLogger("");
    java.util.logging.Logger var38 = var37.getParent();
    var37.finest("hi!");
    var37.entering("", "", (java.lang.Object)(short)(-1));
    var37.finest("hi!");
    java.util.logging.Logger var50 = java.util.logging.Logger.getLogger("");
    var37.exiting("hi!", "hi!", (java.lang.Object)var50);
    java.util.ResourceBundle var52 = var37.getResourceBundle();
    java.util.logging.Level var53 = var37.getLevel();
    com.sun.jmx.remote.util.ClassLogger var59 = new com.sun.jmx.remote.util.ClassLogger("", "hi!");
    var59.debug("", "");
    var59.trace("", "");
    var59.finest("", "");
    java.lang.Object[] var69 = new java.lang.Object[] { ""};
    var19.logp(var53, "hi!", "hi!", "hi!", var69);
    java.lang.Object[] var75 = new java.lang.Object[] { (-1L)};
    var1.logp(var53, "hi!", "hi!", "", var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "hi!", var2, "", 0);
    javax.management.Descriptor var6 = var5.getDescriptor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var7 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.jmx.remote.util.ClassLogger var2 = new com.sun.jmx.remote.util.ClassLogger("", "hi!");
    var2.debug("", "");
    var2.trace("", "");
    var2.finest("", "");
    var2.fine("", "");
    boolean var15 = var2.warningOn();
    boolean var16 = var2.finerOn();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

}
