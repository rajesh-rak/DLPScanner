
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)var0, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)10, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)10.0f, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0, var6);
    boolean var9 = var7.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0, var6);
    java.lang.String var8 = var7.getDescription();
    java.lang.Object var9 = var7.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(-1), "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "hi!", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var7, "hi!", 0, var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 0, var11);
    javax.management.Descriptor var14 = var13.getDescriptor();
    java.lang.String var15 = var13.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var7, "hi!", 0, var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 0, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)"hi!", "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0, var6);
    java.lang.String var8 = var7.getDescription();
    javax.management.Descriptor var9 = var7.getDescriptor();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"+ "'", var10.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var2 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var3 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0, var6);
    int var8 = var7.getImpact();
    java.lang.Object var9 = var7.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex(var9, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var10);
    javax.management.MBeanOperationInfo var14 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "", 100);
    javax.management.MBeanParameterInfo[] var19 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var22 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var23 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var22);
    javax.management.MBeanOperationInfo var24 = new javax.management.MBeanOperationInfo("", "", var19, "hi!", 0, var23);
    java.lang.String var25 = var24.getDescription();
    javax.management.Descriptor var26 = var24.getDescriptor();
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]", var6, "", 1, var26);
    javax.management.MBeanParameterInfo[] var28 = var27.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "hi!", 10);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=(10), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=(10), descriptor={}]"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "", var4, "", 0);
    javax.management.MBeanParameterInfo[] var13 = var12.getSignature();
    java.lang.String var14 = var12.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = com.sun.xml.internal.ws.server.EndpointFactory.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "", 100);
    javax.management.MBeanParameterInfo[] var13 = var12.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var7, "hi!", 0, var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 0, var11);
    java.lang.String var14 = var13.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)(-1));
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var9 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var12 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var13 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var12);
    javax.management.MBeanOperationInfo var14 = new javax.management.MBeanOperationInfo("", "", var9, "hi!", 0, var13);
    javax.management.MBeanOperationInfo var15 = new javax.management.MBeanOperationInfo("", "hi!", var4, "hi!", 0, var13);
    javax.management.Descriptor var16 = var15.getDescriptor();
    javax.management.MBeanParameterInfo[] var17 = var15.getSignature();
    javax.management.MBeanOperationInfo var20 = new javax.management.MBeanOperationInfo("javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=(10), descriptor={}]", "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]", var17, "javax.management.MBeanOperationInfo[description=, name=hi!, returnType=hi!, signature=[], impact=(10), descriptor={}]", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0, var6);
    java.lang.String var8 = var7.getDescription();
    javax.management.Descriptor var9 = var7.getDescriptor();
    java.lang.String var10 = var7.getReturnType();
    javax.management.Descriptor var11 = var7.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var7, "hi!", 0, var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 0, var11);
    java.lang.Object var14 = var13.clone();
    java.lang.String var15 = var13.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "", 100);
    int var13 = var12.getImpact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(-1), "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var7, "hi!", 0, var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "hi!", var2, "hi!", 0, var11);
    java.lang.Object var14 = var13.clone();
    java.lang.String var15 = var13.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

}
