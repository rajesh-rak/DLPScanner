
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.xml.internal.ws.util.HandlerAnnotationProcessor var0 = new com.sun.xml.internal.ws.util.HandlerAnnotationProcessor();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.xml.internal.ws.server.EndpointFactory var0 = new com.sun.xml.internal.ws.server.EndpointFactory();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var5 = var1.add((java.lang.Object)' ');
    boolean var7 = var1.removeElement((java.lang.Object)"");
    java.lang.Object var8 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    boolean var8 = var1.add((java.lang.Object)var7);
    var1.setSize(100);
    java.lang.Object[] var11 = var1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var4 = new java.util.Vector(10);
    boolean var6 = var4.remove((java.lang.Object)0L);
    boolean var7 = var4.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var1.addAll((-1), (java.util.Collection)var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var7 = new java.util.Vector(10);
    boolean var9 = var7.remove((java.lang.Object)0L);
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.remove((java.lang.Object)0L);
    boolean var14 = var7.add((java.lang.Object)var13);
    var7.setSize(100);
    java.util.Vector var17 = new java.util.Vector((java.util.Collection)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var1.set(1, (java.lang.Object)var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    boolean var8 = var1.add((java.lang.Object)var7);
    var1.setSize(100);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object var12 = var11.lastElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    var1.ensureCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.remove((java.lang.Object)0L);
    boolean var9 = var1.retainAll((java.util.Collection)var6);
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.remove((java.lang.Object)0L);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var17 = var15.remove((java.lang.Object)0L);
    boolean var18 = var11.add((java.lang.Object)var17);
    var11.setSize(100);
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var11);
    java.lang.Object var22 = var11.lastElement();
    boolean var23 = var6.retainAll((java.util.Collection)var11);
    java.util.Vector var25 = new java.util.Vector(10);
    boolean var27 = var25.remove((java.lang.Object)0L);
    java.util.Vector var29 = new java.util.Vector(10);
    boolean var31 = var29.remove((java.lang.Object)0L);
    boolean var32 = var25.add((java.lang.Object)var31);
    var25.setSize(100);
    java.util.Vector var35 = new java.util.Vector((java.util.Collection)var25);
    java.util.Vector var37 = new java.util.Vector(10);
    java.util.Vector var39 = new java.util.Vector(10);
    boolean var41 = var39.remove((java.lang.Object)0L);
    boolean var42 = var39.isEmpty();
    int var44 = var37.indexOf((java.lang.Object)var42, 1);
    boolean var45 = var25.retainAll((java.util.Collection)var37);
    boolean var46 = var11.removeAll((java.util.Collection)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.remove((java.lang.Object)0L);
    boolean var9 = var1.retainAll((java.util.Collection)var6);
    boolean var11 = var1.equals((java.lang.Object)'#');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    boolean var8 = var1.add((java.lang.Object)var7);
    var1.setSize(100);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var13 = new java.util.Vector(10);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var17 = var15.remove((java.lang.Object)0L);
    boolean var18 = var15.isEmpty();
    int var20 = var13.indexOf((java.lang.Object)var18, 1);
    boolean var21 = var1.retainAll((java.util.Collection)var13);
    var13.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.get(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.reflect.AccessibleObject[] var0 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    java.lang.reflect.AccessibleObject.setAccessible(var0, false);
    java.lang.reflect.AccessibleObject.setAccessible(var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.remove((java.lang.Object)0L);
    boolean var9 = var1.retainAll((java.util.Collection)var6);
    java.lang.reflect.AccessibleObject[] var11 = new java.lang.reflect.AccessibleObject[] { };
    java.lang.reflect.AccessibleObject.setAccessible(var11, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var6.set(10, (java.lang.Object)false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    boolean var8 = var1.add((java.lang.Object)var7);
    var1.setSize(100);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object var12 = var1.lastElement();
    var1.setElementAt((java.lang.Object)100.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var1 = new java.util.Vector(10);
    var1.trimToSize();
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    java.util.Vector var9 = new java.util.Vector(10);
    boolean var11 = var9.remove((java.lang.Object)0L);
    boolean var12 = var5.add((java.lang.Object)var11);
    var5.setSize(100);
    java.util.Vector var15 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var17 = new java.util.Vector(10);
    java.util.Vector var19 = new java.util.Vector(10);
    boolean var21 = var19.remove((java.lang.Object)0L);
    boolean var22 = var19.isEmpty();
    int var24 = var17.indexOf((java.lang.Object)var22, 1);
    boolean var25 = var5.retainAll((java.util.Collection)var17);
    java.util.Enumeration var26 = var17.elements();
    boolean var27 = var1.addAll(0, (java.util.Collection)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.remove((java.lang.Object)0L);
    boolean var9 = var1.retainAll((java.util.Collection)var6);
    int var12 = var1.indexOf((java.lang.Object)(byte)1, 100);
    int var15 = var1.indexOf((java.lang.Object)(-1.0d), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var5 = var1.add((java.lang.Object)' ');
    java.util.Vector var7 = new java.util.Vector(10);
    boolean var9 = var7.remove((java.lang.Object)0L);
    boolean var11 = var7.add((java.lang.Object)' ');
    boolean var13 = var7.removeElement((java.lang.Object)"");
    var1.insertElementAt((java.lang.Object)var13, 0);
    boolean var17 = var1.add((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var3 = new java.util.Vector(10);
    boolean var5 = var3.remove((java.lang.Object)0L);
    boolean var6 = var3.isEmpty();
    int var8 = var1.indexOf((java.lang.Object)var6, 1);
    java.util.Vector var10 = new java.util.Vector(10);
    boolean var12 = var10.remove((java.lang.Object)0L);
    boolean var14 = var10.add((java.lang.Object)' ');
    boolean var15 = var1.retainAll((java.util.Collection)var10);
    java.util.Vector var17 = new java.util.Vector(10);
    boolean var19 = var17.remove((java.lang.Object)0L);
    boolean var20 = var17.isEmpty();
    java.util.Vector var22 = new java.util.Vector(10);
    boolean var24 = var22.remove((java.lang.Object)0L);
    boolean var25 = var17.retainAll((java.util.Collection)var22);
    java.util.Iterator var26 = var17.iterator();
    boolean var27 = var1.removeAll((java.util.Collection)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    boolean var4 = var1.isEmpty();
    java.util.Vector var6 = new java.util.Vector(10);
    boolean var8 = var6.remove((java.lang.Object)0L);
    boolean var9 = var1.retainAll((java.util.Collection)var6);
    java.util.Vector var11 = new java.util.Vector(10);
    boolean var13 = var11.remove((java.lang.Object)0L);
    java.util.Vector var15 = new java.util.Vector(10);
    boolean var17 = var15.remove((java.lang.Object)0L);
    boolean var18 = var11.add((java.lang.Object)var17);
    var11.setSize(100);
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var11);
    java.lang.Object var22 = var11.lastElement();
    boolean var23 = var6.retainAll((java.util.Collection)var11);
    java.awt.Window[] var24 = java.awt.Window.getWindows();
    var6.copyInto((java.lang.Object[])var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(1, 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(10);
    boolean var3 = var1.remove((java.lang.Object)0L);
    java.util.Vector var5 = new java.util.Vector(10);
    boolean var7 = var5.remove((java.lang.Object)0L);
    boolean var8 = var1.retainAll((java.util.Collection)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var1 = new java.util.Vector(10);
    var1.trimToSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.set((-1), (java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

}
