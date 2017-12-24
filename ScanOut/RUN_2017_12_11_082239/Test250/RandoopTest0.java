
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var4 = var2.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)100.0d);
    java.lang.Object var5 = var2.firstElement();
    java.util.Vector var9 = new java.util.Vector(10, 1);
    java.lang.String var10 = var9.toString();
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    java.lang.Object[] var17 = new java.lang.Object[] { var13};
    var9.copyInto(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var2.addAll((-1), (java.util.Collection)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector(10, 1);
    java.lang.Object[] var22 = new java.lang.Object[] { (short)0};
    var20.copyInto(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var25 = var13.lastIndexOf((java.lang.Object)var20, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)100.0d);
    java.lang.Object var5 = var2.firstElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.elementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    javax.swing.text.LayoutQueue var0 = javax.swing.text.LayoutQueue.getDefaultQueue();
    javax.swing.text.LayoutQueue.setDefaultQueue(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(0, "[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)100.0d);
    java.lang.Object var5 = var2.firstElement();
    java.lang.Object var6 = var2.firstElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100.0d+ "'", var5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0d+ "'", var6.equals(100.0d));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var4 = var2.indexOf((java.lang.Object)100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var6 = var2.listIterator(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector(10, 1);
    var20.addElement((java.lang.Object)100.0d);
    boolean var23 = var2.add((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    boolean var12 = var2.removeElement((java.lang.Object)100.0d);
    boolean var13 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { (short)0};
    var2.copyInto(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeElementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    int var4 = var2.indexOf((java.lang.Object)100.0d);
    java.util.Iterator var5 = var2.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector(10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Vector var24 = new java.util.Vector(10, 1);
    var24.addElement((java.lang.Object)100.0d);
    java.lang.Object var27 = var24.firstElement();
    boolean var28 = var20.addAll((java.util.Collection)var24);
    boolean var30 = var20.removeElement((java.lang.Object)100.0d);
    boolean var31 = var13.containsAll((java.util.Collection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 100.0d+ "'", var27.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    boolean var5 = var2.removeElement((java.lang.Object)(short)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    boolean var12 = var2.removeElement((java.lang.Object)100.0d);
    java.util.Vector var16 = new java.util.Vector(10, 1);
    var16.addElement((java.lang.Object)100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var2.addAll(100, (java.util.Collection)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    javax.swing.text.LayoutQueue var0 = new javax.swing.text.LayoutQueue();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.ListIterator var18 = var13.listIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var21 = var13.subList(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var6.set(100, (java.lang.Object)0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    boolean var5 = var2.removeElement((java.lang.Object)(short)1);
    boolean var7 = var2.contains((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector(10, 1);
    java.lang.String var21 = var20.toString();
    java.util.Vector var24 = new java.util.Vector(10, 1);
    var24.addElement((java.lang.Object)100.0d);
    java.lang.Object var27 = var24.firstElement();
    boolean var28 = var20.addAll((java.util.Collection)var24);
    java.util.Vector var29 = new java.util.Vector((java.util.Collection)var20);
    java.lang.Object[] var31 = new java.lang.Object[] { (short)100};
    var29.copyInto(var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)var31, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 100.0d+ "'", var27.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.ListIterator var18 = var13.listIterator();
    var13.ensureCapacity(100);
    java.util.Vector var23 = new java.util.Vector(10, 1);
    var23.addElement((java.lang.Object)100.0d);
    java.util.Vector var28 = new java.util.Vector(10, 1);
    java.lang.String var29 = var28.toString();
    java.util.Vector var32 = new java.util.Vector(10, 1);
    var32.addElement((java.lang.Object)100.0d);
    java.lang.Object var35 = var32.firstElement();
    boolean var36 = var28.addAll((java.util.Collection)var32);
    java.util.Vector var37 = new java.util.Vector((java.util.Collection)var28);
    java.lang.Object[] var39 = new java.lang.Object[] { (short)100};
    var37.copyInto(var39);
    var23.copyInto(var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.insertElementAt((java.lang.Object)var23, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[]"+ "'", var29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 100.0d+ "'", var35.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    java.lang.String var7 = var6.toString();
    java.util.Vector var10 = new java.util.Vector(10, 1);
    var10.addElement((java.lang.Object)100.0d);
    java.lang.Object var13 = var10.firstElement();
    boolean var14 = var6.addAll((java.util.Collection)var10);
    java.util.Vector var17 = new java.util.Vector(10, 1);
    java.lang.Object[] var19 = new java.lang.Object[] { (short)0};
    var17.copyInto(var19);
    boolean var21 = var6.containsAll((java.util.Collection)var17);
    int var22 = var17.capacity();
    boolean var23 = var2.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 100.0d+ "'", var13.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.lang.Object var12 = var6.elementAt(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 100.0d+ "'", var12.equals(100.0d));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var14 = new java.util.Vector(10, 1);
    var14.addElement((java.lang.Object)100.0d);
    java.lang.Object var17 = var14.firstElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insertElementAt((java.lang.Object)var14, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 100.0d+ "'", var17.equals(100.0d));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.Object[] var4 = new java.lang.Object[] { (short)0};
    var2.copyInto(var4);
    var2.addElement((java.lang.Object)(short)100);
    var2.clear();
    java.util.Enumeration var9 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    java.lang.String var3 = var2.toString();
    java.util.Vector var6 = new java.util.Vector(10, 1);
    var6.addElement((java.lang.Object)100.0d);
    java.lang.Object var9 = var6.firstElement();
    boolean var10 = var2.addAll((java.util.Collection)var6);
    java.util.Vector var13 = new java.util.Vector(10, 1);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)0};
    var13.copyInto(var15);
    boolean var17 = var2.containsAll((java.util.Collection)var13);
    java.util.ListIterator var18 = var13.listIterator();
    var13.ensureCapacity(100);
    java.lang.Object[] var21 = var13.toArray();
    java.util.Enumeration var22 = var13.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(10, 1);
    var2.addElement((java.lang.Object)100.0d);
    java.util.Vector var7 = new java.util.Vector(10, 1);
    java.lang.String var8 = var7.toString();
    java.util.Vector var11 = new java.util.Vector(10, 1);
    var11.addElement((java.lang.Object)100.0d);
    java.lang.Object var14 = var11.firstElement();
    boolean var15 = var7.addAll((java.util.Collection)var11);
    java.util.Vector var16 = new java.util.Vector((java.util.Collection)var7);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)100};
    var16.copyInto(var18);
    var2.copyInto(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(10, (java.lang.Object)(byte)10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 100.0d+ "'", var14.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

}
