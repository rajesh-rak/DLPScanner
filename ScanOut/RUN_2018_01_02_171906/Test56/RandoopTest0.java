
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)'#');
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var1 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)(short)0);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "", 10);
    java.lang.String var6 = var5.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var7, "", 10);
    java.lang.Object[] var11 = var2.toArray((java.lang.Object[])var7);
    int var12 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    int var5 = var2.indexOf((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var1 = new java.util.Vector((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var16 = var2.listIterator(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var10.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    java.util.Vector var17 = new java.util.Vector(10, 0);
    var17.removeAllElements();
    var17.removeAllElements();
    javax.management.MBeanParameterInfo[] var22 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("hi!", "", var22, "", 10);
    java.lang.Object[] var26 = var17.toArray((java.lang.Object[])var22);
    int var27 = var10.indexOf((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    int var16 = var2.lastIndexOf((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    javax.management.MBeanParameterInfo[] var2 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var5 = new javax.management.MBeanOperationInfo("hi!", "", var2, "", 10);
    java.lang.String var6 = var5.getName();
    java.lang.String var7 = var5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    java.util.Iterator var4 = var2.iterator();
    boolean var6 = var2.equals((java.lang.Object)true);
    java.util.ListIterator var8 = var2.listIterator(0);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    var11.removeAllElements();
    java.lang.Object[] var13 = var11.toArray();
    boolean var14 = var2.remove((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var2.elementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    var2.ensureCapacity(1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var7, "", 10);
    java.lang.Object[] var11 = var2.toArray((java.lang.Object[])var7);
    java.lang.Object[] var12 = var2.toArray();
    java.util.ListIterator var14 = var2.listIterator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    java.util.Iterator var4 = var2.iterator();
    boolean var6 = var2.equals((java.lang.Object)true);
    java.util.ListIterator var8 = var2.listIterator(0);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    var11.removeAllElements();
    java.lang.Object[] var13 = var11.toArray();
    boolean var14 = var2.remove((java.lang.Object)var11);
    java.util.ListIterator var15 = var11.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    java.util.Vector var17 = new java.util.Vector(10, 0);
    var17.removeAllElements();
    var17.removeAllElements();
    javax.management.MBeanParameterInfo[] var22 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("hi!", "", var22, "", 10);
    java.lang.Object[] var26 = var17.toArray((java.lang.Object[])var22);
    java.lang.Object[] var27 = var17.toArray();
    boolean var28 = var2.addAll((java.util.Collection)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var2.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var7, "", 10);
    java.lang.Object[] var11 = var2.toArray((java.lang.Object[])var7);
    java.util.Vector var14 = new java.util.Vector(10, 0);
    var14.removeAllElements();
    java.util.Iterator var16 = var14.iterator();
    boolean var17 = var2.removeElement((java.lang.Object)var14);
    int var19 = var2.indexOf((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    java.util.Vector var7 = new java.util.Vector(10, 0);
    java.util.Vector var10 = new java.util.Vector(10, 0);
    var10.removeAllElements();
    var10.removeAllElements();
    int var13 = var7.indexOf((java.lang.Object)var10);
    boolean var14 = var2.removeAll((java.util.Collection)var10);
    java.util.Vector var17 = new java.util.Vector(10, 0);
    var17.removeAllElements();
    var17.removeAllElements();
    javax.management.MBeanParameterInfo[] var22 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var25 = new javax.management.MBeanOperationInfo("hi!", "", var22, "", 10);
    java.lang.Object[] var26 = var17.toArray((java.lang.Object[])var22);
    java.lang.Object[] var27 = var17.toArray();
    boolean var28 = var2.addAll((java.util.Collection)var17);
    int var29 = var17.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    var5.removeAllElements();
    var5.removeAllElements();
    int var8 = var2.indexOf((java.lang.Object)var5);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    var11.removeAllElements();
    var11.removeAllElements();
    java.util.Vector var16 = new java.util.Vector(10, 0);
    java.util.Vector var19 = new java.util.Vector(10, 0);
    var19.removeAllElements();
    var19.removeAllElements();
    int var22 = var16.indexOf((java.lang.Object)var19);
    boolean var23 = var11.removeAll((java.util.Collection)var19);
    java.util.Vector var26 = new java.util.Vector(10, 0);
    var26.removeAllElements();
    var26.removeAllElements();
    javax.management.MBeanParameterInfo[] var31 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var34 = new javax.management.MBeanOperationInfo("hi!", "", var31, "", 10);
    java.lang.Object[] var35 = var26.toArray((java.lang.Object[])var31);
    java.lang.Object[] var36 = var26.toArray();
    boolean var37 = var11.addAll((java.util.Collection)var26);
    javax.management.MBeanParameterInfo[] var42 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var45 = new javax.management.MBeanOperationInfo("hi!", "", var42, "", 10);
    javax.management.MBeanOperationInfo var48 = new javax.management.MBeanOperationInfo("hi!", "", var42, "hi!", (-1));
    boolean var49 = var26.add((java.lang.Object)var48);
    boolean var50 = var2.contains((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.management.DynamicMBean var51 = com.sun.jmx.mbeanserver.Introspector.makeDynamicMBean((java.lang.Object)var50);
      fail("Expected exception of type javax.management.NotCompliantMBeanException");
    } catch (javax.management.NotCompliantMBeanException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    var5.removeAllElements();
    var5.removeAllElements();
    int var8 = var2.indexOf((java.lang.Object)var5);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    var11.removeAllElements();
    var11.removeAllElements();
    java.util.Vector var16 = new java.util.Vector(10, 0);
    java.util.Vector var19 = new java.util.Vector(10, 0);
    var19.removeAllElements();
    var19.removeAllElements();
    int var22 = var16.indexOf((java.lang.Object)var19);
    boolean var23 = var11.removeAll((java.util.Collection)var19);
    java.util.Vector var26 = new java.util.Vector(10, 0);
    var26.removeAllElements();
    var26.removeAllElements();
    javax.management.MBeanParameterInfo[] var31 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var34 = new javax.management.MBeanOperationInfo("hi!", "", var31, "", 10);
    java.lang.Object[] var35 = var26.toArray((java.lang.Object[])var31);
    java.lang.Object[] var36 = var26.toArray();
    boolean var37 = var11.addAll((java.util.Collection)var26);
    javax.management.MBeanParameterInfo[] var42 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var45 = new javax.management.MBeanOperationInfo("hi!", "", var42, "", 10);
    javax.management.MBeanOperationInfo var48 = new javax.management.MBeanOperationInfo("hi!", "", var42, "hi!", (-1));
    boolean var49 = var26.add((java.lang.Object)var48);
    boolean var50 = var2.contains((java.lang.Object)var26);
    java.util.Vector var53 = new java.util.Vector(10, 0);
    var53.removeAllElements();
    var53.removeAllElements();
    javax.management.MBeanParameterInfo[] var58 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var61 = new javax.management.MBeanOperationInfo("hi!", "", var58, "", 10);
    java.lang.Object[] var62 = var53.toArray((java.lang.Object[])var58);
    java.lang.Object[] var63 = var53.toArray();
    java.lang.Object[] var64 = var2.toArray(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    var2.removeAllElements();
    javax.management.MBeanParameterInfo[] var7 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var10 = new javax.management.MBeanOperationInfo("hi!", "", var7, "", 10);
    java.lang.Object[] var11 = var2.toArray((java.lang.Object[])var7);
    java.util.Vector var14 = new java.util.Vector(10, 0);
    var14.removeAllElements();
    java.lang.Object[] var16 = var14.toArray();
    boolean var17 = var2.equals((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var14.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    java.util.Vector var5 = new java.util.Vector(10, 0);
    var5.removeAllElements();
    var5.removeAllElements();
    int var8 = var2.indexOf((java.lang.Object)var5);
    java.util.Vector var11 = new java.util.Vector(10, 0);
    var11.removeAllElements();
    var11.removeAllElements();
    java.util.Vector var16 = new java.util.Vector(10, 0);
    java.util.Vector var19 = new java.util.Vector(10, 0);
    var19.removeAllElements();
    var19.removeAllElements();
    int var22 = var16.indexOf((java.lang.Object)var19);
    boolean var23 = var11.removeAll((java.util.Collection)var19);
    java.util.Vector var26 = new java.util.Vector(10, 0);
    var26.removeAllElements();
    var26.removeAllElements();
    javax.management.MBeanParameterInfo[] var31 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var34 = new javax.management.MBeanOperationInfo("hi!", "", var31, "", 10);
    java.lang.Object[] var35 = var26.toArray((java.lang.Object[])var31);
    java.lang.Object[] var36 = var26.toArray();
    boolean var37 = var11.addAll((java.util.Collection)var26);
    javax.management.MBeanParameterInfo[] var42 = new javax.management.MBeanParameterInfo[] { };
    javax.management.MBeanOperationInfo var45 = new javax.management.MBeanOperationInfo("hi!", "", var42, "", 10);
    javax.management.MBeanOperationInfo var48 = new javax.management.MBeanOperationInfo("hi!", "", var42, "hi!", (-1));
    boolean var49 = var26.add((java.lang.Object)var48);
    boolean var50 = var2.contains((java.lang.Object)var26);
    java.lang.Object[] var52 = new java.lang.Object[] { 100L};
    java.lang.Object[] var53 = var26.toArray(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, 0);
    var2.removeAllElements();
    java.util.Iterator var4 = var2.iterator();
    boolean var6 = var2.equals((java.lang.Object)true);
    java.util.ListIterator var8 = var2.listIterator(0);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

}
