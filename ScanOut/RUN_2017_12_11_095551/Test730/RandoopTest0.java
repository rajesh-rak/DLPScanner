
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Formatter var2 = new java.util.Formatter("hi!", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.util.Debug var2 = sun.security.util.Debug.getInstance("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.Thread var1 = new java.lang.Thread("ff");

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var1 = new byte[] { (byte)(-1)};
    java.lang.String var2 = sun.security.util.Debug.toString(var1);
    java.lang.String var3 = sun.security.util.Debug.toString(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ff"+ "'", var2.equals("ff"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "ff"+ "'", var3.equals("ff"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.security.AccessControlContext var0 = java.security.AccessController.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable[] var2 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("ff", "hi!", var2, "hi!", 0);
    boolean var7 = var5.equals((java.lang.Object)(-1.0d));
    java.lang.String var8 = var5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    boolean var5 = var2.containsKey((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("ff", "hi!", var2, "hi!", 0);
    java.lang.String var6 = var5.getName();
    javax.management.MBeanParameterInfo[] var7 = var5.getSignature();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ff"+ "'", var6.equals("ff"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.management.MBeanOperationInfo[description=hi!, name=ff, returnType=hi!, signature=[], impact=info, descriptor={}]"+ "'", var8.equals("javax.management.MBeanOperationInfo[description=hi!, name=ff, returnType=hi!, signature=[], impact=info, descriptor={}]"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    boolean var1 = sun.security.util.Debug.isOn("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.util.Hashtable var3 = new java.util.Hashtable(0, 10.0f);
    java.util.Enumeration var4 = var3.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.annotation.Annotation var5 = sun.reflect.annotation.AnnotationParser.annotationForMap(var0, (java.util.Map)var3);
      fail("Expected exception of type java.lang.annotation.AnnotationFormatError");
    } catch (java.lang.annotation.AnnotationFormatError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var1 = var0.getMethods();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.Exception var0 = new java.lang.Exception();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    java.lang.Throwable var2 = new java.lang.Throwable();
    var0.addSuppressed(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)0.0f, "ff");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("ff");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("ff", "hi!", var4, "hi!", 0);
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("", "javax.management.MBeanOperationInfo[description=hi!, name=ff, returnType=hi!, signature=[], impact=info, descriptor={}]", var4, "javax.management.MBeanOperationInfo[description=hi!, name=ff, returnType=hi!, signature=[], impact=info, descriptor={}]", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isArray();
    java.lang.reflect.Type[] var2 = var0.getGenericInterfaces();
    java.lang.Class var4 = sun.reflect.Reflection.getCallerClass();
    java.lang.reflect.Method[] var5 = var4.getMethods();
    java.lang.Class[] var6 = new java.lang.Class[] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.Method var7 = var0.getMethod("", var6);
      fail("Expected exception of type java.lang.NoSuchMethodException");
    } catch (java.lang.NoSuchMethodException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isArray();
    java.lang.Class var2 = sun.reflect.Reflection.getCallerClass();
    boolean var3 = var2.isArray();
    java.lang.reflect.Constructor[] var4 = var2.getDeclaredConstructors();
    java.lang.Class var5 = var0.asSubclass(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    byte[] var5 = new byte[] { (byte)(-1)};
    java.lang.String var6 = sun.security.util.Debug.toString(var5);
    boolean var7 = var2.equals((java.lang.Object)var5);
    java.lang.Object var9 = var2.get((java.lang.Object)"ff");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ff"+ "'", var6.equals("ff"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var0 = sun.reflect.Reflection.getCallerClass();
    boolean var1 = var0.isArray();
    java.lang.annotation.Annotation[] var2 = var0.getDeclaredAnnotations();
    int var3 = var0.getModifiers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1025);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Enumeration var3 = var2.elements();
    int var4 = var2.size();
    java.util.Set var5 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("ff", "hi!", var2, "hi!", 0);
    java.lang.String var6 = var5.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Formatter var0 = new java.util.Formatter();
    java.lang.String var1 = var0.toString();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("ff", "javax.management.MBeanOperationInfo[description=hi!, name=ff, returnType=hi!, signature=[], impact=info, descriptor={}]");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

}
