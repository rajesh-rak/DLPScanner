
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertElementAt((java.lang.Object)'4', (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var1 = var0.isEmpty();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var3.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.addAll(1, (java.util.Collection)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var1 = var0.isEmpty();
    java.util.Vector var3 = new java.util.Vector();
    boolean var4 = var3.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.addAll(100, (java.util.Collection)var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Enumeration var2 = var1.elements();
    boolean var3 = var0.retainAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Enumeration var2 = var1.elements();
    boolean var3 = var0.retainAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = var1.subList(1, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    java.lang.Object[] var3 = new java.lang.Object[] { ""};
    var0.copyInto(var3);
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.lastIndexOf((java.lang.Object)var6, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var1 = var0.isEmpty();
    int var3 = var0.indexOf((java.lang.Object)(byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.set(1, (java.lang.Object)0L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0);
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "", 10, var11);
    javax.management.MBeanParameterInfo[] var13 = var12.getSignature();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"+ "'", var6.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0);
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "", 10, var11);
    java.lang.Object var13 = var12.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Enumeration var2 = var1.elements();
    boolean var3 = var0.retainAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    java.lang.Object[] var3 = new java.lang.Object[] { ""};
    var0.copyInto(var3);
    var0.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertElementAt((java.lang.Object)(-1.0d), (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.ListIterator var1 = var0.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)100L, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)1L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var1 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    int var3 = var2.capacity();
    boolean var4 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0);
    java.lang.annotation.Annotation[] var12 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var13 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var12);
    javax.management.MBeanOperationInfo var14 = new javax.management.MBeanOperationInfo("hi!", "hi!", var6, "", 10, var13);
    javax.management.MBeanOperationInfo var17 = new javax.management.MBeanOperationInfo("hi!", "", var6, "hi!", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("", "", var2, "hi!", 0);
    javax.management.Descriptor var6 = var5.getDescriptor();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"+ "'", var7.equals("javax.management.MBeanOperationInfo[description=, name=, returnType=hi!, signature=[], impact=info, descriptor={}]"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.ListIterator var1 = var0.listIterator();
    var0.setSize(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var1 = var0.isEmpty();
    int var3 = var0.indexOf((java.lang.Object)(byte)100);
    java.awt.Window[] var4 = java.awt.Window.getWindows();
    var0.copyInto((java.lang.Object[])var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    int var3 = var2.capacity();
    java.util.ListIterator var4 = var2.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    java.lang.Object[] var3 = new java.lang.Object[] { ""};
    var0.copyInto(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", 0);
    java.lang.annotation.Annotation[] var10 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var11 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var10);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "", 10, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var13 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var2.lastIndexOf((java.lang.Object)1L, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Enumeration var2 = var1.elements();
    boolean var3 = var0.retainAll((java.util.Collection)var1);
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.util.Enumeration var2 = var1.elements();
    boolean var3 = var0.retainAll((java.util.Collection)var1);
    javax.management.MBeanParameterInfo[] var6 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "", var6, "hi!", 0);
    javax.management.Descriptor var10 = var9.getDescriptor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.indexOf((java.lang.Object)var9, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.util.Vector var2 = new java.util.Vector(0, 10);
    int var3 = var2.capacity();
    java.util.ListIterator var4 = var2.listIterator();
    int var7 = var2.indexOf((java.lang.Object)0L, 1);
    var2.insertElementAt((java.lang.Object)(short)(-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    java.lang.Object[] var3 = new java.lang.Object[] { ""};
    var0.copyInto(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

}
