
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.String var1 = new java.lang.String("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "{}"+ "'", var2.equals("{}"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    java.lang.Object var3 = var1.remove((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.Hashtable var1 = new java.util.Hashtable(0);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    byte[] var1 = sun.net.util.IPAddressUtil.textToNumericFormatV4("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    char[] var1 = new char[] { 'a'};
    java.lang.String var2 = java.lang.String.valueOf(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "a"+ "'", var2.equals("a"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1.0"+ "'", var1.equals("1.0"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.INTERNAL var3 = var1.unexpectedNonDirectByteBufferWithChannelSocket();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
      java.util.logging.Logger var1 = java.util.logging.Logger.getAnonymousLogger("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var18 = var17.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var19 = var15.unresolvedRecursiveTypecode((java.lang.Throwable)var18);
    java.util.Locale[] var20 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var22 = var7.couldNotCreateArray((java.lang.Throwable)var13, (java.lang.Object)var18, (java.lang.Object)var20, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var23 = var1.badTypecodeForCustomValue((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var24 = var1.noPoa();
    org.omg.CORBA.INTERNAL var25 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var28 = var27.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.INTERNAL var30 = var1.invalidCodeSetString((java.lang.Throwable)var28, (java.lang.Object)1.0f);
    org.omg.CORBA.UNKNOWN var31 = var1.unknownExceptionInDispatch();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var6 = var5.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var7 = var3.unresolvedRecursiveTypecode((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    org.omg.CORBA.INTERNAL var14 = var9.cancelNotSupported();
    org.omg.CORBA.INTERNAL var15 = var3.unexpectedDiiException((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var20 = var19.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var21 = var17.unresolvedRecursiveTypecode((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var28 = var27.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var29 = var25.unresolvedRecursiveTypecode((java.lang.Throwable)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var34 = var33.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var35 = var31.unresolvedRecursiveTypecode((java.lang.Throwable)var34);
    java.util.Locale[] var36 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var38 = var23.couldNotCreateArray((java.lang.Throwable)var29, (java.lang.Object)var34, (java.lang.Object)var36, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var39 = var17.badTypecodeForCustomValue((java.lang.Throwable)var38);
    org.omg.CORBA.INTERNAL var40 = var17.noPoa();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var47 = var46.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var48 = var44.unresolvedRecursiveTypecode((java.lang.Throwable)var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var53 = var52.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var54 = var50.unresolvedRecursiveTypecode((java.lang.Throwable)var53);
    java.util.Locale[] var55 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var57 = var42.couldNotCreateArray((java.lang.Throwable)var48, (java.lang.Object)var53, (java.lang.Object)var55, (java.lang.Object)1.0d);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var62 = var61.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var63 = var59.unresolvedRecursiveTypecode((java.lang.Throwable)var62);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var68 = var67.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var69 = var65.unresolvedRecursiveTypecode((java.lang.Throwable)var68);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var75 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var76 = var75.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var77 = var73.unresolvedRecursiveTypecode((java.lang.Throwable)var76);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var79 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var82 = var81.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var83 = var79.unresolvedRecursiveTypecode((java.lang.Throwable)var82);
    java.util.Locale[] var84 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var86 = var71.couldNotCreateArray((java.lang.Throwable)var77, (java.lang.Object)var82, (java.lang.Object)var84, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var87 = var65.badTypecodeForCustomValue((java.lang.Throwable)var86);
    org.omg.CORBA.COMM_FAILURE var88 = var17.securityExceptionInAccept((java.lang.Throwable)var57, (java.lang.Object)var62, (java.lang.Object)var87);
    org.omg.CORBA.MARSHAL var89 = var1.couldNotInvokeHelperReadMethod((java.lang.Throwable)var15, (java.lang.Object)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var13);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cancelNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var11 = var10.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var12 = var8.unresolvedRecursiveTypecode((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var17 = var16.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var18 = var14.unresolvedRecursiveTypecode((java.lang.Throwable)var17);
    org.omg.CORBA.INTERNAL var19 = var14.cancelNotSupported();
    org.omg.CORBA.INTERNAL var20 = var8.unexpectedDiiException((java.lang.Throwable)var19);
    java.util.Hashtable var22 = new java.util.Hashtable(0);
    org.omg.CORBA.BAD_OPERATION var23 = var1.classNotFound3((java.lang.Throwable)var19, (java.lang.Object)var22);
    org.omg.CORBA.COMM_FAILURE var24 = var1.connectionAbort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var18 = var17.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var19 = var15.unresolvedRecursiveTypecode((java.lang.Throwable)var18);
    java.util.Locale[] var20 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var22 = var7.couldNotCreateArray((java.lang.Throwable)var13, (java.lang.Object)var18, (java.lang.Object)var20, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var23 = var1.badTypecodeForCustomValue((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var24 = var1.noPoa();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var31 = var30.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var32 = var28.unresolvedRecursiveTypecode((java.lang.Throwable)var31);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var37 = var36.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var38 = var34.unresolvedRecursiveTypecode((java.lang.Throwable)var37);
    java.util.Locale[] var39 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var41 = var26.couldNotCreateArray((java.lang.Throwable)var32, (java.lang.Object)var37, (java.lang.Object)var39, (java.lang.Object)1.0d);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var46 = var45.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var47 = var43.unresolvedRecursiveTypecode((java.lang.Throwable)var46);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var52 = var51.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var53 = var49.unresolvedRecursiveTypecode((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var60 = var59.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var61 = var57.unresolvedRecursiveTypecode((java.lang.Throwable)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var66 = var65.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var67 = var63.unresolvedRecursiveTypecode((java.lang.Throwable)var66);
    java.util.Locale[] var68 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var70 = var55.couldNotCreateArray((java.lang.Throwable)var61, (java.lang.Object)var66, (java.lang.Object)var68, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var71 = var49.badTypecodeForCustomValue((java.lang.Throwable)var70);
    org.omg.CORBA.COMM_FAILURE var72 = var1.securityExceptionInAccept((java.lang.Throwable)var41, (java.lang.Object)var46, (java.lang.Object)var71);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var77 = var76.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var78 = var74.unresolvedRecursiveTypecode((java.lang.Throwable)var77);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var80 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var82 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var84 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var85 = var84.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var86 = var82.unresolvedRecursiveTypecode((java.lang.Throwable)var85);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var88 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var90 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var91 = var90.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var92 = var88.unresolvedRecursiveTypecode((java.lang.Throwable)var91);
    java.util.Locale[] var93 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var95 = var80.couldNotCreateArray((java.lang.Throwable)var86, (java.lang.Object)var91, (java.lang.Object)var93, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var96 = var74.badTypecodeForCustomValue((java.lang.Throwable)var95);
    org.omg.CORBA.COMM_FAILURE var99 = var1.connectFailure((java.lang.Object)var96, (java.lang.Object)(byte)0, (java.lang.Object)(byte)10);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var6 = var5.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var7 = var3.unresolvedRecursiveTypecode((java.lang.Throwable)var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    java.util.Locale[] var14 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var16 = var1.couldNotCreateArray((java.lang.Throwable)var7, (java.lang.Object)var12, (java.lang.Object)var14, (java.lang.Object)1.0d);
    org.omg.CORBA.INTERNAL var19 = var1.threadGroupHasActiveThreadsInClose((java.lang.Object)0, (java.lang.Object)0);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var24 = var23.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var25 = var21.unresolvedRecursiveTypecode((java.lang.Throwable)var24);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var32 = var31.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var33 = var29.unresolvedRecursiveTypecode((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var38 = var37.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var39 = var35.unresolvedRecursiveTypecode((java.lang.Throwable)var38);
    java.util.Locale[] var40 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var42 = var27.couldNotCreateArray((java.lang.Throwable)var33, (java.lang.Object)var38, (java.lang.Object)var40, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var43 = var21.badTypecodeForCustomValue((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var48 = var47.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var49 = var45.unresolvedRecursiveTypecode((java.lang.Throwable)var48);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var56 = var55.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var57 = var53.unresolvedRecursiveTypecode((java.lang.Throwable)var56);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var62 = var61.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var63 = var59.unresolvedRecursiveTypecode((java.lang.Throwable)var62);
    java.util.Locale[] var64 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var66 = var51.couldNotCreateArray((java.lang.Throwable)var57, (java.lang.Object)var62, (java.lang.Object)var64, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var67 = var45.badTypecodeForCustomValue((java.lang.Throwable)var66);
    org.omg.CORBA.DATA_CONVERSION var69 = var21.badCustomSocketFactory((java.lang.Throwable)var66, (java.lang.Object)(short)10);
    org.omg.CORBA.BAD_OPERATION var70 = var1.fixedNotMatch((java.lang.Throwable)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cancelNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var11 = var10.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var12 = var8.unresolvedRecursiveTypecode((java.lang.Throwable)var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var19 = var18.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var20 = var16.unresolvedRecursiveTypecode((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var25 = var24.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var26 = var22.unresolvedRecursiveTypecode((java.lang.Throwable)var25);
    java.util.Locale[] var27 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var29 = var14.couldNotCreateArray((java.lang.Throwable)var20, (java.lang.Object)var25, (java.lang.Object)var27, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var30 = var8.badTypecodeForCustomValue((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var8.noPoa();
    org.omg.CORBA.INTERNAL var32 = var8.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var35 = var34.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.INTERNAL var37 = var8.invalidCodeSetString((java.lang.Throwable)var35, (java.lang.Object)1.0f);
    org.omg.CORBA.BAD_TYPECODE var38 = var1.badRemoteTypecode((java.lang.Throwable)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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
    assertNotNull(var38);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cancelNotSupported();
    org.omg.CORBA.INTERNAL var7 = var1.badSystemExceptionInLocateReply();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var20 = var19.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var21 = var17.unresolvedRecursiveTypecode((java.lang.Throwable)var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var26 = var25.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var27 = var23.unresolvedRecursiveTypecode((java.lang.Throwable)var26);
    java.util.Locale[] var28 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var30 = var15.couldNotCreateArray((java.lang.Throwable)var21, (java.lang.Object)var26, (java.lang.Object)var28, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var31 = var9.badTypecodeForCustomValue((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var9.noPoa();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var37 = var36.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var38 = var34.unresolvedRecursiveTypecode((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var45 = var44.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var46 = var42.unresolvedRecursiveTypecode((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var51 = var50.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var52 = var48.unresolvedRecursiveTypecode((java.lang.Throwable)var51);
    java.util.Locale[] var53 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var55 = var40.couldNotCreateArray((java.lang.Throwable)var46, (java.lang.Object)var51, (java.lang.Object)var53, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var56 = var34.badTypecodeForCustomValue((java.lang.Throwable)var55);
    org.omg.CORBA.MARSHAL var58 = var9.badInsertobjParam((java.lang.Throwable)var56, (java.lang.Object)"");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var63 = var62.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var64 = var60.unresolvedRecursiveTypecode((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var60.cancelNotSupported();
    org.omg.CORBA.COMM_FAILURE var66 = var60.invokeError();
    org.omg.CORBA.DATA_CONVERSION var67 = var1.fragmentSizeMinimum((java.lang.Object)var56, (java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var13);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var2 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var7 = var6.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var8 = var4.unresolvedRecursiveTypecode((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var15 = var14.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var16 = var12.unresolvedRecursiveTypecode((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var21 = var20.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var22 = var18.unresolvedRecursiveTypecode((java.lang.Throwable)var21);
    java.util.Locale[] var23 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var25 = var10.couldNotCreateArray((java.lang.Throwable)var16, (java.lang.Object)var21, (java.lang.Object)var23, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var26 = var4.badTypecodeForCustomValue((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var4.noPoa();
    org.omg.CORBA.INTERNAL var28 = var4.fragmentationDisallowed();
    org.omg.CORBA.NO_IMPLEMENT var29 = var1.contextNotImplemented((java.lang.Throwable)var28);
    org.omg.CORBA.MARSHAL var30 = var1.recursiveTypecodeError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.regex.Pattern var1 = java.util.regex.Pattern.compile("");
    java.lang.String var2 = var1.toString();
    java.lang.String[] var5 = var1.split((java.lang.CharSequence)"a", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var6 = var5.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var7 = var3.unresolvedRecursiveTypecode((java.lang.Throwable)var6);
    org.omg.CORBA.INTERNAL var8 = var3.cancelNotSupported();
    org.omg.CORBA.INTERNAL var9 = var3.badSystemExceptionInLocateReply();
    org.omg.CORBA.MARSHAL var10 = var1.unexpectedUnionDefault((java.lang.Throwable)var9);
    org.omg.CORBA.INTERNAL var11 = var1.badkindCannotOccur();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var6 = var5.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var7 = var3.unresolvedRecursiveTypecode((java.lang.Throwable)var6);
    org.omg.CORBA.INTERNAL var8 = var3.cancelNotSupported();
    org.omg.CORBA.INTERNAL var9 = var3.badSystemExceptionInLocateReply();
    org.omg.CORBA.MARSHAL var10 = var1.unexpectedUnionDefault((java.lang.Throwable)var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var15 = var14.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var16 = var12.unresolvedRecursiveTypecode((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var23 = var22.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var24 = var20.unresolvedRecursiveTypecode((java.lang.Throwable)var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var29 = var28.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var30 = var26.unresolvedRecursiveTypecode((java.lang.Throwable)var29);
    java.util.Locale[] var31 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var33 = var18.couldNotCreateArray((java.lang.Throwable)var24, (java.lang.Object)var29, (java.lang.Object)var31, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var34 = var12.badTypecodeForCustomValue((java.lang.Throwable)var33);
    org.omg.CORBA.INTERNAL var35 = var12.noPoa();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var42 = var41.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var43 = var39.unresolvedRecursiveTypecode((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var48 = var47.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var49 = var45.unresolvedRecursiveTypecode((java.lang.Throwable)var48);
    java.util.Locale[] var50 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var52 = var37.couldNotCreateArray((java.lang.Throwable)var43, (java.lang.Object)var48, (java.lang.Object)var50, (java.lang.Object)1.0d);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var54 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var57 = var56.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var58 = var54.unresolvedRecursiveTypecode((java.lang.Throwable)var57);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var63 = var62.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var64 = var60.unresolvedRecursiveTypecode((java.lang.Throwable)var63);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var71 = var70.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var72 = var68.unresolvedRecursiveTypecode((java.lang.Throwable)var71);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var76 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var77 = var76.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var78 = var74.unresolvedRecursiveTypecode((java.lang.Throwable)var77);
    java.util.Locale[] var79 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var81 = var66.couldNotCreateArray((java.lang.Throwable)var72, (java.lang.Object)var77, (java.lang.Object)var79, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var82 = var60.badTypecodeForCustomValue((java.lang.Throwable)var81);
    org.omg.CORBA.COMM_FAILURE var83 = var12.securityExceptionInAccept((java.lang.Throwable)var52, (java.lang.Object)var57, (java.lang.Object)var82);
    org.omg.CORBA.BAD_PARAM var84 = var1.localObjectNotAllowed((java.lang.Throwable)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var18 = var17.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var19 = var15.unresolvedRecursiveTypecode((java.lang.Throwable)var18);
    java.util.Locale[] var20 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var22 = var7.couldNotCreateArray((java.lang.Throwable)var13, (java.lang.Object)var18, (java.lang.Object)var20, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var23 = var1.badTypecodeForCustomValue((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var24 = var1.noPoa();
    org.omg.CORBA.INTERNAL var25 = var1.fragmentationDisallowed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var28 = var27.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.INTERNAL var30 = var1.invalidCodeSetString((java.lang.Throwable)var28, (java.lang.Object)1.0f);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var35 = var34.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var36 = var32.unresolvedRecursiveTypecode((java.lang.Throwable)var35);
    org.omg.CORBA.INTERNAL var37 = var32.cancelNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var42 = var41.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var43 = var39.unresolvedRecursiveTypecode((java.lang.Throwable)var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var48 = var47.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var49 = var45.unresolvedRecursiveTypecode((java.lang.Throwable)var48);
    org.omg.CORBA.INTERNAL var50 = var45.cancelNotSupported();
    org.omg.CORBA.INTERNAL var51 = var39.unexpectedDiiException((java.lang.Throwable)var50);
    java.util.Hashtable var53 = new java.util.Hashtable(0);
    org.omg.CORBA.BAD_OPERATION var54 = var32.classNotFound3((java.lang.Throwable)var50, (java.lang.Object)var53);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var60 = var59.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var61 = var57.unresolvedRecursiveTypecode((java.lang.Throwable)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var67 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var68 = var67.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var69 = var65.unresolvedRecursiveTypecode((java.lang.Throwable)var68);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var71 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var74 = var73.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var75 = var71.unresolvedRecursiveTypecode((java.lang.Throwable)var74);
    java.util.Locale[] var76 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var78 = var63.couldNotCreateArray((java.lang.Throwable)var69, (java.lang.Object)var74, (java.lang.Object)var76, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var79 = var57.badTypecodeForCustomValue((java.lang.Throwable)var78);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var83 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var85 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var86 = var85.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var87 = var83.unresolvedRecursiveTypecode((java.lang.Throwable)var86);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var89 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var91 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var92 = var91.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var93 = var89.unresolvedRecursiveTypecode((java.lang.Throwable)var92);
    java.util.Locale[] var94 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var96 = var81.couldNotCreateArray((java.lang.Throwable)var87, (java.lang.Object)var92, (java.lang.Object)var94, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var97 = var57.badKind((java.lang.Throwable)var96);
    org.omg.CORBA.DATA_CONVERSION var98 = var1.badSequenceBounds((java.lang.Throwable)var54, (java.lang.Object)"a", (java.lang.Object)var57);
    org.omg.CORBA.MARSHAL var99 = var1.invalidObjectKey();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cancelNotSupported();
    org.omg.CORBA.COMM_FAILURE var7 = var1.invokeError();
    org.omg.CORBA.INTERNAL var8 = var1.duplicateOrbVersionServiceContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    org.omg.CORBA.INTERNAL var6 = var1.cancelNotSupported();
    org.omg.CORBA.COMM_FAILURE var7 = var1.invokeError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    org.omg.CORBA.INTERNAL var14 = var9.cancelNotSupported();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var19 = var18.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var20 = var16.unresolvedRecursiveTypecode((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var25 = var24.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var26 = var22.unresolvedRecursiveTypecode((java.lang.Throwable)var25);
    org.omg.CORBA.INTERNAL var27 = var22.cancelNotSupported();
    org.omg.CORBA.INTERNAL var28 = var16.unexpectedDiiException((java.lang.Throwable)var27);
    java.util.Hashtable var30 = new java.util.Hashtable(0);
    org.omg.CORBA.BAD_OPERATION var31 = var9.classNotFound3((java.lang.Throwable)var27, (java.lang.Object)var30);
    org.omg.CORBA.INTERNAL var32 = var9.fragmentationDisallowed();
    org.omg.CORBA.INTERNAL var33 = var1.statementNotReachable3((java.lang.Throwable)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var4 = var3.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var5 = var1.unresolvedRecursiveTypecode((java.lang.Throwable)var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var12 = var11.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var13 = var9.unresolvedRecursiveTypecode((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("{}");
    org.omg.CORBA.INTERNAL var18 = var17.orbTargetAddrPreferenceInExtractObjectkeyInvalid();
    org.omg.CORBA.BAD_TYPECODE var19 = var15.unresolvedRecursiveTypecode((java.lang.Throwable)var18);
    java.util.Locale[] var20 = sun.util.LocaleServiceProviderPool.getAllAvailableLocales();
    org.omg.CORBA.BAD_PARAM var22 = var7.couldNotCreateArray((java.lang.Throwable)var13, (java.lang.Object)var18, (java.lang.Object)var20, (java.lang.Object)1.0d);
    org.omg.CORBA.MARSHAL var23 = var1.badTypecodeForCustomValue((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var24 = var1.nonExistentOrbid();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

}
