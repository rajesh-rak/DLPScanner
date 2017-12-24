
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var2 = javax.crypto.Cipher.getInstance("hi!", "hi!");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = javax.crypto.Cipher.getMaxAllowedKeyLength("");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    int var1 = var0.engineSize();
    java.security.cert.Certificate var3 = var0.engineGetCertificate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable((-1), 1.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(-1L));
    java.beans.PropertyChangeListener[] var3 = var1.getPropertyChangeListeners("");
    boolean var5 = var1.hasListeners("");
    var1.fireIndexedPropertyChange("hi!", 100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.crypto.Cipher var1 = javax.crypto.Cipher.getInstance("hi!");
      fail("Expected exception of type java.security.NoSuchAlgorithmException");
    } catch (java.security.NoSuchAlgorithmException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var2 = var0.engineGetCertificate("");
    int var3 = var0.engineSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    int var1 = var0.engineSize();
    boolean var3 = var0.engineIsCertificateEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.beans.PropertyChangeSupport var1 = new java.beans.PropertyChangeSupport((java.lang.Object)(-1L));
    var1.fireIndexedPropertyChange("hi!", 0, (java.lang.Object)(-1.0f), (java.lang.Object)' ');
    var1.fireIndexedPropertyChange("hi!", 100, (java.lang.Object)0.0f, (java.lang.Object)100.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)100.0f);
    boolean var4 = var0.containsKey((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    sun.reflect.annotation.AnnotationParser var0 = new sun.reflect.annotation.AnnotationParser();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    int var4 = var2.getPort();
    boolean var6 = var2.equals((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)100.0f);
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)(-1L));
    java.beans.PropertyChangeListener[] var6 = var4.getPropertyChangeListeners("");
    boolean var8 = var4.hasListeners("");
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var11 = var9.engineGetCertificate("");
    java.lang.Object var12 = var0.put((java.lang.Object)var8, (java.lang.Object)var9);
    boolean var13 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    sun.rmi.transport.tcp.TCPEndpoint var1 = sun.rmi.transport.tcp.TCPEndpoint.getLocalEndpoint(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)100.0f);
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)(-1L));
    java.beans.PropertyChangeListener[] var6 = var4.getPropertyChangeListeners("");
    boolean var8 = var4.hasListeners("");
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var11 = var9.engineGetCertificate("");
    java.lang.Object var12 = var0.put((java.lang.Object)var8, (java.lang.Object)var9);
    com.sun.crypto.provider.JceKeyStore var13 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var15 = var13.engineGetCertificate("");
    java.util.Enumeration var16 = var13.engineAliases();
    java.lang.Object var17 = var0.get((java.lang.Object)var13);
    boolean var18 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    sun.rmi.transport.Channel var4 = var2.getChannel();
    sun.rmi.transport.Transport var5 = var2.getInboundTransport();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)100.0f);
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var5 = var3.engineGetCertificate("");
    java.util.Enumeration var6 = var3.engineAliases();
    java.lang.Object var7 = var0.get((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    java.lang.Object var2 = var0.remove((java.lang.Object)100.0f);
    java.beans.PropertyChangeSupport var4 = new java.beans.PropertyChangeSupport((java.lang.Object)(-1L));
    java.beans.PropertyChangeListener[] var6 = var4.getPropertyChangeListeners("");
    boolean var8 = var4.hasListeners("");
    com.sun.crypto.provider.JceKeyStore var9 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var11 = var9.engineGetCertificate("");
    java.lang.Object var12 = var0.put((java.lang.Object)var8, (java.lang.Object)var9);
    boolean var14 = var0.contains((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("hi!", (-1));
    java.lang.String var3 = var2.toString();
    sun.rmi.transport.Channel var4 = var2.getChannel();
    int var5 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[hi!:-1]"+ "'", var3.equals("[hi!:-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.Hashtable var0 = new java.util.Hashtable();
    com.sun.crypto.provider.JceKeyStore var1 = new com.sun.crypto.provider.JceKeyStore();
    java.security.cert.Certificate var3 = var1.engineGetCertificate("");
    java.util.Enumeration var4 = var1.engineAliases();
    boolean var6 = var1.engineContainsAlias("[hi!:-1]");
    boolean var7 = var0.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    int var1 = var0.engineSize();
    com.sun.crypto.provider.JceKeyStore var3 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var4 = var3.engineAliases();
    com.sun.crypto.provider.JceKeyStore var6 = new com.sun.crypto.provider.JceKeyStore();
    int var7 = var6.engineSize();
    byte[] var12 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var13 = new java.security.cert.Certificate[] { };
    var6.engineSetKeyEntry("", var12, var13);
    com.sun.crypto.provider.JceKeyStore var15 = new com.sun.crypto.provider.JceKeyStore();
    int var16 = var15.engineSize();
    byte[] var21 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var22 = new java.security.cert.Certificate[] { };
    var15.engineSetKeyEntry("", var21, var22);
    var3.engineSetKeyEntry("", var12, var22);
    com.sun.crypto.provider.JceKeyStore var25 = new com.sun.crypto.provider.JceKeyStore();
    boolean var27 = var25.engineIsKeyEntry("");
    com.sun.crypto.provider.JceKeyStore var29 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var30 = var29.engineAliases();
    com.sun.crypto.provider.JceKeyStore var32 = new com.sun.crypto.provider.JceKeyStore();
    int var33 = var32.engineSize();
    byte[] var38 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var39 = new java.security.cert.Certificate[] { };
    var32.engineSetKeyEntry("", var38, var39);
    com.sun.crypto.provider.JceKeyStore var41 = new com.sun.crypto.provider.JceKeyStore();
    int var42 = var41.engineSize();
    byte[] var47 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var48 = new java.security.cert.Certificate[] { };
    var41.engineSetKeyEntry("", var47, var48);
    var29.engineSetKeyEntry("", var38, var48);
    com.sun.crypto.provider.JceKeyStore var51 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Enumeration var52 = var51.engineAliases();
    com.sun.crypto.provider.JceKeyStore var54 = new com.sun.crypto.provider.JceKeyStore();
    int var55 = var54.engineSize();
    byte[] var60 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var61 = new java.security.cert.Certificate[] { };
    var54.engineSetKeyEntry("", var60, var61);
    com.sun.crypto.provider.JceKeyStore var63 = new com.sun.crypto.provider.JceKeyStore();
    int var64 = var63.engineSize();
    byte[] var69 = new byte[] { (byte)1, (byte)10, (byte)100};
    java.security.cert.Certificate[] var70 = new java.security.cert.Certificate[] { };
    var63.engineSetKeyEntry("", var69, var70);
    var51.engineSetKeyEntry("", var60, var70);
    var25.engineSetKeyEntry("", var38, var70);
    var0.engineSetKeyEntry("[hi!:-1]", var12, var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

}
