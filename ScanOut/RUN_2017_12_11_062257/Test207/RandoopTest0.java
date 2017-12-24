
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.util.Set var1 = var0.keySet();
    java.lang.Object var4 = var0.put((java.lang.Object)10.0d, (java.lang.Object)10.0f);
    java.util.Enumeration var5 = var0.keys();
    java.util.Set var6 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    java.rmi.server.RMIServerSocketFactory var3 = var1.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    int var2 = var1.getListenPort();
    java.rmi.server.RMIServerSocketFactory var3 = var1.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Color var4 = var0.getBackground();
    java.awt.Rectangle var5 = var0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.get((java.lang.Object)10.0d);
    java.lang.Object var4 = var0.get((java.lang.Object)"hi!");
    java.util.Hashtable var5 = new java.util.Hashtable((java.util.Map)var0);
    java.util.Hashtable var6 = new java.util.Hashtable();
    java.lang.Object var8 = var6.get((java.lang.Object)10.0d);
    java.lang.Object var10 = var6.get((java.lang.Object)"hi!");
    java.util.Hashtable var11 = new java.util.Hashtable();
    java.util.Set var12 = var11.keySet();
    var6.putAll((java.util.Map)var11);
    boolean var14 = var0.contains((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.preferredSize();
    var0.firePropertyChange("hi!", (byte)0, (byte)(-1));
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Toolkit var4 = var0.getToolkit();
    var0.setVisible(true);
    java.awt.event.MouseMotionListener[] var7 = var0.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.im.InputContext var1 = var0.getInputContext();
    java.awt.Dimension var2 = var0.getSize();
    boolean var3 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Color var4 = var0.getBackground();
    java.awt.Point var5 = var0.getLocation();
    var0.firePropertyChange("hi!", 10.0f, (-1.0f));
    java.awt.Rectangle var10 = var0.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Toolkit var4 = var0.getToolkit();
    var0.setVisible(true);
    java.awt.Container var7 = new java.awt.Container();
    java.awt.Component var10 = var7.findComponentAt(100, 100);
    java.awt.Color var11 = var7.getBackground();
    java.awt.Point var12 = var7.getLocation();
    java.awt.Point var13 = var0.getLocation(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Toolkit var4 = var0.getToolkit();
    var0.setVisible(true);
    java.awt.Dimension var7 = var0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.preferredSize();
    var0.firePropertyChange("hi!", (byte)0, (byte)(-1));
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "java.awt.Container[,0,0,0var6,invalid]"+ "'", var6.equals("java.awt.Container[,0,0,0var6,invalid]"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.preferredSize();
    int var2 = var0.getY();
    boolean var3 = var0.isFocusCycleRoot();
    var0.transferFocusUpCycle();
    java.awt.Insets var5 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Dimension var1 = var0.preferredSize();
    int var2 = var0.getY();
    boolean var3 = var0.isFocusCycleRoot();
    int var4 = var0.getWidth();
    java.awt.Dimension var5 = var0.getMinimumSize();
    boolean var6 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Toolkit var4 = var0.getToolkit();
    var0.setVisible(true);
    var0.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Container var0 = new java.awt.Container();
    var0.disable();
    boolean var2 = var0.isFocusTraversalPolicyProvider();
    boolean var3 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Container var0 = new java.awt.Container();
    java.awt.Component var3 = var0.findComponentAt(100, 100);
    java.awt.Color var4 = var0.getBackground();
    java.awt.Container var5 = new java.awt.Container();
    java.awt.Component var8 = var5.findComponentAt(100, 100);
    java.awt.Color var9 = var5.getBackground();
    java.awt.Point var10 = var5.getLocation();
    var0.setLocation(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

}
