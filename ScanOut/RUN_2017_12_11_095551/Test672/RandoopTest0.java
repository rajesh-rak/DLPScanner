
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    boolean var9 = var5.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.annotation.Annotation[] var0 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var1 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    javax.management.Descriptor var2 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var3 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getReturnType();
    java.lang.Object var8 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


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

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.getDescription();
    javax.management.Descriptor var10 = var5.getDescriptor();
    java.lang.String var11 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var11.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    boolean var10 = var5.equals((java.lang.Object)false);
    int var11 = var5.getImpact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var2, var4);
    java.lang.String var6 = var5.getDescription();
    boolean var8 = var5.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", var2, "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)0.0d);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.getDescription();
    javax.management.Descriptor var10 = var5.getDescriptor();
    java.lang.Object var11 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var2, var4);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]"+ "'", var6.equals("javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var7.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    boolean var7 = var5.equals((java.lang.Object)(byte)0);
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    boolean var7 = var5.equals((java.lang.Object)(byte)0);
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.toString();
    java.lang.Object var10 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var8.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var9.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.getDescription();
    javax.management.Descriptor var10 = var5.getDescriptor();
    javax.management.Descriptor var11 = var5.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    boolean var7 = var5.equals((java.lang.Object)(byte)0);
    java.lang.String var8 = var5.getReturnType();
    int var9 = var5.getImpact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.getDescription();
    javax.management.MBeanParameterInfo[] var10 = var5.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var2, var4);
    java.lang.Object var6 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanConstructorInfo var9 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var6, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", var6, "hi!", 100);
    javax.management.MBeanParameterInfo[] var21 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var22 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var23 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var22);
    javax.management.MBeanConstructorInfo var24 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var21, var23);
    javax.management.MBeanConstructorInfo var25 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var21);
    javax.management.MBeanParameterInfo[] var28 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var29 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var30 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var29);
    javax.management.MBeanConstructorInfo var31 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var28, var30);
    javax.management.MBeanConstructorInfo var32 = new javax.management.MBeanConstructorInfo("javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", "", var21, var30);
    javax.management.MBeanOperationInfo var33 = new javax.management.MBeanOperationInfo("hi!", "", var6, "hi!", 1, var30);
    javax.management.Descriptor var34 = var33.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanConstructorInfo var9 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var6, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", var6, "hi!", 100);
    javax.management.MBeanParameterInfo[] var21 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var22 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var23 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var22);
    javax.management.MBeanConstructorInfo var24 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var21, var23);
    javax.management.MBeanConstructorInfo var25 = new javax.management.MBeanConstructorInfo("hi!", "hi!", var21);
    javax.management.MBeanParameterInfo[] var28 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var29 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var30 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var29);
    javax.management.MBeanConstructorInfo var31 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var28, var30);
    javax.management.MBeanConstructorInfo var32 = new javax.management.MBeanConstructorInfo("javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", "", var21, var30);
    javax.management.MBeanOperationInfo var33 = new javax.management.MBeanOperationInfo("hi!", "", var6, "hi!", 1, var30);
    java.lang.String var34 = var33.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.getReturnType();
    javax.management.MBeanParameterInfo[] var7 = var5.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", (-1));
    java.lang.String var6 = var5.toString();
    int var7 = var5.getImpact();
    java.lang.String var8 = var5.getReturnType();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"+ "'", var9.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanConstructorInfo var9 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var6, var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]", var6, "hi!", 100);
    javax.management.MBeanConstructorInfo var13 = new javax.management.MBeanConstructorInfo("hi!", "", var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var3 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var4 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var3);
    javax.management.MBeanConstructorInfo var5 = new javax.management.MBeanConstructorInfo("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}]", "", var2, var4);
    java.lang.String var6 = var5.toString();
    java.lang.reflect.AccessibleObject[] var7 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var7, false);
    boolean var10 = var5.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]"+ "'", var6.equals("javax.management.MBeanConstructorInfo[description=, name=javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=(-1), descriptor={}], signature=[], descriptor={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}
