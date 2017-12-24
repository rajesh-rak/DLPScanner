
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.get(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var2.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object[] var4 = var2.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var2.lastIndexOf((java.lang.Object)10, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    java.util.Enumeration var2 = var0.getStyleNames();
    var0.removeStyle("hi!");
    javax.swing.text.Element var5 = var0.getBidiRootElement();
    java.util.Vector var8 = new java.util.Vector(1, 10);
    java.lang.Object var9 = var8.clone();
    java.lang.Object var10 = var8.clone();
    var0.putProperty((java.lang.Object)var8, (java.lang.Object)100.0f);
    javax.swing.text.DefaultStyledDocument var13 = new javax.swing.text.DefaultStyledDocument();
    var13.readLock();
    java.util.Enumeration var15 = var13.getStyleNames();
    javax.swing.event.UndoableEditListener[] var16 = var13.getUndoableEditListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.insertElementAt((java.lang.Object)var13, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object[] var4 = var2.toArray();
    boolean var6 = var2.add((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    java.util.Enumeration var2 = var0.getStyleNames();
    javax.swing.event.UndoableEditListener[] var3 = var0.getUndoableEditListeners();
    javax.swing.text.Element[] var4 = var0.getRootElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var13 = var2.subList(100, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    java.util.ListIterator var10 = var7.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    var3.readLock();
    java.util.Enumeration var5 = var3.getStyleNames();
    var3.removeStyle("hi!");
    javax.swing.text.Element var8 = var3.getBidiRootElement();
    java.util.Vector var11 = new java.util.Vector(1, 10);
    java.lang.Object var12 = var11.clone();
    java.lang.Object var13 = var11.clone();
    var3.putProperty((java.lang.Object)var11, (java.lang.Object)100.0f);
    boolean var16 = var2.equals((java.lang.Object)100.0f);
    java.util.Vector var19 = new java.util.Vector(1, 10);
    java.lang.Object var20 = var19.clone();
    var2.addElement((java.lang.Object)var19);
    java.util.Vector var22 = new java.util.Vector((java.util.Collection)var2);
    int var23 = var2.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    boolean var6 = var2.removeElement((java.lang.Object)(byte)1);
    java.util.Vector var9 = new java.util.Vector(1, 10);
    javax.swing.text.DefaultStyledDocument var10 = new javax.swing.text.DefaultStyledDocument();
    var10.readLock();
    java.util.Enumeration var12 = var10.getStyleNames();
    var10.removeStyle("hi!");
    javax.swing.text.Element var15 = var10.getBidiRootElement();
    java.util.Vector var18 = new java.util.Vector(1, 10);
    java.lang.Object var19 = var18.clone();
    java.lang.Object var20 = var18.clone();
    var10.putProperty((java.lang.Object)var18, (java.lang.Object)100.0f);
    boolean var23 = var9.equals((java.lang.Object)100.0f);
    boolean var24 = var2.remove((java.lang.Object)var23);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.util.Vector var6 = new java.util.Vector(1, 10);
    javax.swing.text.DefaultStyledDocument var7 = new javax.swing.text.DefaultStyledDocument();
    var7.readLock();
    java.util.Enumeration var9 = var7.getStyleNames();
    var7.removeStyle("hi!");
    javax.swing.text.Element var12 = var7.getBidiRootElement();
    java.util.Vector var15 = new java.util.Vector(1, 10);
    java.lang.Object var16 = var15.clone();
    java.lang.Object var17 = var15.clone();
    var7.putProperty((java.lang.Object)var15, (java.lang.Object)100.0f);
    boolean var20 = var6.equals((java.lang.Object)100.0f);
    java.util.Vector var23 = new java.util.Vector(1, 10);
    java.lang.Object var24 = var23.clone();
    var6.addElement((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)var23, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    java.util.Enumeration var2 = var0.getStyleNames();
    var0.removeStyle("hi!");
    java.util.Enumeration var5 = var0.getStyleNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    var2.ensureCapacity((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var2.elementAt(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    var0.readLock();
    java.util.Enumeration var2 = var0.getStyleNames();
    var0.removeStyle("hi!");
    javax.swing.text.Element var5 = var0.getBidiRootElement();
    int var6 = var0.getLength();
    java.lang.Object var8 = var0.getProperty((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.swing.text.DefaultStyledDocument var0 = new javax.swing.text.DefaultStyledDocument();
    javax.swing.text.Element var2 = var0.getParagraphElement(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(0, 1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    javax.swing.text.DefaultStyledDocument var3 = new javax.swing.text.DefaultStyledDocument();
    var3.readLock();
    java.util.Enumeration var5 = var3.getStyleNames();
    var3.removeStyle("hi!");
    javax.swing.text.Element var8 = var3.getBidiRootElement();
    java.util.Vector var11 = new java.util.Vector(1, 10);
    java.lang.Object var12 = var11.clone();
    java.lang.Object var13 = var11.clone();
    var3.putProperty((java.lang.Object)var11, (java.lang.Object)100.0f);
    boolean var16 = var2.equals((java.lang.Object)100.0f);
    java.util.Vector var20 = new java.util.Vector(1, 10);
    java.lang.Object var21 = var20.clone();
    java.lang.Object var22 = var20.clone();
    java.util.Vector var25 = new java.util.Vector(1, 10);
    java.lang.Object var26 = var25.clone();
    boolean var27 = var20.addAll((java.util.Collection)var25);
    var20.ensureCapacity((-1));
    boolean var30 = var2.addAll(0, (java.util.Collection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object[] var4 = var2.toArray();
    var2.setSize(10);
    javax.swing.text.DefaultStyledDocument var7 = new javax.swing.text.DefaultStyledDocument();
    var7.readLock();
    java.util.Enumeration var9 = var7.getStyleNames();
    javax.swing.event.UndoableEditListener[] var10 = var7.getUndoableEditListeners();
    javax.swing.text.Position var11 = var7.getEndPosition();
    boolean var12 = var2.removeElement((java.lang.Object)var7);
    javax.swing.text.DefaultStyledDocument var14 = new javax.swing.text.DefaultStyledDocument();
    var14.readLock();
    java.util.Enumeration var16 = var14.getStyleNames();
    var7.putProperty((java.lang.Object)(byte)100, (java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    javax.swing.text.DefaultStyledDocument var4 = new javax.swing.text.DefaultStyledDocument();
    var4.readLock();
    javax.swing.text.Element var6 = var4.getDefaultRootElement();
    int var7 = var2.lastIndexOf((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    java.util.Vector var7 = new java.util.Vector(1, 10);
    java.lang.Object var8 = var7.clone();
    boolean var9 = var2.addAll((java.util.Collection)var7);
    var2.clear();
    java.util.Iterator var11 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    java.lang.Object var4 = var2.clone();
    var2.ensureCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
