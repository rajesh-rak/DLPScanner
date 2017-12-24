
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var0 = javax.swing.SwingUtilities.isEventDispatchThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512985345331L);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(100, (java.lang.Object)10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    java.util.Vector var6 = new java.util.Vector();
    java.util.Set var7 = sun.awt.AppContext.getAppContexts();
    boolean var8 = var6.addAll((java.util.Collection)var7);
    java.util.Iterator var9 = var6.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.addAll((-1), (java.util.Collection)var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners();
    java.lang.Object var5 = var0.remove((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var2.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.Object var2 = var0.remove((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    sun.awt.AppContext var3 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var4 = var3.getPropertyChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object[] var5 = var0.toArray((java.lang.Object[])var4);
      fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Set var6 = sun.awt.AppContext.getAppContexts();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    boolean var9 = var5.equals((java.lang.Object)100);
    var5.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var13 = var5.toArray();
    var5.removeAllElements();
    boolean var15 = var0.retainAll((java.util.Collection)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ListIterator var5 = var3.listIterator((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    var0.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var8 = var0.toArray();
    var0.removeAllElements();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Set var6 = sun.awt.AppContext.getAppContexts();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    boolean var9 = var5.equals((java.lang.Object)100);
    var5.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var13 = var5.toArray();
    var5.removeAllElements();
    boolean var15 = var0.retainAll((java.util.Collection)var5);
    java.lang.Object[] var16 = var0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var0 = new java.util.Vector();
    boolean var2 = var0.equals((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    var0.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var8 = var0.toArray();
    var0.removeAllElements();
    java.util.Vector var10 = new java.util.Vector();
    java.util.Set var11 = sun.awt.AppContext.getAppContexts();
    boolean var12 = var10.addAll((java.util.Collection)var11);
    boolean var14 = var10.equals((java.lang.Object)100);
    boolean var16 = var10.removeElement((java.lang.Object)(short)(-1));
    boolean var18 = var10.contains((java.lang.Object)0);
    int var20 = var0.indexOf((java.lang.Object)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    sun.awt.AppContext var2 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var3 = var2.getPropertyChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertElementAt((java.lang.Object)var2, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    var0.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var8 = var0.toArray();
    var0.removeAllElements();
    var0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    var0.insertElementAt((java.lang.Object)'a', 1);
    sun.awt.AppContext var8 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var9 = var8.getPropertyChangeListeners();
    boolean var10 = var0.removeElement((java.lang.Object)var8);
    java.util.Vector var11 = new java.util.Vector();
    java.util.Set var12 = sun.awt.AppContext.getAppContexts();
    boolean var13 = var11.addAll((java.util.Collection)var12);
    boolean var15 = var11.equals((java.lang.Object)100);
    boolean var17 = var11.removeElement((java.lang.Object)(short)(-1));
    boolean var19 = var11.contains((java.lang.Object)0);
    int var21 = var0.lastIndexOf((java.lang.Object)var11, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var0.set(10, (java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.String var1 = var0.toString();
    boolean var2 = sun.awt.AppContext.isMainContext(var0);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var1.equals("sun.awt.AppContext[threadGroup=system]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "sun.awt.AppContext[threadGroup=system]"+ "'", var3.equals("sun.awt.AppContext[threadGroup=system]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    var0.insertElementAt((java.lang.Object)'a', 1);
    sun.awt.AppContext var8 = sun.awt.AppContext.getAppContext();
    java.beans.PropertyChangeListener[] var9 = var8.getPropertyChangeListeners();
    boolean var10 = var0.removeElement((java.lang.Object)var8);
    java.util.Vector var11 = new java.util.Vector();
    java.util.Set var12 = sun.awt.AppContext.getAppContexts();
    boolean var13 = var11.addAll((java.util.Collection)var12);
    boolean var15 = var11.equals((java.lang.Object)100);
    boolean var17 = var11.removeElement((java.lang.Object)(short)(-1));
    boolean var19 = var11.contains((java.lang.Object)0);
    int var21 = var0.lastIndexOf((java.lang.Object)var11, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var0.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Enumeration var1 = var0.elements();
    java.util.ListIterator var2 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var3 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    java.lang.ThreadGroup var1 = var0.getThreadGroup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.dispose();
      fail("Expected exception of type java.lang.IllegalThreadStateException");
    } catch (java.lang.IllegalThreadStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    boolean var4 = var0.equals((java.lang.Object)100);
    java.util.Vector var5 = new java.util.Vector();
    java.util.Set var6 = sun.awt.AppContext.getAppContexts();
    boolean var7 = var5.addAll((java.util.Collection)var6);
    boolean var9 = var5.equals((java.lang.Object)100);
    var5.insertElementAt((java.lang.Object)'a', 1);
    java.lang.Object[] var13 = var5.toArray();
    var5.removeAllElements();
    boolean var15 = var0.retainAll((java.util.Collection)var5);
    java.util.ListIterator var16 = var0.listIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Vector var0 = new java.util.Vector();
    java.util.Set var1 = sun.awt.AppContext.getAppContexts();
    boolean var2 = var0.addAll((java.util.Collection)var1);
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.lang.Object var4 = var3.firstElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

}
