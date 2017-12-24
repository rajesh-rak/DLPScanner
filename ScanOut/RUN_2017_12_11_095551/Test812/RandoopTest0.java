
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    long var0 = java.awt.EventQueue.getMostRecentEventTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 1512988244106L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.AWTEvent var0 = java.awt.EventQueue.getCurrentEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    boolean var5 = var3.remove((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    int var5 = var1.lastIndexOf((java.lang.Object)100);
    java.util.Vector var7 = new java.util.Vector(0);
    java.util.Iterator var8 = var7.iterator();
    java.util.Vector var9 = new java.util.Vector((java.util.Collection)var7);
    java.util.Vector var11 = new java.util.Vector(0);
    java.util.Iterator var12 = var11.iterator();
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var11);
    java.util.Vector var15 = new java.util.Vector(0);
    java.util.Iterator var16 = var15.iterator();
    java.util.Vector var17 = new java.util.Vector((java.util.Collection)var15);
    java.lang.Object[] var18 = new java.lang.Object[] { var17};
    var13.copyInto(var18);
    boolean var20 = var7.addAll((java.util.Collection)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElementAt((java.lang.Object)var7, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 0);
    java.rmi.server.RMIServerSocketFactory var3 = var2.getServerSocketFactory();
    int var4 = var2.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", 0);
    sun.rmi.transport.Channel var3 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var4 = new java.util.Vector(0);
    java.util.Iterator var5 = var4.iterator();
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var4);
    java.util.Vector var8 = new java.util.Vector(0);
    java.util.Iterator var9 = var8.iterator();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var8);
    java.lang.Object[] var11 = new java.lang.Object[] { var10};
    var6.copyInto(var11);
    boolean var13 = var1.addAll((java.util.Collection)var6);
    java.util.Vector var16 = new java.util.Vector(0);
    java.util.Iterator var17 = var16.iterator();
    java.util.Vector var18 = new java.util.Vector((java.util.Collection)var16);
    boolean var20 = var16.contains((java.lang.Object)0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var21 = var6.addAll(1, (java.util.Collection)var16);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(0);
    java.util.Iterator var6 = var5.iterator();
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(0);
    java.util.Iterator var10 = var9.iterator();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    var7.copyInto(var12);
    boolean var14 = var1.addAll((java.util.Collection)var7);
    java.util.Iterator var15 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    boolean var5 = var1.contains((java.lang.Object)0.0d);
    var1.trimToSize();
    java.util.Vector var8 = new java.util.Vector(0);
    java.util.Iterator var9 = var8.iterator();
    java.util.Vector var11 = new java.util.Vector(0);
    java.util.Iterator var12 = var11.iterator();
    java.util.Vector var13 = new java.util.Vector((java.util.Collection)var11);
    java.util.Vector var15 = new java.util.Vector(0);
    java.util.Iterator var16 = var15.iterator();
    java.util.Vector var17 = new java.util.Vector((java.util.Collection)var15);
    java.lang.Object[] var18 = new java.lang.Object[] { var17};
    var13.copyInto(var18);
    boolean var20 = var8.addAll((java.util.Collection)var13);
    boolean var21 = var1.containsAll((java.util.Collection)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var4 = new java.util.Vector(0);
    java.util.Iterator var5 = var4.iterator();
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var4);
    java.util.Vector var8 = new java.util.Vector(0);
    java.util.Iterator var9 = var8.iterator();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var8);
    java.lang.Object[] var11 = new java.lang.Object[] { var10};
    var6.copyInto(var11);
    boolean var13 = var1.addAll((java.util.Collection)var6);
    var1.removeAllElements();
    java.util.Vector var16 = new java.util.Vector(0);
    var16.setSize(100);
    boolean var19 = var1.removeAll((java.util.Collection)var16);
    var1.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Locale var0 = javax.swing.JComponent.getDefaultLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Vector var1 = new java.util.Vector(0);
    var1.setSize(100);
    var1.setSize(0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(0);
    java.util.Iterator var6 = var5.iterator();
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(0);
    java.util.Iterator var10 = var9.iterator();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    var7.copyInto(var12);
    boolean var14 = var1.addAll((java.util.Collection)var7);
    java.util.Vector var16 = new java.util.Vector(0);
    java.util.Iterator var17 = var16.iterator();
    java.util.Vector var19 = new java.util.Vector(0);
    java.util.Iterator var20 = var19.iterator();
    java.util.Vector var21 = new java.util.Vector((java.util.Collection)var19);
    java.util.Vector var23 = new java.util.Vector(0);
    java.util.Iterator var24 = var23.iterator();
    java.util.Vector var25 = new java.util.Vector((java.util.Collection)var23);
    java.lang.Object[] var26 = new java.lang.Object[] { var25};
    var21.copyInto(var26);
    boolean var28 = var16.addAll((java.util.Collection)var21);
    var16.removeAllElements();
    boolean var30 = var1.removeAll((java.util.Collection)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    java.util.Vector var5 = new java.util.Vector(0);
    java.util.Iterator var6 = var5.iterator();
    java.util.Vector var7 = new java.util.Vector((java.util.Collection)var5);
    java.util.Vector var9 = new java.util.Vector(0);
    java.util.Iterator var10 = var9.iterator();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    java.lang.Object[] var12 = new java.lang.Object[] { var11};
    var7.copyInto(var12);
    boolean var14 = var1.addAll((java.util.Collection)var7);
    java.awt.EventQueue var15 = new java.awt.EventQueue();
    java.awt.EventQueue var16 = new java.awt.EventQueue();
    var15.push(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = var1.lastIndexOf((java.lang.Object)var15, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Set var0 = sun.awt.AppContext.getAppContexts();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

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


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.util.Vector var3 = new java.util.Vector(0);
    java.util.Iterator var4 = var3.iterator();
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Iterator var7 = var6.iterator();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var6);
    java.util.Vector var10 = new java.util.Vector(0);
    java.util.Iterator var11 = var10.iterator();
    java.util.Vector var12 = new java.util.Vector((java.util.Collection)var10);
    java.lang.Object[] var13 = new java.lang.Object[] { var12};
    var8.copyInto(var13);
    boolean var15 = var3.addAll((java.util.Collection)var8);
    var3.removeAllElements();
    java.lang.Object var17 = var0.get((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var3.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var4 = new java.util.Vector(0);
    java.util.Iterator var5 = var4.iterator();
    java.util.Vector var6 = new java.util.Vector((java.util.Collection)var4);
    java.util.Vector var8 = new java.util.Vector(0);
    java.util.Iterator var9 = var8.iterator();
    java.util.Vector var10 = new java.util.Vector((java.util.Collection)var8);
    java.lang.Object[] var11 = new java.lang.Object[] { var10};
    var6.copyInto(var11);
    boolean var13 = var1.addAll((java.util.Collection)var6);
    java.util.Vector var16 = new java.util.Vector(0);
    java.util.Iterator var17 = var16.iterator();
    java.util.Vector var18 = new java.util.Vector((java.util.Collection)var16);
    boolean var20 = var16.contains((java.lang.Object)0.0d);
    var16.trimToSize();
    var6.add(0, (java.lang.Object)var16);
    java.lang.Object var23 = var6.firstElement();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    java.lang.Object var3 = var0.remove((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.awt.AppContext var0 = sun.awt.AppContext.getAppContext();
    boolean var1 = var0.isDisposed();
    boolean var2 = sun.awt.AppContext.isMainContext(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Iterator var2 = var1.iterator();
    java.util.Vector var3 = new java.util.Vector((java.util.Collection)var1);
    boolean var5 = var1.contains((java.lang.Object)0.0d);
    var1.trimToSize();
    java.util.ListIterator var7 = var1.listIterator();
    java.util.Vector var9 = new java.util.Vector(0);
    java.util.Iterator var10 = var9.iterator();
    java.util.Vector var11 = new java.util.Vector((java.util.Collection)var9);
    int var13 = var9.lastIndexOf((java.lang.Object)100);
    java.lang.String var14 = var9.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = var1.lastIndexOf((java.lang.Object)var9, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Vector var1 = new java.util.Vector(0);
    java.util.Vector var3 = new java.util.Vector(0);
    java.util.Iterator var4 = var3.iterator();
    java.util.Vector var6 = new java.util.Vector(0);
    java.util.Iterator var7 = var6.iterator();
    java.util.Vector var8 = new java.util.Vector((java.util.Collection)var6);
    java.util.Vector var10 = new java.util.Vector(0);
    java.util.Iterator var11 = var10.iterator();
    java.util.Vector var12 = new java.util.Vector((java.util.Collection)var10);
    java.lang.Object[] var13 = new java.lang.Object[] { var12};
    var8.copyInto(var13);
    boolean var15 = var3.addAll((java.util.Collection)var8);
    boolean var16 = var8.isEmpty();
    boolean var17 = var1.removeAll((java.util.Collection)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var1.elementAt(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

}
