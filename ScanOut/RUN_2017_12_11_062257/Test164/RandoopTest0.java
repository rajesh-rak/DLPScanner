
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.lang.Object[] var2 = new java.lang.Object[] { 0};
    java.lang.String var3 = java.lang.String.format("hi!", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.jar.Manifest var0 = new java.util.jar.Manifest();
    var0.clear();

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setGroupingSeparator('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    char[] var5 = new char[] { 'a'};
    java.lang.String var6 = java.lang.String.copyValueOf(var5);
    org.omg.CORBA.COMM_FAILURE var7 = var1.createListenerFailed((java.lang.Object)var5);
    org.omg.CORBA.BAD_PARAM var8 = var1.badOrbForServant();
    org.omg.CORBA.INTERNAL var9 = var1.btcConverterFailure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var29 = var27.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedDiiException((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var19.couldNotFindClass((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var1.illegalSubcontractId((java.lang.Throwable)var17, (java.lang.Object)var19);
    org.omg.CORBA.INTERNAL var33 = var1.statementNotReachable6();
    org.omg.CORBA.BAD_OPERATION var34 = var1.isLocalRequiresStub();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.util.regex.Pattern.quote("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "\\Qhi!\\E"+ "'", var1.equals("\\Qhi!\\E"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedDiiException((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var16 = var14.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var21 = var14.unexpectedDiiException((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var10.couldNotFindClass((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var26 = var24.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var30 = var28.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var34 = var32.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var38 = var36.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var39 = var32.unexpectedDiiException((java.lang.Throwable)var38);
    org.omg.CORBA.MARSHAL var40 = var28.couldNotFindClass((java.lang.Throwable)var39);
    org.omg.CORBA.INTERNAL var41 = var10.illegalSubcontractId((java.lang.Throwable)var26, (java.lang.Object)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var45 = var43.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var49 = var47.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var53 = var51.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var54 = var47.unexpectedDiiException((java.lang.Throwable)var53);
    org.omg.CORBA.MARSHAL var55 = var43.couldNotFindClass((java.lang.Throwable)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var59 = var57.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var63 = var61.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var65 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var67 = var65.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var71 = var69.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var72 = var65.unexpectedDiiException((java.lang.Throwable)var71);
    org.omg.CORBA.MARSHAL var73 = var61.couldNotFindClass((java.lang.Throwable)var72);
    org.omg.CORBA.INTERNAL var74 = var43.illegalSubcontractId((java.lang.Throwable)var59, (java.lang.Object)var61);
    org.omg.CORBA.MARSHAL var76 = var10.couldNotInstantiateHelper((java.lang.Throwable)var59, (java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var77 = var1.connectRequiresStub((java.lang.Throwable)var59);
    org.omg.CORBA.UNKNOWN var78 = var1.unknownServerError();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setInternationalCurrencySymbol("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("\\Qhi!\\E", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    char[] var5 = new char[] { 'a'};
    java.lang.String var6 = java.lang.String.copyValueOf(var5);
    org.omg.CORBA.COMM_FAILURE var7 = var1.createListenerFailed((java.lang.Object)var5);
    org.omg.CORBA.BAD_PARAM var8 = var1.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var16 = var14.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var21 = var14.unexpectedDiiException((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var10.couldNotFindClass((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.stubCreateError((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var27 = var25.badInsertobjParam((java.lang.Object)1L);
    char[] var29 = new char[] { 'a'};
    java.lang.String var30 = java.lang.String.copyValueOf(var29);
    org.omg.CORBA.COMM_FAILURE var31 = var25.createListenerFailed((java.lang.Object)var29);
    org.omg.CORBA.BAD_PARAM var32 = var25.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var36 = var34.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var40 = var38.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var44 = var42.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var45 = var38.unexpectedDiiException((java.lang.Throwable)var44);
    org.omg.CORBA.MARSHAL var46 = var34.couldNotFindClass((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var47 = var25.stubCreateError((java.lang.Throwable)var46);
    org.omg.CORBA.OBJECT_NOT_EXIST var48 = var25.badServerId();
    org.omg.CORBA.INTERNAL var49 = var25.applicationExceptionInSpecialMethod();
    org.omg.CORBA.BAD_PARAM var50 = var1.objrefFromForeignOrb((java.lang.Throwable)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "a"+ "'", var30.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.NO_IMPLEMENT var4 = var1.contextNotImplemented();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var8 = var6.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var13 = var6.unexpectedDiiException((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var26 = var19.unexpectedDiiException((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var27 = var15.couldNotFindClass((java.lang.Throwable)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var31 = var29.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var35 = var33.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var39 = var37.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var43 = var41.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var44 = var37.unexpectedDiiException((java.lang.Throwable)var43);
    org.omg.CORBA.MARSHAL var45 = var33.couldNotFindClass((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var46 = var15.illegalSubcontractId((java.lang.Throwable)var31, (java.lang.Object)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var50 = var48.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var54 = var52.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var56.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var59 = var52.unexpectedDiiException((java.lang.Throwable)var58);
    org.omg.CORBA.MARSHAL var60 = var48.couldNotFindClass((java.lang.Throwable)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var64 = var62.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var68 = var66.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var72 = var70.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var76 = var74.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var77 = var70.unexpectedDiiException((java.lang.Throwable)var76);
    org.omg.CORBA.MARSHAL var78 = var66.couldNotFindClass((java.lang.Throwable)var77);
    org.omg.CORBA.INTERNAL var79 = var48.illegalSubcontractId((java.lang.Throwable)var64, (java.lang.Object)var66);
    org.omg.CORBA.MARSHAL var81 = var15.couldNotInstantiateHelper((java.lang.Throwable)var64, (java.lang.Object)(-1.0d));
    org.omg.CORBA.BAD_OPERATION var82 = var6.connectRequiresStub((java.lang.Throwable)var64);
    org.omg.CORBA.INTERNAL var83 = var1.invalidCtbConverterName((java.lang.Object)var64);
    org.omg.CORBA.MARSHAL var86 = var1.readObjectLoadClassFailure((java.lang.Object)10.0f, (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertNotNull(var86);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    char[] var5 = new char[] { 'a'};
    java.lang.String var6 = java.lang.String.copyValueOf(var5);
    org.omg.CORBA.COMM_FAILURE var7 = var1.createListenerFailed((java.lang.Object)var5);
    org.omg.CORBA.BAD_PARAM var8 = var1.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var16 = var14.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var21 = var14.unexpectedDiiException((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var10.couldNotFindClass((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.stubCreateError((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var27 = var25.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var31 = var29.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var35 = var33.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var36 = var29.unexpectedDiiException((java.lang.Throwable)var35);
    org.omg.CORBA.MARSHAL var37 = var25.couldNotFindClass((java.lang.Throwable)var36);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var41 = var39.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var45 = var43.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var49 = var47.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var53 = var51.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var54 = var47.unexpectedDiiException((java.lang.Throwable)var53);
    org.omg.CORBA.MARSHAL var55 = var43.couldNotFindClass((java.lang.Throwable)var54);
    org.omg.CORBA.INTERNAL var56 = var25.illegalSubcontractId((java.lang.Throwable)var41, (java.lang.Object)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var60 = var58.badInsertobjParam((java.lang.Object)1L);
    char[] var62 = new char[] { 'a'};
    java.lang.String var63 = java.lang.String.copyValueOf(var62);
    org.omg.CORBA.COMM_FAILURE var64 = var58.createListenerFailed((java.lang.Object)var62);
    org.omg.CORBA.BAD_PARAM var65 = var58.badOrbForServant();
    org.omg.CORBA.BAD_PARAM var66 = var25.localObjectNotAllowed((java.lang.Throwable)var65);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var70 = var68.badInsertobjParam((java.lang.Object)1L);
    char[] var72 = new char[] { 'a'};
    java.lang.String var73 = java.lang.String.copyValueOf(var72);
    org.omg.CORBA.COMM_FAILURE var74 = var68.createListenerFailed((java.lang.Object)var72);
    org.omg.CORBA.BAD_PARAM var75 = var68.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var79 = var77.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var81 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var83 = var81.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var85 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var87 = var85.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var88 = var81.unexpectedDiiException((java.lang.Throwable)var87);
    org.omg.CORBA.MARSHAL var89 = var77.couldNotFindClass((java.lang.Throwable)var88);
    org.omg.CORBA.MARSHAL var90 = var68.stubCreateError((java.lang.Throwable)var89);
    org.omg.CORBA.BAD_OPERATION var91 = var25.orbIdNotAvailable((java.lang.Throwable)var89);
    org.omg.CORBA.BAD_PARAM var92 = var1.nullObjectReference((java.lang.Throwable)var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertTrue("'" + var63 + "' != '" + "a"+ "'", var63.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "a"+ "'", var73.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.lang.String var1 = java.lang.String.valueOf(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.text.DateFormat var1 = java.text.DateFormat.getDateInstance(0);
    var1.setLenient(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    char[] var5 = new char[] { 'a'};
    java.lang.String var6 = java.lang.String.copyValueOf(var5);
    org.omg.CORBA.COMM_FAILURE var7 = var1.createListenerFailed((java.lang.Object)var5);
    org.omg.CORBA.BAD_PARAM var8 = var1.badOrbForServant();
    org.omg.CORBA.MARSHAL var9 = var1.iiopinputstreamGrow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var29 = var27.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedDiiException((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var19.couldNotFindClass((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var1.illegalSubcontractId((java.lang.Throwable)var17, (java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var36 = var34.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.NO_IMPLEMENT var37 = var34.contextNotImplemented();
    org.omg.CORBA.INTERNAL var38 = var19.duplicateIndirectionOffset((java.lang.Throwable)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var29 = var27.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedDiiException((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var19.couldNotFindClass((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var1.illegalSubcontractId((java.lang.Throwable)var17, (java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var36 = var34.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var40 = var38.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var44 = var42.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var45 = var38.unexpectedDiiException((java.lang.Throwable)var44);
    org.omg.CORBA.MARSHAL var46 = var34.couldNotFindClass((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var50 = var48.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var54 = var52.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var56.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var62 = var60.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var63 = var56.unexpectedDiiException((java.lang.Throwable)var62);
    org.omg.CORBA.MARSHAL var64 = var52.couldNotFindClass((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var34.illegalSubcontractId((java.lang.Throwable)var50, (java.lang.Object)var52);
    org.omg.CORBA.MARSHAL var67 = var1.couldNotInstantiateHelper((java.lang.Throwable)var50, (java.lang.Object)(-1.0d));
    org.omg.CORBA.NO_IMPLEMENT var68 = var1.genericNoImpl();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    char[] var5 = new char[] { 'a'};
    java.lang.String var6 = java.lang.String.copyValueOf(var5);
    org.omg.CORBA.COMM_FAILURE var7 = var1.createListenerFailed((java.lang.Object)var5);
    org.omg.CORBA.BAD_PARAM var8 = var1.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var16 = var14.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var21 = var14.unexpectedDiiException((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var10.couldNotFindClass((java.lang.Throwable)var21);
    org.omg.CORBA.MARSHAL var23 = var1.stubCreateError((java.lang.Throwable)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var27 = var25.badInsertobjParam((java.lang.Object)1L);
    char[] var29 = new char[] { 'a'};
    java.lang.String var30 = java.lang.String.copyValueOf(var29);
    org.omg.CORBA.COMM_FAILURE var31 = var25.createListenerFailed((java.lang.Object)var29);
    org.omg.CORBA.BAD_PARAM var32 = var25.badOrbForServant();
    org.omg.CORBA.MARSHAL var33 = var1.dsiResultException((java.lang.Throwable)var32);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var37 = var35.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var41 = var39.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var45 = var43.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var46 = var39.unexpectedDiiException((java.lang.Throwable)var45);
    org.omg.CORBA.MARSHAL var47 = var35.couldNotFindClass((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var48 = var1.errorUnmarshalingUserexc((java.lang.Throwable)var47);
    org.omg.CORBA.MARSHAL var49 = var1.characterOutofrange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "a"+ "'", var30.equals("a"));
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.DATA_CONVERSION var2 = var1.badCodesetsFromClient();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var6 = var4.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var10 = var8.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var14 = var12.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var15 = var8.unexpectedDiiException((java.lang.Throwable)var14);
    org.omg.CORBA.MARSHAL var16 = var4.couldNotFindClass((java.lang.Throwable)var15);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var24 = var22.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var28 = var26.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var32 = var30.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var33 = var26.unexpectedDiiException((java.lang.Throwable)var32);
    org.omg.CORBA.MARSHAL var34 = var22.couldNotFindClass((java.lang.Throwable)var33);
    org.omg.CORBA.INTERNAL var35 = var4.illegalSubcontractId((java.lang.Throwable)var20, (java.lang.Object)var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var39 = var37.badInsertobjParam((java.lang.Object)1L);
    char[] var41 = new char[] { 'a'};
    java.lang.String var42 = java.lang.String.copyValueOf(var41);
    org.omg.CORBA.COMM_FAILURE var43 = var37.createListenerFailed((java.lang.Object)var41);
    org.omg.CORBA.BAD_PARAM var44 = var37.badOrbForServant();
    org.omg.CORBA.BAD_PARAM var45 = var4.localObjectNotAllowed((java.lang.Throwable)var44);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var47 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var49 = var47.badInsertobjParam((java.lang.Object)1L);
    char[] var51 = new char[] { 'a'};
    java.lang.String var52 = java.lang.String.copyValueOf(var51);
    org.omg.CORBA.COMM_FAILURE var53 = var47.createListenerFailed((java.lang.Object)var51);
    org.omg.CORBA.BAD_PARAM var54 = var47.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var56.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var62 = var60.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var64 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var66 = var64.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var67 = var60.unexpectedDiiException((java.lang.Throwable)var66);
    org.omg.CORBA.MARSHAL var68 = var56.couldNotFindClass((java.lang.Throwable)var67);
    org.omg.CORBA.MARSHAL var69 = var47.stubCreateError((java.lang.Throwable)var68);
    org.omg.CORBA.BAD_OPERATION var70 = var4.orbIdNotAvailable((java.lang.Throwable)var68);
    org.omg.CORBA.OBJECT_NOT_EXIST var71 = var1.badServerId((java.lang.Throwable)var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertTrue("'" + var42 + "' != '" + "a"+ "'", var42.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "a"+ "'", var52.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    var0.setCurrencySymbol("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var26 = var19.unexpectedDiiException((java.lang.Throwable)var25);
    org.omg.CORBA.MARSHAL var27 = var15.couldNotFindClass((java.lang.Throwable)var26);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var29 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var31 = var29.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var35 = var33.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var37 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var39 = var37.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var43 = var41.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var44 = var37.unexpectedDiiException((java.lang.Throwable)var43);
    org.omg.CORBA.MARSHAL var45 = var33.couldNotFindClass((java.lang.Throwable)var44);
    org.omg.CORBA.INTERNAL var46 = var15.illegalSubcontractId((java.lang.Throwable)var31, (java.lang.Object)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var50 = var48.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var54 = var52.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var56.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var59 = var52.unexpectedDiiException((java.lang.Throwable)var58);
    org.omg.CORBA.MARSHAL var60 = var48.couldNotFindClass((java.lang.Throwable)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var64 = var62.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var68 = var66.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var70 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var72 = var70.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var76 = var74.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var77 = var70.unexpectedDiiException((java.lang.Throwable)var76);
    org.omg.CORBA.MARSHAL var78 = var66.couldNotFindClass((java.lang.Throwable)var77);
    org.omg.CORBA.INTERNAL var79 = var48.illegalSubcontractId((java.lang.Throwable)var64, (java.lang.Object)var66);
    org.omg.CORBA.MARSHAL var81 = var15.couldNotInstantiateHelper((java.lang.Throwable)var64, (java.lang.Object)(-1.0d));
    org.omg.CORBA.MARSHAL var82 = var1.expectedTypeNullAndNoRepId((java.lang.Throwable)var64);
    org.omg.CORBA.BAD_PARAM var83 = var1.bootstrapRuntimeException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var8 = var1.unexpectedDiiException((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var12 = var10.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var16 = var14.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var20 = var18.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var21 = var14.unexpectedDiiException((java.lang.Throwable)var20);
    org.omg.CORBA.MARSHAL var22 = var10.couldNotFindClass((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var26 = var24.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var30 = var28.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var32 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var34 = var32.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var38 = var36.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var39 = var32.unexpectedDiiException((java.lang.Throwable)var38);
    org.omg.CORBA.MARSHAL var40 = var28.couldNotFindClass((java.lang.Throwable)var39);
    org.omg.CORBA.INTERNAL var41 = var10.illegalSubcontractId((java.lang.Throwable)var26, (java.lang.Object)var28);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var45 = var43.badInsertobjParam((java.lang.Object)1L);
    char[] var47 = new char[] { 'a'};
    java.lang.String var48 = java.lang.String.copyValueOf(var47);
    org.omg.CORBA.COMM_FAILURE var49 = var43.createListenerFailed((java.lang.Object)var47);
    org.omg.CORBA.BAD_PARAM var50 = var43.badOrbForServant();
    org.omg.CORBA.BAD_PARAM var51 = var10.localObjectNotAllowed((java.lang.Throwable)var50);
    org.omg.CORBA.INITIALIZE var52 = var1.persistentServerportNotSet((java.lang.Throwable)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var14);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "a"+ "'", var48.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var29 = var27.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedDiiException((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var19.couldNotFindClass((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var1.illegalSubcontractId((java.lang.Throwable)var17, (java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var36 = var34.badInsertobjParam((java.lang.Object)1L);
    char[] var38 = new char[] { 'a'};
    java.lang.String var39 = java.lang.String.copyValueOf(var38);
    org.omg.CORBA.COMM_FAILURE var40 = var34.createListenerFailed((java.lang.Object)var38);
    org.omg.CORBA.BAD_PARAM var41 = var34.badOrbForServant();
    org.omg.CORBA.BAD_PARAM var42 = var1.localObjectNotAllowed((java.lang.Throwable)var41);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var44 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var46 = var44.badInsertobjParam((java.lang.Object)1L);
    char[] var48 = new char[] { 'a'};
    java.lang.String var49 = java.lang.String.copyValueOf(var48);
    org.omg.CORBA.COMM_FAILURE var50 = var44.createListenerFailed((java.lang.Object)var48);
    org.omg.CORBA.BAD_PARAM var51 = var44.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var55 = var53.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var59 = var57.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var63 = var61.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var64 = var57.unexpectedDiiException((java.lang.Throwable)var63);
    org.omg.CORBA.MARSHAL var65 = var53.couldNotFindClass((java.lang.Throwable)var64);
    org.omg.CORBA.MARSHAL var66 = var44.stubCreateError((java.lang.Throwable)var65);
    org.omg.CORBA.BAD_OPERATION var67 = var1.orbIdNotAvailable((java.lang.Throwable)var65);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var69 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var71 = var69.badInsertobjParam((java.lang.Object)1L);
    char[] var73 = new char[] { 'a'};
    java.lang.String var74 = java.lang.String.copyValueOf(var73);
    org.omg.CORBA.COMM_FAILURE var75 = var69.createListenerFailed((java.lang.Object)var73);
    org.omg.CORBA.BAD_PARAM var76 = var69.badOrbForServant();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var78 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var80 = var78.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var82 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var84 = var82.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var86 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var88 = var86.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var89 = var82.unexpectedDiiException((java.lang.Throwable)var88);
    org.omg.CORBA.MARSHAL var90 = var78.couldNotFindClass((java.lang.Throwable)var89);
    org.omg.CORBA.MARSHAL var91 = var69.stubCreateError((java.lang.Throwable)var90);
    org.omg.CORBA.OBJECT_NOT_EXIST var92 = var69.badServerId();
    org.omg.CORBA.INTERNAL var93 = var69.applicationExceptionInSpecialMethod();
    org.omg.CORBA.INTERNAL var94 = var1.badMessageTypeForCancel((java.lang.Throwable)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "a"+ "'", var39.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "a"+ "'", var49.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "a"+ "'", var74.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var3 = var1.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var7 = var5.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var11 = var9.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var12 = var5.unexpectedDiiException((java.lang.Throwable)var11);
    org.omg.CORBA.MARSHAL var13 = var1.couldNotFindClass((java.lang.Throwable)var12);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var17 = var15.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var21 = var19.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var25 = var23.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var29 = var27.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var30 = var23.unexpectedDiiException((java.lang.Throwable)var29);
    org.omg.CORBA.MARSHAL var31 = var19.couldNotFindClass((java.lang.Throwable)var30);
    org.omg.CORBA.INTERNAL var32 = var1.illegalSubcontractId((java.lang.Throwable)var17, (java.lang.Object)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var36 = var34.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var40 = var38.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var42 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var44 = var42.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var45 = var38.unexpectedDiiException((java.lang.Throwable)var44);
    org.omg.CORBA.MARSHAL var46 = var34.couldNotFindClass((java.lang.Throwable)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var50 = var48.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var52 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var54 = var52.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var56 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var58 = var56.badInsertobjParam((java.lang.Object)1L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.MARSHAL var62 = var60.badInsertobjParam((java.lang.Object)1L);
    org.omg.CORBA.INTERNAL var63 = var56.unexpectedDiiException((java.lang.Throwable)var62);
    org.omg.CORBA.MARSHAL var64 = var52.couldNotFindClass((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var34.illegalSubcontractId((java.lang.Throwable)var50, (java.lang.Object)var52);
    org.omg.CORBA.MARSHAL var67 = var1.couldNotInstantiateHelper((java.lang.Throwable)var50, (java.lang.Object)(-1.0d));
    org.omg.CORBA.INTERNAL var68 = var1.badServantReadObject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

}
