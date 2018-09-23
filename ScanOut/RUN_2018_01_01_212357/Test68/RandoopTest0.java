
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.util.ListIterator var6 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var8 = new java.util.Vector(100, 10);
    int var11 = var8.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var12 = var8.toArray();
    boolean var13 = var2.retainAll((java.util.Collection)var8);
    java.util.Vector var14 = new java.util.Vector((java.util.Collection)var8);
    java.util.Iterator var15 = var14.iterator();
    java.util.Vector var18 = new java.util.Vector(100, 10);
    int var21 = var18.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var24 = new java.util.Vector(100, 10);
    int var27 = var24.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var28 = var24.toArray();
    boolean var29 = var18.retainAll((java.util.Collection)var24);
    java.util.Vector var30 = new java.util.Vector((java.util.Collection)var24);
    java.util.Iterator var31 = var30.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var33 = var14.lastIndexOf((java.lang.Object)var30, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.util.Vector var5 = new java.util.Vector(100, 10);
    int var8 = var5.indexOf((java.lang.Object)'a', 1);
    var2.addElement((java.lang.Object)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.util.Vector var5 = new java.util.Vector(100, 10);
    int var8 = var5.indexOf((java.lang.Object)'a', 1);
    boolean var9 = var2.containsAll((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var6 = var2.toArray();
    int var7 = var2.size();
    boolean var8 = var2.isEmpty();
    java.util.Vector var11 = new java.util.Vector(100, 10);
    int var14 = var11.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var15 = var11.toArray();
    boolean var16 = var2.addAll((java.util.Collection)var11);
    java.lang.String var17 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var2.set((-1), (java.lang.Object)"");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var6 = var2.toArray();
    int var7 = var2.size();
    boolean var8 = var2.isEmpty();
    java.util.Vector var11 = new java.util.Vector(100, 10);
    int var14 = var11.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var15 = var11.toArray();
    int var16 = var11.size();
    boolean var17 = var11.isEmpty();
    java.util.Vector var20 = new java.util.Vector(100, 10);
    int var23 = var20.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var24 = var20.toArray();
    boolean var25 = var11.addAll((java.util.Collection)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var27 = var2.lastIndexOf((java.lang.Object)var25, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.util.Vector var5 = new java.util.Vector(100, 10);
    int var8 = var5.indexOf((java.lang.Object)'a', 1);
    var2.addElement((java.lang.Object)1);
    java.lang.Object[] var10 = var2.toArray();
    var2.ensureCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.add((java.lang.Object)0.0f);
    java.util.Vector var5 = new java.util.Vector(100, 10);
    int var8 = var5.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var11 = new java.util.Vector(100, 10);
    int var14 = var11.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var15 = var11.toArray();
    boolean var16 = var5.retainAll((java.util.Collection)var11);
    java.util.Vector var17 = new java.util.Vector((java.util.Collection)var11);
    boolean var18 = var0.addAll((java.util.Collection)var17);
    boolean var20 = var0.add((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    java.util.Vector var5 = new java.util.Vector(100, 10);
    int var8 = var5.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var9 = var5.toArray();
    int var10 = var5.size();
    boolean var11 = var5.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.sendRelationRemovalNotification("hi!", (java.util.List)var5);
      fail("Expected exception of type javax.management.relation.RelationNotFoundException");
    } catch (javax.management.relation.RelationNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var8 = new java.util.Vector(100, 10);
    int var11 = var8.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var12 = var8.toArray();
    boolean var13 = var2.retainAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var8.get(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.isActive();
      fail("Expected exception of type javax.management.relation.RelationServiceNotRegisteredException");
    } catch (javax.management.relation.RelationServiceNotRegisteredException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var6 = var2.toArray();
    java.lang.Object var7 = var2.clone();
    java.util.Enumeration var8 = var2.elements();
    int var9 = var2.capacity();
    java.util.Vector var12 = new java.util.Vector(100, 10);
    int var15 = var12.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var16 = var12.toArray();
    java.lang.Object var17 = var12.clone();
    java.util.Enumeration var18 = var12.elements();
    java.util.Vector var21 = new java.util.Vector(100, 10);
    int var24 = var21.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var27 = new java.util.Vector(100, 10);
    int var30 = var27.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var31 = var27.toArray();
    boolean var32 = var21.retainAll((java.util.Collection)var27);
    java.util.Vector var33 = new java.util.Vector((java.util.Collection)var27);
    boolean var34 = var12.containsAll((java.util.Collection)var27);
    boolean var35 = var2.contains((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var6 = var2.toArray();
    int var7 = var2.size();
    boolean var9 = var2.remove((java.lang.Object)0L);
    java.util.Iterator var10 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    var1.postRegister((java.lang.Boolean)false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    var2.setSize(0);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var2.addAll((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var4 = new java.util.Vector(100, 10);
    int var7 = var4.indexOf((java.lang.Object)'a', 1);
    java.util.Vector var10 = new java.util.Vector(100, 10);
    int var13 = var10.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var14 = var10.toArray();
    boolean var15 = var4.retainAll((java.util.Collection)var10);
    boolean var16 = var0.addAll(0, (java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(100, 10);
    int var5 = var2.indexOf((java.lang.Object)'a', 1);
    java.lang.Object[] var6 = var2.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add((-1), (java.lang.Object)(byte)100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    javax.management.relation.RelationService var1 = new javax.management.relation.RelationService(true);
    javax.management.MBeanNotificationInfo[] var2 = var1.getNotificationInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var1 = new java.util.Vector(10);

  }

}
