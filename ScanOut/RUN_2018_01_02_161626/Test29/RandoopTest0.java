
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    byte[] var0 = new byte[] { };
    java.lang.String var1 = sun.security.util.Debug.toString(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10L, (-1));
    int var5 = var1.compareTo(var4);
    long var6 = var4.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var1 = sun.security.util.Debug.isOn("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10L, (-1));
    int var5 = var1.compareTo(var4);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var10 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(10L, (-1));
    int var14 = var10.compareTo(var13);
    java.math.BigDecimal var15 = var8.divideToIntegralValue(var13);
    java.math.BigDecimal var16 = var4.min(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.lang.String var2 = var1.toEngineeringString();
    java.math.BigDecimal var4 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var7 = java.math.BigDecimal.valueOf(10L, (-1));
    int var8 = var4.compareTo(var7);
    java.math.BigDecimal var9 = var4.ulp();
    java.math.BigDecimal var10 = var1.min(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "-1"+ "'", var2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10L, (-1));
    int var5 = var1.compareTo(var4);
    int var6 = var1.precision();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigDecimal var1 = new java.math.BigDecimal("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.Thread var1 = new java.lang.Thread("-1");
    java.lang.Thread var3 = new java.lang.Thread((java.lang.Runnable)var1, "-1");

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal(0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Exception var10 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var8.setExceptionCalledBadType((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_OPERATION var12 = var2.setExceptionCalledNullArgs((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var2.writeLocalObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Exception var10 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var8.setExceptionCalledBadType((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_OPERATION var12 = var2.setExceptionCalledNullArgs((java.lang.Throwable)var11);
    org.omg.CORBA.NO_IMPLEMENT var13 = var2.getinterfaceNotImplemented();
    java.util.logging.Logger var15 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.lang.Exception var18 = new java.lang.Exception("hi!");
    java.math.BigDecimal var20 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var23 = java.math.BigDecimal.valueOf(10L, (-1));
    int var24 = var20.compareTo(var23);
    java.math.BigDecimal var27 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var29 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var32 = java.math.BigDecimal.valueOf(10L, (-1));
    int var33 = var29.compareTo(var32);
    java.math.BigDecimal var34 = var27.divideToIntegralValue(var32);
    int var35 = var34.intValue();
    java.math.BigDecimal var36 = var20.multiply(var34);
    int var37 = var34.intValueExact();
    org.omg.CORBA.BAD_PARAM var38 = var16.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var18, (java.lang.Object)var37);
    java.util.logging.Logger var40 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var40);
    java.util.logging.Logger var43 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var43);
    java.lang.Exception var46 = new java.lang.Exception("hi!");
    java.math.BigDecimal var48 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var51 = java.math.BigDecimal.valueOf(10L, (-1));
    int var52 = var48.compareTo(var51);
    java.math.BigDecimal var55 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var57 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var60 = java.math.BigDecimal.valueOf(10L, (-1));
    int var61 = var57.compareTo(var60);
    java.math.BigDecimal var62 = var55.divideToIntegralValue(var60);
    int var63 = var62.intValue();
    java.math.BigDecimal var64 = var48.multiply(var62);
    int var65 = var62.intValueExact();
    org.omg.CORBA.BAD_PARAM var66 = var44.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var46, (java.lang.Object)var65);
    org.omg.CORBA.BAD_OPERATION var67 = var41.setDelegateRequiresStub((java.lang.Throwable)var66);
    java.util.logging.Logger var69 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var69);
    java.util.logging.Logger var72 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var72);
    java.lang.Exception var75 = new java.lang.Exception("hi!");
    java.math.BigDecimal var77 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var80 = java.math.BigDecimal.valueOf(10L, (-1));
    int var81 = var77.compareTo(var80);
    java.math.BigDecimal var84 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var86 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var89 = java.math.BigDecimal.valueOf(10L, (-1));
    int var90 = var86.compareTo(var89);
    java.math.BigDecimal var91 = var84.divideToIntegralValue(var89);
    int var92 = var91.intValue();
    java.math.BigDecimal var93 = var77.multiply(var91);
    int var94 = var91.intValueExact();
    org.omg.CORBA.BAD_PARAM var95 = var73.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var75, (java.lang.Object)var94);
    org.omg.CORBA.BAD_PARAM var96 = var70.unableFindValueFactory((java.lang.Throwable)var95);
    org.omg.CORBA.BAD_PARAM var98 = var2.couldNotCreateArray((java.lang.Throwable)var38, (java.lang.Object)var66, (java.lang.Object)var95, (java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    var1.finer("-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var2.giopVersionError();
    java.util.logging.Logger var8 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.util.logging.Logger var11 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var11);
    java.lang.Exception var14 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var15 = var12.setExceptionCalledBadType((java.lang.Throwable)var14);
    java.util.logging.Logger var17 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    java.lang.Exception var20 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var21 = var18.setExceptionCalledBadType((java.lang.Throwable)var20);
    org.omg.CORBA.BAD_OPERATION var22 = var12.setExceptionCalledNullArgs((java.lang.Throwable)var21);
    org.omg.CORBA.BAD_PARAM var23 = var9.socketFactoryAndContactInfoListAtSameTime((java.lang.Throwable)var22);
    java.util.logging.Logger var25 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var25);
    java.lang.Exception var28 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var29 = var26.setExceptionCalledBadType((java.lang.Throwable)var28);
    org.omg.CORBA.COMM_FAILURE var30 = var2.securityExceptionInAccept((java.lang.Object)var22, (java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    java.lang.Exception var7 = new java.lang.Exception("hi!");
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    int var13 = var9.compareTo(var12);
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var18 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var21 = java.math.BigDecimal.valueOf(10L, (-1));
    int var22 = var18.compareTo(var21);
    java.math.BigDecimal var23 = var16.divideToIntegralValue(var21);
    int var24 = var23.intValue();
    java.math.BigDecimal var25 = var9.multiply(var23);
    int var26 = var23.intValueExact();
    org.omg.CORBA.BAD_PARAM var27 = var5.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var7, (java.lang.Object)var26);
    org.omg.CORBA.BAD_OPERATION var28 = var2.setDelegateRequiresStub((java.lang.Throwable)var27);
    java.util.logging.Logger var30 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    java.lang.Exception var33 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var34 = var31.setExceptionCalledBadType((java.lang.Throwable)var33);
    java.util.logging.Logger var36 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var36);
    java.lang.Exception var39 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var40 = var37.setExceptionCalledBadType((java.lang.Throwable)var39);
    org.omg.CORBA.BAD_OPERATION var41 = var31.setExceptionCalledNullArgs((java.lang.Throwable)var40);
    org.omg.CORBA.NO_IMPLEMENT var42 = var31.getinterfaceNotImplemented();
    org.omg.CORBA.INTERNAL var43 = var2.noPoa((java.lang.Throwable)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Exception var10 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var8.setExceptionCalledBadType((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_OPERATION var12 = var2.setExceptionCalledNullArgs((java.lang.Throwable)var11);
    java.util.logging.Logger var14 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var14);
    java.util.logging.Logger var17 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var17);
    java.lang.Exception var20 = new java.lang.Exception("hi!");
    java.math.BigDecimal var22 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var25 = java.math.BigDecimal.valueOf(10L, (-1));
    int var26 = var22.compareTo(var25);
    java.math.BigDecimal var29 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var31 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var34 = java.math.BigDecimal.valueOf(10L, (-1));
    int var35 = var31.compareTo(var34);
    java.math.BigDecimal var36 = var29.divideToIntegralValue(var34);
    int var37 = var36.intValue();
    java.math.BigDecimal var38 = var22.multiply(var36);
    int var39 = var36.intValueExact();
    org.omg.CORBA.BAD_PARAM var40 = var18.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var20, (java.lang.Object)var39);
    org.omg.CORBA.BAD_OPERATION var41 = var15.setDelegateRequiresStub((java.lang.Throwable)var40);
    org.omg.CORBA.INTERNAL var43 = var2.badHelperReadMethod((java.lang.Throwable)var41, (java.lang.Object)100.0f);
    java.math.BigDecimal var46 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var48 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var51 = java.math.BigDecimal.valueOf(10L, (-1));
    int var52 = var48.compareTo(var51);
    java.math.BigDecimal var53 = var46.divideToIntegralValue(var51);
    int var54 = var53.intValue();
    java.lang.String var55 = var53.toPlainString();
    org.omg.CORBA.INTERNAL var56 = var2.invalidCodeSetString((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "1"+ "'", var55.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var2.giopVersionError();
    java.util.logging.Logger var8 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.lang.Exception var11 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var12 = var9.setExceptionCalledBadType((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var13 = var9.giopVersionError();
    org.omg.CORBA.MARSHAL var14 = var2.unknownCodeset((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.io.PrintStream var1 = new java.io.PrintStream("hi!");

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.util.logging.Logger var4 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var4);
    java.lang.Exception var7 = new java.lang.Exception("hi!");
    java.math.BigDecimal var9 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var12 = java.math.BigDecimal.valueOf(10L, (-1));
    int var13 = var9.compareTo(var12);
    java.math.BigDecimal var16 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var18 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var21 = java.math.BigDecimal.valueOf(10L, (-1));
    int var22 = var18.compareTo(var21);
    java.math.BigDecimal var23 = var16.divideToIntegralValue(var21);
    int var24 = var23.intValue();
    java.math.BigDecimal var25 = var9.multiply(var23);
    int var26 = var23.intValueExact();
    org.omg.CORBA.BAD_PARAM var27 = var5.errorInSettingDynamicStubFactoryFactory((java.lang.Throwable)var7, (java.lang.Object)var26);
    org.omg.CORBA.BAD_PARAM var28 = var2.unableFindValueFactory((java.lang.Throwable)var27);
    java.util.logging.Logger var30 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var30);
    java.lang.Exception var33 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var34 = var31.setExceptionCalledBadType((java.lang.Throwable)var33);
    org.omg.CORBA.INTERNAL var35 = var31.noClientScClass();
    org.omg.CORBA.DATA_CONVERSION var36 = var31.badHexDigit();
    org.omg.CORBA.MARSHAL var37 = var2.badReservedLength((java.lang.Throwable)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var2 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var1);
    java.lang.Exception var4 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var5 = var2.setExceptionCalledBadType((java.lang.Throwable)var4);
    java.util.logging.Logger var7 = java.util.logging.Logger.getLogger("1");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Exception var10 = new java.lang.Exception("hi!");
    org.omg.CORBA.BAD_OPERATION var11 = var8.setExceptionCalledBadType((java.lang.Throwable)var10);
    org.omg.CORBA.BAD_OPERATION var12 = var2.setExceptionCalledNullArgs((java.lang.Throwable)var11);
    org.omg.CORBA.INTERNAL var13 = var2.typecodeNotSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.math.BigDecimal var1 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var4 = java.math.BigDecimal.valueOf(10L, (-1));
    int var5 = var1.compareTo(var4);
    java.math.BigDecimal var8 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var10 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var13 = java.math.BigDecimal.valueOf(10L, (-1));
    int var14 = var10.compareTo(var13);
    java.math.BigDecimal var15 = var8.divideToIntegralValue(var13);
    int var16 = var15.intValue();
    java.math.BigDecimal var17 = var1.multiply(var15);
    java.math.BigDecimal var20 = java.math.BigDecimal.valueOf(10L, (-1));
    java.math.BigDecimal var22 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var25 = java.math.BigDecimal.valueOf(10L, (-1));
    int var26 = var22.compareTo(var25);
    java.math.BigDecimal var27 = var20.divideToIntegralValue(var25);
    java.math.BigDecimal var28 = var17.divideToIntegralValue(var25);
    java.math.BigDecimal var30 = new java.math.BigDecimal((-1.0d));
    java.math.BigDecimal var33 = java.math.BigDecimal.valueOf(10L, (-1));
    int var34 = var30.compareTo(var33);
    java.math.BigDecimal var35 = var30.ulp();
    boolean var36 = var28.equals((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Thread var0 = new java.lang.Thread();

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1");
    var1.entering("1", "hi!", (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

}
