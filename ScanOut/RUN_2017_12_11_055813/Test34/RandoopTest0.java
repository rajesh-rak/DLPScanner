
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.elementAt(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.set(100, (java.lang.Object)10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.lang.Object[] var7 = var2.toArray();
    java.util.Vector var10 = new java.util.Vector(1, 100);
    java.util.Vector var13 = new java.util.Vector(1, 100);
    boolean var14 = var10.containsAll((java.util.Collection)var13);
    java.lang.Object[] var15 = var10.toArray();
    java.lang.Object[] var16 = var2.toArray(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var1 = new java.util.Vector(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.remove(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.lastElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.lang.String var3 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.elementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var3 = var0.put((java.lang.Object)1.0d, (java.lang.Object)(-1.0d));
    java.lang.Object var5 = var0.get((java.lang.Object)"sun.awt.AppContext[threadGroup=system]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.util.Iterator var7 = var5.iterator();
    int var9 = var5.lastIndexOf((java.lang.Object)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insertElementAt((java.lang.Object)10, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    javax.naming.NamingException var2 = com.sun.jndi.ldap.LdapCtx.mapErrorCode(10, "sun.awt.AppContext[threadGroup=system]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    boolean var3 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var2.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.util.Iterator var7 = var5.iterator();
    int var9 = var5.lastIndexOf((java.lang.Object)100.0f);
    java.util.Vector var12 = new java.util.Vector(1, 100);
    java.util.Vector var15 = new java.util.Vector(1, 100);
    boolean var16 = var12.containsAll((java.util.Collection)var15);
    java.lang.Object[] var17 = var12.toArray();
    java.util.Iterator var18 = var12.iterator();
    int var20 = var5.indexOf((java.lang.Object)var12, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Enumeration var3 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var1 = var0.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    var5.insertElementAt((java.lang.Object)0.0f, 0);
    java.util.Vector var13 = new java.util.Vector(1, 100);
    java.util.Vector var16 = new java.util.Vector(1, 100);
    boolean var17 = var13.containsAll((java.util.Collection)var16);
    java.lang.Object[] var18 = var13.toArray();
    java.util.Iterator var19 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.add((-1), (java.lang.Object)var19);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.lang.Object[] var7 = var2.toArray();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var2);
    java.util.Vector var11 = new java.util.Vector(1, 100);
    java.util.Vector var14 = new java.util.Vector(1, 100);
    boolean var15 = var11.containsAll((java.util.Collection)var14);
    java.lang.Object[] var16 = var11.toArray();
    java.util.Iterator var17 = var11.iterator();
    boolean var18 = var2.remove((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = sun.awt.AppContext.isMainContext(var0);
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    boolean var2 = var0.isDisposed();
    boolean var3 = var0.isDisposed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var1 = new java.util.Vector(10);
    java.util.Vector var2 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object[] var3 = var2.toArray();
    int var4 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.util.Iterator var7 = var5.iterator();
    java.lang.Object[] var8 = var5.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var3 = var0.put((java.lang.Object)1.0d, (java.lang.Object)(-1.0d));
    java.util.Vector var6 = new java.util.Vector(1, 100);
    java.lang.String var7 = var6.toString();
    java.lang.Object var8 = var0.remove((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0d)+ "'", var3.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    var2.setSize(1);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.lang.String var3 = var2.toString();
    var2.removeAllElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[]"+ "'", var3.equals("[]"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Vector var2 = new java.util.Vector(10, (-1));
    int var3 = var2.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.get(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Vector var2 = new java.util.Vector(1, 100);
    java.util.Vector var5 = new java.util.Vector(1, 100);
    boolean var6 = var2.containsAll((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(1, 100);
    java.lang.String var10 = var9.toString();
    java.util.Iterator var11 = var9.iterator();
    boolean var12 = var5.equals((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    javax.swing.text.LayoutQueue var0 = javax.swing.text.LayoutQueue.getDefaultQueue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

}
