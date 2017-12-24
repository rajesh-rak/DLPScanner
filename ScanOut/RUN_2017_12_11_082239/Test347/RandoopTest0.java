
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(1, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(0, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.add(10, (java.lang.Object)true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    java.util.Vector var6 = new java.util.Vector(0, (-1));
    var6.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var2.addAll((-1), (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.ensureCapacity(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var2.remove(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.ensureCapacity(0);
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    var2.setSize(100);
    boolean var8 = var2.equals((java.lang.Object)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var2.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    java.util.Vector var6 = new java.util.Vector(0, (-1));
    var6.clear();
    int var8 = var6.size();
    boolean var10 = var6.equals((java.lang.Object)(byte)100);
    java.util.Vector var13 = new java.util.Vector(0, (-1));
    var13.clear();
    int var15 = var13.size();
    boolean var16 = var6.removeAll((java.util.Collection)var13);
    java.lang.Object var17 = var13.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setElementAt((java.lang.Object)var13, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var13.set(100, (java.lang.Object)100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertElementAt((java.lang.Object)(-1L), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    var2.setSize(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    var2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    var2.setSize(100);
    boolean var8 = var2.equals((java.lang.Object)"hi!");
    var2.trimToSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Rectangle[] var0 = new java.awt.Rectangle[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      sun.awt.X11.XEmbedServerTester var2 = sun.awt.X11.XEmbedServerTester.getTester(var0, 10L);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSize((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    int var15 = var13.indexOf((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    var2.ensureCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    var2.addElement((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    boolean var6 = var2.equals((java.lang.Object)(byte)100);
    java.util.Vector var9 = new java.util.Vector(0, (-1));
    var9.clear();
    int var11 = var9.size();
    boolean var12 = var2.removeAll((java.util.Collection)var9);
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var2);
    java.util.ListIterator var14 = var2.listIterator();
    java.lang.Object var15 = var2.clone();
    java.util.ListIterator var16 = var2.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Vector var3 = new java.util.Vector(0, (-1));
    var3.clear();
    int var5 = var3.size();
    var3.setSize(100);
    boolean var8 = var3.isEmpty();
    int var9 = var0.lastIndexOf((java.lang.Object)var3);
    boolean var11 = var0.remove((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    boolean var4 = var2.add((java.lang.Object)0.0f);
    java.util.Vector var7 = new java.util.Vector(0, (-1));
    var7.clear();
    int var9 = var7.size();
    boolean var11 = var7.equals((java.lang.Object)(byte)100);
    java.util.Vector var14 = new java.util.Vector(0, (-1));
    var14.clear();
    int var16 = var14.size();
    boolean var17 = var7.removeAll((java.util.Collection)var14);
    java.lang.Object var18 = var14.clone();
    java.util.Vector var21 = new java.util.Vector(0, (-1));
    var21.clear();
    int var23 = var21.capacity();
    boolean var24 = var14.containsAll((java.util.Collection)var21);
    java.lang.Object[] var25 = new java.lang.Object[] { var14};
    java.lang.Object[] var26 = var2.toArray(var25);
    java.util.Vector var29 = new java.util.Vector(0, (-1));
    var29.clear();
    int var31 = var29.size();
    boolean var33 = var29.equals((java.lang.Object)(byte)100);
    java.util.Vector var36 = new java.util.Vector(0, (-1));
    var36.clear();
    int var38 = var36.size();
    boolean var39 = var29.removeAll((java.util.Collection)var36);
    java.lang.Object var40 = var36.clone();
    java.util.Vector var43 = new java.util.Vector(0, (-1));
    var43.clear();
    int var45 = var43.capacity();
    boolean var46 = var36.containsAll((java.util.Collection)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var48 = var2.lastIndexOf((java.lang.Object)var46, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.capacity();
    java.util.Vector var7 = new java.util.Vector(0, (-1));
    var7.clear();
    int var9 = var7.size();
    boolean var11 = var7.equals((java.lang.Object)(byte)100);
    java.util.Vector var14 = new java.util.Vector(0, (-1));
    var14.clear();
    int var16 = var14.size();
    boolean var17 = var7.removeAll((java.util.Collection)var14);
    java.lang.Object var18 = var14.clone();
    boolean var19 = var2.retainAll((java.util.Collection)var14);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(0, (-1));
    var2.clear();
    int var4 = var2.size();
    var2.setSize(100);
    java.lang.Object var8 = var2.elementAt(0);
    java.util.Vector var11 = new java.util.Vector(0, (-1));
    var11.clear();
    int var13 = var11.size();
    boolean var15 = var11.equals((java.lang.Object)(byte)100);
    java.util.Vector var18 = new java.util.Vector(0, (-1));
    var18.clear();
    int var20 = var18.size();
    boolean var21 = var11.removeAll((java.util.Collection)var18);
    java.util.Vector var22 = new java.util.Vector((java.util.Collection)var11);
    java.util.ListIterator var23 = var11.listIterator();
    java.lang.Object var24 = var11.clone();
    var2.setElementAt(var24, 10);
    java.lang.Object[] var27 = var2.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

}
