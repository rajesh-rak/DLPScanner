
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector();
    java.lang.Object[] var8 = new java.lang.Object[] { false};
    var6.copyInto(var8);
    java.util.Vector var10 = new java.util.Vector();
    boolean var11 = var6.retainAll((java.util.Collection)var10);
    int var12 = var10.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var14 = var4.lastIndexOf((java.lang.Object)var10, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    int var6 = var4.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var8 = var4.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var1 = new java.util.Vector();
    java.lang.Object[] var3 = new java.lang.Object[] { false};
    var1.copyInto(var3);
    java.util.Vector var5 = new java.util.Vector();
    boolean var6 = var1.retainAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.lastIndexOf((java.lang.Object)var5, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Vector var2 = new java.util.Vector((-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector();
    java.lang.Object[] var8 = new java.lang.Object[] { false};
    var6.copyInto(var8);
    var0.copyInto(var8);
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(0, "[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector();
    java.lang.Object[] var8 = new java.lang.Object[] { false};
    var6.copyInto(var8);
    int var10 = var4.indexOf((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var6.subList(1, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.lang.String var7 = var0.toString();
    var0.clear();
    boolean var10 = var0.equals((java.lang.Object)10.0f);
    java.util.Vector var11 = new java.util.Vector();
    java.lang.Object[] var13 = new java.lang.Object[] { false};
    var11.copyInto(var13);
    java.util.Vector var15 = new java.util.Vector();
    boolean var16 = var11.retainAll((java.util.Collection)var15);
    java.util.Vector var17 = new java.util.Vector((java.util.Collection)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertElementAt((java.lang.Object)var17, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var8 = new java.util.Vector();
    java.lang.Object[] var10 = new java.lang.Object[] { false};
    var8.copyInto(var10);
    java.lang.Object[] var12 = var0.toArray(var10);
    java.util.Vector var13 = new java.util.Vector();
    java.lang.Object[] var15 = new java.lang.Object[] { false};
    var13.copyInto(var15);
    java.util.Vector var17 = new java.util.Vector();
    boolean var18 = var13.retainAll((java.util.Collection)var17);
    java.util.Vector var19 = new java.util.Vector((java.util.Collection)var13);
    java.util.Vector var20 = new java.util.Vector((java.util.Collection)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((java.lang.Object)var20, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.lang.String var7 = var0.toString();
    var0.clear();
    boolean var10 = var0.removeElement((java.lang.Object)(-1L));
    java.util.Iterator var11 = var0.iterator();
    java.util.Vector var12 = new java.util.Vector();
    java.lang.Object[] var14 = new java.lang.Object[] { false};
    var12.copyInto(var14);
    java.util.Vector var16 = new java.util.Vector();
    boolean var17 = var12.retainAll((java.util.Collection)var16);
    int var18 = var16.size();
    boolean var19 = var0.addAll((java.util.Collection)var16);
    boolean var21 = var16.contains((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Rectangle[] var0 = new java.awt.Rectangle[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.awt.X11.XEmbedServerTester var2 = sun.awt.X11.XEmbedServerTester.getTester(var0, (-1L));
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    int var6 = var4.size();
    java.util.Vector var7 = new java.util.Vector();
    java.lang.Object[] var9 = new java.lang.Object[] { false};
    var7.copyInto(var9);
    java.lang.Object[] var11 = var4.toArray(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeElementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(100, "[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.lang.String var7 = var0.toString();
    var0.clear();
    boolean var10 = var0.removeElement((java.lang.Object)(-1L));
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var8 = new java.util.Vector();
    java.lang.Object[] var10 = new java.lang.Object[] { false};
    var8.copyInto(var10);
    java.util.Vector var12 = new java.util.Vector();
    boolean var13 = var8.retainAll((java.util.Collection)var12);
    java.util.Vector var14 = new java.util.Vector((java.util.Collection)var8);
    java.util.Vector var15 = new java.util.Vector((java.util.Collection)var8);
    java.util.Vector var16 = new java.util.Vector();
    java.lang.Object[] var18 = new java.lang.Object[] { false};
    var16.copyInto(var18);
    java.util.Vector var20 = new java.util.Vector();
    boolean var21 = var16.retainAll((java.util.Collection)var20);
    java.util.Vector var22 = new java.util.Vector((java.util.Collection)var16);
    java.lang.String var23 = var16.toString();
    var16.clear();
    boolean var25 = var8.containsAll((java.util.Collection)var16);
    boolean var26 = var7.containsAll((java.util.Collection)var8);
    java.util.Vector var27 = new java.util.Vector();
    java.lang.Object[] var29 = new java.lang.Object[] { false};
    var27.copyInto(var29);
    java.util.Vector var31 = new java.util.Vector();
    boolean var32 = var27.retainAll((java.util.Collection)var31);
    java.util.Vector var33 = new java.util.Vector((java.util.Collection)var27);
    java.util.Vector var34 = new java.util.Vector((java.util.Collection)var27);
    java.util.Vector var35 = new java.util.Vector();
    java.lang.Object[] var37 = new java.lang.Object[] { false};
    var35.copyInto(var37);
    java.util.Vector var39 = new java.util.Vector();
    boolean var40 = var35.retainAll((java.util.Collection)var39);
    java.util.Vector var41 = new java.util.Vector((java.util.Collection)var35);
    java.util.Vector var42 = new java.util.Vector((java.util.Collection)var35);
    java.util.Vector var43 = new java.util.Vector();
    java.lang.Object[] var45 = new java.lang.Object[] { false};
    var43.copyInto(var45);
    java.util.Vector var47 = new java.util.Vector();
    boolean var48 = var43.retainAll((java.util.Collection)var47);
    java.util.Vector var49 = new java.util.Vector((java.util.Collection)var43);
    java.lang.String var50 = var43.toString();
    var43.clear();
    boolean var52 = var35.containsAll((java.util.Collection)var43);
    boolean var53 = var34.containsAll((java.util.Collection)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var55 = var8.lastIndexOf((java.lang.Object)var53, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[]"+ "'", var23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "[]"+ "'", var50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector();
    java.lang.Object[] var8 = new java.lang.Object[] { false};
    var6.copyInto(var8);
    int var10 = var4.indexOf((java.lang.Object)var8);
    java.lang.Object[] var11 = var4.toArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.lang.String var7 = var0.toString();
    var0.clear();
    boolean var10 = var0.equals((java.lang.Object)10.0f);
    int var11 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var7 = new java.util.Vector();
    java.lang.Object[] var9 = new java.lang.Object[] { false};
    var7.copyInto(var9);
    java.util.Vector var11 = new java.util.Vector();
    boolean var12 = var7.retainAll((java.util.Collection)var11);
    java.util.Vector var13 = new java.util.Vector();
    java.lang.Object[] var15 = new java.lang.Object[] { false};
    var13.copyInto(var15);
    var7.copyInto(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var6.lastIndexOf((java.lang.Object)var15, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(1, 10);
    java.lang.Object var3 = var2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Iterator var4 = var0.iterator();
    java.util.Vector var5 = new java.util.Vector();
    java.lang.Object[] var7 = new java.lang.Object[] { false};
    var5.copyInto(var7);
    java.util.Vector var9 = new java.util.Vector();
    boolean var10 = var5.retainAll((java.util.Collection)var9);
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var5);
    java.lang.String var12 = var5.toString();
    var5.clear();
    boolean var15 = var5.equals((java.lang.Object)10.0f);
    boolean var16 = var0.equals((java.lang.Object)var15);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var0);
    java.util.Vector var8 = new java.util.Vector();
    java.lang.Object[] var10 = new java.lang.Object[] { false};
    var8.copyInto(var10);
    java.lang.Object[] var12 = var0.toArray(var10);
    int var13 = var0.size();
    var0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    var0.copyInto(var2);
    java.util.Vector var4 = new java.util.Vector();
    boolean var5 = var0.retainAll((java.util.Collection)var4);
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var0);
    java.lang.String var7 = var0.toString();
    var0.clear();
    boolean var10 = var0.removeElement((java.lang.Object)(-1L));
    java.util.Iterator var11 = var0.iterator();
    java.util.Vector var12 = new java.util.Vector();
    java.lang.Object[] var14 = new java.lang.Object[] { false};
    var12.copyInto(var14);
    java.util.Vector var16 = new java.util.Vector();
    boolean var17 = var12.retainAll((java.util.Collection)var16);
    int var18 = var16.size();
    boolean var19 = var0.addAll((java.util.Collection)var16);
    java.util.Vector var20 = new java.util.Vector();
    java.util.Iterator var21 = var20.iterator();
    boolean var22 = var0.containsAll((java.util.Collection)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

}
