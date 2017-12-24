
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

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
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)10.0d, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "hi!", 1);
    javax.management.MBeanParameterInfo[] var10 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var13 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var14 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var13);
    javax.management.MBeanOperationInfo var15 = new javax.management.MBeanOperationInfo("", "", var10, "hi!", 1, var14);
    javax.management.MBeanParameterInfo[] var20 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var23 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var24 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var23);
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("", "", var20, "hi!", 1, var24);
    javax.management.MBeanOperationInfo var26 = new javax.management.MBeanOperationInfo("", "", var10, "hi!", 0, var24);
    boolean var27 = var5.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 1, var8);
    javax.management.MBeanParameterInfo[] var14 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var17 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var18 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var17);
    javax.management.MBeanOperationInfo var19 = new javax.management.MBeanOperationInfo("", "", var14, "hi!", 1, var18);
    javax.management.MBeanOperationInfo var20 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var18);
    javax.management.Descriptor var21 = var20.getDescriptor();
    javax.management.MBeanParameterInfo[] var28 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var31 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var32 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var31);
    javax.management.MBeanOperationInfo var33 = new javax.management.MBeanOperationInfo("", "", var28, "hi!", 1, var32);
    javax.management.MBeanParameterInfo[] var38 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var41 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var42 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var41);
    javax.management.MBeanOperationInfo var43 = new javax.management.MBeanOperationInfo("", "", var38, "hi!", 1, var42);
    javax.management.MBeanOperationInfo var44 = new javax.management.MBeanOperationInfo("", "", var28, "hi!", 0, var42);
    java.lang.annotation.Annotation[] var47 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var48 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var47);
    javax.management.MBeanOperationInfo var49 = new javax.management.MBeanOperationInfo("hi!", "hi!", var28, "hi!", 100, var48);
    javax.management.Descriptor var50 = var49.getDescriptor();
    boolean var51 = var20.equals((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 1, var8);
    javax.management.MBeanParameterInfo[] var14 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var17 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var18 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var17);
    javax.management.MBeanOperationInfo var19 = new javax.management.MBeanOperationInfo("", "", var14, "hi!", 1, var18);
    javax.management.MBeanOperationInfo var20 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var18);
    javax.management.Descriptor var21 = var20.getDescriptor();
    java.lang.String var22 = var20.getDescription();
    java.lang.Object var23 = var20.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)true, "");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 1, var8);
    javax.management.MBeanParameterInfo[] var14 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var17 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var18 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var17);
    javax.management.MBeanOperationInfo var19 = new javax.management.MBeanOperationInfo("", "", var14, "hi!", 1, var18);
    javax.management.MBeanOperationInfo var20 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0, var18);
    javax.management.Descriptor var21 = var20.getDescriptor();
    javax.management.MBeanParameterInfo[] var22 = var20.getSignature();
    java.lang.String var23 = var20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"+ "'", var23.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "hi!", 1);
    int var6 = var5.getImpact();
    java.lang.Object var7 = var5.clone();
    javax.management.MBeanParameterInfo[] var12 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var15 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var16 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var15);
    javax.management.MBeanOperationInfo var17 = new javax.management.MBeanOperationInfo("", "", var12, "hi!", 1, var16);
    javax.management.MBeanParameterInfo[] var22 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("", "", var22, "hi!", 1, var26);
    javax.management.MBeanOperationInfo var28 = new javax.management.MBeanOperationInfo("", "", var12, "hi!", 0, var26);
    boolean var29 = var5.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 100, var26);
    javax.management.Descriptor var28 = var27.getDescriptor();
    java.lang.String var29 = var27.getReturnType();
    javax.management.MBeanParameterInfo[] var32 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var35 = new javax.management.MBeanOperationInfo("hi!", "", var32, "hi!", 1);
    boolean var36 = var27.equals((java.lang.Object)"hi!");
    javax.management.MBeanParameterInfo[] var37 = var27.getSignature();
    java.lang.String var38 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]"+ "'", var38.equals("javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 100, var26);
    javax.management.Descriptor var28 = var27.getDescriptor();
    int var29 = var27.getImpact();
    java.lang.String var30 = var27.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 100, var26);
    java.lang.String var28 = var27.getDescription();
    java.lang.String var29 = var27.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 100, var26);
    java.lang.String var28 = var27.getDescription();
    javax.management.Descriptor var29 = var27.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "hi!", 1);
    int var6 = var5.getImpact();
    java.lang.Object var7 = var5.clone();
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("hi!", "javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]", var6, "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    java.lang.annotation.Annotation[] var25 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var26 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var25);
    javax.management.MBeanOperationInfo var27 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 100, var26);
    javax.management.MBeanParameterInfo[] var28 = var27.getSignature();
    javax.management.Descriptor var29 = var27.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var9 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var10 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var9);
    javax.management.MBeanOperationInfo var11 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 1, var10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var19 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var20 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var19);
    javax.management.MBeanOperationInfo var21 = new javax.management.MBeanOperationInfo("", "", var16, "hi!", 1, var20);
    javax.management.MBeanOperationInfo var22 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0, var20);
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "hi!", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var26 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var6);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.MBeanParameterInfo[] var8 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var11 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var12 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var11);
    javax.management.MBeanOperationInfo var13 = new javax.management.MBeanOperationInfo("", "", var8, "hi!", 1, var12);
    javax.management.MBeanParameterInfo[] var18 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var21 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var22 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var21);
    javax.management.MBeanOperationInfo var23 = new javax.management.MBeanOperationInfo("", "", var18, "hi!", 1, var22);
    javax.management.MBeanOperationInfo var24 = new javax.management.MBeanOperationInfo("", "", var8, "hi!", 0, var22);
    java.lang.annotation.Annotation[] var27 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var28 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var27);
    javax.management.MBeanOperationInfo var29 = new javax.management.MBeanOperationInfo("hi!", "hi!", var8, "hi!", 100, var28);
    java.lang.String var30 = var29.getDescription();
    javax.management.MBeanParameterInfo[] var31 = var29.getSignature();
    javax.management.MBeanOperationInfo var34 = new javax.management.MBeanOperationInfo("hi!", "hi!", var31, "", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 1);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var2 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var3 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
