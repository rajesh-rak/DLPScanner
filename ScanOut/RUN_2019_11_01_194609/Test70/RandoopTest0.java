
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    java.lang.String var1 = var0.remoteToString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "UnicastServerRef [liveRef: null]"+ "'", var1.equals("UnicastServerRef [liveRef: null]"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.PrintStream var2 = new java.io.PrintStream("UnicastServerRef [liveRef: null]", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int[] var2 = new int[] { 0, 1};
    java.lang.String var5 = new java.lang.String(var2, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\u0001"+ "'", var5.equals("\u0001"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.rmi.server.UnicastServerRef var1 = new sun.rmi.server.UnicastServerRef(1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    int var1 = var0.remoteHashCode();

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    byte[] var3 = new byte[] { (byte)10, (byte)10, (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, 0, (-1), (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    sun.rmi.server.UnicastServerRef var0 = new sun.rmi.server.UnicastServerRef();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = var0.getClientHost();
      fail("Expected exception of type java.rmi.server.ServerNotActiveException");
    } catch (java.rmi.server.ServerNotActiveException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte[] var3 = new byte[] { (byte)10, (byte)0, (byte)100};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var8 = new java.lang.String(var3, (-1), 0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = new java.lang.String(var3, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n\u0000d"+ "'", var4.equals("\n\u0000d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\uFF0A"+ "'", var8.equals("\uFF0A"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.Date var6 = new java.util.Date(0, 100, 0, 0, 10, 10);
    var6.setHours((-1));
    int var9 = var6.getMonth();

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.entering("a #", "UnicastServerRef [liveRef: null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.Date var6 = new java.util.Date(0, 100, 0, 0, 10, 10);
    int var7 = var6.getHours();
    char[] var11 = new char[] { 'a', ' ', '#'};
    java.lang.String var12 = java.lang.String.copyValueOf(var11);
    boolean var13 = var6.equals((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "a #"+ "'", var12.equals("a #"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.Properties var0 = new java.util.Properties();
    java.util.Properties var1 = new java.util.Properties();
    var0.putAll((java.util.Map)var1);
    java.util.logging.LogManager var3 = java.util.logging.LogManager.getLogManager();
    var3.reset();
    boolean var5 = var0.containsValue((java.lang.Object)var3);
    java.util.logging.LogManager var6 = java.util.logging.LogManager.getLogManager();
    var6.reset();
    boolean var8 = var0.equals((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    byte[] var3 = new byte[] { (byte)10, (byte)0, (byte)100};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var7 = new java.lang.String(var3, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = new java.lang.String(var3, 0, (-1), "\uFF0A");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n\u0000d"+ "'", var4.equals("\n\u0000d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\u0000"+ "'", var7.equals("\u0000"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.Object[] var4 = new java.lang.Object[] { 10};
    var0.entering("\u0000", "\uFF0A", var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.StringBuilder var0 = new java.lang.StringBuilder();
    int var3 = var0.indexOf("a #", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var3 = new byte[] { (byte)10, (byte)0, (byte)100};
    java.lang.String var4 = new java.lang.String(var3);
    java.lang.String var8 = new java.lang.String(var3, (-1), 0, 1);
    java.lang.String var9 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n\u0000d"+ "'", var4.equals("\n\u0000d"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\uFF0A"+ "'", var8.equals("\uFF0A"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n\u0000d"+ "'", var9.equals("\n\u0000d"));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.String var1 = new java.lang.String("\u0000");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\u0000"+ "'", var1.equals("\u0000"));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.COMM_FAILURE var2 = var1.connectionRebind();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    org.omg.CORBA.INTERNAL var5 = var4.unexpectedDiiException();
    java.util.Properties var6 = new java.util.Properties();
    java.util.Properties var7 = new java.util.Properties();
    var6.putAll((java.util.Map)var7);
    java.util.logging.LogManager var9 = java.util.logging.LogManager.getLogManager();
    var9.reset();
    boolean var11 = var6.containsValue((java.lang.Object)var9);
    java.util.Enumeration var12 = var6.propertyNames();
    org.omg.CORBA.BAD_OPERATION var13 = var4.classNotFound1((java.lang.Object)var12);
    org.omg.CORBA.BAD_OPERATION var15 = var4.badOrbConfigurator((java.lang.Object)10L);
    java.util.Properties var16 = new java.util.Properties();
    java.util.Properties var17 = new java.util.Properties();
    var16.putAll((java.util.Map)var17);
    java.util.Set var19 = var17.keySet();
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    org.omg.CORBA.INTERNAL var22 = var21.unexpectedDiiException();
    java.util.Properties var23 = new java.util.Properties();
    java.util.Properties var24 = new java.util.Properties();
    var23.putAll((java.util.Map)var24);
    java.util.logging.LogManager var26 = java.util.logging.LogManager.getLogManager();
    var26.reset();
    boolean var28 = var23.containsValue((java.lang.Object)var26);
    java.util.Enumeration var29 = var23.propertyNames();
    org.omg.CORBA.BAD_OPERATION var30 = var21.classNotFound1((java.lang.Object)var29);
    org.omg.CORBA.BAD_OPERATION var32 = var21.badOrbConfigurator((java.lang.Object)10L);
    org.omg.CORBA.BAD_PARAM var33 = var1.errorSettingField((java.lang.Throwable)var15, (java.lang.Object)var17, (java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.BAD_OPERATION var2 = var1.setExceptionCalledBadType();
    org.omg.CORBA.DATA_CONVERSION var3 = var1.badStringifiedIor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.unexpectedDiiException();
    org.omg.CORBA.DATA_CONVERSION var3 = var1.codesetIncompatible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.INTERNAL var4 = var3.unexpectedDiiException();
    org.omg.CORBA.BAD_OPERATION var5 = var1.ioExceptionOnClose((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    org.omg.CORBA.COMM_FAILURE var8 = var7.connectionRebind();
    org.omg.CORBA.BAD_OPERATION var9 = var1.orbDestroyed((java.lang.Throwable)var8);
    java.util.Properties var12 = new java.util.Properties();
    java.util.Properties var13 = new java.util.Properties();
    var12.putAll((java.util.Map)var13);
    java.util.logging.LogManager var15 = java.util.logging.LogManager.getLogManager();
    var15.reset();
    boolean var17 = var12.containsValue((java.lang.Object)var15);
    java.util.Enumeration var18 = var12.propertyNames();
    org.omg.CORBA.INTERNAL var19 = var1.workerThreadSetNameFailure((java.lang.Object)0.0f, (java.lang.Object)' ', (java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.badExceptionDetailMessageServiceContextType();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var7 = var6.unexpectedDiiException();
    org.omg.CORBA.BAD_OPERATION var8 = var4.ioExceptionOnClose((java.lang.Throwable)var7);
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.INTERNAL var12 = var11.unexpectedDiiException();
    java.util.Properties var13 = new java.util.Properties();
    java.util.Properties var14 = new java.util.Properties();
    var13.putAll((java.util.Map)var14);
    java.util.logging.LogManager var16 = java.util.logging.LogManager.getLogManager();
    var16.reset();
    boolean var18 = var13.containsValue((java.lang.Object)var16);
    java.util.Enumeration var19 = var13.propertyNames();
    org.omg.CORBA.BAD_OPERATION var20 = var11.classNotFound1((java.lang.Object)var19);
    org.omg.CORBA.MARSHAL var21 = var1.positiveEndTag((java.lang.Throwable)var7, (java.lang.Object)(byte)10, (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.unexpectedDiiException();
    org.omg.CORBA.INTERNAL var3 = var1.noClientScClass();
    java.util.logging.Logger var4 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    org.omg.CORBA.COMM_FAILURE var6 = var5.connectionRebind();
    org.omg.CORBA.INTERNAL var7 = var1.serverScNoIiopProfile((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
