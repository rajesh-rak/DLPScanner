
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    java.util.Hashtable var3 = new java.util.Hashtable();
    var3.clear();
    var0.putAll((java.util.Map)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getReturnType();
    javax.management.MBeanParameterInfo[] var7 = var5.getSignature();
    javax.management.Descriptor var8 = var5.getDescriptor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("hi!");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var3 = var1.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getReturnType();
    int var7 = var5.getImpact();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)(short)(-1), "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getReturnType();
    javax.management.MBeanParameterInfo[] var7 = var5.getSignature();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]"+ "'", var8.equals("javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 10.0f);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    boolean var4 = var0.contains((java.lang.Object)' ');
    java.util.Enumeration var5 = var0.elements();
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    boolean var4 = var0.contains((java.lang.Object)' ');
    java.util.Enumeration var5 = var0.elements();
    java.util.Enumeration var6 = var0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = com.sun.jmx.mbeanserver.Introspector.elementFromComplex((java.lang.Object)10.0d, "hi!");
      fail("Expected exception of type javax.management.AttributeNotFoundException");
    } catch (javax.management.AttributeNotFoundException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Vector var8 = new java.util.Vector(10);
    java.util.Hashtable var9 = new java.util.Hashtable();
    boolean var11 = var9.containsValue((java.lang.Object)false);
    int var13 = var8.indexOf((java.lang.Object)var9, 10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var19 = new javax.management.MBeanOperationInfo("hi!", "hi!", var16, "hi!", 100);
    java.lang.String var20 = var19.getReturnType();
    javax.management.MBeanParameterInfo[] var21 = var19.getSignature();
    boolean var22 = var8.removeElement((java.lang.Object)var19);
    boolean var23 = var1.removeElement((java.lang.Object)var8);
    int var24 = var8.size();
    boolean var26 = var8.add((java.lang.Object)(short)1);
    java.util.Hashtable var27 = new java.util.Hashtable();
    boolean var29 = var27.containsValue((java.lang.Object)false);
    boolean var31 = var27.contains((java.lang.Object)' ');
    java.util.Enumeration var32 = var27.elements();
    java.util.Collection var33 = var27.values();
    boolean var34 = var8.addAll(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Enumeration var2 = var1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var1);
    javax.management.MBeanParameterInfo[] var12 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var15 = new javax.management.MBeanOperationInfo("hi!", "hi!", var12, "hi!", 100);
    java.lang.String var16 = var15.getReturnType();
    javax.management.MBeanParameterInfo[] var17 = var15.getSignature();
    javax.management.MBeanOperationInfo var20 = new javax.management.MBeanOperationInfo("", "hi!", var17, "javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]", 0);
    java.lang.Object[] var21 = var7.toArray((java.lang.Object[])var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Vector var8 = new java.util.Vector(10);
    java.util.Hashtable var9 = new java.util.Hashtable();
    boolean var11 = var9.containsValue((java.lang.Object)false);
    int var13 = var8.indexOf((java.lang.Object)var9, 10);
    javax.management.MBeanParameterInfo[] var16 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var19 = new javax.management.MBeanOperationInfo("hi!", "hi!", var16, "hi!", 100);
    java.lang.String var20 = var19.getReturnType();
    javax.management.MBeanParameterInfo[] var21 = var19.getSignature();
    boolean var22 = var8.removeElement((java.lang.Object)var19);
    boolean var23 = var1.removeElement((java.lang.Object)var8);
    java.util.Vector var25 = new java.util.Vector(10);
    boolean var26 = var1.add((java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var25.remove(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)"javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]");
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    var1.ensureCapacity(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var1.subList(10, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("hi!", "hi!", var4, "hi!", 100);
    java.lang.String var8 = var7.getReturnType();
    javax.management.MBeanParameterInfo[] var9 = var7.getSignature();
    java.lang.annotation.Annotation[] var12 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var13 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var12);
    javax.management.MBeanOperationInfo var14 = new javax.management.MBeanOperationInfo("javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]", "javax.management.MBeanOperationInfo[description=hi!, name=hi!, returnType=hi!, signature=[], impact=(100), descriptor={}]", var9, "hi!", 100, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    boolean var4 = var0.contains((java.lang.Object)' ');
    java.util.Enumeration var5 = var0.elements();
    java.util.Vector var7 = new java.util.Vector(10);
    java.lang.Object var8 = var0.get((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var8 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    boolean var6 = var2.contains((java.lang.Object)' ');
    java.util.Enumeration var7 = var2.elements();
    java.util.Collection var8 = var2.values();
    boolean var9 = var1.removeAll(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var8 = var7.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "hi!", var2, "hi!", 100);
    java.lang.String var6 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    boolean var2 = var0.containsValue((java.lang.Object)false);
    boolean var4 = var0.contains((java.lang.Object)' ');
    java.util.Enumeration var5 = var0.elements();
    java.util.Hashtable var6 = com.sun.naming.internal.ResourceManager.getInitialEnvironment(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Hashtable var2 = new java.util.Hashtable();
    boolean var4 = var2.containsValue((java.lang.Object)false);
    int var6 = var1.indexOf((java.lang.Object)var2, 10);
    java.util.Enumeration var7 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
