
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    java.lang.String var3 = java.lang.String.format("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("100");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.jar.Attributes var1 = new java.util.jar.Attributes((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    char[] var2 = new char[] { '4', ' '};
    java.lang.String var3 = java.lang.String.valueOf(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4 "+ "'", var3.equals("4 "));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var0 = new byte[] { };
    byte[] var1 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    var0.clear();
    boolean var3 = var0.containsKey((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.String var1 = new java.lang.String("100");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100"+ "'", var1.equals("100"));

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    sun.net.util.IPAddressUtil var0 = new sun.net.util.IPAddressUtil();

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.lang.String var1 = java.lang.String.valueOf(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "0.0"+ "'", var1.equals("0.0"));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    char[] var1 = new char[] { ' '};
    java.lang.String var2 = new java.lang.String(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + " "+ "'", var2.equals(" "));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var5 = var1.wrongInterfaceDef((java.lang.Throwable)var4);
    org.omg.CORBA.INV_OBJREF var6 = var1.noProfilePresent();
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.jar.Attributes var0 = new java.util.jar.Attributes();
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getValue("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.MARSHAL var2 = var1.recursiveTypecodeError();
    org.omg.CORBA.BAD_PARAM var3 = var1.nullObjectReference();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.MARSHAL var5 = var1.customWrapperWithCodebase((java.lang.Throwable)var4);
    java.util.logging.Logger var6 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var6);
    java.util.logging.Logger var8 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.INTERNAL var10 = var9.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var11 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    org.omg.CORBA.INTERNAL var15 = var14.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var16 = var12.wrongInterfaceDef((java.lang.Throwable)var15);
    org.omg.CORBA.BAD_PARAM var19 = var7.couldNotCreateArray((java.lang.Throwable)var10, (java.lang.Object)var15, (java.lang.Object)(short)100, (java.lang.Object)10);
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.util.logging.Logger var22 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var22);
    org.omg.CORBA.INTERNAL var24 = var23.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var25 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var25);
    java.util.logging.Logger var27 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    org.omg.CORBA.INTERNAL var29 = var28.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var30 = var26.wrongInterfaceDef((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_PARAM var33 = var21.couldNotCreateArray((java.lang.Throwable)var24, (java.lang.Object)var29, (java.lang.Object)(short)100, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var34 = var21.errorInitBadserveridhandler();
    org.omg.CORBA.DATA_CONVERSION var35 = var7.badCustomSocketFactory((java.lang.Object)var34);
    java.util.logging.Logger var36 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var36);
    java.util.logging.Logger var38 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var38);
    org.omg.CORBA.INTERNAL var40 = var39.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var41 = var37.wrongInterfaceDef((java.lang.Throwable)var40);
    org.omg.CORBA.BAD_OPERATION var42 = var7.adapterIdNotAvailable((java.lang.Throwable)var40);
    org.omg.CORBA.NO_IMPLEMENT var43 = var1.contextNotImplemented((java.lang.Throwable)var42);
    java.util.logging.Logger var44 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var44);
    java.util.logging.Logger var46 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var46);
    org.omg.CORBA.INTERNAL var48 = var47.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var49 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var49);
    java.util.logging.Logger var51 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var51);
    org.omg.CORBA.INTERNAL var53 = var52.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var54 = var50.wrongInterfaceDef((java.lang.Throwable)var53);
    org.omg.CORBA.BAD_PARAM var57 = var45.couldNotCreateArray((java.lang.Throwable)var48, (java.lang.Object)var53, (java.lang.Object)(short)100, (java.lang.Object)10);
    org.omg.CORBA.MARSHAL var59 = var1.indirectionNotFound((java.lang.Throwable)var53, (java.lang.Object)(byte)10);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var7 = var6.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var8 = var4.wrongInterfaceDef((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.badDigitInFixed((java.lang.Throwable)var8);
    org.omg.CORBA.DATA_CONVERSION var11 = var1.orbInitializerType((java.lang.Object)0L);
    java.util.logging.Logger var12 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.INTERNAL var14 = var13.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var15 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.INTERNAL var19 = var18.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var20 = var16.wrongInterfaceDef((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var21 = var13.badDigitInFixed((java.lang.Throwable)var20);
    org.omg.CORBA.INTERNAL var22 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid((java.lang.Throwable)var21);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.regex.Pattern var2 = java.util.regex.Pattern.compile("4 ", 1);
    java.lang.String[] var5 = var2.split((java.lang.CharSequence)"4 ", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var7 = var6.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var8 = var4.wrongInterfaceDef((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.badDigitInFixed((java.lang.Throwable)var8);
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    java.util.logging.Logger var12 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.INTERNAL var14 = var13.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var15 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.INTERNAL var19 = var18.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var20 = var16.wrongInterfaceDef((java.lang.Throwable)var19);
    org.omg.CORBA.BAD_PARAM var23 = var11.couldNotCreateArray((java.lang.Throwable)var14, (java.lang.Object)var19, (java.lang.Object)(short)100, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var24 = var11.errorInitBadserveridhandler();
    org.omg.CORBA.INITIALIZE var25 = var11.cannotReadOrbidDb();
    org.omg.CORBA.BAD_PARAM var26 = var11.abstractFromNonAbstract();
    java.util.jar.Attributes var27 = new java.util.jar.Attributes();
    var27.clear();
    org.omg.CORBA.MARSHAL var30 = var11.badFixed((java.lang.Object)var27, (java.lang.Object)"hi!");
    org.omg.CORBA.MARSHAL var31 = var1.stubCreateError((java.lang.Throwable)var30);
    org.omg.CORBA.COMM_FAILURE var32 = var1.bufferReadManagerTimeout();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    var0.finer("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.util.logging.Logger var2 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var2);
    java.util.logging.Logger var4 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    org.omg.CORBA.INTERNAL var6 = var5.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var7 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.util.logging.Logger var9 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var9);
    org.omg.CORBA.INTERNAL var11 = var10.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var12 = var8.wrongInterfaceDef((java.lang.Throwable)var11);
    org.omg.CORBA.BAD_PARAM var15 = var3.couldNotCreateArray((java.lang.Throwable)var6, (java.lang.Object)var11, (java.lang.Object)(short)100, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var16 = var3.errorInitBadserveridhandler();
    org.omg.CORBA.INITIALIZE var17 = var3.cannotReadOrbidDb();
    org.omg.CORBA.DATA_CONVERSION var19 = var1.badContactInfoListFactory((java.lang.Throwable)var17, (java.lang.Object)1.0f);
    java.util.logging.Logger var21 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    org.omg.CORBA.MARSHAL var23 = var22.recursiveTypecodeError();
    org.omg.CORBA.INTERNAL var24 = var1.threadGroupHasActiveThreadsInClose((java.lang.Object)'a', (java.lang.Object)var23);
    java.util.logging.Logger var25 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var25);
    java.util.logging.Logger var27 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    org.omg.CORBA.INTERNAL var29 = var28.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var30 = var26.wrongInterfaceDef((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var1.invalidBtcConverterName((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var7 = var6.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var8 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.util.logging.Logger var10 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var10);
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var13 = var9.wrongInterfaceDef((java.lang.Throwable)var12);
    org.omg.CORBA.BAD_PARAM var16 = var4.couldNotCreateArray((java.lang.Throwable)var7, (java.lang.Object)var12, (java.lang.Object)(short)100, (java.lang.Object)10);
    java.util.logging.Logger var17 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    java.util.logging.Logger var19 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var19);
    org.omg.CORBA.INTERNAL var21 = var20.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var22 = var18.wrongInterfaceDef((java.lang.Throwable)var21);
    org.omg.CORBA.INTERNAL var23 = var4.locationforwardError((java.lang.Throwable)var22);
    java.util.logging.Logger var24 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var24);
    org.omg.CORBA.INTERNAL var26 = var25.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var27 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    java.util.logging.Logger var29 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    org.omg.CORBA.INTERNAL var31 = var30.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var32 = var28.wrongInterfaceDef((java.lang.Throwable)var31);
    org.omg.CORBA.MARSHAL var33 = var25.badDigitInFixed((java.lang.Throwable)var32);
    org.omg.CORBA.INTERNAL var35 = var1.interruptedJoinCallWhileClosingThreadPool((java.lang.Throwable)var22, (java.lang.Object)var32, (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var36 = var1.nullOutCall();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();
    java.util.jar.Attributes var2 = var0.getAttributes("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var3 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var3);
    java.util.logging.Logger var5 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var5);
    org.omg.CORBA.INTERNAL var7 = var6.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var8 = var4.wrongInterfaceDef((java.lang.Throwable)var7);
    org.omg.CORBA.MARSHAL var9 = var1.badDigitInFixed((java.lang.Throwable)var8);
    org.omg.CORBA.DATA_CONVERSION var11 = var1.orbInitializerType((java.lang.Object)0L);
    java.util.logging.Logger var12 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.INTERNAL var14 = var13.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var15 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var17 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    org.omg.CORBA.INTERNAL var19 = var18.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var20 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var20);
    java.util.logging.Logger var22 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var22);
    org.omg.CORBA.INTERNAL var24 = var23.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var25 = var21.wrongInterfaceDef((java.lang.Throwable)var24);
    org.omg.CORBA.BAD_PARAM var28 = var16.couldNotCreateArray((java.lang.Throwable)var19, (java.lang.Object)var24, (java.lang.Object)(short)100, (java.lang.Object)10);
    java.util.logging.Logger var29 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var29);
    java.util.logging.Logger var31 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var31);
    org.omg.CORBA.INTERNAL var33 = var32.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var34 = var30.wrongInterfaceDef((java.lang.Throwable)var33);
    org.omg.CORBA.INTERNAL var35 = var16.locationforwardError((java.lang.Throwable)var34);
    java.util.logging.Logger var36 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var36);
    org.omg.CORBA.INTERNAL var38 = var37.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var39 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var39);
    java.util.logging.Logger var41 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var41);
    org.omg.CORBA.INTERNAL var43 = var42.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var44 = var40.wrongInterfaceDef((java.lang.Throwable)var43);
    org.omg.CORBA.MARSHAL var45 = var37.badDigitInFixed((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var47 = var13.interruptedJoinCallWhileClosingThreadPool((java.lang.Throwable)var34, (java.lang.Object)var44, (java.lang.Object)(byte)(-1));
    org.omg.CORBA.MARSHAL var48 = var1.valuehandlerReadException((java.lang.Throwable)var44);
    java.util.logging.Logger var49 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var49);
    java.util.logging.Logger var51 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var51);
    org.omg.CORBA.INTERNAL var53 = var52.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    java.util.logging.Logger var54 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var54);
    java.util.logging.Logger var56 = java.util.logging.Logger.getAnonymousLogger();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var56);
    org.omg.CORBA.INTERNAL var58 = var57.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.UNKNOWN var59 = var55.wrongInterfaceDef((java.lang.Throwable)var58);
    org.omg.CORBA.BAD_PARAM var62 = var50.couldNotCreateArray((java.lang.Throwable)var53, (java.lang.Object)var58, (java.lang.Object)(short)100, (java.lang.Object)10);
    org.omg.CORBA.OBJECT_NOT_EXIST var63 = var1.badAdapterId((java.lang.Throwable)var62);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

}
