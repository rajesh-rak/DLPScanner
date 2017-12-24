
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var4 = var3.nullParam();
    org.omg.CORBA.INTERNAL var5 = var3.nonExistentOrbid();
    org.omg.CORBA.MARSHAL var6 = var1.badTypecodeForCustomValue((java.lang.Throwable)var5);
    
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

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    com.sun.corba.se.impl.logging.ORBUtilSystemException var3 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var8 = var3.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var9 = var3.javaStreamInitFailed();
    org.omg.CORBA.OBJECT_NOT_EXIST var10 = var1.badSkeleton((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.String var1 = new java.lang.String("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var4 = var1.threadGroupDestroyFailed((java.lang.Object)(-1));
    org.omg.CORBA.BAD_OPERATION var5 = var1.insertObjectIncompatible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var5 = var1.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.INTERNAL var6 = var1.badkindCannotOccur();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.lang.String var1 = java.lang.String.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "1"+ "'", var1.equals("1"));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    byte[] var2 = new byte[] { (byte)100, (byte)1};
    java.lang.String var4 = new java.lang.String(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\u0164\u0101"+ "'", var4.equals("\u0164\u0101"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var7 = var1.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var14 = var9.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var15 = var1.contextNotImplemented((java.lang.Throwable)var14);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var18 = var17.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.MARSHAL var20 = var17.badRepIdIndirection((java.lang.Object)(-1));
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var23 = var22.nullParam();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var30 = var25.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var31 = var25.javaStreamInitFailed();
    org.omg.CORBA.INTERNAL var32 = var22.illegalGiopMsgType((java.lang.Throwable)var31);
    org.omg.CORBA.BAD_PARAM var33 = var17.persistentServerInitError((java.lang.Throwable)var32);
    org.omg.CORBA.MARSHAL var34 = var1.badReservedLength((java.lang.Throwable)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.MARSHAL var4 = var1.badRepIdIndirection((java.lang.Object)(-1));
    org.omg.CORBA.TRANSIENT var5 = var1.requestCanceled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var7 = var1.javaStreamInitFailed();
    org.omg.CORBA.MARSHAL var8 = var1.wcharDataInGiop10();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.logging.Logger var2 = java.util.logging.Logger.getLogger("1", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var3 = var1.badCorbalocString();
    org.omg.CORBA.BAD_INV_ORDER var4 = var1.argumentsNotCalled();
    org.omg.CORBA.INTERNAL var5 = var1.giopVersionError();
    
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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var3 = var1.nonExistentOrbid();
    org.omg.CORBA.BAD_PARAM var5 = var1.couldNotLoadClass((java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var12 = var7.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var13 = var7.extractNotInitialized();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var17 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var22 = var17.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var23 = var17.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var25 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var30 = var25.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var31 = var17.contextNotImplemented((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var34 = var33.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var35 = var33.badCorbalocString();
    org.omg.CORBA.BAD_PARAM var36 = var1.couldNotSetArray((java.lang.Object)var7, (java.lang.Object)10.0d, (java.lang.Object)"", (java.lang.Object)var31, (java.lang.Object)var35);
    org.omg.CORBA.BAD_OPERATION var37 = var7.insertObjectFailed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var3 = var1.badCorbalocString();
    org.omg.CORBA.BAD_PARAM var4 = var1.objrefFromForeignOrb();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var6 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var11 = var6.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var12 = var6.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var14 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var19 = var14.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var20 = var6.contextNotImplemented((java.lang.Throwable)var19);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var22 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var23 = var22.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var24 = var22.badCorbalocString();
    org.omg.CORBA.INTERNAL var25 = var6.btcConverterFailure((java.lang.Throwable)var24);
    org.omg.CORBA.NO_IMPLEMENT var26 = var1.sendDeferredNotimplemented((java.lang.Throwable)var25);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var28 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var33 = var28.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var34 = var28.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var36 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var41 = var36.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var42 = var28.contextNotImplemented((java.lang.Throwable)var41);
    org.omg.CORBA.INTERNAL var43 = var1.orbTargetAddrPreferenceInExtractObjectkeyInvalid((java.lang.Throwable)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var3 = var1.nonExistentOrbid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var6 = var5.nullParam();
    org.omg.CORBA.INTERNAL var9 = var5.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.BAD_PARAM var10 = var1.errorInSettingDynamicStubFactoryFactory((java.lang.Object)var5);
    org.omg.CORBA.INTERNAL var11 = var1.threadPoolCloseError();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.MARSHAL var2 = var1.wcharDataInGiop10();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var3 = var1.nonExistentOrbid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var6 = var5.nullParam();
    org.omg.CORBA.INTERNAL var9 = var5.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.BAD_PARAM var10 = var1.errorInSettingDynamicStubFactoryFactory((java.lang.Object)var5);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var13 = var12.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var14 = var12.badCorbalocString();
    org.omg.CORBA.MARSHAL var15 = var5.readObjectException((java.lang.Throwable)var14);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var3 = var1.nonExistentOrbid();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var5 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var6 = var5.nullParam();
    org.omg.CORBA.INTERNAL var9 = var5.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.BAD_PARAM var10 = var1.errorInSettingDynamicStubFactoryFactory((java.lang.Object)var5);
    org.omg.CORBA.MARSHAL var11 = var5.couldNotFindClass();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var7 = var1.requestRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var9 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var10 = var9.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var12 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var17 = var12.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var18 = var12.requestRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var20 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var21 = var20.nullParam();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var29 = var23.javaStreamInitFailed();
    org.omg.CORBA.INTERNAL var30 = var20.illegalGiopMsgType((java.lang.Throwable)var29);
    org.omg.CORBA.INTERNAL var31 = var12.numInvocationsAlreadyZero((java.lang.Throwable)var30);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var33 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var34 = var33.nullParam();
    org.omg.CORBA.INTERNAL var37 = var33.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.DATA_CONVERSION var38 = var12.badStringifiedIorLen((java.lang.Throwable)var37);
    org.omg.CORBA.BAD_OPERATION var39 = var9.orbConfiguratorError((java.lang.Throwable)var37);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var41 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var46 = var41.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var47 = var41.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var49 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var54 = var49.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var55 = var41.contextNotImplemented((java.lang.Throwable)var54);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var57 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var58 = var57.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var59 = var57.badCorbalocString();
    org.omg.CORBA.INTERNAL var60 = var41.btcConverterFailure((java.lang.Throwable)var59);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var63 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var64 = var63.socketFactoryAndContactInfoListAtSameTime();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var66 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var71 = var66.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var72 = var66.requestRequiresStub();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var74 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var75 = var74.nullParam();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var77 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var82 = var77.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var83 = var77.javaStreamInitFailed();
    org.omg.CORBA.INTERNAL var84 = var74.illegalGiopMsgType((java.lang.Throwable)var83);
    org.omg.CORBA.INTERNAL var85 = var66.numInvocationsAlreadyZero((java.lang.Throwable)var84);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var87 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var88 = var87.nullParam();
    org.omg.CORBA.INTERNAL var91 = var87.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    org.omg.CORBA.DATA_CONVERSION var92 = var66.badStringifiedIorLen((java.lang.Throwable)var91);
    org.omg.CORBA.BAD_OPERATION var93 = var63.orbConfiguratorError((java.lang.Throwable)var91);
    org.omg.CORBA.INTERNAL var94 = var9.workerThreadCaughtUnexpectedThrowable((java.lang.Throwable)var60, (java.lang.Object)"", (java.lang.Object)var91);
    org.omg.CORBA.INTERNAL var95 = var1.statementNotReachable6((java.lang.Throwable)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var2 = var1.nullParam();
    org.omg.CORBA.INTERNAL var5 = var1.threadGroupHasSubGroupsInClose((java.lang.Object)(short)0, (java.lang.Object)10);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var7 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var8 = var7.nullParam();
    org.omg.CORBA.INTERNAL var9 = var7.nonExistentOrbid();
    org.omg.CORBA.BAD_PARAM var11 = var7.couldNotLoadClass((java.lang.Object)100L);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var13 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var18 = var13.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var19 = var13.extractNotInitialized();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var23 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var28 = var23.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.INTERNAL var29 = var23.javaStreamInitFailed();
    com.sun.corba.se.impl.logging.ORBUtilSystemException var31 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var36 = var31.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.NO_IMPLEMENT var37 = var23.contextNotImplemented((java.lang.Throwable)var36);
    com.sun.corba.se.impl.logging.ORBUtilSystemException var39 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.BAD_PARAM var40 = var39.socketFactoryAndContactInfoListAtSameTime();
    org.omg.CORBA.INV_OBJREF var41 = var39.badCorbalocString();
    org.omg.CORBA.BAD_PARAM var42 = var7.couldNotSetArray((java.lang.Object)var13, (java.lang.Object)10.0d, (java.lang.Object)"", (java.lang.Object)var37, (java.lang.Object)var41);
    org.omg.CORBA.COMM_FAILURE var43 = var1.selectionKeyInvalid((java.lang.Object)var42);
    org.omg.CORBA.MARSHAL var44 = var1.iiopinputstreamGrow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    com.sun.corba.se.impl.logging.ORBUtilSystemException var1 = com.sun.corba.se.impl.logging.ORBUtilSystemException.get("hi!");
    org.omg.CORBA.COMM_FAILURE var6 = var1.transportReadTimeoutExceeded((java.lang.Object)0L, (java.lang.Object)'#', (java.lang.Object)(-1), (java.lang.Object)(byte)0);
    org.omg.CORBA.BAD_OPERATION var7 = var1.extractNotInitialized();
    org.omg.CORBA.MARSHAL var8 = var1.recursiveTypecodeError();
    org.omg.CORBA.INTERNAL var9 = var1.nonExistentOrbid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
