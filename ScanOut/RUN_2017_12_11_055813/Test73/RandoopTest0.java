
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Frame var0 = new java.awt.Frame();

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.beans.PropertyChangeListener[] var2 = var1.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Frame var1 = new java.awt.Frame("");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.Hashtable var1 = new java.util.Hashtable(10);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    java.security.cert.Certificate[] var4 = var0.engineGetCertificateChain("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var10 = new java.util.Hashtable(1, 1.0f);
    int var11 = var10.size();
    boolean var13 = var10.containsKey((java.lang.Object)(byte)10);
    var4.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var10);
    java.lang.Object var15 = var2.get((java.lang.Object)var10);
    boolean var17 = var2.equals((java.lang.Object)(byte)(-1));
    java.lang.Object var19 = var2.get((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var10 = new java.util.Hashtable(1, 1.0f);
    int var11 = var10.size();
    boolean var13 = var10.containsKey((java.lang.Object)(byte)10);
    var4.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var10);
    java.lang.Object var15 = var2.get((java.lang.Object)var10);
    boolean var16 = var2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    int var3 = var2.size();
    java.util.Hashtable var6 = new java.util.Hashtable(1, 1.0f);
    java.util.Set var7 = var6.keySet();
    java.lang.Object var9 = var2.put((java.lang.Object)var7, (java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    java.security.cert.Certificate var4 = var0.engineGetCertificate("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var7 = new java.util.Hashtable(1, 1.0f);
    int var8 = var7.size();
    boolean var10 = var7.containsKey((java.lang.Object)(byte)10);
    var1.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var12 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var7 = new java.util.Hashtable(1, 1.0f);
    int var8 = var7.size();
    boolean var10 = var7.containsKey((java.lang.Object)(byte)10);
    var1.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var7);
    java.util.Set var12 = var7.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var7 = new java.util.Hashtable(1, 1.0f);
    int var8 = var7.size();
    boolean var10 = var7.containsKey((java.lang.Object)(byte)10);
    var1.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var7);
    java.beans.PropertyChangeSupport var15 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var21 = new java.util.Hashtable(1, 1.0f);
    int var22 = var21.size();
    boolean var24 = var21.containsKey((java.lang.Object)(byte)10);
    var15.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var21);
    var1.firePropertyChange("hi!", (java.lang.Object)'a', (java.lang.Object)var21);
    boolean var28 = var21.containsKey((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    var1.firePropertyChange("", true, false);
    java.beans.PropertyChangeListener[] var7 = var1.getPropertyChangeListeners("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    boolean var4 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var7 = new java.util.Hashtable(1, 1.0f);
    int var8 = var7.size();
    boolean var10 = var7.containsKey((java.lang.Object)(byte)10);
    var1.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var7);
    var1.firePropertyChange("", false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    int var3 = var2.size();
    boolean var5 = var2.containsKey((java.lang.Object)(byte)10);
    java.util.Hashtable var6 = new java.util.Hashtable((java.util.Map)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.util.Set var3 = var2.keySet();
    java.util.Enumeration var4 = var2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    int var3 = var2.size();
    boolean var5 = var2.containsKey((java.lang.Object)(byte)10);
    java.util.Set var6 = var2.entrySet();
    java.lang.String var7 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "{}"+ "'", var7.equals("{}"));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(short)0);
    java.util.Hashtable var7 = new java.util.Hashtable(1, 1.0f);
    int var8 = var7.size();
    boolean var10 = var7.containsKey((java.lang.Object)(byte)10);
    var1.fireIndexedPropertyChange("hi!", 1, (java.lang.Object)(short)100, (java.lang.Object)var7);
    var1.fireIndexedPropertyChange("", 1, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    sun.rmi.transport.Transport var2 = var1.getOutboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);
    java.util.Hashtable var5 = new java.util.Hashtable(1, 1.0f);
    int var6 = var5.size();
    java.lang.Object var7 = var5.clone();
    java.util.Hashtable var10 = new java.util.Hashtable(1, 1.0f);
    int var11 = var10.size();
    java.lang.Object var12 = var10.clone();
    java.lang.Object var13 = var2.put(var7, (java.lang.Object)var10);
    java.util.Hashtable var14 = new java.util.Hashtable((java.util.Map)var10);
    java.util.Collection var15 = var10.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate[] var2 = var0.engineGetCertificateChain("hi!");
    java.util.Enumeration var3 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    boolean var2 = var0.engineContainsAlias("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint((-1));
    java.lang.String var2 = var1.getHost();
    java.rmi.server.RMIServerSocketFactory var3 = var1.getServerSocketFactory();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

}
