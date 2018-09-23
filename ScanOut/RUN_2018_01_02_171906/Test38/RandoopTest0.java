
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector();
    boolean var13 = var11.contains((java.lang.Object)(byte)0);
    var11.ensureCapacity(1);
    var11.ensureCapacity(0);
    boolean var18 = var5.add((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var11.subList(100, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector();
    boolean var13 = var11.contains((java.lang.Object)(byte)0);
    var11.ensureCapacity(1);
    var11.ensureCapacity(0);
    boolean var18 = var5.add((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var21 = var5.indexOf((java.lang.Object)0.0d, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(100, (java.lang.Object)0L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    boolean var4 = var0.removeElement((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var5 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var6 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var5);
    javax.management.MBeanOperationInfo var7 = new javax.management.MBeanOperationInfo("", "hi!", var2, "", (-1), var6);
    java.lang.String var8 = var7.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var0);
    java.lang.Object var12 = var0.clone();
    sun.reflect.annotation.AnnotationParser var13 = new sun.reflect.annotation.AnnotationParser();
    boolean var14 = var0.contains((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector();
    int var12 = var11.size();
    int var13 = var11.capacity();
    boolean var14 = var5.equals((java.lang.Object)var13);
    var5.ensureCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var12 = new java.util.Vector();
    int var13 = var12.size();
    boolean var14 = var11.retainAll((java.util.Collection)var12);
    var11.ensureCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var5.addAll((java.util.Collection)var12);
    int var15 = var12.indexOf((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Enumeration var11 = var0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    var0.ensureCapacity(0);
    java.util.ListIterator var7 = var0.listIterator();
    int var9 = var0.indexOf((java.lang.Object)(byte)1);
    java.util.Vector var10 = new java.util.Vector();
    boolean var12 = var10.contains((java.lang.Object)(byte)0);
    var10.ensureCapacity(1);
    java.util.Vector var15 = new java.util.Vector();
    boolean var17 = var15.contains((java.lang.Object)(byte)0);
    var15.ensureCapacity(1);
    boolean var20 = var10.containsAll((java.util.Collection)var15);
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var10);
    java.util.Vector var22 = new java.util.Vector();
    boolean var24 = var22.contains((java.lang.Object)(byte)0);
    var22.ensureCapacity(1);
    java.util.Vector var27 = new java.util.Vector();
    boolean var29 = var27.contains((java.lang.Object)(byte)0);
    var27.ensureCapacity(1);
    boolean var32 = var22.containsAll((java.util.Collection)var27);
    java.util.Vector var33 = new java.util.Vector();
    boolean var35 = var33.contains((java.lang.Object)(byte)0);
    var33.ensureCapacity(1);
    var33.ensureCapacity(0);
    boolean var40 = var27.add((java.lang.Object)var33);
    boolean var41 = var10.remove((java.lang.Object)var27);
    java.lang.Object var44 = var27.set(0, (java.lang.Object)100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)0, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var0.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector();
    boolean var13 = var11.contains((java.lang.Object)(byte)0);
    var11.ensureCapacity(1);
    java.util.Vector var16 = new java.util.Vector();
    boolean var18 = var16.contains((java.lang.Object)(byte)0);
    var16.ensureCapacity(1);
    boolean var21 = var11.containsAll((java.util.Collection)var16);
    java.util.Vector var22 = new java.util.Vector();
    boolean var24 = var22.contains((java.lang.Object)(byte)0);
    var22.ensureCapacity(1);
    var22.ensureCapacity(0);
    boolean var29 = var16.add((java.lang.Object)var22);
    var16.ensureCapacity(1);
    int var32 = var16.size();
    boolean var34 = var16.equals((java.lang.Object)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setElementAt((java.lang.Object)var34, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var12 = new java.util.Vector(0);
    boolean var13 = var5.addAll((java.util.Collection)var12);
    boolean var15 = var5.remove((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var12 = new java.util.Vector();
    boolean var14 = var12.contains((java.lang.Object)(byte)0);
    var12.ensureCapacity(1);
    java.util.Vector var17 = new java.util.Vector();
    boolean var19 = var17.contains((java.lang.Object)(byte)0);
    var17.ensureCapacity(1);
    boolean var22 = var12.containsAll((java.util.Collection)var17);
    java.util.Vector var23 = new java.util.Vector();
    boolean var25 = var23.contains((java.lang.Object)(byte)0);
    var23.ensureCapacity(1);
    var23.ensureCapacity(0);
    boolean var30 = var17.add((java.lang.Object)var23);
    boolean var31 = var0.remove((java.lang.Object)var17);
    java.lang.Object var34 = var17.set(0, (java.lang.Object)100L);
    var17.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector();
    int var12 = var11.size();
    int var13 = var11.capacity();
    boolean var14 = var5.equals((java.lang.Object)var13);
    java.lang.annotation.Annotation[] var15 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var16 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var15);
    java.lang.Object[] var17 = var5.toArray((java.lang.Object[])var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    boolean var12 = var5.contains((java.lang.Object)1.0d);
    java.util.Vector var14 = new java.util.Vector();
    boolean var16 = var14.contains((java.lang.Object)(byte)0);
    var14.ensureCapacity(1);
    java.util.Vector var19 = new java.util.Vector();
    boolean var21 = var19.contains((java.lang.Object)(byte)0);
    var19.ensureCapacity(1);
    boolean var24 = var14.containsAll((java.util.Collection)var19);
    java.util.Vector var25 = new java.util.Vector();
    boolean var27 = var25.contains((java.lang.Object)(byte)0);
    var25.ensureCapacity(1);
    var25.ensureCapacity(0);
    boolean var32 = var19.add((java.lang.Object)var25);
    var19.ensureCapacity(1);
    int var35 = var19.size();
    boolean var37 = var19.equals((java.lang.Object)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var38 = var5.addAll((-1), (java.util.Collection)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    var0.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.contains((java.lang.Object)(byte)0);
    var0.ensureCapacity(1);
    java.util.Vector var5 = new java.util.Vector();
    boolean var7 = var5.contains((java.lang.Object)(byte)0);
    var5.ensureCapacity(1);
    boolean var10 = var0.containsAll((java.util.Collection)var5);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var13 = new java.util.Vector();
    boolean var15 = var13.contains((java.lang.Object)(byte)0);
    var13.ensureCapacity(1);
    java.util.Vector var18 = new java.util.Vector();
    boolean var20 = var18.contains((java.lang.Object)(byte)0);
    var18.ensureCapacity(1);
    boolean var23 = var13.containsAll((java.util.Collection)var18);
    java.util.Vector var25 = new java.util.Vector(0);
    boolean var26 = var18.addAll((java.util.Collection)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var11.set(10, (java.lang.Object)var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.lang.Object[] var3 = new java.lang.Object[] { ' '};
    java.lang.Object[] var4 = var1.toArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    javax.management.MBeanParameterInfo[] var4 = new javax.management.MBeanParameterInfo[] { };
    java.lang.annotation.Annotation[] var7 = new java.lang.annotation.Annotation[] { };
    javax.management.Descriptor var8 = com.sun.jmx.mbeanserver.Introspector.descriptorForAnnotations(var7);
    javax.management.MBeanOperationInfo var9 = new javax.management.MBeanOperationInfo("", "hi!", var4, "", (-1), var8);
    javax.management.MBeanOperationInfo var12 = new javax.management.MBeanOperationInfo("", "", var4, "hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
