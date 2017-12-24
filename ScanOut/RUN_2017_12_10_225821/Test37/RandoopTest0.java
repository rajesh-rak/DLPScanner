
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = java.lang.String.valueOf((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.config("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    byte[] var2 = new byte[] { (byte)(-1), (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u01FF\u0101"+ "'", var4.equals("\u01FF\u0101"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Locale[] var0 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    char[] var3 = new char[] { 'a', '#', '#'};
    java.lang.String var4 = java.lang.String.valueOf(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a##"+ "'", var4.equals("a##"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var0 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();
    java.lang.Object[][] var1 = var0.getContents();
    java.util.Set var2 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var4 = new java.net.URL("", "100", 1, "\u01FF\u0101");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(10);
    int var2 = var1.size();
    java.lang.Object var4 = var1.remove((java.lang.Object)"-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("100");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var0 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();
    java.lang.Object[][] var1 = var0.getContents();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getString("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.jar.Attributes var1 = new java.util.jar.Attributes(0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.setUseParentHandlers(false);
    var0.warning("-1");
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    var5.setUseParentHandlers(false);
    var5.warning("-1");
    var0.setParent(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = new java.lang.String(var0, "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.setUseParentHandlers(false);
    java.util.ResourceBundle var3 = var0.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    var0.setUseParentHandlers(false);
    var0.warning("-1");
    java.util.logging.Level var5 = var0.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    java.util.Set var1 = var0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var4 = var3.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var7 = var6.connectRequiresStub();
    org.omg.CORBA.MARSHAL var8 = var3.customWrapperIndirection((java.lang.Throwable)var7);
    org.omg.CORBA.DATA_CONVERSION var9 = var1.badGiop11Ctb((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var4 = var3.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var5 = var3.orbConnectError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var8 = var7.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var11 = var10.connectRequiresStub();
    org.omg.CORBA.MARSHAL var12 = var7.customWrapperIndirection((java.lang.Throwable)var11);
    org.omg.CORBA.OBJECT_NOT_EXIST var13 = var3.noObjectAdapterFactory((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var14 = var1.svcctxUnmarshalError((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var2 = var1.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var5 = var4.connectRequiresStub();
    org.omg.CORBA.MARSHAL var6 = var1.customWrapperIndirection((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var9 = var8.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var10 = var8.orbConnectError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var13 = var12.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var16 = var15.connectRequiresStub();
    org.omg.CORBA.MARSHAL var17 = var12.customWrapperIndirection((java.lang.Throwable)var16);
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var8.noObjectAdapterFactory((java.lang.Throwable)var16);
    org.omg.CORBA.UNKNOWN var19 = var1.noInterfaceDefStub((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var22 = var21.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var25 = var24.connectRequiresStub();
    org.omg.CORBA.MARSHAL var26 = var21.customWrapperIndirection((java.lang.Throwable)var25);
    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var27 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();
    org.omg.CORBA.INTERNAL var29 = var1.workerThreadDoWorkThrowable((java.lang.Throwable)var25, (java.lang.Object)var27, (java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var0 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();
    java.util.Enumeration var1 = var0.getKeys();
    java.lang.Object var3 = var0.handleGetObject("a##");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.MARSHAL var2 = var1.customWrapperWithCodebase();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    var3.setUseParentHandlers(false);
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    var6.setUseParentHandlers(false);
    var3.setParent(var6);
    org.omg.CORBA.DATA_CONVERSION var10 = var1.badCustomIiopPrimaryToContactInfo((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.MARSHAL var13 = var12.customWrapperWithCodebase();
    java.util.logging.Logger var14 = java.util.logging.Logger.getAnonymousLogger();
    var14.setUseParentHandlers(false);
    java.util.logging.Logger var17 = java.util.logging.Logger.getAnonymousLogger();
    var17.setUseParentHandlers(false);
    var14.setParent(var17);
    org.omg.CORBA.DATA_CONVERSION var21 = var12.badCustomIiopPrimaryToContactInfo((java.lang.Object)var14);
    org.omg.CORBA.BAD_OPERATION var22 = var1.getTypeIdsRequiresStub((java.lang.Throwable)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var2 = var1.connectRequiresStub();
    org.omg.CORBA.BAD_INV_ORDER var3 = var1.argumentsCalledMultiple();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var2 = var1.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var5 = var4.connectRequiresStub();
    org.omg.CORBA.MARSHAL var6 = var1.customWrapperIndirection((java.lang.Throwable)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var9 = var8.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var10 = var8.orbConnectError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var13 = var12.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var16 = var15.connectRequiresStub();
    org.omg.CORBA.MARSHAL var17 = var12.customWrapperIndirection((java.lang.Throwable)var16);
    org.omg.CORBA.OBJECT_NOT_EXIST var18 = var8.noObjectAdapterFactory((java.lang.Throwable)var16);
    org.omg.CORBA.UNKNOWN var19 = var1.noInterfaceDefStub((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var20 = var1.numInvocationsAlreadyZero();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var2 = var1.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var3 = var1.orbConnectError();
    org.omg.CORBA.INTERNAL var4 = var1.statementNotReachable2();
    org.omg.CORBA.INTERNAL var5 = var1.nonExistentOrbid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var2 = var1.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var3 = var1.orbConnectError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var6 = var5.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var9 = var8.connectRequiresStub();
    org.omg.CORBA.MARSHAL var10 = var5.customWrapperIndirection((java.lang.Throwable)var9);
    org.omg.CORBA.OBJECT_NOT_EXIST var11 = var1.noObjectAdapterFactory((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var14 = var13.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var17 = var16.connectRequiresStub();
    org.omg.CORBA.MARSHAL var18 = var13.customWrapperIndirection((java.lang.Throwable)var17);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var21 = var20.connectRequiresStub();
    org.omg.CORBA.OBJ_ADAPTER var22 = var20.orbConnectError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var25 = var24.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var28 = var27.connectRequiresStub();
    org.omg.CORBA.MARSHAL var29 = var24.customWrapperIndirection((java.lang.Throwable)var28);
    org.omg.CORBA.OBJECT_NOT_EXIST var30 = var20.noObjectAdapterFactory((java.lang.Throwable)var28);
    org.omg.CORBA.UNKNOWN var31 = var13.noInterfaceDefStub((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var34 = var33.connectRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var37 = var36.connectRequiresStub();
    org.omg.CORBA.MARSHAL var38 = var33.customWrapperIndirection((java.lang.Throwable)var37);
    org.omg.CORBA.INTERNAL var39 = var1.badCompletionStatusInLocateReply((java.lang.Throwable)var31, (java.lang.Object)var38);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var42 = var41.connectRequiresStub();
    org.omg.CORBA.BAD_PARAM var43 = var41.bootstrapRuntimeException();
    org.omg.CORBA.DATA_CONVERSION var45 = var1.badContactInfoListFactory((java.lang.Throwable)var43, (java.lang.Object)(-1.0f));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("100");
    org.omg.CORBA.BAD_OPERATION var50 = var49.connectRequiresStub();
    org.omg.CORBA.BAD_PARAM var51 = var49.bootstrapRuntimeException();
    org.omg.CORBA.BAD_PARAM var52 = var1.invalidRequestPartitioningId((java.lang.Object)(short)1, (java.lang.Object)"\u01FF\u0101", (java.lang.Object)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

}
