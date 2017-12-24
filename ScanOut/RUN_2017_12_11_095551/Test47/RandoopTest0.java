
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


    java.io.PrintStream var0 = java.rmi.server.RemoteServer.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:-1]"+ "'", var3.equals("[:-1]"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Enumeration var3 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.toString();
    java.rmi.server.RMIClientSocketFactory var3 = var1.getClientSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[:-1]"+ "'", var2.equals("[:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIServerSocketFactory var2 = var1.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Enumeration var2 = var1.elements();
    java.util.Enumeration var3 = var1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(byte)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    java.rmi.server.RMIServerSocketFactory var3 = var1.getServerSocketFactory();
    sun.rmi.transport.Transport var4 = var1.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = java.rmi.server.RemoteServer.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    var1.clear();

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.Object var8 = var1.put((java.lang.Object)10.0d, (java.lang.Object)var6);
    java.util.Collection var9 = var1.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(10);
    sun.rmi.transport.Transport var2 = var1.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 100.0f);
    java.util.Hashtable var4 = new java.util.Hashtable(10);
    boolean var6 = var4.containsValue((java.lang.Object)(-1));
    var2.putAll((java.util.Map)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.toString();
    sun.rmi.transport.Transport var3 = var1.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[:-1]"+ "'", var2.equals("[:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.Object var8 = var1.put((java.lang.Object)10.0d, (java.lang.Object)var6);
    java.lang.String var9 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "{10.0={}}"+ "'", var9.equals("{10.0={}}"));

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Collection var4 = var1.values();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.Object var8 = var1.put((java.lang.Object)10.0d, (java.lang.Object)var6);
    java.lang.Object var10 = var1.remove((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.toString();
    sun.rmi.transport.Transport var3 = var1.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[:-1]"+ "'", var2.equals("[:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.toString();
    int var3 = var1.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[:-1]"+ "'", var2.equals("[:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.rmi.server.RMIClientSocketFactory var2 = var1.getClientSocketFactory();
    int var3 = var1.getListenPort();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[:-1]"+ "'", var4.equals("[:-1]"));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.Object var8 = var1.put((java.lang.Object)10.0d, (java.lang.Object)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(10);
    java.util.Hashtable var12 = new java.util.Hashtable(10);
    java.util.Hashtable var13 = new java.util.Hashtable((java.util.Map)var12);
    var10.putAll((java.util.Map)var13);
    boolean var15 = var1.contains((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.util.Hashtable var6 = new java.util.Hashtable(10);
    java.util.Hashtable var7 = new java.util.Hashtable((java.util.Map)var6);
    java.lang.Object var8 = var1.put((java.lang.Object)10.0d, (java.lang.Object)var6);
    java.util.Set var9 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    boolean var4 = var1.containsKey((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)var3);
    java.util.Hashtable var7 = new java.util.Hashtable(10);
    java.util.Hashtable var8 = new java.util.Hashtable((java.util.Map)var7);
    java.util.Set var9 = var7.keySet();
    java.util.Hashtable var11 = new java.util.Hashtable(10);
    java.util.Enumeration var12 = var11.keys();
    var4.firePropertyChange("", (java.lang.Object)var7, (java.lang.Object)var12);
    java.beans.PropertyChangeListener[] var14 = var4.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
