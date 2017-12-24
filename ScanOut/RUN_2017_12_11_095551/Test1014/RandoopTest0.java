
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Thread var1 = new java.lang.Thread("");

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.reflect.Field[] var2 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var3 = sun.reflect.Reflection.filterFields(var0, var2);
    java.lang.Class var4 = com.sun.jmx.mbeanserver.Introspector.getMBeanInterface(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var3 = var2.getClasses();
    java.io.ObjectStreamClass var4 = java.io.ObjectStreamClass.lookup(var2);
    java.lang.Class[] var5 = new java.lang.Class[] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Constructor var6 = var0.getConstructor(var5);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(1, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    boolean var1 = sun.security.util.Debug.isOn("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.reflect.Constructor[] var2 = var0.getDeclaredConstructors();
    java.lang.reflect.Constructor[] var3 = var0.getConstructors();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.reflect.Field[] var2 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var3 = sun.reflect.Reflection.filterFields(var0, var2);
    boolean var4 = com.sun.jmx.mbeanserver.Introspector.isDynamic(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var3 = var2.getClasses();
    java.lang.reflect.Constructor[] var4 = var2.getDeclaredConstructors();
    int var5 = var2.getModifiers();
    java.lang.Class[] var6 = new java.lang.Class[] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var7 = var0.getDeclaredMethod("hi!", var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
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
    assertTrue(var5 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Exception var2 = new java.lang.Exception("");
    java.lang.Exception var3 = new java.lang.Exception((java.lang.Throwable)var2);
    java.lang.Throwable var4 = new java.lang.Throwable("", (java.lang.Throwable)var3);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var2 = com.sun.jmx.mbeanserver.Introspector.getStandardMBeanInterface(var0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.String var3 = var0.getExponentSeparator();
    java.lang.Object var4 = var0.clone();
    var0.setMonetaryDecimalSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "E"+ "'", var3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.String var3 = var0.getExponentSeparator();
    var0.setMonetaryDecimalSeparator('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "E"+ "'", var3.equals("E"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.io.ObjectStreamClass var2 = java.io.ObjectStreamClass.lookup(var0);
    java.lang.annotation.Annotation[] var3 = var0.getAnnotations();
    java.lang.Class var5 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var6 = var5.getClasses();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var7 = var0.getMethod("hi!", var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.reflect.Constructor[] var2 = var0.getDeclaredConstructors();
    int var3 = var0.getModifiers();
    boolean var4 = var0.isAnnotation();
    java.security.ProtectionDomain var5 = var0.getProtectionDomain();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1025);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Exception var2 = new java.lang.Exception("");
    java.lang.Exception var3 = new java.lang.Exception((java.lang.Throwable)var2);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.Exception var5 = new java.lang.Exception("", (java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.io.ObjectStreamClass var2 = java.io.ObjectStreamClass.lookup(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sun.jmx.mbeanserver.Introspector.testCreation(var0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.String var3 = var0.getExponentSeparator();
    java.lang.Object var4 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex(var4, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "E"+ "'", var3.equals("E"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.Exception var1 = new java.lang.Exception("");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "java.lang.Exception: "+ "'", var2.equals("java.lang.Exception: "));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.Object var3 = var0.clone();
    java.lang.String var4 = var0.getNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\uFFFD"+ "'", var4.equals("\uFFFD"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "java.lang.Exception: ");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.Object var3 = var0.clone();
    var0.setGroupingSeparator('a');
    var0.setPercent('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.text.DecimalFormatSymbols var0 = new java.text.DecimalFormatSymbols();
    var0.setInternationalCurrencySymbol("");
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    var0.setInternationalCurrencySymbol("E");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.Class[] var1 = var0.getClasses();
    java.lang.reflect.Field[] var2 = new java.lang.reflect.Field[] { };
    java.lang.reflect.Field[] var3 = sun.reflect.Reflection.filterFields(var0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var4 = com.sun.jmx.mbeanserver.Introspector.getStandardMBeanInterface(var0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
