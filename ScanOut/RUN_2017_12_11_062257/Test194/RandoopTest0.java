
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    boolean var9 = var6.containsKey((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var11 = var10.entrySet();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    var10.putAll((java.util.Map)var14);
    java.lang.Object var17 = var2.put((java.lang.Object)var10, (java.lang.Object)1L);
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var11 = var10.entrySet();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    var10.putAll((java.util.Map)var14);
    java.lang.Object var17 = var2.put((java.lang.Object)var10, (java.lang.Object)1L);
    boolean var19 = var10.containsValue((java.lang.Object)(byte)10);
    java.lang.Object var21 = var10.get((java.lang.Object)(-1.0d));
    java.util.Set var22 = var10.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var2 = new java.util.Hashtable(1, 1.0f);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[:100]"+ "'", var3.equals("[:100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.transport.tcp.TCPEndpoint.shedConnectionCaches();

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    int var4 = var2.getListenPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)(-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Set var8 = var6.entrySet();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.awt.Window[] var10 = java.awt.Window.getOwnerlessWindows();
    boolean var11 = var9.containsKey((java.lang.Object)var10);
    java.util.Collection var12 = var9.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var11 = var10.entrySet();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    var10.putAll((java.util.Map)var14);
    java.lang.Object var17 = var2.put((java.lang.Object)var10, (java.lang.Object)1L);
    sun.rmi.transport.tcp.TCPEndpoint var20 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    java.lang.String var21 = var20.toString();
    boolean var22 = var10.containsValue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[:100]"+ "'", var21.equals("[:100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var11 = var10.entrySet();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    var10.putAll((java.util.Map)var14);
    java.lang.Object var17 = var2.put((java.lang.Object)var10, (java.lang.Object)1L);
    java.util.Hashtable var20 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var21 = var20.entrySet();
    java.util.Hashtable var24 = new java.util.Hashtable(0, 10.0f);
    var20.putAll((java.util.Map)var24);
    java.util.Set var26 = var24.entrySet();
    java.util.Hashtable var27 = new java.util.Hashtable((java.util.Map)var24);
    var2.putAll((java.util.Map)var24);
    java.util.Collection var29 = var2.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Hashtable var10 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var11 = var10.entrySet();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    var10.putAll((java.util.Map)var14);
    java.lang.Object var17 = var2.put((java.lang.Object)var10, (java.lang.Object)1L);
    boolean var19 = var10.equals((java.lang.Object)100.0f);
    java.util.Hashtable var20 = new java.util.Hashtable((java.util.Map)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Set var8 = var6.entrySet();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Hashtable var12 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var13 = var12.entrySet();
    java.util.Hashtable var16 = new java.util.Hashtable(0, 10.0f);
    var12.putAll((java.util.Map)var16);
    java.util.Hashtable var20 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var21 = var20.entrySet();
    java.util.Hashtable var24 = new java.util.Hashtable(0, 10.0f);
    var20.putAll((java.util.Map)var24);
    java.lang.Object var27 = var12.put((java.lang.Object)var20, (java.lang.Object)1L);
    boolean var29 = var20.containsValue((java.lang.Object)(byte)10);
    java.lang.Object var31 = var20.get((java.lang.Object)(-1.0d));
    boolean var32 = var6.equals((java.lang.Object)var20);
    java.lang.Object var33 = var20.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.Hashtable var1 = new java.util.Hashtable(100);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    java.util.Date var2 = var0.engineGetCreationDate("[:100]");
    var0.engineDeleteEntry("[:100]");
    java.util.Enumeration var5 = var0.engineAliases();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Enumeration var8 = var2.keys();
    boolean var9 = var2.isEmpty();
    java.lang.String var10 = var2.toString();
    java.util.Hashtable var13 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var14 = var13.entrySet();
    java.util.Hashtable var17 = new java.util.Hashtable(0, 10.0f);
    var13.putAll((java.util.Map)var17);
    java.util.Hashtable var21 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var22 = var21.entrySet();
    java.util.Hashtable var25 = new java.util.Hashtable(0, 10.0f);
    var21.putAll((java.util.Map)var25);
    java.lang.Object var28 = var13.put((java.lang.Object)var21, (java.lang.Object)1L);
    java.util.Hashtable var31 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var32 = var31.entrySet();
    java.util.Hashtable var35 = new java.util.Hashtable(0, 10.0f);
    var31.putAll((java.util.Map)var35);
    java.util.Set var37 = var35.entrySet();
    java.util.Hashtable var38 = new java.util.Hashtable((java.util.Map)var35);
    var13.putAll((java.util.Map)var35);
    boolean var40 = var2.containsValue((java.lang.Object)var13);
    java.lang.Object var42 = var13.remove((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "{}"+ "'", var10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    sun.rmi.transport.tcp.TCPEndpoint var2 = new sun.rmi.transport.tcp.TCPEndpoint("", 100);
    sun.rmi.transport.Transport var3 = var2.getInboundTransport();
    java.rmi.server.RMIServerSocketFactory var4 = var2.getServerSocketFactory();
    sun.rmi.transport.Channel var5 = var2.getChannel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var0 = sun.rmi.transport.tcp.TCPTransport.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Set var8 = var6.entrySet();
    java.util.Hashtable var9 = new java.util.Hashtable((java.util.Map)var6);
    java.util.Hashtable var12 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var13 = var12.entrySet();
    java.util.Hashtable var16 = new java.util.Hashtable(0, 10.0f);
    var12.putAll((java.util.Map)var16);
    java.util.Hashtable var20 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var21 = var20.entrySet();
    java.util.Hashtable var24 = new java.util.Hashtable(0, 10.0f);
    var20.putAll((java.util.Map)var24);
    java.lang.Object var27 = var12.put((java.lang.Object)var20, (java.lang.Object)1L);
    java.lang.Object var28 = var9.get((java.lang.Object)var12);
    var9.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Hashtable var2 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var3 = var2.entrySet();
    java.util.Hashtable var6 = new java.util.Hashtable(0, 10.0f);
    var2.putAll((java.util.Map)var6);
    java.util.Enumeration var8 = var2.keys();
    java.lang.Object var10 = var2.get((java.lang.Object)100.0f);
    java.util.Enumeration var11 = var2.elements();
    java.util.Hashtable var14 = new java.util.Hashtable(0, 10.0f);
    java.util.Set var15 = var14.entrySet();
    java.util.Hashtable var18 = new java.util.Hashtable(0, 10.0f);
    var14.putAll((java.util.Map)var18);
    java.util.Enumeration var20 = var14.keys();
    boolean var21 = var14.isEmpty();
    var2.putAll((java.util.Map)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

}
