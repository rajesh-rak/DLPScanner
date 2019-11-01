
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.net.URL[] var0 = new java.net.URL[] { };
    sun.misc.URLClassPath var1 = new sun.misc.URLClassPath(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("hi!", "1");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var3 = var2.getName();
    java.util.logging.Logger var4 = var2.getParent();
    var0.setParent(var2);
    java.util.ResourceBundle var6 = var0.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var1 = var0.getName();
    java.util.logging.Logger var2 = var0.getParent();
    var0.info("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var2 = new byte[] { (byte)10, (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0A0A\u0A01"+ "'", var4.equals("\u0A0A\u0A01"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    char[] var3 = new char[] { 'a', ' ', 'a'};
    java.lang.String var4 = java.lang.String.valueOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = new java.lang.String(var3, (-1), 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "a a"+ "'", var4.equals("a a"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    java.util.ResourceBundle var7 = var3.getResourceBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    byte[] var3 = new byte[] { (byte)10, (byte)100, (byte)(-1)};
    java.lang.String var4 = new java.lang.String(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\nd\uFFFD"+ "'", var4.equals("\nd\uFFFD"));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var2 = var1.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var5 = var4.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var7 = var6.getName();
    java.util.logging.Logger var8 = var6.getParent();
    org.omg.CORBA.MARSHAL var9 = var4.unknownCodeset((java.lang.Object)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var12 = var11.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var14 = var4.badRepIdIndirection((java.lang.Throwable)var12, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var15 = var1.dsimethodNotcalled((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var19 = var18.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var21 = var20.getName();
    java.util.logging.Logger var22 = var20.getParent();
    org.omg.CORBA.MARSHAL var23 = var18.unknownCodeset((java.lang.Object)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var26 = var25.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var28 = var18.badRepIdIndirection((java.lang.Throwable)var26, (java.lang.Object)100.0f);
    java.util.logging.Logger var29 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var30 = var29.getName();
    org.omg.CORBA.BAD_PARAM var31 = var1.invalidRequestPartitioningComponentValue((java.lang.Object)10.0d, (java.lang.Object)var18, (java.lang.Object)var29);
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    org.omg.CORBA.BAD_INV_ORDER var7 = var1.setResultAfterException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var9 = var8.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var11 = var1.badRepIdIndirection((java.lang.Throwable)var9, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var12 = var1.giopMagicError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var15 = var14.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var18 = var17.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var20 = var19.getName();
    java.util.logging.Logger var21 = var19.getParent();
    org.omg.CORBA.MARSHAL var22 = var17.unknownCodeset((java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var25 = var24.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var27 = var17.badRepIdIndirection((java.lang.Throwable)var25, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var28 = var14.dsimethodNotcalled((java.lang.Throwable)var27);
    org.omg.CORBA.MARSHAL var29 = var1.cannotMarshalBadTckind((java.lang.Throwable)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
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

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.org.apache.xml.internal.res.XMLErrorResources_sk var0 = new com.sun.org.apache.xml.internal.res.XMLErrorResources_sk();

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var9 = var8.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var11 = var1.badRepIdIndirection((java.lang.Throwable)var9, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var12 = var1.giopMagicError();
    org.omg.CORBA.MARSHAL var13 = var1.readObjectException();
    org.omg.CORBA.INTERNAL var14 = var1.badGiopRequestType();
    org.omg.CORBA.MARSHAL var15 = var1.invalidComplexTypecode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.UNKNOWN var2 = var1.noInterfaceDefStub();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var9 = var8.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var11 = var10.getName();
    java.util.logging.Logger var12 = var10.getParent();
    org.omg.CORBA.MARSHAL var13 = var8.unknownCodeset((java.lang.Object)var10);
    org.omg.CORBA.INTERNAL var14 = var1.duplicateIndirectionOffset((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var17 = var16.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var18 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var19 = var18.getName();
    java.util.logging.Logger var20 = var18.getParent();
    org.omg.CORBA.MARSHAL var21 = var16.unknownCodeset((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var24 = var23.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var25 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var26 = var25.getName();
    java.util.logging.Logger var27 = var25.getParent();
    org.omg.CORBA.MARSHAL var28 = var23.unknownCodeset((java.lang.Object)var25);
    org.omg.CORBA.INTERNAL var29 = var16.duplicateIndirectionOffset((java.lang.Throwable)var28);
    org.omg.CORBA.UNKNOWN var30 = var1.wrongInterfaceDef((java.lang.Throwable)var28);
    org.omg.CORBA.OBJECT_NOT_EXIST var31 = var1.badSkeleton();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
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

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var2 = var1.badGiopRequestType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var9 = var8.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var11 = var1.badRepIdIndirection((java.lang.Throwable)var9, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var12 = var1.giopMagicError();
    org.omg.CORBA.MARSHAL var13 = var1.readObjectException();
    org.omg.CORBA.INTERNAL var14 = var1.badGiopRequestType();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var17 = var16.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var18 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var19 = var18.getName();
    java.util.logging.Logger var20 = var18.getParent();
    org.omg.CORBA.MARSHAL var21 = var16.unknownCodeset((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var24 = var23.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var26 = var16.badRepIdIndirection((java.lang.Throwable)var24, (java.lang.Object)100.0f);
    org.omg.CORBA.NO_IMPLEMENT var27 = var16.genericNoImpl();
    org.omg.CORBA.BAD_INV_ORDER var28 = var1.setResultCalledMultiple((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var9 = var8.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var11 = var1.badRepIdIndirection((java.lang.Throwable)var9, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var12 = var1.giopMagicError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var15 = var14.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var16 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var17 = var16.getName();
    java.util.logging.Logger var18 = var16.getParent();
    org.omg.CORBA.MARSHAL var19 = var14.unknownCodeset((java.lang.Object)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var22 = var21.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var24 = var14.badRepIdIndirection((java.lang.Throwable)var22, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var25 = var14.giopMagicError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var28 = var27.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var29 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var30 = var29.getName();
    java.util.logging.Logger var31 = var29.getParent();
    org.omg.CORBA.MARSHAL var32 = var27.unknownCodeset((java.lang.Object)var29);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var35 = var34.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var37 = var27.badRepIdIndirection((java.lang.Throwable)var35, (java.lang.Object)100.0f);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var42 = var41.getServerPortCalledBeforeEndpointsInitialized();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var45 = var44.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var46 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var47 = var46.getName();
    java.util.logging.Logger var48 = var46.getParent();
    org.omg.CORBA.MARSHAL var49 = var44.unknownCodeset((java.lang.Object)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var52 = var51.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var54 = var44.badRepIdIndirection((java.lang.Throwable)var52, (java.lang.Object)100.0f);
    java.util.logging.Logger var55 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var56 = var55.getName();
    java.util.logging.Logger var57 = var55.getParent();
    org.omg.CORBA.MARSHAL var58 = var41.unknownCodeset((java.lang.Throwable)var52, (java.lang.Object)var55);
    org.omg.CORBA.INTERNAL var59 = var14.workerThreadNotNeeded((java.lang.Throwable)var35, (java.lang.Object)100L, (java.lang.Object)true, (java.lang.Object)var55);
    org.omg.CORBA.INV_OBJREF var60 = var1.badCorbalocString((java.lang.Throwable)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var2 = var1.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var5 = var4.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var7 = var6.getName();
    java.util.logging.Logger var8 = var6.getParent();
    org.omg.CORBA.MARSHAL var9 = var4.unknownCodeset((java.lang.Object)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var12 = var11.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var14 = var4.badRepIdIndirection((java.lang.Throwable)var12, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var15 = var1.dsimethodNotcalled((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var18 = var17.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var20 = var19.getName();
    java.util.logging.Logger var21 = var19.getParent();
    org.omg.CORBA.MARSHAL var22 = var17.unknownCodeset((java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var25 = var24.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var26 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var27 = var26.getName();
    java.util.logging.Logger var28 = var26.getParent();
    org.omg.CORBA.MARSHAL var29 = var24.unknownCodeset((java.lang.Object)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var32 = var31.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var33 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var34 = var33.getName();
    java.util.logging.Logger var35 = var33.getParent();
    org.omg.CORBA.MARSHAL var36 = var31.unknownCodeset((java.lang.Object)var33);
    org.omg.CORBA.INTERNAL var37 = var24.duplicateIndirectionOffset((java.lang.Throwable)var36);
    org.omg.CORBA.BAD_INV_ORDER var38 = var17.setResultCalledMultiple((java.lang.Throwable)var36);
    org.omg.CORBA.BAD_PARAM var39 = var1.invalidTaggedProfile((java.lang.Throwable)var38);
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var2 = var1.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var5 = var4.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var7 = var6.getName();
    java.util.logging.Logger var8 = var6.getParent();
    org.omg.CORBA.MARSHAL var9 = var4.unknownCodeset((java.lang.Object)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var12 = var11.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var14 = var4.badRepIdIndirection((java.lang.Throwable)var12, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var15 = var1.dsimethodNotcalled((java.lang.Throwable)var14);
    org.omg.CORBA.MARSHAL var16 = var1.customWrapperNotSingleRepid();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var9 = var8.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var11 = var10.getName();
    java.util.logging.Logger var12 = var10.getParent();
    org.omg.CORBA.MARSHAL var13 = var8.unknownCodeset((java.lang.Object)var10);
    org.omg.CORBA.INTERNAL var14 = var1.duplicateIndirectionOffset((java.lang.Throwable)var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var17 = var16.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var18 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var19 = var18.getName();
    java.util.logging.Logger var20 = var18.getParent();
    org.omg.CORBA.MARSHAL var21 = var16.unknownCodeset((java.lang.Object)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var24 = var23.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var25 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var26 = var25.getName();
    java.util.logging.Logger var27 = var25.getParent();
    org.omg.CORBA.MARSHAL var28 = var23.unknownCodeset((java.lang.Object)var25);
    org.omg.CORBA.INTERNAL var29 = var16.duplicateIndirectionOffset((java.lang.Throwable)var28);
    org.omg.CORBA.UNKNOWN var30 = var1.wrongInterfaceDef((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var33 = var32.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var36 = var35.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var37 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var38 = var37.getName();
    java.util.logging.Logger var39 = var37.getParent();
    org.omg.CORBA.MARSHAL var40 = var35.unknownCodeset((java.lang.Object)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var43 = var42.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var45 = var35.badRepIdIndirection((java.lang.Throwable)var43, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var46 = var32.dsimethodNotcalled((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var49 = var48.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var52 = var51.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var53 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var54 = var53.getName();
    java.util.logging.Logger var55 = var53.getParent();
    org.omg.CORBA.MARSHAL var56 = var51.unknownCodeset((java.lang.Object)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var59 = var58.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var61 = var51.badRepIdIndirection((java.lang.Throwable)var59, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var62 = var48.dsimethodNotcalled((java.lang.Throwable)var61);
    java.util.logging.Logger var63 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var64 = var63.getName();
    java.util.logging.Logger var65 = var63.getParent();
    org.omg.CORBA.MARSHAL var66 = var32.couldNotInvokeHelperReadMethod((java.lang.Throwable)var61, (java.lang.Object)var63);
    org.omg.CORBA.BAD_OPERATION var67 = var1.serverIdNotAvailable((java.lang.Throwable)var66);
    org.omg.CORBA.INTERNAL var69 = var1.invalidBuffMgrStrategy((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var2 = var1.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var4 = var3.getName();
    java.util.logging.Logger var5 = var3.getParent();
    org.omg.CORBA.MARSHAL var6 = var1.unknownCodeset((java.lang.Object)var3);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var9 = var8.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var11 = var1.badRepIdIndirection((java.lang.Throwable)var9, (java.lang.Object)100.0f);
    org.omg.CORBA.INTERNAL var12 = var1.giopMagicError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var15 = var14.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var18 = var17.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var20 = var19.getName();
    java.util.logging.Logger var21 = var19.getParent();
    org.omg.CORBA.MARSHAL var22 = var17.unknownCodeset((java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var25 = var24.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var27 = var17.badRepIdIndirection((java.lang.Throwable)var25, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var28 = var14.dsimethodNotcalled((java.lang.Throwable)var27);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var31 = var30.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var34 = var33.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var35 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var36 = var35.getName();
    java.util.logging.Logger var37 = var35.getParent();
    org.omg.CORBA.MARSHAL var38 = var33.unknownCodeset((java.lang.Object)var35);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var41 = var40.unableToSetSocketFactoryOrb();
    org.omg.CORBA.MARSHAL var43 = var33.badRepIdIndirection((java.lang.Throwable)var41, (java.lang.Object)100.0f);
    org.omg.CORBA.BAD_INV_ORDER var44 = var30.dsimethodNotcalled((java.lang.Throwable)var43);
    java.util.logging.Logger var45 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var46 = var45.getName();
    java.util.logging.Logger var47 = var45.getParent();
    org.omg.CORBA.MARSHAL var48 = var14.couldNotInvokeHelperReadMethod((java.lang.Throwable)var43, (java.lang.Object)var45);
    org.omg.CORBA.MARSHAL var49 = var1.badCodebaseIndirection((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INTERNAL var2 = var1.unableToSetSocketFactoryOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("4");
    org.omg.CORBA.INITIALIZE var5 = var4.getServerPortCalledBeforeEndpointsInitialized();
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    java.lang.String var7 = var6.getName();
    java.util.logging.Logger var8 = var6.getParent();
    org.omg.CORBA.MARSHAL var9 = var4.unknownCodeset((java.lang.Object)var6);
    org.omg.CORBA.INTERNAL var12 = var1.workQueueRequestWorkNoWorkFound((java.lang.Throwable)var9, (java.lang.Object)"a a", (java.lang.Object)100.0d);
    org.omg.CORBA.COMM_FAILURE var13 = var1.connectionRebind();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

}
