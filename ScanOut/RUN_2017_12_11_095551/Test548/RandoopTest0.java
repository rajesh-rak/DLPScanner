
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    boolean var1 = sun.net.util.IPAddressUtil.isIPv6LiteralAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    byte[] var0 = new byte[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = new java.lang.String(var0, 0, (-1), "hi!");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence)"1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "100.0"+ "'", var1.equals("100.0"));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.net.URL[] var1 = sun.misc.URLClassPath.pathToURLs("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = new java.lang.String("a4 ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a4 "+ "'", var1.equals("a4 "));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.lang.String var1 = java.lang.String.valueOf('#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "#"+ "'", var1.equals("#"));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    byte[] var0 = new byte[] { };
    byte[] var1 = sun.net.util.IPAddressUtil.convertFromIPv4MappedAddress(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("1.0");
    java.util.logging.Logger var3 = java.util.logging.Logger.getLogger("1.0");
    var1.setParent(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("#");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence)"1.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = java.lang.String.valueOf((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1"+ "'", var1.equals("-1"));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.lang.String var0 = new java.lang.String();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + ""+ "'", var0.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.MARSHAL var4 = var3.errorInvokingHelperWrite();
    org.omg.CORBA.BAD_PARAM var5 = var3.acceptorsAndLegacySocketFactoryAtSameTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var7 = var3.errorUnmarshalingUserexc();
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    var8.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    var12.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.MARSHAL var16 = var15.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var18 = var11.badContactInfoListFactory((java.lang.Throwable)var16, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var19 = var3.btcResultMoreThanOneChar((java.lang.Throwable)var18);
    org.omg.CORBA.BAD_INV_ORDER var20 = var3.setResultCalledNullArgs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    org.omg.CORBA.MARSHAL var4 = var3.errorInvokingHelperWrite();
    org.omg.CORBA.BAD_INV_ORDER var5 = var3.argumentsNotCalled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var7 = var3.errorUnmarshalingUserexc();
    org.omg.CORBA.INTERNAL var8 = var3.invalidCodeSetNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    var7.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    java.lang.Object var11 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var13 = var10.unexpectedEnclosingValuetype(var11, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var14 = var10.errorUnmarshalingUserexc();
    java.util.logging.Logger var15 = java.util.logging.Logger.getGlobal();
    var15.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var15);
    java.util.logging.Logger var19 = java.util.logging.Logger.getGlobal();
    var19.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var19);
    org.omg.CORBA.MARSHAL var23 = var22.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var25 = var18.badContactInfoListFactory((java.lang.Throwable)var23, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var26 = var10.btcResultMoreThanOneChar((java.lang.Throwable)var25);
    org.omg.CORBA.BAD_OPERATION var27 = var3.insertObjectFailed((java.lang.Throwable)var26);
    org.omg.CORBA.MARSHAL var28 = var3.characterOutofrange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    var7.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    org.omg.CORBA.MARSHAL var11 = var10.errorInvokingHelperWrite();
    org.omg.CORBA.INTERNAL var12 = var3.badReplystatus((java.lang.Throwable)var11);
    java.util.logging.Logger var13 = java.util.logging.Logger.getGlobal();
    var13.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var13);
    java.lang.Object var17 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var19 = var16.unexpectedEnclosingValuetype(var17, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var20 = var16.errorUnmarshalingUserexc();
    java.util.logging.Logger var21 = java.util.logging.Logger.getGlobal();
    var21.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var21);
    java.util.logging.Logger var25 = java.util.logging.Logger.getGlobal();
    var25.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var25);
    org.omg.CORBA.MARSHAL var29 = var28.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var31 = var24.badContactInfoListFactory((java.lang.Throwable)var29, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var32 = var16.btcResultMoreThanOneChar((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_OPERATION var33 = var16.getDelegateWrongPolicy();
    java.util.logging.Logger var34 = java.util.logging.Logger.getGlobal();
    var34.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var34);
    java.lang.Object var38 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var40 = var37.unexpectedEnclosingValuetype(var38, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var41 = var37.errorUnmarshalingUserexc();
    org.omg.CORBA.MARSHAL var42 = var16.unionDiscriminatorError((java.lang.Throwable)var41);
    org.omg.CORBA.BAD_PARAM var43 = var3.socketFactoryAndContactInfoListAtSameTime((java.lang.Throwable)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var7 = var3.errorUnmarshalingUserexc();
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    var8.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    var12.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.MARSHAL var16 = var15.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var18 = var11.badContactInfoListFactory((java.lang.Throwable)var16, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var19 = var3.btcResultMoreThanOneChar((java.lang.Throwable)var18);
    org.omg.CORBA.COMM_FAILURE var21 = var3.selectionKeyInvalid((java.lang.Object)(short)1);
    org.omg.CORBA.INTERNAL var22 = var3.nonExistentOrbid();
    java.util.logging.Logger var23 = java.util.logging.Logger.getGlobal();
    var23.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var23);
    java.util.logging.Logger var27 = java.util.logging.Logger.getGlobal();
    var27.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var27);
    org.omg.CORBA.MARSHAL var31 = var30.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var33 = var26.badContactInfoListFactory((java.lang.Throwable)var31, (java.lang.Object)1);
    java.util.logging.Logger var34 = java.util.logging.Logger.getGlobal();
    var34.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var34);
    java.lang.Object var38 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var40 = var37.unexpectedEnclosingValuetype(var38, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var41 = var37.errorUnmarshalingUserexc();
    java.util.logging.Logger var42 = java.util.logging.Logger.getGlobal();
    var42.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var42);
    java.util.logging.Logger var46 = java.util.logging.Logger.getGlobal();
    var46.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var46);
    org.omg.CORBA.MARSHAL var50 = var49.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var52 = var45.badContactInfoListFactory((java.lang.Throwable)var50, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var53 = var37.btcResultMoreThanOneChar((java.lang.Throwable)var52);
    org.omg.CORBA.INTERNAL var55 = var26.invalidBtcConverterName((java.lang.Throwable)var53, (java.lang.Object)0);
    org.omg.CORBA.BAD_TYPECODE var56 = var3.unresolvedRecursiveTypecode((java.lang.Throwable)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var7 = var3.errorUnmarshalingUserexc();
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    var8.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    org.omg.CORBA.MARSHAL var12 = var11.errorInvokingHelperWrite();
    org.omg.CORBA.MARSHAL var13 = var3.badToaOaid((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    java.util.logging.Logger var7 = java.util.logging.Logger.getGlobal();
    var7.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var7);
    org.omg.CORBA.MARSHAL var11 = var10.errorInvokingHelperWrite();
    org.omg.CORBA.INTERNAL var12 = var3.badReplystatus((java.lang.Throwable)var11);
    org.omg.CORBA.BAD_PARAM var13 = var3.acceptorsAndLegacySocketFactoryAtSameTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var0);
    java.lang.Object var4 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var6 = var3.unexpectedEnclosingValuetype(var4, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var7 = var3.errorUnmarshalingUserexc();
    java.util.logging.Logger var8 = java.util.logging.Logger.getGlobal();
    var8.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var8);
    java.util.logging.Logger var12 = java.util.logging.Logger.getGlobal();
    var12.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var12);
    org.omg.CORBA.MARSHAL var16 = var15.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var18 = var11.badContactInfoListFactory((java.lang.Throwable)var16, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var19 = var3.btcResultMoreThanOneChar((java.lang.Throwable)var18);
    char[] var23 = new char[] { 'a', '4', ' '};
    java.lang.String var24 = java.lang.String.valueOf(var23);
    org.omg.CORBA.DATA_CONVERSION var25 = var3.illegalIorToSocketInfoType((java.lang.Object)var23);
    java.util.logging.Logger var26 = java.util.logging.Logger.getGlobal();
    var26.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var26);
    java.lang.Object var30 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var32 = var29.unexpectedEnclosingValuetype(var30, (java.lang.Object)'a');
    java.util.logging.Logger var33 = java.util.logging.Logger.getGlobal();
    var33.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var33);
    org.omg.CORBA.MARSHAL var37 = var36.errorInvokingHelperWrite();
    org.omg.CORBA.INTERNAL var38 = var29.badReplystatus((java.lang.Throwable)var37);
    org.omg.CORBA.INITIALIZE var39 = var3.persistentServerportNotSet((java.lang.Throwable)var38);
    org.omg.CORBA.INTERNAL var40 = var3.getSystemExReturnedNull();
    java.util.logging.Logger var41 = java.util.logging.Logger.getGlobal();
    var41.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var41);
    java.lang.Object var45 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var47 = var44.unexpectedEnclosingValuetype(var45, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var48 = var44.errorUnmarshalingUserexc();
    org.omg.CORBA.INTERNAL var49 = var44.noClientScClass();
    java.util.logging.Logger var50 = java.util.logging.Logger.getGlobal();
    var50.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var50);
    java.lang.Object var54 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var56 = var53.unexpectedEnclosingValuetype(var54, (java.lang.Object)'a');
    org.omg.CORBA.INTERNAL var57 = var53.errorUnmarshalingUserexc();
    java.util.logging.Logger var58 = java.util.logging.Logger.getGlobal();
    var58.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var58);
    java.util.logging.Logger var62 = java.util.logging.Logger.getGlobal();
    var62.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var62);
    org.omg.CORBA.MARSHAL var66 = var65.errorInvokingHelperWrite();
    org.omg.CORBA.DATA_CONVERSION var68 = var61.badContactInfoListFactory((java.lang.Throwable)var66, (java.lang.Object)1);
    org.omg.CORBA.DATA_CONVERSION var69 = var53.btcResultMoreThanOneChar((java.lang.Throwable)var68);
    org.omg.CORBA.BAD_PARAM var70 = var44.persistentServerInitError((java.lang.Throwable)var69);
    java.util.logging.Logger var72 = java.util.logging.Logger.getLogger("1.0");
    java.util.logging.Logger var73 = java.util.logging.Logger.getGlobal();
    var73.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var73);
    java.lang.Object var77 = new java.lang.Object();
    org.omg.CORBA.MARSHAL var79 = var76.unexpectedEnclosingValuetype(var77, (java.lang.Object)'a');
    java.util.logging.Logger var80 = java.util.logging.Logger.getGlobal();
    var80.setUseParentHandlers(false);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = new com.sun.corba.se.impl.logging.ORBUtilSystemException(var80);
    org.omg.CORBA.MARSHAL var84 = var83.errorInvokingHelperWrite();
    org.omg.CORBA.INTERNAL var85 = var76.badReplystatus((java.lang.Throwable)var84);
    org.omg.CORBA.BAD_OPERATION var86 = var3.extractWrongTypeList((java.lang.Throwable)var69, (java.lang.Object)"1.0", (java.lang.Object)var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "a4 "+ "'", var24.equals("a4 "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    byte[] var3 = new byte[] { (byte)10, (byte)10, (byte)10};
    java.lang.String var7 = new java.lang.String(var3, 1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\u010A"+ "'", var7.equals("\u010A"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("a4 ");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

}
