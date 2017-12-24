
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    sun.util.TimeZoneNameUtility var0 = new sun.util.TimeZoneNameUtility();

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var1 = java.lang.String.valueOf((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "-1.0"+ "'", var1.equals("-1.0"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.util.Date var0 = new java.util.Date();
    var0.setDate((-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    sun.security.util.Debug var0 = new sun.security.util.Debug();

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.security.util.Debug var1 = sun.security.util.Debug.getInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getHours();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.lang.String var1 = java.lang.String.valueOf(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "10.0"+ "'", var1.equals("10.0"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getDay();

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable2(var2);
    java.lang.Throwable var4 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var4);
    org.omg.CORBA.INTERNAL var6 = var1.duplicateSendingContextServiceContext(var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var9 = var8.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var10 = var1.exceptionInAccept((java.lang.Object)var9);
    org.omg.CORBA.MARSHAL var12 = var1.couldNotInstantiateHelper((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable2(var2);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var6 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var7 = var5.statementNotReachable2(var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var9.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var15 = var14.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var16 = var12.cannotMarshalNative((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var9.getLocalHostFailed((java.lang.Throwable)var15);
    org.omg.CORBA.BAD_OPERATION var18 = var9.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var21 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var22 = var20.statementNotReachable2(var21);
    java.lang.Throwable var23 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var23);
    org.omg.CORBA.INTERNAL var25 = var20.duplicateSendingContextServiceContext(var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var27.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var29 = var20.exceptionInAccept((java.lang.Object)var28);
    org.omg.CORBA.MARSHAL var30 = var5.badInsertobjParam((java.lang.Throwable)var18, (java.lang.Object)var29);
    org.omg.CORBA.BAD_OPERATION var31 = var1.extractObjectIncompatible((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var35.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var41 = var40.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var42 = var38.cannotMarshalNative((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var43 = var35.getLocalHostFailed((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var44 = var33.locationforwardError((java.lang.Throwable)var43);
    org.omg.CORBA.BAD_PARAM var45 = var1.boundsErrorInDiiRequest((java.lang.Throwable)var43);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var45);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.text.DecimalFormatSymbols var0 = java.text.DecimalFormatSymbols.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable2(var2);
    java.lang.Throwable var4 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var4);
    org.omg.CORBA.INTERNAL var6 = var1.duplicateSendingContextServiceContext(var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var10 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var11 = var10.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var16 = var15.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var17 = var13.cannotMarshalNative((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var18 = var10.getLocalHostFailed((java.lang.Throwable)var16);
    org.omg.CORBA.INTERNAL var19 = var8.locationforwardError((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var22 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var23 = var21.statementNotReachable2(var22);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var26 = var25.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var31 = var30.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var32 = var28.cannotMarshalNative((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var33 = var25.getLocalHostFailed((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_OPERATION var34 = var25.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var37 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var38 = var36.statementNotReachable2(var37);
    java.lang.Throwable var39 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var39);
    org.omg.CORBA.INTERNAL var41 = var36.duplicateSendingContextServiceContext(var39);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var44 = var43.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var45 = var36.exceptionInAccept((java.lang.Object)var44);
    org.omg.CORBA.MARSHAL var46 = var21.badInsertobjParam((java.lang.Throwable)var34, (java.lang.Object)var45);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var48 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var49 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var50 = var48.statementNotReachable2(var49);
    org.omg.CORBA.INTERNAL var51 = var21.invalidCodeSetNumber(var49);
    org.omg.CORBA.MARSHAL var53 = var8.badValueTag(var49, (java.lang.Object)"10.0");
    org.omg.CORBA.INTERNAL var54 = var1.serverScNoIiopProfile((java.lang.Throwable)var53);
    org.omg.CORBA.INTERNAL var55 = var1.invalidJdk131PatchLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var28);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable2(var2);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var6 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var7 = var5.statementNotReachable2(var6);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var10 = var9.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var15 = var14.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var16 = var12.cannotMarshalNative((java.lang.Throwable)var15);
    org.omg.CORBA.INTERNAL var17 = var9.getLocalHostFailed((java.lang.Throwable)var15);
    org.omg.CORBA.BAD_OPERATION var18 = var9.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var21 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var22 = var20.statementNotReachable2(var21);
    java.lang.Throwable var23 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var23);
    org.omg.CORBA.INTERNAL var25 = var20.duplicateSendingContextServiceContext(var23);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var28 = var27.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var29 = var20.exceptionInAccept((java.lang.Object)var28);
    org.omg.CORBA.MARSHAL var30 = var5.badInsertobjParam((java.lang.Throwable)var18, (java.lang.Object)var29);
    org.omg.CORBA.BAD_OPERATION var31 = var1.extractObjectIncompatible((java.lang.Throwable)var18);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var35 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var36 = var35.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var38 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var41 = var40.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var42 = var38.cannotMarshalNative((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var43 = var35.getLocalHostFailed((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var44 = var33.locationforwardError((java.lang.Throwable)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var47 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var48 = var46.statementNotReachable2(var47);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var50 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var51 = var50.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var53 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var56 = var55.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var57 = var53.cannotMarshalNative((java.lang.Throwable)var56);
    org.omg.CORBA.INTERNAL var58 = var50.getLocalHostFailed((java.lang.Throwable)var56);
    org.omg.CORBA.BAD_OPERATION var59 = var50.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var61 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var62 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var63 = var61.statementNotReachable2(var62);
    java.lang.Throwable var64 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var64);
    org.omg.CORBA.INTERNAL var66 = var61.duplicateSendingContextServiceContext(var64);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var68 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var69 = var68.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var70 = var61.exceptionInAccept((java.lang.Object)var69);
    org.omg.CORBA.MARSHAL var71 = var46.badInsertobjParam((java.lang.Throwable)var59, (java.lang.Object)var70);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var73 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var74 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var75 = var73.statementNotReachable2(var74);
    org.omg.CORBA.INTERNAL var76 = var46.invalidCodeSetNumber(var74);
    org.omg.CORBA.MARSHAL var78 = var33.badValueTag(var74, (java.lang.Object)"10.0");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var80 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var81 = var80.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var82 = var80.getPropertiesError();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var85 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var86 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var87 = var85.statementNotReachable2(var86);
    org.omg.CORBA.BAD_PARAM var88 = var1.invalidRequestPartitioningId((java.lang.Throwable)var78, (java.lang.Object)var82, (java.lang.Object)(short)(-1), (java.lang.Object)var87);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
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
    assertNotNull(var50);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.Date var0 = new java.util.Date();
    int var1 = var0.getSeconds();

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.DATA_CONVERSION var3 = var1.badStringifiedIor(var2);
    org.omg.CORBA.MARSHAL var4 = var1.badKind();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var9 = var8.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var14 = var13.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var15 = var11.cannotMarshalNative((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var16 = var8.getLocalHostFailed((java.lang.Throwable)var14);
    org.omg.CORBA.INTERNAL var17 = var6.locationforwardError((java.lang.Throwable)var16);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var20 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var21 = var19.statementNotReachable2(var20);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var24 = var23.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var26 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var29 = var28.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var30 = var26.cannotMarshalNative((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var23.getLocalHostFailed((java.lang.Throwable)var29);
    org.omg.CORBA.BAD_OPERATION var32 = var23.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var35 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var36 = var34.statementNotReachable2(var35);
    java.lang.Throwable var37 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var37);
    org.omg.CORBA.INTERNAL var39 = var34.duplicateSendingContextServiceContext(var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var42 = var41.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var43 = var34.exceptionInAccept((java.lang.Object)var42);
    org.omg.CORBA.MARSHAL var44 = var19.badInsertobjParam((java.lang.Throwable)var32, (java.lang.Object)var43);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var47 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var48 = var46.statementNotReachable2(var47);
    org.omg.CORBA.INTERNAL var49 = var19.invalidCodeSetNumber(var47);
    org.omg.CORBA.MARSHAL var51 = var6.badValueTag(var47, (java.lang.Object)"10.0");
    org.omg.CORBA.MARSHAL var52 = var6.stubCreateError();
    org.omg.CORBA.COMM_FAILURE var53 = var1.bufferReadManagerTimeout((java.lang.Throwable)var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var55 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var58 = var57.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var60 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var62 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var63 = var62.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var64 = var60.cannotMarshalNative((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var65 = var57.getLocalHostFailed((java.lang.Throwable)var63);
    org.omg.CORBA.INTERNAL var66 = var55.locationforwardError((java.lang.Throwable)var65);
    org.omg.CORBA.INTERNAL var67 = var1.writeUndeclaredException((java.lang.Object)var55);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var4 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var5 = var3.statementNotReachable2(var4);
    org.omg.CORBA.MARSHAL var7 = var1.badCodebaseIndirection(var4, (java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var4 = var3.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var5 = var1.cannotMarshalNative((java.lang.Throwable)var4);
    org.omg.CORBA.BAD_OPERATION var6 = var1.serverIdNotAvailable();
    
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var7 = var6.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var8 = var4.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var9 = var1.getLocalHostFailed((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var12 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var13 = var11.statementNotReachable2(var12);
    java.lang.Throwable var14 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var14);
    org.omg.CORBA.INTERNAL var16 = var11.duplicateSendingContextServiceContext(var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var19 = var18.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var20 = var11.exceptionInAccept((java.lang.Object)var19);
    org.omg.CORBA.MARSHAL var21 = var1.unexpectedEof((java.lang.Throwable)var19);
    org.omg.CORBA.MARSHAL var22 = var1.illegalUnionDiscriminatorType();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var3 = var1.statementNotReachable2(var2);
    java.lang.Throwable var4 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var4);
    org.omg.CORBA.INTERNAL var6 = var1.duplicateSendingContextServiceContext(var4);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var9 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var10 = var8.statementNotReachable2(var9);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var13 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var14 = var12.statementNotReachable2(var13);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var17 = var16.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var19 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var21 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var22 = var21.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var23 = var19.cannotMarshalNative((java.lang.Throwable)var22);
    org.omg.CORBA.INTERNAL var24 = var16.getLocalHostFailed((java.lang.Throwable)var22);
    org.omg.CORBA.BAD_OPERATION var25 = var16.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var27 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var28 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var29 = var27.statementNotReachable2(var28);
    java.lang.Throwable var30 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var30);
    org.omg.CORBA.INTERNAL var32 = var27.duplicateSendingContextServiceContext(var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var34 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var35 = var34.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var36 = var27.exceptionInAccept((java.lang.Object)var35);
    org.omg.CORBA.MARSHAL var37 = var12.badInsertobjParam((java.lang.Throwable)var25, (java.lang.Object)var36);
    org.omg.CORBA.BAD_OPERATION var38 = var8.extractObjectIncompatible((java.lang.Throwable)var25);
    org.omg.CORBA.BAD_OPERATION var39 = var1.getTypeIdsRequiresStub((java.lang.Throwable)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var7 = var6.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var8 = var4.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var9 = var1.getLocalHostFailed((java.lang.Throwable)var7);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var11 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var14 = var13.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var19 = var18.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var20 = var16.cannotMarshalNative((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var13.getLocalHostFailed((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var22 = var11.locationforwardError((java.lang.Throwable)var21);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var24 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var25 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var26 = var24.statementNotReachable2(var25);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var29 = var28.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var34 = var33.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var35 = var31.cannotMarshalNative((java.lang.Throwable)var34);
    org.omg.CORBA.INTERNAL var36 = var28.getLocalHostFailed((java.lang.Throwable)var34);
    org.omg.CORBA.BAD_OPERATION var37 = var28.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var40 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var41 = var39.statementNotReachable2(var40);
    java.lang.Throwable var42 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var42);
    org.omg.CORBA.INTERNAL var44 = var39.duplicateSendingContextServiceContext(var42);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var46 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var47 = var46.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var48 = var39.exceptionInAccept((java.lang.Object)var47);
    org.omg.CORBA.MARSHAL var49 = var24.badInsertobjParam((java.lang.Throwable)var37, (java.lang.Object)var48);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var52 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var53 = var51.statementNotReachable2(var52);
    org.omg.CORBA.INTERNAL var54 = var24.invalidCodeSetNumber(var52);
    org.omg.CORBA.MARSHAL var56 = var11.badValueTag(var52, (java.lang.Object)"10.0");
    org.omg.CORBA.MARSHAL var57 = var1.illegalUnionDiscriminatorType(var52);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var59 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var60 = new java.lang.Throwable();
    org.omg.CORBA.DATA_CONVERSION var61 = var59.badStringifiedIor(var60);
    org.omg.CORBA.BAD_OPERATION var63 = var1.classNotFound3((java.lang.Throwable)var61, (java.lang.Object)(-1.0d));
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
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
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var2 = new java.lang.Throwable();
    org.omg.CORBA.DATA_CONVERSION var3 = var1.badStringifiedIor(var2);
    org.omg.CORBA.COMM_FAILURE var4 = var1.ioexceptionWhenReadingConnection();
    java.lang.Throwable var5 = new java.lang.Throwable();
    org.omg.CORBA.BAD_OPERATION var6 = var1.setExceptionCalledBadType(var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var8 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var9 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var10 = var8.statementNotReachable2(var9);
    java.lang.Throwable var11 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var11);
    org.omg.CORBA.INTERNAL var13 = var8.duplicateSendingContextServiceContext(var11);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var15 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var16 = var15.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var17 = var8.exceptionInAccept((java.lang.Object)var16);
    org.omg.CORBA.DATA_CONVERSION var18 = var1.badHexDigit((java.lang.Throwable)var16);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var2 = var1.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var4 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var7 = var6.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var8 = var4.cannotMarshalNative((java.lang.Throwable)var7);
    org.omg.CORBA.INTERNAL var9 = var1.getLocalHostFailed((java.lang.Throwable)var7);
    org.omg.CORBA.BAD_OPERATION var10 = var1.setDelegateRequiresStub();
    org.omg.CORBA.INTERNAL var11 = var1.badReplystatus();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var14 = var13.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var16 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var18 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var19 = var18.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var20 = var16.cannotMarshalNative((java.lang.Throwable)var19);
    org.omg.CORBA.INTERNAL var21 = var13.getLocalHostFailed((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var26 = var25.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var30 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var31 = var30.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var32 = var28.cannotMarshalNative((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var33 = var25.getLocalHostFailed((java.lang.Throwable)var31);
    org.omg.CORBA.INTERNAL var34 = var23.locationforwardError((java.lang.Throwable)var33);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var37 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var38 = var36.statementNotReachable2(var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var40 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var41 = var40.bufferReadManagerTimeout();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var43 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var45 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var46 = var45.bufferReadManagerTimeout();
    org.omg.CORBA.MARSHAL var47 = var43.cannotMarshalNative((java.lang.Throwable)var46);
    org.omg.CORBA.INTERNAL var48 = var40.getLocalHostFailed((java.lang.Throwable)var46);
    org.omg.CORBA.BAD_OPERATION var49 = var40.setDelegateRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var51 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var52 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var53 = var51.statementNotReachable2(var52);
    java.lang.Throwable var54 = new java.lang.Throwable();
    sun.rmi.server.UnicastServerRef.clearStackTraces(var54);
    org.omg.CORBA.INTERNAL var56 = var51.duplicateSendingContextServiceContext(var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var58 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    org.omg.CORBA.COMM_FAILURE var59 = var58.bufferReadManagerTimeout();
    org.omg.CORBA.COMM_FAILURE var60 = var51.exceptionInAccept((java.lang.Object)var59);
    org.omg.CORBA.MARSHAL var61 = var36.badInsertobjParam((java.lang.Throwable)var49, (java.lang.Object)var60);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("");
    java.lang.Throwable var64 = new java.lang.Throwable();
    org.omg.CORBA.INTERNAL var65 = var63.statementNotReachable2(var64);
    org.omg.CORBA.INTERNAL var66 = var36.invalidCodeSetNumber(var64);
    org.omg.CORBA.MARSHAL var68 = var23.badValueTag(var64, (java.lang.Object)"10.0");
    org.omg.CORBA.MARSHAL var69 = var13.illegalUnionDiscriminatorType(var64);
    org.omg.CORBA.COMM_FAILURE var70 = var1.defaultCreateServerSocketGivenNonIiopClearText((java.lang.Object)var13);
    org.omg.CORBA.DATA_CONVERSION var72 = var1.illegalSocketFactoryType((java.lang.Object)10);
    
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
    assertNotNull(var18);
    
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
    assertNotNull(var28);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

}
